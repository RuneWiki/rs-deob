package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@ObfuscatedName("JWWAIQPI")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("JWWAIQPI.g")
	public int field822 = 20;

	@ObfuscatedName("JWWAIQPI.h")
	public int field823 = 1;

	@ObfuscatedName("JWWAIQPI.i")
	public long[] field824 = new long[10];

	@ObfuscatedName("JWWAIQPI.k")
	public boolean field826 = false;

	@ObfuscatedName("JWWAIQPI.p")
	public Pix32[] field831 = new Pix32[6];

	@ObfuscatedName("JWWAIQPI.r")
	public boolean field833 = true;

	@ObfuscatedName("JWWAIQPI.s")
	public boolean field834 = true;

	@ObfuscatedName("JWWAIQPI.F")
	public int[] field847 = new int[128];

	@ObfuscatedName("JWWAIQPI.G")
	public int[] field848 = new int[128];

	@ObfuscatedName("JWWAIQPI.f")
	public int field821;

	@ObfuscatedName("JWWAIQPI.j")
	public int field825;

	@ObfuscatedName("JWWAIQPI.l")
	public int field827;

	@ObfuscatedName("JWWAIQPI.m")
	public int field828;

	@ObfuscatedName("JWWAIQPI.t")
	public int field835;

	@ObfuscatedName("JWWAIQPI.u")
	public int field836;

	@ObfuscatedName("JWWAIQPI.v")
	public int field837;

	@ObfuscatedName("JWWAIQPI.w")
	public int field838;

	@ObfuscatedName("JWWAIQPI.x")
	public int field839;

	@ObfuscatedName("JWWAIQPI.y")
	public int field840;

	@ObfuscatedName("JWWAIQPI.z")
	public int field841;

	@ObfuscatedName("JWWAIQPI.B")
	public int field843;

	@ObfuscatedName("JWWAIQPI.C")
	public int field844;

	@ObfuscatedName("JWWAIQPI.D")
	public int field845;

	@ObfuscatedName("JWWAIQPI.H")
	public int field849;

	@ObfuscatedName("JWWAIQPI.I")
	public int field850;

	@ObfuscatedName("JWWAIQPI.A")
	public long field842;

	@ObfuscatedName("JWWAIQPI.E")
	public long field846;

	@ObfuscatedName("JWWAIQPI.q")
	public ViewBox field832;

	@ObfuscatedName("JWWAIQPI.o")
	public PixMap field830;

	@ObfuscatedName("JWWAIQPI.n")
	public Graphics field829;

	@ObfuscatedName("JWWAIQPI.a(III)V")
	public final void method266(int arg0, int arg1) {
		field827 = arg1;
		field828 = arg0;
		field832 = new ViewBox(field828, this, field827);
		field829 = method164().getGraphics();
		field830 = new PixMap(field828, method164(), field827);
		method142(this, 1);
	}

	@ObfuscatedName("JWWAIQPI.b(III)V")
	public final void method267(int arg0, int arg1) {
		field827 = arg0;
		field828 = arg1;
		field829 = method164().getGraphics();
		field830 = new PixMap(field828, method164(), field827);
		method142(this, 1);
	}

	public void run() {
		method164().addMouseListener(this);
		method164().addMouseMotionListener(this);
		method164().addKeyListener(this);
		method164().addFocusListener(this);

		if (field832 != null) {
			field832.addWindowListener(this);
		}

		method165(0, "Loading...");
		method86();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			field824[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (field821 < 0) {
					if (field821 == -1) {
						method268();
					}

					return;
				}

				if (field821 > 0) {
					field821--;
					if (field821 == 0) {
						method268();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (field824[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > field824[var1]) {
					var2 = (int) (field822 * 2560 / (var11 - field824[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (field822 - (var11 - field824[var1]) / 10L);
				}

				if (var3 > field822) {
					var3 = field822;
				}

				field824[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (field824[var13] != 0L) {
							field824[var13] += var3;
						}
					}
				}

				if (var3 < field823) {
					var3 = field823;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field843 = field839;
					field844 = field840;
					field845 = field841;
					field846 = field842;
					field839 = 0;
					method113();
					field849 = field850;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (field822 > 0) {
					field825 = var2 * 1000 / (field822 * 256);
				}

				method152();
			} while (!field826);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + field824[var15]);
			}

			System.out.println("fps:" + field825 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + field822 + " mindel:" + field823);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field826 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("JWWAIQPI.a(Z)V")
	public final void method268() {
		field821 = -2;
		method40();

		if (field832 != null) {
			try {
				Thread.sleep(1000L);
			} catch (Exception var2) {
			}

			try {
				System.exit(0);
			} catch (Throwable var1) {
			}
		}
	}

	@ObfuscatedName("JWWAIQPI.a(BI)V")
	public final void method269(int arg0) {
		field822 = 1000 / arg0;
	}

	public final void start() {
		if (field821 >= 0) {
			field821 = 0;
		}
	}

	public final void stop() {
		if (field821 >= 0) {
			field821 = 4000 / field822;
		}
	}

	public final void destroy() {
		field821 = -1;

		try {
			Thread.sleep(10000L);
		} catch (Exception var1) {
		}

		if (field821 == -1) {
			method268();
		}
	}

	public final void update(Graphics arg0) {
		if (field829 == null) {
			field829 = arg0;
		}

		field833 = true;
		method82();
	}

	public final void paint(Graphics arg0) {
		if (field829 == null) {
			field829 = arg0;
		}

		field833 = true;
		method82();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field832 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field835 = 0;
		field840 = var2;
		field841 = var3;
		field842 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field839 = 2;
			field836 = 2;
		} else {
			field839 = 1;
			field836 = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field835 = 0;
		field836 = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		field835 = 0;
		field837 = -1;
		field838 = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field832 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field835 = 0;
		field837 = var2;
		field838 = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (field832 != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field835 = 0;
		field837 = var2;
		field838 = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		field835 = 0;
		int var2 = arg0.getKeyCode();
		int var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}

		if (var2 == 37) {
			var3 = 1;
		}

		if (var2 == 39) {
			var3 = 2;
		}

		if (var2 == 38) {
			var3 = 3;
		}

		if (var2 == 40) {
			var3 = 4;
		}

		if (var2 == 17) {
			var3 = 5;
		}

		if (var2 == 8) {
			var3 = 8;
		}

		if (var2 == 127) {
			var3 = 8;
		}

		if (var2 == 9) {
			var3 = 9;
		}

		if (var2 == 10) {
			var3 = 10;
		}

		if (var2 >= 112 && var2 <= 123) {
			var3 = var2 + 1008 - 112;
		}

		if (var2 == 36) {
			var3 = 1000;
		}

		if (var2 == 35) {
			var3 = 1001;
		}

		if (var2 == 33) {
			var3 = 1002;
		}

		if (var2 == 34) {
			var3 = 1003;
		}

		if (var3 > 0 && var3 < 128) {
			field847[var3] = 1;
		}

		if (var3 > 4) {
			field848[field850] = var3;
			field850 = field850 + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field835 = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}

		if (var2 == 37) {
			var3 = 1;
		}

		if (var2 == 39) {
			var3 = 2;
		}

		if (var2 == 38) {
			var3 = 3;
		}

		if (var2 == 40) {
			var3 = 4;
		}

		if (var2 == 17) {
			var3 = 5;
		}

		if (var2 == 8) {
			var3 = '\b';
		}

		if (var2 == 127) {
			var3 = '\b';
		}

		if (var2 == 9) {
			var3 = '\t';
		}

		if (var2 == 10) {
			var3 = '\n';
		}

		if (var3 > 0 && var3 < 128) {
			field847[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("JWWAIQPI.a(I)I")
	public final int method270() {
		int var1 = -1;
		if (field850 != field849) {
			var1 = field848[field849];
			field849 = field849 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field834 = true;
		field833 = true;
		method82();
	}

	public final void focusLost(FocusEvent arg0) {
		field834 = false;

		for (int var2 = 0; var2 < 128; var2++) {
			field847[var2] = 0;
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("JWWAIQPI.a()V")
	public void method86() {
	}

	@ObfuscatedName("JWWAIQPI.a(B)V")
	public void method113() {
	}

	@ObfuscatedName("JWWAIQPI.b(I)V")
	public void method40() {
	}

	@ObfuscatedName("JWWAIQPI.c(I)V")
	public void method152() {
	}

	@ObfuscatedName("JWWAIQPI.b(B)V")
	public void method82() {
	}

	@ObfuscatedName("JWWAIQPI.d(I)Ljava/awt/Component;")
	public Component method164() {
		if (field832 != null) {
			return field832;
		}

		return this;
	}

	@ObfuscatedName("JWWAIQPI.a(Ljava/lang/Runnable;I)V")
	public void method142(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("JWWAIQPI.a(IZLjava/lang/String;)V")
	public void method165(int arg0, String arg1) {
		while (field829 == null) {
			field829 = method164().getGraphics();

			try {
				method164().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = method164().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		method164().getFontMetrics(var5);

		if (field833) {
			field829.setColor(Color.black);
			field829.fillRect(0, 0, field827, field828);
			field833 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field828 / 2 - 18;
		field829.setColor(var6);
		field829.drawRect(field827 / 2 - 152, var7, 304, 34);
		field829.fillRect(field827 / 2 - 150, var7 + 2, arg0 * 3, 30);
		field829.setColor(Color.black);
		field829.fillRect(arg0 * 3 + field827 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		field829.setFont(var3);
		field829.setColor(Color.white);
		field829.drawString(arg1, (field827 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
