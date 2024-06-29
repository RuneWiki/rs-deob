package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.class587;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public class IDirect3DVertexBuffer extends IUnknown {

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "b", descriptor = "I")
    public int field6293;

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "<init>", descriptor = "(Ljaclib/peer/cv;)V", line = 5)
    public IDirect3DVertexBuffer(class587 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "()J", line = 10)
    protected final long method2636() {
        this.field6293 = 0;
        return super.method2636();
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "(Ljaclib/memory/Source;IIII)Z", line = 20)
    public final boolean method2639(Source arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null || arg1 < 0 || arg1 + arg0.getSize() < arg3) {
            throw new class415("");
        } else if (arg2 >= 0 && arg3 <= this.field6293 + arg2) {
            return this._Update(arg0.getAddress() + (long) arg1, arg2, arg3, arg4);
        } else {
            throw new class415("");
        }
    }

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Unlock", descriptor = "()I")
    public final native int Unlock();

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Lock", descriptor = "(IIILjagdx/GeometryBuffer;)I")
    public final native int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3);

    @OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "_Update", descriptor = "(JIII)Z")
    private final native boolean _Update(long arg0, int arg1, int arg2, int arg3);
}
