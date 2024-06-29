package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field8064;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 4)
    public final void method2446(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field8064 == 0) {
            throw new RuntimeException();
        }
        super.method2446(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 15)
    public final boolean method3213() {
        boolean var1 = true;
        if (this.field8064 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field8064);
            this.method3447(0L, 0);
            this.field8064 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 32)
    public final boolean method3214(int arg0, int arg1, int arg2) {
        if (this.field8064 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3447(var4, arg1);
            this.field8064 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 54)
    public final boolean method3215() {
        return this.field8064 != 0;
    }
}
