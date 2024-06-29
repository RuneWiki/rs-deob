package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field7046 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field7045;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    public int field7047;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field7048;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 4)
    public final synchronized void method2845(byte[] arg0, int arg1, int arg2) {
        if (!this.method2847() | arg0 == null | arg2 > arg0.length | arg1 < 0 | arg1 + arg2 > this.field7047) {
            throw new RuntimeException();
        }
        this.field7045.put(this.field7048, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 15)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2848();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J", line = 23)
    public final long method2846() {
        return this.field7045.getBufferAddress(this.field7048);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z", line = 31)
    private final synchronized boolean method2847() {
        return this.field7045.method2849() && this.field7046;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V", line = 38)
    private final synchronized void method2848() {
        if (this.method2847()) {
            this.field7045.deallocateBuffer(this.field7048);
        }
        this.field7046 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 55)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field7045 = arg0;
        this.field7047 = arg2;
        this.field7048 = arg1;
    }
}
