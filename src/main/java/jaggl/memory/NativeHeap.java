package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeHeap")
public class NativeHeap {

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "I")
    private int field6594;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "Z")
    private boolean field6593;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "finalize", descriptor = "()V", line = 8)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2652();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "()V", line = 16)
    public final synchronized void method2652() {
        if (this.field6593) {
            this.deallocateHeap();
        }
        this.field6593 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "(I)Ljaggl/memory/NativeBuffer;", line = 29)
    public final NativeBuffer method2653(int arg0) {
        if (!this.field6593) {
            throw new IllegalStateException();
        }
        return new NativeBuffer(this, this.allocateBuffer(arg0), arg0);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "()Z", line = 42)
    public final synchronized boolean method2654() {
        return this.field6593;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "<init>", descriptor = "(I)V", line = 48)
    public NativeHeap(int arg0) {
        this.field6594 = arg0;
        this.allocateHeap(this.field6594);
        this.field6593 = true;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
    private final native void allocateHeap(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateBuffer", descriptor = "(I)I")
    public final synchronized native int allocateBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "get", descriptor = "(I[BII)V")
    public final synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
    public final synchronized native void deallocateBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
    public final synchronized native long getBufferAddress(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateHeap", descriptor = "()V")
    private final native void deallocateHeap();

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "put", descriptor = "(I[BII)V")
    public final synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3);
}
