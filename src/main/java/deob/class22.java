package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ax")
public final class class22 implements class222, MouseWheelListener {

    @ObfuscatedName("ax.ap")
    public int field84 = 0;

    @ObfuscatedName("ax.ap(Ljava/awt/Component;I)V")
    public void method303(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ax.aw(Ljava/awt/Component;I)V")
    public void method304(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field84 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ax.ak(B)I")
    public synchronized int method305() {
        int var1 = this.field84;
        this.field84 = 0;
        return var1;
    }
}
