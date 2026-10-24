package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.f")
	public int field946 = 0;

	@ObfuscatedName("jc.g")
	public int field947 = 0;

	@ObfuscatedName("jc.h")
	public int field948;

	@ObfuscatedName("jc.i")
	public int field949;

	@ObfuscatedName("jc.j")
	public int[][] field950;

	public class62(int arg0, int arg1) {
		field948 = arg0;
		field949 = arg1;
		field950 = new int[field948][field949];
		method353();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method353() {
		for (int var1 = 0; var1 < field948; var1++) {
			for (int var2 = 0; var2 < field949; var2++) {
				if (var1 == 0 || var2 == 0 || field948 - 1 == var1 || field949 - 1 == var2) {
					field950[var1][var2] = 0xFFFFFF;
				} else {
					field950[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIIZ)V")
	public void method354(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field946;
		arg0 -= field947;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method357(arg2, arg0, 128);
				method357(arg2 - 1, arg0, 8);
			}

			if (arg1 == 1) {
				method357(arg2, arg0, 2);
				method357(arg2, arg0 + 1, 32);
			}

			if (arg1 == 2) {
				method357(arg2, arg0, 8);
				method357(arg2 + 1, arg0, 128);
			}

			if (arg1 == 3) {
				method357(arg2, arg0, 32);
				method357(arg2, arg0 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method357(arg2, arg0, 1);
				method357(arg2 - 1, arg0 + 1, 16);
			}

			if (arg1 == 1) {
				method357(arg2, arg0, 4);
				method357(arg2 + 1, arg0 + 1, 64);
			}

			if (arg1 == 2) {
				method357(arg2, arg0, 16);
				method357(arg2 + 1, arg0 - 1, 1);
			}

			if (arg1 == 3) {
				method357(arg2, arg0, 64);
				method357(arg2 - 1, arg0 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method357(arg2, arg0, 130);
				method357(arg2 - 1, arg0, 8);
				method357(arg2, arg0 + 1, 32);
			}

			if (arg1 == 1) {
				method357(arg2, arg0, 10);
				method357(arg2, arg0 + 1, 32);
				method357(arg2 + 1, arg0, 128);
			}

			if (arg1 == 2) {
				method357(arg2, arg0, 40);
				method357(arg2 + 1, arg0, 128);
				method357(arg2, arg0 - 1, 2);
			}

			if (arg1 == 3) {
				method357(arg2, arg0, 160);
				method357(arg2, arg0 - 1, 2);
				method357(arg2 - 1, arg0, 8);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method357(arg2, arg0, 0x10000);
					method357(arg2 - 1, arg0, 4096);
				}

				if (arg1 == 1) {
					method357(arg2, arg0, 1024);
					method357(arg2, arg0 + 1, 16384);
				}

				if (arg1 == 2) {
					method357(arg2, arg0, 4096);
					method357(arg2 + 1, arg0, 0x10000);
				}

				if (arg1 == 3) {
					method357(arg2, arg0, 16384);
					method357(arg2, arg0 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method357(arg2, arg0, 512);
					method357(arg2 - 1, arg0 + 1, 8192);
				}

				if (arg1 == 1) {
					method357(arg2, arg0, 2048);
					method357(arg2 + 1, arg0 + 1, 32768);
				}

				if (arg1 == 2) {
					method357(arg2, arg0, 8192);
					method357(arg2 + 1, arg0 - 1, 512);
				}

				if (arg1 == 3) {
					method357(arg2, arg0, 32768);
					method357(arg2 - 1, arg0 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method357(arg2, arg0, 66560);
					method357(arg2 - 1, arg0, 4096);
					method357(arg2, arg0 + 1, 16384);
				}

				if (arg1 == 1) {
					method357(arg2, arg0, 5120);
					method357(arg2, arg0 + 1, 16384);
					method357(arg2 + 1, arg0, 0x10000);
				}

				if (arg1 == 2) {
					method357(arg2, arg0, 20480);
					method357(arg2 + 1, arg0, 0x10000);
					method357(arg2, arg0 - 1, 1024);
				}

				if (arg1 == 3) {
					method357(arg2, arg0, 81920);
					method357(arg2, arg0 - 1, 1024);
					method357(arg2 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZBI)V")
	public void method355(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg3 -= field946;
		arg0 -= field947;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg2;
			arg2 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
			if (var9 >= 0 && var9 < field948) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field949) {
						method357(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IZI)V")
	public void method356(int arg0, int arg1) {
		arg0 -= field946;
		arg1 -= field947;
		field950[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void method357(int arg0, int arg1, int arg2) {
		field950[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.b(IIIIIZ)V")
	public void method358(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field946;
		arg0 -= field947;
		if (arg3 == 0) {
			if (arg2 == 0) {
				method360(128, arg0, arg1);
				method360(8, arg0, arg1 - 1);
			}

			if (arg2 == 1) {
				method360(2, arg0, arg1);
				method360(32, arg0 + 1, arg1);
			}

			if (arg2 == 2) {
				method360(8, arg0, arg1);
				method360(128, arg0, arg1 + 1);
			}

			if (arg2 == 3) {
				method360(32, arg0, arg1);
				method360(2, arg0 - 1, arg1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				method360(1, arg0, arg1);
				method360(16, arg0 + 1, arg1 - 1);
			}

			if (arg2 == 1) {
				method360(4, arg0, arg1);
				method360(64, arg0 + 1, arg1 + 1);
			}

			if (arg2 == 2) {
				method360(16, arg0, arg1);
				method360(1, arg0 - 1, arg1 + 1);
			}

			if (arg2 == 3) {
				method360(64, arg0, arg1);
				method360(4, arg0 - 1, arg1 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				method360(130, arg0, arg1);
				method360(8, arg0, arg1 - 1);
				method360(32, arg0 + 1, arg1);
			}

			if (arg2 == 1) {
				method360(10, arg0, arg1);
				method360(32, arg0 + 1, arg1);
				method360(128, arg0, arg1 + 1);
			}

			if (arg2 == 2) {
				method360(40, arg0, arg1);
				method360(128, arg0, arg1 + 1);
				method360(2, arg0 - 1, arg1);
			}

			if (arg2 == 3) {
				method360(160, arg0, arg1);
				method360(2, arg0 - 1, arg1);
				method360(8, arg0, arg1 - 1);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					method360(0x10000, arg0, arg1);
					method360(4096, arg0, arg1 - 1);
				}

				if (arg2 == 1) {
					method360(1024, arg0, arg1);
					method360(16384, arg0 + 1, arg1);
				}

				if (arg2 == 2) {
					method360(4096, arg0, arg1);
					method360(0x10000, arg0, arg1 + 1);
				}

				if (arg2 == 3) {
					method360(16384, arg0, arg1);
					method360(1024, arg0 - 1, arg1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					method360(512, arg0, arg1);
					method360(8192, arg0 + 1, arg1 - 1);
				}

				if (arg2 == 1) {
					method360(2048, arg0, arg1);
					method360(32768, arg0 + 1, arg1 + 1);
				}

				if (arg2 == 2) {
					method360(8192, arg0, arg1);
					method360(512, arg0 - 1, arg1 + 1);
				}

				if (arg2 == 3) {
					method360(32768, arg0, arg1);
					method360(2048, arg0 - 1, arg1 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg2 == 0) {
					method360(66560, arg0, arg1);
					method360(4096, arg0, arg1 - 1);
					method360(16384, arg0 + 1, arg1);
				}

				if (arg2 == 1) {
					method360(5120, arg0, arg1);
					method360(16384, arg0 + 1, arg1);
					method360(0x10000, arg0, arg1 + 1);
				}

				if (arg2 == 2) {
					method360(20480, arg0, arg1);
					method360(0x10000, arg0, arg1 + 1);
					method360(1024, arg0 - 1, arg1);
				}

				if (arg2 == 3) {
					method360(81920, arg0, arg1);
					method360(1024, arg0 - 1, arg1);
					method360(4096, arg0, arg1 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIIIZ)V")
	public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg3 -= field946;
		arg1 -= field947;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg2;
			arg2 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
			if (var9 >= 0 && var9 < field948) {
				for (int var10 = arg1; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field949) {
						method360(var7, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method360(int arg0, int arg1, int arg2) {
		field950[arg2][arg1] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void method361(int arg0, int arg1) {
		arg0 -= field946;
		arg1 -= field947;
		field950[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIZIII)Z")
	public boolean method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg2) {
			return true;
		}

		arg3 -= field946;
		arg0 -= field947;
		arg4 -= field946;
		arg2 -= field947;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field950[arg3][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field950[arg3][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg3 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field950[arg3][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field950[arg3][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg3 == arg4 && arg2 - 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field950[arg3][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field950[arg3][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field950[arg3][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field950[arg3][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg3 == arg4 && arg2 + 1 == arg0 && (field950[arg3][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg2 - 1 == arg0 && (field950[arg3][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg3 && arg0 == arg2 && (field950[arg3][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg3) {
			return true;
		}

		arg0 -= field946;
		arg1 -= field947;
		arg4 -= field946;
		arg3 -= field947;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg4 + 1 == arg0 && arg1 == arg3 && (field950[arg0][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field950[arg0][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg4 - 1 == arg0 && arg1 == arg3 && (field950[arg0][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field950[arg0][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 - 1 == arg0 && arg1 == arg3 && (field950[arg0][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field950[arg0][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg4 + 1 == arg0 && arg1 == arg3 && (field950[arg0][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field950[arg0][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg4 && arg3 + 1 == arg1 && (field950[arg0][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg3 - 1 == arg1 && (field950[arg0][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg1 == arg3 && (field950[arg0][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg1 == arg3 && (field950[arg0][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg2 + arg6 - 1;
		if (arg1 >= arg0 && arg1 <= var8 && arg4 >= arg2 && arg4 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg1 && arg4 >= arg2 && arg4 <= var9 && (field950[arg1 - field946][arg4 - field947] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg4 >= arg2 && arg4 <= var9 && (field950[arg1 - field946][arg4 - field947] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg4 && arg1 >= arg0 && arg1 <= var8 && (field950[arg1 - field946][arg4 - field947] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg1 >= arg0 && arg1 <= var8 && (field950[arg1 - field946][arg4 - field947] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
