package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("jc")
public class SeqType {

	@ObfuscatedName("jc.c")
	public static int numDefinitions;

	@ObfuscatedName("jc.d")
	public static SeqType[] list;

	@ObfuscatedName("jc.e")
	public int numFrames;

	@ObfuscatedName("jc.f")
	public int[] frames;

	@ObfuscatedName("jc.g")
	public int[] iframes;

	@ObfuscatedName("jc.h")
	public int[] delay;

	@ObfuscatedName("jc.i")
	public int loops = -1;

	@ObfuscatedName("jc.j")
	public int[] walkmerge;

	@ObfuscatedName("jc.k")
	public boolean reachforward = false;

	@ObfuscatedName("jc.l")
	public int priority = 5;

	@ObfuscatedName("jc.m")
	public int replaceheldleft = -1;

	@ObfuscatedName("jc.n")
	public int replaceheldright = -1;

	@ObfuscatedName("jc.o")
	public int maxloops = 99;

	@ObfuscatedName("jc.a(Lub;I)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("seq.dat", null));
		numDefinitions = var1.g2();
		if (list == null) {
			list = new SeqType[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new SeqType();
			}

			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("jc.a(ZLkb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				break;
			}

			if (var2 == 1) {
				numFrames = arg0.g1();
				frames = new int[numFrames];
				iframes = new int[numFrames];
				delay = new int[numFrames];
				for (int var3 = 0; var3 < numFrames; var3++) {
					frames[var3] = arg0.g2();
					iframes[var3] = arg0.g2();
					if (iframes[var3] == 0xFFFF) {
						iframes[var3] = -1;
					}

					delay[var3] = arg0.g2();
					if (delay[var3] == 0) {
						delay[var3] = AnimFrame.list[frames[var3]].delay;
					}

					if (delay[var3] == 0) {
						delay[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				loops = arg0.g2();
			} else if (var2 == 3) {
				int var4 = arg0.g1();
				walkmerge = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					walkmerge[var5] = arg0.g1();
				}

				walkmerge[var4] = 9999999;
			} else if (var2 == 4) {
				reachforward = true;
			} else if (var2 == 5) {
				priority = arg0.g1();
			} else if (var2 == 6) {
				replaceheldleft = arg0.g2();
			} else if (var2 == 7) {
				replaceheldright = arg0.g2();
			} else if (var2 == 8) {
				maxloops = arg0.g1();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}

		if (numFrames == 0) {
			numFrames = 1;
			frames = new int[1];
			frames[0] = -1;
			iframes = new int[1];
			iframes[0] = -1;
			delay = new int[1];
			delay[0] = -1;
		}
	}
}
