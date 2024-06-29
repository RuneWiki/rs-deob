package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field8406;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field8404;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8405;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8408;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8407;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3337(int arg0) {
        if (this.field8404 >= this.field8406.length) {
            this.method3342();
        }
        this.field8406[this.field8404++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3338(int arg0) {
        this.method3342();
        this.field8405 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3339(int arg0) {
        if ((this.field8404 + 1) >= this.field8406.length) {
            this.method3342();
        }
        this.field8406[this.field8404++] = (byte) (arg0 >> 8);
        this.field8406[this.field8404++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method3340() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3341(int arg0) {
        if (this.field8406.length <= (this.field8404 + 1)) {
            this.method3342();
        }
        this.field8406[this.field8404++] = (byte) arg0;
        this.field8406[this.field8404++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3347(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
    public final void method3342() {
        if (this.field8404 <= 0) {
            return;
        }
        if (this.field8408 < this.field8405 + this.field8404) {
            throw new RuntimeException();
        }
        this.field8407.method2339(this.field8406, 0, this.field8405, this.field8404);
        this.field8405 += this.field8404;
        this.field8404 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3343() {
        return this.field8405 + this.field8404;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3344(float arg0) {
        if (this.field8406.length <= (this.field8404 + 3)) {
            this.method3342();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8406[this.field8404++] = (byte) var2;
        this.field8406[this.field8404++] = (byte) (var2 >> 8);
        this.field8406[this.field8404++] = (byte) (var2 >> 16);
        this.field8406[this.field8404++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3345(int arg0) {
        if (this.field8404 + 3 >= this.field8406.length) {
            this.method3342();
        }
        this.field8406[this.field8404++] = (byte) arg0;
        this.field8406[this.field8404++] = (byte) (arg0 >> 8);
        this.field8406[this.field8404++] = (byte) (arg0 >> 16);
        this.field8406[this.field8404++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3346(Buffer arg0) {
        this.method3347(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3347(Buffer arg0, int arg1, int arg2) {
        this.method3342();
        this.field8405 = arg1;
        this.field8408 = arg1 + arg2;
        this.field8407 = arg0;
        if (this.field8408 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3348(float arg0) {
        if (this.field8406.length <= (this.field8404 + 3)) {
            this.method3342();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8406[this.field8404++] = (byte) (var2 >> 24);
        this.field8406[this.field8404++] = (byte) (var2 >> 16);
        this.field8406[this.field8404++] = (byte) (var2 >> 8);
        this.field8406[this.field8404++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3349(int arg0) {
        if (this.field8406.length <= (this.field8404 + 3)) {
            this.method3342();
        }
        this.field8406[this.field8404++] = (byte) (arg0 >> 16);
        this.field8406[this.field8404++] = (byte) (arg0 >> 8);
        this.field8406[this.field8404++] = (byte) arg0;
        this.field8406[this.field8404++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8406 = new byte[arg0];
    }
}
