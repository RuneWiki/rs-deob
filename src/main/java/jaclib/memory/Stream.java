package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field8754;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8755;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8756;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8757;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8758;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 4)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3482(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 13)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 16)
    public final void method3471() {
        if (this.field8757 <= 0) {
            return;
        }
        if (this.field8755 + this.field8757 > this.field8756) {
            throw new RuntimeException();
        }
        this.field8758.method2661(this.field8754, 0, this.field8755, this.field8757);
        this.field8755 += this.field8757;
        this.field8757 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 35)
    public final void method3472(int arg0) {
        if (this.field8754.length <= (this.field8757 + 1)) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) arg0;
        this.field8754[this.field8757++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 47)
    public final void method3473(int arg0) {
        this.method3471();
        this.field8755 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 56)
    public final void method3474(float arg0) {
        if (this.field8754.length <= this.field8757 + 3) {
            this.method3471();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8754[this.field8757++] = (byte) (var2 >> 24);
        this.field8754[this.field8757++] = (byte) (var2 >> 16);
        this.field8754[this.field8757++] = (byte) (var2 >> 8);
        this.field8754[this.field8757++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 72)
    public final void method3475(int arg0) {
        if (this.field8757 + 1 >= this.field8754.length) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) (arg0 >> 8);
        this.field8754[this.field8757++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 84)
    public final void method3476(float arg0) {
        if (this.field8754.length <= (this.field8757 + 3)) {
            this.method3471();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8754[this.field8757++] = (byte) var2;
        this.field8754[this.field8757++] = (byte) (var2 >> 8);
        this.field8754[this.field8757++] = (byte) (var2 >> 16);
        this.field8754[this.field8757++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 100)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 103)
    public final void method3477(Buffer arg0) {
        this.method3482(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 110)
    public final void method3478(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8754.length <= this.field8757 + 3) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) arg0;
        this.field8754[this.field8757++] = (byte) arg1;
        this.field8754[this.field8757++] = (byte) arg2;
        this.field8754[this.field8757++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 126)
    public final void method3479(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8754.length <= (this.field8757 + 3)) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) arg2;
        this.field8754[this.field8757++] = (byte) arg1;
        this.field8754[this.field8757++] = (byte) arg0;
        this.field8754[this.field8757++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 140)
    public final void method3480(int arg0) {
        if (this.field8754.length <= (this.field8757 + 3)) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) (arg0 >> 16);
        this.field8754[this.field8757++] = (byte) (arg0 >> 8);
        this.field8754[this.field8757++] = (byte) arg0;
        this.field8754[this.field8757++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 154)
    public final int method3481() {
        return this.field8757 + this.field8755;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 161)
    private final void method3482(Buffer arg0, int arg1, int arg2) {
        this.method3471();
        this.field8756 = arg1 + arg2;
        this.field8755 = arg1;
        this.field8758 = arg0;
        if (this.field8756 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 175)
    public static final boolean method3483() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 184)
    public final void method3484(int arg0) {
        if (this.field8754.length <= (this.field8757 + 3)) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) arg0;
        this.field8754[this.field8757++] = (byte) (arg0 >> 8);
        this.field8754[this.field8757++] = (byte) (arg0 >> 16);
        this.field8754[this.field8757++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 196)
    private Stream(int arg0) {
        this.field8754 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 204)
    public final void method3485(int arg0) {
        if (this.field8757 >= this.field8754.length) {
            this.method3471();
        }
        this.field8754[this.field8757++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
