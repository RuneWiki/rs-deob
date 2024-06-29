package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeBuffer")
public class NativeBuffer {

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "Z")
    private boolean field209 = true;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "Ljaggl/memory/NativeHeap;")
    private NativeHeap field208;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "d", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "([BII)V", line = 8)
    public final synchronized void method92(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 0 | !this.method95() | arg0 == null | arg0.length < arg2 | (arg1 + arg2) > this.field210) {
            throw new RuntimeException();
        }
        this.field208.put(this.field211, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "a", descriptor = "()V", line = 18)
    private final synchronized void method93() {
        if (this.method95()) {
            this.field208.deallocateBuffer(this.field211);
        }
        this.field209 = false;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "b", descriptor = "()J", line = 31)
    public final long method94() {
        return this.field208.getBufferAddress(this.field211);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "<init>", descriptor = "(Ljaggl/memory/NativeHeap;II)V", line = 56)
    public NativeBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field208 = arg0;
        this.field211 = arg1;
        this.field210 = arg2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "c", descriptor = "()Z", line = 41)
    private final synchronized boolean method95() {
        return this.field208.method103() && this.field209;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeBuffer", name = "finalize", descriptor = "()V", line = 48)
    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method93();
    }
}
