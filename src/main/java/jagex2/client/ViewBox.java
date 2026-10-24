package jagex2.client;

import deob.ObfuscatedName;
import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public final class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell shell;

	public ViewBox(GameShell arg0, int arg1, int arg2) {
		shell = arg0;
		setTitle("Jagex");
		setResizable(false);
		show();
		toFront();
		resize(arg1 + 8, arg2 + 28);
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
