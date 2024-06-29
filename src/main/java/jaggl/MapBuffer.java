package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field7669;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 6)
    public final boolean method3141() {
        boolean var1 = true;
        if (this.field7669 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field7669);
            this.method3430(0L, 0);
            this.field7669 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 23)
    public final boolean method3142(int arg0, int arg1, int arg2) {
        if (this.field7669 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method3430(var4, arg1);
            this.field7669 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 42)
    public final boolean method3143() {
        return this.field7669 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 49)
    public final void method2562(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field7669 == 0) {
            throw new RuntimeException();
        }
        super.method2562(arg0, arg1, arg2, arg3);
    }
}
