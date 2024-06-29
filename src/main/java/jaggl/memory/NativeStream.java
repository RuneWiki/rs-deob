package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field6454;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6451;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6453;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2645(int arg0) {
        this.method2650();
        this.field6452 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2646(float arg0) {
        if (this.field6454.length <= this.field6453 + 3) {
            this.method2650();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6454[this.field6453++] = (byte) (var2 >> 24);
        this.field6454[this.field6453++] = (byte) (var2 >> 16);
        this.field6454[this.field6453++] = (byte) (var2 >> 8);
        this.field6454[this.field6453++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2647(float arg0) {
        if ((this.field6453 + 3) >= this.field6454.length) {
            this.method2650();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6454[this.field6453++] = (byte) var2;
        this.field6454[this.field6453++] = (byte) (var2 >> 8);
        this.field6454[this.field6453++] = (byte) (var2 >> 16);
        this.field6454[this.field6453++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2648(int arg0) {
        if (this.field6454.length <= this.field6453) {
            this.method2650();
        }
        this.field6454[this.field6453++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6447 >= 4096 ? 4096 : arg0.field6447);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z")
    public static final boolean method2649() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V")
    public final void method2650() {
        if (this.field6453 > 0) {
            this.field6451.method2644(this.field6454, this.field6452, this.field6453);
            this.field6452 += this.field6453;
            this.field6453 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I")
    public final int method2651() {
        return this.field6453 + this.field6452;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6454 = new byte[arg1];
        this.field6451 = arg0;
    }
}
