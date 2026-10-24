package deob;

import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.g")
	public byte[] field742;

	@ObfuscatedName("yb.h")
	public int field743;

	@ObfuscatedName("yb.i")
	public int[] field744;

	@ObfuscatedName("yb.j")
	public int[] field745;

	@ObfuscatedName("yb.k")
	public int[] field746;

	@ObfuscatedName("yb.l")
	public int[] field747;

	@ObfuscatedName("yb.m")
	public boolean field748;

	public class51(byte[] arg0) {
		method294(arg0);
	}

	@ObfuscatedName("yb.a([BZ)V")
	public void method294(byte[] arg0) {
		class39 var2 = new class39(arg0);
		int var3 = var2.method235();
		int var4 = var2.method235();
		if (var3 == var4) {
			field742 = arg0;
			field748 = false;
		} else {
			byte[] var5 = new byte[var3];
			class45.method263(var5, var3, arg0, var4, 6);
			field742 = var5;
			var2 = new class39(field742);
			field748 = true;
		}

		field743 = var2.method233();
		field744 = new int[field743];
		field745 = new int[field743];
		field746 = new int[field743];
		field747 = new int[field743];
		int var6 = field743 * 10 + var2.field611;
		for (int var7 = 0; var7 < field743; var7++) {
			field744[var7] = var2.method236();
			field745[var7] = var2.method235();
			field746[var7] = var2.method235();
			field747[var7] = var6;
			var6 += field746[var7];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method295(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field743; var5++) {
			if (field744[var5] == var3) {
				try {
					if (arg1 == null) {
						arg1 = new byte[field745[var5]];
					}

					if (field748) {
						for (int var6 = 0; var6 < field745[var5]; var6++) {
							arg1[var6] = field742[field747[var5] + var6];
						}
					} else {
						class45.method263(arg1, field745[var5], field742, field746[var5], field747[var5]);
					}

					return arg1;
				} catch (Exception var9) {
					CRC32 var7 = new CRC32();
					var7.reset();
					var7.update(arg1);
					int var8 = (int) var7.getValue();
					signlink.reporterror("jf-er: " + arg0 + "," + field743 + "," + var5 + "," + field748 + "," + field745[var5] + "," + field746[var5] + "," + field747[var5] + "," + var8);
				}
			}
		}

		return null;
	}
}
