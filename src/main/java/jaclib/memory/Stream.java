package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field5771;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field5772;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field5774;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5775;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5773;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method2514(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5772 + 3 >= this.field5771.length) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) arg2;
        this.field5771[this.field5772++] = (byte) arg1;
        this.field5771[this.field5772++] = (byte) arg0;
        this.field5771[this.field5772++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 18)
    public final void method2515(int arg0) {
        if (this.field5771.length <= this.field5772 + 3) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) (arg0 >> 16);
        this.field5771[this.field5772++] = (byte) (arg0 >> 8);
        this.field5771[this.field5772++] = (byte) arg0;
        this.field5771[this.field5772++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 31)
    public final void method2516(int arg0) {
        if (this.field5772 + 1 >= this.field5771.length) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) arg0;
        this.field5771[this.field5772++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 43)
    public final void method2517(int arg0) {
        if (this.field5771.length <= this.field5772 + 3) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) arg0;
        this.field5771[this.field5772++] = (byte) (arg0 >> 8);
        this.field5771[this.field5772++] = (byte) (arg0 >> 16);
        this.field5771[this.field5772++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 58)
    public final void method2518(float arg0) {
        if ((this.field5772 + 3) >= this.field5771.length) {
            this.method2519();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5771[this.field5772++] = (byte) (var2 >> 24);
        this.field5771[this.field5772++] = (byte) (var2 >> 16);
        this.field5771[this.field5772++] = (byte) (var2 >> 8);
        this.field5771[this.field5772++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 75)
    public final void method2519() {
        if (this.field5772 <= 0) {
            return;
        }
        if (this.field5774 + this.field5772 > this.field5775) {
            throw new RuntimeException();
        }
        this.field5773.method2529(this.field5771, 0, this.field5774, this.field5772);
        this.field5774 += this.field5772;
        this.field5772 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 92)
    public final void method2520(Buffer arg0) {
        this.method2526(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 100)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 103)
    public final int method2521() {
        return this.field5774 + this.field5772;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 110)
    public final void method2522(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field5772 + 3) >= this.field5771.length) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) arg0;
        this.field5771[this.field5772++] = (byte) arg1;
        this.field5771[this.field5772++] = (byte) arg2;
        this.field5771[this.field5772++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 124)
    public final void method2523(int arg0) {
        this.method2519();
        this.field5774 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 133)
    public final void method2524(float arg0) {
        if (this.field5771.length <= this.field5772 + 3) {
            this.method2519();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5771[this.field5772++] = (byte) var2;
        this.field5771[this.field5772++] = (byte) (var2 >> 8);
        this.field5771[this.field5772++] = (byte) (var2 >> 16);
        this.field5771[this.field5772++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 149)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 152)
    public final void method2525(int arg0) {
        if ((this.field5772 + 1) >= this.field5771.length) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) (arg0 >> 8);
        this.field5771[this.field5772++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 164)
    private final void method2526(Buffer arg0, int arg1, int arg2) {
        this.method2519();
        this.field5774 = arg1;
        this.field5775 = arg1 + arg2;
        this.field5773 = arg0;
        if (this.field5775 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 178)
    public final void method2527(int arg0) {
        if (this.field5771.length <= this.field5772) {
            this.method2519();
        }
        this.field5771[this.field5772++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 189)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2526(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 198)
    public static final boolean method2528() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 205)
    private Stream(int arg0) {
        this.field5771 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
