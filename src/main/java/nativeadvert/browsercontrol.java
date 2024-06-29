package nativeadvert;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nativeadvert/browsercontrol")
public class browsercontrol {

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "nativeData", descriptor = "I")
    protected int nativeData = 0;

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "initialised", descriptor = "Z")
    private static boolean initialised;

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public browsercontrol(String arg0) {
        if (!initialised) {
            initIDs();
            initialised = true;
        }
        this.browsercontrol0(arg0);
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "set_position", descriptor = "(IIII)Z")
    public boolean set_position(int arg0, int arg1, int arg2, int arg3) {
        return this.setposition0(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "hide", descriptor = "()V")
    public void hide() {
        this.detach0();
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate", descriptor = "(Ljava/lang/String;)V")
    public void navigate(String arg0) {
        this.navigate0(arg0);
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy", descriptor = "()V")
    public void destroy() {
        this.destroy0();
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "initIDs", descriptor = "()V")
    private static native void initIDs();

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "browsercontrol0", descriptor = "(Ljava/lang/String;)V")
    private native void browsercontrol0(String arg0);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "setposition0", descriptor = "(IIII)Z")
    private native boolean setposition0(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate0", descriptor = "(Ljava/lang/String;)V")
    private native void navigate0(String arg0);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy0", descriptor = "()V")
    private native void destroy0();

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach0", descriptor = "()V")
    private native void detach0();
}
