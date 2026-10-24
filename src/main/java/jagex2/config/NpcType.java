package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public final class NpcType {

	@ObfuscatedName("bc.b")
	public static int numDefinitions;

	@ObfuscatedName("bc.c")
	public static int[] idx;

	@ObfuscatedName("bc.d")
	public static Packet dat;

	@ObfuscatedName("bc.e")
	public static NpcType[] recent;

	@ObfuscatedName("bc.f")
	public static int recentPos;

	@ObfuscatedName("bc.g")
	public long id = -1L;

	@ObfuscatedName("bc.h")
	public String name;

	@ObfuscatedName("bc.i")
	public byte[] desc;

	@ObfuscatedName("bc.j")
	public byte size = 1;

	@ObfuscatedName("bc.k")
	public int[] model;

	@ObfuscatedName("bc.l")
	public int[] head;

	@ObfuscatedName("bc.m")
	public int readyanim = -1;

	@ObfuscatedName("bc.n")
	public int walkanim = -1;

	@ObfuscatedName("bc.o")
	public int walkanim_b = -1;

	@ObfuscatedName("bc.p")
	public int walkanim_r = -1;

	@ObfuscatedName("bc.q")
	public int walkanim_l = -1;

	@ObfuscatedName("bc.r")
	public boolean animateTransparencies = false;

	@ObfuscatedName("bc.s")
	public int[] recol_s;

	@ObfuscatedName("bc.t")
	public int[] recol_d;

	@ObfuscatedName("bc.u")
	public String[] op;

	@ObfuscatedName("bc.v")
	public int field757 = -1;

	@ObfuscatedName("bc.w")
	public int field758 = -1;

	@ObfuscatedName("bc.x")
	public int field759 = -1;

	@ObfuscatedName("bc.y")
	public boolean minimap = true;

	@ObfuscatedName("bc.z")
	public int vislevel = -1;

	@ObfuscatedName("bc.A")
	public int resizeh = 128;

	@ObfuscatedName("bc.B")
	public int resizev = 128;

	@ObfuscatedName("bc.C")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("bc.a(Lub;)V")
	public static final void init(JagFile arg0) {
		dat = new Packet(arg0.read("npc.dat", null));
		Packet var1 = new Packet(arg0.read("npc.idx", null));
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}

		recent = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			recent[var4] = new NpcType();
		}
	}

	@ObfuscatedName("bc.a(Z)V")
	public static final void unload() {
		modelCache = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("bc.a(I)Lbc;")
	public static final NpcType list(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == recent[var1].id) {
				return recent[var1];
			}
		}

		recentPos = (recentPos + 1) % 20;
		NpcType var2 = recent[recentPos] = new NpcType();
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("bc.a(ZLkb;)V")
	public final void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.g1();
				model = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					model[var4] = arg0.g2();
				}
			} else if (var2 == 2) {
				name = arg0.gstr();
			} else if (var2 == 3) {
				desc = arg0.gstrbyte();
			} else if (var2 == 12) {
				size = arg0.g1b();
			} else if (var2 == 13) {
				readyanim = arg0.g2();
			} else if (var2 == 14) {
				walkanim = arg0.g2();
			} else if (var2 == 16) {
				animateTransparencies = true;
			} else if (var2 == 17) {
				walkanim = arg0.g2();
				walkanim_b = arg0.g2();
				walkanim_r = arg0.g2();
				walkanim_l = arg0.g2();
			} else if (var2 >= 30 && var2 < 40) {
				if (op == null) {
					op = new String[5];
				}

				op[var2 - 30] = arg0.gstr();
				if (op[var2 - 30].equalsIgnoreCase("hidden")) {
					op[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.g1();
				recol_s = new int[var5];
				recol_d = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					recol_s[var6] = arg0.g2();
					recol_d[var6] = arg0.g2();
				}
			} else if (var2 == 60) {
				int var7 = arg0.g1();
				head = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					head[var8] = arg0.g2();
				}
			} else if (var2 == 90) {
				field757 = arg0.g2();
			} else if (var2 == 91) {
				field758 = arg0.g2();
			} else if (var2 == 92) {
				field759 = arg0.g2();
			} else if (var2 == 93) {
				minimap = false;
			} else if (var2 == 95) {
				vislevel = arg0.g2();
			} else if (var2 == 97) {
				resizeh = arg0.g2();
			} else if (var2 == 98) {
				resizev = arg0.g2();
			}
		}
	}

	@ObfuscatedName("bc.a(II[I)Leb;")
	public final Model getTempModel(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		Model var5 = (Model) modelCache.find(id);
		if (var5 == null) {
			Model[] var6 = new Model[model.length];
			for (int var7 = 0; var7 < model.length; var7++) {
				var6[var7] = new Model(model[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new Model(var6, var6.length);
			}

			if (recol_s != null) {
				for (int var8 = 0; var8 < recol_s.length; var8++) {
					var5.recolour(recol_s[var8], recol_d[var8]);
				}
			}

			var5.prepareAnim();
			var5.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(id, var5);
		}

		Model var9 = new Model(var5, !animateTransparencies);
		if (arg0 != -1 && arg1 != -1) {
			var9.maskAnimate(arg1, arg0, arg2);
		} else if (arg0 != -1) {
			var9.animate(arg0);
		}

		if (resizeh != 128 || resizev != 128) {
			var9.resize(resizeh, resizev, resizeh);
		}

		var9.calcBoundingCylinder();
		var9.labelFaces = null;
		var9.labelVertices = null;

		if (size == 1) {
			var9.useAABBMouseCheck = true;
		}

		return var9;
	}

	@ObfuscatedName("bc.b(Z)Leb;")
	public final Model getHeadModel() {
		if (head == null) {
			return null;
		}

		Model[] var1 = new Model[head.length];
		for (int var2 = 0; var2 < head.length; var2++) {
			var1[var2] = new Model(head[var2]);
		}

		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1, var1.length);
		}

		if (recol_s != null) {
			for (int var4 = 0; var4 < recol_s.length; var4++) {
				var3.recolour(recol_s[var4], recol_d[var4]);
			}
		}

		return var3;
	}
}
