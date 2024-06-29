package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field7490;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z")
    public final boolean method3178(int arg0, int arg1, int arg2) {
        if (this.field7490 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method2530(var4, arg1);
            this.field7490 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z")
    public final boolean method3179() {
        boolean var1 = true;
        if (this.field7490 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field7490);
            this.method2530(0L, 0);
            this.field7490 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z")
    public final boolean method3180() {
        return this.field7490 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V")
    public final void method2529(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field7490 == 0) {
            throw new RuntimeException();
        }
        super.method2529(arg0, arg1, arg2, arg3);
    }
}
