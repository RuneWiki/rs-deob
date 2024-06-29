package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field7946;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field7943;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field7944;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field7947;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field7945;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3288() {
        if (this.field7943 <= 0) {
            return;
        }
        if (this.field7944 + this.field7943 > this.field7947) {
            throw new RuntimeException();
        }
        this.field7945.method2446(this.field7946, 0, this.field7944, this.field7943);
        this.field7944 += this.field7943;
        this.field7943 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3289(float arg0) {
        if (this.field7943 + 3 >= this.field7946.length) {
            this.method3288();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7946[this.field7943++] = (byte) (var2 >> 24);
        this.field7946[this.field7943++] = (byte) (var2 >> 16);
        this.field7946[this.field7943++] = (byte) (var2 >> 8);
        this.field7946[this.field7943++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3290(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3290(Buffer arg0, int arg1, int arg2) {
        this.method3288();
        this.field7947 = arg1 + arg2;
        this.field7945 = arg0;
        this.field7944 = arg1;
        if (this.field7947 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3291(int arg0) {
        if ((this.field7943 + 1) >= this.field7946.length) {
            this.method3288();
        }
        this.field7946[this.field7943++] = (byte) (arg0 >> 8);
        this.field7946[this.field7943++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3292() {
        return this.field7944 + this.field7943;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3293(float arg0) {
        if ((this.field7943 + 3) >= this.field7946.length) {
            this.method3288();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7946[this.field7943++] = (byte) var2;
        this.field7946[this.field7943++] = (byte) (var2 >> 8);
        this.field7946[this.field7943++] = (byte) (var2 >> 16);
        this.field7946[this.field7943++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3294() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3295(int arg0) {
        if (this.field7946.length <= this.field7943 + 3) {
            this.method3288();
        }
        this.field7946[this.field7943++] = (byte) (arg0 >> 16);
        this.field7946[this.field7943++] = (byte) (arg0 >> 8);
        this.field7946[this.field7943++] = (byte) arg0;
        this.field7946[this.field7943++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3296(Buffer arg0) {
        this.method3290(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3297(int arg0) {
        if (this.field7943 >= this.field7946.length) {
            this.method3288();
        }
        this.field7946[this.field7943++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3298(int arg0) {
        if (this.field7946.length <= (this.field7943 + 1)) {
            this.method3288();
        }
        this.field7946[this.field7943++] = (byte) arg0;
        this.field7946[this.field7943++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3299(int arg0) {
        this.method3288();
        this.field7944 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3300(int arg0) {
        if (this.field7946.length <= (this.field7943 + 3)) {
            this.method3288();
        }
        this.field7946[this.field7943++] = (byte) arg0;
        this.field7946[this.field7943++] = (byte) (arg0 >> 8);
        this.field7946[this.field7943++] = (byte) (arg0 >> 16);
        this.field7946[this.field7943++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field7946 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
