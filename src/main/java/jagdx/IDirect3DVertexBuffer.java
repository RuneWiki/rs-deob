package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.class579;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "b", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Lock", descriptor = "(IIILjagdx/GeometryBuffer;)I")
    public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Unlock", descriptor = "()I")
    public final native int Unlock();

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "<init>", descriptor = "(Ljaclib/peer/of;)V")
    public IDirect3DVertexBuffer(class579 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "()J")
    protected final long method2439() {
        this.field5620 = 0;
        return super.method2439();
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "(Ljaclib/memory/Source;IIII)Z")
    public final boolean method2442(Source arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null || arg1 < 0 || arg3 > (arg1 + arg0.getSize())) {
            throw new class412("");
        } else if (arg2 >= 0 && arg3 <= this.field5620 + arg2) {
            return this._Update((long) arg1 + arg0.getAddress(), arg2, arg3, arg4);
        } else {
            throw new class412("");
        }
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "_Update", descriptor = "(JIII)Z")
    private final native boolean _Update(long arg0, int arg1, int arg2, int arg3);
}
