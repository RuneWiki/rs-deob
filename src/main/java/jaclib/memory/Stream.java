package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field9390;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field9388;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field9389;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field9392;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field9391;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3761() {
        if (this.field9389 <= 0) {
            return;
        }
        if ((this.field9392 + this.field9389) > this.field9388) {
            throw new RuntimeException();
        }
        this.field9391.method2905(this.field9390, 0, this.field9392, this.field9389);
        this.field9392 += this.field9389;
        this.field9389 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method3762() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3763(int arg0) {
        if (this.field9390.length <= (this.field9389 + 3)) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) (arg0 >> 16);
        this.field9390[this.field9389++] = (byte) (arg0 >> 8);
        this.field9390[this.field9389++] = (byte) arg0;
        this.field9390[this.field9389++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3764(int arg0) {
        if (this.field9390.length <= this.field9389 + 3) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) arg0;
        this.field9390[this.field9389++] = (byte) (arg0 >> 8);
        this.field9390[this.field9389++] = (byte) (arg0 >> 16);
        this.field9390[this.field9389++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3765(Buffer arg0, int arg1, int arg2) {
        this.method3761();
        this.field9391 = arg0;
        this.field9388 = arg1 + arg2;
        this.field9392 = arg1;
        if (this.field9388 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3766(int arg0) {
        if ((this.field9389 + 1) >= this.field9390.length) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) (arg0 >> 8);
        this.field9390[this.field9389++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3767(Buffer arg0) {
        this.method3765(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3768(int arg0) {
        if ((this.field9389 + 1) >= this.field9390.length) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) arg0;
        this.field9390[this.field9389++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method3769() {
        return this.field9392 + this.field9389;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3770(float arg0) {
        if ((this.field9389 + 3) >= this.field9390.length) {
            this.method3761();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9390[this.field9389++] = (byte) var2;
        this.field9390[this.field9389++] = (byte) (var2 >> 8);
        this.field9390[this.field9389++] = (byte) (var2 >> 16);
        this.field9390[this.field9389++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3771(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9390.length <= this.field9389 + 3) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) arg0;
        this.field9390[this.field9389++] = (byte) arg1;
        this.field9390[this.field9389++] = (byte) arg2;
        this.field9390[this.field9389++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3772(int arg0) {
        if (this.field9390.length <= this.field9389) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3773(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9390.length <= (this.field9389 + 3)) {
            this.method3761();
        }
        this.field9390[this.field9389++] = (byte) arg2;
        this.field9390[this.field9389++] = (byte) arg1;
        this.field9390[this.field9389++] = (byte) arg0;
        this.field9390[this.field9389++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3765(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3774(float arg0) {
        if (this.field9390.length <= (this.field9389 + 3)) {
            this.method3761();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field9390[this.field9389++] = (byte) (var2 >> 24);
        this.field9390[this.field9389++] = (byte) (var2 >> 16);
        this.field9390[this.field9389++] = (byte) (var2 >> 8);
        this.field9390[this.field9389++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field9390 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3775(int arg0) {
        this.method3761();
        this.field9392 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
