package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field9849;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9850;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9851;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9852;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9853;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method3916(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field9851 + 3) >= this.field9849.length) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) arg0;
        this.field9849[this.field9851++] = (byte) arg1;
        this.field9849[this.field9851++] = (byte) arg2;
        this.field9849[this.field9851++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 20)
    public final void method3917(int arg0) {
        if (this.field9849.length <= this.field9851) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 30)
    public final void method3918(int arg0) {
        if (this.field9849.length <= this.field9851 + 1) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) (arg0 >> 8);
        this.field9849[this.field9851++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 41)
    public final void method3919(Buffer arg0) {
        this.method3927(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 49)
    public final void method3920(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9851 + 3 >= this.field9849.length) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) arg2;
        this.field9849[this.field9851++] = (byte) arg1;
        this.field9849[this.field9851++] = (byte) arg0;
        this.field9849[this.field9851++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 62)
    public final void method3921(int arg0) {
        if (this.field9849.length <= (this.field9851 + 1)) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) arg0;
        this.field9849[this.field9851++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 75)
    public final void method3922() {
        if (this.field9851 <= 0) {
            return;
        }
        if (this.field9850 + this.field9851 > this.field9852) {
            throw new RuntimeException();
        }
        this.field9853.method2980(this.field9849, 0, this.field9850, this.field9851);
        this.field9850 += this.field9851;
        this.field9851 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 94)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3927(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 103)
    public final void method3923(int arg0) {
        if (this.field9851 + 3 >= this.field9849.length) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) (arg0 >> 16);
        this.field9849[this.field9851++] = (byte) (arg0 >> 8);
        this.field9849[this.field9851++] = (byte) arg0;
        this.field9849[this.field9851++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 118)
    public final int method3924() {
        return this.field9850 + this.field9851;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 125)
    public final void method3925(int arg0) {
        this.method3922();
        this.field9850 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 133)
    public static final boolean method3926() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 140)
    private final void method3927(Buffer arg0, int arg1, int arg2) {
        this.method3922();
        this.field9850 = arg1;
        this.field9853 = arg0;
        this.field9852 = arg1 + arg2;
        if (this.field9852 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 153)
    public final void method3928(int arg0) {
        if (this.field9849.length <= (this.field9851 + 3)) {
            this.method3922();
        }
        this.field9849[this.field9851++] = (byte) arg0;
        this.field9849[this.field9851++] = (byte) (arg0 >> 8);
        this.field9849[this.field9851++] = (byte) (arg0 >> 16);
        this.field9849[this.field9851++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 167)
    private Stream(int arg0) {
        this.field9849 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 175)
    public final void method3929(float arg0) {
        if (this.field9849.length <= this.field9851 + 3) {
            this.method3922();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9849[this.field9851++] = (byte) var2;
        this.field9849[this.field9851++] = (byte) (var2 >> 8);
        this.field9849[this.field9851++] = (byte) (var2 >> 16);
        this.field9849[this.field9851++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 191)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 194)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 197)
    public final void method3930(float arg0) {
        if (this.field9849.length <= (this.field9851 + 3)) {
            this.method3922();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9849[this.field9851++] = (byte) (var2 >> 24);
        this.field9849[this.field9851++] = (byte) (var2 >> 16);
        this.field9849[this.field9851++] = (byte) (var2 >> 8);
        this.field9849[this.field9851++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
