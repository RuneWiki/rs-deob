package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Z")
    private boolean field9843 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field9844;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    private int field9845;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field9846;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 4)
    private final synchronized boolean method3911() {
        return this.field9844.method3914() && this.field9843;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 13)
    private final synchronized void method3912() {
        if (this.method3911()) {
            this.field9844.deallocateBuffer(this.field9845);
        }
        this.field9843 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 24)
    public final long getAddress() {
        return this.field9844.getBufferAddress(this.field9845);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 32)
    public final synchronized void method2980(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null | !this.method3911() | arg1 < 0 | (arg1 + arg3) > arg0.length | arg2 < 0 | arg2 + arg3 > this.field9846) {
            throw new RuntimeException();
        }
        this.field9844.put(this.field9845, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 44)
    public final int getSize() {
        return this.field9846;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 64)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field9844 = arg0;
        this.field9845 = arg1;
        this.field9846 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 57)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3912();
    }
}
