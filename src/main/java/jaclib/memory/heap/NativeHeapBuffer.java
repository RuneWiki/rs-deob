package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
    private boolean field9383 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field9382;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    public int field9384;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    private int field9385;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I")
    public final int getSize() {
        return this.field9384;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V")
    private final synchronized void method3756() {
        if (this.method3757()) {
            this.field9382.deallocateBuffer(this.field9385);
        }
        this.field9383 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V")
    public final synchronized void method2905(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | !this.method3757() | arg0 == null | arg1 < 0 | (arg1 + arg3) > arg0.length | this.field9384 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.field9382.put(this.field9385, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z")
    private final synchronized boolean method3757() {
        return this.field9382.method3760() && this.field9383;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return this.field9382.getBufferAddress(this.field9385);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3756();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V")
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field9382 = arg0;
        this.field9384 = arg2;
        this.field9385 = arg1;
    }
}
