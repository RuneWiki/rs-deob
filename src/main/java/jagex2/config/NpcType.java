package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("gc")
public final class NpcType {

	@ObfuscatedName("gc.b")
	public static int field856;

	@ObfuscatedName("gc.c")
	public static int[] field857;

	@ObfuscatedName("gc.d")
	public static Packet field858;

	@ObfuscatedName("gc.e")
	public static NpcType[] field859;

	@ObfuscatedName("gc.f")
	public static int field860;

	@ObfuscatedName("gc.g")
	public long field861 = -1L;

	@ObfuscatedName("gc.h")
	public String field862;

	@ObfuscatedName("gc.i")
	public byte[] field863;

	@ObfuscatedName("gc.j")
	public byte field864 = 1;

	@ObfuscatedName("gc.k")
	public int[] field865;

	@ObfuscatedName("gc.l")
	public int[] field866;

	@ObfuscatedName("gc.m")
	public int field867 = -1;

	@ObfuscatedName("gc.n")
	public int field868 = -1;

	@ObfuscatedName("gc.o")
	public int field869 = -1;

	@ObfuscatedName("gc.p")
	public int field870 = -1;

	@ObfuscatedName("gc.q")
	public int field871 = -1;

	@ObfuscatedName("gc.r")
	public boolean field872 = false;

	@ObfuscatedName("gc.s")
	public int[] field873;

	@ObfuscatedName("gc.t")
	public int[] field874;

	@ObfuscatedName("gc.u")
	public String[] field875;

	@ObfuscatedName("gc.v")
	public int field876 = -1;

	@ObfuscatedName("gc.w")
	public int field877 = -1;

	@ObfuscatedName("gc.x")
	public int field878 = -1;

	@ObfuscatedName("gc.y")
	public boolean field879 = true;

	@ObfuscatedName("gc.z")
	public int field880 = -1;

	@ObfuscatedName("gc.A")
	public int field881 = 128;

	@ObfuscatedName("gc.B")
	public int field882 = 128;

	@ObfuscatedName("gc.C")
	public boolean field883 = false;

	@ObfuscatedName("gc.F")
	public int field886 = -1;

	@ObfuscatedName("gc.G")
	public static LruCache field887 = new LruCache(30);

	@ObfuscatedName("gc.D")
	public int field884;

	@ObfuscatedName("gc.E")
	public int field885;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static final void method340(Jagfile arg0) {
		field858 = new Packet(arg0.method308("npc.dat", null));
		Packet var1 = new Packet(arg0.method308("npc.idx", null));
		field856 = var1.method240();
		field857 = new int[field856];
		int var2 = 2;
		for (int var3 = 0; var3 < field856; var3++) {
			field857[var3] = var2;
			var2 += var1.method240();
		}

		field859 = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field859[var4] = new NpcType();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static final void method341() {
		field887 = null;
		field857 = null;
		field859 = null;
		field858 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final NpcType method342(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field859[var1].field861) {
				return field859[var1];
			}
		}

		field860 = (field860 + 1) % 20;
		NpcType var2 = field859[field860] = new NpcType();
		field858.field621 = field857[arg0];
		var2.field861 = arg0;
		var2.method343(field858);
		return var2;
	}

	@ObfuscatedName("gc.a(ILmb;)V")
	public final void method343(Packet arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method238();
				field865 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field865[var4] = arg0.method240();
				}
			} else if (var2 == 2) {
				field862 = arg0.method245();
			} else if (var2 == 3) {
				field863 = arg0.method246();
			} else if (var2 == 12) {
				field864 = arg0.method239();
			} else if (var2 == 13) {
				field867 = arg0.method240();
			} else if (var2 == 14) {
				field868 = arg0.method240();
			} else if (var2 == 16) {
				field872 = true;
			} else if (var2 == 17) {
				field868 = arg0.method240();
				field869 = arg0.method240();
				field870 = arg0.method240();
				field871 = arg0.method240();
			} else if (var2 >= 30 && var2 < 40) {
				if (field875 == null) {
					field875 = new String[5];
				}

				field875[var2 - 30] = arg0.method245();
				if (field875[var2 - 30].equalsIgnoreCase("hidden")) {
					field875[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method238();
				field873 = new int[var5];
				field874 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field873[var6] = arg0.method240();
					field874[var6] = arg0.method240();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method238();
				field866 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field866[var8] = arg0.method240();
				}
			} else if (var2 == 90) {
				field876 = arg0.method240();
			} else if (var2 == 91) {
				field877 = arg0.method240();
			} else if (var2 == 92) {
				field878 = arg0.method240();
			} else if (var2 == 93) {
				field879 = false;
			} else if (var2 == 95) {
				field880 = arg0.method240();
			} else if (var2 == 97) {
				field881 = arg0.method240();
			} else if (var2 == 98) {
				field882 = arg0.method240();
			} else if (var2 == 99) {
				field883 = true;
			} else if (var2 == 100) {
				field884 = arg0.method239();
			} else if (var2 == 101) {
				field885 = arg0.method239() * 5;
			} else if (var2 == 102) {
				field886 = arg0.method240();
			}
		}
	}

	@ObfuscatedName("gc.a(BII[I)Lfb;")
	public final Model method344(int arg0, int arg1, int[] arg2) {
		Model var4 = (Model) field887.method114(field861);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field865.length; var6++) {
				if (!Model.method139(field865[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			Model[] var7 = new Model[field865.length];
			for (int var8 = 0; var8 < field865.length; var8++) {
				var7[var8] = Model.method138(field865[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new Model(var7.length, var7);
			}

			if (field873 != null) {
				for (int var9 = 0; var9 < field873.length; var9++) {
					var4.method152(field873[var9], field874[var9]);
				}
			}

			var4.method145();
			var4.method155(field884 + 64, field885 + 850, -30, -50, -30, true);
			field887.method115(var4, field861);
		}

		Model var10 = Model.field480;
		var10.method140(!field872, var4);

		if (arg0 != -1 && arg1 != -1) {
			var10.method147(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			var10.method146(arg0);
		}

		if (field881 != 128 || field882 != 128) {
			var10.method154(field882, field881, field881);
		}

		var10.method142();
		var10.field517 = null;
		var10.field516 = null;

		if (field864 == 1) {
			var10.field518 = true;
		}

		return var10;
	}

	@ObfuscatedName("gc.a(Z)Lfb;")
	public final Model method345() {
		if (field866 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field866.length; var2++) {
			if (!Model.method139(field866[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		Model[] var3 = new Model[field866.length];
		for (int var4 = 0; var4 < field866.length; var4++) {
			var3[var4] = Model.method138(field866[var4]);
		}

		Model var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new Model(var3.length, var3);
		}

		if (field873 != null) {
			for (int var6 = 0; var6 < field873.length; var6++) {
				var5.method152(field873[var6], field874[var6]);
			}
		}

		return var5;
	}
}
