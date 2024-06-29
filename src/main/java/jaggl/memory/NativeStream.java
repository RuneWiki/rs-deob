package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
    private byte[] field6409;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6410;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6407;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6408;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 4)
    public final void method2620(int arg0) {
        if (this.field6408 >= this.field6409.length) {
            this.method2625();
        }
        this.field6409[this.field6408++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 15)
    public final int method2621() {
        return this.field6408 + this.field6407;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 26)
    public final void method2622(float arg0) {
        if (this.field6409.length <= (this.field6408 + 3)) {
            this.method2625();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6409[this.field6408++] = (byte) var2;
        this.field6409[this.field6408++] = (byte) (var2 >> 8);
        this.field6409[this.field6408++] = (byte) (var2 >> 16);
        this.field6409[this.field6408++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z", line = 43)
    public static final boolean method2623() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 52)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6403 >= 4096 ? 4096 : arg0.field6403);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 57)
    public final void method2624(float arg0) {
        if (this.field6409.length <= (this.field6408 + 3)) {
            this.method2625();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6409[this.field6408++] = (byte) (var2 >> 24);
        this.field6409[this.field6408++] = (byte) (var2 >> 16);
        this.field6409[this.field6408++] = (byte) (var2 >> 8);
        this.field6409[this.field6408++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 72)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6409 = new byte[arg1];
        this.field6410 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V", line = 81)
    public final void method2625() {
        if (this.field6408 > 0) {
            this.field6410.method2616(this.field6409, this.field6407, this.field6408);
            this.field6407 += this.field6408;
            this.field6408 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 95)
    public final void method2626(int arg0) {
        this.method2625();
        this.field6407 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
