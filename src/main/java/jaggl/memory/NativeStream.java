package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7088;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "[B")
    private byte[] field7086;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field7085;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field7087;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2923(int arg0) {
        if (this.field7086.length <= this.field7085) {
            this.method2929();
        }
        this.field7086[this.field7085++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2924(float arg0) {
        if (this.field7086.length <= this.field7085 + 3) {
            this.method2929();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7086[this.field7085++] = (byte) var2;
        this.field7086[this.field7085++] = (byte) (var2 >> 8);
        this.field7086[this.field7085++] = (byte) (var2 >> 16);
        this.field7086[this.field7085++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I")
    public final int method2925() {
        return this.field7087 + this.field7085;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2926(float arg0) {
        if ((this.field7085 + 3) >= this.field7086.length) {
            this.method2929();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7086[this.field7085++] = (byte) (var2 >> 24);
        this.field7086[this.field7085++] = (byte) (var2 >> 16);
        this.field7086[this.field7085++] = (byte) (var2 >> 8);
        this.field7086[this.field7085++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z")
    public static final boolean method2927() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2928(int arg0) {
        this.method2929();
        this.field7087 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field7088 = arg0;
        this.field7086 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V")
    public final void method2929() {
        if (this.field7085 > 0) {
            this.field7088.method2917(this.field7086, this.field7087, this.field7085);
            this.field7087 += this.field7085;
            this.field7085 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field7079 < 4096 ? arg0.field7079 : 4096);
    }
}
