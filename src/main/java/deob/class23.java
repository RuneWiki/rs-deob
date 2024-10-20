package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("f")
public final class class23 implements class159, MouseWheelListener {

    @ObfuscatedName("f.s")
    public int field119 = 0;

    @ObfuscatedName("f.s(Ljava/awt/Component;B)V")
    public void method293(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("f.h(Ljava/awt/Component;I)V")
    public void method294(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field119 += arg0.getWheelRotation();
    }

    @ObfuscatedName("f.w(I)I")
    public synchronized int method295() {
        int var1 = this.field119;
        this.field119 = 0;
        return var1;
    }
}
