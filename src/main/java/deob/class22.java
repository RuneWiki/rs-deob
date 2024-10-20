package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aw")
public final class class22 implements class219, MouseWheelListener {

    @ObfuscatedName("aw.aq")
    public int field97 = 0;

    @ObfuscatedName("aw.aq(Ljava/awt/Component;B)V")
    public void method298(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aw.ad(Ljava/awt/Component;I)V")
    public void method299(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field97 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aw.ag(I)I")
    public synchronized int method301() {
        int var1 = this.field97;
        this.field97 = 0;
        return var1;
    }
}
