package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ax")
public final class class39 implements class159, MouseWheelListener {

    @ObfuscatedName("ax.v")
    public int field349 = 0;

    @ObfuscatedName("ax.v(Ljava/awt/Component;I)V")
    public void method628(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ax.s(Ljava/awt/Component;I)V")
    public void method627(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field349 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ax.o(I)I")
    public synchronized int method632() {
        int var1 = this.field349;
        this.field349 = 0;
        return var1;
    }
}
