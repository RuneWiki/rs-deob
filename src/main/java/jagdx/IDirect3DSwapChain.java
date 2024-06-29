package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class626;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/fl;")
    private class626 field6152;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/fl;)V", line = 5)
    public IDirect3DSwapChain(class626 arg0) {
        super(arg0);
        this.field6152 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 15)
    public final IDirect3DSurface method2547(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field6152);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class446.method2527(2005530584, var4)) {
            throw new class447(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
