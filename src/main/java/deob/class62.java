package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.i")
	public int field959 = 0;

	@ObfuscatedName("jc.j")
	public int field960 = 0;

	@ObfuscatedName("jc.k")
	public int field961;

	@ObfuscatedName("jc.l")
	public int field962;

	@ObfuscatedName("jc.m")
	public int[][] field963;

	public class62(int arg0, int arg1) {
		field961 = arg0;
		field962 = arg1;
		field963 = new int[field961][field962];
		method359();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method359() {
		for (int var1 = 0; var1 < field961; var1++) {
			for (int var2 = 0; var2 < field962; var2++) {
				if (var1 == 0 || var2 == 0 || field961 - 1 == var1 || field962 - 1 == var2) {
					field963[var1][var2] = 0xFFFFFF;
				} else {
					field963[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZI)V")
	public void method360(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg0 -= field959;
		arg2 -= field960;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method363(arg0, arg2, 128);
				method363(arg0 - 1, arg2, 8);
			}

			if (arg1 == 1) {
				method363(arg0, arg2, 2);
				method363(arg0, arg2 + 1, 32);
			}

			if (arg1 == 2) {
				method363(arg0, arg2, 8);
				method363(arg0 + 1, arg2, 128);
			}

			if (arg1 == 3) {
				method363(arg0, arg2, 32);
				method363(arg0, arg2 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method363(arg0, arg2, 1);
				method363(arg0 - 1, arg2 + 1, 16);
			}

			if (arg1 == 1) {
				method363(arg0, arg2, 4);
				method363(arg0 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method363(arg0, arg2, 16);
				method363(arg0 + 1, arg2 - 1, 1);
			}

			if (arg1 == 3) {
				method363(arg0, arg2, 64);
				method363(arg0 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method363(arg0, arg2, 130);
				method363(arg0 - 1, arg2, 8);
				method363(arg0, arg2 + 1, 32);
			}

			if (arg1 == 1) {
				method363(arg0, arg2, 10);
				method363(arg0, arg2 + 1, 32);
				method363(arg0 + 1, arg2, 128);
			}

			if (arg1 == 2) {
				method363(arg0, arg2, 40);
				method363(arg0 + 1, arg2, 128);
				method363(arg0, arg2 - 1, 2);
			}

			if (arg1 == 3) {
				method363(arg0, arg2, 160);
				method363(arg0, arg2 - 1, 2);
				method363(arg0 - 1, arg2, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method363(arg0, arg2, 0x10000);
					method363(arg0 - 1, arg2, 4096);
				}

				if (arg1 == 1) {
					method363(arg0, arg2, 1024);
					method363(arg0, arg2 + 1, 16384);
				}

				if (arg1 == 2) {
					method363(arg0, arg2, 4096);
					method363(arg0 + 1, arg2, 0x10000);
				}

				if (arg1 == 3) {
					method363(arg0, arg2, 16384);
					method363(arg0, arg2 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method363(arg0, arg2, 512);
					method363(arg0 - 1, arg2 + 1, 8192);
				}

				if (arg1 == 1) {
					method363(arg0, arg2, 2048);
					method363(arg0 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method363(arg0, arg2, 8192);
					method363(arg0 + 1, arg2 - 1, 512);
				}

				if (arg1 == 3) {
					method363(arg0, arg2, 32768);
					method363(arg0 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method363(arg0, arg2, 66560);
					method363(arg0 - 1, arg2, 4096);
					method363(arg0, arg2 + 1, 16384);
				}

				if (arg1 == 1) {
					method363(arg0, arg2, 5120);
					method363(arg0, arg2 + 1, 16384);
					method363(arg0 + 1, arg2, 0x10000);
				}

				if (arg1 == 2) {
					method363(arg0, arg2, 20480);
					method363(arg0 + 1, arg2, 0x10000);
					method363(arg0, arg2 - 1, 1024);
				}

				if (arg1 == 3) {
					method363(arg0, arg2, 81920);
					method363(arg0, arg2 - 1, 1024);
					method363(arg0 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZIIII)V")
	public void method361(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg4 -= field959;
		arg3 -= field960;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg0;
			arg0 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field961) {
				for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field962) {
						method363(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZ)V")
	public void method362(int arg0, int arg1) {
		arg1 -= field959;
		arg0 -= field960;
		field963[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		field963[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IZZIII)V")
	public void method364(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field959;
		arg3 -= field960;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method366(128, arg0, arg3);
				method366(8, arg0 - 1, arg3);
			}

			if (arg4 == 1) {
				method366(2, arg0, arg3);
				method366(32, arg0, arg3 + 1);
			}

			if (arg4 == 2) {
				method366(8, arg0, arg3);
				method366(128, arg0 + 1, arg3);
			}

			if (arg4 == 3) {
				method366(32, arg0, arg3);
				method366(2, arg0, arg3 - 1);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method366(1, arg0, arg3);
				method366(16, arg0 - 1, arg3 + 1);
			}

			if (arg4 == 1) {
				method366(4, arg0, arg3);
				method366(64, arg0 + 1, arg3 + 1);
			}

			if (arg4 == 2) {
				method366(16, arg0, arg3);
				method366(1, arg0 + 1, arg3 - 1);
			}

			if (arg4 == 3) {
				method366(64, arg0, arg3);
				method366(4, arg0 - 1, arg3 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method366(130, arg0, arg3);
				method366(8, arg0 - 1, arg3);
				method366(32, arg0, arg3 + 1);
			}

			if (arg4 == 1) {
				method366(10, arg0, arg3);
				method366(32, arg0, arg3 + 1);
				method366(128, arg0 + 1, arg3);
			}

			if (arg4 == 2) {
				method366(40, arg0, arg3);
				method366(128, arg0 + 1, arg3);
				method366(2, arg0, arg3 - 1);
			}

			if (arg4 == 3) {
				method366(160, arg0, arg3);
				method366(2, arg0, arg3 - 1);
				method366(8, arg0 - 1, arg3);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method366(0x10000, arg0, arg3);
					method366(4096, arg0 - 1, arg3);
				}

				if (arg4 == 1) {
					method366(1024, arg0, arg3);
					method366(16384, arg0, arg3 + 1);
				}

				if (arg4 == 2) {
					method366(4096, arg0, arg3);
					method366(0x10000, arg0 + 1, arg3);
				}

				if (arg4 == 3) {
					method366(16384, arg0, arg3);
					method366(1024, arg0, arg3 - 1);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method366(512, arg0, arg3);
					method366(8192, arg0 - 1, arg3 + 1);
				}

				if (arg4 == 1) {
					method366(2048, arg0, arg3);
					method366(32768, arg0 + 1, arg3 + 1);
				}

				if (arg4 == 2) {
					method366(8192, arg0, arg3);
					method366(512, arg0 + 1, arg3 - 1);
				}

				if (arg4 == 3) {
					method366(32768, arg0, arg3);
					method366(2048, arg0 - 1, arg3 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method366(66560, arg0, arg3);
					method366(4096, arg0 - 1, arg3);
					method366(16384, arg0, arg3 + 1);
				}

				if (arg4 == 1) {
					method366(5120, arg0, arg3);
					method366(16384, arg0, arg3 + 1);
					method366(0x10000, arg0 + 1, arg3);
				}

				if (arg4 == 2) {
					method366(20480, arg0, arg3);
					method366(0x10000, arg0 + 1, arg3);
					method366(1024, arg0, arg3 - 1);
				}

				if (arg4 == 3) {
					method366(81920, arg0, arg3);
					method366(1024, arg0, arg3 - 1);
					method366(4096, arg0 - 1, arg3);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZIIIIII)V")
	public void method365(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg2 -= field959;
		arg3 -= field960;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg5;
			arg5 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field961) {
				for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
					if (var10 >= 0 && var10 < field962) {
						method366(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IZII)V")
	public void method366(int arg0, int arg1, int arg2) {
		field963[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("jc.b(IIZ)V")
	public void method367(int arg0, int arg1) {
		arg1 -= field959;
		arg0 -= field960;
		field963[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg2 == arg3) {
			return true;
		}

		arg1 -= field959;
		arg3 -= field960;
		arg0 -= field959;
		arg2 -= field960;
		if (arg4 == 0) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 == arg1 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg0 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 + 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 == arg1 && arg2 - 1 == arg3) {
					return true;
				}

				if (arg0 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg5 == 0) {
				if (arg0 - 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg3) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 - 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg1 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.b(IIIIIII)Z")
	public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg2) {
			return true;
		}

		arg4 -= field959;
		arg2 -= field960;
		arg3 -= field959;
		arg0 -= field960;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}

			if (arg1 == 0) {
				if (arg3 + 1 == arg4 && arg0 == arg2 && (field963[arg4][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg2 && (field963[arg4][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg2 && (field963[arg4][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg2 && (field963[arg4][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg2 && (field963[arg4][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg2 && (field963[arg4][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg3 + 1 == arg4 && arg0 == arg2 && (field963[arg4][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg2 && (field963[arg4][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg3 == arg4 && arg0 + 1 == arg2 && (field963[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg0 - 1 == arg2 && (field963[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg2 && (field963[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg2 && (field963[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIZI)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg4 + arg5 - 1;
		if (arg6 >= arg0 && arg6 <= var8 && arg2 >= arg4 && arg2 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg2 >= arg4 && arg2 <= var9 && (field963[arg6 - field959][arg2 - field960] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg2 >= arg4 && arg2 <= var9 && (field963[arg6 - field959][arg2 - field960] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg2 && arg6 >= arg0 && arg6 <= var8 && (field963[arg6 - field959][arg2 - field960] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg6 >= arg0 && arg6 <= var8 && (field963[arg6 - field959][arg2 - field960] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
