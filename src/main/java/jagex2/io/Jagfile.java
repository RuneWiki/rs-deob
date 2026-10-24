package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("XTGLDHGX")
public final class Jagfile {

	@ObfuscatedName("XTGLDHGX.e")
	public int fileCount;

	@ObfuscatedName("XTGLDHGX.j")
	public boolean unpacked;

	@ObfuscatedName("XTGLDHGX.d")
	public byte[] data;

	@ObfuscatedName("XTGLDHGX.f")
	public int[] fileHash;

	@ObfuscatedName("XTGLDHGX.g")
	public int[] fileUnpackedSize;

	@ObfuscatedName("XTGLDHGX.h")
	public int[] filePackedSize;

	@ObfuscatedName("XTGLDHGX.i")
	public int[] fileOffset;

	public Jagfile(byte[] arg0) {
		unpack(arg0);
	}

	@ObfuscatedName("XTGLDHGX.a([BB)V")
	public void unpack(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		int var3 = var2.g3();
		int var4 = var2.g3();
		if (var3 == var4) {
			data = arg0;
			unpacked = false;
		} else {
			byte[] var5 = new byte[var3];
			BZip2.read(var5, var3, arg0, var4, 6);
			data = var5;
			var2 = new Packet(data);
			unpacked = true;
		}

		fileCount = var2.g2();
		fileHash = new int[fileCount];
		fileUnpackedSize = new int[fileCount];
		filePackedSize = new int[fileCount];
		fileOffset = new int[fileCount];
		int var6 = fileCount * 10 + var2.pos;
		for (int var7 = 0; var7 < fileCount; var7++) {
			fileHash[var7] = var2.g4();
			fileUnpackedSize[var7] = var2.g3();
			filePackedSize[var7] = var2.g3();
			fileOffset[var7] = var6;
			var6 += filePackedSize[var7];
		}
	}

	@ObfuscatedName("XTGLDHGX.a(Ljava/lang/String;[B)[B")
	public byte[] read(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < fileCount; var5++) {
			if (fileHash[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[fileUnpackedSize[var5]];
				}

				if (unpacked) {
					for (int var6 = 0; var6 < fileUnpackedSize[var5]; var6++) {
						arg1[var6] = data[fileOffset[var5] + var6];
					}
				} else {
					BZip2.read(arg1, fileUnpackedSize[var5], data, filePackedSize[var5], fileOffset[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
