package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field9522;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9521;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9524;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field9525;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9523;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 6)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 9)
    public final int method3809() {
        return this.field9521 + this.field9524;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 17)
    public final void method3810(float arg0) {
        if (this.field9522.length <= this.field9524 + 3) {
            this.method3821();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9522[this.field9524++] = (byte) (var2 >> 24);
        this.field9522[this.field9524++] = (byte) (var2 >> 16);
        this.field9522[this.field9524++] = (byte) (var2 >> 8);
        this.field9522[this.field9524++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 33)
    public final void method3811(int arg0) {
        this.method3821();
        this.field9521 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 41)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 44)
    public final void method3812(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9522.length <= (this.field9524 + 3)) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) arg2;
        this.field9522[this.field9524++] = (byte) arg1;
        this.field9522[this.field9524++] = (byte) arg0;
        this.field9522[this.field9524++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 59)
    public final void method3813(Buffer arg0) {
        this.method3822(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 68)
    public final void method3814(int arg0) {
        if (this.field9522.length <= this.field9524) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 78)
    public final void method3815(float arg0) {
        if (this.field9522.length <= (this.field9524 + 3)) {
            this.method3821();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9522[this.field9524++] = (byte) var2;
        this.field9522[this.field9524++] = (byte) (var2 >> 8);
        this.field9522[this.field9524++] = (byte) (var2 >> 16);
        this.field9522[this.field9524++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 94)
    public final void method3816(int arg0) {
        if (this.field9522.length <= (this.field9524 + 1)) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) arg0;
        this.field9522[this.field9524++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 106)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3822(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 114)
    public final void method3817(int arg0) {
        if (this.field9524 + 3 >= this.field9522.length) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) arg0;
        this.field9522[this.field9524++] = (byte) (arg0 >> 8);
        this.field9522[this.field9524++] = (byte) (arg0 >> 16);
        this.field9522[this.field9524++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 129)
    public final void method3818(int arg0) {
        if (this.field9524 + 3 >= this.field9522.length) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) (arg0 >> 16);
        this.field9522[this.field9524++] = (byte) (arg0 >> 8);
        this.field9522[this.field9524++] = (byte) arg0;
        this.field9522[this.field9524++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 142)
    public final void method3819(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9522.length <= (this.field9524 + 3)) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) arg0;
        this.field9522[this.field9524++] = (byte) arg1;
        this.field9522[this.field9524++] = (byte) arg2;
        this.field9522[this.field9524++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 157)
    public final void method3820(int arg0) {
        if (this.field9524 + 1 >= this.field9522.length) {
            this.method3821();
        }
        this.field9522[this.field9524++] = (byte) (arg0 >> 8);
        this.field9522[this.field9524++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 168)
    public final void method3821() {
        if (this.field9524 <= 0) {
            return;
        }
        if (this.field9525 < (this.field9521 + this.field9524)) {
            throw new RuntimeException();
        }
        this.field9523.method2917(this.field9522, 0, this.field9521, this.field9524);
        this.field9521 += this.field9524;
        this.field9524 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 186)
    private final void method3822(Buffer arg0, int arg1, int arg2) {
        this.method3821();
        this.field9521 = arg1;
        this.field9525 = arg1 + arg2;
        this.field9523 = arg0;
        if (this.field9525 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 199)
    private Stream(int arg0) {
        this.field9522 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 207)
    public static final boolean method3823() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
