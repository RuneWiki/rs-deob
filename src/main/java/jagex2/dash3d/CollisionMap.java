package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("XRENONSA")
public class CollisionMap {

	@ObfuscatedName("XRENONSA.f")
	public int field1351 = 0;

	@ObfuscatedName("XRENONSA.g")
	public int field1352 = 0;

	@ObfuscatedName("XRENONSA.h")
	public int field1353;

	@ObfuscatedName("XRENONSA.i")
	public int field1354;

	@ObfuscatedName("XRENONSA.j")
	public int[][] field1355;

	public CollisionMap(int arg0, int arg1) {
		field1353 = arg1;
		field1354 = arg0;
		field1355 = new int[field1353][field1354];
		method532();
	}

	@ObfuscatedName("XRENONSA.a()V")
	public void method532() {
		for (int var1 = 0; var1 < field1353; var1++) {
			for (int var2 = 0; var2 < field1354; var2++) {
				if (var1 == 0 || var2 == 0 || field1353 - 1 == var1 || field1354 - 1 == var2) {
					field1355[var1][var2] = 0xFFFFFF;
				} else {
					field1355[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("XRENONSA.a(IIZIII)V")
	public void method533(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1351;
		arg4 -= field1352;
		if (arg2 == 0) {
			if (arg0 == 0) {
				method536(arg3, arg4, 128);
				method536(arg3 - 1, arg4, 8);
			}

			if (arg0 == 1) {
				method536(arg3, arg4, 2);
				method536(arg3, arg4 + 1, 32);
			}

			if (arg0 == 2) {
				method536(arg3, arg4, 8);
				method536(arg3 + 1, arg4, 128);
			}

			if (arg0 == 3) {
				method536(arg3, arg4, 32);
				method536(arg3, arg4 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				method536(arg3, arg4, 1);
				method536(arg3 - 1, arg4 + 1, 16);
			}

			if (arg0 == 1) {
				method536(arg3, arg4, 4);
				method536(arg3 + 1, arg4 + 1, 64);
			}

			if (arg0 == 2) {
				method536(arg3, arg4, 16);
				method536(arg3 + 1, arg4 - 1, 1);
			}

			if (arg0 == 3) {
				method536(arg3, arg4, 64);
				method536(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				method536(arg3, arg4, 130);
				method536(arg3 - 1, arg4, 8);
				method536(arg3, arg4 + 1, 32);
			}

			if (arg0 == 1) {
				method536(arg3, arg4, 10);
				method536(arg3, arg4 + 1, 32);
				method536(arg3 + 1, arg4, 128);
			}

			if (arg0 == 2) {
				method536(arg3, arg4, 40);
				method536(arg3 + 1, arg4, 128);
				method536(arg3, arg4 - 1, 2);
			}

			if (arg0 == 3) {
				method536(arg3, arg4, 160);
				method536(arg3, arg4 - 1, 2);
				method536(arg3 - 1, arg4, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					method536(arg3, arg4, 0x10000);
					method536(arg3 - 1, arg4, 4096);
				}

				if (arg0 == 1) {
					method536(arg3, arg4, 1024);
					method536(arg3, arg4 + 1, 16384);
				}

				if (arg0 == 2) {
					method536(arg3, arg4, 4096);
					method536(arg3 + 1, arg4, 0x10000);
				}

				if (arg0 == 3) {
					method536(arg3, arg4, 16384);
					method536(arg3, arg4 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					method536(arg3, arg4, 512);
					method536(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg0 == 1) {
					method536(arg3, arg4, 2048);
					method536(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg0 == 2) {
					method536(arg3, arg4, 8192);
					method536(arg3 + 1, arg4 - 1, 512);
				}

				if (arg0 == 3) {
					method536(arg3, arg4, 32768);
					method536(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg0 == 0) {
					method536(arg3, arg4, 66560);
					method536(arg3 - 1, arg4, 4096);
					method536(arg3, arg4 + 1, 16384);
				}

				if (arg0 == 1) {
					method536(arg3, arg4, 5120);
					method536(arg3, arg4 + 1, 16384);
					method536(arg3 + 1, arg4, 0x10000);
				}

				if (arg0 == 2) {
					method536(arg3, arg4, 20480);
					method536(arg3 + 1, arg4, 0x10000);
					method536(arg3, arg4 - 1, 1024);
				}

				if (arg0 == 3) {
					method536(arg3, arg4, 81920);
					method536(arg3, arg4 - 1, 1024);
					method536(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("XRENONSA.a(IIIIZIB)V")
	public void method534(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg5 -= field1351;
		arg0 -= field1352;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg3;
			arg3 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1353) {
				for (int var10 = arg0; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1354) {
						method536(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("XRENONSA.a(III)V")
	public void method535(int arg0, int arg1) {
		arg1 -= field1351;
		arg0 -= field1352;
		field1355[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("XRENONSA.b(III)V")
	public void method536(int arg0, int arg1, int arg2) {
		field1355[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("XRENONSA.a(IIIIIZ)V")
	public void method537(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field1351;
		arg2 -= field1352;
		if (arg3 == 0) {
			if (arg0 == 0) {
				method539(arg1, 128, arg2);
				method539(arg1 - 1, 8, arg2);
			}

			if (arg0 == 1) {
				method539(arg1, 2, arg2);
				method539(arg1, 32, arg2 + 1);
			}

			if (arg0 == 2) {
				method539(arg1, 8, arg2);
				method539(arg1 + 1, 128, arg2);
			}

			if (arg0 == 3) {
				method539(arg1, 32, arg2);
				method539(arg1, 2, arg2 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				method539(arg1, 1, arg2);
				method539(arg1 - 1, 16, arg2 + 1);
			}

			if (arg0 == 1) {
				method539(arg1, 4, arg2);
				method539(arg1 + 1, 64, arg2 + 1);
			}

			if (arg0 == 2) {
				method539(arg1, 16, arg2);
				method539(arg1 + 1, 1, arg2 - 1);
			}

			if (arg0 == 3) {
				method539(arg1, 64, arg2);
				method539(arg1 - 1, 4, arg2 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg0 == 0) {
				method539(arg1, 130, arg2);
				method539(arg1 - 1, 8, arg2);
				method539(arg1, 32, arg2 + 1);
			}

			if (arg0 == 1) {
				method539(arg1, 10, arg2);
				method539(arg1, 32, arg2 + 1);
				method539(arg1 + 1, 128, arg2);
			}

			if (arg0 == 2) {
				method539(arg1, 40, arg2);
				method539(arg1 + 1, 128, arg2);
				method539(arg1, 2, arg2 - 1);
			}

			if (arg0 == 3) {
				method539(arg1, 160, arg2);
				method539(arg1, 2, arg2 - 1);
				method539(arg1 - 1, 8, arg2);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					method539(arg1, 0x10000, arg2);
					method539(arg1 - 1, 4096, arg2);
				}

				if (arg0 == 1) {
					method539(arg1, 1024, arg2);
					method539(arg1, 16384, arg2 + 1);
				}

				if (arg0 == 2) {
					method539(arg1, 4096, arg2);
					method539(arg1 + 1, 0x10000, arg2);
				}

				if (arg0 == 3) {
					method539(arg1, 16384, arg2);
					method539(arg1, 1024, arg2 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					method539(arg1, 512, arg2);
					method539(arg1 - 1, 8192, arg2 + 1);
				}

				if (arg0 == 1) {
					method539(arg1, 2048, arg2);
					method539(arg1 + 1, 32768, arg2 + 1);
				}

				if (arg0 == 2) {
					method539(arg1, 8192, arg2);
					method539(arg1 + 1, 512, arg2 - 1);
				}

				if (arg0 == 3) {
					method539(arg1, 32768, arg2);
					method539(arg1 - 1, 2048, arg2 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg0 == 0) {
					method539(arg1, 66560, arg2);
					method539(arg1 - 1, 4096, arg2);
					method539(arg1, 16384, arg2 + 1);
				}

				if (arg0 == 1) {
					method539(arg1, 5120, arg2);
					method539(arg1, 16384, arg2 + 1);
					method539(arg1 + 1, 0x10000, arg2);
				}

				if (arg0 == 2) {
					method539(arg1, 20480, arg2);
					method539(arg1 + 1, 0x10000, arg2);
					method539(arg1, 1024, arg2 - 1);
				}

				if (arg0 == 3) {
					method539(arg1, 81920, arg2);
					method539(arg1, 1024, arg2 - 1);
					method539(arg1 - 1, 4096, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("XRENONSA.a(IIIIIZI)V")
	public void method538(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field1351;
		arg0 -= field1352;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1353) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1354) {
						method539(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("XRENONSA.a(IIBI)V")
	public void method539(int arg0, int arg1, int arg2) {
		field1355[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("XRENONSA.a(IBI)V")
	public void method540(int arg0, int arg1) {
		arg0 -= field1351;
		arg1 -= field1352;
		field1355[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("XRENONSA.a(IIIIIII)Z")
	public boolean method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}

		arg3 -= field1351;
		arg4 -= field1352;
		arg0 -= field1351;
		arg1 -= field1352;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1355[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1355[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1355[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1355[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1355[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1355[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1355[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1355[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg0 == arg3 && arg1 + 1 == arg4 && (field1355[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg4 && (field1355[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg3 && arg1 == arg4 && (field1355[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XRENONSA.b(IIIIIII)Z")
	public boolean method542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg0 == arg5) {
			return true;
		}

		arg2 -= field1351;
		arg0 -= field1352;
		arg1 -= field1351;
		arg5 -= field1352;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg1 + 1 == arg2 && arg0 == arg5 && (field1355[arg2][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg0 && (field1355[arg2][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg2 && arg0 == arg5 && (field1355[arg2][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg0 && (field1355[arg2][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg2 && arg0 == arg5 && (field1355[arg2][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg0 && (field1355[arg2][arg0] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 + 1 == arg2 && arg0 == arg5 && (field1355[arg2][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg0 && (field1355[arg2][arg0] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg1 == arg2 && arg5 + 1 == arg0 && (field1355[arg2][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg5 - 1 == arg0 && (field1355[arg2][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg2 && arg0 == arg5 && (field1355[arg2][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg2 && arg0 == arg5 && (field1355[arg2][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XRENONSA.a(IIZIIIII)Z")
	public boolean method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2 - 1;
		int var9 = arg4 + arg5 - 1;
		if (arg1 >= arg2 && arg1 <= var8 && arg6 >= arg5 && arg6 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg6 >= arg5 && arg6 <= var9 && (field1355[arg1 - field1351][arg6 - field1352] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg6 >= arg5 && arg6 <= var9 && (field1355[arg1 - field1351][arg6 - field1352] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg6 && arg1 >= arg2 && arg1 <= var8 && (field1355[arg1 - field1351][arg6 - field1352] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg1 >= arg2 && arg1 <= var8 && (field1355[arg1 - field1351][arg6 - field1352] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
