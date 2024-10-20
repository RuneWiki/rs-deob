package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eu")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("eu.m")
    public int field2274 = 0;

    @ObfuscatedName("eu.w(Ljava/awt/Component;I)V")
    public void method2730(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eu.e(Ljava/awt/Component;B)V")
    public void method2725(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2274 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eu.o(B)I")
    public synchronized int method2726() {
        int var1 = this.field2274;
        this.field2274 = 0;
        return var1;
    }
}
