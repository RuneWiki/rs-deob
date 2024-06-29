package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/jaa;")
    private class672 field6669;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 8)
    public final IDirect3DSurface method2738(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6669);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class483.method2719(-7175, var4)) {
            throw new class484(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/jaa;)V", line = 20)
    public IDirect3DSwapChain(class672 arg0) {
        super(arg0);
        this.field6669 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
