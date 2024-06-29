package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field9878;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9879;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9880;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9881;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9882;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3948(int arg0) {
        if (this.field9880 + 3 >= this.field9878.length) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) arg0;
        this.field9878[this.field9880++] = (byte) (arg0 >> 8);
        this.field9878[this.field9880++] = (byte) (arg0 >> 16);
        this.field9878[this.field9880++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3949(float arg0) {
        if (this.field9880 + 3 >= this.field9878.length) {
            this.method3959();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9878[this.field9880++] = (byte) var2;
        this.field9878[this.field9880++] = (byte) (var2 >> 8);
        this.field9878[this.field9880++] = (byte) (var2 >> 16);
        this.field9878[this.field9880++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3950(int arg0) {
        if (this.field9878.length <= (this.field9880 + 1)) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) (arg0 >> 8);
        this.field9878[this.field9880++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3951(int arg0) {
        if (this.field9880 >= this.field9878.length) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3952(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3952(Buffer arg0, int arg1, int arg2) {
        this.method3959();
        this.field9879 = arg1 + arg2;
        this.field9882 = arg0;
        this.field9881 = arg1;
        if (this.field9879 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3953(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9878.length <= (this.field9880 + 3)) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) arg2;
        this.field9878[this.field9880++] = (byte) arg1;
        this.field9878[this.field9880++] = (byte) arg0;
        this.field9878[this.field9880++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3954(int arg0) {
        this.method3959();
        this.field9881 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3955(float arg0) {
        if (this.field9878.length <= (this.field9880 + 3)) {
            this.method3959();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9878[this.field9880++] = (byte) (var2 >> 24);
        this.field9878[this.field9880++] = (byte) (var2 >> 16);
        this.field9878[this.field9880++] = (byte) (var2 >> 8);
        this.field9878[this.field9880++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method3956() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3957(int arg0) {
        if ((this.field9880 + 3) >= this.field9878.length) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) (arg0 >> 16);
        this.field9878[this.field9880++] = (byte) (arg0 >> 8);
        this.field9878[this.field9880++] = (byte) arg0;
        this.field9878[this.field9880++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3958() {
        return this.field9881 + this.field9880;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method3959() {
        if (this.field9880 <= 0) {
            return;
        }
        if (this.field9881 + this.field9880 > this.field9879) {
            throw new RuntimeException();
        }
        this.field9882.method2972(this.field9878, 0, this.field9881, this.field9880);
        this.field9881 += this.field9880;
        this.field9880 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3960(Buffer arg0) {
        this.method3952(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9878 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3961(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9880 + 3 >= this.field9878.length) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) arg0;
        this.field9878[this.field9880++] = (byte) arg1;
        this.field9878[this.field9880++] = (byte) arg2;
        this.field9878[this.field9880++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3962(int arg0) {
        if ((this.field9880 + 1) >= this.field9878.length) {
            this.method3959();
        }
        this.field9878[this.field9880++] = (byte) arg0;
        this.field9878[this.field9880++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }
}
