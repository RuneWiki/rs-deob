package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class579;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DEventQuery")
public class IDirect3DEventQuery extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "<init>", descriptor = "(Ljaclib/peer/of;)V", line = 4)
    public IDirect3DEventQuery(class579 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "Issue", descriptor = "()I")
    public final native int Issue();

    @OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "IsSignaled", descriptor = "()I")
    public final native int IsSignaled();
}
