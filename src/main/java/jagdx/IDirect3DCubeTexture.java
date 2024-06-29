package jagdx;

import jaclib.peer.class630;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DCubeTexture")
public class IDirect3DCubeTexture extends IDirect3DBaseTexture {

    @OriginalMember(owner = "client!jagdx/IDirect3DCubeTexture", name = "<init>", descriptor = "(Ljaclib/peer/dj;)V")
    public IDirect3DCubeTexture(class630 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DCubeTexture", name = "LockRect", descriptor = "(IIIIIIILjagdx/PixelBuffer;)I")
    public final native int LockRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, PixelBuffer arg7);

    @OriginalMember(owner = "client!jagdx/IDirect3DCubeTexture", name = "UnlockRect", descriptor = "(II)Z")
    public final native boolean UnlockRect(int arg0, int arg1);
}
