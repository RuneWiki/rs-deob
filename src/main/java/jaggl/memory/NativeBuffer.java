package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "Z")
    private boolean field6730 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "I")
    private int field6729;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field6728;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    public int field6731;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V", line = 7)
    private final synchronized void method2721() {
        if (this.method2724()) {
            this.field6728.deallocateBuffer(this.field6729);
        }
        this.field6730 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 18)
    public final synchronized void method2722(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | arg0 == null | !this.method2724() | arg2 > arg0.length | arg1 + arg2 > this.field6731) {
            throw new RuntimeException();
        }
        this.field6728.put(this.field6729, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J", line = 29)
    public final long method2723() {
        return this.field6728.getBufferAddress(this.field6729);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 38)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method2721();
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z", line = 46)
    private final synchronized boolean method2724() {
        return this.field6728.method2733() && this.field6730;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 56)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field6729 = arg1;
        this.field6728 = arg0;
        this.field6731 = arg2;
    }
}
