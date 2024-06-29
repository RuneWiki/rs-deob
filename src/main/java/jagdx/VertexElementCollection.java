package jagdx;

import jaclib.peer.class246;
import jaclib.peer.class247;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/VertexElementCollection")
public class VertexElementCollection extends class247 {

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "<init>", descriptor = "(Ljaclib/peer/vo;)V", line = 5)
    public VertexElementCollection(class246 arg0) {
        super(arg0);
        this.init();
    }

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "addElement", descriptor = "(IIIIII)V")
    public final native void addElement(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "finish", descriptor = "()V")
    public final native void finish();

    @OriginalMember(owner = "client!jagdx/VertexElementCollection", name = "reset", descriptor = "()V")
    public final native void reset();
}
