package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.e")
	public int field937 = 0;

	@ObfuscatedName("jc.f")
	public int field938 = 0;

	@ObfuscatedName("jc.g")
	public int field939;

	@ObfuscatedName("jc.h")
	public int field940;

	@ObfuscatedName("jc.i")
	public int[][] field941;

	public class62(int arg0, int arg1) {
		field939 = arg0;
		field940 = arg1;
		field941 = new int[field939][field940];
		method359();
	}

	@ObfuscatedName("jc.a(I)V")
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

	@ObfuscatedName("jc.a(IZIIIZ)V")
	public void method360(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field937;
		arg3 -= field938;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method363(arg1, arg3, 128);
				method363(arg1 - 1, arg3, 8);
			}

			if (arg2 == 1) {
				method363(arg1, arg3, 2);
				method363(arg1, arg3 + 1, 32);
			}

			if (arg2 == 2) {
				method363(arg1, arg3, 8);
				method363(arg1 + 1, arg3, 128);
			}

			if (arg2 == 3) {
				method363(arg1, arg3, 32);
				method363(arg1, arg3 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method363(arg1, arg3, 1);
				method363(arg1 - 1, arg3 + 1, 16);
			}

			if (arg2 == 1) {
				method363(arg1, arg3, 4);
				method363(arg1 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method363(arg1, arg3, 16);
				method363(arg1 + 1, arg3 - 1, 1);
			}

			if (arg2 == 3) {
				method363(arg1, arg3, 64);
				method363(arg1 - 1, arg3 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method363(arg1, arg3, 130);
				method363(arg1 - 1, arg3, 8);
				method363(arg1, arg3 + 1, 32);
			}

			if (arg2 == 1) {
				method363(arg1, arg3, 10);
				method363(arg1, arg3 + 1, 32);
				method363(arg1 + 1, arg3, 128);
			}

			if (arg2 == 2) {
				method363(arg1, arg3, 40);
				method363(arg1 + 1, arg3, 128);
				method363(arg1, arg3 - 1, 2);
			}

			if (arg2 == 3) {
				method363(arg1, arg3, 160);
				method363(arg1, arg3 - 1, 2);
				method363(arg1 - 1, arg3, 8);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method363(arg1, arg3, 0x10000);
					method363(arg1 - 1, arg3, 4096);
				}

				if (arg2 == 1) {
					method363(arg1, arg3, 1024);
					method363(arg1, arg3 + 1, 16384);
				}

				if (arg2 == 2) {
					method363(arg1, arg3, 4096);
					method363(arg1 + 1, arg3, 0x10000);
				}

				if (arg2 == 3) {
					method363(arg1, arg3, 16384);
					method363(arg1, arg3 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method363(arg1, arg3, 512);
					method363(arg1 - 1, arg3 + 1, 8192);
				}

				if (arg2 == 1) {
					method363(arg1, arg3, 2048);
					method363(arg1 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method363(arg1, arg3, 8192);
					method363(arg1 + 1, arg3 - 1, 512);
				}

				if (arg2 == 3) {
					method363(arg1, arg3, 32768);
					method363(arg1 - 1, arg3 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method363(arg1, arg3, 66560);
					method363(arg1 - 1, arg3, 4096);
					method363(arg1, arg3 + 1, 16384);
				}

				if (arg2 == 1) {
					method363(arg1, arg3, 5120);
					method363(arg1, arg3 + 1, 16384);
					method363(arg1 + 1, arg3, 0x10000);
				}

				if (arg2 == 2) {
					method363(arg1, arg3, 20480);
					method363(arg1 + 1, arg3, 0x10000);
					method363(arg1, arg3 - 1, 1024);
				}

				if (arg2 == 3) {
					method363(arg1, arg3, 81920);
					method363(arg1, arg3 - 1, 1024);
					method363(arg1 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(BIZIIII)V")
	public void method361(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg0 -= field937;
		arg3 -= field938;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg4;
			arg4 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field939) {
				for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field940) {
						method363(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIB)V")
	public void method362(int arg0, int arg1) {
		arg0 -= field937;
		arg1 -= field938;
		field941[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		field941[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIZIII)V")
	public void method364(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field937;
		arg2 -= field938;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method366(arg4, arg2, 128);
				method366(arg4 - 1, arg2, 8);
			}

			if (arg3 == 1) {
				method366(arg4, arg2, 2);
				method366(arg4, arg2 + 1, 32);
			}

			if (arg3 == 2) {
				method366(arg4, arg2, 8);
				method366(arg4 + 1, arg2, 128);
			}

			if (arg3 == 3) {
				method366(arg4, arg2, 32);
				method366(arg4, arg2 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method366(arg4, arg2, 1);
				method366(arg4 - 1, arg2 + 1, 16);
			}

			if (arg3 == 1) {
				method366(arg4, arg2, 4);
				method366(arg4 + 1, arg2 + 1, 64);
			}

			if (arg3 == 2) {
				method366(arg4, arg2, 16);
				method366(arg4 + 1, arg2 - 1, 1);
			}

			if (arg3 == 3) {
				method366(arg4, arg2, 64);
				method366(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method366(arg4, arg2, 130);
				method366(arg4 - 1, arg2, 8);
				method366(arg4, arg2 + 1, 32);
			}

			if (arg3 == 1) {
				method366(arg4, arg2, 10);
				method366(arg4, arg2 + 1, 32);
				method366(arg4 + 1, arg2, 128);
			}

			if (arg3 == 2) {
				method366(arg4, arg2, 40);
				method366(arg4 + 1, arg2, 128);
				method366(arg4, arg2 - 1, 2);
			}

			if (arg3 == 3) {
				method366(arg4, arg2, 160);
				method366(arg4, arg2 - 1, 2);
				method366(arg4 - 1, arg2, 8);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method366(arg4, arg2, 0x10000);
					method366(arg4 - 1, arg2, 4096);
				}

				if (arg3 == 1) {
					method366(arg4, arg2, 1024);
					method366(arg4, arg2 + 1, 16384);
				}

				if (arg3 == 2) {
					method366(arg4, arg2, 4096);
					method366(arg4 + 1, arg2, 0x10000);
				}

				if (arg3 == 3) {
					method366(arg4, arg2, 16384);
					method366(arg4, arg2 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method366(arg4, arg2, 512);
					method366(arg4 - 1, arg2 + 1, 8192);
				}

				if (arg3 == 1) {
					method366(arg4, arg2, 2048);
					method366(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg3 == 2) {
					method366(arg4, arg2, 8192);
					method366(arg4 + 1, arg2 - 1, 512);
				}

				if (arg3 == 3) {
					method366(arg4, arg2, 32768);
					method366(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method366(arg4, arg2, 66560);
					method366(arg4 - 1, arg2, 4096);
					method366(arg4, arg2 + 1, 16384);
				}

				if (arg3 == 1) {
					method366(arg4, arg2, 5120);
					method366(arg4, arg2 + 1, 16384);
					method366(arg4 + 1, arg2, 0x10000);
				}

				if (arg3 == 2) {
					method366(arg4, arg2, 20480);
					method366(arg4 + 1, arg2, 0x10000);
					method366(arg4, arg2 - 1, 1024);
				}

				if (arg3 == 3) {
					method366(arg4, arg2, 81920);
					method366(arg4, arg2 - 1, 1024);
					method366(arg4 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZIII)V")
	public void method365(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= field937;
		arg4 -= field938;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg5;
			arg5 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field939) {
				for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field940) {
						method366(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method366(int arg0, int arg1, int arg2) {
		field941[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method367(int arg0, int arg1) {
		arg1 -= field937;
		arg0 -= field938;
		field941[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg2) {
			return true;
		}

		arg5 -= field937;
		arg2 -= field938;
		arg4 -= field937;
		arg0 -= field938;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg5 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field941[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field941[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 == arg5 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 + 1 == arg5 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field941[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field941[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 == arg5 && arg0 - 1 == arg2) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg5 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field941[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2 && (field941[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field941[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 - 1 == arg5 && arg0 == arg2) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg2 && (field941[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg4 == arg5 && arg0 + 1 == arg2 && (field941[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg0 - 1 == arg2 && (field941[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg0 == arg2 && (field941[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIBI)Z")
	public boolean method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg1 == arg4) {
			return true;
		}

		arg5 -= field937;
		arg4 -= field938;
		arg0 -= field937;
		arg1 -= field938;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg0 + 1 == arg5 && arg1 == arg4 && (field941[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 - 1 == arg4 && (field941[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 - 1 == arg5 && arg1 == arg4 && (field941[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 - 1 == arg4 && (field941[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg0 - 1 == arg5 && arg1 == arg4 && (field941[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 + 1 == arg4 && (field941[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 + 1 == arg5 && arg1 == arg4 && (field941[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 + 1 == arg4 && (field941[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg5 && arg1 + 1 == arg4 && (field941[arg5][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg1 - 1 == arg4 && (field941[arg5][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg5 && arg1 == arg4 && (field941[arg5][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg5 && arg1 == arg4 && (field941[arg5][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2 - 1;
		int var9 = arg1 + arg4 - 1;
		if (arg6 >= arg0 && arg6 <= var8 && arg5 >= arg1 && arg5 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg5 >= arg1 && arg5 <= var9 && (field941[arg6 - field937][arg5 - field938] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg5 >= arg1 && arg5 <= var9 && (field941[arg6 - field937][arg5 - field938] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg5 && arg6 >= arg0 && arg6 <= var8 && (field941[arg6 - field937][arg5 - field938] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg6 >= arg0 && arg6 <= var8 && (field941[arg6 - field937][arg5 - field938] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
