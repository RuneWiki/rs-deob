package jagdx;

import jaclib.peer.class621;
import jaclib.peer.class622;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/VertexElementCollection")
public class VertexElementCollection extends class621 {

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "<init>", descriptor = "(Ljaclib/peer/tc;)V", line = 6)
    public VertexElementCollection(class622 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "finish", descriptor = "()V")
    public final native void finish();

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "addElement", descriptor = "(IIIIII)V")
    public final native void addElement(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "reset", descriptor = "()V")
    public final native void reset();
}
