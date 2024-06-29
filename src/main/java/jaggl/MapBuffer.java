package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field9415;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 4)
    public final boolean method4779() {
        return this.field9415 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 13)
    public final void method3847(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field9415 == 0) {
            throw new RuntimeException();
        }
        super.method3847(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 23)
    public final boolean method4780() {
        boolean var1 = true;
        if (this.field9415 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field9415);
            this.method5114(0L, 0);
            this.field9415 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 42)
    public final boolean method4781(int arg0, int arg1, int arg2) {
        if (this.field9415 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method5114(var4, arg1);
            this.field9415 = arg0;
            return true;
        }
    }
}
