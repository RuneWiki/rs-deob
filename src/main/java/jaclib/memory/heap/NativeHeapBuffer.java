package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Z")
    private boolean field8774 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    private int field8772;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8775;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    public int field8773;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 5)
    public final int getSize() {
        return this.field8773;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 13)
    private final synchronized void method3464() {
        if (this.method3465()) {
            this.field8775.deallocateBuffer(this.field8772);
        }
        this.field8774 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 23)
    private final synchronized boolean method3465() {
        return this.field8775.method3463() && this.field8774;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 30)
    public final long getAddress() {
        return this.field8775.getBufferAddress(this.field8772);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 37)
    public final synchronized void method2506(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | !this.method3465() | arg0 == null | arg0.length < arg1 + arg3 | arg2 < 0 | this.field8773 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.field8775.put(this.field8772, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 50)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3464();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 63)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8772 = arg1;
        this.field8775 = arg0;
        this.field8773 = arg2;
    }
}
