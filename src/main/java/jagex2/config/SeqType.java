package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("FHWCLIAS")
public class SeqType {

	@ObfuscatedName("FHWCLIAS.i")
	public int field685 = -1;

	@ObfuscatedName("FHWCLIAS.k")
	public boolean field687 = false;

	@ObfuscatedName("FHWCLIAS.l")
	public int field688 = 5;

	@ObfuscatedName("FHWCLIAS.m")
	public int field689 = -1;

	@ObfuscatedName("FHWCLIAS.n")
	public int field690 = -1;

	@ObfuscatedName("FHWCLIAS.o")
	public int field691 = 99;

	@ObfuscatedName("FHWCLIAS.p")
	public int field692 = -1;

	@ObfuscatedName("FHWCLIAS.q")
	public int field693 = -1;

	@ObfuscatedName("FHWCLIAS.r")
	public int field694 = 2;

	@ObfuscatedName("FHWCLIAS.c")
	public static int field679;

	@ObfuscatedName("FHWCLIAS.e")
	public int field681;

	@ObfuscatedName("FHWCLIAS.s")
	public int field695;

	@ObfuscatedName("FHWCLIAS.f")
	public int[] field682;

	@ObfuscatedName("FHWCLIAS.g")
	public int[] field683;

	@ObfuscatedName("FHWCLIAS.h")
	public int[] field684;

	@ObfuscatedName("FHWCLIAS.j")
	public int[] field686;

	@ObfuscatedName("FHWCLIAS.d")
	public static SeqType[] field680;

	@ObfuscatedName("FHWCLIAS.a(LATJMVOZR;I)V")
	public static void method213(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method2("seq.dat", null));
		field679 = var1.g2();
		if (field680 == null) {
			field680 = new SeqType[field679];
		}

		for (int var2 = 0; var2 < field679; var2++) {
			if (field680[var2] == null) {
				field680[var2] = new SeqType();
			}

			field680[var2].method215(var1);
		}
	}

	@ObfuscatedName("FHWCLIAS.a(II)I")
	public int method214(int arg0) {
		int var2 = field684[arg0];
		if (var2 == 0) {
			AnimFrame var3 = AnimFrame.method264(field682[arg0]);
			if (var3 != null) {
				var2 = field684[arg0] = var3.field813;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("FHWCLIAS.a(BLMFMVIYHT;)V")
	public void method215(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				if (field681 == 0) {
					field681 = 1;
					field682 = new int[1];
					field682[0] = -1;
					field683 = new int[1];
					field683[0] = -1;
					field684 = new int[1];
					field684[0] = -1;
				}

				if (field692 == -1) {
					if (field686 == null) {
						field692 = 0;
					} else {
						field692 = 2;
					}
				}

				if (field693 == -1) {
					if (field686 != null) {
						field693 = 2;
						return;
					}

					field693 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field681 = arg0.g1();
				field682 = new int[field681];
				field683 = new int[field681];
				field684 = new int[field681];
				for (int var3 = 0; var3 < field681; var3++) {
					field682[var3] = arg0.g2();
					field683[var3] = arg0.g2();
					if (field683[var3] == 0xFFFF) {
						field683[var3] = -1;
					}

					field684[var3] = arg0.g2();
				}
			} else if (var2 == 2) {
				field685 = arg0.g2();
			} else if (var2 == 3) {
				int var4 = arg0.g1();
				field686 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field686[var5] = arg0.g1();
				}

				field686[var4] = 9999999;
			} else if (var2 == 4) {
				field687 = true;
			} else if (var2 == 5) {
				field688 = arg0.g1();
			} else if (var2 == 6) {
				field689 = arg0.g2();
			} else if (var2 == 7) {
				field690 = arg0.g2();
			} else if (var2 == 8) {
				field691 = arg0.g1();
			} else if (var2 == 9) {
				field692 = arg0.g1();
			} else if (var2 == 10) {
				field693 = arg0.g1();
			} else if (var2 == 11) {
				field694 = arg0.g1();
			} else if (var2 == 12) {
				field695 = arg0.g4();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
