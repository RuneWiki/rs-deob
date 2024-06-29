package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field6559;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6556;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6557;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6558;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()V")
    public final void method2637() {
        if (this.field6558 > 0) {
            this.field6556.method2635(this.field6559, this.field6557, this.field6558);
            this.field6557 += this.field6558;
            this.field6558 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2638(float arg0) {
        if (this.field6558 + 3 >= this.field6559.length) {
            this.method2637();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6559[this.field6558++] = (byte) (var2 >> 24);
        this.field6559[this.field6558++] = (byte) (var2 >> 16);
        this.field6559[this.field6558++] = (byte) (var2 >> 8);
        this.field6559[this.field6558++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2639(int arg0) {
        if (this.field6558 >= this.field6559.length) {
            this.method2637();
        }
        this.field6559[this.field6558++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2640(int arg0) {
        this.method2637();
        this.field6557 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2641(float arg0) {
        if (this.field6559.length <= this.field6558 + 3) {
            this.method2637();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6559[this.field6558++] = (byte) var2;
        this.field6559[this.field6558++] = (byte) (var2 >> 8);
        this.field6559[this.field6558++] = (byte) (var2 >> 16);
        this.field6559[this.field6558++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I")
    public final int method2642() {
        return this.field6558 + this.field6557;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6552 >= 4096 ? 4096 : arg0.field6552);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z")
    public static final boolean method2643() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6559 = new byte[arg1];
        this.field6556 = arg0;
    }
}
