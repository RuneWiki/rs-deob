package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "[B")
    private byte[] field213;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field212;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()Z", line = 4)
    public static final boolean method96() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 15)
    public final void method97(int arg0) {
        this.method99();
        this.field215 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 23)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field210 >= 4096 ? 4096 : arg0.field210);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 28)
    public final void method98(float arg0) {
        if (this.field213.length <= (this.field214 + 3)) {
            this.method99();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field213[this.field214++] = (byte) (var2 >> 24);
        this.field213[this.field214++] = (byte) (var2 >> 16);
        this.field213[this.field214++] = (byte) (var2 >> 8);
        this.field213[this.field214++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()V", line = 43)
    public final void method99() {
        if (this.field214 > 0) {
            this.field212.method92(this.field213, this.field215, this.field214);
            this.field215 += this.field214;
            this.field214 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()I", line = 59)
    public final int method100() {
        return this.field215 + this.field214;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 68)
    public final void method101(float arg0) {
        if (this.field213.length <= this.field214 + 3) {
            this.method99();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field213[this.field214++] = (byte) var2;
        this.field213[this.field214++] = (byte) (var2 >> 8);
        this.field213[this.field214++] = (byte) (var2 >> 16);
        this.field213[this.field214++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 83)
    public final void method102(int arg0) {
        if (this.field214 >= this.field213.length) {
            this.method99();
        }
        this.field213[this.field214++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 92)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field213 = new byte[arg1];
        this.field212 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
