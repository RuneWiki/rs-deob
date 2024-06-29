package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field10184;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field10183;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field10185;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field10186;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field10182;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method5099(int arg0) {
        if (this.field10184.length <= this.field10183 + 3) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) (arg0 >> 16);
        this.field10184[this.field10183++] = (byte) (arg0 >> 8);
        this.field10184[this.field10183++] = (byte) arg0;
        this.field10184[this.field10183++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method5107(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method5100(int arg0) {
        if (this.field10183 + 1 >= this.field10184.length) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) (arg0 >> 8);
        this.field10184[this.field10183++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method5101(int arg0) {
        if (this.field10183 + 3 >= this.field10184.length) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) arg0;
        this.field10184[this.field10183++] = (byte) (arg0 >> 8);
        this.field10184[this.field10183++] = (byte) (arg0 >> 16);
        this.field10184[this.field10183++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method5102() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method5103() {
        if (this.field10183 <= 0) {
            return;
        }
        if (this.field10185 < (this.field10186 + this.field10183)) {
            throw new RuntimeException();
        }
        this.field10182.method3847(this.field10184, 0, this.field10186, this.field10183);
        this.field10186 += this.field10183;
        this.field10183 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method5104() {
        return this.field10186 + this.field10183;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method5105(float arg0) {
        if ((this.field10183 + 3) >= this.field10184.length) {
            this.method5103();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field10184[this.field10183++] = (byte) var2;
        this.field10184[this.field10183++] = (byte) (var2 >> 8);
        this.field10184[this.field10183++] = (byte) (var2 >> 16);
        this.field10184[this.field10183++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method5106(int arg0) {
        if (this.field10183 >= this.field10184.length) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method5107(Buffer arg0, int arg1, int arg2) {
        this.method5103();
        this.field10182 = arg0;
        this.field10185 = arg1 + arg2;
        this.field10186 = arg1;
        if (this.field10185 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method5108(int arg0) {
        if (this.field10184.length <= this.field10183 + 1) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) arg0;
        this.field10184[this.field10183++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method5109(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10184.length <= (this.field10183 + 3)) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) arg0;
        this.field10184[this.field10183++] = (byte) arg1;
        this.field10184[this.field10183++] = (byte) arg2;
        this.field10184[this.field10183++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method5110(int arg0) {
        this.method5103();
        this.field10186 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method5111(Buffer arg0) {
        this.method5107(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method5112(float arg0) {
        if (this.field10183 + 3 >= this.field10184.length) {
            this.method5103();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field10184[this.field10183++] = (byte) (var2 >> 24);
        this.field10184[this.field10183++] = (byte) (var2 >> 16);
        this.field10184[this.field10183++] = (byte) (var2 >> 8);
        this.field10184[this.field10183++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method5113(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10184.length <= this.field10183 + 3) {
            this.method5103();
        }
        this.field10184[this.field10183++] = (byte) arg2;
        this.field10184[this.field10183++] = (byte) arg1;
        this.field10184[this.field10183++] = (byte) arg0;
        this.field10184[this.field10183++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field10184 = new byte[arg0];
    }
}
