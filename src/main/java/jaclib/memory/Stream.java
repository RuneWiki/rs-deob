package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field4715;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field4718;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field4714;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method2029(int arg0) {
        if (this.field4717 >= this.field4715.length) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method2030(Buffer arg0, int arg1, int arg2) {
        this.method2034();
        this.field4718 = arg1;
        this.field4714 = arg0;
        this.field4716 = arg1 + arg2;
        if (this.field4716 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method2031(int arg0) {
        this.method2034();
        this.field4718 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method2030(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method2032(int arg0) {
        if ((this.field4717 + 3) >= this.field4715.length) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) (arg0 >> 16);
        this.field4715[this.field4717++] = (byte) (arg0 >> 8);
        this.field4715[this.field4717++] = (byte) arg0;
        this.field4715[this.field4717++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method2033(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field4717 + 3) >= this.field4715.length) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) arg0;
        this.field4715[this.field4717++] = (byte) arg1;
        this.field4715[this.field4717++] = (byte) arg2;
        this.field4715[this.field4717++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method2034() {
        if (this.field4717 <= 0) {
            return;
        }
        if (this.field4718 + this.field4717 > this.field4716) {
            throw new RuntimeException();
        }
        this.field4714.method227(this.field4715, 0, this.field4718, this.field4717);
        this.field4718 += this.field4717;
        this.field4717 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method2035(float arg0) {
        if (this.field4715.length <= (this.field4717 + 3)) {
            this.method2034();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field4715[this.field4717++] = (byte) var2;
        this.field4715[this.field4717++] = (byte) (var2 >> 8);
        this.field4715[this.field4717++] = (byte) (var2 >> 16);
        this.field4715[this.field4717++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method2036(int arg0) {
        if (this.field4715.length <= (this.field4717 + 1)) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) (arg0 >> 8);
        this.field4715[this.field4717++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method2037(float arg0) {
        if (this.field4715.length <= this.field4717 + 3) {
            this.method2034();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field4715[this.field4717++] = (byte) (var2 >> 24);
        this.field4715[this.field4717++] = (byte) (var2 >> 16);
        this.field4715[this.field4717++] = (byte) (var2 >> 8);
        this.field4715[this.field4717++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method2038(int arg0) {
        if (this.field4715.length <= (this.field4717 + 1)) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) arg0;
        this.field4715[this.field4717++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method2039(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field4717 + 3) >= this.field4715.length) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) arg2;
        this.field4715[this.field4717++] = (byte) arg1;
        this.field4715[this.field4717++] = (byte) arg0;
        this.field4715[this.field4717++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method2040() {
        return this.field4718 + this.field4717;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field4715 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method2041(int arg0) {
        if (this.field4715.length <= this.field4717 + 3) {
            this.method2034();
        }
        this.field4715[this.field4717++] = (byte) arg0;
        this.field4715[this.field4717++] = (byte) (arg0 >> 8);
        this.field4715[this.field4717++] = (byte) (arg0 >> 16);
        this.field4715[this.field4717++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method2042() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method2043(Buffer arg0) {
        this.method2030(arg0, 0, arg0.getSize());
    }
}
