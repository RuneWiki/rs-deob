package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Z")
    private boolean field8748 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    private int field8750;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8749;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field8751;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return this.field8749.getBufferAddress(this.field8750);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3467();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z")
    private final synchronized boolean method3466() {
        return this.field8749.method3469() && this.field8748;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V")
    private final synchronized void method3467() {
        if (this.method3466()) {
            this.field8749.deallocateBuffer(this.field8750);
        }
        this.field8748 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V")
    public final synchronized void method2661(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | arg0 == null | !this.method3466() | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field8751) {
            throw new RuntimeException();
        }
        this.field8749.put(this.field8750, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I")
    public final int getSize() {
        return this.field8751;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V")
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8750 = arg1;
        this.field8749 = arg0;
        this.field8751 = arg2;
    }
}
