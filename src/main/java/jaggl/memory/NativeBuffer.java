package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Z")
    private boolean field296 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field294;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()J")
    public final long method148() {
        return this.field294.getBufferAddress(this.field295);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()Z")
    private final synchronized boolean method149() {
        return this.field294.method161() && this.field296;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method150(byte[] arg0, int arg1, int arg2) {
        if (!this.method149() | arg0 == null | arg2 > arg0.length | arg1 < 0 | this.field293 < arg1 + arg2) {
            throw new RuntimeException();
        }
        this.field294.put(this.field295, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method151();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V")
    private final synchronized void method151() {
        if (this.method149()) {
            this.field294.deallocateBuffer(this.field295);
        }
        this.field296 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field294 = arg0;
        this.field293 = arg2;
        this.field295 = arg1;
    }
}
