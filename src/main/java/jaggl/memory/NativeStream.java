package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field222;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "[B")
    private byte[] field223;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z")
    public static final boolean method114() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field219 >= 4096 ? 4096 : arg0.field219);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V")
    public final void method115() {
        if (this.field224 > 0) {
            this.field222.method110(this.field223, this.field225, this.field224);
            this.field225 += this.field224;
            this.field224 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method116(float arg0) {
        if (this.field223.length <= (this.field224 + 3)) {
            this.method115();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field223[this.field224++] = (byte) (var2 >> 24);
        this.field223[this.field224++] = (byte) (var2 >> 16);
        this.field223[this.field224++] = (byte) (var2 >> 8);
        this.field223[this.field224++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method117(int arg0) {
        this.method115();
        this.field225 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method118(float arg0) {
        if (this.field223.length <= (this.field224 + 3)) {
            this.method115();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field223[this.field224++] = (byte) var2;
        this.field223[this.field224++] = (byte) (var2 >> 8);
        this.field223[this.field224++] = (byte) (var2 >> 16);
        this.field223[this.field224++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field222 = arg0;
        this.field223 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (this.field224 >= this.field223.length) {
            this.method115();
        }
        this.field223[this.field224++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I")
    public final int method120() {
        return this.field225 + this.field224;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
