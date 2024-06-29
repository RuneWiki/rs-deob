package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field6553 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6555;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field6552;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    private int field6554;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
    public final long method2633() {
        return this.field6555.getBufferAddress(this.field6554);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
    private final synchronized boolean method2634() {
        return this.field6555.method2645() && this.field6553;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2635(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | !this.method2634() | arg0 == null | arg2 > arg0.length | arg1 + arg2 > this.field6552) {
            throw new RuntimeException();
        }
        this.field6555.put(this.field6554, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V")
    private final synchronized void method2636() {
        if (this.method2634()) {
            this.field6555.deallocateBuffer(this.field6554);
        }
        this.field6553 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2636();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6555 = arg0;
        this.field6552 = arg2;
        this.field6554 = arg1;
    }
}
