package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("et")
public class class140 extends class126 implements MouseWheelListener {

    @ObfuscatedName("et.j")
    public int field2117 = 0;

    @ObfuscatedName("et.y(Ljava/awt/Component;B)V")
    public void method2652(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("et.z(Ljava/awt/Component;B)V")
    public void method2645(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2117 += arg0.getWheelRotation();
    }

    @ObfuscatedName("et.l(I)I")
    public synchronized int method2647() {
        int var1 = this.field2117;
        this.field2117 = 0;
        return var1;
    }
}
