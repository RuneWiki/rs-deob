package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field7080 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field7079;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field7081;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
    private final synchronized void method2916() {
        if (this.method2919()) {
            this.field7081.deallocateBuffer(this.field7082);
        }
        this.field7080 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2917(byte[] arg0, int arg1, int arg2) {
        if (!this.method2919() | arg0 == null | arg2 > arg0.length | arg1 < 0 | arg1 + arg2 > this.field7079) {
            throw new RuntimeException();
        }
        this.field7081.put(this.field7082, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J")
    public final long method2918() {
        return this.field7081.getBufferAddress(this.field7082);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2916();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field7082 = arg1;
        this.field7079 = arg2;
        this.field7081 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
    private final synchronized boolean method2919() {
        return this.field7081.method2921() && this.field7080;
    }
}
