package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7052;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
    private byte[] field7053;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field7051;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field7054;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2852(int arg0) {
        if (this.field7053.length <= this.field7051) {
            this.method2855();
        }
        this.field7053[this.field7051++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z")
    public static final boolean method2853() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I")
    public final int method2854() {
        return this.field7054 + this.field7051;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V")
    public final void method2855() {
        if (this.field7051 > 0) {
            this.field7052.method2845(this.field7053, this.field7054, this.field7051);
            this.field7054 += this.field7051;
            this.field7051 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2856(int arg0) {
        this.method2855();
        this.field7054 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field7047 >= 4096 ? 4096 : arg0.field7047);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2857(float arg0) {
        if (this.field7051 + 3 >= this.field7053.length) {
            this.method2855();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7053[this.field7051++] = (byte) (var2 >> 24);
        this.field7053[this.field7051++] = (byte) (var2 >> 16);
        this.field7053[this.field7051++] = (byte) (var2 >> 8);
        this.field7053[this.field7051++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2858(float arg0) {
        if (this.field7051 + 3 >= this.field7053.length) {
            this.method2855();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7053[this.field7051++] = (byte) var2;
        this.field7053[this.field7051++] = (byte) (var2 >> 8);
        this.field7053[this.field7051++] = (byte) (var2 >> 16);
        this.field7053[this.field7051++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field7052 = arg0;
        this.field7053 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
