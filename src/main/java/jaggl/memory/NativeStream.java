package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6566;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field6568;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6565;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6567;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z", line = 7)
    public static final boolean method2629() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V", line = 16)
    public final void method2630() {
        if (this.field6567 > 0) {
            this.field6566.method2625(this.field6568, this.field6565, this.field6567);
            this.field6565 += this.field6567;
            this.field6567 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 32)
    public final void method2631(int arg0) {
        if (this.field6568.length <= this.field6567) {
            this.method2630();
        }
        this.field6568[this.field6567++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I", line = 43)
    public final int method2632() {
        return this.field6565 + this.field6567;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 50)
    public final void method2633(float arg0) {
        if (this.field6568.length <= (this.field6567 + 3)) {
            this.method2630();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6568[this.field6567++] = (byte) (var2 >> 24);
        this.field6568[this.field6567++] = (byte) (var2 >> 16);
        this.field6568[this.field6567++] = (byte) (var2 >> 8);
        this.field6568[this.field6567++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 64)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6566 = arg0;
        this.field6568 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 74)
    public final void method2634(int arg0) {
        this.method2630();
        this.field6565 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 82)
    public final void method2635(float arg0) {
        if ((this.field6567 + 3) >= this.field6568.length) {
            this.method2630();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6568[this.field6567++] = (byte) var2;
        this.field6568[this.field6567++] = (byte) (var2 >> 8);
        this.field6568[this.field6567++] = (byte) (var2 >> 16);
        this.field6568[this.field6567++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 98)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6562 >= 4096 ? 4096 : arg0.field6562);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
