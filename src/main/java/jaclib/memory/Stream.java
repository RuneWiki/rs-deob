package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field8677;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8675;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8676;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8678;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8674;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3475(int arg0) {
        if (this.field8676 + 3 >= this.field8677.length) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) arg0;
        this.field8677[this.field8676++] = (byte) (arg0 >> 8);
        this.field8677[this.field8676++] = (byte) (arg0 >> 16);
        this.field8677[this.field8676++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3476(int arg0) {
        if (this.field8677.length <= (this.field8676 + 1)) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) (arg0 >> 8);
        this.field8677[this.field8676++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3477() {
        if (this.field8676 <= 0) {
            return;
        }
        if (this.field8675 < this.field8678 + this.field8676) {
            throw new RuntimeException();
        }
        this.field8674.method2548(this.field8677, 0, this.field8678, this.field8676);
        this.field8678 += this.field8676;
        this.field8676 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3478(float arg0) {
        if ((this.field8676 + 3) >= this.field8677.length) {
            this.method3477();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8677[this.field8676++] = (byte) var2;
        this.field8677[this.field8676++] = (byte) (var2 >> 8);
        this.field8677[this.field8676++] = (byte) (var2 >> 16);
        this.field8677[this.field8676++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3479(int arg0) {
        if (this.field8677.length <= this.field8676 + 1) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) arg0;
        this.field8677[this.field8676++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3480(int arg0) {
        this.method3477();
        this.field8678 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3481(int arg0) {
        if (this.field8677.length <= this.field8676) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3482(int arg0) {
        if (this.field8677.length <= this.field8676 + 3) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) (arg0 >> 16);
        this.field8677[this.field8676++] = (byte) (arg0 >> 8);
        this.field8677[this.field8676++] = (byte) arg0;
        this.field8677[this.field8676++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3483(Buffer arg0, int arg1, int arg2) {
        this.method3477();
        this.field8674 = arg0;
        this.field8678 = arg1;
        this.field8675 = arg1 + arg2;
        if (this.field8675 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3484() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3485() {
        return this.field8678 + this.field8676;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3486(float arg0) {
        if (this.field8676 + 3 >= this.field8677.length) {
            this.method3477();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8677[this.field8676++] = (byte) (var2 >> 24);
        this.field8677[this.field8676++] = (byte) (var2 >> 16);
        this.field8677[this.field8676++] = (byte) (var2 >> 8);
        this.field8677[this.field8676++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3487(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8677.length <= this.field8676 + 3) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) arg0;
        this.field8677[this.field8676++] = (byte) arg1;
        this.field8677[this.field8676++] = (byte) arg2;
        this.field8677[this.field8676++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3488(Buffer arg0) {
        this.method3483(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3489(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8677.length <= this.field8676 + 3) {
            this.method3477();
        }
        this.field8677[this.field8676++] = (byte) arg2;
        this.field8677[this.field8676++] = (byte) arg1;
        this.field8677[this.field8676++] = (byte) arg0;
        this.field8677[this.field8676++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3483(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8677 = new byte[arg0];
    }
}
