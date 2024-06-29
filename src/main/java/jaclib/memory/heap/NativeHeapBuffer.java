package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Z")
    private boolean field3327 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field3326;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 4)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method1537();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 12)
    private final synchronized void method1537() {
        if (this.method1538()) {
            this.field3326.deallocateBuffer(this.field3325);
        }
        this.field3327 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 22)
    public final synchronized void method1517(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null | !this.method1538() | arg1 < 0 | (arg1 + arg3) > arg0.length | arg2 < 0 | this.field3328 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.field3326.put(this.field3325, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 35)
    public final int getSize() {
        return this.field3328;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 42)
    public final long getAddress() {
        return this.field3326.getBufferAddress(this.field3325);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 49)
    private final synchronized boolean method1538() {
        return this.field3326.method1535() && this.field3327;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 63)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field3326 = arg0;
        this.field3325 = arg1;
        this.field3328 = arg2;
    }
}
