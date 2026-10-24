package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import jagex2.jstring.JString;

@ObfuscatedName("EWIXBTLV")
public class Component {

	@ObfuscatedName("EWIXBTLV.K")
	public static int field641 = -1;

	@ObfuscatedName("EWIXBTLV.T")
	public static int field650 = -1;

	@ObfuscatedName("EWIXBTLV.cb")
	public static LruCache field658 = new LruCache(30);

	@ObfuscatedName("EWIXBTLV.pb")
	public static int field668 = -1;

	@ObfuscatedName("EWIXBTLV.k")
	public byte field615;

	@ObfuscatedName("EWIXBTLV.f")
	public int field610;

	@ObfuscatedName("EWIXBTLV.i")
	public int field613;

	@ObfuscatedName("EWIXBTLV.m")
	public int field617;

	@ObfuscatedName("EWIXBTLV.p")
	public int field620;

	@ObfuscatedName("EWIXBTLV.q")
	public int field621;

	@ObfuscatedName("EWIXBTLV.r")
	public int field622;

	@ObfuscatedName("EWIXBTLV.s")
	public int field623;

	@ObfuscatedName("EWIXBTLV.v")
	public int field626;

	@ObfuscatedName("EWIXBTLV.z")
	public int field630;

	@ObfuscatedName("EWIXBTLV.A")
	public int field631;

	@ObfuscatedName("EWIXBTLV.C")
	public int field633;

	@ObfuscatedName("EWIXBTLV.E")
	public int field635;

	@ObfuscatedName("EWIXBTLV.F")
	public int field636;

	@ObfuscatedName("EWIXBTLV.G")
	public int field637;

	@ObfuscatedName("EWIXBTLV.H")
	public static int field638;

	@ObfuscatedName("EWIXBTLV.I")
	public int field639;

	@ObfuscatedName("EWIXBTLV.M")
	public int field643;

	@ObfuscatedName("EWIXBTLV.P")
	public int field646;

	@ObfuscatedName("EWIXBTLV.Q")
	public int field647;

	@ObfuscatedName("EWIXBTLV.R")
	public int field648;

	@ObfuscatedName("EWIXBTLV.S")
	public int field649;

	@ObfuscatedName("EWIXBTLV.X")
	public int field653;

	@ObfuscatedName("EWIXBTLV.Y")
	public int field654;

	@ObfuscatedName("EWIXBTLV.Z")
	public int field655;

	@ObfuscatedName("EWIXBTLV.bb")
	public int field657;

	@ObfuscatedName("EWIXBTLV.eb")
	public int field660;

	@ObfuscatedName("EWIXBTLV.fb")
	public int field661;

	@ObfuscatedName("EWIXBTLV.sb")
	public static int field669;

	@ObfuscatedName("EWIXBTLV.vb")
	public int field672;

	@ObfuscatedName("EWIXBTLV.wb")
	public int field673;

	@ObfuscatedName("EWIXBTLV.xb")
	public int field674;

	@ObfuscatedName("EWIXBTLV.yb")
	public int field675;

	@ObfuscatedName("EWIXBTLV.zb")
	public int field676;

	@ObfuscatedName("EWIXBTLV.Bb")
	public int field678;

	@ObfuscatedName("EWIXBTLV.e")
	public static Jagfile field609;

	@ObfuscatedName("EWIXBTLV.c")
	public Pix32 field607;

	@ObfuscatedName("EWIXBTLV.J")
	public Pix32 field640;

	@ObfuscatedName("EWIXBTLV.B")
	public PixFont field632;

	@ObfuscatedName("EWIXBTLV.O")
	public static LruCache field645;

	@ObfuscatedName("EWIXBTLV.b")
	public String field606;

	@ObfuscatedName("EWIXBTLV.u")
	public String field625;

	@ObfuscatedName("EWIXBTLV.N")
	public String field644;

	@ObfuscatedName("EWIXBTLV.gb")
	public String field662;

	@ObfuscatedName("EWIXBTLV.tb")
	public String field670;

	@ObfuscatedName("EWIXBTLV.h")
	public boolean field612;

	@ObfuscatedName("EWIXBTLV.j")
	public boolean field614;

	@ObfuscatedName("EWIXBTLV.t")
	public boolean field624;

	@ObfuscatedName("EWIXBTLV.x")
	public boolean field628;

	@ObfuscatedName("EWIXBTLV.D")
	public boolean field634;

	@ObfuscatedName("EWIXBTLV.L")
	public boolean field642;

	@ObfuscatedName("EWIXBTLV.kb")
	public boolean field664;

