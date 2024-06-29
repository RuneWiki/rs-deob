package jaggl.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/memory/NativeStream")
public class NativeStream {

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "d", descriptor = "[B")
    private byte[] field6940;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6938;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "I")
    private int field6937;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "I")
    private int field6939;

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "()I", line = 5)
    public final int method2848() {
        return this.field6937 + this.field6939;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(F)V", line = 12)
    public final void method2849(float arg0) {
        if ((this.field6939 + 3) >= this.field6940.length) {
            this.method2854();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6940[this.field6939++] = (byte) (var2 >> 24);
        this.field6940[this.field6939++] = (byte) (var2 >> 16);
        this.field6940[this.field6939++] = (byte) (var2 >> 8);
        this.field6940[this.field6939++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(F)V", line = 28)
    public final void method2850(float arg0) {
        if (this.field6940.length <= this.field6939 + 3) {
            this.method2854();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6940[this.field6939++] = (byte) var2;
        this.field6940[this.field6939++] = (byte) (var2 >> 8);
        this.field6940[this.field6939++] = (byte) (var2 >> 16);
        this.field6940[this.field6939++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "a", descriptor = "(I)V", line = 46)
    public final void method2851(int arg0) {
        if (this.field6940.length <= this.field6939) {
            this.method2854();
        }
        this.field6940[this.field6939++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "()Z", line = 56)
    public static final boolean method2852() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "b", descriptor = "(I)V", line = 66)
    public final void method2853(int arg0) {
        this.method2854();
        this.field6937 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "c", descriptor = "()V", line = 75)
    public final void method2854() {
        if (this.field6939 > 0) {
            this.field6938.method2842(this.field6940, this.field6937, this.field6939);
            this.field6937 += this.field6939;
            this.field6939 = 0;
        }
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;)V", line = 88)
    public NativeStream(NativeBuffer arg0) {
        this(arg0, arg0.field6932 < 4096 ? arg0.field6932 : 4096);
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "<init>", descriptor = "(Ljaggl/memory/NativeBuffer;I)V", line = 90)
    private NativeStream(NativeBuffer arg0, int arg1) {
        this.field6940 = new byte[arg1];
        this.field6938 = arg0;
    }

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaggl/memory/NativeStream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
