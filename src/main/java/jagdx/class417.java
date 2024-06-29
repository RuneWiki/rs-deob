package jagdx;

import jaclib.peer.class586;
import jaclib.peer.class587;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DLIGHT")
public class class417 extends class586 {

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "<init>", descriptor = "(Ljaclib/peer/cv;)V", line = 12)
    public class417(class587 arg0) {
        super(arg0);
        this.Init();
    }

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetType", descriptor = "(I)V")
    public final native void SetType(int arg0);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetRange", descriptor = "(F)V")
    public final native void SetRange(float arg0);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetPosition", descriptor = "(FFF)V")
    public final native void SetPosition(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetDirection", descriptor = "(FFF)V")
    public final native void SetDirection(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetSpotParams", descriptor = "(FFF)V")
    public final native void SetSpotParams(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "Init", descriptor = "()V")
    private final native void Init();

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetAmbient", descriptor = "(FFFF)V")
    public final native void SetAmbient(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetAttenuation", descriptor = "(FFF)V")
    public final native void SetAttenuation(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetSpecular", descriptor = "(FFFF)V")
    public final native void SetSpecular(float arg0, float arg1, float arg2, float arg3);

    @OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetDiffuse", descriptor = "(FFFF)V")
    public final native void SetDiffuse(float arg0, float arg1, float arg2, float arg3);
}
