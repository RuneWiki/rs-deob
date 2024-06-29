package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field7962 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field7959;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    private int field7961;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    public int field7960;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z")
    private final synchronized boolean method3195() {
        return this.field7959.method3193() && this.field7962;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return this.field7959.getBufferAddress(this.field7961);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I")
    public final int getSize() {
        return this.field7960;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V")
    public final synchronized void method2375(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null | !this.method3195() | arg1 < 0 | (arg1 + arg3) > arg0.length | arg2 < 0 | this.field7960 < arg2 + arg3) {
            throw new RuntimeException();
        }
        this.field7959.put(this.field7961, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V")
    private final synchronized void method3196() {
        if (this.method3195()) {
            this.field7959.deallocateBuffer(this.field7961);
        }
        this.field7962 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V")
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field7959 = arg0;
        this.field7961 = arg1;
        this.field7960 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3196();
    }
}
