package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class699;
import jaclib.peer.class700;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/PixelBuffer")
public class PixelBuffer extends class700 implements Buffer {

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([IIII)V", line = 6)
    public final void method2974(int[] arg0, int arg1, int arg2, int arg3) {
        if ((arg1 + arg3 > arg0.length | arg1 < 0 | arg0 == null | arg2 < 0) || (arg3 * 4 + arg2) > this.getSize()) {
            throw new class506();
        }
        this.puti(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "<init>", descriptor = "(Ljaclib/peer/in;)V", line = 15)
    public PixelBuffer(class699 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "b", descriptor = "([IIII)V", line = 25)
    public final void method2975(int[] arg0, int arg1, int arg2, int arg3) {
        if ((arg0.length < arg1 + arg3 | arg1 < 0 | arg0 == null | arg2 < 0) || arg2 + (arg3 * 4) > this.getSize()) {
            throw new class506();
        }
        this.geti(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([BIII)V", line = 35)
    public final void method2972(byte[] arg0, int arg1, int arg2, int arg3) {
        if ((arg2 < 0 | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length) || (arg2 + arg3) > this.getSize()) {
            throw new class506();
        }
        this.putub(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getAddress", descriptor = "()J", line = 52)
    public final long getAddress() {
        return 0L;
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "geti", descriptor = "([IIII)V")
    private final native void geti(int[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "puti", descriptor = "([IIII)V")
    private final native void puti(int[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSize", descriptor = "()I")
    public final native int getSize();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSlicePitch", descriptor = "()I")
    public final native int getSlicePitch();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "putub", descriptor = "([BIII)V")
    private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getub", descriptor = "([BIII)V")
    private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getRowPitch", descriptor = "()I")
    public final native int getRowPitch();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "init", descriptor = "()V")
    private final native void init();
}
