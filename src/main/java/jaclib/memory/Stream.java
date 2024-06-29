package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field5821;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field5819;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field5820;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5823;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5822;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method2541() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method2542(int arg0) {
        if (this.field5821.length <= this.field5819) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method2543(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field5819 + 3) >= this.field5821.length) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) arg0;
        this.field5821[this.field5819++] = (byte) arg1;
        this.field5821[this.field5819++] = (byte) arg2;
        this.field5821[this.field5819++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method2544(int arg0) {
        if (this.field5819 + 1 >= this.field5821.length) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) arg0;
        this.field5821[this.field5819++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method2545(int arg0) {
        if (this.field5819 + 3 >= this.field5821.length) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) arg0;
        this.field5821[this.field5819++] = (byte) (arg0 >> 8);
        this.field5821[this.field5819++] = (byte) (arg0 >> 16);
        this.field5821[this.field5819++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method2546(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5821.length <= this.field5819 + 3) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) arg2;
        this.field5821[this.field5819++] = (byte) arg1;
        this.field5821[this.field5819++] = (byte) arg0;
        this.field5821[this.field5819++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method2547(Buffer arg0) {
        this.method2548(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method2548(Buffer arg0, int arg1, int arg2) {
        this.method2551();
        this.field5822 = arg0;
        this.field5820 = arg1 + arg2;
        this.field5823 = arg1;
        if (this.field5820 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method2549() {
        return this.field5823 + this.field5819;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method2550(float arg0) {
        if (this.field5821.length <= (this.field5819 + 3)) {
            this.method2551();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5821[this.field5819++] = (byte) var2;
        this.field5821[this.field5819++] = (byte) (var2 >> 8);
        this.field5821[this.field5819++] = (byte) (var2 >> 16);
        this.field5821[this.field5819++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method2551() {
        if (this.field5819 <= 0) {
            return;
        }
        if (this.field5820 < (this.field5823 + this.field5819)) {
            throw new RuntimeException();
        }
        this.field5822.method2556(this.field5821, 0, this.field5823, this.field5819);
        this.field5823 += this.field5819;
        this.field5819 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method2552(float arg0) {
        if (this.field5821.length <= this.field5819 + 3) {
            this.method2551();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5821[this.field5819++] = (byte) (var2 >> 24);
        this.field5821[this.field5819++] = (byte) (var2 >> 16);
        this.field5821[this.field5819++] = (byte) (var2 >> 8);
        this.field5821[this.field5819++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2548(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method2553(int arg0) {
        if ((this.field5819 + 3) >= this.field5821.length) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) (arg0 >> 16);
        this.field5821[this.field5819++] = (byte) (arg0 >> 8);
        this.field5821[this.field5819++] = (byte) arg0;
        this.field5821[this.field5819++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method2554(int arg0) {
        if (this.field5821.length <= this.field5819 + 1) {
            this.method2551();
        }
        this.field5821[this.field5819++] = (byte) (arg0 >> 8);
        this.field5821[this.field5819++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method2555(int arg0) {
        this.method2551();
        this.field5823 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field5821 = new byte[arg0];
    }
}
