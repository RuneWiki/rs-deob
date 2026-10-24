package jagex2.client;

import deob.ObfuscatedName;
import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public final class ViewBox extends Frame {

	@ObfuscatedName("b.b")
	public GameShell shell;

	public ViewBox(int arg0, GameShell arg1, int arg2) {
		shell = arg1;
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
		shell.update(arg0);
	}

	public final void paint(Graphics arg0) {
		shell.paint(arg0);
	}
}
