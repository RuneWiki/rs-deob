package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Z")
    private boolean field9171 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    public int field9170;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field9169;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 6)
    public final long getAddress() {
        return this.field9169.getBufferAddress(this.field9172);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 15)
    private final synchronized boolean method3774() {
        return this.field9169.method3776() && this.field9171;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 22)
    private final synchronized void method3775() {
        if (this.method3774()) {
            this.field9169.deallocateBuffer(this.field9172);
        }
        this.field9171 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 33)
    public final synchronized void method2856(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | arg0 == null | !this.method3774() | arg1 + arg3 > arg0.length | arg2 < 0 | this.field9170 < arg2 + arg3) {
            throw new RuntimeException();
        }
        this.field9169.put(this.field9172, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 63)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field9170 = arg2;
        this.field9169 = arg0;
        this.field9172 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 48)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3775();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 57)
    public final int getSize() {
        return this.field9170;
    }
}
