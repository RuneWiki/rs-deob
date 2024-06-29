package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field9738;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9735;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9736;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field9739;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9737;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3942(Buffer arg0) {
        this.method3946(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3943(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9738.length <= this.field9735 + 3) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) arg0;
        this.field9738[this.field9735++] = (byte) arg1;
        this.field9738[this.field9735++] = (byte) arg2;
        this.field9738[this.field9735++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method3944() {
        return this.field9739 + this.field9735;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
    public final void method3945() {
        if (this.field9735 <= 0) {
            return;
        }
        if ((this.field9739 + this.field9735) > this.field9736) {
            throw new RuntimeException();
        }
        this.field9737.method3078(this.field9738, 0, this.field9739, this.field9735);
        this.field9739 += this.field9735;
        this.field9735 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3946(Buffer arg0, int arg1, int arg2) {
        this.method3945();
        this.field9737 = arg0;
        this.field9739 = arg1;
        this.field9736 = arg1 + arg2;
        if (this.field9736 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3947(int arg0) {
        if (this.field9738.length <= (this.field9735 + 1)) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) (arg0 >> 8);
        this.field9738[this.field9735++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3948(int arg0) {
        this.method3945();
        this.field9739 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3949(float arg0) {
        if (this.field9738.length <= (this.field9735 + 3)) {
            this.method3945();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9738[this.field9735++] = (byte) var2;
        this.field9738[this.field9735++] = (byte) (var2 >> 8);
        this.field9738[this.field9735++] = (byte) (var2 >> 16);
        this.field9738[this.field9735++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3950(int arg0) {
        if ((this.field9735 + 3) >= this.field9738.length) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) arg0;
        this.field9738[this.field9735++] = (byte) (arg0 >> 8);
        this.field9738[this.field9735++] = (byte) (arg0 >> 16);
        this.field9738[this.field9735++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3951(int arg0) {
        if (this.field9735 + 3 >= this.field9738.length) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) (arg0 >> 16);
        this.field9738[this.field9735++] = (byte) (arg0 >> 8);
        this.field9738[this.field9735++] = (byte) arg0;
        this.field9738[this.field9735++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3946(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3952(float arg0) {
        if (this.field9738.length <= (this.field9735 + 3)) {
            this.method3945();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9738[this.field9735++] = (byte) (var2 >> 24);
        this.field9738[this.field9735++] = (byte) (var2 >> 16);
        this.field9738[this.field9735++] = (byte) (var2 >> 8);
        this.field9738[this.field9735++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3953() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3954(int arg0) {
        if (this.field9738.length <= this.field9735 + 1) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) arg0;
        this.field9738[this.field9735++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3955(int arg0) {
        if (this.field9735 >= this.field9738.length) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3956(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9738.length <= (this.field9735 + 3)) {
            this.method3945();
        }
        this.field9738[this.field9735++] = (byte) arg2;
        this.field9738[this.field9735++] = (byte) arg1;
        this.field9738[this.field9735++] = (byte) arg0;
        this.field9738[this.field9735++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9738 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
