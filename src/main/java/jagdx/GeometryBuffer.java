package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class674;
import jaclib.peer.class675;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/GeometryBuffer")
public class GeometryBuffer extends class675 implements Buffer {

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "a", descriptor = "([BIII)V", line = 8)
    public final void method2885(byte[] arg0, int arg1, int arg2, int arg3) {
        if ((arg0 == null | arg1 < 0 | arg0.length < (arg1 + arg3) | arg2 < 0) || this.getSize() < (arg2 + arg3)) {
            throw new class487();
        }
        this.putub(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "<init>", descriptor = "(Ljaclib/peer/gca;)V", line = 17)
    public GeometryBuffer(class674 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getAddress", descriptor = "()J")
    public final native long getAddress();

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getub", descriptor = "([BIII)V")
    private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "getSize", descriptor = "()I")
    public final native int getSize();

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "putub", descriptor = "([BIII)V")
    private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/GeometryBuffer", name = "init", descriptor = "()V")
    private final native void init();
}
