package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("av")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("av.z")
    public int field357 = 0;

    @ObfuscatedName("av.z(Ljava/awt/Component;B)V")
    public void method687(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("av.n(Ljava/awt/Component;I)V")
    public void method686(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field357 += arg0.getWheelRotation();
    }

    @ObfuscatedName("av.v(B)I")
    public synchronized int method685() {
        int var1 = this.field357;
        this.field357 = 0;
        return var1;
    }
}
