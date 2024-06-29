package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field8962;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8963;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8964;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8965;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8961;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 4)
    public final void method3572(int arg0) {
        if (this.field8965 + 3 >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
        this.field8962[this.field8965++] = (byte) (arg0 >> 16);
        this.field8962[this.field8965++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 17)
    public final void method3573(int arg0) {
        if (this.field8962.length <= this.field8965 + 3) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) (arg0 >> 16);
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 31)
    public final void method3574(int arg0) {
        this.method3578();
        this.field8964 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 40)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3580(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 49)
    public final void method3575(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field8965 + 3) >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) arg1;
        this.field8962[this.field8965++] = (byte) arg2;
        this.field8962[this.field8965++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 62)
    public final void method3576(int arg0) {
        if (this.field8965 >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 73)
    public final void method3577(float arg0) {
        if (this.field8962.length <= this.field8965 + 3) {
            this.method3578();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8962[this.field8965++] = (byte) var2;
        this.field8962[this.field8965++] = (byte) (var2 >> 8);
        this.field8962[this.field8965++] = (byte) (var2 >> 16);
        this.field8962[this.field8965++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 89)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 92)
    public final void method3578() {
        if (this.field8965 <= 0) {
            return;
        }
        if (this.field8965 + this.field8964 > this.field8963) {
            throw new RuntimeException();
        }
        this.field8961.method2668(this.field8962, 0, this.field8964, this.field8965);
        this.field8964 += this.field8965;
        this.field8965 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 110)
    public static final boolean method3579() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 118)
    private final void method3580(Buffer arg0, int arg1, int arg2) {
        this.method3578();
        this.field8964 = arg1;
        this.field8961 = arg0;
        this.field8963 = arg1 + arg2;
        if (this.field8963 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 133)
    public final void method3581(int arg0) {
        if (this.field8962.length <= this.field8965 + 1) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
        this.field8962[this.field8965++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 145)
    public final void method3582(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8962.length <= this.field8965 + 3) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg2;
        this.field8962[this.field8965++] = (byte) arg1;
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 159)
    public final int method3583() {
        return this.field8964 + this.field8965;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 166)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 169)
    public final void method3584(float arg0) {
        if ((this.field8965 + 3) >= this.field8962.length) {
            this.method3578();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8962[this.field8965++] = (byte) (var2 >> 24);
        this.field8962[this.field8965++] = (byte) (var2 >> 16);
        this.field8962[this.field8965++] = (byte) (var2 >> 8);
        this.field8962[this.field8965++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 185)
    private Stream(int arg0) {
        this.field8962 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 193)
    public final void method3585(Buffer arg0) {
        this.method3580(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 200)
    public final void method3586(int arg0) {
        if (this.field8965 + 1 >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
