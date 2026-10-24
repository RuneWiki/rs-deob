package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.g")
	public int field940 = 0;

	@ObfuscatedName("jc.h")
	public int field941 = 0;

	@ObfuscatedName("jc.i")
	public int field942;

	@ObfuscatedName("jc.j")
	public int field943;

	@ObfuscatedName("jc.k")
	public int[][] field944;

	public class62(int arg0, int arg1) {
		field942 = arg1;
		field943 = arg0;
		field944 = new int[field942][field943];
		method359();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method359() {
		for (int var1 = 0; var1 < field942; var1++) {
			for (int var2 = 0; var2 < field943; var2++) {
				if (var1 == 0 || var2 == 0 || field942 - 1 == var1 || field943 - 1 == var2) {
					field944[var1][var2] = 0xFFFFFF;
				} else {
					field944[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZIZ)V")
	public void method360(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field940;
		arg2 -= field941;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method363(arg3, arg2, 128);
				method363(arg3 - 1, arg2, 8);
			}

			if (arg1 == 1) {
				method363(arg3, arg2, 2);
				method363(arg3, arg2 + 1, 32);
			}

			if (arg1 == 2) {
				method363(arg3, arg2, 8);
				method363(arg3 + 1, arg2, 128);
			}

			if (arg1 == 3) {
				method363(arg3, arg2, 32);
				method363(arg3, arg2 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method363(arg3, arg2, 1);
				method363(arg3 - 1, arg2 + 1, 16);
			}

			if (arg1 == 1) {
				method363(arg3, arg2, 4);
				method363(arg3 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method363(arg3, arg2, 16);
				method363(arg3 + 1, arg2 - 1, 1);
			}

			if (arg1 == 3) {
				method363(arg3, arg2, 64);
				method363(arg3 - 1, arg2 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method363(arg3, arg2, 130);
				method363(arg3 - 1, arg2, 8);
				method363(arg3, arg2 + 1, 32);
			}

			if (arg1 == 1) {
				method363(arg3, arg2, 10);
				method363(arg3, arg2 + 1, 32);
				method363(arg3 + 1, arg2, 128);
			}

			if (arg1 == 2) {
				method363(arg3, arg2, 40);
				method363(arg3 + 1, arg2, 128);
				method363(arg3, arg2 - 1, 2);
			}

			if (arg1 == 3) {
				method363(arg3, arg2, 160);
				method363(arg3, arg2 - 1, 2);
				method363(arg3 - 1, arg2, 8);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method363(arg3, arg2, 0x10000);
					method363(arg3 - 1, arg2, 4096);
				}

				if (arg1 == 1) {
					method363(arg3, arg2, 1024);
					method363(arg3, arg2 + 1, 16384);
				}

				if (arg1 == 2) {
					method363(arg3, arg2, 4096);
					method363(arg3 + 1, arg2, 0x10000);
				}

				if (arg1 == 3) {
					method363(arg3, arg2, 16384);
					method363(arg3, arg2 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method363(arg3, arg2, 512);
					method363(arg3 - 1, arg2 + 1, 8192);
				}

				if (arg1 == 1) {
					method363(arg3, arg2, 2048);
					method363(arg3 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method363(arg3, arg2, 8192);
					method363(arg3 + 1, arg2 - 1, 512);
				}

				if (arg1 == 3) {
					method363(arg3, arg2, 32768);
					method363(arg3 - 1, arg2 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method363(arg3, arg2, 66560);
					method363(arg3 - 1, arg2, 4096);
					method363(arg3, arg2 + 1, 16384);
				}

				if (arg1 == 1) {
					method363(arg3, arg2, 5120);
					method363(arg3, arg2 + 1, 16384);
					method363(arg3 + 1, arg2, 0x10000);
				}

				if (arg1 == 2) {
					method363(arg3, arg2, 20480);
					method363(arg3 + 1, arg2, 0x10000);
					method363(arg3, arg2 - 1, 1024);
				}

				if (arg1 == 3) {
					method363(arg3, arg2, 81920);
					method363(arg3, arg2 - 1, 1024);
					method363(arg3 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZIZ)V")
	public void method361(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg5 -= field940;
		arg0 -= field941;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field942) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field943) {
						method363(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method362(int arg0, int arg1) {
		arg0 -= field940;
		arg1 -= field941;
		field944[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		field944[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIIZ)V")
	public void method364(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field940;
		arg0 -= field941;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method366(arg2, 128, arg0);
				method366(arg2 - 1, 8, arg0);
			}

			if (arg1 == 1) {
				method366(arg2, 2, arg0);
				method366(arg2, 32, arg0 + 1);
			}

			if (arg1 == 2) {
				method366(arg2, 8, arg0);
				method366(arg2 + 1, 128, arg0);
			}

			if (arg1 == 3) {
				method366(arg2, 32, arg0);
				method366(arg2, 2, arg0 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method366(arg2, 1, arg0);
				method366(arg2 - 1, 16, arg0 + 1);
			}

			if (arg1 == 1) {
				method366(arg2, 4, arg0);
				method366(arg2 + 1, 64, arg0 + 1);
			}

			if (arg1 == 2) {
				method366(arg2, 16, arg0);
				method366(arg2 + 1, 1, arg0 - 1);
			}

			if (arg1 == 3) {
				method366(arg2, 64, arg0);
				method366(arg2 - 1, 4, arg0 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method366(arg2, 130, arg0);
				method366(arg2 - 1, 8, arg0);
				method366(arg2, 32, arg0 + 1);
			}

			if (arg1 == 1) {
				method366(arg2, 10, arg0);
				method366(arg2, 32, arg0 + 1);
				method366(arg2 + 1, 128, arg0);
			}

			if (arg1 == 2) {
				method366(arg2, 40, arg0);
				method366(arg2 + 1, 128, arg0);
				method366(arg2, 2, arg0 - 1);
			}

			if (arg1 == 3) {
				method366(arg2, 160, arg0);
				method366(arg2, 2, arg0 - 1);
				method366(arg2 - 1, 8, arg0);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method366(arg2, 0x10000, arg0);
					method366(arg2 - 1, 4096, arg0);
				}

				if (arg1 == 1) {
					method366(arg2, 1024, arg0);
					method366(arg2, 16384, arg0 + 1);
				}

				if (arg1 == 2) {
					method366(arg2, 4096, arg0);
					method366(arg2 + 1, 0x10000, arg0);
				}

				if (arg1 == 3) {
					method366(arg2, 16384, arg0);
					method366(arg2, 1024, arg0 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method366(arg2, 512, arg0);
					method366(arg2 - 1, 8192, arg0 + 1);
				}

				if (arg1 == 1) {
					method366(arg2, 2048, arg0);
					method366(arg2 + 1, 32768, arg0 + 1);
				}

				if (arg1 == 2) {
					method366(arg2, 8192, arg0);
					method366(arg2 + 1, 512, arg0 - 1);
				}

				if (arg1 == 3) {
					method366(arg2, 32768, arg0);
					method366(arg2 - 1, 2048, arg0 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method366(arg2, 66560, arg0);
					method366(arg2 - 1, 4096, arg0);
					method366(arg2, 16384, arg0 + 1);
				}

				if (arg1 == 1) {
					method366(arg2, 5120, arg0);
					method366(arg2, 16384, arg0 + 1);
					method366(arg2 + 1, 0x10000, arg0);
				}

				if (arg1 == 2) {
					method366(arg2, 20480, arg0);
					method366(arg2 + 1, 0x10000, arg0);
					method366(arg2, 1024, arg0 - 1);
				}

				if (arg1 == 3) {
					method366(arg2, 81920, arg0);
					method366(arg2, 1024, arg0 - 1);
					method366(arg2 - 1, 4096, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZII)V")
	public void method365(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg0 -= field940;
		arg2 -= field941;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field942) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field943) {
						method366(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIB)V")
	public void method366(int arg0, int arg1, int arg2) {
		field944[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void method367(int arg0, int arg1) {
		arg1 -= field940;
		arg0 -= field941;
		field944[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIIB)Z")
	public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg4 == arg5) {
			return true;
		}

		arg1 -= field940;
		arg4 -= field941;
		arg2 -= field940;
		arg5 -= field941;
		if (arg0 == 0) {
			if (arg3 == 0) {
				if (arg2 - 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg4 && (field944[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg4 && (field944[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 == arg2 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg2 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg2 + 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg4 && (field944[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg4 && (field944[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 == arg2 && arg5 - 1 == arg4) {
					return true;
				}

				if (arg2 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				if (arg2 - 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg4 && (field944[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg2 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg4 && (field944[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg2 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg4 && (field944[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg4) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg2 - 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg4 && (field944[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg2 && arg5 + 1 == arg4 && (field944[arg1][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg5 - 1 == arg4 && (field944[arg1][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IZIIIII)Z")
	public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg5) {
			return true;
		}

		arg0 -= field940;
		arg1 -= field941;
		arg4 -= field940;
		arg5 -= field941;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg4 + 1 == arg0 && arg1 == arg5 && (field944[arg0][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg1 && (field944[arg0][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg4 - 1 == arg0 && arg1 == arg5 && (field944[arg0][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg1 && (field944[arg0][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg4 - 1 == arg0 && arg1 == arg5 && (field944[arg0][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg1 && (field944[arg0][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg4 + 1 == arg0 && arg1 == arg5 && (field944[arg0][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg1 && (field944[arg0][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg4 && arg5 + 1 == arg1 && (field944[arg0][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg5 - 1 == arg1 && (field944[arg0][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg1 == arg5 && (field944[arg0][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg1 == arg5 && (field944[arg0][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg6 - 1;
		int var9 = arg0 + arg3 - 1;
		if (arg5 >= arg6 && arg5 <= var8 && arg2 >= arg3 && arg2 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg2 >= arg3 && arg2 <= var9 && (field944[arg5 - field940][arg2 - field941] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg2 >= arg3 && arg2 <= var9 && (field944[arg5 - field940][arg2 - field941] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg2 && arg5 >= arg6 && arg5 <= var8 && (field944[arg5 - field940][arg2 - field941] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg5 >= arg6 && arg5 <= var8 && (field944[arg5 - field940][arg2 - field941] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
