package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "[B")
    private byte[] field5137;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field5138;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field5139;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5140;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5136;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method2223() {
        if (this.field5140 <= 0) {
            return;
        }
        if (this.field5138 < this.field5140 + this.field5139) {
            throw new RuntimeException();
        }
        this.field5136.method281(this.field5137, 0, this.field5139, this.field5140);
        this.field5139 += this.field5140;
        this.field5140 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method2224(int arg0) {
        if (this.field5140 + 1 >= this.field5137.length) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) arg0;
        this.field5137[this.field5140++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method2225(int arg0) {
        if (this.field5137.length <= this.field5140 + 3) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) (arg0 >> 16);
        this.field5137[this.field5140++] = (byte) (arg0 >> 8);
        this.field5137[this.field5140++] = (byte) arg0;
        this.field5137[this.field5140++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
    public static final boolean method2226() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method2227(int arg0) {
        if (this.field5137.length <= this.field5140) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method2228(Buffer arg0, int arg1, int arg2) {
        this.method2223();
        this.field5138 = arg1 + arg2;
        this.field5136 = arg0;
        this.field5139 = arg1;
        if (this.field5138 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method2229(float arg0) {
        if (this.field5137.length <= this.field5140 + 3) {
            this.method2223();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5137[this.field5140++] = (byte) (var2 >> 24);
        this.field5137[this.field5140++] = (byte) (var2 >> 16);
        this.field5137[this.field5140++] = (byte) (var2 >> 8);
        this.field5137[this.field5140++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method2230(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5137.length <= (this.field5140 + 3)) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) arg2;
        this.field5137[this.field5140++] = (byte) arg1;
        this.field5137[this.field5140++] = (byte) arg0;
        this.field5137[this.field5140++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2228(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
    public final int method2231() {
        return this.field5140 + this.field5139;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method2232(int arg0) {
        if (this.field5137.length <= (this.field5140 + 3)) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) arg0;
        this.field5137[this.field5140++] = (byte) (arg0 >> 8);
        this.field5137[this.field5140++] = (byte) (arg0 >> 16);
        this.field5137[this.field5140++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method2233(int arg0) {
        if ((this.field5140 + 1) >= this.field5137.length) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) (arg0 >> 8);
        this.field5137[this.field5140++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method2234(int arg0) {
        this.method2223();
        this.field5139 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method2235(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5140 + 3 >= this.field5137.length) {
            this.method2223();
        }
        this.field5137[this.field5140++] = (byte) arg0;
        this.field5137[this.field5140++] = (byte) arg1;
        this.field5137[this.field5140++] = (byte) arg2;
        this.field5137[this.field5140++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method2236(Buffer arg0) {
        this.method2228(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method2237(float arg0) {
        if (this.field5137.length <= this.field5140 + 3) {
            this.method2223();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5137[this.field5140++] = (byte) var2;
        this.field5137[this.field5140++] = (byte) (var2 >> 8);
        this.field5137[this.field5140++] = (byte) (var2 >> 16);
        this.field5137[this.field5140++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field5137 = new byte[arg0];
    }
}
