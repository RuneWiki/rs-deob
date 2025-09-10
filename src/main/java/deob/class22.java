package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ab")
public class class22 implements class262, MouseWheelListener {

	@ObfuscatedName("ab.af")
	public int field89 = 0;

	@ObfuscatedName("ab.af(Ljava/awt/Component;B)V")
	public void method310(Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@ObfuscatedName("ab.aw(Ljava/awt/Component;I)V")
	public void method313(Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		this.field89 += arg0.getWheelRotation();
	}

	@ObfuscatedName("ab.at(S)I")
	public synchronized int method311() {
		int var1 = this.field89;
		this.field89 = 0;
		return var1;
	}
}
