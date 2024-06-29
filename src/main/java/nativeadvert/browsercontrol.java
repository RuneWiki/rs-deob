package nativeadvert;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nativeadvert/browsercontrol")
public class browsercontrol {

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "error", descriptor = "Z")
    private static boolean error;

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "iscreated", descriptor = "Z")
    private static boolean iscreated;

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "create", descriptor = "(Ljava/lang/String;)Z")
    public static boolean create(String arg0) {
        if (iscreated) {
            throw new IllegalStateException();
        } else if (error) {
            return false;
        } else {
            boolean var1 = browsercontrol0(arg0);
            if (var1) {
                iscreated = true;
            } else {
                error = true;
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "iscreated", descriptor = "()Z")
    public static boolean iscreated() {
        return iscreated;
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "set_position", descriptor = "(IIII)V")
    public static void set_position(int arg0, int arg1, int arg2, int arg3) {
        if (!iscreated) {
            throw new IllegalStateException();
        }
        setposition0(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "hide", descriptor = "()V")
    public static void hide() {
        if (!iscreated) {
            throw new IllegalStateException();
        }
        detach0();
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate", descriptor = "(Ljava/lang/String;)V")
    public static void navigate(String arg0) {
        if (!iscreated) {
            throw new IllegalStateException();
        }
        navigate0(arg0);
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy", descriptor = "()V")
    public static void destroy() {
        if (!iscreated) {
            throw new IllegalStateException();
        }
        destroy0();
        iscreated = false;
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "browsercontrol0", descriptor = "(Ljava/lang/String;)Z")
    private static native boolean browsercontrol0(String arg0);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "setposition0", descriptor = "(IIII)V")
    private static native void setposition0(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate0", descriptor = "(Ljava/lang/String;)V")
    private static native void navigate0(String arg0);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy0", descriptor = "()V")
    private static native void destroy0();

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach0", descriptor = "()V")
    private static native void detach0();
}
