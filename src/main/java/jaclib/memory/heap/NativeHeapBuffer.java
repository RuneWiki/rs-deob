package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Z")
    private boolean field8955 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8958;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field8956;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    public int field8957;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 5)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3568();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 13)
    private final synchronized boolean method3567() {
        return this.field8958.method3570() && this.field8955;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 64)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8958 = arg0;
        this.field8956 = arg1;
        this.field8957 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 24)
    private final synchronized void method3568() {
        if (this.method3567()) {
            this.field8958.deallocateBuffer(this.field8956);
        }
        this.field8955 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 37)
    public final int getSize() {
        return this.field8957;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 45)
    public final synchronized void method2668(byte[] arg0, int arg1, int arg2, int arg3) {
        if (!this.method3567() | arg0 == null | arg1 < 0 | (arg1 + arg3) > arg0.length | arg2 < 0 | this.field8957 < arg2 + arg3) {
            throw new RuntimeException();
        }
        this.field8958.put(this.field8956, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 56)
    public final long getAddress() {
        return this.field8958.getBufferAddress(this.field8956);
    }
}
