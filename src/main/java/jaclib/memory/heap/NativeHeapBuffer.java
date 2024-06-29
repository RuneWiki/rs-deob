package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Z")
    private boolean field5131 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    private int field5128;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field5130;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 6)
    public final long getAddress() {
        return this.field5130.getBufferAddress(this.field5128);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 14)
    public final int getSize() {
        return this.field5129;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 21)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2218();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 32)
    private final synchronized boolean method2217() {
        return this.field5130.method2219() && this.field5131;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 39)
    private final synchronized void method2218() {
        if (this.method2217()) {
            this.field5130.deallocateBuffer(this.field5128);
        }
        this.field5131 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 50)
    public final synchronized void method281(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg1 < 0 | !this.method2217() | arg0 == null | arg1 + arg3 > arg0.length | arg2 + arg3 > this.field5129) {
            throw new RuntimeException();
        }
        this.field5130.put(this.field5128, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 63)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field5129 = arg2;
        this.field5128 = arg1;
        this.field5130 = arg0;
    }
}
