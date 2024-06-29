package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Z")
    private boolean field6238 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    public int field6239;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    private int field6240;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6241;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
    private final synchronized void method2507() {
        if (this.method2510()) {
            this.field6241.deallocateBuffer(this.field6240);
        }
        this.field6238 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2507();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J")
    public final long method2508() {
        return this.field6241.getBufferAddress(this.field6240);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2509(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | !this.method2510() | arg0 == null | arg0.length < arg2 | this.field6239 < arg1 + arg2) {
            throw new RuntimeException();
        }
        this.field6241.put(this.field6240, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
    private final synchronized boolean method2510() {
        return this.field6241.method2518() && this.field6238;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6239 = arg2;
        this.field6240 = arg1;
        this.field6241 = arg0;
    }
}
