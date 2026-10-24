package jagex2.client;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public class InputTracking {

	@ObfuscatedName("f.e")
	public static boolean active;

	@ObfuscatedName("f.f")
	public static Packet old = null;

	@ObfuscatedName("f.g")
	public static Packet out = null;

	@ObfuscatedName("f.h")
	public static long lastTime;

	@ObfuscatedName("f.i")
	public static int trackedCount;

	@ObfuscatedName("f.j")
	public static long lastMoveTime;

	@ObfuscatedName("f.k")
	public static int lastX;

	@ObfuscatedName("f.l")
	public static int lastY;

	@ObfuscatedName("f.a(I)V")
	public static final synchronized void activate() {
		old = Packet.alloc(1);
		out = null;
		lastTime = System.currentTimeMillis();
		active = true;
	}

	@ObfuscatedName("f.b(I)V")
	public static final synchronized void deactivate() {
		active = false;
		old = null;
		out = null;
	}

	@ObfuscatedName("f.c(I)Lmb;")
	public static final synchronized Packet flush() {
		Packet var0 = null;
		if (out != null && active) {
			var0 = out;
		}

		out = null;
		return var0;
	}

	@ObfuscatedName("f.a(Z)Lmb;")
	public static final synchronized Packet stop() {
		Packet var0 = null;
		if (old != null && old.pos > 0 && active) {
			var0 = old;
		}

		deactivate();
		return var0;
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void ensureCapacity(int arg0) {
		if (old.pos + arg0 >= 500) {
			Packet var1 = old;
			old = Packet.alloc(1);
			out = var1;
		}
	}

	@ObfuscatedName("f.a(IBII)V")
	public static final synchronized void mousePressed(int arg0, int arg1, int arg2) {
		if (active && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
			trackedCount++;
			long var3 = System.currentTimeMillis();
			long var5 = (var3 - lastTime) / 10L;
			if (var5 > 250L) {
				var5 = 250L;
			}

			lastTime = var3;
			ensureCapacity(5);

			if (arg2 == 1) {
				old.p1(1);
			} else {
				old.p1(2);
			}

			old.p1((int) var5);
			old.p3((arg1 << 10) + arg0);
		}
	}

	@ObfuscatedName("f.a(IB)V")
	public static final synchronized void mouseReleased(int arg0) {
		if (active) {
			trackedCount++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - lastTime) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			lastTime = var1;
			ensureCapacity(2);

			if (arg0 == 1) {
				old.p1(3);
			} else {
				old.p1(4);
			}

			old.p1((int) var3);
		}
	}

	@ObfuscatedName("f.a(III)V")
	public static final synchronized void mouseMoved(int arg0, int arg1) {
		if (active && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
			long var2 = System.currentTimeMillis();
			if (var2 - lastMoveTime >= 50L) {
				lastMoveTime = var2;
				trackedCount++;
				long var4 = (var2 - lastTime) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}

				lastTime = var2;

				if (arg0 - lastX < 8 && arg0 - lastX >= -8 && arg1 - lastY < 8 && arg1 - lastY >= -8) {
					ensureCapacity(3);
					old.p1(5);
					old.p1((int) var4);
					old.p1((arg1 + 8 - lastY << 4) + arg0 + 8 - lastX);
				} else if (arg0 - lastX < 128 && arg0 - lastX >= -128 && arg1 - lastY < 128 && arg1 - lastY >= -128) {
					ensureCapacity(4);
					old.p1(6);
					old.p1((int) var4);
					old.p1(arg0 + 128 - lastX);
					old.p1(arg1 + 128 - lastY);
				} else {
					ensureCapacity(5);
					old.p1(7);
					old.p1((int) var4);
					old.p3((arg1 << 10) + arg0);
				}

				lastX = arg0;
				lastY = arg1;
			}
		}
	}

	@ObfuscatedName("f.b(II)V")
	public static final synchronized void keyPressed(int arg0) {
		if (active) {
			trackedCount++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - lastTime) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			lastTime = var1;

			if (arg0 == 1000) {
				arg0 = 11;
			}

			if (arg0 == 1001) {
				arg0 = 12;
			}

			if (arg0 == 1002) {
				arg0 = 14;
			}

			if (arg0 == 1003) {
				arg0 = 15;
			}

			if (arg0 >= 1008) {
				arg0 -= 992;
			}

			ensureCapacity(3);
			old.p1(8);
			old.p1((int) var3);
			old.p1(arg0);
		}
	}

	@ObfuscatedName("f.c(II)V")
	public static final synchronized void keyReleased(int arg0) {
		if (active) {
			trackedCount++;
			long var1 = System.currentTimeMillis();
			long var3 = (var1 - lastTime) / 10L;
			if (var3 > 250L) {
				var3 = 250L;
			}

			lastTime = var1;

			if (arg0 == 1000) {
				arg0 = 11;
			}

			if (arg0 == 1001) {
				arg0 = 12;
			}

			if (arg0 == 1002) {
				arg0 = 14;
			}

			if (arg0 == 1003) {
				arg0 = 15;
			}

			if (arg0 >= 1008) {
				arg0 -= 992;
			}

			ensureCapacity(3);
			old.p1(9);
			old.p1((int) var3);
			old.p1(arg0);
		}
	}

	@ObfuscatedName("f.a(B)V")
	public static final synchronized void focusGained() {
		if (active) {
			trackedCount++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - lastTime) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			lastTime = var0;
			ensureCapacity(2);
			old.p1(10);
			old.p1((int) var2);
		}
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void focusLost() {
		if (active) {
			trackedCount++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - lastTime) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			lastTime = var0;
			ensureCapacity(2);
			old.p1(11);
			old.p1((int) var2);
		}
	}

	@ObfuscatedName("f.b(Z)V")
	public static final synchronized void mouseEntered() {
		if (active) {
			trackedCount++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - lastTime) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			lastTime = var0;
			ensureCapacity(2);
			old.p1(12);
			old.p1((int) var2);
		}
	}

	@ObfuscatedName("f.e(I)V")
	public static final synchronized void mouseExited() {
		if (active) {
			trackedCount++;
			long var0 = System.currentTimeMillis();
			long var2 = (var0 - lastTime) / 10L;
			if (var2 > 250L) {
				var2 = 250L;
			}

			lastTime = var0;
			ensureCapacity(2);
			old.p1(13);
			old.p1((int) var2);
		}
	}
}
