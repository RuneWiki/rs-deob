package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field9102;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9103;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9104;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9106;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3652(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field9105 + 3) >= this.field9102.length) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) arg0;
        this.field9102[this.field9105++] = (byte) arg1;
        this.field9102[this.field9105++] = (byte) arg2;
        this.field9102[this.field9105++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3653(int arg0) {
        if (this.field9102.length <= (this.field9105 + 3)) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) arg0;
        this.field9102[this.field9105++] = (byte) (arg0 >> 8);
        this.field9102[this.field9105++] = (byte) (arg0 >> 16);
        this.field9102[this.field9105++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3654(int arg0) {
        if (this.field9105 + 1 >= this.field9102.length) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) (arg0 >> 8);
        this.field9102[this.field9105++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3655(int arg0) {
        if ((this.field9105 + 1) >= this.field9102.length) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) arg0;
        this.field9102[this.field9105++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3656() {
        if (this.field9105 <= 0) {
            return;
        }
        if (this.field9105 + this.field9103 > this.field9104) {
            throw new RuntimeException();
        }
        this.field9106.method2899(this.field9102, 0, this.field9103, this.field9105);
        this.field9103 += this.field9105;
        this.field9105 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3657(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3657(Buffer arg0, int arg1, int arg2) {
        this.method3656();
        this.field9103 = arg1;
        this.field9104 = arg1 + arg2;
        this.field9106 = arg0;
        if (this.field9104 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3658(float arg0) {
        if (this.field9102.length <= this.field9105 + 3) {
            this.method3656();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9102[this.field9105++] = (byte) var2;
        this.field9102[this.field9105++] = (byte) (var2 >> 8);
        this.field9102[this.field9105++] = (byte) (var2 >> 16);
        this.field9102[this.field9105++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3659(Buffer arg0) {
        this.method3657(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3660(int arg0) {
        this.method3656();
        this.field9103 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3661() {
        return this.field9105 + this.field9103;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3662() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3663(int arg0) {
        if ((this.field9105 + 3) >= this.field9102.length) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) (arg0 >> 16);
        this.field9102[this.field9105++] = (byte) (arg0 >> 8);
        this.field9102[this.field9105++] = (byte) arg0;
        this.field9102[this.field9105++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3664(int arg0) {
        if (this.field9102.length <= this.field9105) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3665(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9102.length <= (this.field9105 + 3)) {
            this.method3656();
        }
        this.field9102[this.field9105++] = (byte) arg2;
        this.field9102[this.field9105++] = (byte) arg1;
        this.field9102[this.field9105++] = (byte) arg0;
        this.field9102[this.field9105++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3666(float arg0) {
        if ((this.field9105 + 3) >= this.field9102.length) {
            this.method3656();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9102[this.field9105++] = (byte) (var2 >> 24);
        this.field9102[this.field9105++] = (byte) (var2 >> 16);
        this.field9102[this.field9105++] = (byte) (var2 >> 8);
        this.field9102[this.field9105++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9102 = new byte[arg0];
    }
}
