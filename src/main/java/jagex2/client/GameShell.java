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
	public int fps;

	@ObfuscatedName("a.l")
	public int sWid;

	@ObfuscatedName("a.m")
	public int sHei;

	@ObfuscatedName("a.n")
	public Graphics graphics;

	@ObfuscatedName("a.o")
	public PixMap drawArea;

	@ObfuscatedName("a.p")
	public Pix32[] drawAreas = new Pix32[6];

	@ObfuscatedName("a.q")
	public ViewBox frame;

	@ObfuscatedName("a.r")
	public boolean fullredraw = true;

	@ObfuscatedName("a.s")
	public int idleTimer;

	@ObfuscatedName("a.t")
	public int mouseButton;

	@ObfuscatedName("a.u")
	public int mouseX;

	@ObfuscatedName("a.v")
	public int mouseY;

	@ObfuscatedName("a.w")
	public int mouseClickButton;

	@ObfuscatedName("a.x")
	public int mouseClickX;

	@ObfuscatedName("a.y")
	public int mouseClickY;

	@ObfuscatedName("a.z")
	public int[] keyHeld = new int[128];

	@ObfuscatedName("a.A")
	public int[] keyQueue = new int[128];

	@ObfuscatedName("a.B")
	public int keyQueueReadPos;

	@ObfuscatedName("a.C")
	public int keyQueueWritePos;

	@ObfuscatedName("a.a(III)V")
	public final void initApplication(int arg0, int arg1) {
		sWid = arg1;
		sHei = arg0;
		frame = new ViewBox(sHei, this, sWid);
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(getBaseComponent(), sWid, sHei);
		startThread(this, 1);
	}

	@ObfuscatedName("a.a(IZI)V")
	public final void initApplet(int arg0, int arg1) {
		sWid = arg1;
		sHei = arg0;
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(getBaseComponent(), sWid, sHei);
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

		drawProgress("Loading...", 0);
		maininit();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;

		for (int var5 = 0; var5 < 10; var5++) {
			otim[var5] = System.currentTimeMillis();
		}

		long var6 = System.currentTimeMillis();

		while (state >= 0) {
			if (state > 0) {
				state--;
				if (state == 0) {
					shutdown();
					return;
				}
			}

			int var8 = var2;
			int var9 = var3;
			var2 = 300;
			var3 = 1;
			long var10 = System.currentTimeMillis();
			if (otim[var1] == 0L) {
				var2 = var8;
				var3 = var9;
			} else if (var10 > otim[var1]) {
				var2 = (int) (deltime * 2560 / (var10 - otim[var1]));
			}

			if (var2 < 25) {
				var2 = 25;
			}

			if (var2 > 256) {
				var2 = 256;
				var3 = (int) (deltime - (var10 - otim[var1]) / 10L);
			}

			otim[var1] = var10;
			var1 = (var1 + 1) % 10;

			if (var3 > 1) {
				for (int var12 = 0; var12 < 10; var12++) {
					if (otim[var12] != 0L) {
						otim[var12] += var3;
					}
				}
			}

			if (var3 < mindel) {
				var3 = mindel;
			}

			try {
				Thread.sleep(var3);
			} catch (InterruptedException var13) {
			}

			while (var4 < 256) {
				mainloop();
				mouseClickButton = 0;
				keyQueueReadPos = keyQueueWritePos;
				var4 += var2;
			}

			var4 &= 0xFF;

			if (deltime > 0) {
				fps = var2 * 1000 / (deltime * 256);
			}

			mainredraw();
		}

		if (state == -1) {
			shutdown();
		}
	}

	@ObfuscatedName("a.a(I)V")
	public final void shutdown() {
		state = -2;
		mainquit();

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

		fullredraw = true;
		refresh();
	}

	public final void paint(Graphics arg0) {
		if (graphics == null) {
			graphics = arg0;
		}

		fullredraw = true;
		refresh();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		idleTimer = 0;
		mouseClickX = var2;
		mouseClickY = var3;

		if (arg0.isMetaDown()) {
			mouseClickButton = 2;
			mouseButton = 2;
		} else {
			mouseClickButton = 1;
			mouseButton = 1;
		}

		if (InputTracking.active) {
			InputTracking.mousePressed(var2, arg0.isMetaDown() ? 1 : 0, var3);
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		idleTimer = 0;
		mouseButton = 0;

		if (InputTracking.active) {
			InputTracking.mouseReleased(arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (InputTracking.active) {
			InputTracking.mouseEntered();
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		if (InputTracking.active) {
			InputTracking.mouseExited();
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		idleTimer = 0;
		mouseX = var2;
		mouseY = var3;

		if (InputTracking.active) {
			InputTracking.mouseMoved(var3, var2);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}

		idleTimer = 0;
		mouseX = var2;
		mouseY = var3;

		if (InputTracking.active) {
			InputTracking.mouseMoved(var3, var2);
		}
	}

	public final void keyPressed(KeyEvent arg0) {
		idleTimer = 0;
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
			keyHeld[var3] = 1;
		}

		if (var3 > 4) {
			keyQueue[keyQueueWritePos] = var3;
			keyQueueWritePos = keyQueueWritePos + 1 & 0x7F;
		}

		if (InputTracking.active) {
			InputTracking.keyPressed(var3);
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		idleTimer = 0;
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
			keyHeld[var3] = 0;
		}

		if (InputTracking.active) {
			InputTracking.keyReleased(var3);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	public final void focusGained(FocusEvent arg0) {
		fullredraw = true;
		refresh();

		if (InputTracking.active) {
			InputTracking.focusGained();
		}
	}

	public final void focusLost(FocusEvent arg0) {
		if (InputTracking.active) {
			InputTracking.focusLost();
		}
	}

	@ObfuscatedName("a.a(Z)I")
	public final int pollKey() {
		int var1 = -1;
		if (keyQueueWritePos != keyQueueReadPos) {
			var1 = keyQueue[keyQueueReadPos];
			keyQueueReadPos = keyQueueReadPos + 1 & 0x7F;
		}

		return var1;
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
	public void maininit() {
	}

	@ObfuscatedName("a.b(I)V")
	public void mainloop() {
	}

	@ObfuscatedName("a.a(B)V")
	public void mainquit() {
	}

	@ObfuscatedName("a.b(Z)V")
	public void mainredraw() {
	}

	@ObfuscatedName("a.c(I)V")
	public void refresh() {
	}

	@ObfuscatedName("a.b(B)Ljava/awt/Component;")
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

	@ObfuscatedName("a.a(ZLjava/lang/String;I)V")
	public void drawProgress(String arg0, int arg1) {
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

		if (fullredraw) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, sWid, sHei);
			fullredraw = false;
		}

		Color var6 = new Color(140, 17, 17);
		int var7 = sHei / 2 - 18;
		graphics.setColor(var6);
		graphics.drawRect(sWid / 2 - 152, var7, 304, 34);
		graphics.fillRect(sWid / 2 - 150, var7 + 2, arg1 * 3, 30);
		graphics.setColor(Color.black);
		graphics.fillRect(arg1 * 3 + sWid / 2 - 150, var7 + 2, 300 - arg1 * 3, 30);
		graphics.setFont(var3);
		graphics.setColor(Color.white);
		graphics.drawString(arg0, (sWid - var4.stringWidth(arg0)) / 2, var7 + 22);
	}
}
