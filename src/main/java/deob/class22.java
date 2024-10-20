package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ay")
public final class class22 implements class175, MouseWheelListener {

    @ObfuscatedName("ay.au")
    public int field109 = 0;

    @ObfuscatedName("ay.au(Ljava/awt/Component;S)V")
    public void method301(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ay.ae(Ljava/awt/Component;B)V")
    public void method303(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field109 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ay.ao(I)I")
    public synchronized int method302() {
        int var1 = this.field109;
        this.field109 = 0;
        return var1;
    }
}
