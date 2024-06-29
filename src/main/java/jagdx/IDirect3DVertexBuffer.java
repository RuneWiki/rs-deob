package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.class336;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "b", descriptor = "I")
    public int field9451;

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "(Ljaclib/memory/Source;IIII)Z", line = 5)
    public final boolean method3751(Source arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null || arg1 < 0 || arg3 > (arg0.getSize() + arg1)) {
            throw new class671("");
        } else if (arg2 >= 0 && arg3 <= (arg2 + this.field9451)) {
            return this._Update(arg0.getAddress() + ((long) arg1), arg2, arg3, arg4);
        } else {
            throw new class671("");
        }
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "()J", line = 20)
    protected final long method2065() {
        this.field9451 = 0;
        return super.method2065();
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "<init>", descriptor = "(Ljaclib/peer/wl;)V", line = 27)
    public IDirect3DVertexBuffer(class336 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "_Update", descriptor = "(JIII)Z")
    private final native boolean _Update(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Lock", descriptor = "(IIILjagdx/GeometryBuffer;)I")
    public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Unlock", descriptor = "()I")
    public final native int Unlock();
}
