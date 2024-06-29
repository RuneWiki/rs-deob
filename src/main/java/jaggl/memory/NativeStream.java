package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6327;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
    private byte[] field6326;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6329;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()V", line = 5)
    public final void method2595() {
        if (this.field6328 > 0) {
            this.field6327.method2594(this.field6326, this.field6329, this.field6328);
            this.field6329 += this.field6328;
            this.field6328 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 19)
    public final void method2596(float arg0) {
        if (this.field6328 + 3 >= this.field6326.length) {
            this.method2595();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6326[this.field6328++] = (byte) (var2 >> 24);
        this.field6326[this.field6328++] = (byte) (var2 >> 16);
        this.field6326[this.field6328++] = (byte) (var2 >> 8);
        this.field6326[this.field6328++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 39)
    public final void method2597(int arg0) {
        this.method2595();
        this.field6329 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 47)
    public final void method2598(int arg0) {
        if (this.field6326.length <= this.field6328) {
            this.method2595();
        }
        this.field6326[this.field6328++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 58)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6322 >= 4096 ? 4096 : arg0.field6322);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I", line = 63)
    public final int method2599() {
        return this.field6329 + this.field6328;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 71)
    public final void method2600(float arg0) {
        if (this.field6326.length <= (this.field6328 + 3)) {
            this.method2595();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6326[this.field6328++] = (byte) var2;
        this.field6326[this.field6328++] = (byte) (var2 >> 8);
        this.field6326[this.field6328++] = (byte) (var2 >> 16);
        this.field6326[this.field6328++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 86)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6327 = arg0;
        this.field6326 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z", line = 95)
    public static final boolean method2601() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
