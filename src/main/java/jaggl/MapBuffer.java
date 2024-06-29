package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 5)
    public final void method281(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field455 == 0) {
            throw new RuntimeException();
        }
        super.method281(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 15)
    public final boolean method282(int arg0, int arg1, int arg2) {
        if (this.field455 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method2222(var4, arg1);
            this.field455 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 32)
    public final boolean method283() {
        return this.field455 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 42)
    public final boolean method284() {
        boolean var1 = true;
        if (this.field455 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field455);
            this.method2222(0L, 0);
            this.field455 = 0;
        }
        return var1;
    }
}
