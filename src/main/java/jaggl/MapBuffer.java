package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field9088;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 4)
    public final boolean method3726(int arg0, int arg1, int arg2) {
        if (this.field9088 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3957(var4, arg1);
            this.field9088 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 24)
    public final void method3078(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field9088 == 0) {
            throw new RuntimeException();
        }
        super.method3078(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 35)
    public final boolean method3727() {
        boolean var1 = true;
        if (this.field9088 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field9088);
            this.method3957(0L, 0);
            this.field9088 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 53)
    public final boolean method3728() {
        return this.field9088 != 0;
    }
}
