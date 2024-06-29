package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
    private boolean field8661 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8662;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    private int field8660;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field8663;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 4)
    public final int getSize() {
        return this.field8663;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 11)
    public final long getAddress() {
        return this.field8662.getBufferAddress(this.field8660);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 18)
    private final synchronized boolean method3427() {
        return this.field8662.method3430() && this.field8661;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 62)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8662 = arg0;
        this.field8660 = arg1;
        this.field8663 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 30)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3428();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 39)
    public final synchronized void method2446(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | !this.method3427() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 + arg3 > this.field8663) {
            throw new RuntimeException();
        }
        this.field8662.put(this.field8660, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 50)
    private final synchronized void method3428() {
        if (this.method3427()) {
            this.field8662.deallocateBuffer(this.field8660);
        }
        this.field8661 = false;
    }
}
