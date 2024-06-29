package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "[B")
    private byte[] field6156;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "I")
    private int field6154;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "I")
    private int field6157;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Ljaclib/memory/Buffer;")
    private Buffer field6158;

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()Z", line = 4)
    public static final boolean method2572() {
        return getLSB(-65536) == -1;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()V", line = 12)
    public final void method2573() {
        if (this.field6155 <= 0) {
            return;
        }
        if ((this.field6155 + this.field6154) > this.field6157) {
            throw new RuntimeException();
        }
        this.field6158.method2587(this.field6156, 0, this.field6154, this.field6155);
        this.field6154 += this.field6155;
        this.field6155 = 0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(I)V", line = 29)
    public final void method2574(int arg0) {
        if (this.field6155 >= this.field6156.length) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;)V", line = 42)
    public final void method2575(Buffer arg0) {
        this.method2578(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 49)
    public final void method2576(float arg0) {
        if (this.field6155 + 3 >= this.field6156.length) {
            this.method2573();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6156[this.field6155++] = (byte) (var2 >> 24);
        this.field6156[this.field6155++] = (byte) (var2 >> 16);
        this.field6156[this.field6155++] = (byte) (var2 >> 8);
        this.field6156[this.field6155++] = (byte) var2;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 65)
    public final int method2577() {
        return this.field6155 + this.field6154;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 73)
    private final void method2578(Buffer arg0, int arg1, int arg2) {
        this.method2573();
        this.field6154 = arg1;
        this.field6158 = arg0;
        this.field6157 = arg1 + arg2;
        if (this.field6157 > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 86)
    public final void method2579(float arg0) {
        if (this.field6156.length <= (this.field6155 + 3)) {
            this.method2573();
        }
        int var2 = floatToRawIntBits(arg0);
        this.field6156[this.field6155++] = (byte) var2;
        this.field6156[this.field6155++] = (byte) (var2 >> 8);
        this.field6156[this.field6155++] = (byte) (var2 >> 16);
        this.field6156[this.field6155++] = (byte) (var2 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(I)V", line = 104)
    public final void method2580(int arg0) {
        if (this.field6156.length <= (this.field6155 + 3)) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) (arg0 >> 16);
        this.field6156[this.field6155++] = (byte) (arg0 >> 8);
        this.field6156[this.field6155++] = (byte) arg0;
        this.field6156[this.field6155++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(I)V", line = 118)
    public final void method2581(int arg0) {
        this.method2573();
        this.field6154 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;)V", line = 126)
    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 129)
    public Stream() {
        this(4096);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Ljaclib/memory/Buffer;II)V", line = 132)
    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.method2578(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(IIII)V", line = 140)
    public final void method2582(int arg0, int arg1, int arg2, int arg3) {
        if ((this.field6155 + 3) >= this.field6156.length) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) arg2;
        this.field6156[this.field6155++] = (byte) arg1;
        this.field6156[this.field6155++] = (byte) arg0;
        this.field6156[this.field6155++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V", line = 155)
    public final void method2583(int arg0) {
        if (this.field6156.length <= this.field6155 + 3) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) arg0;
        this.field6156[this.field6155++] = (byte) (arg0 >> 8);
        this.field6156[this.field6155++] = (byte) (arg0 >> 16);
        this.field6156[this.field6155++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V", line = 168)
    public final void method2584(int arg0) {
        if (this.field6156.length <= (this.field6155 + 1)) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) arg0;
        this.field6156[this.field6155++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 180)
    private Stream(int arg0) {
        this.field6156 = new byte[arg0];
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(I)V", line = 188)
    public final void method2585(int arg0) {
        if ((this.field6155 + 1) >= this.field6156.length) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) (arg0 >> 8);
        this.field6156[this.field6155++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(IIII)V", line = 200)
    public final void method2586(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6156.length <= this.field6155 + 3) {
            this.method2573();
        }
        this.field6156[this.field6155++] = (byte) arg0;
        this.field6156[this.field6155++] = (byte) arg1;
        this.field6156[this.field6155++] = (byte) arg2;
        this.field6156[this.field6155++] = (byte) arg3;
    }

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
    public static final native int floatToRawIntBits(float arg0);

    @OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
    private static final native byte getLSB(int arg0);
}
