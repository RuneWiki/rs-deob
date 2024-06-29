package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
    private boolean field6073 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    public int field6071;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field6070;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6072;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()Z", line = 5)
    private final synchronized boolean method2478() {
        return this.field6072.method2489() && this.field6073;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 12)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2481();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J", line = 22)
    public final long method2479() {
        return this.field6072.getBufferAddress(this.field6070);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 31)
    public final synchronized void method2480(byte[] arg0, int arg1, int arg2) {
        if (!this.method2478() | arg0 == null | arg0.length < arg2 | arg1 < 0 | this.field6071 < (arg1 + arg2)) {
            throw new RuntimeException();
        }
        this.field6072.put(this.field6070, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V", line = 42)
    private final synchronized void method2481() {
        if (this.method2478()) {
            this.field6072.deallocateBuffer(this.field6070);
        }
        this.field6073 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 56)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6071 = arg2;
        this.field6070 = arg1;
        this.field6072 = arg0;
    }
}
