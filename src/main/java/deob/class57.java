package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.f")
	public int field805 = 0;

	@ObfuscatedName("ec.g")
	public int field806 = 0;

	@ObfuscatedName("ec.h")
	public int field807;

	@ObfuscatedName("ec.i")
	public int field808;

	@ObfuscatedName("ec.j")
	public int[][] field809;

	public class57(int arg0, int arg1) {
		field807 = arg1;
		field808 = arg0;
		field809 = new int[field807][field808];
		method295();
	}

	@ObfuscatedName("ec.a(I)V")
	public void method295() {
		for (int var1 = 0; var1 < field807; var1++) {
			for (int var2 = 0; var2 < field808; var2++) {
				if (var1 == 0 || var2 == 0 || field807 - 1 == var1 || field808 - 1 == var2) {
					field809[var1][var2] = 0xFFFFFF;
				} else {
					field809[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIZIII)V")
	public void method296(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field805;
		arg0 -= field806;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method299(arg3, arg0, 128);
				method299(arg3 - 1, arg0, 8);
			}

			if (arg2 == 1) {
				method299(arg3, arg0, 2);
				method299(arg3, arg0 + 1, 32);
			}

			if (arg2 == 2) {
				method299(arg3, arg0, 8);
				method299(arg3 + 1, arg0, 128);
			}

			if (arg2 == 3) {
				method299(arg3, arg0, 32);
				method299(arg3, arg0 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method299(arg3, arg0, 1);
				method299(arg3 - 1, arg0 + 1, 16);
			}

			if (arg2 == 1) {
				method299(arg3, arg0, 4);
				method299(arg3 + 1, arg0 + 1, 64);
			}

			if (arg2 == 2) {
				method299(arg3, arg0, 16);
				method299(arg3 + 1, arg0 - 1, 1);
			}

			if (arg2 == 3) {
				method299(arg3, arg0, 64);
				method299(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method299(arg3, arg0, 130);
				method299(arg3 - 1, arg0, 8);
				method299(arg3, arg0 + 1, 32);
			}

			if (arg2 == 1) {
				method299(arg3, arg0, 10);
				method299(arg3, arg0 + 1, 32);
				method299(arg3 + 1, arg0, 128);
			}

			if (arg2 == 2) {
				method299(arg3, arg0, 40);
				method299(arg3 + 1, arg0, 128);
				method299(arg3, arg0 - 1, 2);
			}

			if (arg2 == 3) {
				method299(arg3, arg0, 160);
				method299(arg3, arg0 - 1, 2);
				method299(arg3 - 1, arg0, 8);
			}
		}

		if (arg1) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method299(arg3, arg0, 0x10000);
					method299(arg3 - 1, arg0, 4096);
				}

				if (arg2 == 1) {
					method299(arg3, arg0, 1024);
					method299(arg3, arg0 + 1, 16384);
				}

				if (arg2 == 2) {
					method299(arg3, arg0, 4096);
					method299(arg3 + 1, arg0, 0x10000);
				}

				if (arg2 == 3) {
					method299(arg3, arg0, 16384);
					method299(arg3, arg0 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method299(arg3, arg0, 512);
					method299(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg2 == 1) {
					method299(arg3, arg0, 2048);
					method299(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg2 == 2) {
					method299(arg3, arg0, 8192);
					method299(arg3 + 1, arg0 - 1, 512);
				}

				if (arg2 == 3) {
					method299(arg3, arg0, 32768);
					method299(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method299(arg3, arg0, 66560);
					method299(arg3 - 1, arg0, 4096);
					method299(arg3, arg0 + 1, 16384);
				}

				if (arg2 == 1) {
					method299(arg3, arg0, 5120);
					method299(arg3, arg0 + 1, 16384);
					method299(arg3 + 1, arg0, 0x10000);
				}

				if (arg2 == 2) {
					method299(arg3, arg0, 20480);
					method299(arg3 + 1, arg0, 0x10000);
					method299(arg3, arg0 - 1, 1024);
				}

				if (arg2 == 3) {
					method299(arg3, arg0, 81920);
					method299(arg3, arg0 - 1, 1024);
					method299(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(ZZIIIII)V")
	public void method297(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg5 -= field805;
		arg3 -= field806;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field807) {
				for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
					if (var10 >= 0 && var10 < field808) {
						method299(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IBI)V")
	public void method298(int arg0, int arg1) {
		arg0 -= field805;
		arg1 -= field806;
		field809[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ec.a(III)V")
	public void method299(int arg0, int arg1, int arg2) {
		field809[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(IIIIBZ)V")
	public void method300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field805;
		arg2 -= field806;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method302(128, arg3, arg2);
				method302(8, arg3 - 1, arg2);
			}

			if (arg1 == 1) {
				method302(2, arg3, arg2);
				method302(32, arg3, arg2 + 1);
			}

			if (arg1 == 2) {
				method302(8, arg3, arg2);
				method302(128, arg3 + 1, arg2);
			}

			if (arg1 == 3) {
				method302(32, arg3, arg2);
				method302(2, arg3, arg2 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method302(1, arg3, arg2);
				method302(16, arg3 - 1, arg2 + 1);
			}

			if (arg1 == 1) {
				method302(4, arg3, arg2);
				method302(64, arg3 + 1, arg2 + 1);
			}

			if (arg1 == 2) {
				method302(16, arg3, arg2);
				method302(1, arg3 + 1, arg2 - 1);
			}

			if (arg1 == 3) {
				method302(64, arg3, arg2);
				method302(4, arg3 - 1, arg2 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method302(130, arg3, arg2);
				method302(8, arg3 - 1, arg2);
				method302(32, arg3, arg2 + 1);
			}

			if (arg1 == 1) {
				method302(10, arg3, arg2);
				method302(32, arg3, arg2 + 1);
				method302(128, arg3 + 1, arg2);
			}

			if (arg1 == 2) {
				method302(40, arg3, arg2);
				method302(128, arg3 + 1, arg2);
				method302(2, arg3, arg2 - 1);
			}

			if (arg1 == 3) {
				method302(160, arg3, arg2);
				method302(2, arg3, arg2 - 1);
				method302(8, arg3 - 1, arg2);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method302(0x10000, arg3, arg2);
					method302(4096, arg3 - 1, arg2);
				}

				if (arg1 == 1) {
					method302(1024, arg3, arg2);
					method302(16384, arg3, arg2 + 1);
				}

				if (arg1 == 2) {
					method302(4096, arg3, arg2);
					method302(0x10000, arg3 + 1, arg2);
				}

				if (arg1 == 3) {
					method302(16384, arg3, arg2);
					method302(1024, arg3, arg2 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method302(512, arg3, arg2);
					method302(8192, arg3 - 1, arg2 + 1);
				}

				if (arg1 == 1) {
					method302(2048, arg3, arg2);
					method302(32768, arg3 + 1, arg2 + 1);
				}

				if (arg1 == 2) {
					method302(8192, arg3, arg2);
					method302(512, arg3 + 1, arg2 - 1);
				}

				if (arg1 == 3) {
					method302(32768, arg3, arg2);
					method302(2048, arg3 - 1, arg2 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method302(66560, arg3, arg2);
					method302(4096, arg3 - 1, arg2);
					method302(16384, arg3, arg2 + 1);
				}

				if (arg1 == 1) {
					method302(5120, arg3, arg2);
					method302(16384, arg3, arg2 + 1);
					method302(0x10000, arg3 + 1, arg2);
				}

				if (arg1 == 2) {
					method302(20480, arg3, arg2);
					method302(0x10000, arg3 + 1, arg2);
					method302(1024, arg3, arg2 - 1);
				}

				if (arg1 == 3) {
					method302(81920, arg3, arg2);
					method302(1024, arg3, arg2 - 1);
					method302(4096, arg3 - 1, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIZII)V")
	public void method301(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= field805;
		arg5 -= field806;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg0;
			arg0 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field807) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field808) {
						method302(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIII)V")
	public void method302(int arg0, int arg1, int arg2) {
		field809[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("ec.a(BII)V")
	public void method303(int arg0, int arg1) {
		arg1 -= field805;
		arg0 -= field806;
		field809[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(BIIIIII)Z")
	public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg2 == arg3) {
			return true;
		}

		arg5 -= field805;
		arg2 -= field806;
		arg0 -= field805;
		arg3 -= field806;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (arg0 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field809[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field809[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg0 - 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg0 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field809[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field809[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg5 && arg3 - 1 == arg2) {
					return true;
				}

				if (arg0 - 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				if (arg0 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field809[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 - 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field809[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg0 - 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field809[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field809[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg5 && arg3 + 1 == arg2 && (field809[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg3 - 1 == arg2 && (field809[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg5 && arg2 == arg3 && (field809[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIII)Z")
	public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg3) {
			return true;
		}

		arg4 -= field805;
		arg1 -= field806;
		arg0 -= field805;
		arg3 -= field806;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg0 + 1 == arg4 && arg1 == arg3 && (field809[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field809[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg4 && arg1 == arg3 && (field809[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field809[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg4 && arg1 == arg3 && (field809[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field809[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 + 1 == arg4 && arg1 == arg3 && (field809[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field809[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg4 && arg3 + 1 == arg1 && (field809[arg4][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg3 - 1 == arg1 && (field809[arg4][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg1 == arg3 && (field809[arg4][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg1 == arg3 && (field809[arg4][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIIIB)Z")
	public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg3 - 1;
		int var9 = arg4 + arg6 - 1;
		if (arg5 >= arg1 && arg5 <= var8 && arg0 >= arg4 && arg0 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg5 && arg0 >= arg4 && arg0 <= var9 && (field809[arg5 - field805][arg0 - field806] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg0 >= arg4 && arg0 <= var9 && (field809[arg5 - field805][arg0 - field806] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg0 && arg5 >= arg1 && arg5 <= var8 && (field809[arg5 - field805][arg0 - field806] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg5 >= arg1 && arg5 <= var8 && (field809[arg5 - field805][arg0 - field806] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
