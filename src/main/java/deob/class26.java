package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("az")
public class class26 implements KeyListener, FocusListener {

	@ObfuscatedName("az.aw")
	public boolean[] field108 = new boolean[112];

	@ObfuscatedName("az.at")
	public class30[] field109 = new class30[3];

	@ObfuscatedName("az.ac")
	public Collection field110 = new ArrayList(100);

	@ObfuscatedName("az.ap")
	public Collection field111 = new ArrayList(100);

	@ObfuscatedName("az.aq")
	public volatile int field112 = 0;

	@ObfuscatedName("az.af(Lbi;II)V")
	public void method371(class30 arg0, int arg1) {
		this.field109[arg1] = arg0;
	}

	@ObfuscatedName("az.aw(I)I")
	public int method376() {
		return this.field112;
	}

	@ObfuscatedName("az.at(I)Z")
	public boolean method370() {
		return this.field112 <= 1;
	}

	@ObfuscatedName("az.ac(Ljava/awt/Component;I)V")
	public void method355(Component arg0) {
		arg0.setFocusTraversalKeysEnabled(false);
		arg0.addKeyListener(this);
		arg0.addFocusListener(this);
	}

	@ObfuscatedName("az.ap(Ljava/awt/Component;B)V")
	public synchronized void method356(Component arg0) {
		arg0.removeKeyListener(this);
		arg0.removeFocusListener(this);
		synchronized (this) {
			this.field110.add(new class34(4, 0));
		}
	}

	@ObfuscatedName("az.aq(I)V")
	public void method357() {
		this.field112++;
		this.method358();
		Iterator var1 = this.field111.iterator();
		while (var1.hasNext()) {
			class34 var2 = (class34) var1.next();
			for (int var3 = 0; var3 < this.field109.length && !var2.method495(this.field109[var3]); var3++) {
			}
		}
		this.field111.clear();
	}

	public final synchronized void keyPressed(KeyEvent arg0) {
		int var5;
		label27: {
			int var2 = arg0.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.field130.length;
				if (var2 < var4) {
					var5 = class28.method6338(var2);
					boolean var6 = (var5 & 0x80) != 0;
					if (var6) {
						var5 = -1;
					}
					break label27;
				}
			}
			var5 = -1;
		}
		if (var5 >= 0) {
			if (!this.field108[var5]) {
				this.field112 = 0;
			}
			this.field108[var5] = true;
			this.field110.add(new class34(1, var5));
		}
		arg0.consume();
	}

	public final synchronized void keyReleased(KeyEvent arg0) {
		int var5;
		label16: {
			int var2 = arg0.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.field130.length;
				if (var2 < var4) {
					var5 = class28.method6338(var2) & 0xFFFFFF7F;
					break label16;
				}
			}
			var5 = -1;
		}
		if (var5 >= 0) {
			this.field108[var5] = false;
			this.field110.add(new class34(2, var5));
		}
		arg0.consume();
	}

	public final synchronized void keyTyped(KeyEvent arg0) {
		char var2 = arg0.getKeyChar();
		if (var2 != 0 && var2 != 65535) {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class444.field5143;
						for (int var5 = 0; var5 < var4.length; var5++) {
							char var6 = var4[var5];
							if (var2 == var6) {
								var3 = true;
								break label47;
							}
						}
					}
					var3 = false;
				}
			} else {
				var3 = true;
			}
			if (var3) {
				this.field110.add(new class34(3, var2));
			}
		}
		arg0.consume();
	}

	@ObfuscatedName("az.ao(B)V")
	public synchronized void method358() {
		Collection var1 = this.field111;
		this.field111 = this.field110;
		this.field110 = var1;
	}

	public final synchronized void focusGained(FocusEvent arg0) {
		this.field110.add(new class34(4, 1));
	}

	public final synchronized void focusLost(FocusEvent arg0) {
		for (int var2 = 0; var2 < 112; var2++) {
			if (this.field108[var2]) {
				this.field108[var2] = false;
				this.field110.add(new class34(2, var2));
			}
		}
		this.field110.add(new class34(4, 0));
	}
}
