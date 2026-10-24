package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public final class class2 extends Frame {

	@ObfuscatedName("b.b")
	public class1 field24;

	public class2(int arg0, class1 arg1, int arg2) {
		field24 = arg1;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg2 + 8, arg0 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		field24.update(arg0);
	}

	public final void paint(Graphics arg0) {
		field24.paint(arg0);
	}
}
