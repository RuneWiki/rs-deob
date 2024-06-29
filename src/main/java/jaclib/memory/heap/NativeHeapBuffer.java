package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Z")
    private boolean field9653 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "I")
    private int field9654;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field9655;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    public int field9656;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 25)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field9654 = arg1;
        this.field9655 = arg0;
        this.field9656 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 11)
    public final long getAddress() {
        return this.field9655.getBufferAddress(this.field9654);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 18)
    public final int getSize() {
        return this.field9656;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 35)
    public final synchronized void method2933(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null | !this.method3896() | arg1 < 0 | arg0.length < (arg1 + arg3) | arg2 < 0 | arg2 + arg3 > this.field9656) {
            throw new RuntimeException();
        }
        this.field9655.put(this.field9654, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()V", line = 46)
    private final synchronized void method3895() {
        if (this.method3896()) {
            this.field9655.deallocateBuffer(this.field9654);
        }
        this.field9653 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 58)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3895();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()Z", line = 66)
    private final synchronized boolean method3896() {
        return this.field9655.method3897() && this.field9653;
    }
}
