package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeHeap")
public class NativeHeap {

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "I")
    private int field6507;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "Z")
    private boolean field6508;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "()V", line = 4)
    public final synchronized void method2726() {
        if (this.field6508) {
            this.deallocateHeap();
        }
        this.field6508 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "a", descriptor = "(I)Ljaggl/memory/NativeBuffer;", line = 18)
    public final NativeBuffer method2727(int arg0) {
        if (!this.field6508) {
            throw new IllegalStateException();
        }
        return new NativeBuffer(this, this.allocateBuffer(arg0), arg0);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "b", descriptor = "()Z", line = 33)
    public final synchronized boolean method2728() {
        return this.field6508;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "finalize", descriptor = "()V", line = 41)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2726();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "<init>", descriptor = "(I)V", line = 50)
    public NativeHeap(int arg0) {
        this.field6507 = arg0;
        this.allocateHeap(this.field6507);
        this.field6508 = true;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateBuffer", descriptor = "(I)I")
    public final synchronized native int allocateBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateHeap", descriptor = "()V")
    private final native void deallocateHeap();

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
    public final synchronized native void deallocateBuffer(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
    private final native void allocateHeap(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "get", descriptor = "(I[BII)V")
    public final synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "put", descriptor = "(I[BII)V")
    public final synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaggl/memory/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
    public final synchronized native long getBufferAddress(int arg0);
}
