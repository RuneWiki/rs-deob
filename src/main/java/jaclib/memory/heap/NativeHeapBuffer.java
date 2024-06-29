package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field8491 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    private int field8490;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8489;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    public int field8488;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 4)
    public final long getAddress() {
        return this.field8489.getBufferAddress(this.field8490);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 17)
    private final synchronized void method3464() {
        if (this.method3465()) {
            this.field8489.deallocateBuffer(this.field8490);
        }
        this.field8491 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 27)
    private final synchronized boolean method3465() {
        return this.field8489.method3466() && this.field8491;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 35)
    public final int getSize() {
        return this.field8488;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 42)
    public final synchronized void method2584(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg1 < 0 | arg0 == null | !this.method3465() | arg0.length < arg1 + arg3 | arg2 + arg3 > this.field8488) {
            throw new RuntimeException();
        }
        this.field8489.put(this.field8490, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 52)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3464();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 62)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8490 = arg1;
        this.field8489 = arg0;
        this.field8488 = arg2;
    }
}
