package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field9423 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field9422;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    public int field9420;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field9421;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 5)
    public final int getSize() {
        return this.field9420;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 12)
    private final synchronized void method3779() {
        if (this.method3780()) {
            this.field9422.deallocateBuffer(this.field9421);
        }
        this.field9423 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 28)
    private final synchronized boolean method3780() {
        return this.field9422.method3782() && this.field9423;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 36)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3779();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 53)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field9422 = arg0;
        this.field9420 = arg2;
        this.field9421 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 47)
    public final long getAddress() {
        return this.field9422.getBufferAddress(this.field9421);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 63)
    public final synchronized void method2885(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg1 < 0 | arg0 == null | !this.method3780() | arg1 + arg3 > arg0.length | this.field9420 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.field9422.put(this.field9421, arg0, arg1, arg2, arg3);
    }
}
