package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field4901;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field4900;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method2075(float arg0) {
        if (this.field4902 + 3 >= this.field4901.length) {
            this.method2084();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field4901[this.field4902++] = (byte) (var2 >> 24);
        this.field4901[this.field4902++] = (byte) (var2 >> 16);
        this.field4901[this.field4902++] = (byte) (var2 >> 8);
        this.field4901[this.field4902++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method2076() {
        return this.field4903 + this.field4902;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method2077() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method2078(int arg0) {
        this.method2084();
        this.field4903 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method2079(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field4902 + 3) >= this.field4901.length) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) arg0;
        this.field4901[this.field4902++] = (byte) arg1;
        this.field4901[this.field4902++] = (byte) arg2;
        this.field4901[this.field4902++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method2085(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method2080(int arg0) {
        if (this.field4901.length <= this.field4902 + 1) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) arg0;
        this.field4901[this.field4902++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method2081(int arg0) {
        if ((this.field4902 + 3) >= this.field4901.length) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) (arg0 >> 16);
        this.field4901[this.field4902++] = (byte) (arg0 >> 8);
        this.field4901[this.field4902++] = (byte) arg0;
        this.field4901[this.field4902++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method2082(int arg0) {
        if (this.field4902 >= this.field4901.length) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method2083(int arg0) {
        if (this.field4901.length <= (this.field4902 + 1)) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) (arg0 >> 8);
        this.field4901[this.field4902++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method2084() {
        if (this.field4902 <= 0) {
            return;
        }
        if (this.field4903 + this.field4902 > this.field4899) {
            throw new RuntimeException();
        }
        this.field4900.method163(this.field4901, 0, this.field4903, this.field4902);
        this.field4903 += this.field4902;
        this.field4902 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method2085(Buffer arg0, int arg1, int arg2) {
        this.method2084();
        this.field4903 = arg1;
        this.field4899 = arg1 + arg2;
        this.field4900 = arg0;
        if (this.field4899 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field4901 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method2086(int arg0) {
        if (this.field4901.length <= this.field4902 + 3) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) arg0;
        this.field4901[this.field4902++] = (byte) (arg0 >> 8);
        this.field4901[this.field4902++] = (byte) (arg0 >> 16);
        this.field4901[this.field4902++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method2087(Buffer arg0) {
        this.method2085(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method2088(float arg0) {
        if (this.field4902 + 3 >= this.field4901.length) {
            this.method2084();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field4901[this.field4902++] = (byte) var2;
        this.field4901[this.field4902++] = (byte) (var2 >> 8);
        this.field4901[this.field4902++] = (byte) (var2 >> 16);
        this.field4901[this.field4902++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method2089(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field4902 + 3) >= this.field4901.length) {
            this.method2084();
        }
        this.field4901[this.field4902++] = (byte) arg2;
        this.field4901[this.field4902++] = (byte) arg1;
        this.field4901[this.field4902++] = (byte) arg0;
        this.field4901[this.field4902++] = (byte) arg3;
    }
}
