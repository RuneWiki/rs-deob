package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6436;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
    private byte[] field6438;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6437;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6439;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 4)
    public final int method2731() {
        return this.field6439 + this.field6437;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 14)
    public final void method2732(int arg0) {
        this.method2734();
        this.field6437 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 23)
    public final void method2733(float arg0) {
        if ((this.field6439 + 3) >= this.field6438.length) {
            this.method2734();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6438[this.field6439++] = (byte) var2;
        this.field6438[this.field6439++] = (byte) (var2 >> 8);
        this.field6438[this.field6439++] = (byte) (var2 >> 16);
        this.field6438[this.field6439++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V", line = 40)
    public final void method2734() {
        if (this.field6439 > 0) {
            this.field6436.method2730(this.field6438, this.field6437, this.field6439);
            this.field6437 += this.field6439;
            this.field6439 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z", line = 54)
    public static final boolean method2735() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 63)
    public final void method2736(float arg0) {
        if (this.field6438.length <= this.field6439 + 3) {
            this.method2734();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6438[this.field6439++] = (byte) (var2 >> 24);
        this.field6438[this.field6439++] = (byte) (var2 >> 16);
        this.field6438[this.field6439++] = (byte) (var2 >> 8);
        this.field6438[this.field6439++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 78)
    public final void method2737(int arg0) {
        if (this.field6439 >= this.field6438.length) {
            this.method2734();
        }
        this.field6438[this.field6439++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 89)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6432 < 4096 ? arg0.field6432 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 93)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6436 = arg0;
        this.field6438 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
