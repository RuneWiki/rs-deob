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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3572(int arg0) {
        if (this.field8965 + 3 >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
        this.field8962[this.field8965++] = (byte) (arg0 >> 16);
        this.field8962[this.field8965++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3573(int arg0) {
        if (this.field8962.length <= this.field8965 + 3) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) (arg0 >> 16);
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3574(int arg0) {
        this.method3578();
        this.field8964 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3580(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3575(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field8965 + 3) >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) arg1;
        this.field8962[this.field8965++] = (byte) arg2;
        this.field8962[this.field8965++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3576(int arg0) {
        if (this.field8965 >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3579() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3580(Buffer arg0, int arg1, int arg2) {
        this.method3578();
        this.field8964 = arg1;
        this.field8961 = arg0;
        this.field8963 = arg1 + arg2;
        if (this.field8963 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3581(int arg0) {
        if (this.field8962.length <= this.field8965 + 1) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
        this.field8962[this.field8965++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3582(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8962.length <= this.field8965 + 3) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg2;
        this.field8962[this.field8965++] = (byte) arg1;
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3583() {
        return this.field8964 + this.field8965;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
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

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8962 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3585(Buffer arg0) {
        this.method3580(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3586(int arg0) {
        if (this.field8965 + 1 >= this.field8962.length) {
            this.method3578();
        }
        this.field8962[this.field8965++] = (byte) arg0;
        this.field8962[this.field8965++] = (byte) (arg0 >> 8);
    }
}
