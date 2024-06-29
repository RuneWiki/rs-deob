package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field8268;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 5)
    public final boolean method3344() {
        return this.field8268 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 12)
    public final boolean method3345() {
        boolean var1 = true;
        if (this.field8268 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field8268);
            this.method1533(0L, 0);
            this.field8268 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 29)
    public final void method1517(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field8268 == 0) {
            throw new RuntimeException();
        }
        super.method1517(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 39)
    public final boolean method3346(int arg0, int arg1, int arg2) {
        if (this.field8268 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method1533(var4, arg1);
            this.field8268 = arg0;
            return true;
        }
    }
}
