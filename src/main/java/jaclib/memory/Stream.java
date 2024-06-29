package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field9335;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9334;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9336;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field9337;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9333;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 4)
    public final void method3781(float arg0) {
        if (this.field9334 + 3 >= this.field9335.length) {
            this.method3795();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9335[this.field9334++] = (byte) var2;
        this.field9335[this.field9334++] = (byte) (var2 >> 8);
        this.field9335[this.field9334++] = (byte) (var2 >> 16);
        this.field9335[this.field9334++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 22)
    public final void method3782(int arg0) {
        if (this.field9334 + 3 >= this.field9335.length) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) (arg0 >> 16);
        this.field9335[this.field9334++] = (byte) (arg0 >> 8);
        this.field9335[this.field9334++] = (byte) arg0;
        this.field9335[this.field9334++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 37)
    public final void method3783(int arg0) {
        this.method3795();
        this.field9337 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 45)
    public final void method3784(float arg0) {
        if ((this.field9334 + 3) >= this.field9335.length) {
            this.method3795();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9335[this.field9334++] = (byte) (var2 >> 24);
        this.field9335[this.field9334++] = (byte) (var2 >> 16);
        this.field9335[this.field9334++] = (byte) (var2 >> 8);
        this.field9335[this.field9334++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 60)
    public final void method3785(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9335.length <= this.field9334 + 3) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) arg2;
        this.field9335[this.field9334++] = (byte) arg1;
        this.field9335[this.field9334++] = (byte) arg0;
        this.field9335[this.field9334++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 73)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3790(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z", line = 82)
    public static final boolean method3786() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 89)
    public final int method3787() {
        return this.field9337 + this.field9334;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 97)
    public final void method3788(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9334 + 3 >= this.field9335.length) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) arg0;
        this.field9335[this.field9334++] = (byte) arg1;
        this.field9335[this.field9334++] = (byte) arg2;
        this.field9335[this.field9334++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 112)
    public final void method3789(Buffer arg0) {
        this.method3790(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 120)
    private final void method3790(Buffer arg0, int arg1, int arg2) {
        this.method3795();
        this.field9337 = arg1;
        this.field9336 = arg1 + arg2;
        this.field9333 = arg0;
        if (this.field9336 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 134)
    public final void method3791(int arg0) {
        if (this.field9335.length <= this.field9334 + 1) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) (arg0 >> 8);
        this.field9335[this.field9334++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 147)
    public final void method3792(int arg0) {
        if (this.field9334 + 1 >= this.field9335.length) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) arg0;
        this.field9335[this.field9334++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 158)
    public final void method3793(int arg0) {
        if (this.field9334 >= this.field9335.length) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 168)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 171)
    public final void method3794(int arg0) {
        if (this.field9334 + 3 >= this.field9335.length) {
            this.method3795();
        }
        this.field9335[this.field9334++] = (byte) arg0;
        this.field9335[this.field9334++] = (byte) (arg0 >> 8);
        this.field9335[this.field9334++] = (byte) (arg0 >> 16);
        this.field9335[this.field9334++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V", line = 185)
    public final void method3795() {
        if (this.field9334 <= 0) {
            return;
        }
        if ((this.field9337 + this.field9334) > this.field9336) {
            throw new RuntimeException();
        }
        this.field9333.method2739(this.field9335, 0, this.field9337, this.field9334);
        this.field9337 += this.field9334;
        this.field9334 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 203)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 206)
    private Stream(int arg0) {
        this.field9335 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
