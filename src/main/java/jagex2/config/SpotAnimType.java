package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("MUDLUUBC")
public class SpotAnimType {

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

	@ObfuscatedName("MUDLUUBC.p")
	public static LruCache modelCache = new LruCache(30);

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
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("spotanim.dat", null));
		count = var1.g2();
		if (instances == null) {
			instances = new SpotAnimType[count];
		}

		for (int var2 = 0; var2 < count; var2++) {
			if (instances[var2] == null) {
				instances[var2] = new SpotAnimType();
			}

			instances[var2].type = var2;
			instances[var2].decodeClient(var1);
		}
	}

	@ObfuscatedName("MUDLUUBC.a(ZLMBMGIXGO;)V")
	public void decodeClient(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				model = arg0.g2();
			} else if (var2 == 2) {
				anim = arg0.g2();
				if (SeqType.instances != null) {
					seq = SeqType.instances[anim];
				}
			} else if (var2 == 4) {
				resizeh = arg0.g2();
			} else if (var2 == 5) {
				resizev = arg0.g2();
			} else if (var2 == 6) {
				angle = arg0.g2();
			} else if (var2 == 7) {
				ambient = arg0.g1();
			} else if (var2 == 8) {
				contrast = arg0.g1();
			} else if (var2 >= 40 && var2 < 50) {
				recol_s[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				recol_d[var2 - 50] = arg0.g2();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MUDLUUBC.a()LZKARKDQW;")
	public Model getModel() {
		Model var1 = (Model) modelCache.get(type);
		if (var1 != null) {
			return var1;
		}

		Model var2 = Model.tryGet(model);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (recol_s[0] != 0) {
				var2.recolour(recol_s[var3], recol_d[var3]);
			}
		}

		modelCache.put(var2, type);
		return var2;
	}
}
