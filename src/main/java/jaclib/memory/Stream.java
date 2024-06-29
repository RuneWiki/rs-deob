package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "[B")
    private byte[] field9046;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9043;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9044;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9045;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9042;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3570(int arg0) {
        if (this.field9044 >= this.field9046.length) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3571(int arg0) {
        this.method3576();
        this.field9043 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3572(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9046.length <= (this.field9044 + 3)) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) arg0;
        this.field9046[this.field9044++] = (byte) arg1;
        this.field9046[this.field9044++] = (byte) arg2;
        this.field9046[this.field9044++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3573(int arg0) {
        if (this.field9046.length <= this.field9044 + 3) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) arg0;
        this.field9046[this.field9044++] = (byte) (arg0 >> 8);
        this.field9046[this.field9044++] = (byte) (arg0 >> 16);
        this.field9046[this.field9044++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3574(Buffer arg0, int arg1, int arg2) {
        this.method3576();
        this.field9043 = arg1;
        this.field9042 = arg0;
        this.field9045 = arg1 + arg2;
        if (this.field9045 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3575(int arg0) {
        if (this.field9044 + 1 >= this.field9046.length) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) (arg0 >> 8);
        this.field9046[this.field9044++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3576() {
        if (this.field9044 <= 0) {
            return;
        }
        if (this.field9043 + this.field9044 > this.field9045) {
            throw new RuntimeException();
        }
        this.field9042.method2721(this.field9046, 0, this.field9043, this.field9044);
        this.field9043 += this.field9044;
        this.field9044 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3577() {
        return this.field9044 + this.field9043;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3578(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9046.length <= this.field9044 + 3) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) arg2;
        this.field9046[this.field9044++] = (byte) arg1;
        this.field9046[this.field9044++] = (byte) arg0;
        this.field9046[this.field9044++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3579(Buffer arg0) {
        this.method3574(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3580() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3581(int arg0) {
        if ((this.field9044 + 3) >= this.field9046.length) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) (arg0 >> 16);
        this.field9046[this.field9044++] = (byte) (arg0 >> 8);
        this.field9046[this.field9044++] = (byte) arg0;
        this.field9046[this.field9044++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3574(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3582(float arg0) {
        if (this.field9046.length <= this.field9044 + 3) {
            this.method3576();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9046[this.field9044++] = (byte) (var2 >> 24);
        this.field9046[this.field9044++] = (byte) (var2 >> 16);
        this.field9046[this.field9044++] = (byte) (var2 >> 8);
        this.field9046[this.field9044++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3583(int arg0) {
        if ((this.field9044 + 1) >= this.field9046.length) {
            this.method3576();
        }
        this.field9046[this.field9044++] = (byte) arg0;
        this.field9046[this.field9044++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9046 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3584(float arg0) {
        if ((this.field9044 + 3) >= this.field9046.length) {
            this.method3576();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9046[this.field9044++] = (byte) var2;
        this.field9046[this.field9044++] = (byte) (var2 >> 8);
        this.field9046[this.field9044++] = (byte) (var2 >> 16);
        this.field9046[this.field9044++] = (byte) (var2 >> 24);
    }
}
