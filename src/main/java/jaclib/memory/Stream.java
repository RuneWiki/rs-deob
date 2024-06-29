package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field9662;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9659;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9660;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9661;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9663;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 4)
    public final int method3900() {
        return this.field9660 + this.field9659;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 11)
    public final void method3901() {
        if (this.field9659 <= 0) {
            return;
        }
        if ((this.field9660 + this.field9659) > this.field9661) {
            throw new RuntimeException();
        }
        this.field9663.method2933(this.field9662, 0, this.field9660, this.field9659);
        this.field9660 += this.field9659;
        this.field9659 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 29)
    private final void method3902(Buffer arg0, int arg1, int arg2) {
        this.method3901();
        this.field9661 = arg1 + arg2;
        this.field9660 = arg1;
        this.field9663 = arg0;
        if (this.field9661 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 43)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 46)
    public final void method3903(int arg0) {
        if (this.field9659 + 1 >= this.field9662.length) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) arg0;
        this.field9662[this.field9659++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 57)
    public final void method3904(int arg0) {
        this.method3901();
        this.field9660 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 65)
    public final void method3905(int arg0) {
        if (this.field9662.length <= (this.field9659 + 3)) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) (arg0 >> 16);
        this.field9662[this.field9659++] = (byte) (arg0 >> 8);
        this.field9662[this.field9659++] = (byte) arg0;
        this.field9662[this.field9659++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 80)
    public final void method3906(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9662.length <= (this.field9659 + 3)) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) arg2;
        this.field9662[this.field9659++] = (byte) arg1;
        this.field9662[this.field9659++] = (byte) arg0;
        this.field9662[this.field9659++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 95)
    public final void method3907(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9662.length <= (this.field9659 + 3)) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) arg0;
        this.field9662[this.field9659++] = (byte) arg1;
        this.field9662[this.field9659++] = (byte) arg2;
        this.field9662[this.field9659++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 109)
    public final void method3908(int arg0) {
        if (this.field9659 >= this.field9662.length) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 119)
    public final void method3909(float arg0) {
        if (this.field9659 + 3 >= this.field9662.length) {
            this.method3901();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9662[this.field9659++] = (byte) var2;
        this.field9662[this.field9659++] = (byte) (var2 >> 8);
        this.field9662[this.field9659++] = (byte) (var2 >> 16);
        this.field9662[this.field9659++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 134)
    public static final boolean method3910() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 142)
    public final void method3911(Buffer arg0) {
        this.method3902(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 149)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3902(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 158)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 163)
    public final void method3912(int arg0) {
        if ((this.field9659 + 1) >= this.field9662.length) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) (arg0 >> 8);
        this.field9662[this.field9659++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 175)
    public final void method3913(int arg0) {
        if ((this.field9659 + 3) >= this.field9662.length) {
            this.method3901();
        }
        this.field9662[this.field9659++] = (byte) arg0;
        this.field9662[this.field9659++] = (byte) (arg0 >> 8);
        this.field9662[this.field9659++] = (byte) (arg0 >> 16);
        this.field9662[this.field9659++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 189)
    public final void method3914(float arg0) {
        if (this.field9659 + 3 >= this.field9662.length) {
            this.method3901();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9662[this.field9659++] = (byte) (var2 >> 24);
        this.field9662[this.field9659++] = (byte) (var2 >> 16);
        this.field9662[this.field9659++] = (byte) (var2 >> 8);
        this.field9662[this.field9659++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 207)
    private Stream(int arg0) {
        this.field9662 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
