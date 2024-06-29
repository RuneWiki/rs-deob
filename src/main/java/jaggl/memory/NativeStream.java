package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6021;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
    private byte[] field6020;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6018;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6019;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 5)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6016 < 4096 ? arg0.field6016 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 10)
    public final void method2523(float arg0) {
        if (this.field6020.length <= this.field6018 + 3) {
            this.method2525();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6020[this.field6018++] = (byte) var2;
        this.field6020[this.field6018++] = (byte) (var2 >> 8);
        this.field6020[this.field6018++] = (byte) (var2 >> 16);
        this.field6020[this.field6018++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 27)
    public final void method2524(int arg0) {
        this.method2525();
        this.field6019 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()V", line = 37)
    public final void method2525() {
        if (this.field6018 > 0) {
            this.field6021.method2519(this.field6020, this.field6019, this.field6018);
            this.field6019 += this.field6018;
            this.field6018 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I", line = 54)
    public final int method2526() {
        return this.field6019 + this.field6018;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z", line = 61)
    public static final boolean method2527() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 68)
    public final void method2528(int arg0) {
        if (this.field6020.length <= this.field6018) {
            this.method2525();
        }
        this.field6020[this.field6018++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 79)
    public final void method2529(float arg0) {
        if ((this.field6018 + 3) >= this.field6020.length) {
            this.method2525();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6020[this.field6018++] = (byte) (var2 >> 24);
        this.field6020[this.field6018++] = (byte) (var2 >> 16);
        this.field6020[this.field6018++] = (byte) (var2 >> 8);
        this.field6020[this.field6018++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 95)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6021 = arg0;
        this.field6020 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
