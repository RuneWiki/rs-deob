package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field8722;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8721;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8723;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8725;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8724;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 4)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3431(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 12)
    public final void method3418(float arg0) {
        if (this.field8723 + 3 >= this.field8722.length) {
            this.method3424();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8722[this.field8723++] = (byte) (var2 >> 24);
        this.field8722[this.field8723++] = (byte) (var2 >> 16);
        this.field8722[this.field8723++] = (byte) (var2 >> 8);
        this.field8722[this.field8723++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 28)
    public final void method3419(int arg0) {
        if ((this.field8723 + 3) >= this.field8722.length) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) (arg0 >> 16);
        this.field8722[this.field8723++] = (byte) (arg0 >> 8);
        this.field8722[this.field8723++] = (byte) arg0;
        this.field8722[this.field8723++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z", line = 42)
    public static final boolean method3420() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 50)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 53)
    public final void method3421(int arg0) {
        this.method3424();
        this.field8721 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 61)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 65)
    public final void method3422(int arg0) {
        if (this.field8723 + 1 >= this.field8722.length) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) (arg0 >> 8);
        this.field8722[this.field8723++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 77)
    public final int method3423() {
        return this.field8721 + this.field8723;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V", line = 84)
    public final void method3424() {
        if (this.field8723 <= 0) {
            return;
        }
        if (this.field8721 + this.field8723 > this.field8725) {
            throw new RuntimeException();
        }
        this.field8724.method2304(this.field8722, 0, this.field8721, this.field8723);
        this.field8721 += this.field8723;
        this.field8723 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 101)
    public final void method3425(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8722.length <= (this.field8723 + 3)) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) arg0;
        this.field8722[this.field8723++] = (byte) arg1;
        this.field8722[this.field8723++] = (byte) arg2;
        this.field8722[this.field8723++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 114)
    public final void method3426(int arg0) {
        if (this.field8723 >= this.field8722.length) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 125)
    public final void method3427(float arg0) {
        if (this.field8722.length <= this.field8723 + 3) {
            this.method3424();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8722[this.field8723++] = (byte) var2;
        this.field8722[this.field8723++] = (byte) (var2 >> 8);
        this.field8722[this.field8723++] = (byte) (var2 >> 16);
        this.field8722[this.field8723++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 141)
    public final void method3428(Buffer arg0) {
        this.method3431(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 152)
    public final void method3429(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8722.length <= this.field8723 + 3) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) arg2;
        this.field8722[this.field8723++] = (byte) arg1;
        this.field8722[this.field8723++] = (byte) arg0;
        this.field8722[this.field8723++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 168)
    public final void method3430(int arg0) {
        if (this.field8723 + 1 >= this.field8722.length) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) arg0;
        this.field8722[this.field8723++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 179)
    private final void method3431(Buffer arg0, int arg1, int arg2) {
        this.method3424();
        this.field8724 = arg0;
        this.field8725 = arg1 + arg2;
        this.field8721 = arg1;
        if (this.field8725 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 192)
    private Stream(int arg0) {
        this.field8722 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 200)
    public final void method3432(int arg0) {
        if (this.field8723 + 3 >= this.field8722.length) {
            this.method3424();
        }
        this.field8722[this.field8723++] = (byte) arg0;
        this.field8722[this.field8723++] = (byte) (arg0 >> 8);
        this.field8722[this.field8723++] = (byte) (arg0 >> 16);
        this.field8722[this.field8723++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
