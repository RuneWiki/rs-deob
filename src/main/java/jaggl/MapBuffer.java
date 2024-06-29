package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field8306;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 5)
    public final boolean method3440(int arg0, int arg1, int arg2) {
        if (this.field8306 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3747(var4, arg1);
            this.field8306 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 22)
    public final boolean method3441() {
        boolean var1 = true;
        if (this.field8306 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field8306);
            this.method3747(0L, 0);
            this.field8306 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 38)
    public final boolean method3442() {
        return this.field8306 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 48)
    public final void method2766(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field8306 == 0) {
            throw new RuntimeException();
        }
        super.method2766(arg0, arg1, arg2, arg3);
    }
}
