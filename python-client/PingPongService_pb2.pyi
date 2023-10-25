from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class PingRequest(_message.Message):
    __slots__ = ["pingWord"]
    PINGWORD_FIELD_NUMBER: _ClassVar[int]
    pingWord: str
    def __init__(self, pingWord: _Optional[str] = ...) -> None: ...

class PongResponse(_message.Message):
    __slots__ = ["pongWord"]
    PONGWORD_FIELD_NUMBER: _ClassVar[int]
    pongWord: str
    def __init__(self, pongWord: _Optional[str] = ...) -> None: ...
