package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
    private boolean field8399 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8400;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field8401;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    private int field8398;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 4)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3333();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 15)
    public final int getSize() {
        return this.field8401;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 22)
    private final synchronized boolean method3332() {
        return this.field8400.method3335() && this.field8399;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 30)
    public final long getAddress() {
        return this.field8400.getBufferAddress(this.field8398);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 37)
    private final synchronized void method3333() {
        if (this.method3332()) {
            this.field8400.deallocateBuffer(this.field8398);
        }
        this.field8399 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 49)
    public final synchronized void method2339(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg0 == null | !this.method3332() | arg1 < 0 | arg0.length < arg1 + arg3 | arg2 + arg3 > this.field8401) {
            throw new RuntimeException();
        }
        this.field8400.put(this.field8398, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 62)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8400 = arg0;
        this.field8401 = arg2;
        this.field8398 = arg1;
    }
}
