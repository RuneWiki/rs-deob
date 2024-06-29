package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
    private byte[] field6513;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6514;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6515;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6516;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 4)
    public final int method2674() {
        return this.field6516 + this.field6515;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V", line = 12)
    public final void method2675() {
        if (this.field6516 > 0) {
            this.field6514.method2670(this.field6513, this.field6515, this.field6516);
            this.field6515 += this.field6516;
            this.field6516 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z", line = 29)
    public static final boolean method2676() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 36)
    public final void method2677(float arg0) {
        if (this.field6513.length <= this.field6516 + 3) {
            this.method2675();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6513[this.field6516++] = (byte) (var2 >> 24);
        this.field6513[this.field6516++] = (byte) (var2 >> 16);
        this.field6513[this.field6516++] = (byte) (var2 >> 8);
        this.field6513[this.field6516++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 52)
    public final void method2678(int arg0) {
        this.method2675();
        this.field6515 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 63)
    public final void method2679(float arg0) {
        if (this.field6513.length <= this.field6516 + 3) {
            this.method2675();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6513[this.field6516++] = (byte) var2;
        this.field6513[this.field6516++] = (byte) (var2 >> 8);
        this.field6513[this.field6516++] = (byte) (var2 >> 16);
        this.field6513[this.field6516++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 80)
    public final void method2680(int arg0) {
        if (this.field6513.length <= this.field6516) {
            this.method2675();
        }
        this.field6513[this.field6516++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 91)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6513 = new byte[arg1];
        this.field6514 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 100)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6512 < 4096 ? arg0.field6512 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
