package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.e")
	public int field959 = 0;

	@ObfuscatedName("jc.f")
	public int field960 = 0;

	@ObfuscatedName("jc.g")
	public int field961;

	@ObfuscatedName("jc.h")
	public int field962;

	@ObfuscatedName("jc.i")
	public int[][] field963;

	public class62(int arg0, int arg1) {
		field961 = arg0;
		field962 = arg1;
		field963 = new int[field961][field962];
		method359();
	}

	@ObfuscatedName("jc.a(Z)V")
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

	@ObfuscatedName("jc.a(IZIIII)V")
	public void method360(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field959;
		arg3 -= field960;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method363(arg0, arg3, 128);
				method363(arg0 - 1, arg3, 8);
			}

			if (arg4 == 1) {
				method363(arg0, arg3, 2);
				method363(arg0, arg3 + 1, 32);
			}

			if (arg4 == 2) {
				method363(arg0, arg3, 8);
				method363(arg0 + 1, arg3, 128);
			}

			if (arg4 == 3) {
				method363(arg0, arg3, 32);
				method363(arg0, arg3 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method363(arg0, arg3, 1);
				method363(arg0 - 1, arg3 + 1, 16);
			}

			if (arg4 == 1) {
				method363(arg0, arg3, 4);
				method363(arg0 + 1, arg3 + 1, 64);
			}

			if (arg4 == 2) {
				method363(arg0, arg3, 16);
				method363(arg0 + 1, arg3 - 1, 1);
			}

			if (arg4 == 3) {
				method363(arg0, arg3, 64);
				method363(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method363(arg0, arg3, 130);
				method363(arg0 - 1, arg3, 8);
				method363(arg0, arg3 + 1, 32);
			}

			if (arg4 == 1) {
				method363(arg0, arg3, 10);
				method363(arg0, arg3 + 1, 32);
				method363(arg0 + 1, arg3, 128);
			}

			if (arg4 == 2) {
				method363(arg0, arg3, 40);
				method363(arg0 + 1, arg3, 128);
				method363(arg0, arg3 - 1, 2);
			}

			if (arg4 == 3) {
				method363(arg0, arg3, 160);
				method363(arg0, arg3 - 1, 2);
				method363(arg0 - 1, arg3, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method363(arg0, arg3, 0x10000);
					method363(arg0 - 1, arg3, 4096);
				}

				if (arg4 == 1) {
					method363(arg0, arg3, 1024);
					method363(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 2) {
					method363(arg0, arg3, 4096);
					method363(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 3) {
					method363(arg0, arg3, 16384);
					method363(arg0, arg3 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method363(arg0, arg3, 512);
					method363(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg4 == 1) {
					method363(arg0, arg3, 2048);
					method363(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg4 == 2) {
					method363(arg0, arg3, 8192);
					method363(arg0 + 1, arg3 - 1, 512);
				}

				if (arg4 == 3) {
					method363(arg0, arg3, 32768);
					method363(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method363(arg0, arg3, 66560);
					method363(arg0 - 1, arg3, 4096);
					method363(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 1) {
					method363(arg0, arg3, 5120);
					method363(arg0, arg3 + 1, 16384);
					method363(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 2) {
					method363(arg0, arg3, 20480);
					method363(arg0 + 1, arg3, 0x10000);
					method363(arg0, arg3 - 1, 1024);
				}

				if (arg4 == 3) {
					method363(arg0, arg3, 81920);
					method363(arg0, arg3 - 1, 1024);
					method363(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZZIII)V")
	public void method361(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg4 -= field959;
		arg0 -= field960;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg5;
			arg5 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg4; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field961) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field962) {
						method363(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void method362(int arg0, int arg1) {
		arg1 -= field959;
		arg0 -= field960;
		field963[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		field963[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(ZIIBII)V")
	public void method364(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field959;
		arg2 -= field960;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method366(arg2, 128, arg3);
				method366(arg2, 8, arg3 - 1);
			}

			if (arg1 == 1) {
				method366(arg2, 2, arg3);
				method366(arg2 + 1, 32, arg3);
			}

			if (arg1 == 2) {
				method366(arg2, 8, arg3);
				method366(arg2, 128, arg3 + 1);
			}

			if (arg1 == 3) {
				method366(arg2, 32, arg3);
				method366(arg2 - 1, 2, arg3);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method366(arg2, 1, arg3);
				method366(arg2 + 1, 16, arg3 - 1);
			}

			if (arg1 == 1) {
				method366(arg2, 4, arg3);
				method366(arg2 + 1, 64, arg3 + 1);
			}

			if (arg1 == 2) {
				method366(arg2, 16, arg3);
				method366(arg2 - 1, 1, arg3 + 1);
			}

			if (arg1 == 3) {
				method366(arg2, 64, arg3);
				method366(arg2 - 1, 4, arg3 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method366(arg2, 130, arg3);
				method366(arg2, 8, arg3 - 1);
				method366(arg2 + 1, 32, arg3);
			}

			if (arg1 == 1) {
				method366(arg2, 10, arg3);
				method366(arg2 + 1, 32, arg3);
				method366(arg2, 128, arg3 + 1);
			}

			if (arg1 == 2) {
				method366(arg2, 40, arg3);
				method366(arg2, 128, arg3 + 1);
				method366(arg2 - 1, 2, arg3);
			}

			if (arg1 == 3) {
				method366(arg2, 160, arg3);
				method366(arg2 - 1, 2, arg3);
				method366(arg2, 8, arg3 - 1);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method366(arg2, 0x10000, arg3);
					method366(arg2, 4096, arg3 - 1);
				}

				if (arg1 == 1) {
					method366(arg2, 1024, arg3);
					method366(arg2 + 1, 16384, arg3);
				}

				if (arg1 == 2) {
					method366(arg2, 4096, arg3);
					method366(arg2, 0x10000, arg3 + 1);
				}

				if (arg1 == 3) {
					method366(arg2, 16384, arg3);
					method366(arg2 - 1, 1024, arg3);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method366(arg2, 512, arg3);
					method366(arg2 + 1, 8192, arg3 - 1);
				}

				if (arg1 == 1) {
					method366(arg2, 2048, arg3);
					method366(arg2 + 1, 32768, arg3 + 1);
				}

				if (arg1 == 2) {
					method366(arg2, 8192, arg3);
					method366(arg2 - 1, 512, arg3 + 1);
				}

				if (arg1 == 3) {
					method366(arg2, 32768, arg3);
					method366(arg2 - 1, 2048, arg3 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method366(arg2, 66560, arg3);
					method366(arg2, 4096, arg3 - 1);
					method366(arg2 + 1, 16384, arg3);
				}

				if (arg1 == 1) {
					method366(arg2, 5120, arg3);
					method366(arg2 + 1, 16384, arg3);
					method366(arg2, 0x10000, arg3 + 1);
				}

				if (arg1 == 2) {
					method366(arg2, 20480, arg3);
					method366(arg2, 0x10000, arg3 + 1);
					method366(arg2 - 1, 1024, arg3);
				}

				if (arg1 == 3) {
					method366(arg2, 81920, arg3);
					method366(arg2 - 1, 1024, arg3);
					method366(arg2, 4096, arg3 - 1);
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

		arg1 -= field959;
		arg5 -= field960;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field961) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field962) {
						method366(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method366(int arg0, int arg1, int arg2) {
		field963[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method367(int arg0, int arg1) {
		arg1 -= field959;
		arg0 -= field960;
		field963[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIZI)Z")
	public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg2 == arg3) {
			return true;
		}

		arg1 -= field959;
		arg3 -= field960;
		arg4 -= field959;
		arg2 -= field960;
		if (arg5 == 0) {
			if (arg0 == 0) {
				if (arg4 - 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg4 + 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 == arg4 && arg2 - 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg0 == 0) {
				if (arg4 - 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg4 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg4 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg4 - 1 == arg1 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg1 == arg4 && arg2 + 1 == arg3 && (field963[arg1][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg2 - 1 == arg3 && (field963[arg1][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg1 && arg2 == arg3 && (field963[arg1][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg1 == arg2) {
			return true;
		}

		arg5 -= field959;
		arg1 -= field960;
		arg3 -= field959;
		arg2 -= field960;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg3 + 1 == arg5 && arg1 == arg2 && (field963[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg1 && (field963[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 - 1 == arg5 && arg1 == arg2 && (field963[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg1 && (field963[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 - 1 == arg5 && arg1 == arg2 && (field963[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg1 && (field963[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 + 1 == arg5 && arg1 == arg2 && (field963[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg1 && (field963[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg3 == arg5 && arg2 + 1 == arg1 && (field963[arg5][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg2 - 1 == arg1 && (field963[arg5][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg1 == arg2 && (field963[arg5][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg1 == arg2 && (field963[arg5][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIIZ)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg1 - 1;
		int var9 = arg3 + arg5 - 1;
		if (arg6 >= arg1 && arg6 <= var8 && arg2 >= arg5 && arg2 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg6 && arg2 >= arg5 && arg2 <= var9 && (field963[arg6 - field959][arg2 - field960] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg2 >= arg5 && arg2 <= var9 && (field963[arg6 - field959][arg2 - field960] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg2 && arg6 >= arg1 && arg6 <= var8 && (field963[arg6 - field959][arg2 - field960] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg6 >= arg1 && arg6 <= var8 && (field963[arg6 - field959][arg2 - field960] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
