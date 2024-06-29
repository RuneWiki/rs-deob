package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field8425;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8422;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8424;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8426;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8423;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V", line = 7)
    public final void method3411() {
        if (this.field8422 <= 0) {
            return;
        }
        if (this.field8424 + this.field8422 > this.field8426) {
            throw new RuntimeException();
        }
        this.field8423.method2635(this.field8425, 0, this.field8424, this.field8422);
        this.field8424 += this.field8422;
        this.field8422 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 23)
    public final void method3412(int arg0) {
        if (this.field8422 >= this.field8425.length) {
            this.method3411();
        }
        this.field8425[this.field8422++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 35)
    public final void method3413(int arg0) {
        if (this.field8425.length <= this.field8422 + 1) {
            this.method3411();
        }
        this.field8425[this.field8422++] = (byte) arg0;
        this.field8425[this.field8422++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 46)
    public final void method3414(int arg0) {
        if (this.field8425.length <= (this.field8422 + 1)) {
            this.method3411();
        }
        this.field8425[this.field8422++] = (byte) (arg0 >> 8);
        this.field8425[this.field8422++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 58)
    public final void method3415(float arg0) {
        if (this.field8425.length <= (this.field8422 + 3)) {
            this.method3411();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8425[this.field8422++] = (byte) (var2 >> 24);
        this.field8425[this.field8422++] = (byte) (var2 >> 16);
        this.field8425[this.field8422++] = (byte) (var2 >> 8);
        this.field8425[this.field8422++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 73)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 79)
    public final void method3416(float arg0) {
        if (this.field8422 + 3 >= this.field8425.length) {
            this.method3411();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8425[this.field8422++] = (byte) var2;
        this.field8425[this.field8422++] = (byte) (var2 >> 8);
        this.field8425[this.field8422++] = (byte) (var2 >> 16);
        this.field8425[this.field8422++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 94)
    public final void method3417(Buffer arg0) {
        this.method3419(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 103)
    public final void method3418(int arg0) {
        if (this.field8425.length <= (this.field8422 + 3)) {
            this.method3411();
        }
        this.field8425[this.field8422++] = (byte) arg0;
        this.field8425[this.field8422++] = (byte) (arg0 >> 8);
        this.field8425[this.field8422++] = (byte) (arg0 >> 16);
        this.field8425[this.field8422++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 116)
    private final void method3419(Buffer arg0, int arg1, int arg2) {
        this.method3411();
        this.field8426 = arg1 + arg2;
        this.field8423 = arg0;
        this.field8424 = arg1;
        if (this.field8426 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I", line = 130)
    public final int method3420() {
        return this.field8424 + this.field8422;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 137)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 140)
    public final void method3421(int arg0) {
        this.method3411();
        this.field8424 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 148)
    public final void method3422(int arg0) {
        if (this.field8425.length <= (this.field8422 + 3)) {
            this.method3411();
        }
        this.field8425[this.field8422++] = (byte) (arg0 >> 16);
        this.field8425[this.field8422++] = (byte) (arg0 >> 8);
        this.field8425[this.field8422++] = (byte) arg0;
        this.field8425[this.field8422++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z", line = 163)
    public static final boolean method3423() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 170)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3419(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 177)
    private Stream(int arg0) {
        this.field8425 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
