package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
    private boolean field6435 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field6432;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6433;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
    private final synchronized void method2727() {
        if (this.method2729()) {
            this.field6433.deallocateBuffer(this.field6434);
        }
        this.field6435 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2727();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J")
    public final long method2728() {
        return this.field6433.getBufferAddress(this.field6434);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
    private final synchronized boolean method2729() {
        return this.field6433.method2740() && this.field6435;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6432 = arg2;
        this.field6434 = arg1;
        this.field6433 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2730(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null | !this.method2729() | arg2 > arg0.length | arg1 < 0 | arg1 + arg2 > this.field6432) {
            throw new RuntimeException();
        }
        this.field6433.put(this.field6434, arg0, arg1, arg2);
    }
}
