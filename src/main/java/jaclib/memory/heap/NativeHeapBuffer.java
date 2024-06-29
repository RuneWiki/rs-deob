package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
    private boolean field8533 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    private int field8534;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8532;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field8535;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V")
    private final synchronized void method3410() {
        if (this.method3411()) {
            this.field8532.deallocateBuffer(this.field8534);
        }
        this.field8533 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V")
    public final synchronized void method2562(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | !this.method3411() | arg0 == null | arg1 < 0 | arg0.length < (arg1 + arg3) | this.field8535 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.field8532.put(this.field8534, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I")
    public final int getSize() {
        return this.field8535;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z")
    private final synchronized boolean method3411() {
        return this.field8532.method3412() && this.field8533;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3410();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V")
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8534 = arg1;
        this.field8532 = arg0;
        this.field8535 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return this.field8532.getBufferAddress(this.field8534);
    }
}
