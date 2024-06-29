package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
    private boolean field6450 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field6447;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6449;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    private int field6448;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J", line = 7)
    public final long method2641() {
        return this.field6449.getBufferAddress(this.field6448);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z", line = 14)
    private final synchronized boolean method2642() {
        return this.field6449.method2652() && this.field6450;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V", line = 22)
    private final synchronized void method2643() {
        if (this.method2642()) {
            this.field6449.deallocateBuffer(this.field6448);
        }
        this.field6450 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 35)
    public final synchronized void method2644(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | !this.method2642() | arg0 == null | arg2 > arg0.length | arg1 + arg2 > this.field6447) {
            throw new RuntimeException();
        }
        this.field6449.put(this.field6448, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 48)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6447 = arg2;
        this.field6449 = arg0;
        this.field6448 = arg1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 58)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2643();
    }
}
