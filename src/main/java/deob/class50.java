package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ae")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("ae.i")
    public int field636 = 0;

    @ObfuscatedName("ae.i(Ljava/awt/Component;B)V")
    public void method663(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ae.j(Ljava/awt/Component;B)V")
    public void method665(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field636 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ae.a(I)I")
    public synchronized int method670() {
        int var1 = this.field636;
        this.field636 = 0;
        return var1;
    }
}
