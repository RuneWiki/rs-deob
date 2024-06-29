package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field8671 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field8669;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    public int field8670;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8668;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 5)
    public final long getAddress() {
        return this.field8668.getBufferAddress(this.field8669);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 12)
    private final synchronized void method3470() {
        if (this.method3471()) {
            this.field8668.deallocateBuffer(this.field8669);
        }
        this.field8671 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 22)
    public final synchronized void method2548(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg1 < 0 | !this.method3471() | arg0 == null | arg0.length < (arg1 + arg3) | this.field8670 < arg2 + arg3) {
            throw new RuntimeException();
        }
        this.field8668.put(this.field8669, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 34)
    private final synchronized boolean method3471() {
        return this.field8668.method3473() && this.field8671;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 42)
    public final int getSize() {
        return this.field8670;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 50)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3470();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 62)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8669 = arg1;
        this.field8670 = arg2;
        this.field8668 = arg0;
    }
}
