package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Z")
    private boolean field6934 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6937;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    private int field6936;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    public int field6935;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J", line = 6)
    public final long method2840() {
        return this.field6937.getBufferAddress(this.field6936);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 13)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2842();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 21)
    public final synchronized void method2841(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null | !this.method2843() | arg2 > arg0.length | arg1 < 0 | this.field6935 < arg1 + arg2) {
            throw new RuntimeException();
        }
        this.field6937.put(this.field6936, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 56)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6937 = arg0;
        this.field6936 = arg1;
        this.field6935 = arg2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()V", line = 35)
    private final synchronized void method2842() {
        if (this.method2843()) {
            this.field6937.deallocateBuffer(this.field6936);
        }
        this.field6934 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z", line = 48)
    private final synchronized boolean method2843() {
        return this.field6937.method2844() && this.field6934;
    }
}
