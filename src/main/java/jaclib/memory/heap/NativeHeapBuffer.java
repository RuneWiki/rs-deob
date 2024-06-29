package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field9099 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field9098;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    public int field9096;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field9097;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 4)
    public final synchronized void method2899(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | !this.method3647() | arg0 == null | arg1 + arg3 > arg0.length | arg2 < 0 | this.field9096 < arg2 + arg3) {
            throw new RuntimeException();
        }
        this.field9098.put(this.field9097, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 15)
    private final synchronized boolean method3647() {
        return this.field9098.method3650() && this.field9099;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 26)
    public final int getSize() {
        return this.field9096;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 33)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3648();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 41)
    public final long getAddress() {
        return this.field9098.getBufferAddress(this.field9097);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 49)
    private final synchronized void method3648() {
        if (this.method3647()) {
            this.field9098.deallocateBuffer(this.field9097);
        }
        this.field9099 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 63)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field9098 = arg0;
        this.field9096 = arg2;
        this.field9097 = arg1;
    }
}
