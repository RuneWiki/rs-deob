package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field6247 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field6246;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    public int field6249;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6248;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V")
    public final synchronized void method2608(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null | !this.method2611() | arg0.length < arg2 | arg1 < 0 | arg1 + arg2 > this.field6249) {
            throw new RuntimeException();
        }
        this.field6248.put(this.field6246, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V")
    private final synchronized void method2609() {
        if (this.method2611()) {
            this.field6248.deallocateBuffer(this.field6246);
        }
        this.field6247 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J")
    public final long method2610() {
        return this.field6248.getBufferAddress(this.field6246);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z")
    private final synchronized boolean method2611() {
        return this.field6248.method2621() && this.field6247;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2609();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V")
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6246 = arg1;
        this.field6249 = arg2;
        this.field6248 = arg0;
    }
}
