package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Z")
    private boolean field6405 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6404;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field6403;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field6406;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2616(byte[] arg0, int arg1, int arg2) {
        if (!this.method2618() | arg0 == null | arg0.length < arg2 | arg1 < 0 | (arg1 + arg2) > this.field6403) {
            throw new RuntimeException();
        }
        this.field6404.put(this.field6406, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
    private final synchronized void method2617() {
        if (this.method2618()) {
            this.field6404.deallocateBuffer(this.field6406);
        }
        this.field6405 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
    private final synchronized boolean method2618() {
        return this.field6404.method2628() && this.field6405;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()J")
    public final long method2619() {
        return this.field6404.getBufferAddress(this.field6406);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2617();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6404 = arg0;
        this.field6403 = arg2;
        this.field6406 = arg1;
    }
}
