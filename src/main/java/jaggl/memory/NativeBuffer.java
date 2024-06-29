package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
    private boolean field6017 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field6014;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    public int field6016;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6015;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2519(byte[] arg0, int arg1, int arg2) {
        if (!this.method2522() | arg0 == null | arg0.length < arg2 | arg1 < 0 | this.field6016 < arg1 + arg2) {
            throw new RuntimeException();
        }
        this.field6015.put(this.field6014, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2521();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
    public final long method2520() {
        return this.field6015.getBufferAddress(this.field6014);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()V")
    private final synchronized void method2521() {
        if (this.method2522()) {
            this.field6015.deallocateBuffer(this.field6014);
        }
        this.field6017 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
    private final synchronized boolean method2522() {
        return this.field6015.method2530() && this.field6017;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6014 = arg1;
        this.field6016 = arg2;
        this.field6015 = arg0;
    }
}
