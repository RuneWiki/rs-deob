package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field10100;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field10099;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field10101;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field10102;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field10103;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method5096(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10102 + 3 >= this.field10100.length) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) arg2;
        this.field10100[this.field10102++] = (byte) arg1;
        this.field10100[this.field10102++] = (byte) arg0;
        this.field10100[this.field10102++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 18)
    public final void method5097() {
        if (this.field10102 <= 0) {
            return;
        }
        if ((this.field10102 + this.field10101) > this.field10099) {
            throw new RuntimeException();
        }
        this.field10103.method3847(this.field10100, 0, this.field10101, this.field10102);
        this.field10101 += this.field10102;
        this.field10102 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 35)
    public final void method5098(int arg0) {
        if (this.field10100.length <= (this.field10102 + 3)) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) (arg0 >> 16);
        this.field10100[this.field10102++] = (byte) (arg0 >> 8);
        this.field10100[this.field10102++] = (byte) arg0;
        this.field10100[this.field10102++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 49)
    public final void method5099(int arg0) {
        if (this.field10100.length <= (this.field10102 + 3)) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) arg0;
        this.field10100[this.field10102++] = (byte) (arg0 >> 8);
        this.field10100[this.field10102++] = (byte) (arg0 >> 16);
        this.field10100[this.field10102++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 62)
    public final int method5100() {
        return this.field10101 + this.field10102;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 69)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 73)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method5110(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 81)
    public final void method5101(int arg0) {
        if (this.field10100.length <= (this.field10102 + 1)) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) arg0;
        this.field10100[this.field10102++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 94)
    public final void method5102(Buffer arg0) {
        this.method5110(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 101)
    public final void method5103(int arg0) {
        this.method5097();
        this.field10101 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 111)
    public final void method5104(int arg0) {
        if ((this.field10102 + 1) >= this.field10100.length) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) (arg0 >> 8);
        this.field10100[this.field10102++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 123)
    public final void method5105(int arg0) {
        if (this.field10100.length <= this.field10102) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 135)
    public final void method5106(float arg0) {
        if (this.field10100.length <= this.field10102 + 3) {
            this.method5097();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field10100[this.field10102++] = (byte) var2;
        this.field10100[this.field10102++] = (byte) (var2 >> 8);
        this.field10100[this.field10102++] = (byte) (var2 >> 16);
        this.field10100[this.field10102++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 150)
    public final void method5107(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10102 + 3 >= this.field10100.length) {
            this.method5097();
        }
        this.field10100[this.field10102++] = (byte) arg0;
        this.field10100[this.field10102++] = (byte) arg1;
        this.field10100[this.field10102++] = (byte) arg2;
        this.field10100[this.field10102++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 164)
    public static final boolean method5108() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 173)
    public final void method5109(float arg0) {
        if (this.field10102 + 3 >= this.field10100.length) {
            this.method5097();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field10100[this.field10102++] = (byte) (var2 >> 24);
        this.field10100[this.field10102++] = (byte) (var2 >> 16);
        this.field10100[this.field10102++] = (byte) (var2 >> 8);
        this.field10100[this.field10102++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 188)
    private final void method5110(Buffer arg0, int arg1, int arg2) {
        this.method5097();
        this.field10101 = arg1;
        this.field10103 = arg0;
        this.field10099 = arg1 + arg2;
        if (this.field10099 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 201)
    private Stream(int arg0) {
        this.field10100 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 209)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
