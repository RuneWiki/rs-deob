package deob;

@ObfuscatedName("kb")
public class class276 {

	@ObfuscatedName("kb.bg")
	public int field3230;

	@ObfuscatedName("kb.bx")
	public int field3233;

	@ObfuscatedName("kb.bq")
	public int field3239;

	@ObfuscatedName("kb.bz")
	public int field3240;

	@ObfuscatedName("kb.bn")
	public final int[][] field3241;

	public class276(int arg0, int arg1, boolean arg2) {
		if (arg2) {
			this.method5728(-1, -1, arg0 + 6, arg1 + 6);
		} else {
			this.method5728(0, 0, arg0, arg1);
		}
		this.field3241 = new int[this.field3239][this.field3240];
		this.method5725();
	}

	@ObfuscatedName("kb.af(I)I")
	public int method5724() {
		return this.field3230;
	}

	@ObfuscatedName("kb.aw(S)I")
	public int method5767() {
		return this.field3233;
	}

	@ObfuscatedName("kb.at(B)I")
	public int method5746() {
		return this.field3239;
	}

	@ObfuscatedName("kb.ac(B)I")
	public int method5727() {
		return this.field3240;
	}

	@ObfuscatedName("kb.ap(IIIIS)V")
	public final void method5728(int arg0, int arg1, int arg2, int arg3) {
		this.field3230 = arg0;
		this.field3233 = arg1;
		this.field3239 = arg2;
		this.field3240 = arg3;
	}

	@ObfuscatedName("kb.aq(I)V")
	public void method5725() {
		for (int var1 = 0; var1 < this.field3239; var1++) {
			for (int var2 = 0; var2 < this.field3240; var2++) {
				if (var1 >= 1 && var2 >= 1 && var1 < this.field3239 - 5 && var2 < this.field3240 - 5) {
					this.field3241[var1][var2] = 1073741824;
				} else {
					this.field3241[var1][var2] = 16777215;
				}
			}
		}
	}

	@ObfuscatedName("kb.ao(IIII)Z")
	public boolean method5784(int arg0, int arg1, int arg2) {
		return (this.field3241[arg0][arg1] & arg2) != 0;
	}

