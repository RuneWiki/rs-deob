package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("kc")
public class SpotType {

	@ObfuscatedName("kc.b")
	public static int numDefinitions;

	@ObfuscatedName("kc.c")
	public static SpotType[] list;

	@ObfuscatedName("kc.d")
	public int id;

	@ObfuscatedName("kc.e")
	public int model;

	@ObfuscatedName("kc.f")
	public int anim = -1;

	@ObfuscatedName("kc.g")
	public SeqType seq;

	@ObfuscatedName("kc.h")
	public boolean animateTransparencies = false;

	@ObfuscatedName("kc.i")
	public int[] recol_s = new int[6];

	@ObfuscatedName("kc.j")
	public int[] recol_d = new int[6];

	@ObfuscatedName("kc.k")
	public int resizeh = 128;

	@ObfuscatedName("kc.l")
	public int resizev = 128;

	@ObfuscatedName("kc.m")
	public int angle;

	@ObfuscatedName("kc.n")
	public int ambient;

	@ObfuscatedName("kc.o")
	public int contrast;

	@ObfuscatedName("kc.p")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("kc.a(Lub;I)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("spotanim.dat", null));
		numDefinitions = var1.g2();
		if (list == null) {
			list = new SpotType[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new SpotType();
			}

			list[var2].id = var2;
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("kc.a(ZLkb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				model = arg0.g2();
			} else if (var2 == 2) {
				anim = arg0.g2();
				if (SeqType.list != null) {
					seq = SeqType.list[anim];
				}
			} else if (var2 == 3) {
				animateTransparencies = true;
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

	@ObfuscatedName("kc.a()Leb;")
	public Model getTempModel2() {
		Model var1 = (Model) modelCache.find(id);
		if (var1 != null) {
			return var1;
		}

		Model var2 = new Model(model);
		for (int var3 = 0; var3 < 6; var3++) {
			if (recol_s[0] != 0) {
				var2.recolour(recol_s[var3], recol_d[var3]);
			}
		}

		modelCache.put(id, var2);
		return var2;
	}
}
