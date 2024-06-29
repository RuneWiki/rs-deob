package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field6459 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6458;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field6461;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 4)
    public final synchronized void method2589(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | arg0 == null | !this.method2591() | arg2 > arg0.length | this.field6460 < (arg1 + arg2)) {
            throw new RuntimeException();
        }
        this.field6458.put(this.field6461, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V", line = 16)
    private final synchronized void method2590() {
        if (this.method2591()) {
            this.field6458.deallocateBuffer(this.field6461);
        }
        this.field6459 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z", line = 28)
    private final synchronized boolean method2591() {
        return this.field6458.method2600() && this.field6459;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 37)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2590();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()J", line = 47)
    public final long method2592() {
        return this.field6458.getBufferAddress(this.field6461);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 56)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6458 = arg0;
        this.field6461 = arg1;
        this.field6460 = arg2;
    }
}
