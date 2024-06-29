package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8543;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8541;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8544;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8545;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8542;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 4)
    public final void method3517(float arg0) {
        if (this.field8543.length <= (this.field8545 + 3)) {
            this.method3530();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8543[this.field8545++] = (byte) (var2 >> 24);
        this.field8543[this.field8545++] = (byte) (var2 >> 16);
        this.field8543[this.field8545++] = (byte) (var2 >> 8);
        this.field8543[this.field8545++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 19)
    public final void method3518(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8543.length <= (this.field8545 + 3)) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) arg2;
        this.field8543[this.field8545++] = (byte) arg1;
        this.field8543[this.field8545++] = (byte) arg0;
        this.field8543[this.field8545++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 33)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 37)
    public final void method3519(int arg0) {
        if (this.field8545 + 1 >= this.field8543.length) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) arg0;
        this.field8543[this.field8545++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 49)
    private final void method3520(Buffer arg0, int arg1, int arg2) {
        this.method3530();
        this.field8544 = arg1;
        this.field8541 = arg1 + arg2;
        this.field8542 = arg0;
        if (this.field8541 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 63)
    public final void method3521(int arg0) {
        if (this.field8543.length <= this.field8545) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 73)
    public final void method3522(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8545 + 3 >= this.field8543.length) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) arg0;
        this.field8543[this.field8545++] = (byte) arg1;
        this.field8543[this.field8545++] = (byte) arg2;
        this.field8543[this.field8545++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I", line = 87)
    public final int method3523() {
        return this.field8544 + this.field8545;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 95)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3520(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 104)
    public final void method3524(Buffer arg0) {
        this.method3520(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z", line = 113)
    public static final boolean method3525() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 120)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 123)
    public final void method3526(int arg0) {
        if (this.field8543.length <= this.field8545 + 1) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) (arg0 >> 8);
        this.field8543[this.field8545++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 135)
    public final void method3527(float arg0) {
        if (this.field8543.length <= (this.field8545 + 3)) {
            this.method3530();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8543[this.field8545++] = (byte) var2;
        this.field8543[this.field8545++] = (byte) (var2 >> 8);
        this.field8543[this.field8545++] = (byte) (var2 >> 16);
        this.field8543[this.field8545++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 150)
    public final void method3528(int arg0) {
        if (this.field8543.length <= (this.field8545 + 3)) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) arg0;
        this.field8543[this.field8545++] = (byte) (arg0 >> 8);
        this.field8543[this.field8545++] = (byte) (arg0 >> 16);
        this.field8543[this.field8545++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 165)
    public final void method3529(int arg0) {
        this.method3530();
        this.field8544 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V", line = 173)
    public final void method3530() {
        if (this.field8545 <= 0) {
            return;
        }
        if (this.field8545 + this.field8544 > this.field8541) {
            throw new RuntimeException();
        }
        this.field8542.method2480(this.field8543, 0, this.field8544, this.field8545);
        this.field8544 += this.field8545;
        this.field8545 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 190)
    public final void method3531(int arg0) {
        if (this.field8543.length <= (this.field8545 + 3)) {
            this.method3530();
        }
        this.field8543[this.field8545++] = (byte) (arg0 >> 16);
        this.field8543[this.field8545++] = (byte) (arg0 >> 8);
        this.field8543[this.field8545++] = (byte) arg0;
        this.field8543[this.field8545++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 203)
    private Stream(int arg0) {
        this.field8543 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
