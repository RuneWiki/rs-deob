package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class578;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/fk;")
    private class578 field5791;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/fk;)V")
    public IDirect3DSwapChain(class578 arg0) {
        super(arg0);
        this.field5791 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;")
    public final IDirect3DSurface method2445(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field5791);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class410.method2427(99, var4)) {
            throw new class409(String.valueOf(var4));
        }
        return var3;
    }
}
