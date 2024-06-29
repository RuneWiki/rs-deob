package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Z")
    private boolean field8537 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field8538;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field8536;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8535;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 5)
    public final long getAddress() {
        return this.field8535.getBufferAddress(this.field8536);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 12)
    public final synchronized void method2480(byte[] arg0, int arg1, int arg2, int arg3) {
        if (!this.method3512() | arg0 == null | arg1 < 0 | arg0.length < arg1 + arg3 | arg2 < 0 | (arg2 + arg3) > this.field8538) {
            throw new RuntimeException();
        }
        this.field8535.put(this.field8536, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 35)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8538 = arg2;
        this.field8536 = arg1;
        this.field8535 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 29)
    private final synchronized boolean method3512() {
        return this.field8535.method3514() && this.field8537;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 46)
    private final synchronized void method3513() {
        if (this.method3512()) {
            this.field8535.deallocateBuffer(this.field8536);
        }
        this.field8537 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 57)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3513();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 65)
    public final int getSize() {
        return this.field8538;
    }
}
