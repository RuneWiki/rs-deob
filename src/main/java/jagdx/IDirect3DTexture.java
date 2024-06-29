package jagdx;

import jaclib.peer.class674;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DTexture")
public class IDirect3DTexture extends IDirect3DBaseTexture {

    @OriginalMember(owner = "client!jagdx/IDirect3DTexture", name = "<init>", descriptor = "(Ljaclib/peer/uca;)V", line = 5)
    public IDirect3DTexture(class674 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DTexture", name = "UnlockRect", descriptor = "(I)Z")
    public final native boolean UnlockRect(int arg0);

    @OriginalMember(owner = "client!jagdx/IDirect3DTexture", name = "LockRect", descriptor = "(IIIIIILjagdx/PixelBuffer;)I")
    public final native int LockRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PixelBuffer arg6);
}
