package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class SpotAnimType {

	@ObfuscatedName("MUDLUUBC.a")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("MUDLUUBC.g")
	public int anim = -1;

	@ObfuscatedName("MUDLUUBC.i")
	public int[] recol_s = new int[6];

	@ObfuscatedName("MUDLUUBC.j")
	public int[] recol_d = new int[6];

	@ObfuscatedName("MUDLUUBC.k")
	public int resizeh = 128;

	@ObfuscatedName("MUDLUUBC.l")
	public int resizev = 128;

	@ObfuscatedName("MUDLUUBC.b")
	public static boolean _flowObfuscator2 = true;

	@ObfuscatedName("MUDLUUBC.p")
	public static LruCache modelCache = new LruCache(false, 30);

	@ObfuscatedName("MUDLUUBC.c")
	public static int count;

	@ObfuscatedName("MUDLUUBC.e")
	public int type;

	@ObfuscatedName("MUDLUUBC.f")
	public int model;

	@ObfuscatedName("MUDLUUBC.m")
	public int angle;

	@ObfuscatedName("MUDLUUBC.n")
	public int ambient;

	@ObfuscatedName("MUDLUUBC.o")
	public int contrast;

	@ObfuscatedName("MUDLUUBC.h")
	public SeqType seq;

	@ObfuscatedName("MUDLUUBC.d")
	public static SpotAnimType[] instances;

	@ObfuscatedName("MUDLUUBC.a(ILXTGLDHGX;)V")
	public static void unpack(int arg0, Jagfile arg1) {
		Packet var2 = new Packet(arg1.read("spotanim.dat", null), 891);
		if (arg0 != 0) {
			_flowObfuscator2 = !_flowObfuscator2;
		}
		count = var2.g2();
		if (instances == null) {
			instances = new SpotAnimType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (instances[var3] == null) {
				instances[var3] = new SpotAnimType();
			}
			instances[var3].type = var3;
			instances[var3].decodeClient(true, var2);
		}
	}

	@ObfuscatedName("MUDLUUBC.a(ZLMBMGIXGO;)V")
	public void decodeClient(boolean arg0, Packet arg1) {
		if (!arg0) {
			throw new NullPointerException();
		}
		while (true) {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.model = arg1.g2();
				} else if (var3 == 2) {
					this.anim = arg1.g2();
					if (SeqType.instances != null) {
						this.seq = SeqType.instances[this.anim];
					}
				} else if (var3 == 4) {
					this.resizeh = arg1.g2();
				} else if (var3 == 5) {
					this.resizev = arg1.g2();
				} else if (var3 == 6) {
					this.angle = arg1.g2();
				} else if (var3 == 7) {
					this.ambient = arg1.g1();
				} else if (var3 == 8) {
					this.contrast = arg1.g1();
				} else if (var3 >= 40 && var3 < 50) {
					this.recol_s[var3 - 40] = arg1.g2();
				} else if (var3 >= 50 && var3 < 60) {
					this.recol_d[var3 - 50] = arg1.g2();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var3);
				}
			}
		}
	}

	@ObfuscatedName("MUDLUUBC.a()LZKARKDQW;")
	public Model getModel() {
		Model var1 = (Model) modelCache.get((long) this.type);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.tryGet(this._flowObfuscator1, this.model);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.recol_s[0] != 0) {
				var2.recolour(this.recol_s[var3], this.recol_d[var3]);
			}
		}
		modelCache.put(var2, (long) this.type, (byte) 2);
		return var2;
	}
}
