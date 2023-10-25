import grpc
import PingPongService_pb2
import PingPongService_pb2_grpc

# To generate files:
# python3 -m grpc_tools.protoc -I=. --python_out=. --pyi_out=. --grpc_python_out=. PingPongService.proto
def run():
    print("Python client starting ...")
    with grpc.insecure_channel("localhost:8080") as channel:
        stub = PingPongService_pb2_grpc.PingPongServiceStub(channel)
        request = PingPongService_pb2.PingRequest(pingWord="Ping...")
        response = stub.say(request)
    print(response.pongWord)


run()