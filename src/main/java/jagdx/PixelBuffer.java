package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class671;
import jaclib.peer.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/PixelBuffer")
public class PixelBuffer extends class672 implements Buffer {

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([IIII)V", line = 6)
    public final void method2901(int[] arg0, int arg1, int arg2, int arg3) {
        if ((arg2 < 0 | arg0.length < (arg1 + arg3) | arg1 < 0 | arg0 == null) || arg2 + (arg3 * 4) > this.getSize()) {
            throw new class483();
        }
        this.geti(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "a", descriptor = "([BIII)V", line = 20)
    public final void method2899(byte[] arg0, int arg1, int arg2, int arg3) {
        if ((arg0.length < arg1 + arg3 | arg1 < 0 | arg0 == null | arg2 < 0) || arg2 + arg3 > this.getSize()) {
            throw new class483();
        }
        this.putub(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "b", descriptor = "([IIII)V", line = 32)
    public final void method2902(int[] arg0, int arg1, int arg2, int arg3) {
        if ((arg2 < 0 | arg0.length < arg1 + arg3 | arg1 < 0 | arg0 == null) || this.getSize() < arg3 * 4 + arg2) {
            throw new class483();
        }
        this.puti(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "<init>", descriptor = "(Ljaclib/peer/faa;)V", line = 43)
    public PixelBuffer(class671 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getAddress", descriptor = "()J", line = 53)
    public final long getAddress() {
        return 0L;
    }

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "geti", descriptor = "([IIII)V")
    private final native void geti(int[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "puti", descriptor = "([IIII)V")
    private final native void puti(int[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getub", descriptor = "([BIII)V")
    private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getRowPitch", descriptor = "()I")
    public final native int getRowPitch();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSlicePitch", descriptor = "()I")
    public final native int getSlicePitch();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "getSize", descriptor = "()I")
    public final native int getSize();

    @OriginalMember(owner = "client!jagdx/PixelBuffer", name = "putub", descriptor = "([BIII)V")
    private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);
}
