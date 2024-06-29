package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Z")
    private boolean field218 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field221;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method110(byte[] arg0, int arg1, int arg2) {
        if (!this.method111() | arg0 == null | arg0.length < arg2 | arg1 < 0 | this.field219 < (arg1 + arg2)) {
            throw new RuntimeException();
        }
        this.field221.put(this.field220, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()Z")
    private final synchronized boolean method111() {
        return this.field221.method123() && this.field218;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method113();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J")
    public final long method112() {
        return this.field221.getBufferAddress(this.field220);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field221 = arg0;
        this.field219 = arg2;
        this.field220 = arg1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V")
    private final synchronized void method113() {
        if (this.method111()) {
            this.field221.deallocateBuffer(this.field220);
        }
        this.field218 = false;
    }
}
