package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class674;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DEventQuery")
public class IDirect3DEventQuery extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "Issue", descriptor = "()I")
    public final native int Issue();

    @OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "<init>", descriptor = "(Ljaclib/peer/gca;)V")
    public IDirect3DEventQuery(class674 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "IsSignaled", descriptor = "()I")
    public final native int IsSignaled();
}
