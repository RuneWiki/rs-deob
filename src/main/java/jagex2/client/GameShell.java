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

@ObfuscatedName("a")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("a.g")
	public int state;

	@ObfuscatedName("a.h")
	public int deltime = 20;

	@ObfuscatedName("a.i")
	public int mindel = 1;

	@ObfuscatedName("a.j")
	public long[] otim = new long[10];

	@ObfuscatedName("a.k")
	public int field5;

	@ObfuscatedName("a.l")
	public boolean field6 = false;

	@ObfuscatedName("a.m")
	public int field7;

	@ObfuscatedName("a.n")
	public int field8;

	@ObfuscatedName("a.o")
	public Graphics graphics;

	@ObfuscatedName("a.p")
	public PixMap drawArea;

	@ObfuscatedName("a.q")
	public Pix32[] temp = new Pix32[6];

	@ObfuscatedName("a.r")
	public ViewBox frame;

	@ObfuscatedName("a.s")
	public boolean field13 = true;

	@ObfuscatedName("a.t")
	public boolean field14 = true;

	@ObfuscatedName("a.u")
	public int field15;

	@ObfuscatedName("a.v")
	public int field16;

	@ObfuscatedName("a.w")
	public int field17;

	@ObfuscatedName("a.x")
	public int field18;

	@ObfuscatedName("a.y")
	public int field19;

	@ObfuscatedName("a.z")
	public int field20;

	@ObfuscatedName("a.G")
	public int[] field27 = new int[128];

	@ObfuscatedName("a.H")
	public int[] field28 = new int[128];

	@ObfuscatedName("a.A")
	public int field21;

	@ObfuscatedName("a.C")
	public int field23;

	@ObfuscatedName("a.D")
	public int field24;

	@ObfuscatedName("a.E")
	public int field25;

	@ObfuscatedName("a.I")
	public int field29;

	@ObfuscatedName("a.J")
	public int field30;

	@ObfuscatedName("a.B")
	public long field22;

	@ObfuscatedName("a.F")
	public long field26;

	@ObfuscatedName("a.a(III)V")
	public final void initApplication(int arg0, int arg1) {
		field7 = arg1;
		field8 = arg0;
		frame = new ViewBox(field7, field8, this);
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(getBaseComponent(), field8, field7);
		startThread(this, 1);
	}

	@ObfuscatedName("a.a(BII)V")
	public final void initApplet(int arg0, int arg1) {
		field7 = arg1;
		field8 = arg0;
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(getBaseComponent(), field8, field7);
		startThread(this, 1);
	}

	public void run() {
		getBaseComponent().addMouseListener(this);
		getBaseComponent().addMouseMotionListener(this);
		getBaseComponent().addKeyListener(this);
		getBaseComponent().addFocusListener(this);

		if (frame != null) {
			frame.addWindowListener(this);
		}

		drawProgress(0, "Loading...");
		load();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			otim[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();

		while (true) {
			long var11;
			do {
				if (state < 0) {
					if (state == -1) {
						shutdown();
					}

					return;
				}

				if (state > 0) {
					state--;
					if (state == 0) {
						shutdown();
						return;
					}
				}

				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (otim[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > otim[var1]) {
					var2 = (int) (deltime * 2560 / (var11 - otim[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int) (deltime - (var11 - otim[var1]) / 10L);
				}

				if (var3 > deltime) {
					var3 = deltime;
				}

				otim[var1] = var11;
				var1 = (var1 + 1) % 10;

				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (otim[var13] != 0L) {
							otim[var13] += var3;
						}
					}
				}

				if (var3 < mindel) {
					var3 = mindel;
				}

				try {
					Thread.sleep(var3);
				} catch (InterruptedException var16) {
					var5++;
				}

				while (var4 < 256) {
					field23 = field19;
					field24 = field20;
					field25 = field21;
					field26 = field22;
					field19 = 0;
					update();
					field29 = field30;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (deltime > 0) {
					field5 = var2 * 1000 / (deltime * 256);
				}

				draw();
			} while (!field6);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + otim[var15]);
			}

			System.out.println("fps:" + field5 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + deltime + " mindel:" + mindel);
			System.out.println("intex:" + var5 + " opos:" + var1);
			field6 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("a.a(I)V")
	public final void shutdown() {
		state = -2;
		unload();

		try {
			Thread.sleep(1000L);
		} catch (Exception var2) {
		}

		try {
			System.exit(0);
		} catch (Throwable var1) {
		}
	}

	@ObfuscatedName("a.a(II)V")
	public final void setFramerate(int arg0) {
		deltime = 1000 / arg0;
	}

	public final void start() {
		if (state >= 0) {
			state = 0;
		}
	}

	public final void stop() {
		if (state >= 0) {
			state = 4000 / deltime;
		}
	}

	public final void destroy() {
		state = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}

		if (state == -1) {
			shutdown();
		}
	}

	public final void update(Graphics arg0) {
		if (graphics == null) {
			graphics = arg0;
		}

		field13 = true;
		refresh();
	}

	public final void paint(Graphics arg0) {
		if (graphics == null) {
			graphics = arg0;
		}

		field13 = true;
		refresh();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field15 = 0;
		field20 = var2;
		field21 = var3;
		field22 = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			field19 = 2;
			field16 = 2;
		} else {
			field19 = 1;
			field16 = 1;
		}

		if (InputTracking.field129) {
			InputTracking.method49(var2, var3, arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		field15 = 0;
		field16 = 0;

		if (InputTracking.field129) {
			InputTracking.method50(arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (InputTracking.field129) {
			InputTracking.method56();
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		field15 = 0;
		field17 = -1;
		field18 = -1;

		if (InputTracking.field129) {
			InputTracking.method57();
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field15 = 0;
		field17 = var2;
		field18 = var3;

		if (InputTracking.field129) {
			InputTracking.method51(var2, var3);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		field15 = 0;
		field17 = var2;
		field18 = var3;

		if (InputTracking.field129) {
			InputTracking.method51(var2, var3);
		}
	}

	public final void keyPressed(KeyEvent arg0) {
		field15 = 0;
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
			field27[var3] = 1;
		}

		if (var3 > 4) {
			field28[field30] = var3;
			field30 = field30 + 1 & 0x7F;
		}

		if (InputTracking.field129) {
			InputTracking.method52(var3);
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		field15 = 0;
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
			field27[var3] = 0;
		}

		if (InputTracking.field129) {
			InputTracking.method53(var3);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.b(I)I")
	public final int method5() {
		int var1 = -1;
		if (field30 != field29) {
			var1 = field28[field29];
			field29 = field29 + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		field14 = true;
		field13 = true;
		refresh();

		if (InputTracking.field129) {
			InputTracking.method54();
		}
	}

	public final void focusLost(FocusEvent arg0) {
		field14 = false;

		if (InputTracking.field129) {
			InputTracking.method55();
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

	@ObfuscatedName("a.a()V")
	public void load() {
	}

	@ObfuscatedName("a.c(I)V")
	public void update() {
	}

	@ObfuscatedName("a.d(I)V")
	public void unload() {
	}

	@ObfuscatedName("a.a(Z)V")
	public void draw() {
	}

	@ObfuscatedName("a.e(I)V")
	public void refresh() {
	}

	@ObfuscatedName("a.f(I)Ljava/awt/Component;")
	public Component getBaseComponent() {
		if (frame != null) {
			return frame;
		}

		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(IILjava/lang/String;)V")
	public void drawProgress(int arg0, String arg1) {
		while (graphics == null) {
			graphics = getBaseComponent().getGraphics();

			try {
				getBaseComponent().repaint();
			} catch (Exception var9) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}

		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = getBaseComponent().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		getBaseComponent().getFontMetrics(var5);

		if (field13) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, field7, field8);
			field13 = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = field8 / 2 - 18;
		graphics.setColor(var6);
		graphics.drawRect(field7 / 2 - 152, var7, 304, 34);
		graphics.fillRect(field7 / 2 - 150, var7 + 2, arg0 * 3, 30);
		graphics.setColor(Color.black);
		graphics.fillRect(arg0 * 3 + field7 / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		graphics.setFont(var3);
		graphics.setColor(Color.white);
		graphics.drawString(arg1, (field7 - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