	@ObfuscatedName("EWIXBTLV.mb")
	public boolean field666;

	@ObfuscatedName("EWIXBTLV.Ab")
	public boolean field677;

	@ObfuscatedName("EWIXBTLV.d")
	public int[] field608;

	@ObfuscatedName("EWIXBTLV.l")
	public int[] field616;

	@ObfuscatedName("EWIXBTLV.o")
	public int[] field619;

	@ObfuscatedName("EWIXBTLV.w")
	public int[] field627;

	@ObfuscatedName("EWIXBTLV.U")
	public int[] field651;

	@ObfuscatedName("EWIXBTLV.W")
	public int[] field652;

	@ObfuscatedName("EWIXBTLV.hb")
	public int[] field663;

	@ObfuscatedName("EWIXBTLV.lb")
	public int[] field665;

	@ObfuscatedName("EWIXBTLV.ob")
	public int[] field667;

	@ObfuscatedName("EWIXBTLV.db")
	public Pix32[] field659;

	@ObfuscatedName("EWIXBTLV.g")
	public static Component[] field611;

	@ObfuscatedName("EWIXBTLV.n")
	public static PixFont[] field618;

	@ObfuscatedName("EWIXBTLV.ab")
	public String[] field656;

	@ObfuscatedName("EWIXBTLV.ub")
	public static byte[][] field671;

	@ObfuscatedName("EWIXBTLV.y")
	public int[][] field629;

	@ObfuscatedName("EWIXBTLV.a(ILjava/lang/String;I)LEPQDEJTO;")
	public static Pix32 method203(int arg0, String arg1) {
		long var2 = (JString.method346(arg1) << 8) + arg0;
		Pix32 var4 = (Pix32) field645.method458(var2);
		if (var4 != null) {
			return var4;
		} else if (field609 == null) {
			return null;
		} else {
			try {
				Pix32 var5 = new Pix32(field609, arg1, arg0);
				field645.method459(var5, var2);
				return var5;
			} catch (Exception var6) {
				return null;
			}
		}
	}

	@ObfuscatedName("EWIXBTLV.a(I)LEWIXBTLV;")
	public static Component method204(int arg0) {
		if (field611[arg0] == null) {
			Packet var1 = new Packet(field671[arg0]);
			int var2 = var1.g2();
			field611[arg0] = method207(var2, var1, arg0);
		}

		return field611[arg0];
	}

	@ObfuscatedName("EWIXBTLV.a(III)V")
	public void method205(int arg0, int arg1) {
		int var3 = field663[arg1];
		field663[arg1] = field663[arg0];
		field663[arg0] = var3;
		int var4 = field619[arg1];
		field619[arg1] = field619[arg0];
		field619[arg0] = var4;
	}

	@ObfuscatedName("EWIXBTLV.a(II)LLZYQDKJV;")
	public Model method206(int arg0, int arg1) {
		ObjType var3 = null;
		if (arg0 == 4) {
			var3 = ObjType.method221(arg1);
			field669 += var3.field733;
			field638 += var3.field737;
		}

		Model var4 = (Model) field658.method458((arg0 << 16) + arg1);
		if (var4 != null) {
			return var4;
		}

		if (arg0 == 1) {
			var4 = Model.method359(arg1);
		}

		if (arg0 == 2) {
			var4 = NpcType.method477(arg1).method472();
		}

		if (arg0 == 3) {
			var4 = Client.field408.method572();
		}

		if (arg0 == 4) {
			var4 = var3.method226(50);
		}

		if (arg0 == 5) {
			var4 = null;
		}

		if (var4 != null) {
			field658.method459(var4, (arg0 << 16) + arg1);
		}

		return var4;
	}

	@ObfuscatedName("EWIXBTLV.a(ILMFMVIYHT;II)LEWIXBTLV;")
	public static Component method207(int arg0, Packet arg1, int arg2) {
		Component var3 = new Component();
		var3.field610 = arg2;
		var3.field643 = arg0;
		var3.field631 = arg1.g1();
		var3.field678 = arg1.g1();
		var3.field637 = arg1.g2();
		var3.field636 = arg1.g2();
		var3.field633 = arg1.g2();
		var3.field615 = (byte) arg1.g1();
		var3.field649 = arg1.g1();
		if (var3.field649 == 0) {
			var3.field649 = -1;
		} else {
			var3.field649 = (var3.field649 - 1 << 8) + arg1.g1();
		}

		if (var3.field637 == 600) {
			field641 = arg0;
		}

		if (var3.field637 == 650) {
			field650 = arg0;
		}

		if (var3.field637 == 655) {
			field668 = arg0;
		}

		int var4 = arg1.g1();
		if (var4 > 0) {
			var3.field665 = new int[var4];
			var3.field651 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				var3.field665[var5] = arg1.g1();
				var3.field651[var5] = arg1.g2();
			}
		}

