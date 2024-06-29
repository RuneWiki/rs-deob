package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6377;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
    private byte[] field6376;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6374;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6375;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 5)
    public final void method2650(float arg0) {
        if (this.field6376.length <= (this.field6375 + 3)) {
            this.method2656();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6376[this.field6375++] = (byte) var2;
        this.field6376[this.field6375++] = (byte) (var2 >> 8);
        this.field6376[this.field6375++] = (byte) (var2 >> 16);
        this.field6376[this.field6375++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 20)
    public final int method2651() {
        return this.field6374 + this.field6375;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z", line = 29)
    public static final boolean method2652() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 36)
    public final void method2653(int arg0) {
        this.method2656();
        this.field6374 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 46)
    public final void method2654(float arg0) {
        if ((this.field6375 + 3) >= this.field6376.length) {
            this.method2656();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6376[this.field6375++] = (byte) (var2 >> 24);
        this.field6376[this.field6375++] = (byte) (var2 >> 16);
        this.field6376[this.field6375++] = (byte) (var2 >> 8);
        this.field6376[this.field6375++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 64)
    public final void method2655(int arg0) {
        if (this.field6376.length <= this.field6375) {
            this.method2656();
        }
        this.field6376[this.field6375++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V", line = 74)
    public final void method2656() {
        if (this.field6375 > 0) {
            this.field6377.method2649(this.field6376, this.field6374, this.field6375);
            this.field6374 += this.field6375;
            this.field6375 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 90)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6372 >= 4096 ? 4096 : arg0.field6372);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 92)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6377 = arg0;
        this.field6376 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
