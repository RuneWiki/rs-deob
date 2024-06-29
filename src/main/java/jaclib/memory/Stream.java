package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field5384;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field5383;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5386;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5382;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method2337(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5384.length <= (this.field5386 + 3)) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) arg0;
        this.field5384[this.field5386++] = (byte) arg1;
        this.field5384[this.field5386++] = (byte) arg2;
        this.field5384[this.field5386++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 20)
    public final void method2338(int arg0) {
        this.method2351();
        this.field5385 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 28)
    public final void method2339(int arg0) {
        if (this.field5386 + 1 >= this.field5384.length) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) (arg0 >> 8);
        this.field5384[this.field5386++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 40)
    public final void method2340(float arg0) {
        if (this.field5386 + 3 >= this.field5384.length) {
            this.method2351();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5384[this.field5386++] = (byte) (var2 >> 24);
        this.field5384[this.field5386++] = (byte) (var2 >> 16);
        this.field5384[this.field5386++] = (byte) (var2 >> 8);
        this.field5384[this.field5386++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 59)
    public final int method2341() {
        return this.field5386 + this.field5385;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 67)
    public final void method2342(Buffer arg0) {
        this.method2347(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 74)
    public final void method2343(int arg0) {
        if ((this.field5386 + 1) >= this.field5384.length) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) arg0;
        this.field5384[this.field5386++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 86)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 89)
    public final void method2344(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5384.length <= this.field5386 + 3) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) arg2;
        this.field5384[this.field5386++] = (byte) arg1;
        this.field5384[this.field5386++] = (byte) arg0;
        this.field5384[this.field5386++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 102)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2347(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 110)
    public final void method2345(int arg0) {
        if (this.field5384.length <= this.field5386) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 121)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 125)
    public static final boolean method2346() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 132)
    private final void method2347(Buffer arg0, int arg1, int arg2) {
        this.method2351();
        this.field5383 = arg1 + arg2;
        this.field5382 = arg0;
        this.field5385 = arg1;
        if (this.field5383 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 146)
    public final void method2348(int arg0) {
        if (this.field5384.length <= this.field5386 + 3) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) (arg0 >> 16);
        this.field5384[this.field5386++] = (byte) (arg0 >> 8);
        this.field5384[this.field5386++] = (byte) arg0;
        this.field5384[this.field5386++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 160)
    public final void method2349(int arg0) {
        if (this.field5386 + 3 >= this.field5384.length) {
            this.method2351();
        }
        this.field5384[this.field5386++] = (byte) arg0;
        this.field5384[this.field5386++] = (byte) (arg0 >> 8);
        this.field5384[this.field5386++] = (byte) (arg0 >> 16);
        this.field5384[this.field5386++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 175)
    public final void method2350(float arg0) {
        if (this.field5384.length <= this.field5386 + 3) {
            this.method2351();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5384[this.field5386++] = (byte) var2;
        this.field5384[this.field5386++] = (byte) (var2 >> 8);
        this.field5384[this.field5386++] = (byte) (var2 >> 16);
        this.field5384[this.field5386++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V", line = 191)
    public final void method2351() {
        if (this.field5386 <= 0) {
            return;
        }
        if (this.field5383 < this.field5386 + this.field5385) {
            throw new RuntimeException();
        }
        this.field5382.method120(this.field5384, 0, this.field5385, this.field5386);
        this.field5385 += this.field5386;
        this.field5386 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 209)
    private Stream(int arg0) {
        this.field5384 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
