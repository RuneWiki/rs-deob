package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "[B")
    private byte[] field5997;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field5994;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field5995;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field5996;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z", line = 4)
    public static final boolean method2551() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 13)
    public final void method2552(int arg0) {
        if (this.field5997.length <= this.field5998 + 3) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) (arg0 >> 16);
        this.field5997[this.field5998++] = (byte) (arg0 >> 8);
        this.field5997[this.field5998++] = (byte) arg0;
        this.field5997[this.field5998++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 26)
    public final void method2553(int arg0) {
        this.method2554();
        this.field5995 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 37)
    public final void method2554() {
        if (this.field5998 <= 0) {
            return;
        }
        if (this.field5994 < this.field5998 + this.field5995) {
            throw new RuntimeException();
        }
        this.field5996.method2566(this.field5997, 0, this.field5995, this.field5998);
        this.field5995 += this.field5998;
        this.field5998 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 54)
    public final void method2555(int arg0) {
        if (this.field5997.length <= this.field5998) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 65)
    public final void method2556(Buffer arg0) {
        this.method2559(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 72)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2559(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 80)
    public final void method2557(float arg0) {
        if (this.field5997.length <= (this.field5998 + 3)) {
            this.method2554();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5997[this.field5998++] = (byte) (var2 >> 24);
        this.field5997[this.field5998++] = (byte) (var2 >> 16);
        this.field5997[this.field5998++] = (byte) (var2 >> 8);
        this.field5997[this.field5998++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 97)
    public final void method2558(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5997.length <= this.field5998 + 3) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) arg2;
        this.field5997[this.field5998++] = (byte) arg1;
        this.field5997[this.field5998++] = (byte) arg0;
        this.field5997[this.field5998++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 111)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 114)
    private final void method2559(Buffer arg0, int arg1, int arg2) {
        this.method2554();
        this.field5994 = arg1 + arg2;
        this.field5996 = arg0;
        this.field5995 = arg1;
        if (this.field5994 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 127)
    public final void method2560(int arg0) {
        if (this.field5997.length <= (this.field5998 + 1)) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) arg0;
        this.field5997[this.field5998++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 139)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 143)
    public final void method2561(int arg0) {
        if (this.field5998 + 1 >= this.field5997.length) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) (arg0 >> 8);
        this.field5997[this.field5998++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 155)
    public final void method2562(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5998 + 3 >= this.field5997.length) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) arg0;
        this.field5997[this.field5998++] = (byte) arg1;
        this.field5997[this.field5998++] = (byte) arg2;
        this.field5997[this.field5998++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 168)
    public final void method2563(int arg0) {
        if ((this.field5998 + 3) >= this.field5997.length) {
            this.method2554();
        }
        this.field5997[this.field5998++] = (byte) arg0;
        this.field5997[this.field5998++] = (byte) (arg0 >> 8);
        this.field5997[this.field5998++] = (byte) (arg0 >> 16);
        this.field5997[this.field5998++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 183)
    public final void method2564(float arg0) {
        if (this.field5997.length <= (this.field5998 + 3)) {
            this.method2554();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field5997[this.field5998++] = (byte) var2;
        this.field5997[this.field5998++] = (byte) (var2 >> 8);
        this.field5997[this.field5998++] = (byte) (var2 >> 16);
        this.field5997[this.field5998++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 198)
    private Stream(int arg0) {
        this.field5997 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 206)
    public final int method2565() {
        return this.field5998 + this.field5995;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);
}
