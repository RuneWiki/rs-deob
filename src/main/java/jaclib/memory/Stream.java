package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field5898;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field5900;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5901;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5899;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 5)
    public final int method3193() {
        return this.field5901 + this.field5900;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 12)
    public final void method3194(int arg0) {
        if (this.field5898.length <= this.field5900 + 3) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) (arg0 >> 16);
        this.field5898[this.field5900++] = (byte) (arg0 >> 8);
        this.field5898[this.field5900++] = (byte) arg0;
        this.field5898[this.field5900++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 26)
    public final void method3195(int arg0) {
        if (this.field5898.length <= (this.field5900 + 1)) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) (arg0 >> 8);
        this.field5898[this.field5900++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 39)
    public final void method3196(int arg0) {
        this.method3199();
        this.field5901 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 47)
    private final void method3197(Buffer arg0, int arg1, int arg2) {
        this.method3199();
        this.field5897 = arg1 + arg2;
        this.field5901 = arg1;
        this.field5899 = arg0;
        if (this.field5897 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 60)
    public final void method3198(int arg0) {
        if (this.field5900 + 1 >= this.field5898.length) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) arg0;
        this.field5898[this.field5900++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 71)
    public final void method3199() {
        if (this.field5900 <= 0) {
            return;
        }
        if ((this.field5901 + this.field5900) > this.field5897) {
            throw new RuntimeException();
        }
        this.field5899.method3146(this.field5898, 0, this.field5901, this.field5900);
        this.field5901 += this.field5900;
        this.field5900 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 89)
    public static final boolean method3200() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 96)
    public final void method3201(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5898.length <= this.field5900 + 3) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) arg0;
        this.field5898[this.field5900++] = (byte) arg1;
        this.field5898[this.field5900++] = (byte) arg2;
        this.field5898[this.field5900++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 109)
    public final void method3202(float arg0) {
        if ((this.field5900 + 3) >= this.field5898.length) {
            this.method3199();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5898[this.field5900++] = (byte) (var2 >> 24);
        this.field5898[this.field5900++] = (byte) (var2 >> 16);
        this.field5898[this.field5900++] = (byte) (var2 >> 8);
        this.field5898[this.field5900++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 124)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 129)
    public final void method3203(int arg0) {
        if (this.field5900 >= this.field5898.length) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 140)
    public final void method3204(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field5900 + 3) >= this.field5898.length) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) arg2;
        this.field5898[this.field5900++] = (byte) arg1;
        this.field5898[this.field5900++] = (byte) arg0;
        this.field5898[this.field5900++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 157)
    public final void method3205(int arg0) {
        if (this.field5898.length <= (this.field5900 + 3)) {
            this.method3199();
        }
        this.field5898[this.field5900++] = (byte) arg0;
        this.field5898[this.field5900++] = (byte) (arg0 >> 8);
        this.field5898[this.field5900++] = (byte) (arg0 >> 16);
        this.field5898[this.field5900++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 170)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 173)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3197(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 182)
    public final void method3206(float arg0) {
        if (this.field5898.length <= this.field5900 + 3) {
            this.method3199();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5898[this.field5900++] = (byte) var2;
        this.field5898[this.field5900++] = (byte) (var2 >> 8);
        this.field5898[this.field5900++] = (byte) (var2 >> 16);
        this.field5898[this.field5900++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 198)
    public final void method3207(Buffer arg0) {
        this.method3197(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 205)
    private Stream(int arg0) {
        this.field5898 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
