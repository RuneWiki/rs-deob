package jagdx;

import jaclib.peer.class570;
import jaclib.peer.class571;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/VertexElementCollection")
public class VertexElementCollection extends class571 {

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "<init>", descriptor = "(Ljaclib/peer/pb;)V", line = 7)
    public VertexElementCollection(class570 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "addElement", descriptor = "(IIIIII)V")
    public final native void addElement(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "finish", descriptor = "()V")
    public final native void finish();

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "reset", descriptor = "()V")
    public final native void reset();

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "init", descriptor = "()V")
    private final native void init();
}
