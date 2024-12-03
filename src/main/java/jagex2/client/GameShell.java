package jagex2.client;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;
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

public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("KHACHIFW.a")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("KHACHIFW.b")
	public int _flowObfuscator2 = 24869;

	@ObfuscatedName("KHACHIFW.c")
	public int _flowObfuscator3 = 748;

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

	@ObfuscatedName("KHACHIFW.H")
	public static int _flowObfuscator4;

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
	public final void initApplication(int arg0, boolean arg1, int arg2) {
		this.screenWidth = arg2;
		this.screenHeight = arg0;
		if (!arg1) {
			this.frame = new ViewBox(this, this.screenWidth, (byte) 5, this.screenHeight);
			this.graphics = this.getBaseComponent(0).getGraphics();
			this.drawArea = new PixMap(this.screenWidth, this.screenHeight, this.getBaseComponent(0), 0);
			this.startThread(this, 1);
		}
	}

	@ObfuscatedName("KHACHIFW.b(IZI)V")
	public final void initApplet(int arg0, boolean arg1, int arg2) {
		this.screenWidth = arg2;
		this.screenHeight = arg0;
		this.graphics = this.getBaseComponent(0).getGraphics();
		this.drawArea = new PixMap(this.screenWidth, this.screenHeight, this.getBaseComponent(0), 0);
		this.startThread(this, 1);
		if (!arg1) {
			;
		}
	}

	public void run() {
		this.getBaseComponent(0).addMouseListener(this);
		this.getBaseComponent(0).addMouseMotionListener(this);
		this.getBaseComponent(0).addKeyListener(this);
		this.getBaseComponent(0).addFocusListener(this);
		if (this.frame != null) {
			this.frame.addWindowListener(this);
		}
		this.drawProgress(0, (byte) 4, "Loading...");
		this.load();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			this.otim[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (this.state < 0) {
					if (this.state == -1) {
						this.shutdown(4747);
					}
					return;
				}
				if (this.state > 0) {
					this.state--;
					if (this.state == 0) {
						this.shutdown(4747);
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.otim[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.otim[var1]) {
					var2 = (int) ((long) (this.deltime * 2560) / (var11 - this.otim[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.deltime - (var11 - this.otim[var1]) / 10L);
				}
				if (var3 > this.deltime) {
					var3 = this.deltime;
				}
				this.otim[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (this.otim[var13] != 0L) {
							this.otim[var13] += var3;
						}
					}
				}
				if (var3 < this.mindel) {
					var3 = this.mindel;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					this.mouseClickButton = this.lastMouseClickButton;
					this.mouseClickX = this.lastMouseClickX;
					this.mouseClickY = this.lastMouseClickY;
					this.mouseClickTime = this.lastMouseClickTime;
					this.lastMouseClickButton = 0;
					this.update(24869);
					this.keyQueueReadPos = this.keyQueueWritePos;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.deltime > 0) {
					this.fps = var2 * 1000 / (this.deltime * 256);
				}
				this.draw(0);
			} while (!this.showDebug);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 - var14 - 1 + 20) % 10;
				System.out.println("otim" + var15 + ":" + this.otim[var15]);
			}
			System.out.println("fps:" + this.fps + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.deltime + " mindel:" + this.mindel);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.showDebug = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("KHACHIFW.a(I)V")
	public final void shutdown(int arg0) {
		this.state = -2;
		this.unload(493);
		if (arg0 != 4747 || this.frame == null) {
			return;
		}
		try {
			Thread.sleep(1000L);
		} catch (Exception var3) {
		}
		try {
			System.exit(0);
		} catch (Throwable var2) {
		}
	}

	@ObfuscatedName("KHACHIFW.a(ZI)V")
	public final void setFramerate(boolean arg0, int arg1) {
		if (!arg0) {
			this.deltime = 1000 / arg1;
		}
	}

	public final void start() {
		if (this.state >= 0) {
			this.state = 0;
		}
	}

	public final void stop() {
		if (this.state >= 0) {
			this.state = 4000 / this.deltime;
		}
	}

	public final void destroy() {
		this.state = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (this.state == -1) {
			this.shutdown(4747);
		}
	}

	public final void update(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.refresh = true;
		this.refresh((byte) 1);
	}

	public final void paint(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.refresh = true;
		this.refresh((byte) 1);
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleCycles = 0;
		this.lastMouseClickX = var2;
		this.lastMouseClickY = var3;
		this.lastMouseClickTime = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.lastMouseClickButton = 2;
			this.mouseButton = 2;
		} else {
			this.lastMouseClickButton = 1;
			this.mouseButton = 1;
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseButton = 0;
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
	}

	public final void mouseExited(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	public final void keyPressed(KeyEvent arg0) {
		this.idleCycles = 0;
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
			this.actionKey[var3] = 1;
		}
		if (var3 > 4) {
			this.keyQueue[this.keyQueueWritePos] = var3;
			this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
		}
		if (Linkable._flowObfuscator2) {
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		this.idleCycles = 0;
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
			this.actionKey[var3] = 0;
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("KHACHIFW.b(I)I")
	public final int pollKey(int arg0) {
		while (arg0 >= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		int var2 = -1;
		if (this.keyQueueWritePos != this.keyQueueReadPos) {
			var2 = this.keyQueue[this.keyQueueReadPos];
			this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
		}
		return var2;
	}

	public final void focusGained(FocusEvent arg0) {
		this.hasFocus = true;
		this.refresh = true;
		this.refresh((byte) 1);
	}

	public final void focusLost(FocusEvent arg0) {
		this.hasFocus = false;
		for (int var2 = 0; var2 < 128; var2++) {
			this.actionKey[var2] = 0;
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
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
	public void update(int arg0) {
		if (this._flowObfuscator2 == arg0) {
			;
		}
	}

	@ObfuscatedName("KHACHIFW.d(I)V")
	public void unload(int arg0) {
		int var2 = 91 / arg0;
	}

	@ObfuscatedName("KHACHIFW.e(I)V")
	public void draw(int arg0) {
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	@ObfuscatedName("KHACHIFW.a(B)V")
	public void refresh(byte arg0) {
		if (arg0 == 1) {
			boolean var2 = false;
		}
	}

	@ObfuscatedName("KHACHIFW.f(I)Ljava/awt/Component;")
	public Component getBaseComponent(int arg0) {
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return this.frame == null ? this : this.frame;
	}

	@ObfuscatedName("KHACHIFW.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("KHACHIFW.a(IBLjava/lang/String;)V")
	public void drawProgress(int arg0, byte arg1, String arg2) {
		while (this.graphics == null) {
			this.graphics = this.getBaseComponent(0).getGraphics();
			try {
				this.getBaseComponent(0).repaint();
			} catch (Exception var10) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}
		Font var4 = new Font("Helvetica", 1, 13);
		FontMetrics var5 = this.getBaseComponent(0).getFontMetrics(var4);
		Font var6 = new Font("Helvetica", 0, 13);
		this.getBaseComponent(0).getFontMetrics(var6);
		if (this.refresh) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
			this.refresh = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.screenHeight / 2 - 18;
		this.graphics.setColor(var7);
		this.graphics.drawRect(this.screenWidth / 2 - 152, var8, 304, 34);
		this.graphics.fillRect(this.screenWidth / 2 - 150, var8 + 2, arg0 * 3, 30);
		this.graphics.setColor(Color.black);
		if (arg1 == 4) {
			this.graphics.fillRect(arg0 * 3 + (this.screenWidth / 2 - 150), var8 + 2, 300 - arg0 * 3, 30);
			this.graphics.setFont(var4);
			this.graphics.setColor(Color.white);
			this.graphics.drawString(arg2, (this.screenWidth - var5.stringWidth(arg2)) / 2, var8 + 22);
		}
	}
}
