package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.f")
	public int field804 = 0;

	@ObfuscatedName("ec.g")
	public int field805 = 0;

	@ObfuscatedName("ec.h")
	public int field806;

	@ObfuscatedName("ec.i")
	public int field807;

	@ObfuscatedName("ec.j")
	public int[][] field808;

	public class57(int arg0, int arg1) {
		field806 = arg1;
		field807 = arg0;
		field808 = new int[field806][field807];
		method295();
	}

	@ObfuscatedName("ec.a(I)V")
	public void method295() {
		for (int var1 = 0; var1 < field806; var1++) {
			for (int var2 = 0; var2 < field807; var2++) {
				if (var1 == 0 || var2 == 0 || field806 - 1 == var1 || field807 - 1 == var2) {
					field808[var1][var2] = 0xFFFFFF;
				} else {
					field808[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(ZIIZII)V")
	public void method296(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field804;
		arg2 -= field805;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method299(arg3, arg2, 128);
				method299(arg3 - 1, arg2, 8);
			}

			if (arg1 == 1) {
				method299(arg3, arg2, 2);
				method299(arg3, arg2 + 1, 32);
			}

			if (arg1 == 2) {
				method299(arg3, arg2, 8);
				method299(arg3 + 1, arg2, 128);
			}

			if (arg1 == 3) {
				method299(arg3, arg2, 32);
				method299(arg3, arg2 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method299(arg3, arg2, 1);
				method299(arg3 - 1, arg2 + 1, 16);
			}

			if (arg1 == 1) {
				method299(arg3, arg2, 4);
				method299(arg3 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method299(arg3, arg2, 16);
				method299(arg3 + 1, arg2 - 1, 1);
			}

			if (arg1 == 3) {
				method299(arg3, arg2, 64);
				method299(arg3 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method299(arg3, arg2, 130);
				method299(arg3 - 1, arg2, 8);
				method299(arg3, arg2 + 1, 32);
			}

			if (arg1 == 1) {
				method299(arg3, arg2, 10);
				method299(arg3, arg2 + 1, 32);
				method299(arg3 + 1, arg2, 128);
			}

			if (arg1 == 2) {
				method299(arg3, arg2, 40);
				method299(arg3 + 1, arg2, 128);
				method299(arg3, arg2 - 1, 2);
			}

			if (arg1 == 3) {
				method299(arg3, arg2, 160);
				method299(arg3, arg2 - 1, 2);
				method299(arg3 - 1, arg2, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method299(arg3, arg2, 0x10000);
					method299(arg3 - 1, arg2, 4096);
				}

				if (arg1 == 1) {
					method299(arg3, arg2, 1024);
					method299(arg3, arg2 + 1, 16384);
				}

				if (arg1 == 2) {
					method299(arg3, arg2, 4096);
					method299(arg3 + 1, arg2, 0x10000);
				}

				if (arg1 == 3) {
					method299(arg3, arg2, 16384);
					method299(arg3, arg2 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method299(arg3, arg2, 512);
					method299(arg3 - 1, arg2 + 1, 8192);
				}

				if (arg1 == 1) {
					method299(arg3, arg2, 2048);
					method299(arg3 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method299(arg3, arg2, 8192);
					method299(arg3 + 1, arg2 - 1, 512);
				}

				if (arg1 == 3) {
					method299(arg3, arg2, 32768);
					method299(arg3 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method299(arg3, arg2, 66560);
					method299(arg3 - 1, arg2, 4096);
					method299(arg3, arg2 + 1, 16384);
				}

				if (arg1 == 1) {
					method299(arg3, arg2, 5120);
					method299(arg3, arg2 + 1, 16384);
					method299(arg3 + 1, arg2, 0x10000);
				}

				if (arg1 == 2) {
					method299(arg3, arg2, 20480);
					method299(arg3 + 1, arg2, 0x10000);
					method299(arg3, arg2 - 1, 1024);
				}

				if (arg1 == 3) {
					method299(arg3, arg2, 81920);
					method299(arg3, arg2 - 1, 1024);
					method299(arg3 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(ZIIIIII)V")
	public void method297(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg1 -= field804;
		arg5 -= field805;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field806) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field807) {
						method299(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(III)V")
	public void method298(int arg0, int arg1) {
		arg1 -= field804;
		arg0 -= field805;
		field808[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("ec.b(III)V")
	public void method299(int arg0, int arg1, int arg2) {
		field808[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(ZIIIII)V")
	public void method300(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field804;
		arg1 -= field805;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method302(arg3, 128, arg1);
				method302(arg3 - 1, 8, arg1);
			}

			if (arg4 == 1) {
				method302(arg3, 2, arg1);
				method302(arg3, 32, arg1 + 1);
			}

			if (arg4 == 2) {
				method302(arg3, 8, arg1);
				method302(arg3 + 1, 128, arg1);
			}

			if (arg4 == 3) {
				method302(arg3, 32, arg1);
				method302(arg3, 2, arg1 - 1);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method302(arg3, 1, arg1);
				method302(arg3 - 1, 16, arg1 + 1);
			}

			if (arg4 == 1) {
				method302(arg3, 4, arg1);
				method302(arg3 + 1, 64, arg1 + 1);
			}

			if (arg4 == 2) {
				method302(arg3, 16, arg1);
				method302(arg3 + 1, 1, arg1 - 1);
			}

			if (arg4 == 3) {
				method302(arg3, 64, arg1);
				method302(arg3 - 1, 4, arg1 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method302(arg3, 130, arg1);
				method302(arg3 - 1, 8, arg1);
				method302(arg3, 32, arg1 + 1);
			}

			if (arg4 == 1) {
				method302(arg3, 10, arg1);
				method302(arg3, 32, arg1 + 1);
				method302(arg3 + 1, 128, arg1);
			}

			if (arg4 == 2) {
				method302(arg3, 40, arg1);
				method302(arg3 + 1, 128, arg1);
				method302(arg3, 2, arg1 - 1);
			}

			if (arg4 == 3) {
				method302(arg3, 160, arg1);
				method302(arg3, 2, arg1 - 1);
				method302(arg3 - 1, 8, arg1);
			}
		}

		if (arg0) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method302(arg3, 0x10000, arg1);
					method302(arg3 - 1, 4096, arg1);
				}

				if (arg4 == 1) {
					method302(arg3, 1024, arg1);
					method302(arg3, 16384, arg1 + 1);
				}

				if (arg4 == 2) {
					method302(arg3, 4096, arg1);
					method302(arg3 + 1, 0x10000, arg1);
				}

				if (arg4 == 3) {
					method302(arg3, 16384, arg1);
					method302(arg3, 1024, arg1 - 1);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method302(arg3, 512, arg1);
					method302(arg3 - 1, 8192, arg1 + 1);
				}

				if (arg4 == 1) {
					method302(arg3, 2048, arg1);
					method302(arg3 + 1, 32768, arg1 + 1);
				}

				if (arg4 == 2) {
					method302(arg3, 8192, arg1);
					method302(arg3 + 1, 512, arg1 - 1);
				}

				if (arg4 == 3) {
					method302(arg3, 32768, arg1);
					method302(arg3 - 1, 2048, arg1 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method302(arg3, 66560, arg1);
					method302(arg3 - 1, 4096, arg1);
					method302(arg3, 16384, arg1 + 1);
				}

				if (arg4 == 1) {
					method302(arg3, 5120, arg1);
					method302(arg3, 16384, arg1 + 1);
					method302(arg3 + 1, 0x10000, arg1);
				}

				if (arg4 == 2) {
					method302(arg3, 20480, arg1);
					method302(arg3 + 1, 0x10000, arg1);
					method302(arg3, 1024, arg1 - 1);
				}

				if (arg4 == 3) {
					method302(arg3, 81920, arg1);
					method302(arg3, 1024, arg1 - 1);
					method302(arg3 - 1, 4096, arg1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIZI)V")
	public void method301(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg2 -= field804;
		arg3 -= field805;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg1;
			arg1 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg2; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field806) {
				for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field807) {
						method302(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIII)V")
	public void method302(int arg0, int arg1, int arg2) {
		field808[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("ec.c(III)V")
	public void method303(int arg0, int arg1) {
		arg1 -= field804;
		arg0 -= field805;
		field808[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(IIIIIII)Z")
	public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg0 == arg2) {
			return true;
		}

		arg4 -= field804;
		arg2 -= field805;
		arg1 -= field804;
		arg0 -= field805;
		if (arg5 == 0) {
			if (arg3 == 0) {
				if (arg1 - 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2 && (field808[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2 && (field808[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 == arg4 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 + 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2 && (field808[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2 && (field808[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 == arg4 && arg0 - 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg3 == 0) {
				if (arg1 - 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2 && (field808[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2 && (field808[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2 && (field808[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 - 1 == arg4 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2 && (field808[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg1 == arg4 && arg0 + 1 == arg2 && (field808[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg0 - 1 == arg2 && (field808[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg4 && arg0 == arg2 && (field808[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIBIIII)Z")
	public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg3) {
			return true;
		}

		arg4 -= field804;
		arg1 -= field805;
		arg0 -= field804;
		arg3 -= field805;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg0 + 1 == arg4 && arg1 == arg3 && (field808[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field808[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 - 1 == arg4 && arg1 == arg3 && (field808[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field808[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg0 - 1 == arg4 && arg1 == arg3 && (field808[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field808[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 + 1 == arg4 && arg1 == arg3 && (field808[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field808[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg4 && arg3 + 1 == arg1 && (field808[arg4][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg3 - 1 == arg1 && (field808[arg4][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg1 == arg3 && (field808[arg4][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg1 == arg3 && (field808[arg4][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIIII)Z")
	public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg6 - 1;
		int var9 = arg2 + arg5 - 1;
		if (arg0 >= arg3 && arg0 <= var8 && arg1 >= arg2 && arg1 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg0 && arg1 >= arg2 && arg1 <= var9 && (field808[arg0 - field804][arg1 - field805] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg0 && arg1 >= arg2 && arg1 <= var9 && (field808[arg0 - field804][arg1 - field805] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg0 >= arg3 && arg0 <= var8 && (field808[arg0 - field804][arg1 - field805] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg0 >= arg3 && arg0 <= var8 && (field808[arg0 - field804][arg1 - field805] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
