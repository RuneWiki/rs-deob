package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public final class class2 extends Frame {

	@ObfuscatedName("b.b")
	public class1 field31;

	public class2(int arg0, int arg1, class1 arg2) {
		field31 = arg2;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg0 + 8, arg1 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field31.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field31.paint(arg0);
	}
}
