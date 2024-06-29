package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field4380;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field4378;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field4381;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field4382;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method1953(int arg0) {
        if (this.field4381 + 3 >= this.field4380.length) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) arg0;
        this.field4380[this.field4381++] = (byte) (arg0 >> 8);
        this.field4380[this.field4381++] = (byte) (arg0 >> 16);
        this.field4380[this.field4381++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method1954(int arg0) {
        this.method1955();
        this.field4378 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method1963(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method1955() {
        if (this.field4381 <= 0) {
            return;
        }
        if ((this.field4378 + this.field4381) > this.field4379) {
            throw new RuntimeException();
        }
        this.field4382.method125(this.field4380, 0, this.field4378, this.field4381);
        this.field4378 += this.field4381;
        this.field4381 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method1956(float arg0) {
        if (this.field4381 + 3 >= this.field4380.length) {
            this.method1955();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field4380[this.field4381++] = (byte) var2;
        this.field4380[this.field4381++] = (byte) (var2 >> 8);
        this.field4380[this.field4381++] = (byte) (var2 >> 16);
        this.field4380[this.field4381++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method1957(int arg0) {
        if (this.field4381 >= this.field4380.length) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method1958(float arg0) {
        if (this.field4381 + 3 >= this.field4380.length) {
            this.method1955();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field4380[this.field4381++] = (byte) (var2 >> 24);
        this.field4380[this.field4381++] = (byte) (var2 >> 16);
        this.field4380[this.field4381++] = (byte) (var2 >> 8);
        this.field4380[this.field4381++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method1959(int arg0) {
        if (this.field4380.length <= (this.field4381 + 1)) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) arg0;
        this.field4380[this.field4381++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method1960(int arg0) {
        if (this.field4380.length <= this.field4381 + 3) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) (arg0 >> 16);
        this.field4380[this.field4381++] = (byte) (arg0 >> 8);
        this.field4380[this.field4381++] = (byte) arg0;
        this.field4380[this.field4381++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method1961(int arg0) {
        if (this.field4380.length <= (this.field4381 + 1)) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) (arg0 >> 8);
        this.field4380[this.field4381++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method1962(Buffer arg0) {
        this.method1963(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method1963(Buffer arg0, int arg1, int arg2) {
        this.method1955();
        this.field4378 = arg1;
        this.field4379 = arg1 + arg2;
        this.field4382 = arg0;
        if (this.field4379 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method1964() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method1965(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4380.length <= (this.field4381 + 3)) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) arg0;
        this.field4380[this.field4381++] = (byte) arg1;
        this.field4380[this.field4381++] = (byte) arg2;
        this.field4380[this.field4381++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method1966(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4380.length <= this.field4381 + 3) {
            this.method1955();
        }
        this.field4380[this.field4381++] = (byte) arg2;
        this.field4380[this.field4381++] = (byte) arg1;
        this.field4380[this.field4381++] = (byte) arg0;
        this.field4380[this.field4381++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field4380 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method1967() {
        return this.field4381 + this.field4378;
    }
}
