package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8611;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8610;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8612;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8613;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8609;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 4)
    public final void method3432(int arg0) {
        if ((this.field8612 + 3) >= this.field8611.length) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) (arg0 >> 16);
        this.field8611[this.field8612++] = (byte) (arg0 >> 8);
        this.field8611[this.field8612++] = (byte) arg0;
        this.field8611[this.field8612++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 17)
    public final void method3433(int arg0) {
        if (this.field8611.length <= this.field8612 + 1) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) (arg0 >> 8);
        this.field8611[this.field8612++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 32)
    public final void method3434(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8611.length <= (this.field8612 + 3)) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) arg0;
        this.field8611[this.field8612++] = (byte) arg1;
        this.field8611[this.field8612++] = (byte) arg2;
        this.field8611[this.field8612++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 47)
    public final void method3435(int arg0) {
        this.method3440();
        this.field8610 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 55)
    public final void method3436(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8611.length <= this.field8612 + 3) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) arg2;
        this.field8611[this.field8612++] = (byte) arg1;
        this.field8611[this.field8612++] = (byte) arg0;
        this.field8611[this.field8612++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 70)
    public final void method3437(int arg0) {
        if (this.field8611.length <= this.field8612) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 81)
    public final void method3438(float arg0) {
        if (this.field8611.length <= this.field8612 + 3) {
            this.method3440();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8611[this.field8612++] = (byte) var2;
        this.field8611[this.field8612++] = (byte) (var2 >> 8);
        this.field8611[this.field8612++] = (byte) (var2 >> 16);
        this.field8611[this.field8612++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 96)
    public final void method3439(float arg0) {
        if (this.field8611.length <= this.field8612 + 3) {
            this.method3440();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8611[this.field8612++] = (byte) (var2 >> 24);
        this.field8611[this.field8612++] = (byte) (var2 >> 16);
        this.field8611[this.field8612++] = (byte) (var2 >> 8);
        this.field8611[this.field8612++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 112)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3444(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 120)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 123)
    public final void method3440() {
        if (this.field8612 <= 0) {
            return;
        }
        if (this.field8613 < (this.field8612 + this.field8610)) {
            throw new RuntimeException();
        }
        this.field8609.method2437(this.field8611, 0, this.field8610, this.field8612);
        this.field8610 += this.field8612;
        this.field8612 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 140)
    public final void method3441(Buffer arg0) {
        this.method3444(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 148)
    public final int method3442() {
        return this.field8612 + this.field8610;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 155)
    public final void method3443(int arg0) {
        if (this.field8611.length <= (this.field8612 + 1)) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) arg0;
        this.field8611[this.field8612++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 168)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 172)
    private final void method3444(Buffer arg0, int arg1, int arg2) {
        this.method3440();
        this.field8613 = arg1 + arg2;
        this.field8610 = arg1;
        this.field8609 = arg0;
        if (this.field8613 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 185)
    public static final boolean method3445() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 192)
    public final void method3446(int arg0) {
        if (this.field8611.length <= (this.field8612 + 3)) {
            this.method3440();
        }
        this.field8611[this.field8612++] = (byte) arg0;
        this.field8611[this.field8612++] = (byte) (arg0 >> 8);
        this.field8611[this.field8612++] = (byte) (arg0 >> 16);
        this.field8611[this.field8612++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 205)
    private Stream(int arg0) {
        this.field8611 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
