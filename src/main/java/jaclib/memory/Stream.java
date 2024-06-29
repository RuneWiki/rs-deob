package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field5928;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field5927;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field5930;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5931;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5929;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 4)
    public final void method2605(int arg0) {
        if (this.field5927 + 3 >= this.field5928.length) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) arg0;
        this.field5928[this.field5927++] = (byte) (arg0 >> 8);
        this.field5928[this.field5927++] = (byte) (arg0 >> 16);
        this.field5928[this.field5927++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 17)
    public final void method2606(int arg0) {
        if (this.field5927 >= this.field5928.length) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 27)
    public final void method2607(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5927 + 3 >= this.field5928.length) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) arg0;
        this.field5928[this.field5927++] = (byte) arg1;
        this.field5928[this.field5927++] = (byte) arg2;
        this.field5928[this.field5927++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 41)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 44)
    public final void method2608(float arg0) {
        if ((this.field5927 + 3) >= this.field5928.length) {
            this.method2613();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5928[this.field5927++] = (byte) (var2 >> 24);
        this.field5928[this.field5927++] = (byte) (var2 >> 16);
        this.field5928[this.field5927++] = (byte) (var2 >> 8);
        this.field5928[this.field5927++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 62)
    public final int method2609() {
        return this.field5931 + this.field5927;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 69)
    public final void method2610(int arg0) {
        if (this.field5928.length <= (this.field5927 + 1)) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) (arg0 >> 8);
        this.field5928[this.field5927++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 82)
    public final void method2611(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field5927 + 3) >= this.field5928.length) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) arg2;
        this.field5928[this.field5927++] = (byte) arg1;
        this.field5928[this.field5927++] = (byte) arg0;
        this.field5928[this.field5927++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 97)
    public final void method2612(Buffer arg0) {
        this.method2616(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 104)
    public final void method2613() {
        if (this.field5927 <= 0) {
            return;
        }
        if ((this.field5931 + this.field5927) > this.field5930) {
            throw new RuntimeException();
        }
        this.field5929.method2620(this.field5928, 0, this.field5931, this.field5927);
        this.field5931 += this.field5927;
        this.field5927 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 124)
    public static final boolean method2614() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 131)
    public final void method2615(int arg0) {
        if (this.field5928.length <= (this.field5927 + 3)) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) (arg0 >> 16);
        this.field5928[this.field5927++] = (byte) (arg0 >> 8);
        this.field5928[this.field5927++] = (byte) arg0;
        this.field5928[this.field5927++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 145)
    private Stream(int arg0) {
        this.field5928 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 153)
    private final void method2616(Buffer arg0, int arg1, int arg2) {
        this.method2613();
        this.field5929 = arg0;
        this.field5930 = arg1 + arg2;
        this.field5931 = arg1;
        if (this.field5930 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 166)
    public final void method2617(float arg0) {
        if (this.field5927 + 3 >= this.field5928.length) {
            this.method2613();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5928[this.field5927++] = (byte) var2;
        this.field5928[this.field5927++] = (byte) (var2 >> 8);
        this.field5928[this.field5927++] = (byte) (var2 >> 16);
        this.field5928[this.field5927++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 182)
    public final void method2618(int arg0) {
        this.method2613();
        this.field5931 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 190)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 193)
    public final void method2619(int arg0) {
        if ((this.field5927 + 1) >= this.field5928.length) {
            this.method2613();
        }
        this.field5928[this.field5927++] = (byte) arg0;
        this.field5928[this.field5927++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 205)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method2616(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