	@ObfuscatedName("kb.as(IIII)V")
	public void method5731(int arg0, int arg1, int arg2) {
		this.field3241[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("kb.al(IIII)V")
	public void method5787(int arg0, int arg1, int arg2) {
		this.field3241[arg0][arg1] &= ~arg2;
	}

	@ObfuscatedName("kb.au(IIIB)V")
	public void method5733(int arg0, int arg1, int arg2) {
		this.method5787(arg0 - this.field3230, arg1 - this.field3233, arg2);
	}

	@ObfuscatedName("kb.ai(IIB)Z")
	public boolean method5734(int arg0, int arg1) {
		return this.method5730(arg0 - this.field3230, arg1 - this.field3233);
	}

	@ObfuscatedName("kb.aa(III)Z")
	public boolean method5730(int arg0, int arg1) {
		return arg0 >= 1 && arg0 < this.field3239 - 5 && arg1 >= 1 && arg1 < this.field3240 - 5;
	}

	@ObfuscatedName("kb.am(IIIIZB)V")
	public void method5736(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg0 - this.field3230;
		int var7 = arg1 - this.field3233;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method5731(var6, var7, 128);
				this.method5731(var6 - 1, var7, 8);
			}
			if (arg3 == 1) {
				this.method5731(var6, var7, 2);
				this.method5731(var6, var7 + 1, 32);
			}
			if (arg3 == 2) {
				this.method5731(var6, var7, 8);
				this.method5731(var6 + 1, var7, 128);
			}
			if (arg3 == 3) {
				this.method5731(var6, var7, 32);
				this.method5731(var6, var7 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method5731(var6, var7, 1);
				this.method5731(var6 - 1, var7 + 1, 16);
			}
			if (arg3 == 1) {
				this.method5731(var6, var7, 4);
				this.method5731(var6 + 1, var7 + 1, 64);
			}
			if (arg3 == 2) {
				this.method5731(var6, var7, 16);
				this.method5731(var6 + 1, var7 - 1, 1);
			}
			if (arg3 == 3) {
				this.method5731(var6, var7, 64);
				this.method5731(var6 - 1, var7 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method5731(var6, var7, 130);
				this.method5731(var6 - 1, var7, 8);
				this.method5731(var6, var7 + 1, 32);
			}
			if (arg3 == 1) {
				this.method5731(var6, var7, 10);
				this.method5731(var6, var7 + 1, 32);
				this.method5731(var6 + 1, var7, 128);
			}
			if (arg3 == 2) {
				this.method5731(var6, var7, 40);
				this.method5731(var6 + 1, var7, 128);
				this.method5731(var6, var7 - 1, 2);
			}
			if (arg3 == 3) {
				this.method5731(var6, var7, 160);
				this.method5731(var6, var7 - 1, 2);
				this.method5731(var6 - 1, var7, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method5731(var6, var7, 65536);
				this.method5731(var6 - 1, var7, 4096);
			}
			if (arg3 == 1) {
				this.method5731(var6, var7, 1024);
				this.method5731(var6, var7 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method5731(var6, var7, 4096);
				this.method5731(var6 + 1, var7, 65536);
			}
			if (arg3 == 3) {
				this.method5731(var6, var7, 16384);
				this.method5731(var6, var7 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method5731(var6, var7, 512);
				this.method5731(var6 - 1, var7 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method5731(var6, var7, 2048);
				this.method5731(var6 + 1, var7 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method5731(var6, var7, 8192);
				this.method5731(var6 + 1, var7 - 1, 512);
			}
			if (arg3 == 3) {
				this.method5731(var6, var7, 32768);
				this.method5731(var6 - 1, var7 - 1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method5731(var6, var7, 66560);
			this.method5731(var6 - 1, var7, 4096);
			this.method5731(var6, var7 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method5731(var6, var7, 5120);
			this.method5731(var6, var7 + 1, 16384);
			this.method5731(var6 + 1, var7, 65536);
		}
		if (arg3 == 2) {
			this.method5731(var6, var7, 20480);
			this.method5731(var6 + 1, var7, 65536);
			this.method5731(var6, var7 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method5731(var6, var7, 81920);
			this.method5731(var6, var7 - 1, 1024);
			this.method5731(var6 - 1, var7, 4096);
		}
	}

	@ObfuscatedName("kb.an(IIIIIZB)V")
	public void method5737(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 131072;
		}
		int var8 = arg0 - this.field3230;
		int var9 = arg1 - this.field3233;
		if (arg4 == 1 || arg4 == 3) {
			int var10 = arg2;
			arg2 = arg3;
			arg3 = var10;
		}
		for (int var11 = var8; var11 < arg2 + var8; var11++) {
			if (var11 >= 0 && var11 < this.field3239) {
				for (int var12 = var9; var12 < arg3 + var9; var12++) {
					if (var12 >= 0 && var12 < this.field3240) {
						this.method5731(var11, var12, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("kb.ar(IIIIZB)V")
	public void method5738(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.method5737(arg0, arg1, arg2, arg3, 0, arg4);
	}

	@ObfuscatedName("kb.ae(III)V")
	public void method5739(int arg0, int arg1) {
		int var3 = arg0 - this.field3230;
		int var4 = arg1 - this.field3233;
		this.field3241[var3][var4] |= 0x200000;
	}

	@ObfuscatedName("kb.ay(III)V")
	public void method5762(int arg0, int arg1) {
		int var3 = arg0 - this.field3230;
		int var4 = arg1 - this.field3233;
		this.field3241[var3][var4] |= 0x40000;
	}

	@ObfuscatedName("kb.ad(IIIIZI)V")
	public void method5758(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg0 - this.field3230;
		int var7 = arg1 - this.field3233;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method5787(var6, var7, 128);
				this.method5787(var6 - 1, var7, 8);
			}
			if (arg3 == 1) {
				this.method5787(var6, var7, 2);
				this.method5787(var6, var7 + 1, 32);
			}
			if (arg3 == 2) {
				this.method5787(var6, var7, 8);
				this.method5787(var6 + 1, var7, 128);
			}
			if (arg3 == 3) {
				this.method5787(var6, var7, 32);
				this.method5787(var6, var7 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method5787(var6, var7, 1);
				this.method5787(var6 - 1, var7 + 1, 16);
			}
			if (arg3 == 1) {
				this.method5787(var6, var7, 4);
				this.method5787(var6 + 1, var7 + 1, 64);
			}
			if (arg3 == 2) {
				this.method5787(var6, var7, 16);
				this.method5787(var6 + 1, var7 - 1, 1);
			}
			if (arg3 == 3) {
				this.method5787(var6, var7, 64);
				this.method5787(var6 - 1, var7 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method5787(var6, var7, 130);
				this.method5787(var6 - 1, var7, 8);
				this.method5787(var6, var7 + 1, 32);
			}
			if (arg3 == 1) {
				this.method5787(var6, var7, 10);
				this.method5787(var6, var7 + 1, 32);
				this.method5787(var6 + 1, var7, 128);
			}
			if (arg3 == 2) {
				this.method5787(var6, var7, 40);
				this.method5787(var6 + 1, var7, 128);
				this.method5787(var6, var7 - 1, 2);
			}
			if (arg3 == 3) {
				this.method5787(var6, var7, 160);
				this.method5787(var6, var7 - 1, 2);
				this.method5787(var6 - 1, var7, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method5787(var6, var7, 65536);
				this.method5787(var6 - 1, var7, 4096);
			}
			if (arg3 == 1) {
				this.method5787(var6, var7, 1024);
				this.method5787(var6, var7 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method5787(var6, var7, 4096);
				this.method5787(var6 + 1, var7, 65536);
			}
			if (arg3 == 3) {
				this.method5787(var6, var7, 16384);
				this.method5787(var6, var7 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method5787(var6, var7, 512);
				this.method5787(var6 - 1, var7 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method5787(var6, var7, 2048);
				this.method5787(var6 + 1, var7 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method5787(var6, var7, 8192);
				this.method5787(var6 + 1, var7 - 1, 512);
			}
			if (arg3 == 3) {
				this.method5787(var6, var7, 32768);
				this.method5787(var6 - 1, var7 - 1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method5787(var6, var7, 66560);
			this.method5787(var6 - 1, var7, 4096);
			this.method5787(var6, var7 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method5787(var6, var7, 5120);
			this.method5787(var6, var7 + 1, 16384);
			this.method5787(var6 + 1, var7, 65536);
		}
		if (arg3 == 2) {
			this.method5787(var6, var7, 20480);
			this.method5787(var6 + 1, var7, 65536);
			this.method5787(var6, var7 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method5787(var6, var7, 81920);
			this.method5787(var6, var7 - 1, 1024);
			this.method5787(var6 - 1, var7, 4096);
		}
	}

	@ObfuscatedName("kb.ag(IIIIIZB)V")
	public void method5741(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 131072;
		}
		int var8 = arg0 - this.field3230;
		int var9 = arg1 - this.field3233;
		if (arg4 == 1 || arg4 == 3) {
			int var10 = arg2;
			arg2 = arg3;
			arg3 = var10;
		}
		for (int var11 = var8; var11 < arg2 + var8; var11++) {
			if (var11 >= 0 && var11 < this.field3239) {
				for (int var12 = var9; var12 < arg3 + var9; var12++) {
					if (var12 >= 0 && var12 < this.field3240) {
						this.method5787(var11, var12, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("kb.av(IIB)V")
	public void method5743(int arg0, int arg1) {
		int var3 = arg0 - this.field3230;
		int var4 = arg1 - this.field3233;
		this.field3241[var3][var4] &= 0xFFFBFFFF;
	}
}
