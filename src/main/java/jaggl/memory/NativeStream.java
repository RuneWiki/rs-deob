package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
    private byte[] field6940;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6942;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6941;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6943;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2847(float arg0) {
        if (this.field6943 + 3 >= this.field6940.length) {
            this.method2850();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6940[this.field6943++] = (byte) var2;
        this.field6940[this.field6943++] = (byte) (var2 >> 8);
        this.field6940[this.field6943++] = (byte) (var2 >> 16);
        this.field6940[this.field6943++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6935 < 4096 ? arg0.field6935 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z")
    public static final boolean method2848() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2849(int arg0) {
        if (this.field6940.length <= this.field6943) {
            this.method2850();
        }
        this.field6940[this.field6943++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V")
    public final void method2850() {
        if (this.field6943 > 0) {
            this.field6942.method2841(this.field6940, this.field6941, this.field6943);
            this.field6941 += this.field6943;
            this.field6943 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I")
    public final int method2851() {
        return this.field6943 + this.field6941;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2852(float arg0) {
        if (this.field6940.length <= (this.field6943 + 3)) {
            this.method2850();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6940[this.field6943++] = (byte) (var2 >> 24);
        this.field6940[this.field6943++] = (byte) (var2 >> 16);
        this.field6940[this.field6943++] = (byte) (var2 >> 8);
        this.field6940[this.field6943++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6940 = new byte[arg1];
        this.field6942 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2853(int arg0) {
        this.method2850();
        this.field6941 = arg0;
    }
}
