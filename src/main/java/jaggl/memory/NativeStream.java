package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field6735;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6733;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6732;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6734;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 4)
    public final int method2725() {
        return this.field6734 + this.field6732;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 11)
    public final void method2726(int arg0) {
        if (this.field6735.length <= this.field6734) {
            this.method2728();
        }
        this.field6735[this.field6734++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z", line = 24)
    public static final boolean method2727() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 31)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6731 >= 4096 ? 4096 : arg0.field6731);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V", line = 36)
    public final void method2728() {
        if (this.field6734 > 0) {
            this.field6733.method2722(this.field6735, this.field6732, this.field6734);
            this.field6732 += this.field6734;
            this.field6734 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 52)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6735 = new byte[arg1];
        this.field6733 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 63)
    public final void method2729(int arg0) {
        this.method2728();
        this.field6732 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 72)
    public final void method2730(float arg0) {
        if ((this.field6734 + 3) >= this.field6735.length) {
            this.method2728();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6735[this.field6734++] = (byte) (var2 >> 24);
        this.field6735[this.field6734++] = (byte) (var2 >> 16);
        this.field6735[this.field6734++] = (byte) (var2 >> 8);
        this.field6735[this.field6734++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 87)
    public final void method2731(float arg0) {
        if (this.field6735.length <= (this.field6734 + 3)) {
            this.method2728();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6735[this.field6734++] = (byte) var2;
        this.field6735[this.field6734++] = (byte) (var2 >> 8);
        this.field6735[this.field6734++] = (byte) (var2 >> 16);
        this.field6735[this.field6734++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
