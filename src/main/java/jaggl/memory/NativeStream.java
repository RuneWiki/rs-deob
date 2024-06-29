package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6253;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "[B")
    private byte[] field6250;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "I")
    private int field6251;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6252;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V")
    public final void method2612(float arg0) {
        if (this.field6251 + 3 >= this.field6250.length) {
            this.method2613();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6250[this.field6251++] = (byte) (var2 >> 24);
        this.field6250[this.field6251++] = (byte) (var2 >> 16);
        this.field6250[this.field6251++] = (byte) (var2 >> 8);
        this.field6250[this.field6251++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()V")
    public final void method2613() {
        if (this.field6251 > 0) {
            this.field6253.method2608(this.field6250, this.field6252, this.field6251);
            this.field6252 += this.field6251;
            this.field6251 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V")
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6249 >= 4096 ? 4096 : arg0.field6249);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V")
    public final void method2614(int arg0) {
        this.method2613();
        this.field6252 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()I")
    public final int method2615() {
        return this.field6252 + this.field6251;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()Z")
    public static final boolean method2616() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V")
    public final void method2617(int arg0) {
        if (this.field6251 >= this.field6250.length) {
            this.method2613();
        }
        this.field6250[this.field6251++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V")
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6253 = arg0;
        this.field6250 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V")
    public final void method2618(float arg0) {
        if (this.field6250.length <= (this.field6251 + 3)) {
            this.method2613();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6250[this.field6251++] = (byte) var2;
        this.field6250[this.field6251++] = (byte) (var2 >> 8);
        this.field6250[this.field6251++] = (byte) (var2 >> 16);
        this.field6250[this.field6251++] = (byte) (var2 >> 24);
    }
}
