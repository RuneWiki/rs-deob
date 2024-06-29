package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field297;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field300;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method152(float arg0) {
        if ((this.field299 + 3) >= this.field300.length) {
            this.method157();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field300[this.field299++] = (byte) var2;
        this.field300[this.field299++] = (byte) (var2 >> 8);
        this.field300[this.field299++] = (byte) (var2 >> 16);
        this.field300[this.field299++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field293 < 4096 ? arg0.field293 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method153(int arg0) {
        this.method157();
        this.field298 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method154(int arg0) {
        if (this.field299 >= this.field300.length) {
            this.method157();
        }
        this.field300[this.field299++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method155(float arg0) {
        if (this.field300.length <= (this.field299 + 3)) {
            this.method157();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field300[this.field299++] = (byte) (var2 >> 24);
        this.field300[this.field299++] = (byte) (var2 >> 16);
        this.field300[this.field299++] = (byte) (var2 >> 8);
        this.field300[this.field299++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field297 = arg0;
        this.field300 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z")
    public static final boolean method156() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V")
    public final void method157() {
        if (this.field299 > 0) {
            this.field297.method150(this.field300, this.field298, this.field299);
            this.field298 += this.field299;
            this.field299 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I")
    public final int method158() {
        return this.field299 + this.field298;
    }
}
