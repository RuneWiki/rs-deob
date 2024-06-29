package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class630;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/bea;")
    private class630 field6181;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/bea;)V", line = 5)
    public IDirect3DSwapChain(class630 arg0) {
        super(arg0);
        this.field6181 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 17)
    public final IDirect3DSurface method2583(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6181);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class452.method2565(var4, -120)) {
            throw new class451(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
