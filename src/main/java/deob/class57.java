package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.g")
	public int field804 = 0;

	@ObfuscatedName("ec.h")
	public int field805 = 0;

	@ObfuscatedName("ec.i")
	public int field806;

	@ObfuscatedName("ec.j")
	public int field807;

	@ObfuscatedName("ec.k")
	public int[][] field808;

	public class57(int arg0, int arg1) {
		field806 = arg1;
		field807 = arg0;
		field808 = new int[field806][field807];
		method295();
	}

	@ObfuscatedName("ec.a(Z)V")
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

	@ObfuscatedName("ec.a(IIZIBI)V")
	public void method296(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field804;
		arg3 -= field805;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method299(arg0, arg3, 128);
				method299(arg0 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method299(arg0, arg3, 2);
				method299(arg0, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method299(arg0, arg3, 8);
				method299(arg0 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method299(arg0, arg3, 32);
				method299(arg0, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method299(arg0, arg3, 1);
				method299(arg0 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method299(arg0, arg3, 4);
				method299(arg0 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method299(arg0, arg3, 16);
				method299(arg0 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method299(arg0, arg3, 64);
				method299(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method299(arg0, arg3, 130);
				method299(arg0 - 1, arg3, 8);
				method299(arg0, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method299(arg0, arg3, 10);
				method299(arg0, arg3 + 1, 32);
				method299(arg0 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method299(arg0, arg3, 40);
				method299(arg0 + 1, arg3, 128);
				method299(arg0, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method299(arg0, arg3, 160);
				method299(arg0, arg3 - 1, 2);
				method299(arg0 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method299(arg0, arg3, 0x10000);
					method299(arg0 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method299(arg0, arg3, 1024);
					method299(arg0, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method299(arg0, arg3, 4096);
					method299(arg0 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method299(arg0, arg3, 16384);
					method299(arg0, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method299(arg0, arg3, 512);
					method299(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method299(arg0, arg3, 2048);
					method299(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method299(arg0, arg3, 8192);
					method299(arg0 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method299(arg0, arg3, 32768);
					method299(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method299(arg0, arg3, 66560);
					method299(arg0 - 1, arg3, 4096);
					method299(arg0, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method299(arg0, arg3, 5120);
					method299(arg0, arg3 + 1, 16384);
					method299(arg0 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method299(arg0, arg3, 20480);
					method299(arg0 + 1, arg3, 0x10000);
					method299(arg0, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method299(arg0, arg3, 81920);
					method299(arg0, arg3 - 1, 1024);
					method299(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IZIIIII)V")
	public void method297(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg2 -= field804;
		arg4 -= field805;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field806) {
				for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field807) {
						method299(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(III)V")
	public void method298(int arg0, int arg1) {
		arg0 -= field804;
		arg1 -= field805;
		field808[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ec.b(III)V")
	public void method299(int arg0, int arg1, int arg2) {
		field808[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(IIIIZI)V")
	public void method300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field804;
		arg0 -= field805;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method302(128, arg2, arg0);
				method302(8, arg2 - 1, arg0);
			}

			if (arg1 == 1) {
				method302(2, arg2, arg0);
				method302(32, arg2, arg0 + 1);
			}

			if (arg1 == 2) {
				method302(8, arg2, arg0);
				method302(128, arg2 + 1, arg0);
			}

			if (arg1 == 3) {
				method302(32, arg2, arg0);
				method302(2, arg2, arg0 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method302(1, arg2, arg0);
				method302(16, arg2 - 1, arg0 + 1);
			}

			if (arg1 == 1) {
				method302(4, arg2, arg0);
				method302(64, arg2 + 1, arg0 + 1);
			}

			if (arg1 == 2) {
				method302(16, arg2, arg0);
				method302(1, arg2 + 1, arg0 - 1);
			}

			if (arg1 == 3) {
				method302(64, arg2, arg0);
				method302(4, arg2 - 1, arg0 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method302(130, arg2, arg0);
				method302(8, arg2 - 1, arg0);
				method302(32, arg2, arg0 + 1);
			}

			if (arg1 == 1) {
				method302(10, arg2, arg0);
				method302(32, arg2, arg0 + 1);
				method302(128, arg2 + 1, arg0);
			}

			if (arg1 == 2) {
				method302(40, arg2, arg0);
				method302(128, arg2 + 1, arg0);
				method302(2, arg2, arg0 - 1);
			}

			if (arg1 == 3) {
				method302(160, arg2, arg0);
				method302(2, arg2, arg0 - 1);
				method302(8, arg2 - 1, arg0);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method302(0x10000, arg2, arg0);
					method302(4096, arg2 - 1, arg0);
				}

				if (arg1 == 1) {
					method302(1024, arg2, arg0);
					method302(16384, arg2, arg0 + 1);
				}

				if (arg1 == 2) {
					method302(4096, arg2, arg0);
					method302(0x10000, arg2 + 1, arg0);
				}

				if (arg1 == 3) {
					method302(16384, arg2, arg0);
					method302(1024, arg2, arg0 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method302(512, arg2, arg0);
					method302(8192, arg2 - 1, arg0 + 1);
				}

				if (arg1 == 1) {
					method302(2048, arg2, arg0);
					method302(32768, arg2 + 1, arg0 + 1);
				}

				if (arg1 == 2) {
					method302(8192, arg2, arg0);
					method302(512, arg2 + 1, arg0 - 1);
				}

				if (arg1 == 3) {
					method302(32768, arg2, arg0);
					method302(2048, arg2 - 1, arg0 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method302(66560, arg2, arg0);
					method302(4096, arg2 - 1, arg0);
					method302(16384, arg2, arg0 + 1);
				}

				if (arg1 == 1) {
					method302(5120, arg2, arg0);
					method302(16384, arg2, arg0 + 1);
					method302(0x10000, arg2 + 1, arg0);
				}

				if (arg1 == 2) {
					method302(20480, arg2, arg0);
					method302(0x10000, arg2 + 1, arg0);
					method302(1024, arg2, arg0 - 1);
				}

				if (arg1 == 3) {
					method302(81920, arg2, arg0);
					method302(1024, arg2, arg0 - 1);
					method302(4096, arg2 - 1, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIZII)V")
	public void method301(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field804;
		arg3 -= field805;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field806) {
				for (int var10 = arg3; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < field807) {
						method302(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIII)V")
	public void method302(int arg0, int arg1, int arg2) {
		field808[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("ec.a(BII)V")
	public void method303(int arg0, int arg1) {
		arg1 -= field804;
		arg0 -= field805;
		field808[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(IIIIIZI)Z")
	public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg3) {
			return true;
		}

		arg5 -= field804;
		arg3 -= field805;
		arg1 -= field804;
		arg2 -= field805;
		if (arg0 == 0) {
			if (arg4 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field808[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field808[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 == arg5 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field808[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field808[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 == arg5 && arg2 - 1 == arg3) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field808[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field808[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field808[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field808[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg5 && arg2 + 1 == arg3 && (field808[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg2 - 1 == arg3 && (field808[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg3 && (field808[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(ZIIIIII)Z")
	public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg0 == arg1) {
			return true;
		}

		arg5 -= field804;
		arg1 -= field805;
		arg3 -= field804;
		arg0 -= field805;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg3 + 1 == arg5 && arg0 == arg1 && (field808[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1 && (field808[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg3 - 1 == arg5 && arg0 == arg1 && (field808[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1 && (field808[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 - 1 == arg5 && arg0 == arg1 && (field808[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1 && (field808[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg3 + 1 == arg5 && arg0 == arg1 && (field808[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1 && (field808[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg3 == arg5 && arg0 + 1 == arg1 && (field808[arg5][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg0 - 1 == arg1 && (field808[arg5][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg0 == arg1 && (field808[arg5][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg0 == arg1 && (field808[arg5][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIZII)Z")
	public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg6 - 1;
		int var9 = arg0 + arg5 - 1;
		if (arg4 >= arg1 && arg4 <= var8 && arg2 >= arg0 && arg2 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg4 && arg2 >= arg0 && arg2 <= var9 && (field808[arg4 - field804][arg2 - field805] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg2 >= arg0 && arg2 <= var9 && (field808[arg4 - field804][arg2 - field805] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg2 && arg4 >= arg1 && arg4 <= var8 && (field808[arg4 - field804][arg2 - field805] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg4 >= arg1 && arg4 <= var8 && (field808[arg4 - field804][arg2 - field805] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