		int var6 = arg1.g1();
		if (var6 > 0) {
			var3.field629 = new int[var6][];
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = arg1.g2();
				var3.field629[var7] = new int[var8];
				for (int var9 = 0; var9 < var8; var9++) {
					var3.field629[var7][var9] = arg1.g2();
				}
			}
		}

		if (var3.field631 == 0) {
			var3.field674 = arg1.g2();
			var3.field614 = arg1.g1() == 1;
			int var10 = arg1.g2();
			var3.field652 = new int[var10];
			var3.field627 = new int[var10];
			var3.field667 = new int[var10];
			for (int var11 = 0; var11 < var10; var11++) {
				var3.field652[var11] = arg1.g2();
				var3.field627[var11] = arg1.g2b();
				var3.field667[var11] = arg1.g2b();
			}
		}

		if (var3.field631 == 1) {
			var3.field620 = arg1.g2();
			var3.field628 = arg1.g1() == 1;
		}

		if (var3.field631 == 2) {
			var3.field663 = new int[var3.field636 * var3.field633];
			var3.field619 = new int[var3.field636 * var3.field633];
			var3.field666 = arg1.g1() == 1;
			var3.field624 = arg1.g1() == 1;
			var3.field677 = arg1.g1() == 1;
			var3.field612 = arg1.g1() == 1;
			var3.field657 = arg1.g1();
			var3.field639 = arg1.g1();
			var3.field616 = new int[20];
			var3.field608 = new int[20];
			var3.field659 = new Pix32[20];
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = arg1.g1();
				if (var13 == 1) {
					var3.field616[var12] = arg1.g2b();
					var3.field608[var12] = arg1.g2b();
					String var14 = arg1.gjstr();
					if (var14.length() > 0) {
						int var15 = var14.lastIndexOf(",");
						var3.field659[var12] = method203(Integer.parseInt(var14.substring(var15 + 1)), var14.substring(0, var15));
					}
				}
			}

			var3.field656 = new String[5];
			for (int var16 = 0; var16 < 5; var16++) {
				var3.field656[var16] = arg1.gjstr();
				if (var3.field656[var16].length() == 0) {
					var3.field656[var16] = null;
				}
			}
		}

		if (var3.field631 == 3) {
			var3.field634 = arg1.g1() == 1;
		}

		if (var3.field631 == 4 || var3.field631 == 1) {
			var3.field664 = arg1.g1() == 1;
			int var17 = arg1.g1();
			if (field618 != null) {
				var3.field632 = field618[var17];
			}

			var3.field642 = arg1.g1() == 1;
		}

		if (var3.field631 == 4) {
			var3.field625 = arg1.gjstr();
			var3.field644 = arg1.gjstr();
		}

		if (var3.field631 == 1 || var3.field631 == 3 || var3.field631 == 4) {
			var3.field635 = arg1.g4();
		}

		if (var3.field631 == 3 || var3.field631 == 4) {
			var3.field654 = arg1.g4();
			var3.field655 = arg1.g4();
			var3.field621 = arg1.g4();
		}

		if (var3.field631 == 5) {
			String var18 = arg1.gjstr();
			if (var18.length() > 0) {
				int var19 = var18.lastIndexOf(",");
				var3.field607 = method203(Integer.parseInt(var18.substring(var19 + 1)), var18.substring(0, var19));
			}

			String var20 = arg1.gjstr();
			if (var20.length() > 0) {
				int var21 = var20.lastIndexOf(",");
				var3.field640 = method203(Integer.parseInt(var20.substring(var21 + 1)), var20.substring(0, var21));
			}
		}

		if (var3.field631 == 6) {
			int var22 = arg1.g1();
			if (var22 != 0) {
				var3.field672 = 1;
				var3.field673 = (var22 - 1 << 8) + arg1.g1();
			}

			int var23 = arg1.g1();
			if (var23 != 0) {
				var3.field660 = 1;
				var3.field661 = (var23 - 1 << 8) + arg1.g1();
			}

			int var24 = arg1.g1();
			if (var24 == 0) {
				var3.field675 = -1;
			} else {
				var3.field675 = (var24 - 1 << 8) + arg1.g1();
			}

			int var25 = arg1.g1();
			if (var25 == 0) {
				var3.field676 = -1;
			} else {
				var3.field676 = (var25 - 1 << 8) + arg1.g1();
			}

			var3.field646 = arg1.g2();
			var3.field647 = arg1.g2();
			var3.field648 = arg1.g2();
		}

		if (var3.field631 == 7) {
			var3.field663 = new int[var3.field636 * var3.field633];
			var3.field619 = new int[var3.field636 * var3.field633];
			var3.field664 = arg1.g1() == 1;
			int var26 = arg1.g1();
			if (field618 != null) {
				var3.field632 = field618[var26];
			}

			var3.field642 = arg1.g1() == 1;
			var3.field635 = arg1.g4();
			var3.field657 = arg1.g2b();
			var3.field639 = arg1.g2b();
			var3.field624 = arg1.g1() == 1;
			var3.field656 = new String[5];
			for (int var27 = 0; var27 < 5; var27++) {
				var3.field656[var27] = arg1.gjstr();
				if (var3.field656[var27].length() == 0) {
					var3.field656[var27] = null;
				}
			}
		}

		if (var3.field631 == 8) {
			var3.field625 = arg1.gjstr();
		}

		if (var3.field678 == 2 || var3.field631 == 2) {
			var3.field670 = arg1.gjstr();
			var3.field606 = arg1.gjstr();
			var3.field617 = arg1.g2();
		}

		if (var3.field678 == 1 || var3.field678 == 4 || var3.field678 == 5 || var3.field678 == 6) {
			var3.field662 = arg1.gjstr();
			if (var3.field662.length() == 0) {
				if (var3.field678 == 1) {
					var3.field662 = "Ok";
				}

				if (var3.field678 == 4) {
					var3.field662 = "Select";
				}

				if (var3.field678 == 5) {
					var3.field662 = "Select";
				}

				if (var3.field678 == 6) {
					var3.field662 = "Continue";
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("EWIXBTLV.a(I[LJDPYRDAS;LATJMVOZR;LATJMVOZR;)V")
	public static void method208(PixFont[] arg0, Jagfile arg1, Jagfile arg2) {
		field645 = new LruCache(50000);
		field609 = arg2;
		field618 = arg0;
		int var3 = -1;
		Packet var4 = new Packet(arg1.method2("data", null));
		int var5 = var4.g2();
		field611 = new Component[var5];
		field671 = new byte[var5][];
		while (var4.pos < var4.data.length) {
			int var6 = var4.g2();
			if (var6 == 0xFFFF) {
				var3 = var4.g2();
				var6 = var4.g2();
			}

			int var7 = var4.pos;
			Component var8 = method207(var3, var4, var6);
			byte[] var9 = field671[var8.field610] = new byte[var4.pos + 2 - var7];
			for (int var10 = var7; var10 < var4.pos; var10++) {
				var9[var10 + 2 - var7] = var4.data[var10];
			}

			var9[0] = (byte) (var3 >> 8);
			var9[1] = (byte) var3;
		}

		field609 = null;
	}

	@ObfuscatedName("EWIXBTLV.a(ZI)V")
	public static void method209(int arg0) {
		if (arg0 != -1) {
			for (int var1 = 0; var1 < field611.length; var1++) {
				if (field611[var1] != null && field611[var1].field643 == arg0 && field611[var1].field631 != 2) {
					field611[var1] = null;
				}
			}
		}
	}

	@ObfuscatedName("EWIXBTLV.a(ILLZYQDKJV;II)V")
	public static void method210(int arg0, Model arg1, int arg2) {
		field658.method460();

		if (arg1 != null && arg0 != 4) {
			field658.method459(arg1, (arg0 << 16) + arg2);
		}
	}

	@ObfuscatedName("EWIXBTLV.a(Z)V")
	public static void method211() {
		field611 = null;
		field609 = null;
		field645 = null;
		field618 = null;
		field671 = null;
	}

	@ObfuscatedName("EWIXBTLV.a(IIIZ)LLZYQDKJV;")
	public Model method212(int arg0, int arg1, boolean arg2) {
		field669 = 64;
		field638 = 768;
		Model var4;
		if (arg2) {
			var4 = method206(field660, field661);
		} else {
			var4 = method206(field672, field673);
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field1052 == null) {
			return var4;
		} else {
			Model var5 = new Model(false, true, var4, AnimFrame.method265(arg0) & AnimFrame.method265(arg1));
			if (arg0 != -1 || arg1 != -1) {
				var5.method366();
			}

			if (arg0 != -1) {
				var5.method367(arg0);
			}

			if (arg1 != -1) {
				var5.method367(arg1);
			}

			var5.method376(field669, field638, -50, -10, -50, true);
			return var5;
		}
	}
}
