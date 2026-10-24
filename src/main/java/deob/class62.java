package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.f")
	public int field940 = 0;

	@ObfuscatedName("jc.g")
	public int field941 = 0;

	@ObfuscatedName("jc.h")
	public int field942;

	@ObfuscatedName("jc.i")
	public int field943;

	@ObfuscatedName("jc.j")
	public int[][] field944;

	public class62(int arg0, int arg1) {
		field942 = arg0;
		field943 = arg1;
		field944 = new int[field942][field943];
		method361();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method361() {
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

	@ObfuscatedName("jc.a(ZIIIZI)V")
	public void method362(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field940;
		arg0 -= field941;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method365(arg2, arg0, 128);
				method365(arg2 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method365(arg2, arg0, 2);
				method365(arg2, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method365(arg2, arg0, 8);
				method365(arg2 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method365(arg2, arg0, 32);
				method365(arg2, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method365(arg2, arg0, 1);
				method365(arg2 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method365(arg2, arg0, 4);
				method365(arg2 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method365(arg2, arg0, 16);
				method365(arg2 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method365(arg2, arg0, 64);
				method365(arg2 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method365(arg2, arg0, 130);
				method365(arg2 - 1, arg0, 8);
				method365(arg2, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method365(arg2, arg0, 10);
				method365(arg2, arg0 + 1, 32);
				method365(arg2 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method365(arg2, arg0, 40);
				method365(arg2 + 1, arg0, 128);
				method365(arg2, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method365(arg2, arg0, 160);
				method365(arg2, arg0 - 1, 2);
				method365(arg2 - 1, arg0, 8);
			}
		}

		if (arg3) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method365(arg2, arg0, 0x10000);
					method365(arg2 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method365(arg2, arg0, 1024);
					method365(arg2, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method365(arg2, arg0, 4096);
					method365(arg2 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method365(arg2, arg0, 16384);
					method365(arg2, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method365(arg2, arg0, 512);
					method365(arg2 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method365(arg2, arg0, 2048);
					method365(arg2 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method365(arg2, arg0, 8192);
					method365(arg2 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method365(arg2, arg0, 32768);
					method365(arg2 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method365(arg2, arg0, 66560);
					method365(arg2 - 1, arg0, 4096);
					method365(arg2, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method365(arg2, arg0, 5120);
					method365(arg2, arg0 + 1, 16384);
					method365(arg2 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method365(arg2, arg0, 20480);
					method365(arg2 + 1, arg0, 0x10000);
					method365(arg2, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method365(arg2, arg0, 81920);
					method365(arg2, arg0 - 1, 1024);
					method365(arg2 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZII)V")
	public void method363(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field940;
		arg2 -= field941;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg5;
			arg5 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field942) {
				for (int var10 = arg2; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < field943) {
						method365(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void method364(int arg0, int arg1) {
		arg1 -= field940;
		arg0 -= field941;
		field944[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void method365(int arg0, int arg1, int arg2) {
		field944[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIZI)V")
	public void method366(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg0 -= field940;
		arg1 -= field941;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method368(arg1, arg0, 128);
				method368(arg1, arg0 - 1, 8);
			}

			if (arg4 == 1) {
				method368(arg1, arg0, 2);
				method368(arg1 + 1, arg0, 32);
			}

			if (arg4 == 2) {
				method368(arg1, arg0, 8);
				method368(arg1, arg0 + 1, 128);
			}

			if (arg4 == 3) {
				method368(arg1, arg0, 32);
				method368(arg1 - 1, arg0, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method368(arg1, arg0, 1);
				method368(arg1 + 1, arg0 - 1, 16);
			}

			if (arg4 == 1) {
				method368(arg1, arg0, 4);
				method368(arg1 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method368(arg1, arg0, 16);
				method368(arg1 - 1, arg0 + 1, 1);
			}

			if (arg4 == 3) {
				method368(arg1, arg0, 64);
				method368(arg1 - 1, arg0 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method368(arg1, arg0, 130);
				method368(arg1, arg0 - 1, 8);
				method368(arg1 + 1, arg0, 32);
			}

			if (arg4 == 1) {
				method368(arg1, arg0, 10);
				method368(arg1 + 1, arg0, 32);
				method368(arg1, arg0 + 1, 128);
			}

			if (arg4 == 2) {
				method368(arg1, arg0, 40);
				method368(arg1, arg0 + 1, 128);
				method368(arg1 - 1, arg0, 2);
			}

			if (arg4 == 3) {
				method368(arg1, arg0, 160);
				method368(arg1 - 1, arg0, 2);
				method368(arg1, arg0 - 1, 8);
			}
		}

		if (arg3) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method368(arg1, arg0, 0x10000);
					method368(arg1, arg0 - 1, 4096);
				}

				if (arg4 == 1) {
					method368(arg1, arg0, 1024);
					method368(arg1 + 1, arg0, 16384);
				}

				if (arg4 == 2) {
					method368(arg1, arg0, 4096);
					method368(arg1, arg0 + 1, 0x10000);
				}

				if (arg4 == 3) {
					method368(arg1, arg0, 16384);
					method368(arg1 - 1, arg0, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method368(arg1, arg0, 512);
					method368(arg1 + 1, arg0 - 1, 8192);
				}

				if (arg4 == 1) {
					method368(arg1, arg0, 2048);
					method368(arg1 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method368(arg1, arg0, 8192);
					method368(arg1 - 1, arg0 + 1, 512);
				}

				if (arg4 == 3) {
					method368(arg1, arg0, 32768);
					method368(arg1 - 1, arg0 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method368(arg1, arg0, 66560);
					method368(arg1, arg0 - 1, 4096);
					method368(arg1 + 1, arg0, 16384);
				}

				if (arg4 == 1) {
					method368(arg1, arg0, 5120);
					method368(arg1 + 1, arg0, 16384);
					method368(arg1, arg0 + 1, 0x10000);
				}

				if (arg4 == 2) {
					method368(arg1, arg0, 20480);
					method368(arg1, arg0 + 1, 0x10000);
					method368(arg1 - 1, arg0, 1024);
				}

				if (arg4 == 3) {
					method368(arg1, arg0, 81920);
					method368(arg1 - 1, arg0, 1024);
					method368(arg1, arg0 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIIIZ)V")
	public void method367(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg2 -= field940;
		arg0 -= field941;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg2; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field942) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field943) {
						method368(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIBI)V")
	public void method368(int arg0, int arg1, int arg2) {
		field944[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method369(int arg0, int arg1) {
		arg0 -= field940;
		arg1 -= field941;
		field944[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIIB)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg4 == arg5) {
			return true;
		}

		arg1 -= field940;
		arg5 -= field941;
		arg0 -= field940;
		arg4 -= field941;
		if (arg2 == 0) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg5 && (field944[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg5 && (field944[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 == arg1 && arg4 + 1 == arg5) {
					return true;
				}

				if (arg0 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 + 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg5 && (field944[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg5 && (field944[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 == arg1 && arg4 - 1 == arg5) {
					return true;
				}

				if (arg0 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg5) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg5 && (field944[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg5) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg5 && (field944[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg5 && (field944[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg5) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 - 1 == arg1 && arg4 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg5 && (field944[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg0 == arg1 && arg4 + 1 == arg5 && (field944[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg4 - 1 == arg5 && (field944[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg4 == arg5 && (field944[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg2 == arg5) {
			return true;
		}

		arg1 -= field940;
		arg5 -= field941;
		arg0 -= field940;
		arg2 -= field941;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg1 && arg2 == arg5 && (field944[arg1][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg5 && (field944[arg1][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg1 && arg2 == arg5 && (field944[arg1][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 - 1 == arg5 && (field944[arg1][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg1 && arg2 == arg5 && (field944[arg1][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg5 && (field944[arg1][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg1 && arg2 == arg5 && (field944[arg1][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg2 + 1 == arg5 && (field944[arg1][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg0 == arg1 && arg2 + 1 == arg5 && (field944[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg2 - 1 == arg5 && (field944[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg2 == arg5 && (field944[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg2 == arg5 && (field944[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg5 + arg6 - 1;
		int var9 = arg0 + arg2 - 1;
		if (arg4 >= arg6 && arg4 <= var8 && arg3 >= arg0 && arg3 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg4 && arg3 >= arg0 && arg3 <= var9 && (field944[arg4 - field940][arg3 - field941] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg3 >= arg0 && arg3 <= var9 && (field944[arg4 - field940][arg3 - field941] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg3 && arg4 >= arg6 && arg4 <= var8 && (field944[arg4 - field940][arg3 - field941] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg4 >= arg6 && arg4 <= var8 && (field944[arg4 - field940][arg3 - field941] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
