package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field6371 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6373;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field6370;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    public int field6372;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()Z", line = 7)
    private final synchronized boolean method2646() {
        return this.field6373.method2657() && this.field6371;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J", line = 17)
    public final long method2647() {
        return this.field6373.getBufferAddress(this.field6370);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 24)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2648();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 57)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6373 = arg0;
        this.field6370 = arg1;
        this.field6372 = arg2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()V", line = 35)
    private final synchronized void method2648() {
        if (this.method2646()) {
            this.field6373.deallocateBuffer(this.field6370);
        }
        this.field6371 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 46)
    public final synchronized void method2649(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null | !this.method2646() | arg2 > arg0.length | arg1 < 0 | arg1 + arg2 > this.field6372) {
            throw new RuntimeException();
        }
        this.field6373.put(this.field6370, arg0, arg1, arg2);
    }
}
