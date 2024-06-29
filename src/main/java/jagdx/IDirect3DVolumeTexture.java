package jagdx;

import jaclib.peer.class420;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVolumeTexture")
public class IDirect3DVolumeTexture extends IDirect3DBaseTexture {

    @OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "<init>", descriptor = "(Ljaclib/peer/er;)V")
    public IDirect3DVolumeTexture(class420 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "LockBox", descriptor = "(IIIIIIIILjagdx/PixelBuffer;)I")
    public final native int LockBox(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, PixelBuffer arg8);

    @OriginalMember(owner = "client!jagdx/IDirect3DVolumeTexture", name = "UnlockBox", descriptor = "(I)Z")
    public final native boolean UnlockBox(int arg0);
}
