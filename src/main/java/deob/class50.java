package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("al")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("al.d")
    public int field587 = 0;

    @ObfuscatedName("al.d(Ljava/awt/Component;S)V")
    public void method631(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("al.q(Ljava/awt/Component;B)V")
    public void method632(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field587 += arg0.getWheelRotation();
    }

    @ObfuscatedName("al.x(B)I")
    public synchronized int method633() {
        int var1 = this.field587;
        this.field587 = 0;
        return var1;
    }
}
