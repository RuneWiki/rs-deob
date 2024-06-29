package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field9399;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9396;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9398;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field9400;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9397;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 5)
    public final void method3858(int arg0) {
        if (this.field9400 + 1 >= this.field9399.length) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) arg0;
        this.field9399[this.field9400++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 16)
    public final void method3859(int arg0) {
        this.method3872();
        this.field9396 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 24)
    public final void method3860(int arg0) {
        if (this.field9400 + 3 >= this.field9399.length) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) (arg0 >> 16);
        this.field9399[this.field9400++] = (byte) (arg0 >> 8);
        this.field9399[this.field9400++] = (byte) arg0;
        this.field9399[this.field9400++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 38)
    public final void method3861(int arg0) {
        if (this.field9400 + 1 >= this.field9399.length) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) (arg0 >> 8);
        this.field9399[this.field9400++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 51)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 54)
    public final void method3862(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9399.length <= this.field9400 + 3) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) arg2;
        this.field9399[this.field9400++] = (byte) arg1;
        this.field9399[this.field9400++] = (byte) arg0;
        this.field9399[this.field9400++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 68)
    public final void method3863(float arg0) {
        if (this.field9399.length <= (this.field9400 + 3)) {
            this.method3872();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9399[this.field9400++] = (byte) (var2 >> 24);
        this.field9399[this.field9400++] = (byte) (var2 >> 16);
        this.field9399[this.field9400++] = (byte) (var2 >> 8);
        this.field9399[this.field9400++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 84)
    public final void method3864(float arg0) {
        if (this.field9400 + 3 >= this.field9399.length) {
            this.method3872();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9399[this.field9400++] = (byte) var2;
        this.field9399[this.field9400++] = (byte) (var2 >> 8);
        this.field9399[this.field9400++] = (byte) (var2 >> 16);
        this.field9399[this.field9400++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 100)
    public final void method3865(int arg0) {
        if ((this.field9400 + 3) >= this.field9399.length) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) arg0;
        this.field9399[this.field9400++] = (byte) (arg0 >> 8);
        this.field9399[this.field9400++] = (byte) (arg0 >> 16);
        this.field9399[this.field9400++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 114)
    public final void method3866(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9399.length <= this.field9400 + 3) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) arg0;
        this.field9399[this.field9400++] = (byte) arg1;
        this.field9399[this.field9400++] = (byte) arg2;
        this.field9399[this.field9400++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 129)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3867(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 140)
    private final void method3867(Buffer arg0, int arg1, int arg2) {
        this.method3872();
        this.field9398 = arg1 + arg2;
        this.field9397 = arg0;
        this.field9396 = arg1;
        if (this.field9398 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 154)
    public final int method3868() {
        return this.field9396 + this.field9400;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 162)
    public static final boolean method3869() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 169)
    public final void method3870(Buffer arg0) {
        this.method3867(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 178)
    public final void method3871(int arg0) {
        if (this.field9400 >= this.field9399.length) {
            this.method3872();
        }
        this.field9399[this.field9400++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 188)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 190)
    private Stream(int arg0) {
        this.field9399 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V", line = 198)
    public final void method3872() {
        if (this.field9400 <= 0) {
            return;
        }
        if (this.field9398 < this.field9400 + this.field9396) {
            throw new RuntimeException();
        }
        this.field9397.method2918(this.field9399, 0, this.field9396, this.field9400);
        this.field9396 += this.field9400;
        this.field9400 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
