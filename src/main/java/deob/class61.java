package deob;

@ObfuscatedName("ic")
public class class61 {

	@ObfuscatedName("ic.f")
	public int field910 = 0;

	@ObfuscatedName("ic.g")
	public int field911 = 0;

	@ObfuscatedName("ic.h")
	public int field912;

	@ObfuscatedName("ic.i")
	public int field913;

	@ObfuscatedName("ic.j")
	public int[][] field914;

	public class61(int arg0, int arg1) {
		field912 = arg1;
		field913 = arg0;
		field914 = new int[field912][field913];
		method350();
	}

	@ObfuscatedName("ic.a(I)V")
	public void method350() {
		for (int var1 = 0; var1 < field912; var1++) {
			for (int var2 = 0; var2 < field913; var2++) {
				if (var1 == 0 || var2 == 0 || field912 - 1 == var1 || field913 - 1 == var2) {
					field914[var1][var2] = 0xFFFFFF;
				} else {
					field914[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IIIIIZ)V")
	public void method351(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field910;
		arg2 -= field911;
		if (arg1 == 0) {
			if (arg0 == 0) {
				method354(arg3, arg2, 128);
				method354(arg3 - 1, arg2, 8);
			}

			if (arg0 == 1) {
				method354(arg3, arg2, 2);
				method354(arg3, arg2 + 1, 32);
			}

			if (arg0 == 2) {
				method354(arg3, arg2, 8);
				method354(arg3 + 1, arg2, 128);
			}

			if (arg0 == 3) {
				method354(arg3, arg2, 32);
				method354(arg3, arg2 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				method354(arg3, arg2, 1);
				method354(arg3 - 1, arg2 + 1, 16);
			}

			if (arg0 == 1) {
				method354(arg3, arg2, 4);
				method354(arg3 + 1, arg2 + 1, 64);
			}

			if (arg0 == 2) {
				method354(arg3, arg2, 16);
				method354(arg3 + 1, arg2 - 1, 1);
			}

			if (arg0 == 3) {
				method354(arg3, arg2, 64);
				method354(arg3 - 1, arg2 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg0 == 0) {
				method354(arg3, arg2, 130);
				method354(arg3 - 1, arg2, 8);
				method354(arg3, arg2 + 1, 32);
			}

			if (arg0 == 1) {
				method354(arg3, arg2, 10);
				method354(arg3, arg2 + 1, 32);
				method354(arg3 + 1, arg2, 128);
			}

			if (arg0 == 2) {
				method354(arg3, arg2, 40);
				method354(arg3 + 1, arg2, 128);
				method354(arg3, arg2 - 1, 2);
			}

			if (arg0 == 3) {
				method354(arg3, arg2, 160);
				method354(arg3, arg2 - 1, 2);
				method354(arg3 - 1, arg2, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					method354(arg3, arg2, 0x10000);
					method354(arg3 - 1, arg2, 4096);
				}

				if (arg0 == 1) {
					method354(arg3, arg2, 1024);
					method354(arg3, arg2 + 1, 16384);
				}

				if (arg0 == 2) {
					method354(arg3, arg2, 4096);
					method354(arg3 + 1, arg2, 0x10000);
				}

				if (arg0 == 3) {
					method354(arg3, arg2, 16384);
					method354(arg3, arg2 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					method354(arg3, arg2, 512);
					method354(arg3 - 1, arg2 + 1, 8192);
				}

				if (arg0 == 1) {
					method354(arg3, arg2, 2048);
					method354(arg3 + 1, arg2 + 1, 32768);
				}

				if (arg0 == 2) {
					method354(arg3, arg2, 8192);
					method354(arg3 + 1, arg2 - 1, 512);
				}

				if (arg0 == 3) {
					method354(arg3, arg2, 32768);
					method354(arg3 - 1, arg2 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg0 == 0) {
					method354(arg3, arg2, 66560);
					method354(arg3 - 1, arg2, 4096);
					method354(arg3, arg2 + 1, 16384);
				}

				if (arg0 == 1) {
					method354(arg3, arg2, 5120);
					method354(arg3, arg2 + 1, 16384);
					method354(arg3 + 1, arg2, 0x10000);
				}

				if (arg0 == 2) {
					method354(arg3, arg2, 20480);
					method354(arg3 + 1, arg2, 0x10000);
					method354(arg3, arg2 - 1, 1024);
				}

				if (arg0 == 3) {
					method354(arg3, arg2, 81920);
					method354(arg3, arg2 - 1, 1024);
					method354(arg3 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IIZIIII)V")
	public void method352(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg0 -= field910;
		arg5 -= field911;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field912) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field913) {
						method354(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IZI)V")
	public void method353(int arg0, int arg1) {
		arg0 -= field910;
		arg1 -= field911;
		field914[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ic.a(III)V")
	public void method354(int arg0, int arg1, int arg2) {
		field914[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ic.a(ZIIIII)V")
	public void method355(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field910;
		arg4 -= field911;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method357(arg4, arg3, 128);
				method357(arg4, arg3 - 1, 8);
			}

			if (arg2 == 1) {
				method357(arg4, arg3, 2);
				method357(arg4 + 1, arg3, 32);
			}

			if (arg2 == 2) {
				method357(arg4, arg3, 8);
				method357(arg4, arg3 + 1, 128);
			}

			if (arg2 == 3) {
				method357(arg4, arg3, 32);
				method357(arg4 - 1, arg3, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method357(arg4, arg3, 1);
				method357(arg4 + 1, arg3 - 1, 16);
			}

			if (arg2 == 1) {
				method357(arg4, arg3, 4);
				method357(arg4 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method357(arg4, arg3, 16);
				method357(arg4 - 1, arg3 + 1, 1);
			}

			if (arg2 == 3) {
				method357(arg4, arg3, 64);
				method357(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method357(arg4, arg3, 130);
				method357(arg4, arg3 - 1, 8);
				method357(arg4 + 1, arg3, 32);
			}

			if (arg2 == 1) {
				method357(arg4, arg3, 10);
				method357(arg4 + 1, arg3, 32);
				method357(arg4, arg3 + 1, 128);
			}

			if (arg2 == 2) {
				method357(arg4, arg3, 40);
				method357(arg4, arg3 + 1, 128);
				method357(arg4 - 1, arg3, 2);
			}

			if (arg2 == 3) {
				method357(arg4, arg3, 160);
				method357(arg4 - 1, arg3, 2);
				method357(arg4, arg3 - 1, 8);
			}
		}

		if (arg0) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method357(arg4, arg3, 0x10000);
					method357(arg4, arg3 - 1, 4096);
				}

				if (arg2 == 1) {
					method357(arg4, arg3, 1024);
					method357(arg4 + 1, arg3, 16384);
				}

				if (arg2 == 2) {
					method357(arg4, arg3, 4096);
					method357(arg4, arg3 + 1, 0x10000);
				}

				if (arg2 == 3) {
					method357(arg4, arg3, 16384);
					method357(arg4 - 1, arg3, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method357(arg4, arg3, 512);
					method357(arg4 + 1, arg3 - 1, 8192);
				}

				if (arg2 == 1) {
					method357(arg4, arg3, 2048);
					method357(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method357(arg4, arg3, 8192);
					method357(arg4 - 1, arg3 + 1, 512);
				}

				if (arg2 == 3) {
					method357(arg4, arg3, 32768);
					method357(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method357(arg4, arg3, 66560);
					method357(arg4, arg3 - 1, 4096);
					method357(arg4 + 1, arg3, 16384);
				}

				if (arg2 == 1) {
					method357(arg4, arg3, 5120);
					method357(arg4 + 1, arg3, 16384);
					method357(arg4, arg3 + 1, 0x10000);
				}

				if (arg2 == 2) {
					method357(arg4, arg3, 20480);
					method357(arg4, arg3 + 1, 0x10000);
					method357(arg4 - 1, arg3, 1024);
				}

				if (arg2 == 3) {
					method357(arg4, arg3, 81920);
					method357(arg4 - 1, arg3, 1024);
					method357(arg4, arg3 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IBIZIII)V")
	public void method356(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg3 -= field910;
		arg5 -= field911;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg0;
			arg0 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field912) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field913) {
						method357(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IIII)V")
	public void method357(int arg0, int arg1, int arg2) {
		field914[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ic.b(III)V")
	public void method358(int arg0, int arg1) {
		arg1 -= field910;
		arg0 -= field911;
		field914[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ic.a(IIIIIII)Z")
	public boolean method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg3) {
			return true;
		}

		arg4 -= field910;
		arg3 -= field911;
		arg5 -= field910;
		arg0 -= field911;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (arg5 - 1 == arg4 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field914[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field914[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 == arg5 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg5 - 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 + 1 == arg4 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field914[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field914[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 == arg5 && arg0 - 1 == arg3) {
					return true;
				}

				if (arg5 - 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				if (arg5 - 1 == arg4 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field914[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg5 - 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field914[arg4][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 - 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field914[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg5 - 1 == arg4 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field914[arg4][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg4 == arg5 && arg0 + 1 == arg3 && (field914[arg4][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg0 - 1 == arg3 && (field914[arg4][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg4 && arg0 == arg3 && (field914[arg4][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ic.a(IIIIZII)Z")
	public boolean method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg0 == arg1) {
			return true;
		}

		arg5 -= field910;
		arg0 -= field911;
		arg3 -= field910;
		arg1 -= field911;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg3 + 1 == arg5 && arg0 == arg1 && (field914[arg5][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg0 && (field914[arg5][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg3 - 1 == arg5 && arg0 == arg1 && (field914[arg5][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg0 && (field914[arg5][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 - 1 == arg5 && arg0 == arg1 && (field914[arg5][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg0 && (field914[arg5][arg0] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg3 + 1 == arg5 && arg0 == arg1 && (field914[arg5][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg0 && (field914[arg5][arg0] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg3 == arg5 && arg1 + 1 == arg0 && (field914[arg5][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg1 - 1 == arg0 && (field914[arg5][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg0 == arg1 && (field914[arg5][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg0 == arg1 && (field914[arg5][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ic.a(IIIIIBII)Z")
	public boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg5 - 1;
		int var9 = arg3 + arg6 - 1;
		if (arg0 >= arg2 && arg0 <= var8 && arg4 >= arg3 && arg4 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg0 && arg4 >= arg3 && arg4 <= var9 && (field914[arg0 - field910][arg4 - field911] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg0 && arg4 >= arg3 && arg4 <= var9 && (field914[arg0 - field910][arg4 - field911] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg4 && arg0 >= arg2 && arg0 <= var8 && (field914[arg0 - field910][arg4 - field911] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg0 >= arg2 && arg0 <= var8 && (field914[arg0 - field910][arg4 - field911] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
