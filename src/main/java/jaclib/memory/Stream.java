package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field8779;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field8777;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "I")
    private int field8778;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field8780;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field8776;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V")
    public final void method3466(Buffer arg0) {
        this.method3476(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V")
    public final void method3467(int arg0) {
        if (this.field8779.length <= this.field8777 + 3) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) (arg0 >> 16);
        this.field8779[this.field8777++] = (byte) (arg0 >> 8);
        this.field8779[this.field8777++] = (byte) arg0;
        this.field8779[this.field8777++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V")
    public final void method3468(int arg0) {
        if (this.field8779.length <= (this.field8777 + 1)) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) (arg0 >> 8);
        this.field8779[this.field8777++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V")
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method3476(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
    public final void method3469(float arg0) {
        if (this.field8777 + 3 >= this.field8779.length) {
            this.method3472();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8779[this.field8777++] = (byte) (var2 >> 24);
        this.field8779[this.field8777++] = (byte) (var2 >> 16);
        this.field8779[this.field8777++] = (byte) (var2 >> 8);
        this.field8779[this.field8777++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V")
    public final void method3470(int arg0) {
        if (this.field8779.length <= (this.field8777 + 3)) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) arg0;
        this.field8779[this.field8777++] = (byte) (arg0 >> 8);
        this.field8779[this.field8777++] = (byte) (arg0 >> 16);
        this.field8779[this.field8777++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
    public final void method3471(int arg0) {
        if (this.field8777 >= this.field8779.length) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()V")
    public final void method3472() {
        if (this.field8777 <= 0) {
            return;
        }
        if (this.field8780 < (this.field8778 + this.field8777)) {
            throw new RuntimeException();
        }
        this.field8776.method2506(this.field8779, 0, this.field8778, this.field8777);
        this.field8778 += this.field8777;
        this.field8777 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V")
    public final void method3473(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field8777 + 3) >= this.field8779.length) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) arg2;
        this.field8779[this.field8777++] = (byte) arg1;
        this.field8779[this.field8777++] = (byte) arg0;
        this.field8779[this.field8777++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()I")
    public final int method3474() {
        return this.field8778 + this.field8777;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
    public final void method3475(float arg0) {
        if (this.field8777 + 3 >= this.field8779.length) {
            this.method3472();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field8779[this.field8777++] = (byte) var2;
        this.field8779[this.field8777++] = (byte) (var2 >> 8);
        this.field8779[this.field8777++] = (byte) (var2 >> 16);
        this.field8779[this.field8777++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V")
    private final void method3476(Buffer arg0, int arg1, int arg2) {
        this.method3472();
        this.field8776 = arg0;
        this.field8778 = arg1;
        this.field8780 = arg1 + arg2;
        if (this.field8780 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V")
    public final void method3477(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field8777 + 3) >= this.field8779.length) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) arg0;
        this.field8779[this.field8777++] = (byte) arg1;
        this.field8779[this.field8777++] = (byte) arg2;
        this.field8779[this.field8777++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
    public final void method3478(int arg0) {
        if (this.field8779.length <= this.field8777 + 1) {
            this.method3472();
        }
        this.field8779[this.field8777++] = (byte) arg0;
        this.field8779[this.field8777++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
    private Stream(int arg0) {
        this.field8779 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V")
    public final void method3479(int arg0) {
        this.method3472();
        this.field8778 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V")
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()Z")
    public static final boolean method3480() {
        return getLSB(-65536) == -1;
    }
}
