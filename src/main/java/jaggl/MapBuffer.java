package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 5)
    public final boolean method162(int arg0, int arg1, int arg2) {
        if (this.field445 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method2074(var4, arg1);
            this.field445 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 24)
    public final void method163(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field445 == 0) {
            throw new RuntimeException();
        }
        super.method163(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 35)
    public final boolean method164() {
        boolean var1 = true;
        if (this.field445 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field445);
            this.method2074(0L, 0);
            this.field445 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 52)
    public final boolean method165() {
        return this.field445 != 0;
    }
}
