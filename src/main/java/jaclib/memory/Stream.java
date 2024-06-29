package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field8123;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8125;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8126;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8127;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8124;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 4)
    public final void method3238(int arg0) {
        if (this.field8123.length <= (this.field8126 + 1)) {
            this.method3246();
        }
        this.field8123[this.field8126++] = (byte) arg0;
        this.field8123[this.field8126++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 15)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3249(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 24)
    public final void method3239(int arg0) {
        if (this.field8123.length <= (this.field8126 + 3)) {
            this.method3246();
        }
        this.field8123[this.field8126++] = (byte) arg0;
        this.field8123[this.field8126++] = (byte) (arg0 >> 8);
        this.field8123[this.field8126++] = (byte) (arg0 >> 16);
        this.field8123[this.field8126++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 38)
    public final int method3240() {
        return this.field8127 + this.field8126;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 45)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 48)
    public final void method3241(int arg0) {
        this.method3246();
        this.field8127 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 56)
    public final void method3242(int arg0) {
        if (this.field8123.length <= this.field8126) {
            this.method3246();
        }
        this.field8123[this.field8126++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 67)
    public final void method3243(Buffer arg0) {
        this.method3249(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 74)
    public final void method3244(int arg0) {
        if ((this.field8126 + 1) >= this.field8123.length) {
            this.method3246();
        }
        this.field8123[this.field8126++] = (byte) (arg0 >> 8);
        this.field8123[this.field8126++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 87)
    public final void method3245(int arg0) {
        if (this.field8123.length <= this.field8126 + 3) {
            this.method3246();
        }
        this.field8123[this.field8126++] = (byte) (arg0 >> 16);
        this.field8123[this.field8126++] = (byte) (arg0 >> 8);
        this.field8123[this.field8126++] = (byte) arg0;
        this.field8123[this.field8126++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 101)
    public final void method3246() {
        if (this.field8126 <= 0) {
            return;
        }
        if (this.field8125 < this.field8127 + this.field8126) {
            throw new RuntimeException();
        }
        this.field8124.method2410(this.field8123, 0, this.field8127, this.field8126);
        this.field8127 += this.field8126;
        this.field8126 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 119)
    public final void method3247(float arg0) {
        if ((this.field8126 + 3) >= this.field8123.length) {
            this.method3246();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8123[this.field8126++] = (byte) var2;
        this.field8123[this.field8126++] = (byte) (var2 >> 8);
        this.field8123[this.field8126++] = (byte) (var2 >> 16);
        this.field8123[this.field8126++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 136)
    public static final boolean method3248() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 144)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 149)
    private final void method3249(Buffer arg0, int arg1, int arg2) {
        this.method3246();
        this.field8124 = arg0;
        this.field8125 = arg1 + arg2;
        this.field8127 = arg1;
        if (this.field8125 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 164)
    public final void method3250(float arg0) {
        if (this.field8123.length <= this.field8126 + 3) {
            this.method3246();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8123[this.field8126++] = (byte) (var2 >> 24);
        this.field8123[this.field8126++] = (byte) (var2 >> 16);
        this.field8123[this.field8126++] = (byte) (var2 >> 8);
        this.field8123[this.field8126++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 180)
    private Stream(int arg0) {
        this.field8123 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
