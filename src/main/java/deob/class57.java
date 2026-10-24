package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.g")
	public int field810 = 0;

	@ObfuscatedName("ec.h")
	public int field811 = 0;

	@ObfuscatedName("ec.i")
	public int field812;

	@ObfuscatedName("ec.j")
	public int field813;

	@ObfuscatedName("ec.k")
	public int[][] field814;

	public class57(int arg0, int arg1) {
		field812 = arg1;
		field813 = arg0;
		field814 = new int[field812][field813];
		method295();
	}

	@ObfuscatedName("ec.a(Z)V")
	public void method295() {
		for (int var1 = 0; var1 < field812; var1++) {
			for (int var2 = 0; var2 < field813; var2++) {
				if (var1 == 0 || var2 == 0 || field812 - 1 == var1 || field813 - 1 == var2) {
					field814[var1][var2] = 0xFFFFFF;
				} else {
					field814[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(ZIIIII)V")
	public void method296(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field810;
		arg3 -= field811;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method299(arg2, arg3, 128);
				method299(arg2 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method299(arg2, arg3, 2);
				method299(arg2, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method299(arg2, arg3, 8);
				method299(arg2 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method299(arg2, arg3, 32);
				method299(arg2, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method299(arg2, arg3, 1);
				method299(arg2 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method299(arg2, arg3, 4);
				method299(arg2 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method299(arg2, arg3, 16);
				method299(arg2 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method299(arg2, arg3, 64);
				method299(arg2 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method299(arg2, arg3, 130);
				method299(arg2 - 1, arg3, 8);
				method299(arg2, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method299(arg2, arg3, 10);
				method299(arg2, arg3 + 1, 32);
				method299(arg2 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method299(arg2, arg3, 40);
				method299(arg2 + 1, arg3, 128);
				method299(arg2, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method299(arg2, arg3, 160);
				method299(arg2, arg3 - 1, 2);
				method299(arg2 - 1, arg3, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method299(arg2, arg3, 0x10000);
					method299(arg2 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method299(arg2, arg3, 1024);
					method299(arg2, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method299(arg2, arg3, 4096);
					method299(arg2 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method299(arg2, arg3, 16384);
					method299(arg2, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method299(arg2, arg3, 512);
					method299(arg2 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method299(arg2, arg3, 2048);
					method299(arg2 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method299(arg2, arg3, 8192);
					method299(arg2 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method299(arg2, arg3, 32768);
					method299(arg2 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method299(arg2, arg3, 66560);
					method299(arg2 - 1, arg3, 4096);
					method299(arg2, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method299(arg2, arg3, 5120);
					method299(arg2, arg3 + 1, 16384);
					method299(arg2 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method299(arg2, arg3, 20480);
					method299(arg2 + 1, arg3, 0x10000);
					method299(arg2, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method299(arg2, arg3, 81920);
					method299(arg2, arg3 - 1, 1024);
					method299(arg2 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIZI)V")
	public void method297(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg0 -= field810;
		arg5 -= field811;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field812) {
				for (int var10 = arg5; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field813) {
						method299(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(III)V")
	public void method298(int arg0, int arg1) {
		arg1 -= field810;
		arg0 -= field811;
		field814[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("ec.b(III)V")
	public void method299(int arg0, int arg1, int arg2) {
		field814[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(IIIIIZ)V")
	public void method300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field810;
		arg1 -= field811;
		if (arg2 == 0) {
			if (arg0 == 0) {
				method302(arg1, arg3, 128);
				method302(arg1, arg3 - 1, 8);
			}

			if (arg0 == 1) {
				method302(arg1, arg3, 2);
				method302(arg1 + 1, arg3, 32);
			}

			if (arg0 == 2) {
				method302(arg1, arg3, 8);
				method302(arg1, arg3 + 1, 128);
			}

			if (arg0 == 3) {
				method302(arg1, arg3, 32);
				method302(arg1 - 1, arg3, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				method302(arg1, arg3, 1);
				method302(arg1 + 1, arg3 - 1, 16);
			}

			if (arg0 == 1) {
				method302(arg1, arg3, 4);
				method302(arg1 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				method302(arg1, arg3, 16);
				method302(arg1 - 1, arg3 + 1, 1);
			}

			if (arg0 == 3) {
				method302(arg1, arg3, 64);
				method302(arg1 - 1, arg3 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				method302(arg1, arg3, 130);
				method302(arg1, arg3 - 1, 8);
				method302(arg1 + 1, arg3, 32);
			}

			if (arg0 == 1) {
				method302(arg1, arg3, 10);
				method302(arg1 + 1, arg3, 32);
				method302(arg1, arg3 + 1, 128);
			}

			if (arg0 == 2) {
				method302(arg1, arg3, 40);
				method302(arg1, arg3 + 1, 128);
				method302(arg1 - 1, arg3, 2);
			}

			if (arg0 == 3) {
				method302(arg1, arg3, 160);
				method302(arg1 - 1, arg3, 2);
				method302(arg1, arg3 - 1, 8);
			}
		}

		if (arg4) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					method302(arg1, arg3, 0x10000);
					method302(arg1, arg3 - 1, 4096);
				}

				if (arg0 == 1) {
					method302(arg1, arg3, 1024);
					method302(arg1 + 1, arg3, 16384);
				}

				if (arg0 == 2) {
					method302(arg1, arg3, 4096);
					method302(arg1, arg3 + 1, 0x10000);
				}

				if (arg0 == 3) {
					method302(arg1, arg3, 16384);
					method302(arg1 - 1, arg3, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					method302(arg1, arg3, 512);
					method302(arg1 + 1, arg3 - 1, 8192);
				}

				if (arg0 == 1) {
					method302(arg1, arg3, 2048);
					method302(arg1 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					method302(arg1, arg3, 8192);
					method302(arg1 - 1, arg3 + 1, 512);
				}

				if (arg0 == 3) {
					method302(arg1, arg3, 32768);
					method302(arg1 - 1, arg3 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg0 == 0) {
					method302(arg1, arg3, 66560);
					method302(arg1, arg3 - 1, 4096);
					method302(arg1 + 1, arg3, 16384);
				}

				if (arg0 == 1) {
					method302(arg1, arg3, 5120);
					method302(arg1 + 1, arg3, 16384);
					method302(arg1, arg3 + 1, 0x10000);
				}

				if (arg0 == 2) {
					method302(arg1, arg3, 20480);
					method302(arg1, arg3 + 1, 0x10000);
					method302(arg1 - 1, arg3, 1024);
				}

				if (arg0 == 3) {
					method302(arg1, arg3, 81920);
					method302(arg1 - 1, arg3, 1024);
					method302(arg1, arg3 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIZIII)V")
	public void method301(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field810;
		arg0 -= field811;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field812) {
				for (int var10 = arg0; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field813) {
						method302(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIII)V")
	public void method302(int arg0, int arg1, int arg2) {
		field814[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ec.c(III)V")
	public void method303(int arg0, int arg1) {
		arg1 -= field810;
		arg0 -= field811;
		field814[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(IIBIIII)Z")
	public boolean method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg0 == arg5) {
			return true;
		}

		arg1 -= field810;
		arg5 -= field811;
		arg2 -= field810;
		arg0 -= field811;
		if (arg4 == 0) {
			if (arg3 == 0) {
				if (arg2 - 1 == arg1 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field814[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field814[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 == arg2 && arg0 + 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg2 + 1 == arg1 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field814[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field814[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 == arg2 && arg0 - 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				if (arg2 - 1 == arg1 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field814[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg2 - 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5 && (field814[arg1][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg2 - 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field814[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg2 - 1 == arg1 && arg0 == arg5) {
					return true;
				}

				if (arg1 == arg2 && arg0 + 1 == arg5 && (field814[arg1][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg0 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg1 == arg2 && arg0 + 1 == arg5 && (field814[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg0 - 1 == arg5 && (field814[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg1 && arg0 == arg5 && (field814[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIII)Z")
	public boolean method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg3 == arg4) {
			return true;
		}

		arg1 -= field810;
		arg4 -= field811;
		arg0 -= field810;
		arg3 -= field811;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg0 + 1 == arg1 && arg3 == arg4 && (field814[arg1][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4 && (field814[arg1][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 - 1 == arg1 && arg3 == arg4 && (field814[arg1][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4 && (field814[arg1][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg0 - 1 == arg1 && arg3 == arg4 && (field814[arg1][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4 && (field814[arg1][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 + 1 == arg1 && arg3 == arg4 && (field814[arg1][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4 && (field814[arg1][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg1 && arg3 + 1 == arg4 && (field814[arg1][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg3 - 1 == arg4 && (field814[arg1][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg3 == arg4 && (field814[arg1][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg3 == arg4 && (field814[arg1][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIIII)Z")
	public boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg1 - 1;
		int var9 = arg2 + arg3 - 1;
		if (arg5 >= arg1 && arg5 <= var8 && arg4 >= arg3 && arg4 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (field814[arg5 - field810][arg4 - field811] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (field814[arg5 - field810][arg4 - field811] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg4 && arg5 >= arg1 && arg5 <= var8 && (field814[arg5 - field810][arg4 - field811] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg1 && arg5 <= var8 && (field814[arg5 - field810][arg4 - field811] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
