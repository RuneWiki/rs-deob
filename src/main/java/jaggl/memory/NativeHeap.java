package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeHeap")
public class NativeHeap {

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "I")
    private int field6246;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "Z")
    private boolean field6247;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "get", descriptor = "(I[BII)V")
    public final synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateHeap", descriptor = "()V")
    private final native void deallocateHeap();

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "()Z")
    public final synchronized boolean method2518() {
        return this.field6247;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "(I)Ljaggl/memory/NativeBuffer;")
    public final NativeBuffer method2519(int arg0) {
        if (!this.field6247) {
            throw new IllegalStateException();
        }
        return new NativeBuffer(this, this.allocateBuffer(arg0), arg0);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "put", descriptor = "(I[BII)V")
    public final synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "()V")
    public final synchronized void method2520() {
        if (this.field6247) {
            this.deallocateHeap();
        }
        this.field6247 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateBuffer", descriptor = "(I)I")
    public final synchronized native int allocateBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2520();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
    public final synchronized native long getBufferAddress(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
    public final synchronized native void deallocateBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
    private final native void allocateHeap(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "<init>", descriptor = "(I)V")
    public NativeHeap(int arg0) {
        this.field6246 = arg0;
        this.allocateHeap(this.field6246);
        this.field6247 = true;
    }
}
