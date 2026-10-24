package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.g")
	public int field937 = 0;

	@ObfuscatedName("jc.h")
	public int field938 = 0;

	@ObfuscatedName("jc.i")
	public int field939;

	@ObfuscatedName("jc.j")
	public int field940;

	@ObfuscatedName("jc.k")
	public int[][] field941;

	public CollisionMap(int arg0, int arg1) {
		field939 = arg1;
		field940 = arg0;
		field941 = new int[field939][field940];
		method359();
	}

	@ObfuscatedName("jc.a(B)V")
	public void method359() {
		for (int var1 = 0; var1 < field939; var1++) {
			for (int var2 = 0; var2 < field940; var2++) {
				if (var1 == 0 || var2 == 0 || field939 - 1 == var1 || field940 - 1 == var2) {
					field941[var1][var2] = 0xFFFFFF;
				} else {
					field941[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZII)V")
	public void method360(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field937;
		arg0 -= field938;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method363(arg2, arg0, 128);
				method363(arg2 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method363(arg2, arg0, 2);
				method363(arg2, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method363(arg2, arg0, 8);
				method363(arg2 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method363(arg2, arg0, 32);
				method363(arg2, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method363(arg2, arg0, 1);
				method363(arg2 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method363(arg2, arg0, 4);
				method363(arg2 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method363(arg2, arg0, 16);
				method363(arg2 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method363(arg2, arg0, 64);
				method363(arg2 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method363(arg2, arg0, 130);
				method363(arg2 - 1, arg0, 8);
				method363(arg2, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method363(arg2, arg0, 10);
				method363(arg2, arg0 + 1, 32);
				method363(arg2 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method363(arg2, arg0, 40);
				method363(arg2 + 1, arg0, 128);
				method363(arg2, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method363(arg2, arg0, 160);
				method363(arg2, arg0 - 1, 2);
				method363(arg2 - 1, arg0, 8);
			}
		}

		if (arg3) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method363(arg2, arg0, 0x10000);
					method363(arg2 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method363(arg2, arg0, 1024);
					method363(arg2, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method363(arg2, arg0, 4096);
					method363(arg2 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method363(arg2, arg0, 16384);
					method363(arg2, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method363(arg2, arg0, 512);
					method363(arg2 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method363(arg2, arg0, 2048);
					method363(arg2 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method363(arg2, arg0, 8192);
					method363(arg2 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method363(arg2, arg0, 32768);
					method363(arg2 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method363(arg2, arg0, 66560);
					method363(arg2 - 1, arg0, 4096);
					method363(arg2, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method363(arg2, arg0, 5120);
					method363(arg2, arg0 + 1, 16384);
					method363(arg2 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method363(arg2, arg0, 20480);
					method363(arg2 + 1, arg0, 0x10000);
					method363(arg2, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method363(arg2, arg0, 81920);
					method363(arg2, arg0 - 1, 1024);
					method363(arg2 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZIIIZII)V")
	public void method361(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg2 -= field937;
		arg5 -= field938;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field939) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field940) {
						method363(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method362(int arg0, int arg1) {
		arg1 -= field937;
		arg0 -= field938;
		field941[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		field941[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(ZIIIII)V")
	public void method364(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 -= field937;
		arg1 -= field938;
		if (arg3 == 0) {
			if (arg2 == 0) {
				method366(arg1, arg4, 128);
				method366(arg1, arg4 - 1, 8);
			}

			if (arg2 == 1) {
				method366(arg1, arg4, 2);
				method366(arg1 + 1, arg4, 32);
			}

			if (arg2 == 2) {
				method366(arg1, arg4, 8);
				method366(arg1, arg4 + 1, 128);
			}

			if (arg2 == 3) {
				method366(arg1, arg4, 32);
				method366(arg1 - 1, arg4, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				method366(arg1, arg4, 1);
				method366(arg1 + 1, arg4 - 1, 16);
			}

			if (arg2 == 1) {
				method366(arg1, arg4, 4);
				method366(arg1 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method366(arg1, arg4, 16);
				method366(arg1 - 1, arg4 + 1, 1);
			}

			if (arg2 == 3) {
				method366(arg1, arg4, 64);
				method366(arg1 - 1, arg4 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				method366(arg1, arg4, 130);
				method366(arg1, arg4 - 1, 8);
				method366(arg1 + 1, arg4, 32);
			}

			if (arg2 == 1) {
				method366(arg1, arg4, 10);
				method366(arg1 + 1, arg4, 32);
				method366(arg1, arg4 + 1, 128);
			}

			if (arg2 == 2) {
				method366(arg1, arg4, 40);
				method366(arg1, arg4 + 1, 128);
				method366(arg1 - 1, arg4, 2);
			}

			if (arg2 == 3) {
				method366(arg1, arg4, 160);
				method366(arg1 - 1, arg4, 2);
				method366(arg1, arg4 - 1, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					method366(arg1, arg4, 0x10000);
					method366(arg1, arg4 - 1, 4096);
				}

				if (arg2 == 1) {
					method366(arg1, arg4, 1024);
					method366(arg1 + 1, arg4, 16384);
				}

				if (arg2 == 2) {
					method366(arg1, arg4, 4096);
					method366(arg1, arg4 + 1, 0x10000);
				}

				if (arg2 == 3) {
					method366(arg1, arg4, 16384);
					method366(arg1 - 1, arg4, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					method366(arg1, arg4, 512);
					method366(arg1 + 1, arg4 - 1, 8192);
				}

				if (arg2 == 1) {
					method366(arg1, arg4, 2048);
					method366(arg1 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method366(arg1, arg4, 8192);
					method366(arg1 - 1, arg4 + 1, 512);
				}

				if (arg2 == 3) {
					method366(arg1, arg4, 32768);
					method366(arg1 - 1, arg4 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg2 == 0) {
					method366(arg1, arg4, 66560);
					method366(arg1, arg4 - 1, 4096);
					method366(arg1 + 1, arg4, 16384);
				}

				if (arg2 == 1) {
					method366(arg1, arg4, 5120);
					method366(arg1 + 1, arg4, 16384);
					method366(arg1, arg4 + 1, 0x10000);
				}

				if (arg2 == 2) {
					method366(arg1, arg4, 20480);
					method366(arg1, arg4 + 1, 0x10000);
					method366(arg1 - 1, arg4, 1024);
				}

				if (arg2 == 3) {
					method366(arg1, arg4, 81920);
					method366(arg1 - 1, arg4, 1024);
					method366(arg1, arg4 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZIZI)V")
	public void method365(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= field937;
		arg1 -= field938;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg0;
			arg0 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field939) {
				for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < field940) {
						method366(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBII)V")
	public void method366(int arg0, int arg1, int arg2) {
		field941[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("jc.c(III)V")
	public void method367(int arg0, int arg1) {
		arg1 -= field937;
		arg0 -= field938;
		field941[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IZIIIII)Z")
	public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg2 == arg3) {
			return true;
		}

		arg4 -= field937;
		arg3 -= field938;
		arg0 -= field937;
		arg2 -= field938;
		if (arg1 == 0) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field941[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field941[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg0 - 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field941[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field941[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 == arg4 && arg2 - 1 == arg3) {
					return true;
				}

				if (arg0 - 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field941[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field941[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field941[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field941[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg0 == arg4 && arg2 + 1 == arg3 && (field941[arg4][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg2 - 1 == arg3 && (field941[arg4][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg2 == arg3 && (field941[arg4][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIZIII)Z")
	public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg0 == arg5) {
			return true;
		}

		arg1 -= field937;
		arg0 -= field938;
		arg2 -= field937;
		arg5 -= field938;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg2 + 1 == arg1 && arg0 == arg5 && (field941[arg1][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg0 && (field941[arg1][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg2 - 1 == arg1 && arg0 == arg5 && (field941[arg1][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg0 && (field941[arg1][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg2 - 1 == arg1 && arg0 == arg5 && (field941[arg1][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg0 && (field941[arg1][arg0] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg2 + 1 == arg1 && arg0 == arg5 && (field941[arg1][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg0 && (field941[arg1][arg0] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg1 == arg2 && arg5 + 1 == arg0 && (field941[arg1][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg5 - 1 == arg0 && (field941[arg1][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg1 && arg0 == arg5 && (field941[arg1][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg1 && arg0 == arg5 && (field941[arg1][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIBI)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2 - 1;
		int var9 = arg3 + arg6 - 1;
		if (arg1 >= arg2 && arg1 <= var8 && arg5 >= arg3 && arg5 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg5 >= arg3 && arg5 <= var9 && (field941[arg1 - field937][arg5 - field938] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg5 >= arg3 && arg5 <= var9 && (field941[arg1 - field937][arg5 - field938] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg5 && arg1 >= arg2 && arg1 <= var8 && (field941[arg1 - field937][arg5 - field938] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg1 >= arg2 && arg1 <= var8 && (field941[arg1 - field937][arg5 - field938] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
