package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field9262;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9263;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field9264;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field9265;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9266;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3795(int arg0) {
        if (this.field9262.length <= this.field9265 + 1) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) (arg0 >> 8);
        this.field9262[this.field9265++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3796(int arg0) {
        if (this.field9262.length <= this.field9265 + 3) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) (arg0 >> 16);
        this.field9262[this.field9265++] = (byte) (arg0 >> 8);
        this.field9262[this.field9265++] = (byte) arg0;
        this.field9262[this.field9265++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3797() {
        if (this.field9265 <= 0) {
            return;
        }
        if (this.field9265 + this.field9264 > this.field9263) {
            throw new RuntimeException();
        }
        this.field9266.method2976(this.field9262, 0, this.field9264, this.field9265);
        this.field9264 += this.field9265;
        this.field9265 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3798() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3799(int arg0) {
        if (this.field9265 >= this.field9262.length) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3800(float arg0) {
        if (this.field9262.length <= this.field9265 + 3) {
            this.method3797();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9262[this.field9265++] = (byte) (var2 >> 24);
        this.field9262[this.field9265++] = (byte) (var2 >> 16);
        this.field9262[this.field9265++] = (byte) (var2 >> 8);
        this.field9262[this.field9265++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3805(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3801() {
        return this.field9265 + this.field9264;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3802(int arg0) {
        this.method3797();
        this.field9264 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3803(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field9265 + 3) >= this.field9262.length) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) arg0;
        this.field9262[this.field9265++] = (byte) arg1;
        this.field9262[this.field9265++] = (byte) arg2;
        this.field9262[this.field9265++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3804(int arg0) {
        if (this.field9265 + 1 >= this.field9262.length) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) arg0;
        this.field9262[this.field9265++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3805(Buffer arg0, int arg1, int arg2) {
        this.method3797();
        this.field9263 = arg1 + arg2;
        this.field9264 = arg1;
        this.field9266 = arg0;
        if (this.field9263 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3806(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9265 + 3 >= this.field9262.length) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) arg2;
        this.field9262[this.field9265++] = (byte) arg1;
        this.field9262[this.field9265++] = (byte) arg0;
        this.field9262[this.field9265++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3807(int arg0) {
        if ((this.field9265 + 3) >= this.field9262.length) {
            this.method3797();
        }
        this.field9262[this.field9265++] = (byte) arg0;
        this.field9262[this.field9265++] = (byte) (arg0 >> 8);
        this.field9262[this.field9265++] = (byte) (arg0 >> 16);
        this.field9262[this.field9265++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3808(Buffer arg0) {
        this.method3805(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3809(float arg0) {
        if (this.field9262.length <= this.field9265 + 3) {
            this.method3797();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9262[this.field9265++] = (byte) var2;
        this.field9262[this.field9265++] = (byte) (var2 >> 8);
        this.field9262[this.field9265++] = (byte) (var2 >> 16);
        this.field9262[this.field9265++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9262 = new byte[arg0];
    }
}
