package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
    private boolean field5937 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field5939;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "I")
    public int field5936;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 4)
    public final int getSize() {
        return this.field5936;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 13)
    public final long getAddress() {
        return this.field5939.getBufferAddress(this.field5938);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 22)
    private final synchronized boolean method2625() {
        return this.field5939.method2622() && this.field5937;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 32)
    public final synchronized void method2620(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | !this.method2625() | arg0 == null | (arg1 + arg3) > arg0.length | arg2 < 0 | (arg2 + arg3) > this.field5936) {
            throw new RuntimeException();
        }
        this.field5939.put(this.field5938, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 43)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2626();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 53)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field5939 = arg0;
        this.field5938 = arg1;
        this.field5936 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 63)
    private final synchronized void method2626() {
        if (this.method2625()) {
            this.field5939.deallocateBuffer(this.field5938);
        }
        this.field5937 = false;
    }
}
