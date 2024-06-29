package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Z")
    private boolean field6933 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6931;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    public int field6932;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field6934;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J", line = 5)
    public final long method2841() {
        return this.field6931.getBufferAddress(this.field6934);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 14)
    public final synchronized void method2842(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null | !this.method2843() | arg2 > arg0.length | arg1 < 0 | (arg1 + arg2) > this.field6932) {
            throw new RuntimeException();
        }
        this.field6931.put(this.field6934, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 25)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2844();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z", line = 35)
    private final synchronized boolean method2843() {
        return this.field6931.method2845() && this.field6933;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V", line = 44)
    private final synchronized void method2844() {
        if (this.method2843()) {
            this.field6931.deallocateBuffer(this.field6934);
        }
        this.field6933 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 57)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6931 = arg0;
        this.field6932 = arg2;
        this.field6934 = arg1;
    }
}
