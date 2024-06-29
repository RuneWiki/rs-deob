package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field9340;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9341;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9343;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field9344;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9342;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3732(int arg0) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
        this.field9340[this.field9344++] = (byte) (arg0 >> 16);
        this.field9340[this.field9344++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3733(float arg0) {
        if ((this.field9344 + 3) >= this.field9340.length) {
            this.method3734();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9340[this.field9344++] = (byte) (var2 >> 24);
        this.field9340[this.field9344++] = (byte) (var2 >> 16);
        this.field9340[this.field9344++] = (byte) (var2 >> 8);
        this.field9340[this.field9344++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3734() {
        if (this.field9344 <= 0) {
            return;
        }
        if (this.field9343 < (this.field9344 + this.field9341)) {
            throw new RuntimeException();
        }
        this.field9342.method2766(this.field9340, 0, this.field9341, this.field9344);
        this.field9341 += this.field9344;
        this.field9344 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3735(int arg0) {
        if (this.field9340.length <= (this.field9344 + 1)) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
        this.field9340[this.field9344++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3736(int arg0) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) (arg0 >> 16);
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3737(int arg0) {
        if (this.field9344 + 1 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3738(int arg0) {
        this.method3734();
        this.field9341 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3739() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3740(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) arg1;
        this.field9340[this.field9344++] = (byte) arg2;
        this.field9340[this.field9344++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3741(float arg0) {
        if (this.field9340.length <= this.field9344 + 3) {
            this.method3734();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9340[this.field9344++] = (byte) var2;
        this.field9340[this.field9344++] = (byte) (var2 >> 8);
        this.field9340[this.field9344++] = (byte) (var2 >> 16);
        this.field9340[this.field9344++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3742(Buffer arg0, int arg1, int arg2) {
        this.method3734();
        this.field9343 = arg1 + arg2;
        this.field9342 = arg0;
        this.field9341 = arg1;
        if (this.field9343 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3743(Buffer arg0) {
        this.method3742(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3744(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg2;
        this.field9340[this.field9344++] = (byte) arg1;
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3745(int arg0) {
        if (this.field9340.length <= this.field9344) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3742(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3746() {
        return this.field9344 + this.field9341;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9340 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }
}
