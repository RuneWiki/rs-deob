package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6464;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "[B")
    private byte[] field6463;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6462;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6465;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 4)
    public final void method2593(int arg0) {
        if (this.field6463.length <= this.field6465) {
            this.method2599();
        }
        this.field6463[this.field6465++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z", line = 14)
    public static final boolean method2594() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 22)
    public final void method2595(float arg0) {
        if (this.field6463.length <= (this.field6465 + 3)) {
            this.method2599();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6463[this.field6465++] = (byte) (var2 >> 24);
        this.field6463[this.field6465++] = (byte) (var2 >> 16);
        this.field6463[this.field6465++] = (byte) (var2 >> 8);
        this.field6463[this.field6465++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I", line = 40)
    public final int method2596() {
        return this.field6465 + this.field6462;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 49)
    public final void method2597(int arg0) {
        this.method2599();
        this.field6462 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 59)
    public final void method2598(float arg0) {
        if (this.field6463.length <= this.field6465 + 3) {
            this.method2599();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6463[this.field6465++] = (byte) var2;
        this.field6463[this.field6465++] = (byte) (var2 >> 8);
        this.field6463[this.field6465++] = (byte) (var2 >> 16);
        this.field6463[this.field6465++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 73)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6464 = arg0;
        this.field6463 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V", line = 82)
    public final void method2599() {
        if (this.field6465 > 0) {
            this.field6464.method2589(this.field6463, this.field6462, this.field6465);
            this.field6462 += this.field6465;
            this.field6465 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 96)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6460 >= 4096 ? 4096 : arg0.field6460);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
