package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6505;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
    private byte[] field6503;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6506;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 5)
    public final int method2719() {
        return this.field6506 + this.field6504;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 14)
    public final void method2720(int arg0) {
        if (this.field6504 >= this.field6503.length) {
            this.method2724();
        }
        this.field6503[this.field6504++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 25)
    public final void method2721(int arg0) {
        this.method2724();
        this.field6506 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 34)
    public final void method2722(float arg0) {
        if (this.field6503.length <= (this.field6504 + 3)) {
            this.method2724();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6503[this.field6504++] = (byte) var2;
        this.field6503[this.field6504++] = (byte) (var2 >> 8);
        this.field6503[this.field6504++] = (byte) (var2 >> 16);
        this.field6503[this.field6504++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 49)
    public final void method2723(float arg0) {
        if (this.field6503.length <= this.field6504 + 3) {
            this.method2724();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6503[this.field6504++] = (byte) (var2 >> 24);
        this.field6503[this.field6504++] = (byte) (var2 >> 16);
        this.field6503[this.field6504++] = (byte) (var2 >> 8);
        this.field6503[this.field6504++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V", line = 65)
    public final void method2724() {
        if (this.field6504 > 0) {
            this.field6505.method2716(this.field6503, this.field6506, this.field6504);
            this.field6506 += this.field6504;
            this.field6504 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 78)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6500 < 4096 ? arg0.field6500 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z", line = 85)
    public static final boolean method2725() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 93)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6505 = arg0;
        this.field6503 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
