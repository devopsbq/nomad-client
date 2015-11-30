package es.bq.devops.nomad.client;

import es.bq.devops.nomad.client.utils.NomadException;
import es.bq.devops.nomad.client.utils.Utils;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Response;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class NomadClient {

    static class NomadInterceptor implements RequestInterceptor {
        @Override
        public void apply(RequestTemplate template) {}
    }

    static class NomadErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {
            return new NomadException(response.status(), response.reason());
        }
    }

    public static Nomad getInstance(String endpoint) {
        GsonEncoder encoder = new GsonEncoder(Utils.GSON);
        GsonDecoder decoder = new GsonDecoder(Utils.GSON);
        return Feign.builder().encoder(encoder).decoder(decoder).errorDecoder(new NomadErrorDecoder())
                .requestInterceptor(new NomadInterceptor())
                // .logLevel(Level.FULL)
                // .logger(new Logger.JavaLogger().appendToFile("/tmp/logs/http.log"))
                .target(Nomad.class, endpoint);
    }
}