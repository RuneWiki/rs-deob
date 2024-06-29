package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6590;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
    private byte[] field6589;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6591;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6592;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 4)
    public final void method2645(int arg0) {
        if (this.field6589.length <= this.field6592) {
            this.method2647();
        }
        this.field6589[this.field6592++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 17)
    public final void method2646(int arg0) {
        this.method2647();
        this.field6591 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()V", line = 26)
    public final void method2647() {
        if (this.field6592 > 0) {
            this.field6590.method2643(this.field6589, this.field6591, this.field6592);
            this.field6591 += this.field6592;
            this.field6592 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z", line = 41)
    public static final boolean method2648() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 48)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6585 < 4096 ? arg0.field6585 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I", line = 52)
    public final int method2649() {
        return this.field6591 + this.field6592;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 59)
    public final void method2650(float arg0) {
        if (this.field6592 + 3 >= this.field6589.length) {
            this.method2647();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6589[this.field6592++] = (byte) (var2 >> 24);
        this.field6589[this.field6592++] = (byte) (var2 >> 16);
        this.field6589[this.field6592++] = (byte) (var2 >> 8);
        this.field6589[this.field6592++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 74)
    public final void method2651(float arg0) {
        if (this.field6589.length <= this.field6592 + 3) {
            this.method2647();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6589[this.field6592++] = (byte) var2;
        this.field6589[this.field6592++] = (byte) (var2 >> 8);
        this.field6589[this.field6592++] = (byte) (var2 >> 16);
        this.field6589[this.field6592++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 92)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6590 = arg0;
        this.field6589 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
