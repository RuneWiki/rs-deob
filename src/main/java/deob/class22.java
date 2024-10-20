package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aq")
public final class class22 implements class174, MouseWheelListener {

    @ObfuscatedName("aq.at")
    public int field110 = 0;

    @ObfuscatedName("aq.at(Ljava/awt/Component;S)V")
    public void method299(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aq.an(Ljava/awt/Component;B)V")
    public void method307(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field110 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aq.av(I)I")
    public synchronized int method302() {
        int var1 = this.field110;
        this.field110 = 0;
        return var1;
    }
}
