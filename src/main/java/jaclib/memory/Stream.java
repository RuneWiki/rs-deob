package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field3318;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field3319;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field3320;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field3317;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method1518(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field3319 + 3) >= this.field3318.length) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) arg2;
        this.field3318[this.field3319++] = (byte) arg1;
        this.field3318[this.field3319++] = (byte) arg0;
        this.field3318[this.field3319++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method1519() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method1520(float arg0) {
        if (this.field3318.length <= this.field3319 + 3) {
            this.method1523();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field3318[this.field3319++] = (byte) var2;
        this.field3318[this.field3319++] = (byte) (var2 >> 8);
        this.field3318[this.field3319++] = (byte) (var2 >> 16);
        this.field3318[this.field3319++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method1521(Buffer arg0) {
        this.method1532(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method1522() {
        return this.field3320 + this.field3319;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method1523() {
        if (this.field3319 <= 0) {
            return;
        }
        if (this.field3320 + this.field3319 > this.field3316) {
            throw new RuntimeException();
        }
        this.field3317.method1517(this.field3318, 0, this.field3320, this.field3319);
        this.field3320 += this.field3319;
        this.field3319 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method1524(int arg0) {
        if (this.field3318.length <= (this.field3319 + 3)) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) (arg0 >> 16);
        this.field3318[this.field3319++] = (byte) (arg0 >> 8);
        this.field3318[this.field3319++] = (byte) arg0;
        this.field3318[this.field3319++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method1525(int arg0) {
        if (this.field3318.length <= (this.field3319 + 1)) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) arg0;
        this.field3318[this.field3319++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method1526(int arg0) {
        if (this.field3318.length <= this.field3319) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method1527(int arg0) {
        if (this.field3318.length <= this.field3319 + 3) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) arg0;
        this.field3318[this.field3319++] = (byte) (arg0 >> 8);
        this.field3318[this.field3319++] = (byte) (arg0 >> 16);
        this.field3318[this.field3319++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method1528(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3318.length <= this.field3319 + 3) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) arg0;
        this.field3318[this.field3319++] = (byte) arg1;
        this.field3318[this.field3319++] = (byte) arg2;
        this.field3318[this.field3319++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method1529(int arg0) {
        this.method1523();
        this.field3320 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method1530(float arg0) {
        if (this.field3318.length <= (this.field3319 + 3)) {
            this.method1523();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field3318[this.field3319++] = (byte) (var2 >> 24);
        this.field3318[this.field3319++] = (byte) (var2 >> 16);
        this.field3318[this.field3319++] = (byte) (var2 >> 8);
        this.field3318[this.field3319++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field3318 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method1531(int arg0) {
        if ((this.field3319 + 1) >= this.field3318.length) {
            this.method1523();
        }
        this.field3318[this.field3319++] = (byte) (arg0 >> 8);
        this.field3318[this.field3319++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method1532(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method1532(Buffer arg0, int arg1, int arg2) {
        this.method1523();
        this.field3316 = arg1 + arg2;
        this.field3317 = arg0;
        this.field3320 = arg1;
        if (this.field3316 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }
}
