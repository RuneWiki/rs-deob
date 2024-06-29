package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "[B")
    private byte[] field8440;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8442;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field8443;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8444;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8441;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3325(Buffer arg0) {
        this.method3327(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3326(float arg0) {
        if (this.field8440.length <= (this.field8442 + 3)) {
            this.method3332();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8440[this.field8442++] = (byte) (var2 >> 24);
        this.field8440[this.field8442++] = (byte) (var2 >> 16);
        this.field8440[this.field8442++] = (byte) (var2 >> 8);
        this.field8440[this.field8442++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3327(Buffer arg0, int arg1, int arg2) {
        this.method3332();
        this.field8444 = arg1 + arg2;
        this.field8443 = arg1;
        this.field8441 = arg0;
        if (this.field8444 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z")
    public static final boolean method3328() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3329(int arg0) {
        this.method3332();
        this.field8443 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3330(int arg0) {
        if (this.field8440.length <= this.field8442) {
            this.method3332();
        }
        this.field8440[this.field8442++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3331() {
        return this.field8443 + this.field8442;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()V")
    public final void method3332() {
        if (this.field8442 <= 0) {
            return;
        }
        if (this.field8443 + this.field8442 > this.field8444) {
            throw new RuntimeException();
        }
        this.field8441.method2380(this.field8440, 0, this.field8443, this.field8442);
        this.field8443 += this.field8442;
        this.field8442 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3333(float arg0) {
        if ((this.field8442 + 3) >= this.field8440.length) {
            this.method3332();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8440[this.field8442++] = (byte) var2;
        this.field8440[this.field8442++] = (byte) (var2 >> 8);
        this.field8440[this.field8442++] = (byte) (var2 >> 16);
        this.field8440[this.field8442++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
        this.method3327(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3334(int arg0) {
        if (this.field8440.length <= this.field8442 + 3) {
            this.method3332();
        }
        this.field8440[this.field8442++] = (byte) (arg0 >> 16);
        this.field8440[this.field8442++] = (byte) (arg0 >> 8);
        this.field8440[this.field8442++] = (byte) arg0;
        this.field8440[this.field8442++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3335(int arg0) {
        if (this.field8442 + 3 >= this.field8440.length) {
            this.method3332();
        }
        this.field8440[this.field8442++] = (byte) arg0;
        this.field8440[this.field8442++] = (byte) (arg0 >> 8);
        this.field8440[this.field8442++] = (byte) (arg0 >> 16);
        this.field8440[this.field8442++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3336(int arg0) {
        if (this.field8442 + 1 >= this.field8440.length) {
            this.method3332();
        }
        this.field8440[this.field8442++] = (byte) arg0;
        this.field8440[this.field8442++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3337(int arg0) {
        if ((this.field8442 + 1) >= this.field8440.length) {
            this.method3332();
        }
        this.field8440[this.field8442++] = (byte) (arg0 >> 8);
        this.field8440[this.field8442++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8440 = new byte[arg0];
    }
}
