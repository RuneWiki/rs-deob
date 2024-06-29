package jaggl.X11;

import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/X11/dri")
public class class370 {

    @OriginalMember(owner = "client!jaggl/X11/dri", name = "close", descriptor = "()Z")
    public static native boolean close();

    @OriginalMember(owner = "client!jaggl/X11/dri", name = "bind", descriptor = "()V")
    public static void bind() {
        String var0 = System.getProperty("os.name").toLowerCase();
        if (var0.startsWith("linux") || (new File("/usr/lib/dri")).exists() || (new File("/usr/X11R6/lib/modules/dri")).exists()) {
            boolean var1 = open("libGL.so.1");
            if (!var1) {
                open("/usr/lib/libGL.so.1");
            }
        }
    }

    @OriginalMember(owner = "client!jaggl/X11/dri", name = "open", descriptor = "(Ljava/lang/String;)Z")
    private static native boolean open(String arg0);
}
