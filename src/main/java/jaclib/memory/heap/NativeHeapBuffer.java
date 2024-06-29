package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field8801 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    public int field8800;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8798;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field8799;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 4)
    private final synchronized void method3613() {
        if (this.method3614()) {
            this.field8798.deallocateBuffer(this.field8799);
        }
        this.field8801 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 16)
    public final int getSize() {
        return this.field8800;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 24)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3613();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 34)
    private final synchronized boolean method3614() {
        return this.field8798.method3616() && this.field8801;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 44)
    public final synchronized void method2834(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | !this.method3614() | arg0 == null | arg1 < 0 | arg0.length < (arg1 + arg3) | (arg2 + arg3) > this.field8800) {
            throw new RuntimeException();
        }
        this.field8798.put(this.field8799, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 55)
    public final long getAddress() {
        return this.field8798.getBufferAddress(this.field8799);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 64)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8800 = arg2;
        this.field8798 = arg0;
        this.field8799 = arg1;
    }
}
