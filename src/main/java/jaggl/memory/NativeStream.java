package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6244;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field6245;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6242;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6243;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z", line = 5)
    public static final boolean method2511() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 14)
    public final void method2512(float arg0) {
        if ((this.field6242 + 3) >= this.field6245.length) {
            this.method2516();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6245[this.field6242++] = (byte) (var2 >> 24);
        this.field6245[this.field6242++] = (byte) (var2 >> 16);
        this.field6245[this.field6242++] = (byte) (var2 >> 8);
        this.field6245[this.field6242++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 32)
    public final void method2513(int arg0) {
        if (this.field6242 >= this.field6245.length) {
            this.method2516();
        }
        this.field6245[this.field6242++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I", line = 46)
    public final int method2514() {
        return this.field6243 + this.field6242;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 53)
    public final void method2515(float arg0) {
        if (this.field6245.length <= this.field6242 + 3) {
            this.method2516();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6245[this.field6242++] = (byte) var2;
        this.field6245[this.field6242++] = (byte) (var2 >> 8);
        this.field6245[this.field6242++] = (byte) (var2 >> 16);
        this.field6245[this.field6242++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V", line = 69)
    public final void method2516() {
        if (this.field6242 > 0) {
            this.field6244.method2509(this.field6245, this.field6243, this.field6242);
            this.field6243 += this.field6242;
            this.field6242 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 81)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6244 = arg0;
        this.field6245 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 91)
    public final void method2517(int arg0) {
        this.method2516();
        this.field6243 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 99)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6239 >= 4096 ? 4096 : arg0.field6239);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
