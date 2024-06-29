package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class625;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/am;")
    private class625 field5472;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 7)
    public final IDirect3DSurface method2303(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field5472);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class439.method2332(true, var4)) {
            throw new class437(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/am;)V", line = 19)
    public IDirect3DSwapChain(class625 arg0) {
        super(arg0);
        this.field5472 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
