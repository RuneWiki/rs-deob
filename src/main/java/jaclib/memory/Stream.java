package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8523;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8521;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8524;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8525;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8522;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method3442() {
        return this.field8525 + this.field8524;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3443(Buffer arg0) {
        this.method3450(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3444(int arg0) {
        if ((this.field8525 + 3) >= this.field8523.length) {
            this.method3448();
        }
        this.field8523[this.field8525++] = (byte) (arg0 >> 16);
        this.field8523[this.field8525++] = (byte) (arg0 >> 8);
        this.field8523[this.field8525++] = (byte) arg0;
        this.field8523[this.field8525++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3450(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3445(int arg0) {
        if (this.field8523.length <= this.field8525) {
            this.method3448();
        }
        this.field8523[this.field8525++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3446(float arg0) {
        if (this.field8525 + 3 >= this.field8523.length) {
            this.method3448();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8523[this.field8525++] = (byte) (var2 >> 24);
        this.field8523[this.field8525++] = (byte) (var2 >> 16);
        this.field8523[this.field8525++] = (byte) (var2 >> 8);
        this.field8523[this.field8525++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3447(int arg0) {
        if (this.field8525 + 1 >= this.field8523.length) {
            this.method3448();
        }
        this.field8523[this.field8525++] = (byte) (arg0 >> 8);
        this.field8523[this.field8525++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
    public final void method3448() {
        if (this.field8525 <= 0) {
            return;
        }
        if (this.field8521 < (this.field8524 + this.field8525)) {
            throw new RuntimeException();
        }
        this.field8522.method2438(this.field8523, 0, this.field8524, this.field8525);
        this.field8524 += this.field8525;
        this.field8525 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3449(int arg0) {
        this.method3448();
        this.field8524 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3450(Buffer arg0, int arg1, int arg2) {
        this.method3448();
        this.field8524 = arg1;
        this.field8522 = arg0;
        this.field8521 = arg1 + arg2;
        if (this.field8521 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3451(int arg0) {
        if (this.field8523.length <= (this.field8525 + 3)) {
            this.method3448();
        }
        this.field8523[this.field8525++] = (byte) arg0;
        this.field8523[this.field8525++] = (byte) (arg0 >> 8);
        this.field8523[this.field8525++] = (byte) (arg0 >> 16);
        this.field8523[this.field8525++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3452(int arg0) {
        if (this.field8523.length <= this.field8525 + 1) {
            this.method3448();
        }
        this.field8523[this.field8525++] = (byte) arg0;
        this.field8523[this.field8525++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8523 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3453(float arg0) {
        if (this.field8523.length <= this.field8525 + 3) {
            this.method3448();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8523[this.field8525++] = (byte) var2;
        this.field8523[this.field8525++] = (byte) (var2 >> 8);
        this.field8523[this.field8525++] = (byte) (var2 >> 16);
        this.field8523[this.field8525++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3454() {
        return getLSB(-65536) == -1;
    }
}
