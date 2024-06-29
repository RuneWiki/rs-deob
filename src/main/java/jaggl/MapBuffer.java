package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field8780;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 5)
    public final void method2918(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field8780 == 0) {
            throw new RuntimeException();
        }
        super.method2918(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 15)
    public final boolean method3625() {
        return this.field8780 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 22)
    public final boolean method3626() {
        boolean var1 = true;
        if (this.field8780 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field8780);
            this.method3873(0L, 0);
            this.field8780 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 39)
    public final boolean method3627(int arg0, int arg1, int arg2) {
        if (this.field8780 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3873(var4, arg1);
            this.field8780 = arg0;
            return true;
        }
    }
}
