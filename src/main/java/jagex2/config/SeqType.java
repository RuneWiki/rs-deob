package jagex2.config;

import deob.ObfuscatedName;
import jagex2.graphics.AnimFrame;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("LKGEGIEW")
public class SeqType {

	@ObfuscatedName("LKGEGIEW.i")
	public int replayoff = -1;

	@ObfuscatedName("LKGEGIEW.k")
	public boolean stretches = false;

	@ObfuscatedName("LKGEGIEW.l")
	public int priority = 5;

	@ObfuscatedName("LKGEGIEW.m")
	public int righthand = -1;

	@ObfuscatedName("LKGEGIEW.n")
	public int lefthand = -1;

	@ObfuscatedName("LKGEGIEW.o")
	public int replaycount = 99;

	@ObfuscatedName("LKGEGIEW.p")
	public int preanim_move = -1;

	@ObfuscatedName("LKGEGIEW.q")
	public int postanim_move = -1;

	@ObfuscatedName("LKGEGIEW.r")
	public int replacemode = 2;

	@ObfuscatedName("LKGEGIEW.c")
	public static int count;

	@ObfuscatedName("LKGEGIEW.e")
	public int frameCount;

	@ObfuscatedName("LKGEGIEW.s")
	public int field895;

	@ObfuscatedName("LKGEGIEW.f")
	public int[] frames;

	@ObfuscatedName("LKGEGIEW.g")
	public int[] iframes;

	@ObfuscatedName("LKGEGIEW.h")
	public int[] delay;

	@ObfuscatedName("LKGEGIEW.j")
	public int[] walkmerge;

	@ObfuscatedName("LKGEGIEW.d")
	public static SeqType[] instances;

	@ObfuscatedName("LKGEGIEW.a(ILXTGLDHGX;)V")
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("seq.dat", null));
		count = var1.g2();
		if (instances == null) {
			instances = new SeqType[count];
		}

		for (int var2 = 0; var2 < count; var2++) {
			if (instances[var2] == null) {
				instances[var2] = new SeqType();
			}

			instances[var2].decodeClient(var1);
		}
	}

	@ObfuscatedName("LKGEGIEW.a(IB)I")
	public int getFrameDuration(int arg0) {
		int var2 = delay[arg0];
		if (var2 == 0) {
			AnimFrame var3 = AnimFrame.get(frames[arg0]);
			if (var3 != null) {
				var2 = delay[arg0] = var3.id;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("LKGEGIEW.a(ZLMBMGIXGO;)V")
	public void decodeClient(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				if (frameCount == 0) {
					frameCount = 1;
					frames = new int[1];
					frames[0] = -1;
					iframes = new int[1];
					iframes[0] = -1;
					delay = new int[1];
					delay[0] = -1;
				}

				if (preanim_move == -1) {
					if (walkmerge == null) {
						preanim_move = 0;
					} else {
						preanim_move = 2;
					}
				}

				if (postanim_move == -1) {
					if (walkmerge != null) {
						postanim_move = 2;
						return;
					}

					postanim_move = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				frameCount = arg0.g1();
				frames = new int[frameCount];
				iframes = new int[frameCount];
				delay = new int[frameCount];
				for (int var3 = 0; var3 < frameCount; var3++) {
					frames[var3] = arg0.g2();
					iframes[var3] = arg0.g2();
					if (iframes[var3] == 0xFFFF) {
						iframes[var3] = -1;
					}

					delay[var3] = arg0.g2();
				}
			} else if (var2 == 2) {
				replayoff = arg0.g2();
			} else if (var2 == 3) {
				int var4 = arg0.g1();
				walkmerge = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					walkmerge[var5] = arg0.g1();
				}

				walkmerge[var4] = 9999999;
			} else if (var2 == 4) {
				stretches = true;
			} else if (var2 == 5) {
				priority = arg0.g1();
			} else if (var2 == 6) {
				righthand = arg0.g2();
			} else if (var2 == 7) {
				lefthand = arg0.g2();
			} else if (var2 == 8) {
				replaycount = arg0.g1();
			} else if (var2 == 9) {
				preanim_move = arg0.g1();
			} else if (var2 == 10) {
				postanim_move = arg0.g1();
			} else if (var2 == 11) {
				replacemode = arg0.g1();
			} else if (var2 == 12) {
				field895 = arg0.g4();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
