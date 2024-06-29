package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
    private boolean field6588 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6587;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field6585;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    private int field6586;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2644();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
    public final long method2641() {
        return this.field6587.getBufferAddress(this.field6586);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
    private final synchronized boolean method2642() {
        return this.field6587.method2654() && this.field6588;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2643(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | !this.method2642() | arg0 == null | arg2 > arg0.length | arg1 + arg2 > this.field6585) {
            throw new RuntimeException();
        }
        this.field6587.put(this.field6586, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V")
    private final synchronized void method2644() {
        if (this.method2642()) {
            this.field6587.deallocateBuffer(this.field6586);
        }
        this.field6588 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6587 = arg0;
        this.field6585 = arg2;
        this.field6586 = arg1;
    }
}
