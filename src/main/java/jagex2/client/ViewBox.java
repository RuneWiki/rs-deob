package jagex2.client;

import deob.ObfuscatedName;
import java.awt.Frame;
import java.awt.Graphics;

public class ViewBox extends Frame {

	@ObfuscatedName("FPVKJCAH.a")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("FPVKJCAH.b")
	public GameShell shell;

	public ViewBox(GameShell arg0, int arg1, byte arg2, int arg3) {
		this.shell = arg0;
		this.setTitle("Jagex");
		this.setResizable(false);
		this.show();
		if (arg2 != 5) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		this.toFront();
		this.resize(arg1 + 8, arg3 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		this.shell.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.shell.paint(arg0);
	}
}
