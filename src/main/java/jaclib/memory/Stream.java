package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8496;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8494;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8497;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8498;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8495;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3469(int arg0) {
        if (this.field8497 + 3 >= this.field8496.length) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) arg0;
        this.field8496[this.field8497++] = (byte) (arg0 >> 8);
        this.field8496[this.field8497++] = (byte) (arg0 >> 16);
        this.field8496[this.field8497++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3470(Buffer arg0, int arg1, int arg2) {
        this.method3479();
        this.field8498 = arg1;
        this.field8495 = arg0;
        this.field8494 = arg1 + arg2;
        if (this.field8494 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method3471() {
        return this.field8498 + this.field8497;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3472(int arg0) {
        if (this.field8496.length <= (this.field8497 + 3)) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) (arg0 >> 16);
        this.field8496[this.field8497++] = (byte) (arg0 >> 8);
        this.field8496[this.field8497++] = (byte) arg0;
        this.field8496[this.field8497++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3473() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3474(int arg0) {
        if (this.field8497 + 1 >= this.field8496.length) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) (arg0 >> 8);
        this.field8496[this.field8497++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3475(int arg0) {
        this.method3479();
        this.field8498 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3470(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3476(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field8497 + 3) >= this.field8496.length) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) arg2;
        this.field8496[this.field8497++] = (byte) arg1;
        this.field8496[this.field8497++] = (byte) arg0;
        this.field8496[this.field8497++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3477(float arg0) {
        if (this.field8496.length <= (this.field8497 + 3)) {
            this.method3479();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8496[this.field8497++] = (byte) var2;
        this.field8496[this.field8497++] = (byte) (var2 >> 8);
        this.field8496[this.field8497++] = (byte) (var2 >> 16);
        this.field8496[this.field8497++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3478(int arg0) {
        if ((this.field8497 + 1) >= this.field8496.length) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) arg0;
        this.field8496[this.field8497++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method3479() {
        if (this.field8497 <= 0) {
            return;
        }
        if (this.field8494 < (this.field8498 + this.field8497)) {
            throw new RuntimeException();
        }
        this.field8495.method2584(this.field8496, 0, this.field8498, this.field8497);
        this.field8498 += this.field8497;
        this.field8497 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3480(float arg0) {
        if (this.field8496.length <= this.field8497 + 3) {
            this.method3479();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8496[this.field8497++] = (byte) (var2 >> 24);
        this.field8496[this.field8497++] = (byte) (var2 >> 16);
        this.field8496[this.field8497++] = (byte) (var2 >> 8);
        this.field8496[this.field8497++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8496 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3481(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field8497 + 3) >= this.field8496.length) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) arg0;
        this.field8496[this.field8497++] = (byte) arg1;
        this.field8496[this.field8497++] = (byte) arg2;
        this.field8496[this.field8497++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3482(int arg0) {
        if (this.field8496.length <= this.field8497) {
            this.method3479();
        }
        this.field8496[this.field8497++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3483(Buffer arg0) {
        this.method3470(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }
}
