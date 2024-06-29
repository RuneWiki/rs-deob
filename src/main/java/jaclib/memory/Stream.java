package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field5275;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5277;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method2251(float arg0) {
        if (this.field5275.length <= this.field5278 + 3) {
            this.method2255();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5275[this.field5278++] = (byte) (var2 >> 24);
        this.field5275[this.field5278++] = (byte) (var2 >> 16);
        this.field5275[this.field5278++] = (byte) (var2 >> 8);
        this.field5275[this.field5278++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method2252(int arg0) {
        if (this.field5275.length <= (this.field5278 + 1)) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) arg0;
        this.field5275[this.field5278++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method2253(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5275.length <= this.field5278 + 3) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) arg2;
        this.field5275[this.field5278++] = (byte) arg1;
        this.field5275[this.field5278++] = (byte) arg0;
        this.field5275[this.field5278++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method2254(int arg0) {
        if (this.field5275.length <= this.field5278) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method2255() {
        if (this.field5278 <= 0) {
            return;
        }
        if ((this.field5278 + this.field5276) > this.field5274) {
            throw new RuntimeException();
        }
        this.field5277.method236(this.field5275, 0, this.field5276, this.field5278);
        this.field5276 += this.field5278;
        this.field5278 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method2256(Buffer arg0) {
        this.method2265(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method2257(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field5278 + 3) >= this.field5275.length) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) arg0;
        this.field5275[this.field5278++] = (byte) arg1;
        this.field5275[this.field5278++] = (byte) arg2;
        this.field5275[this.field5278++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method2258(float arg0) {
        if (this.field5275.length <= this.field5278 + 3) {
            this.method2255();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5275[this.field5278++] = (byte) var2;
        this.field5275[this.field5278++] = (byte) (var2 >> 8);
        this.field5275[this.field5278++] = (byte) (var2 >> 16);
        this.field5275[this.field5278++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2265(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method2259(int arg0) {
        if ((this.field5278 + 1) >= this.field5275.length) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) (arg0 >> 8);
        this.field5275[this.field5278++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method2260() {
        return this.field5278 + this.field5276;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method2261(int arg0) {
        if (this.field5275.length <= this.field5278 + 3) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) arg0;
        this.field5275[this.field5278++] = (byte) (arg0 >> 8);
        this.field5275[this.field5278++] = (byte) (arg0 >> 16);
        this.field5275[this.field5278++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method2262(int arg0) {
        this.method2255();
        this.field5276 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method2263() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method2264(int arg0) {
        if ((this.field5278 + 3) >= this.field5275.length) {
            this.method2255();
        }
        this.field5275[this.field5278++] = (byte) (arg0 >> 16);
        this.field5275[this.field5278++] = (byte) (arg0 >> 8);
        this.field5275[this.field5278++] = (byte) arg0;
        this.field5275[this.field5278++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method2265(Buffer arg0, int arg1, int arg2) {
        this.method2255();
        this.field5277 = arg0;
        this.field5276 = arg1;
        this.field5274 = arg1 + arg2;
        if (this.field5274 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field5275 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }
}
