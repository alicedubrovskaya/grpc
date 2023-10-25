package com.dubrouskaya.grpc;

import com.dubrouskaya.grpc.server.PingPongServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new PingPongServiceImplBase())
                .build();

        System.out.println("Start server");
        server.start();
        server.awaitTermination();
    }

}
