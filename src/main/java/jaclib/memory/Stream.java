package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8806;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8805;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8807;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8808;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8804;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3618(int arg0) {
        this.method3626();
        this.field8807 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3619(int arg0) {
        if (this.field8808 + 3 >= this.field8806.length) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) arg0;
        this.field8806[this.field8808++] = (byte) (arg0 >> 8);
        this.field8806[this.field8808++] = (byte) (arg0 >> 16);
        this.field8806[this.field8808++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method3620() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3621(float arg0) {
        if ((this.field8808 + 3) >= this.field8806.length) {
            this.method3626();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8806[this.field8808++] = (byte) (var2 >> 24);
        this.field8806[this.field8808++] = (byte) (var2 >> 16);
        this.field8806[this.field8808++] = (byte) (var2 >> 8);
        this.field8806[this.field8808++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3622() {
        return this.field8808 + this.field8807;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3623(int arg0) {
        if ((this.field8808 + 1) >= this.field8806.length) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) arg0;
        this.field8806[this.field8808++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3624(Buffer arg0) {
        this.method3629(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3625(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8806.length <= this.field8808 + 3) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) arg0;
        this.field8806[this.field8808++] = (byte) arg1;
        this.field8806[this.field8808++] = (byte) arg2;
        this.field8806[this.field8808++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method3626() {
        if (this.field8808 <= 0) {
            return;
        }
        if ((this.field8808 + this.field8807) > this.field8805) {
            throw new RuntimeException();
        }
        this.field8804.method2834(this.field8806, 0, this.field8807, this.field8808);
        this.field8807 += this.field8808;
        this.field8808 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3629(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3627(int arg0) {
        if (this.field8806.length <= this.field8808 + 3) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) (arg0 >> 16);
        this.field8806[this.field8808++] = (byte) (arg0 >> 8);
        this.field8806[this.field8808++] = (byte) arg0;
        this.field8806[this.field8808++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3628(int arg0) {
        if (this.field8806.length <= this.field8808 + 1) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) (arg0 >> 8);
        this.field8806[this.field8808++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3629(Buffer arg0, int arg1, int arg2) {
        this.method3626();
        this.field8804 = arg0;
        this.field8807 = arg1;
        this.field8805 = arg1 + arg2;
        if (this.field8805 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8806 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3630(float arg0) {
        if (this.field8808 + 3 >= this.field8806.length) {
            this.method3626();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8806[this.field8808++] = (byte) var2;
        this.field8806[this.field8808++] = (byte) (var2 >> 8);
        this.field8806[this.field8808++] = (byte) (var2 >> 16);
        this.field8806[this.field8808++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3631(int arg0) {
        if (this.field8806.length <= this.field8808) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3632(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8808 + 3 >= this.field8806.length) {
            this.method3626();
        }
        this.field8806[this.field8808++] = (byte) arg2;
        this.field8806[this.field8808++] = (byte) arg1;
        this.field8806[this.field8808++] = (byte) arg0;
        this.field8806[this.field8808++] = (byte) arg3;
    }
}
