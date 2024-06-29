package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "Z")
    private boolean field8417 = true;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    private NativeHeap field8416;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "I")
    private int field8419;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "I")
    public int field8418;

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getSize", descriptor = "()I", line = 6)
    public final int getSize() {
        return this.field8418;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "getAddress", descriptor = "()J", line = 13)
    public final long getAddress() {
        return this.field8416.getBufferAddress(this.field8419);
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V", line = 52)
    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field8416 = arg0;
        this.field8419 = arg1;
        this.field8418 = arg2;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 25)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method3407();
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()Z", line = 35)
    private final synchronized boolean method3406() {
        return this.field8416.method3409() && this.field8417;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "b", descriptor = "()V", line = 42)
    private final synchronized void method3407() {
        if (this.method3406()) {
            this.field8416.deallocateBuffer(this.field8419);
        }
        this.field8417 = false;
    }

    @OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "([BIII)V", line = 62)
    public final synchronized void method2635(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | arg0 == null | !this.method3406() | arg0.length < (arg1 + arg3) | arg2 < 0 | (arg2 + arg3) > this.field8418) {
            throw new RuntimeException();
        }
        this.field8416.put(this.field8419, arg0, arg1, arg2, arg3);
    }
}
