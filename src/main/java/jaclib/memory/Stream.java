package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field7966;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field7963;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field7965;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field7967;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field7964;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3197(float arg0) {
        if (this.field7966.length <= this.field7965 + 3) {
            this.method3207();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7966[this.field7965++] = (byte) (var2 >> 24);
        this.field7966[this.field7965++] = (byte) (var2 >> 16);
        this.field7966[this.field7965++] = (byte) (var2 >> 8);
        this.field7966[this.field7965++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3198(int arg0) {
        if (this.field7965 + 1 >= this.field7966.length) {
            this.method3207();
        }
        this.field7966[this.field7965++] = (byte) (arg0 >> 8);
        this.field7966[this.field7965++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3199(int arg0) {
        if ((this.field7965 + 3) >= this.field7966.length) {
            this.method3207();
        }
        this.field7966[this.field7965++] = (byte) arg0;
        this.field7966[this.field7965++] = (byte) (arg0 >> 8);
        this.field7966[this.field7965++] = (byte) (arg0 >> 16);
        this.field7966[this.field7965++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3200(int arg0) {
        if (this.field7966.length <= (this.field7965 + 3)) {
            this.method3207();
        }
        this.field7966[this.field7965++] = (byte) (arg0 >> 16);
        this.field7966[this.field7965++] = (byte) (arg0 >> 8);
        this.field7966[this.field7965++] = (byte) arg0;
        this.field7966[this.field7965++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3208(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3201(Buffer arg0) {
        this.method3208(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
    public final int method3202() {
        return this.field7965 + this.field7963;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field7966 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3203(int arg0) {
        if (this.field7966.length <= this.field7965 + 1) {
            this.method3207();
        }
        this.field7966[this.field7965++] = (byte) arg0;
        this.field7966[this.field7965++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3204(int arg0) {
        this.method3207();
        this.field7963 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3205(int arg0) {
        if (this.field7965 >= this.field7966.length) {
            this.method3207();
        }
        this.field7966[this.field7965++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3206(float arg0) {
        if (this.field7966.length <= (this.field7965 + 3)) {
            this.method3207();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field7966[this.field7965++] = (byte) var2;
        this.field7966[this.field7965++] = (byte) (var2 >> 8);
        this.field7966[this.field7965++] = (byte) (var2 >> 16);
        this.field7966[this.field7965++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V")
    public final void method3207() {
        if (this.field7965 <= 0) {
            return;
        }
        if (this.field7965 + this.field7963 > this.field7967) {
            throw new RuntimeException();
        }
        this.field7964.method2375(this.field7966, 0, this.field7963, this.field7965);
        this.field7963 += this.field7965;
        this.field7965 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3208(Buffer arg0, int arg1, int arg2) {
        this.method3207();
        this.field7963 = arg1;
        this.field7967 = arg1 + arg2;
        this.field7964 = arg0;
        if (this.field7967 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3209() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
