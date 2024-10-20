package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ai")
public final class class22 implements class180, MouseWheelListener {

    @ObfuscatedName("ai.ak")
    public int field112 = 0;

    @ObfuscatedName("ai.ak(Ljava/awt/Component;I)V")
    public void method276(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ai.al(Ljava/awt/Component;I)V")
    public void method278(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field112 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ai.aj(B)I")
    public synchronized int method280() {
        int var1 = this.field112;
        this.field112 = 0;
        return var1;
    }
}
