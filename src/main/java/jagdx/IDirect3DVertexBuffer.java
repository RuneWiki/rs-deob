package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.class699;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "b", descriptor = "I")
    public int field7246;

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "(Ljaclib/memory/Source;IIII)Z", line = 8)
    public final boolean method2976(Source arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null || arg1 < 0 || arg3 > (arg0.getSize() + arg1)) {
            throw new class506("");
        } else if (arg2 >= 0 && arg3 <= arg2 + this.field7246) {
            return this._Update(arg0.getAddress() + (long) arg1, arg2, arg3, arg4);
        } else {
            throw new class506("");
        }
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "<init>", descriptor = "(Ljaclib/peer/in;)V", line = 21)
    public IDirect3DVertexBuffer(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "()J", line = 25)
    protected final long method2973() {
        this.field7246 = 0;
        return super.method2973();
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "_Update", descriptor = "(JIII)Z")
    private final native boolean _Update(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Lock", descriptor = "(IIILjagdx/GeometryBuffer;)I")
    public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Unlock", descriptor = "()I")
    public final native int Unlock();
}
