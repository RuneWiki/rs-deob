package nativeadvert;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nativeadvert/browsercontrol")
public class browsercontrol {

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "attach", descriptor = "(Ljava/awt/Canvas;)V")
    public void attach(Canvas arg0) {
        if (arg0.getPeer() == null) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        boolean var2 = this.attach0(arg0, 0, 0, arg0.getSize().width, arg0.getSize().height);
        if (!var2) {
            throw new RuntimeException("Failed to attach");
        }
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach", descriptor = "()V")
    public void detach() {
        this.detach0();
    }

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "attach0", descriptor = "(Ljava/awt/Canvas;IIII)Z")
    private native boolean attach0(Canvas arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach0", descriptor = "()V")
    private native void detach0();
}
