package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V", line = 4)
    public final void method236(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field304 == 0) {
            throw new RuntimeException();
        }
        super.method236(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z", line = 15)
    public final boolean method237() {
        return this.field304 != 0;
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z", line = 23)
    public final boolean method238(int arg0, int arg1, int arg2) {
        if (this.field304 != 0) {
            return false;
        }
        long var4 = OpenGL.glMapBufferARB(arg0, arg2);
        if (var4 == 0L) {
            return false;
        } else {
            this.method2250(var4, arg1);
            this.field304 = arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z", line = 42)
    public final boolean method239() {
        boolean var1 = true;
        if (this.field304 != 0) {
            var1 = OpenGL.glUnmapBufferARB(this.field304);
            this.method2250(0L, 0);
            this.field304 = 0;
        }
        return var1;
    }
}
