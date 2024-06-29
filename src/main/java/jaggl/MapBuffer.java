package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 4)
    public final boolean method226() {
        boolean var1 = true;
        if (this.field321 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field321);
            this.method2028(0L, 0);
            this.field321 = 0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 21)
    public final void method227(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field321 == 0) {
            throw new RuntimeException();
        }
        super.method227(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 32)
    public final boolean method228() {
        return this.field321 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 43)
    public final boolean method229(int arg0, int arg1, int arg2) {
        if (this.field321 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method2028(var4, arg1);
            this.field321 = arg0;
            return true;
        }
    }
}
