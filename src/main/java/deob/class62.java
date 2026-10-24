package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.f")
	public int field943 = 0;

	@ObfuscatedName("jc.g")
	public int field944 = 0;

	@ObfuscatedName("jc.h")
	public int field945;

	@ObfuscatedName("jc.i")
	public int field946;

	@ObfuscatedName("jc.j")
	public int[][] field947;

	public class62(int arg0, int arg1) {
		field945 = arg1;
		field946 = arg0;
		field947 = new int[field945][field946];
		method352();
	}

	@ObfuscatedName("jc.a(Z)V")
	public void method352() {
		for (int var1 = 0; var1 < field945; var1++) {
			for (int var2 = 0; var2 < field946; var2++) {
				if (var1 == 0 || var2 == 0 || field945 - 1 == var1 || field946 - 1 == var2) {
					field947[var1][var2] = 0xFFFFFF;
				} else {
					field947[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZIII)V")
	public void method353(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg4 -= field943;
		arg3 -= field944;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method356(arg4, arg3, 128);
				method356(arg4 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method356(arg4, arg3, 2);
				method356(arg4, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method356(arg4, arg3, 8);
				method356(arg4 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method356(arg4, arg3, 32);
				method356(arg4, arg3 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method356(arg4, arg3, 1);
				method356(arg4 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method356(arg4, arg3, 4);
				method356(arg4 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method356(arg4, arg3, 16);
				method356(arg4 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method356(arg4, arg3, 64);
				method356(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method356(arg4, arg3, 130);
				method356(arg4 - 1, arg3, 8);
				method356(arg4, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method356(arg4, arg3, 10);
				method356(arg4, arg3 + 1, 32);
				method356(arg4 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method356(arg4, arg3, 40);
				method356(arg4 + 1, arg3, 128);
				method356(arg4, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method356(arg4, arg3, 160);
				method356(arg4, arg3 - 1, 2);
				method356(arg4 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method356(arg4, arg3, 0x10000);
					method356(arg4 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method356(arg4, arg3, 1024);
					method356(arg4, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method356(arg4, arg3, 4096);
					method356(arg4 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method356(arg4, arg3, 16384);
					method356(arg4, arg3 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method356(arg4, arg3, 512);
					method356(arg4 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method356(arg4, arg3, 2048);
					method356(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method356(arg4, arg3, 8192);
					method356(arg4 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method356(arg4, arg3, 32768);
					method356(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method356(arg4, arg3, 66560);
					method356(arg4 - 1, arg3, 4096);
					method356(arg4, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method356(arg4, arg3, 5120);
					method356(arg4, arg3 + 1, 16384);
					method356(arg4 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method356(arg4, arg3, 20480);
					method356(arg4 + 1, arg3, 0x10000);
					method356(arg4, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method356(arg4, arg3, 81920);
					method356(arg4, arg3 - 1, 1024);
					method356(arg4 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZIIII)V")
	public void method354(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg0 -= field943;
		arg1 -= field944;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg3;
			arg3 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field945) {
				for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field946) {
						method356(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void method355(int arg0, int arg1) {
		arg0 -= field943;
		arg1 -= field944;
		field947[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void method356(int arg0, int arg1, int arg2) {
		field947[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIIZ)V")
	public void method357(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field943;
		arg3 -= field944;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method359(arg3, 128, arg1);
				method359(arg3, 8, arg1 - 1);
			}

			if (arg2 == 1) {
				method359(arg3, 2, arg1);
				method359(arg3 + 1, 32, arg1);
			}

			if (arg2 == 2) {
				method359(arg3, 8, arg1);
				method359(arg3, 128, arg1 + 1);
			}

			if (arg2 == 3) {
				method359(arg3, 32, arg1);
				method359(arg3 - 1, 2, arg1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method359(arg3, 1, arg1);
				method359(arg3 + 1, 16, arg1 - 1);
			}

			if (arg2 == 1) {
				method359(arg3, 4, arg1);
				method359(arg3 + 1, 64, arg1 + 1);
			}

			if (arg2 == 2) {
				method359(arg3, 16, arg1);
				method359(arg3 - 1, 1, arg1 + 1);
			}

			if (arg2 == 3) {
				method359(arg3, 64, arg1);
				method359(arg3 - 1, 4, arg1 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method359(arg3, 130, arg1);
				method359(arg3, 8, arg1 - 1);
				method359(arg3 + 1, 32, arg1);
			}

			if (arg2 == 1) {
				method359(arg3, 10, arg1);
				method359(arg3 + 1, 32, arg1);
				method359(arg3, 128, arg1 + 1);
			}

			if (arg2 == 2) {
				method359(arg3, 40, arg1);
				method359(arg3, 128, arg1 + 1);
				method359(arg3 - 1, 2, arg1);
			}

			if (arg2 == 3) {
				method359(arg3, 160, arg1);
				method359(arg3 - 1, 2, arg1);
				method359(arg3, 8, arg1 - 1);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method359(arg3, 0x10000, arg1);
					method359(arg3, 4096, arg1 - 1);
				}

				if (arg2 == 1) {
					method359(arg3, 1024, arg1);
					method359(arg3 + 1, 16384, arg1);
				}

				if (arg2 == 2) {
					method359(arg3, 4096, arg1);
					method359(arg3, 0x10000, arg1 + 1);
				}

				if (arg2 == 3) {
					method359(arg3, 16384, arg1);
					method359(arg3 - 1, 1024, arg1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method359(arg3, 512, arg1);
					method359(arg3 + 1, 8192, arg1 - 1);
				}

				if (arg2 == 1) {
					method359(arg3, 2048, arg1);
					method359(arg3 + 1, 32768, arg1 + 1);
				}

				if (arg2 == 2) {
					method359(arg3, 8192, arg1);
					method359(arg3 - 1, 512, arg1 + 1);
				}

				if (arg2 == 3) {
					method359(arg3, 32768, arg1);
					method359(arg3 - 1, 2048, arg1 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method359(arg3, 66560, arg1);
					method359(arg3, 4096, arg1 - 1);
					method359(arg3 + 1, 16384, arg1);
				}

				if (arg2 == 1) {
					method359(arg3, 5120, arg1);
					method359(arg3 + 1, 16384, arg1);
					method359(arg3, 0x10000, arg1 + 1);
				}

				if (arg2 == 2) {
					method359(arg3, 20480, arg1);
					method359(arg3, 0x10000, arg1 + 1);
					method359(arg3 - 1, 1024, arg1);
				}

				if (arg2 == 3) {
					method359(arg3, 81920, arg1);
					method359(arg3 - 1, 1024, arg1);
					method359(arg3, 4096, arg1 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZIIIIZI)V")
	public void method358(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg3 -= field943;
		arg0 -= field944;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field945) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field946) {
						method359(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method359(int arg0, int arg1, int arg2) {
		field947[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method360(int arg0, int arg1) {
		arg1 -= field943;
		arg0 -= field944;
		field947[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg4 == arg5) {
			return true;
		}

		arg0 -= field943;
		arg4 -= field944;
		arg1 -= field943;
		arg5 -= field944;
		if (arg3 == 0) {
			if (arg2 == 0) {
				if (arg1 - 1 == arg0 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4 && (field947[arg0][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4 && (field947[arg0][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 == arg1 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg1 - 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 + 1 == arg0 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4 && (field947[arg0][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4 && (field947[arg0][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 == arg1 && arg5 - 1 == arg4) {
					return true;
				}

				if (arg1 - 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				if (arg1 - 1 == arg0 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4 && (field947[arg0][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 - 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4 && (field947[arg0][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 - 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4 && (field947[arg0][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 - 1 == arg0 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg4 && (field947[arg0][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg0 == arg1 && arg5 + 1 == arg4 && (field947[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg5 - 1 == arg4 && (field947[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg0 && arg4 == arg5 && (field947[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIZII)Z")
	public boolean method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg1 == arg3) {
			return true;
		}

		arg0 -= field943;
		arg1 -= field944;
		arg5 -= field943;
		arg3 -= field944;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg5 + 1 == arg0 && arg1 == arg3 && (field947[arg0][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg1 && (field947[arg0][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg5 - 1 == arg0 && arg1 == arg3 && (field947[arg0][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg1 && (field947[arg0][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 - 1 == arg0 && arg1 == arg3 && (field947[arg0][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg1 && (field947[arg0][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg5 + 1 == arg0 && arg1 == arg3 && (field947[arg0][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg1 && (field947[arg0][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg0 == arg5 && arg3 + 1 == arg1 && (field947[arg0][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg3 - 1 == arg1 && (field947[arg0][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg0 && arg1 == arg3 && (field947[arg0][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg0 && arg1 == arg3 && (field947[arg0][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg2 + arg6 - 1;
		if (arg5 >= arg3 && arg5 <= var8 && arg1 >= arg2 && arg1 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg5 && arg1 >= arg2 && arg1 <= var9 && (field947[arg5 - field943][arg1 - field944] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg1 >= arg2 && arg1 <= var9 && (field947[arg5 - field943][arg1 - field944] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg5 >= arg3 && arg5 <= var8 && (field947[arg5 - field943][arg1 - field944] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg5 >= arg3 && arg5 <= var8 && (field947[arg5 - field943][arg1 - field944] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
