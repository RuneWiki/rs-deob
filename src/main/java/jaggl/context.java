package jaggl;

import java.awt.Component;
import java.util.HashSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/context")
public class context {

    @OriginalMember(owner = "client!jaggl/context", name = "a", descriptor = "Ljava/util/HashSet;")
    private HashSet field164 = null;

    @OriginalMember(owner = "client!jaggl/context", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field165 = new opengl(this);

    @OriginalMember(owner = "client!jaggl/context", name = "c", descriptor = "Ljaggl/context;")
    private static context field166 = null;

    @OriginalMember(owner = "client!jaggl/context", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!jaggl/context", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z", line = 9)
    public boolean isExtensionAvailable(String arg0) {
        if (this.field164 == null) {
            String var2 = this.field165.glGetString(7939) + " " + this.getExtensionsString();
            String[] var3 = var2.split(" ");
            this.field164 = new HashSet(var3.length);
            for (int var4 = 0; var4 < var3.length; var4++) {
                this.field164.add(var3[var4]);
            }
        }
        return this.field164.contains(arg0);
    }

    @OriginalMember(owner = "client!jaggl/context", name = "getCurrentContext", descriptor = "()Ljaggl/context;", line = 35)
    public static context getCurrentContext() {
        return field166;
    }

    @OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;II)Z", line = 44)
    public boolean choosePixelFormat(Component arg0, int arg1, int arg2) {
        return this.choosePixelFormat1(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaggl/context", name = "<init>", descriptor = "()V", line = 68)
    public context() {
        this.init(this.field165);
    }

    @OriginalMember(owner = "client!jaggl/context", name = "makeCurrent", descriptor = "()Z", line = 56)
    public boolean makeCurrent() {
        this.field164 = null;
        boolean var1 = this.makeCurrent1();
        if (var1) {
            field166 = this;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jaggl/context", name = "getGL", descriptor = "()Ljaggl/opengl;", line = 80)
    public opengl getGL() {
        return this.field165;
    }

    @OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;)Z", line = 94)
    public boolean choosePixelFormat(Component arg0) {
        return this.choosePixelFormat0(arg0);
    }

    @OriginalMember(owner = "client!jaggl/context", name = "destroy", descriptor = "()Z")
    public native boolean destroy();

    @OriginalMember(owner = "client!jaggl/context", name = "setSwapInterval", descriptor = "(I)V")
    public native void setSwapInterval(int arg0);

    @OriginalMember(owner = "client!jaggl/context", name = "deleteContext", descriptor = "()Z")
    public native boolean deleteContext();

    @OriginalMember(owner = "client!jaggl/context", name = "makeCurrent1", descriptor = "()Z")
    public native boolean makeCurrent1();

    @OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat1", descriptor = "(Ljava/awt/Component;II)Z")
    public native boolean choosePixelFormat1(Component arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jaggl/context", name = "releaseContext", descriptor = "()Z")
    public native boolean releaseContext();

    @OriginalMember(owner = "client!jaggl/context", name = "createContext", descriptor = "()Z")
    public native boolean createContext();

    @OriginalMember(owner = "client!jaggl/context", name = "getExtensionsString", descriptor = "()Ljava/lang/String;")
    public native String getExtensionsString();

    @OriginalMember(owner = "client!jaggl/context", name = "swapBuffers", descriptor = "()Z")
    public native boolean swapBuffers();

    @OriginalMember(owner = "client!jaggl/context", name = "init", descriptor = "(Ljaggl/opengl;)V")
    public native void init(opengl arg0);

    @OriginalMember(owner = "client!jaggl/context", name = "getAlphaBits", descriptor = "()I")
    public native int getAlphaBits();

    @OriginalMember(owner = "client!jaggl/context", name = "getLastError", descriptor = "()I")
    public native int getLastError();

    @OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat0", descriptor = "(Ljava/awt/Component;)Z")
    public native boolean choosePixelFormat0(Component arg0);
}
