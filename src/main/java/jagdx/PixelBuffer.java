package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class577;
import jaclib.peer.class578;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/PixelBuffer")
public class PixelBuffer extends class577 implements Buffer {

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return 0L;
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSlicePitch", descriptor = "()I")
    public final native int getSlicePitch();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([IIII)V")
    public final void method2448(int[] arg0, int arg1, int arg2, int arg3) {
        if ((arg2 < 0 | arg0.length < (arg1 + arg3) | arg1 < 0 | arg0 == null) || (arg3 * 4 + arg2) > this.getSize()) {
            throw new class409();
        }
        this.geti(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "<init>", descriptor = "(Ljaclib/peer/fk;)V")
    public PixelBuffer(class578 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([BIII)V")
    public final void method2446(byte[] arg0, int arg1, int arg2, int arg3) {
        if ((arg1 < 0 | arg0 == null | arg0.length < (arg1 + arg3) | arg2 < 0) || this.getSize() < (arg2 + arg3)) {
            throw new class409();
        }
        this.putub(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "geti", descriptor = "([IIII)V")
    private final native void geti(int[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getub", descriptor = "([BIII)V")
    private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSize", descriptor = "()I")
    public final native int getSize();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "putub", descriptor = "([BIII)V")
    private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "puti", descriptor = "([IIII)V")
    private final native void puti(int[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getRowPitch", descriptor = "()I")
    public final native int getRowPitch();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "b", descriptor = "([IIII)V")
    public final void method2449(int[] arg0, int arg1, int arg2, int arg3) {
        if ((arg2 < 0 | arg1 < 0 | arg0 == null | (arg1 + arg3) > arg0.length) || arg3 * 4 + arg2 > this.getSize()) {
            throw new class409();
        }
        this.puti(arg0, arg1, arg2, arg3);
    }
}
