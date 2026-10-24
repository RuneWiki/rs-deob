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

@ObfuscatedName("KHACHIFW")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("KHACHIFW.e")
	public int deltime = 20;

	@ObfuscatedName("KHACHIFW.f")
	public int mindel = 1;

	@ObfuscatedName("KHACHIFW.g")
	public long[] otim = new long[10];

	@ObfuscatedName("KHACHIFW.i")
	public boolean showDebug = false;

	@ObfuscatedName("KHACHIFW.n")
	public Pix32[] temp = new Pix32[6];

	@ObfuscatedName("KHACHIFW.p")
	public boolean refresh = true;

	@ObfuscatedName("KHACHIFW.q")
	public boolean hasFocus = true;

	@ObfuscatedName("KHACHIFW.D")
	public int[] actionKey = new int[128];

	@ObfuscatedName("KHACHIFW.E")
	public int[] keyQueue = new int[128];

	@ObfuscatedName("KHACHIFW.d")
	public int state;

	@ObfuscatedName("KHACHIFW.h")
	public int fps;

	@ObfuscatedName("KHACHIFW.j")
	public int screenWidth;

	@ObfuscatedName("KHACHIFW.k")
	public int screenHeight;

	@ObfuscatedName("KHACHIFW.r")
	public int idleCycles;

	@ObfuscatedName("KHACHIFW.s")
	public int mouseButton;

	@ObfuscatedName("KHACHIFW.t")
	public int mouseX;

	@ObfuscatedName("KHACHIFW.u")
	public int mouseY;

	@ObfuscatedName("KHACHIFW.v")
	public int lastMouseClickButton;

	@ObfuscatedName("KHACHIFW.w")
	public int lastMouseClickX;

	@ObfuscatedName("KHACHIFW.x")
	public int lastMouseClickY;

	@ObfuscatedName("KHACHIFW.z")
	public int mouseClickButton;

	@ObfuscatedName("KHACHIFW.A")
	public int mouseClickX;

	@ObfuscatedName("KHACHIFW.B")
	public int mouseClickY;

	@ObfuscatedName("KHACHIFW.F")
	public int keyQueueReadPos;

	@ObfuscatedName("KHACHIFW.G")
	public int keyQueueWritePos;

	@ObfuscatedName("KHACHIFW.y")
	public long lastMouseClickTime;

	@ObfuscatedName("KHACHIFW.C")
	public long mouseClickTime;

	@ObfuscatedName("KHACHIFW.o")
	public ViewBox frame;

	@ObfuscatedName("KHACHIFW.m")
	public PixMap drawArea;

	@ObfuscatedName("KHACHIFW.l")
	public Graphics graphics;

	@ObfuscatedName("KHACHIFW.a(IZI)V")
	public final void initApplication(int arg0, int arg1) {
		screenWidth = arg1;
		screenHeight = arg0;
		frame = new ViewBox(this, screenWidth, screenHeight);
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(screenWidth, screenHeight, getBaseComponent());
		startThread(this, 1);
	}

	@ObfuscatedName("KHACHIFW.b(IZI)V")
	public final void initApplet(int arg0, int arg1) {
		screenWidth = arg1;
		screenHeight = arg0;
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(screenWidth, screenHeight, getBaseComponent());
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
					mouseClickButton = lastMouseClickButton;
					mouseClickX = lastMouseClickX;
					mouseClickY = lastMouseClickY;
					mouseClickTime = lastMouseClickTime;
					lastMouseClickButton = 0;
					update();
					keyQueueReadPos = keyQueueWritePos;
					var4 += var2;
				}

				var4 &= 0xFF;

				if (deltime > 0) {
					fps = var2 * 1000 / (deltime * 256);
				}

				draw();
			} while (!showDebug);

			System.out.println("ntime:" + var11);

			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + otim[var15]);
			}

			System.out.println("fps:" + fps + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + deltime + " mindel:" + mindel);
			System.out.println("intex:" + var5 + " opos:" + var1);
			showDebug = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("KHACHIFW.a(I)V")
	public final void shutdown() {
		state = -2;
		unload();

		if (frame != null) {
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

	@ObfuscatedName("KHACHIFW.a(ZI)V")
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

		refresh = true;
		refresh();
	}

	public final void paint(Graphics arg0) {
		if (graphics == null) {
			graphics = arg0;
		}

		refresh = true;
		refresh();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		idleCycles = 0;
		lastMouseClickX = var2;
		lastMouseClickY = var3;
		lastMouseClickTime = System.currentTimeMillis();

		if (arg0.isMetaDown()) {
			lastMouseClickButton = 2;
			mouseButton = 2;
		} else {
			lastMouseClickButton = 1;
			mouseButton = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		idleCycles = 0;
		mouseButton = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		idleCycles = 0;
		mouseX = -1;
		mouseY = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		idleCycles = 0;
		mouseX = var2;
		mouseY = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		idleCycles = 0;
		mouseX = var2;
		mouseY = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		idleCycles = 0;
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
			actionKey[var3] = 1;
		}

		if (var3 > 4) {
			keyQueue[keyQueueWritePos] = var3;
			keyQueueWritePos = keyQueueWritePos + 1 & 0x7F;
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		idleCycles = 0;
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
			actionKey[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("KHACHIFW.b(I)I")
	public final int pollKey() {
		int var1 = -1;
		if (keyQueueWritePos != keyQueueReadPos) {
			var1 = keyQueue[keyQueueReadPos];
			keyQueueReadPos = keyQueueReadPos + 1 & 0x7F;
		}

		return var1;
	}

	public final void focusGained(FocusEvent arg0) {
		hasFocus = true;
		refresh = true;
		refresh();
	}

	public final void focusLost(FocusEvent arg0) {
		hasFocus = false;

		for (int var2 = 0; var2 < 128; var2++) {
			actionKey[var2] = 0;
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

	@ObfuscatedName("KHACHIFW.a()V")
	public void load() {
	}

	@ObfuscatedName("KHACHIFW.c(I)V")
	public void update() {
	}

	@ObfuscatedName("KHACHIFW.d(I)V")
	public void unload() {
	}

	@ObfuscatedName("KHACHIFW.e(I)V")
	public void draw() {
	}

	@ObfuscatedName("KHACHIFW.a(B)V")
	public void refresh() {
	}

	@ObfuscatedName("KHACHIFW.f(I)Ljava/awt/Component;")
	public Component getBaseComponent() {
		if (frame != null) {
			return frame;
		}

		return this;
	}

	@ObfuscatedName("KHACHIFW.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("KHACHIFW.a(IBLjava/lang/String;)V")
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

		if (refresh) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, screenWidth, screenHeight);
			refresh = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = screenHeight / 2 - 18;
		graphics.setColor(var6);
		graphics.drawRect(screenWidth / 2 - 152, var7, 304, 34);
		graphics.fillRect(screenWidth / 2 - 150, var7 + 2, arg0 * 3, 30);
		graphics.setColor(Color.black);
		graphics.fillRect(arg0 * 3 + screenWidth / 2 - 150, var7 + 2, 300 - arg0 * 3, 30);
		graphics.setFont(var3);
		graphics.setColor(Color.white);
		graphics.drawString(arg1, (screenWidth - var4.stringWidth(arg1)) / 2, var7 + 22);
	}
}
