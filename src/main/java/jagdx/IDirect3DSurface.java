package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.class670;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DSurface")
public class IDirect3DSurface extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "<init>", descriptor = "(Ljaclib/peer/rh;)V", line = 4)
    public IDirect3DSurface(class670 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "LockRect", descriptor = "(IIIIILjagdx/PixelBuffer;)I")
    public final native int LockRect(int arg0, int arg1, int arg2, int arg3, int arg4, PixelBuffer arg5);

    @OriginalMember(owner = "client!jagdx/IDirect3DSurface", name = "UnlockRect", descriptor = "()Z")
    public final native boolean UnlockRect();
}
