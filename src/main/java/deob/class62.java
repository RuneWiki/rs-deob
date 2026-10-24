package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.h")
	public int field960 = 0;

	@ObfuscatedName("jc.i")
	public int field961 = 0;

	@ObfuscatedName("jc.j")
	public int field962;

	@ObfuscatedName("jc.k")
	public int field963;

	@ObfuscatedName("jc.l")
	public int[][] field964;

	public class62(int arg0, int arg1) {
		field962 = arg0;
		field963 = arg1;
		field964 = new int[field962][field963];
		method359();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method359() {
		for (int var1 = 0; var1 < field962; var1++) {
			for (int var2 = 0; var2 < field963; var2++) {
				if (var1 == 0 || var2 == 0 || field962 - 1 == var1 || field963 - 1 == var2) {
					field964[var1][var2] = 0xFFFFFF;
				} else {
					field964[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IZIIII)V")
	public void method360(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field960;
		arg4 -= field961;
		if (arg3 == 0) {
			if (arg2 == 0) {
				method363(arg1, arg4, 128);
				method363(arg1 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method363(arg1, arg4, 2);
				method363(arg1, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method363(arg1, arg4, 8);
				method363(arg1 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method363(arg1, arg4, 32);
				method363(arg1, arg4 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				method363(arg1, arg4, 1);
				method363(arg1 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method363(arg1, arg4, 4);
				method363(arg1 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method363(arg1, arg4, 16);
				method363(arg1 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method363(arg1, arg4, 64);
				method363(arg1 - 1, arg4 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				method363(arg1, arg4, 130);
				method363(arg1 - 1, arg4, 8);
				method363(arg1, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method363(arg1, arg4, 10);
				method363(arg1, arg4 + 1, 32);
				method363(arg1 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method363(arg1, arg4, 40);
				method363(arg1 + 1, arg4, 128);
				method363(arg1, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method363(arg1, arg4, 160);
				method363(arg1, arg4 - 1, 2);
				method363(arg1 - 1, arg4, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					method363(arg1, arg4, 0x10000);
					method363(arg1 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method363(arg1, arg4, 1024);
					method363(arg1, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method363(arg1, arg4, 4096);
					method363(arg1 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method363(arg1, arg4, 16384);
					method363(arg1, arg4 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					method363(arg1, arg4, 512);
					method363(arg1 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method363(arg1, arg4, 2048);
					method363(arg1 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method363(arg1, arg4, 8192);
					method363(arg1 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method363(arg1, arg4, 32768);
					method363(arg1 - 1, arg4 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg2 == 0) {
					method363(arg1, arg4, 66560);
					method363(arg1 - 1, arg4, 4096);
					method363(arg1, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method363(arg1, arg4, 5120);
					method363(arg1, arg4 + 1, 16384);
					method363(arg1 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method363(arg1, arg4, 20480);
					method363(arg1 + 1, arg4, 0x10000);
					method363(arg1, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method363(arg1, arg4, 81920);
					method363(arg1, arg4 - 1, 1024);
					method363(arg1 - 1, arg4, 4096);
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

		arg2 -= field960;
		arg1 -= field961;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field962) {
				for (int var10 = arg1; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field963) {
						method363(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method362(int arg0, int arg1) {
		arg0 -= field960;
		arg1 -= field961;
		field964[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		field964[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIZI)V")
	public void method364(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg4 -= field960;
		arg2 -= field961;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method366(arg4, arg2, 128);
				method366(arg4 - 1, arg2, 8);
			}

			if (arg1 == 1) {
				method366(arg4, arg2, 2);
				method366(arg4, arg2 + 1, 32);
			}

			if (arg1 == 2) {
				method366(arg4, arg2, 8);
				method366(arg4 + 1, arg2, 128);
			}

			if (arg1 == 3) {
				method366(arg4, arg2, 32);
				method366(arg4, arg2 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method366(arg4, arg2, 1);
				method366(arg4 - 1, arg2 + 1, 16);
			}

			if (arg1 == 1) {
				method366(arg4, arg2, 4);
				method366(arg4 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method366(arg4, arg2, 16);
				method366(arg4 + 1, arg2 - 1, 1);
			}

			if (arg1 == 3) {
				method366(arg4, arg2, 64);
				method366(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method366(arg4, arg2, 130);
				method366(arg4 - 1, arg2, 8);
				method366(arg4, arg2 + 1, 32);
			}

			if (arg1 == 1) {
				method366(arg4, arg2, 10);
				method366(arg4, arg2 + 1, 32);
				method366(arg4 + 1, arg2, 128);
			}

			if (arg1 == 2) {
				method366(arg4, arg2, 40);
				method366(arg4 + 1, arg2, 128);
				method366(arg4, arg2 - 1, 2);
			}

			if (arg1 == 3) {
				method366(arg4, arg2, 160);
				method366(arg4, arg2 - 1, 2);
				method366(arg4 - 1, arg2, 8);
			}
		}

		if (arg3) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method366(arg4, arg2, 0x10000);
					method366(arg4 - 1, arg2, 4096);
				}

				if (arg1 == 1) {
					method366(arg4, arg2, 1024);
					method366(arg4, arg2 + 1, 16384);
				}

				if (arg1 == 2) {
					method366(arg4, arg2, 4096);
					method366(arg4 + 1, arg2, 0x10000);
				}

				if (arg1 == 3) {
					method366(arg4, arg2, 16384);
					method366(arg4, arg2 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method366(arg4, arg2, 512);
					method366(arg4 - 1, arg2 + 1, 8192);
				}

				if (arg1 == 1) {
					method366(arg4, arg2, 2048);
					method366(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method366(arg4, arg2, 8192);
					method366(arg4 + 1, arg2 - 1, 512);
				}

				if (arg1 == 3) {
					method366(arg4, arg2, 32768);
					method366(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method366(arg4, arg2, 66560);
					method366(arg4 - 1, arg2, 4096);
					method366(arg4, arg2 + 1, 16384);
				}

				if (arg1 == 1) {
					method366(arg4, arg2, 5120);
					method366(arg4, arg2 + 1, 16384);
					method366(arg4 + 1, arg2, 0x10000);
				}

				if (arg1 == 2) {
					method366(arg4, arg2, 20480);
					method366(arg4 + 1, arg2, 0x10000);
					method366(arg4, arg2 - 1, 1024);
				}

				if (arg1 == 3) {
					method366(arg4, arg2, 81920);
					method366(arg4, arg2 - 1, 1024);
					method366(arg4 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IZBIIII)V")
	public void method365(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg3 -= field960;
		arg4 -= field961;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field962) {
				for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field963) {
						method366(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method366(int arg0, int arg1, int arg2) {
		field964[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("jc.c(III)V")
	public void method367(int arg0, int arg1) {
		arg0 -= field960;
		arg1 -= field961;
		field964[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg3 && arg0 == arg4) {
			return true;
		}

		arg1 -= field960;
		arg0 -= field961;
		arg3 -= field960;
		arg4 -= field961;
		if (arg5 == 0) {
			if (arg2 == 0) {
				if (arg3 - 1 == arg1 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg4 + 1 == arg0 && (field964[arg1][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg4 - 1 == arg0 && (field964[arg1][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 == arg3 && arg4 + 1 == arg0) {
					return true;
				}

				if (arg3 - 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 + 1 == arg1 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg4 + 1 == arg0 && (field964[arg1][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg4 - 1 == arg0 && (field964[arg1][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 == arg3 && arg4 - 1 == arg0) {
					return true;
				}

				if (arg3 - 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg2 == 0) {
				if (arg3 - 1 == arg1 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg4 + 1 == arg0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg4 - 1 == arg0 && (field964[arg1][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 - 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg4 + 1 == arg0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg4 - 1 == arg0 && (field964[arg1][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 - 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg4 + 1 == arg0 && (field964[arg1][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg4 - 1 == arg0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 - 1 == arg1 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg4 + 1 == arg0 && (field964[arg1][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg4 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg1 == arg3 && arg4 + 1 == arg0 && (field964[arg1][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg3 && arg4 - 1 == arg0 && (field964[arg1][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg1 && arg0 == arg4 && (field964[arg1][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.b(IIIIIII)Z")
	public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}

		arg0 -= field960;
		arg4 -= field961;
		arg3 -= field960;
		arg1 -= field961;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg3 + 1 == arg0 && arg1 == arg4 && (field964[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field964[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 - 1 == arg0 && arg1 == arg4 && (field964[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field964[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 - 1 == arg0 && arg1 == arg4 && (field964[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field964[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 + 1 == arg0 && arg1 == arg4 && (field964[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field964[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg3 && arg1 + 1 == arg4 && (field964[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg4 && (field964[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg0 && arg1 == arg4 && (field964[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg0 && arg1 == arg4 && (field964[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg6 - 1;
		int var9 = arg0 + arg3 - 1;
		if (arg5 >= arg6 && arg5 <= var8 && arg4 >= arg0 && arg4 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg4 >= arg0 && arg4 <= var9 && (field964[arg5 - field960][arg4 - field961] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg0 && arg4 <= var9 && (field964[arg5 - field960][arg4 - field961] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg4 && arg5 >= arg6 && arg5 <= var8 && (field964[arg5 - field960][arg4 - field961] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg6 && arg5 <= var8 && (field964[arg5 - field960][arg4 - field961] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
