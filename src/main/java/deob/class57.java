package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.d")
	public int field809 = 0;

	@ObfuscatedName("ec.e")
	public int field810 = 0;

	@ObfuscatedName("ec.f")
	public int field811;

	@ObfuscatedName("ec.g")
	public int field812;

	@ObfuscatedName("ec.h")
	public int[][] field813;

	public class57(int arg0, int arg1) {
		field811 = arg1;
		field812 = arg0;
		field813 = new int[field811][field812];
		method302();
	}

	@ObfuscatedName("ec.a(Z)V")
	public void method302() {
		for (int var1 = 0; var1 < field811; var1++) {
			for (int var2 = 0; var2 < field812; var2++) {
				if (var1 == 0 || var2 == 0 || field811 - 1 == var1 || field812 - 1 == var2) {
					field813[var1][var2] = 0xFFFFFF;
				} else {
					field813[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIZ)V")
	public void method303(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field809;
		arg1 -= field810;
		if (arg3 == 0) {
			if (arg0 == 0) {
				method306(arg2, arg1, 128);
				method306(arg2 - 1, arg1, 8);
			}

			if (arg0 == 1) {
				method306(arg2, arg1, 2);
				method306(arg2, arg1 + 1, 32);
			}

			if (arg0 == 2) {
				method306(arg2, arg1, 8);
				method306(arg2 + 1, arg1, 128);
			}

			if (arg0 == 3) {
				method306(arg2, arg1, 32);
				method306(arg2, arg1 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				method306(arg2, arg1, 1);
				method306(arg2 - 1, arg1 + 1, 16);
			}

			if (arg0 == 1) {
				method306(arg2, arg1, 4);
				method306(arg2 + 1, arg1 + 1, 64);
			}

			if (arg0 == 2) {
				method306(arg2, arg1, 16);
				method306(arg2 + 1, arg1 - 1, 1);
			}

			if (arg0 == 3) {
				method306(arg2, arg1, 64);
				method306(arg2 - 1, arg1 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg0 == 0) {
				method306(arg2, arg1, 130);
				method306(arg2 - 1, arg1, 8);
				method306(arg2, arg1 + 1, 32);
			}

			if (arg0 == 1) {
				method306(arg2, arg1, 10);
				method306(arg2, arg1 + 1, 32);
				method306(arg2 + 1, arg1, 128);
			}

			if (arg0 == 2) {
				method306(arg2, arg1, 40);
				method306(arg2 + 1, arg1, 128);
				method306(arg2, arg1 - 1, 2);
			}

			if (arg0 == 3) {
				method306(arg2, arg1, 160);
				method306(arg2, arg1 - 1, 2);
				method306(arg2 - 1, arg1, 8);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					method306(arg2, arg1, 0x10000);
					method306(arg2 - 1, arg1, 4096);
				}

				if (arg0 == 1) {
					method306(arg2, arg1, 1024);
					method306(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 2) {
					method306(arg2, arg1, 4096);
					method306(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 3) {
					method306(arg2, arg1, 16384);
					method306(arg2, arg1 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					method306(arg2, arg1, 512);
					method306(arg2 - 1, arg1 + 1, 8192);
				}

				if (arg0 == 1) {
					method306(arg2, arg1, 2048);
					method306(arg2 + 1, arg1 + 1, 32768);
				}

				if (arg0 == 2) {
					method306(arg2, arg1, 8192);
					method306(arg2 + 1, arg1 - 1, 512);
				}

				if (arg0 == 3) {
					method306(arg2, arg1, 32768);
					method306(arg2 - 1, arg1 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg0 == 0) {
					method306(arg2, arg1, 66560);
					method306(arg2 - 1, arg1, 4096);
					method306(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 1) {
					method306(arg2, arg1, 5120);
					method306(arg2, arg1 + 1, 16384);
					method306(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 2) {
					method306(arg2, arg1, 20480);
					method306(arg2 + 1, arg1, 0x10000);
					method306(arg2, arg1 - 1, 1024);
				}

				if (arg0 == 3) {
					method306(arg2, arg1, 81920);
					method306(arg2, arg1 - 1, 1024);
					method306(arg2 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIIZ)V")
	public void method304(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field809;
		arg0 -= field810;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field811) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field812) {
						method306(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIZ)V")
	public void method305(int arg0, int arg1) {
		arg0 -= field809;
		arg1 -= field810;
		field813[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ec.a(III)V")
	public void method306(int arg0, int arg1, int arg2) {
		field813[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(IIZIIB)V")
	public void method307(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field809;
		arg1 -= field810;
		if (arg3 == 0) {
			if (arg4 == 0) {
				method309(arg1, arg0, 128);
				method309(arg1, arg0 - 1, 8);
			}

			if (arg4 == 1) {
				method309(arg1, arg0, 2);
				method309(arg1 + 1, arg0, 32);
			}

			if (arg4 == 2) {
				method309(arg1, arg0, 8);
				method309(arg1, arg0 + 1, 128);
			}

			if (arg4 == 3) {
				method309(arg1, arg0, 32);
				method309(arg1 - 1, arg0, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				method309(arg1, arg0, 1);
				method309(arg1 + 1, arg0 - 1, 16);
			}

			if (arg4 == 1) {
				method309(arg1, arg0, 4);
				method309(arg1 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method309(arg1, arg0, 16);
				method309(arg1 - 1, arg0 + 1, 1);
			}

			if (arg4 == 3) {
				method309(arg1, arg0, 64);
				method309(arg1 - 1, arg0 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg4 == 0) {
				method309(arg1, arg0, 130);
				method309(arg1, arg0 - 1, 8);
				method309(arg1 + 1, arg0, 32);
			}

			if (arg4 == 1) {
				method309(arg1, arg0, 10);
				method309(arg1 + 1, arg0, 32);
				method309(arg1, arg0 + 1, 128);
			}

			if (arg4 == 2) {
				method309(arg1, arg0, 40);
				method309(arg1, arg0 + 1, 128);
				method309(arg1 - 1, arg0, 2);
			}

			if (arg4 == 3) {
				method309(arg1, arg0, 160);
				method309(arg1 - 1, arg0, 2);
				method309(arg1, arg0 - 1, 8);
			}
		}

		if (arg2) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					method309(arg1, arg0, 0x10000);
					method309(arg1, arg0 - 1, 4096);
				}

				if (arg4 == 1) {
					method309(arg1, arg0, 1024);
					method309(arg1 + 1, arg0, 16384);
				}

				if (arg4 == 2) {
					method309(arg1, arg0, 4096);
					method309(arg1, arg0 + 1, 0x10000);
				}

				if (arg4 == 3) {
					method309(arg1, arg0, 16384);
					method309(arg1 - 1, arg0, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					method309(arg1, arg0, 512);
					method309(arg1 + 1, arg0 - 1, 8192);
				}

				if (arg4 == 1) {
					method309(arg1, arg0, 2048);
					method309(arg1 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method309(arg1, arg0, 8192);
					method309(arg1 - 1, arg0 + 1, 512);
				}

				if (arg4 == 3) {
					method309(arg1, arg0, 32768);
					method309(arg1 - 1, arg0 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg4 == 0) {
					method309(arg1, arg0, 66560);
					method309(arg1, arg0 - 1, 4096);
					method309(arg1 + 1, arg0, 16384);
				}

				if (arg4 == 1) {
					method309(arg1, arg0, 5120);
					method309(arg1 + 1, arg0, 16384);
					method309(arg1, arg0 + 1, 0x10000);
				}

				if (arg4 == 2) {
					method309(arg1, arg0, 20480);
					method309(arg1, arg0 + 1, 0x10000);
					method309(arg1 - 1, arg0, 1024);
				}

				if (arg4 == 3) {
					method309(arg1, arg0, 81920);
					method309(arg1 - 1, arg0, 1024);
					method309(arg1, arg0 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IBIIIZI)V")
	public void method308(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg0 -= field809;
		arg1 -= field810;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field811) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field812) {
						method309(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIII)V")
	public void method309(int arg0, int arg1, int arg2) {
		field813[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ec.b(III)V")
	public void method310(int arg0, int arg1) {
		arg0 -= field809;
		arg1 -= field810;
		field813[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(IIIIIII)Z")
	public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg0 == arg4) {
			return true;
		}

		arg5 -= field809;
		arg0 -= field810;
		arg1 -= field809;
		arg4 -= field810;
		if (arg2 == 0) {
			if (arg3 == 0) {
				if (arg1 - 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg0 && (field813[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg0 && (field813[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 == arg5 && arg4 + 1 == arg0) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 + 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg0 && (field813[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg0 && (field813[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 == arg5 && arg4 - 1 == arg0) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg3 == 0) {
				if (arg1 - 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg0 && (field813[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg0 && (field813[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg0 && (field813[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 - 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg0 && (field813[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg1 == arg5 && arg4 + 1 == arg0 && (field813[arg5][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg4 - 1 == arg0 && (field813[arg5][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg0 == arg4 && (field813[arg5][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIZI)Z")
	public boolean method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg2) {
			return true;
		}

		arg0 -= field809;
		arg2 -= field810;
		arg3 -= field809;
		arg1 -= field810;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg3 + 1 == arg0 && arg1 == arg2 && (field813[arg0][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg2 && (field813[arg0][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg3 - 1 == arg0 && arg1 == arg2 && (field813[arg0][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg2 && (field813[arg0][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 - 1 == arg0 && arg1 == arg2 && (field813[arg0][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg2 && (field813[arg0][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg3 + 1 == arg0 && arg1 == arg2 && (field813[arg0][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg2 && (field813[arg0][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg3 && arg1 + 1 == arg2 && (field813[arg0][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg2 && (field813[arg0][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg0 && arg1 == arg2 && (field813[arg0][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg0 && arg1 == arg2 && (field813[arg0][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIIII)Z")
	public boolean method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg5 - 1;
		int var9 = arg0 + arg1 - 1;
		if (arg6 >= arg5 && arg6 <= var8 && arg3 >= arg0 && arg3 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg6 && arg3 >= arg0 && arg3 <= var9 && (field813[arg6 - field809][arg3 - field810] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg3 >= arg0 && arg3 <= var9 && (field813[arg6 - field809][arg3 - field810] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg3 && arg6 >= arg5 && arg6 <= var8 && (field813[arg6 - field809][arg3 - field810] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg6 >= arg5 && arg6 <= var8 && (field813[arg6 - field809][arg3 - field810] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
