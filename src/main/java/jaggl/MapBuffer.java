package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field7746;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 4)
    public final boolean method3209() {
        return this.field7746 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 11)
    public final void method2584(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field7746 == 0) {
            throw new RuntimeException();
        }
        super.method2584(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 21)
    public final boolean method3210() {
        boolean var1 = true;
        if (this.field7746 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field7746);
            this.method3484(0L, 0);
            this.field7746 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 39)
    public final boolean method3211(int arg0, int arg1, int arg2) {
        if (this.field7746 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3484(var4, arg1);
            this.field7746 = arg0;
            return true;
        }
    }
}
