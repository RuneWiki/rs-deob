package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8540;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8538;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8539;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8542;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8541;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3415(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8540.length <= this.field8539 + 3) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) arg2;
        this.field8540[this.field8539++] = (byte) arg1;
        this.field8540[this.field8539++] = (byte) arg0;
        this.field8540[this.field8539++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3416(int arg0) {
        if ((this.field8539 + 1) >= this.field8540.length) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) arg0;
        this.field8540[this.field8539++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3417(int arg0) {
        this.method3426();
        this.field8542 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method3418() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3419(int arg0) {
        if (this.field8540.length <= this.field8539) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3420(Buffer arg0) {
        this.method3422(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3421(float arg0) {
        if (this.field8539 + 3 >= this.field8540.length) {
            this.method3426();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8540[this.field8539++] = (byte) (var2 >> 24);
        this.field8540[this.field8539++] = (byte) (var2 >> 16);
        this.field8540[this.field8539++] = (byte) (var2 >> 8);
        this.field8540[this.field8539++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3422(Buffer arg0, int arg1, int arg2) {
        this.method3426();
        this.field8542 = arg1;
        this.field8538 = arg1 + arg2;
        this.field8541 = arg0;
        if (this.field8538 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3423(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8539 + 3 >= this.field8540.length) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) arg0;
        this.field8540[this.field8539++] = (byte) arg1;
        this.field8540[this.field8539++] = (byte) arg2;
        this.field8540[this.field8539++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3424(int arg0) {
        if ((this.field8539 + 3) >= this.field8540.length) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) (arg0 >> 16);
        this.field8540[this.field8539++] = (byte) (arg0 >> 8);
        this.field8540[this.field8539++] = (byte) arg0;
        this.field8540[this.field8539++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3425(int arg0) {
        if (this.field8540.length <= this.field8539 + 1) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) (arg0 >> 8);
        this.field8540[this.field8539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
    public final void method3426() {
        if (this.field8539 <= 0) {
            return;
        }
        if ((this.field8542 + this.field8539) > this.field8538) {
            throw new RuntimeException();
        }
        this.field8541.method2562(this.field8540, 0, this.field8542, this.field8539);
        this.field8542 += this.field8539;
        this.field8539 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3422(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3427(int arg0) {
        if (this.field8540.length <= (this.field8539 + 3)) {
            this.method3426();
        }
        this.field8540[this.field8539++] = (byte) arg0;
        this.field8540[this.field8539++] = (byte) (arg0 >> 8);
        this.field8540[this.field8539++] = (byte) (arg0 >> 16);
        this.field8540[this.field8539++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8540 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3428(float arg0) {
        if ((this.field8539 + 3) >= this.field8540.length) {
            this.method3426();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8540[this.field8539++] = (byte) var2;
        this.field8540[this.field8539++] = (byte) (var2 >> 8);
        this.field8540[this.field8539++] = (byte) (var2 >> 16);
        this.field8540[this.field8539++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3429() {
        return this.field8542 + this.field8539;
    }
}
