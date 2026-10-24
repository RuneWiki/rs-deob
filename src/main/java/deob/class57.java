package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.d")
	public int field803 = 0;

	@ObfuscatedName("ec.e")
	public int field804 = 0;

	@ObfuscatedName("ec.f")
	public int field805;

	@ObfuscatedName("ec.g")
	public int field806;

	@ObfuscatedName("ec.h")
	public int[][] field807;

	public class57(int arg0, int arg1) {
		field805 = arg1;
		field806 = arg0;
		field807 = new int[field805][field806];
		method294();
	}

	@ObfuscatedName("ec.a(I)V")
	public void method294() {
		for (int var1 = 0; var1 < field805; var1++) {
			for (int var2 = 0; var2 < field806; var2++) {
				if (var1 == 0 || var2 == 0 || field805 - 1 == var1 || field806 - 1 == var2) {
					field807[var1][var2] = 0xFFFFFF;
				} else {
					field807[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIZI)V")
	public void method295(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field803;
		arg1 -= field804;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method298(arg2, arg1, 128);
				method298(arg2 - 1, arg1, 8);
			}

			if (arg0 == 1) {
				method298(arg2, arg1, 2);
				method298(arg2, arg1 + 1, 32);
			}

			if (arg0 == 2) {
				method298(arg2, arg1, 8);
				method298(arg2 + 1, arg1, 128);
			}

			if (arg0 == 3) {
				method298(arg2, arg1, 32);
				method298(arg2, arg1 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method298(arg2, arg1, 1);
				method298(arg2 - 1, arg1 + 1, 16);
			}

			if (arg0 == 1) {
				method298(arg2, arg1, 4);
				method298(arg2 + 1, arg1 + 1, 64);
			}

			if (arg0 == 2) {
				method298(arg2, arg1, 16);
				method298(arg2 + 1, arg1 - 1, 1);
			}

			if (arg0 == 3) {
				method298(arg2, arg1, 64);
				method298(arg2 - 1, arg1 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method298(arg2, arg1, 130);
				method298(arg2 - 1, arg1, 8);
				method298(arg2, arg1 + 1, 32);
			}

			if (arg0 == 1) {
				method298(arg2, arg1, 10);
				method298(arg2, arg1 + 1, 32);
				method298(arg2 + 1, arg1, 128);
			}

			if (arg0 == 2) {
				method298(arg2, arg1, 40);
				method298(arg2 + 1, arg1, 128);
				method298(arg2, arg1 - 1, 2);
			}

			if (arg0 == 3) {
				method298(arg2, arg1, 160);
				method298(arg2, arg1 - 1, 2);
				method298(arg2 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method298(arg2, arg1, 0x10000);
					method298(arg2 - 1, arg1, 4096);
				}

				if (arg0 == 1) {
					method298(arg2, arg1, 1024);
					method298(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 2) {
					method298(arg2, arg1, 4096);
					method298(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 3) {
					method298(arg2, arg1, 16384);
					method298(arg2, arg1 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method298(arg2, arg1, 512);
					method298(arg2 - 1, arg1 + 1, 8192);
				}

				if (arg0 == 1) {
					method298(arg2, arg1, 2048);
					method298(arg2 + 1, arg1 + 1, 32768);
				}

				if (arg0 == 2) {
					method298(arg2, arg1, 8192);
					method298(arg2 + 1, arg1 - 1, 512);
				}

				if (arg0 == 3) {
					method298(arg2, arg1, 32768);
					method298(arg2 - 1, arg1 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method298(arg2, arg1, 66560);
					method298(arg2 - 1, arg1, 4096);
					method298(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 1) {
					method298(arg2, arg1, 5120);
					method298(arg2, arg1 + 1, 16384);
					method298(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 2) {
					method298(arg2, arg1, 20480);
					method298(arg2 + 1, arg1, 0x10000);
					method298(arg2, arg1 - 1, 1024);
				}

				if (arg0 == 3) {
					method298(arg2, arg1, 81920);
					method298(arg2, arg1 - 1, 1024);
					method298(arg2 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIZIZII)V")
	public void method296(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg3 -= field803;
		arg0 -= field804;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg3; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field805) {
				for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field806) {
						method298(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IZI)V")
	public void method297(int arg0, int arg1) {
		arg1 -= field803;
		arg0 -= field804;
		field807[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("ec.a(III)V")
	public void method298(int arg0, int arg1, int arg2) {
		field807[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(IZIIZI)V")
	public void method299(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field803;
		arg0 -= field804;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method301(128, arg3, arg0);
				method301(8, arg3 - 1, arg0);
			}

			if (arg4 == 1) {
				method301(2, arg3, arg0);
				method301(32, arg3, arg0 + 1);
			}

			if (arg4 == 2) {
				method301(8, arg3, arg0);
				method301(128, arg3 + 1, arg0);
			}

			if (arg4 == 3) {
				method301(32, arg3, arg0);
				method301(2, arg3, arg0 - 1);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method301(1, arg3, arg0);
				method301(16, arg3 - 1, arg0 + 1);
			}

			if (arg4 == 1) {
				method301(4, arg3, arg0);
				method301(64, arg3 + 1, arg0 + 1);
			}

			if (arg4 == 2) {
				method301(16, arg3, arg0);
				method301(1, arg3 + 1, arg0 - 1);
			}

			if (arg4 == 3) {
				method301(64, arg3, arg0);
				method301(4, arg3 - 1, arg0 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method301(130, arg3, arg0);
				method301(8, arg3 - 1, arg0);
				method301(32, arg3, arg0 + 1);
			}

			if (arg4 == 1) {
				method301(10, arg3, arg0);
				method301(32, arg3, arg0 + 1);
				method301(128, arg3 + 1, arg0);
			}

			if (arg4 == 2) {
				method301(40, arg3, arg0);
				method301(128, arg3 + 1, arg0);
				method301(2, arg3, arg0 - 1);
			}

			if (arg4 == 3) {
				method301(160, arg3, arg0);
				method301(2, arg3, arg0 - 1);
				method301(8, arg3 - 1, arg0);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method301(0x10000, arg3, arg0);
					method301(4096, arg3 - 1, arg0);
				}

				if (arg4 == 1) {
					method301(1024, arg3, arg0);
					method301(16384, arg3, arg0 + 1);
				}

				if (arg4 == 2) {
					method301(4096, arg3, arg0);
					method301(0x10000, arg3 + 1, arg0);
				}

				if (arg4 == 3) {
					method301(16384, arg3, arg0);
					method301(1024, arg3, arg0 - 1);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method301(512, arg3, arg0);
					method301(8192, arg3 - 1, arg0 + 1);
				}

				if (arg4 == 1) {
					method301(2048, arg3, arg0);
					method301(32768, arg3 + 1, arg0 + 1);
				}

				if (arg4 == 2) {
					method301(8192, arg3, arg0);
					method301(512, arg3 + 1, arg0 - 1);
				}

				if (arg4 == 3) {
					method301(32768, arg3, arg0);
					method301(2048, arg3 - 1, arg0 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method301(66560, arg3, arg0);
					method301(4096, arg3 - 1, arg0);
					method301(16384, arg3, arg0 + 1);
				}

				if (arg4 == 1) {
					method301(5120, arg3, arg0);
					method301(16384, arg3, arg0 + 1);
					method301(0x10000, arg3 + 1, arg0);
				}

				if (arg4 == 2) {
					method301(20480, arg3, arg0);
					method301(0x10000, arg3 + 1, arg0);
					method301(1024, arg3, arg0 - 1);
				}

				if (arg4 == 3) {
					method301(81920, arg3, arg0);
					method301(1024, arg3, arg0 - 1);
					method301(4096, arg3 - 1, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIZIII)V")
	public void method300(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg1 -= field803;
		arg5 -= field804;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg3;
			arg3 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field805) {
				for (int var10 = arg5; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < field806) {
						method301(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIII)V")
	public void method301(int arg0, int arg1, int arg2) {
		field807[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("ec.b(III)V")
	public void method302(int arg0, int arg1) {
		arg1 -= field803;
		arg0 -= field804;
		field807[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(IIIIIII)Z")
	public boolean method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg3 == arg5) {
			return true;
		}

		arg0 -= field803;
		arg3 -= field804;
		arg2 -= field803;
		arg5 -= field804;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field807[arg0][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field807[arg0][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg2 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field807[arg0][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field807[arg0][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg2 && arg5 - 1 == arg3) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field807[arg0][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field807[arg0][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field807[arg0][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field807[arg0][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg2 && arg5 + 1 == arg3 && (field807[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg5 - 1 == arg3 && (field807[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg0 && arg3 == arg5 && (field807[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.b(IIIIIII)Z")
	public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg1 == arg5) {
			return true;
		}

		arg3 -= field803;
		arg5 -= field804;
		arg4 -= field803;
		arg1 -= field804;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg4 + 1 == arg3 && arg1 == arg5 && (field807[arg3][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg5 && (field807[arg3][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg3 && arg1 == arg5 && (field807[arg3][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 - 1 == arg5 && (field807[arg3][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg3 && arg1 == arg5 && (field807[arg3][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg5 && (field807[arg3][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 + 1 == arg3 && arg1 == arg5 && (field807[arg3][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg1 + 1 == arg5 && (field807[arg3][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg3 == arg4 && arg1 + 1 == arg5 && (field807[arg3][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg1 - 1 == arg5 && (field807[arg3][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg3 && arg1 == arg5 && (field807[arg3][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg3 && arg1 == arg5 && (field807[arg3][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIIII)Z")
	public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg6 - 1;
		int var9 = arg1 + arg4 - 1;
		if (arg3 >= arg0 && arg3 <= var8 && arg2 >= arg1 && arg2 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg3 && arg2 >= arg1 && arg2 <= var9 && (field807[arg3 - field803][arg2 - field804] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg2 >= arg1 && arg2 <= var9 && (field807[arg3 - field803][arg2 - field804] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg2 && arg3 >= arg0 && arg3 <= var8 && (field807[arg3 - field803][arg2 - field804] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg3 >= arg0 && arg3 <= var8 && (field807[arg3 - field803][arg2 - field804] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
