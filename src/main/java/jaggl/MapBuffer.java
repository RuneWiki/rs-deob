package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field7480;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V")
    public final void method2446(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field7480 == 0) {
            throw new RuntimeException();
        }
        super.method2446(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z")
    public final boolean method3074(int arg0, int arg1, int arg2) {
        if (this.field7480 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3301(var4, arg1);
            this.field7480 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z")
    public final boolean method3075() {
        return this.field7480 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z")
    public final boolean method3076() {
        boolean var1 = true;
        if (this.field7480 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field7480);
            this.method3301(0L, 0);
            this.field7480 = 0;
        }
        return var1;
    }
}
