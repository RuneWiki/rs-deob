package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field9427;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9426;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9428;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9429;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9430;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3784(int arg0) {
        if ((this.field9429 + 3) >= this.field9427.length) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) (arg0 >> 16);
        this.field9427[this.field9429++] = (byte) (arg0 >> 8);
        this.field9427[this.field9429++] = (byte) arg0;
        this.field9427[this.field9429++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3785(int arg0) {
        if (this.field9429 + 1 >= this.field9427.length) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) (arg0 >> 8);
        this.field9427[this.field9429++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3786(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9429 + 3 >= this.field9427.length) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) arg0;
        this.field9427[this.field9429++] = (byte) arg1;
        this.field9427[this.field9429++] = (byte) arg2;
        this.field9427[this.field9429++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3787(Buffer arg0) {
        this.method3791(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3788(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9427.length <= this.field9429 + 3) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) arg2;
        this.field9427[this.field9429++] = (byte) arg1;
        this.field9427[this.field9429++] = (byte) arg0;
        this.field9427[this.field9429++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3789(int arg0) {
        if ((this.field9429 + 3) >= this.field9427.length) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) arg0;
        this.field9427[this.field9429++] = (byte) (arg0 >> 8);
        this.field9427[this.field9429++] = (byte) (arg0 >> 16);
        this.field9427[this.field9429++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method3790() {
        return this.field9428 + this.field9429;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3791(Buffer arg0, int arg1, int arg2) {
        this.method3793();
        this.field9426 = arg1 + arg2;
        this.field9430 = arg0;
        this.field9428 = arg1;
        if (this.field9426 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3792(int arg0) {
        if (this.field9429 >= this.field9427.length) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
    public final void method3793() {
        if (this.field9429 <= 0) {
            return;
        }
        if (this.field9429 + this.field9428 > this.field9426) {
            throw new RuntimeException();
        }
        this.field9430.method2885(this.field9427, 0, this.field9428, this.field9429);
        this.field9428 += this.field9429;
        this.field9429 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3794(float arg0) {
        if (this.field9427.length <= (this.field9429 + 3)) {
            this.method3793();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9427[this.field9429++] = (byte) var2;
        this.field9427[this.field9429++] = (byte) (var2 >> 8);
        this.field9427[this.field9429++] = (byte) (var2 >> 16);
        this.field9427[this.field9429++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3795(int arg0) {
        if (this.field9427.length <= this.field9429 + 1) {
            this.method3793();
        }
        this.field9427[this.field9429++] = (byte) arg0;
        this.field9427[this.field9429++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3796(float arg0) {
        if (this.field9427.length <= (this.field9429 + 3)) {
            this.method3793();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9427[this.field9429++] = (byte) (var2 >> 24);
        this.field9427[this.field9429++] = (byte) (var2 >> 16);
        this.field9427[this.field9429++] = (byte) (var2 >> 8);
        this.field9427[this.field9429++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3797(int arg0) {
        this.method3793();
        this.field9428 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3798() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9427 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3791(arg0, arg1, arg2);
    }
}
