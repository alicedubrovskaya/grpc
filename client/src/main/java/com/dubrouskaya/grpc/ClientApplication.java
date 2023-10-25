package com.dubrouskaya.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext()
                .build();

        PingPongServiceGrpc.PingPongServiceBlockingStub stub = PingPongServiceGrpc.newBlockingStub(channel);

        PingPongServiceOuterClass.PingRequest request = PingPongServiceOuterClass.PingRequest.newBuilder()
                .setPingWord("Ping...")
                .build();

        final PingPongServiceOuterClass.PongResponse response = stub.say(request);
        System.out.println(response);
        channel.shutdown();
    }
}
