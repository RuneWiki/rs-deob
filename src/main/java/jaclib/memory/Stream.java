package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field9891;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9889;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9890;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9892;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9893;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3978(int arg0) {
        if (this.field9889 >= this.field9891.length) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3979(float arg0) {
        if (this.field9891.length <= this.field9889 + 3) {
            this.method3992();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9891[this.field9889++] = (byte) (var2 >> 24);
        this.field9891[this.field9889++] = (byte) (var2 >> 16);
        this.field9891[this.field9889++] = (byte) (var2 >> 8);
        this.field9891[this.field9889++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3980(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9891.length <= this.field9889 + 3) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) arg2;
        this.field9891[this.field9889++] = (byte) arg1;
        this.field9891[this.field9889++] = (byte) arg0;
        this.field9891[this.field9889++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3981(float arg0) {
        if (this.field9891.length <= (this.field9889 + 3)) {
            this.method3992();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9891[this.field9889++] = (byte) var2;
        this.field9891[this.field9889++] = (byte) (var2 >> 8);
        this.field9891[this.field9889++] = (byte) (var2 >> 16);
        this.field9891[this.field9889++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3986(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3982(int arg0) {
        this.method3992();
        this.field9892 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3983(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9891.length <= this.field9889 + 3) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) arg0;
        this.field9891[this.field9889++] = (byte) arg1;
        this.field9891[this.field9889++] = (byte) arg2;
        this.field9891[this.field9889++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method3984() {
        return this.field9892 + this.field9889;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3985() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3986(Buffer arg0, int arg1, int arg2) {
        this.method3992();
        this.field9892 = arg1;
        this.field9893 = arg0;
        this.field9890 = arg1 + arg2;
        if (this.field9890 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3987(int arg0) {
        if (this.field9889 + 3 >= this.field9891.length) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) (arg0 >> 16);
        this.field9891[this.field9889++] = (byte) (arg0 >> 8);
        this.field9891[this.field9889++] = (byte) arg0;
        this.field9891[this.field9889++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3988(int arg0) {
        if ((this.field9889 + 1) >= this.field9891.length) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) arg0;
        this.field9891[this.field9889++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3989(int arg0) {
        if (this.field9889 + 3 >= this.field9891.length) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) arg0;
        this.field9891[this.field9889++] = (byte) (arg0 >> 8);
        this.field9891[this.field9889++] = (byte) (arg0 >> 16);
        this.field9891[this.field9889++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3990(Buffer arg0) {
        this.method3986(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3991(int arg0) {
        if (this.field9891.length <= this.field9889 + 1) {
            this.method3992();
        }
        this.field9891[this.field9889++] = (byte) (arg0 >> 8);
        this.field9891[this.field9889++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method3992() {
        if (this.field9889 <= 0) {
            return;
        }
        if (this.field9890 < (this.field9892 + this.field9889)) {
            throw new RuntimeException();
        }
        this.field9893.method3069(this.field9891, 0, this.field9892, this.field9889);
        this.field9892 += this.field9889;
        this.field9889 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9891 = new byte[arg0];
    }
}
