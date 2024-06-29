package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "[B")
    private byte[] field6076;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6074;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6075;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field6077;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I")
    public final int method2482() {
        return this.field6077 + this.field6075;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z")
    public static final boolean method2483() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V")
    public final void method2484() {
        if (this.field6077 > 0) {
            this.field6074.method2480(this.field6076, this.field6075, this.field6077);
            this.field6075 += this.field6077;
            this.field6077 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6071 < 4096 ? arg0.field6071 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2485(float arg0) {
        if (this.field6077 + 3 >= this.field6076.length) {
            this.method2484();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6076[this.field6077++] = (byte) var2;
        this.field6076[this.field6077++] = (byte) (var2 >> 8);
        this.field6076[this.field6077++] = (byte) (var2 >> 16);
        this.field6076[this.field6077++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2486(int arg0) {
        if (this.field6077 >= this.field6076.length) {
            this.method2484();
        }
        this.field6076[this.field6077++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2487(int arg0) {
        this.method2484();
        this.field6075 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2488(float arg0) {
        if ((this.field6077 + 3) >= this.field6076.length) {
            this.method2484();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6076[this.field6077++] = (byte) (var2 >> 24);
        this.field6076[this.field6077++] = (byte) (var2 >> 16);
        this.field6076[this.field6077++] = (byte) (var2 >> 8);
        this.field6076[this.field6077++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6076 = new byte[arg1];
        this.field6074 = arg0;
    }
}
