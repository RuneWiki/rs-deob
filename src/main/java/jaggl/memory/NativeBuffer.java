package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Z")
    private boolean field6499 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    public int field6500;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6501;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field6502;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()Z", line = 4)
    private final synchronized boolean method2715() {
        return this.field6501.method2728() && this.field6499;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 12)
    public final synchronized void method2716(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | arg0 == null | !this.method2715() | arg0.length < arg2 | (arg1 + arg2) > this.field6500) {
            throw new RuntimeException();
        }
        this.field6501.put(this.field6502, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J", line = 25)
    public final long method2717() {
        return this.field6501.getBufferAddress(this.field6502);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 33)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2718();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V", line = 41)
    private final synchronized void method2718() {
        if (this.method2715()) {
            this.field6501.deallocateBuffer(this.field6502);
        }
        this.field6499 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 55)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6500 = arg2;
        this.field6501 = arg0;
        this.field6502 = arg1;
    }
}
