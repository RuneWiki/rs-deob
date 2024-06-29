package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "[B")
    private byte[] field8670;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8666;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8667;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8668;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8669;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 4)
    public final void method3432(int arg0) {
        this.method3434();
        this.field8668 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 12)
    public final void method3433(int arg0) {
        if (this.field8670.length <= this.field8666 + 3) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) arg0;
        this.field8670[this.field8666++] = (byte) (arg0 >> 8);
        this.field8670[this.field8666++] = (byte) (arg0 >> 16);
        this.field8670[this.field8666++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 25)
    public final void method3434() {
        if (this.field8666 <= 0) {
            return;
        }
        if ((this.field8668 + this.field8666) > this.field8667) {
            throw new RuntimeException();
        }
        this.field8669.method2446(this.field8670, 0, this.field8668, this.field8666);
        this.field8668 += this.field8666;
        this.field8666 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 42)
    public final void method3435(int arg0) {
        if (this.field8670.length <= this.field8666 + 1) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) (arg0 >> 8);
        this.field8670[this.field8666++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 53)
    public final int method3436() {
        return this.field8668 + this.field8666;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 60)
    public final void method3437(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8670.length <= (this.field8666 + 3)) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) arg0;
        this.field8670[this.field8666++] = (byte) arg1;
        this.field8670[this.field8666++] = (byte) arg2;
        this.field8670[this.field8666++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 75)
    public final void method3438(float arg0) {
        if ((this.field8666 + 3) >= this.field8670.length) {
            this.method3434();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8670[this.field8666++] = (byte) (var2 >> 24);
        this.field8670[this.field8666++] = (byte) (var2 >> 16);
        this.field8670[this.field8666++] = (byte) (var2 >> 8);
        this.field8670[this.field8666++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 91)
    public final void method3439(int arg0) {
        if (this.field8670.length <= this.field8666 + 1) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) arg0;
        this.field8670[this.field8666++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 103)
    public static final boolean method3440() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 111)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3441(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 122)
    private final void method3441(Buffer arg0, int arg1, int arg2) {
        this.method3434();
        this.field8669 = arg0;
        this.field8667 = arg1 + arg2;
        this.field8668 = arg1;
        if (this.field8667 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 135)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 138)
    public final void method3442(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8670.length <= (this.field8666 + 3)) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) arg2;
        this.field8670[this.field8666++] = (byte) arg1;
        this.field8670[this.field8666++] = (byte) arg0;
        this.field8670[this.field8666++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 154)
    public final void method3443(int arg0) {
        if (this.field8670.length <= this.field8666 + 3) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) (arg0 >> 16);
        this.field8670[this.field8666++] = (byte) (arg0 >> 8);
        this.field8670[this.field8666++] = (byte) arg0;
        this.field8670[this.field8666++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 168)
    public final void method3444(float arg0) {
        if (this.field8670.length <= this.field8666 + 3) {
            this.method3434();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8670[this.field8666++] = (byte) var2;
        this.field8670[this.field8666++] = (byte) (var2 >> 8);
        this.field8670[this.field8666++] = (byte) (var2 >> 16);
        this.field8670[this.field8666++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 183)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 186)
    public final void method3445(int arg0) {
        if (this.field8670.length <= this.field8666) {
            this.method3434();
        }
        this.field8670[this.field8666++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 196)
    public final void method3446(Buffer arg0) {
        this.method3441(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 203)
    private Stream(int arg0) {
        this.field8670 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
