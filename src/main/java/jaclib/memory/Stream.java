package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "[B")
    private byte[] field9179;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9175;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9177;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9178;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9176;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3779(int arg0) {
        if ((this.field9177 + 1) >= this.field9179.length) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) arg0;
        this.field9179[this.field9177++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3780(float arg0) {
        if (this.field9179.length <= this.field9177 + 3) {
            this.method3784();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9179[this.field9177++] = (byte) (var2 >> 24);
        this.field9179[this.field9177++] = (byte) (var2 >> 16);
        this.field9179[this.field9177++] = (byte) (var2 >> 8);
        this.field9179[this.field9177++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3781(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field9177 + 3) >= this.field9179.length) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) arg0;
        this.field9179[this.field9177++] = (byte) arg1;
        this.field9179[this.field9177++] = (byte) arg2;
        this.field9179[this.field9177++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3782(Buffer arg0) {
        this.method3785(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3783(int arg0) {
        if ((this.field9177 + 3) >= this.field9179.length) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) arg0;
        this.field9179[this.field9177++] = (byte) (arg0 >> 8);
        this.field9179[this.field9177++] = (byte) (arg0 >> 16);
        this.field9179[this.field9177++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3784() {
        if (this.field9177 <= 0) {
            return;
        }
        if (this.field9175 < this.field9178 + this.field9177) {
            throw new RuntimeException();
        }
        this.field9176.method2856(this.field9179, 0, this.field9178, this.field9177);
        this.field9178 += this.field9177;
        this.field9177 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3785(Buffer arg0, int arg1, int arg2) {
        this.method3784();
        this.field9175 = arg1 + arg2;
        this.field9178 = arg1;
        this.field9176 = arg0;
        if (this.field9175 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3786(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9179.length <= (this.field9177 + 3)) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) arg2;
        this.field9179[this.field9177++] = (byte) arg1;
        this.field9179[this.field9177++] = (byte) arg0;
        this.field9179[this.field9177++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3787(int arg0) {
        if (this.field9179.length <= (this.field9177 + 3)) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) (arg0 >> 16);
        this.field9179[this.field9177++] = (byte) (arg0 >> 8);
        this.field9179[this.field9177++] = (byte) arg0;
        this.field9179[this.field9177++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3788() {
        return this.field9178 + this.field9177;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3789() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3790(int arg0) {
        if (this.field9179.length <= (this.field9177 + 1)) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) (arg0 >> 8);
        this.field9179[this.field9177++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3791(int arg0) {
        this.method3784();
        this.field9178 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3792(float arg0) {
        if (this.field9179.length <= this.field9177 + 3) {
            this.method3784();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9179[this.field9177++] = (byte) var2;
        this.field9179[this.field9177++] = (byte) (var2 >> 8);
        this.field9179[this.field9177++] = (byte) (var2 >> 16);
        this.field9179[this.field9177++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3793(int arg0) {
        if (this.field9177 >= this.field9179.length) {
            this.method3784();
        }
        this.field9179[this.field9177++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3785(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9179 = new byte[arg0];
    }
}
