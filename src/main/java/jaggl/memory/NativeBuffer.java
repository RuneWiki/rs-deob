package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Z")
    private boolean field6324 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field6322;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6323;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V", line = 4)
    private final synchronized void method2591() {
        if (this.method2592()) {
            this.field6323.deallocateBuffer(this.field6325);
        }
        this.field6324 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 15)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2591();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z", line = 25)
    private final synchronized boolean method2592() {
        return this.field6323.method2603() && this.field6324;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()J", line = 32)
    public final long method2593() {
        return this.field6323.getBufferAddress(this.field6325);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 39)
    public final synchronized void method2594(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | !this.method2592() | arg0 == null | arg2 > arg0.length | this.field6322 < (arg1 + arg2)) {
            throw new RuntimeException();
        }
        this.field6323.put(this.field6325, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 56)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6322 = arg2;
        this.field6323 = arg0;
        this.field6325 = arg1;
    }
}
