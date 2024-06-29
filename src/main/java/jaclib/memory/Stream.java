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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 5)
    public final void method3732(int arg0) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
        this.field9340[this.field9344++] = (byte) (arg0 >> 16);
        this.field9340[this.field9344++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 21)
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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 36)
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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 54)
    public final void method3735(int arg0) {
        if (this.field9340.length <= (this.field9344 + 1)) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
        this.field9340[this.field9344++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 66)
    public final void method3736(int arg0) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) (arg0 >> 16);
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 80)
    public final void method3737(int arg0) {
        if (this.field9344 + 1 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 91)
    public final void method3738(int arg0) {
        this.method3734();
        this.field9341 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 99)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 102)
    public static final boolean method3739() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 109)
    public final void method3740(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) arg1;
        this.field9340[this.field9344++] = (byte) arg2;
        this.field9340[this.field9344++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 122)
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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 138)
    private final void method3742(Buffer arg0, int arg1, int arg2) {
        this.method3734();
        this.field9343 = arg1 + arg2;
        this.field9342 = arg0;
        this.field9341 = arg1;
        if (this.field9343 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 151)
    public final void method3743(Buffer arg0) {
        this.method3742(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 160)
    public final void method3744(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9344 + 3 >= this.field9340.length) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg2;
        this.field9340[this.field9344++] = (byte) arg1;
        this.field9340[this.field9344++] = (byte) arg0;
        this.field9340[this.field9344++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 174)
    public final void method3745(int arg0) {
        if (this.field9340.length <= this.field9344) {
            this.method3734();
        }
        this.field9340[this.field9344++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 186)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3742(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 195)
    public final int method3746() {
        return this.field9344 + this.field9341;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 201)
    private Stream(int arg0) {
        this.field9340 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 209)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
