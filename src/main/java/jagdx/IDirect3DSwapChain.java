package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class338;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public class IDirect3DSwapChain extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Ljaclib/peer/aaa;")
    private class338 field9331;

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Ljaclib/peer/aaa;)V", line = 7)
    public IDirect3DSwapChain(class338 arg0) {
        super(arg0);
        this.field9331 = arg0;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Ljagdx/IDirect3DSurface;", line = 18)
    public final IDirect3DSurface method3696(int arg0, int arg1) {
        IDirect3DSurface var3 = new IDirect3DSurface(this.field9331);
        int var4 = this._GetBackBuffer(arg0, arg1, var3);
        if (class675.method3704(var4, -92)) {
            throw new class676(String.valueOf(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILjagdx/IDirect3DSurface;)I")
    private final native int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2);

    @OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
    public final native int Present(int arg0);
}
