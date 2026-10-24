package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.f")
	public int field952 = 0;

	@ObfuscatedName("kc.g")
	public int field953 = 0;

	@ObfuscatedName("kc.h")
	public int field954;

	@ObfuscatedName("kc.i")
	public int field955;

	@ObfuscatedName("kc.j")
	public int[][] field956;

	public class63(int arg0, int arg1) {
		field954 = arg1;
		field955 = arg0;
		field956 = new int[field954][field955];
		method356();
	}

	@ObfuscatedName("kc.a(I)V")
	public void method356() {
		for (int var1 = 0; var1 < field954; var1++) {
			for (int var2 = 0; var2 < field955; var2++) {
				if (var1 == 0 || var2 == 0 || field954 - 1 == var1 || field955 - 1 == var2) {
					field956[var1][var2] = 0xFFFFFF;
				} else {
					field956[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(ZIIIII)V")
	public void method357(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 -= field952;
		arg1 -= field953;
		if (arg3 == 0) {
			if (arg2 == 0) {
				method360(arg4, arg1, 128);
				method360(arg4 - 1, arg1, 8);
			}

			if (arg2 == 1) {
				method360(arg4, arg1, 2);
				method360(arg4, arg1 + 1, 32);
			}

			if (arg2 == 2) {
				method360(arg4, arg1, 8);
				method360(arg4 + 1, arg1, 128);
			}

			if (arg2 == 3) {
				method360(arg4, arg1, 32);
				method360(arg4, arg1 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				method360(arg4, arg1, 1);
				method360(arg4 - 1, arg1 + 1, 16);
			}

			if (arg2 == 1) {
				method360(arg4, arg1, 4);
				method360(arg4 + 1, arg1 + 1, 64);
			}

			if (arg2 == 2) {
				method360(arg4, arg1, 16);
				method360(arg4 + 1, arg1 - 1, 1);
			}

			if (arg2 == 3) {
				method360(arg4, arg1, 64);
				method360(arg4 - 1, arg1 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				method360(arg4, arg1, 130);
				method360(arg4 - 1, arg1, 8);
				method360(arg4, arg1 + 1, 32);
			}

			if (arg2 == 1) {
				method360(arg4, arg1, 10);
				method360(arg4, arg1 + 1, 32);
				method360(arg4 + 1, arg1, 128);
			}

			if (arg2 == 2) {
				method360(arg4, arg1, 40);
				method360(arg4 + 1, arg1, 128);
				method360(arg4, arg1 - 1, 2);
			}

			if (arg2 == 3) {
				method360(arg4, arg1, 160);
				method360(arg4, arg1 - 1, 2);
				method360(arg4 - 1, arg1, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					method360(arg4, arg1, 0x10000);
					method360(arg4 - 1, arg1, 4096);
				}

				if (arg2 == 1) {
					method360(arg4, arg1, 1024);
					method360(arg4, arg1 + 1, 16384);
				}

				if (arg2 == 2) {
					method360(arg4, arg1, 4096);
					method360(arg4 + 1, arg1, 0x10000);
				}

				if (arg2 == 3) {
					method360(arg4, arg1, 16384);
					method360(arg4, arg1 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					method360(arg4, arg1, 512);
					method360(arg4 - 1, arg1 + 1, 8192);
				}

				if (arg2 == 1) {
					method360(arg4, arg1, 2048);
					method360(arg4 + 1, arg1 + 1, 32768);
				}

				if (arg2 == 2) {
					method360(arg4, arg1, 8192);
					method360(arg4 + 1, arg1 - 1, 512);
				}

				if (arg2 == 3) {
					method360(arg4, arg1, 32768);
					method360(arg4 - 1, arg1 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg2 == 0) {
					method360(arg4, arg1, 66560);
					method360(arg4 - 1, arg1, 4096);
					method360(arg4, arg1 + 1, 16384);
				}

				if (arg2 == 1) {
					method360(arg4, arg1, 5120);
					method360(arg4, arg1 + 1, 16384);
					method360(arg4 + 1, arg1, 0x10000);
				}

				if (arg2 == 2) {
					method360(arg4, arg1, 20480);
					method360(arg4 + 1, arg1, 0x10000);
					method360(arg4, arg1 - 1, 1024);
				}

				if (arg2 == 3) {
					method360(arg4, arg1, 81920);
					method360(arg4, arg1 - 1, 1024);
					method360(arg4 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(IIIIZII)V")
	public void method358(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field952;
		arg4 -= field953;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg5; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field954) {
				for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field955) {
						method360(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("kc.a(III)V")
	public void method359(int arg0, int arg1) {
		arg1 -= field952;
		arg0 -= field953;
		field956[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("kc.b(III)V")
	public void method360(int arg0, int arg1, int arg2) {
		field956[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("kc.a(IIIZII)V")
	public void method361(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field952;
		arg4 -= field953;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method363(arg4, 128, arg2);
				method363(arg4, 8, arg2 - 1);
			}

			if (arg1 == 1) {
				method363(arg4, 2, arg2);
				method363(arg4 + 1, 32, arg2);
			}

			if (arg1 == 2) {
				method363(arg4, 8, arg2);
				method363(arg4, 128, arg2 + 1);
			}

			if (arg1 == 3) {
				method363(arg4, 32, arg2);
				method363(arg4 - 1, 2, arg2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method363(arg4, 1, arg2);
				method363(arg4 + 1, 16, arg2 - 1);
			}

			if (arg1 == 1) {
				method363(arg4, 4, arg2);
				method363(arg4 + 1, 64, arg2 + 1);
			}

			if (arg1 == 2) {
				method363(arg4, 16, arg2);
				method363(arg4 - 1, 1, arg2 + 1);
			}

			if (arg1 == 3) {
				method363(arg4, 64, arg2);
				method363(arg4 - 1, 4, arg2 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method363(arg4, 130, arg2);
				method363(arg4, 8, arg2 - 1);
				method363(arg4 + 1, 32, arg2);
			}

			if (arg1 == 1) {
				method363(arg4, 10, arg2);
				method363(arg4 + 1, 32, arg2);
				method363(arg4, 128, arg2 + 1);
			}

			if (arg1 == 2) {
				method363(arg4, 40, arg2);
				method363(arg4, 128, arg2 + 1);
				method363(arg4 - 1, 2, arg2);
			}

			if (arg1 == 3) {
				method363(arg4, 160, arg2);
				method363(arg4 - 1, 2, arg2);
				method363(arg4, 8, arg2 - 1);
			}
		}

		if (arg3) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method363(arg4, 0x10000, arg2);
					method363(arg4, 4096, arg2 - 1);
				}

				if (arg1 == 1) {
					method363(arg4, 1024, arg2);
					method363(arg4 + 1, 16384, arg2);
				}

				if (arg1 == 2) {
					method363(arg4, 4096, arg2);
					method363(arg4, 0x10000, arg2 + 1);
				}

				if (arg1 == 3) {
					method363(arg4, 16384, arg2);
					method363(arg4 - 1, 1024, arg2);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method363(arg4, 512, arg2);
					method363(arg4 + 1, 8192, arg2 - 1);
				}

				if (arg1 == 1) {
					method363(arg4, 2048, arg2);
					method363(arg4 + 1, 32768, arg2 + 1);
				}

				if (arg1 == 2) {
					method363(arg4, 8192, arg2);
					method363(arg4 - 1, 512, arg2 + 1);
				}

				if (arg1 == 3) {
					method363(arg4, 32768, arg2);
					method363(arg4 - 1, 2048, arg2 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method363(arg4, 66560, arg2);
					method363(arg4, 4096, arg2 - 1);
					method363(arg4 + 1, 16384, arg2);
				}

				if (arg1 == 1) {
					method363(arg4, 5120, arg2);
					method363(arg4 + 1, 16384, arg2);
					method363(arg4, 0x10000, arg2 + 1);
				}

				if (arg1 == 2) {
					method363(arg4, 20480, arg2);
					method363(arg4, 0x10000, arg2 + 1);
					method363(arg4 - 1, 1024, arg2);
				}

				if (arg1 == 3) {
					method363(arg4, 81920, arg2);
					method363(arg4 - 1, 1024, arg2);
					method363(arg4, 4096, arg2 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(IIBZIII)V")
	public void method362(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg1 -= field952;
		arg0 -= field953;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg4; var9++) {
			if (var9 >= 0 && var9 < field954) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field955) {
						method363(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("kc.a(IBII)V")
	public void method363(int arg0, int arg1, int arg2) {
		field956[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("kc.c(III)V")
	public void method364(int arg0, int arg1) {
		arg0 -= field952;
		arg1 -= field953;
		field956[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("kc.a(IIIIIZI)Z")
	public boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg5 && arg1 == arg3) {
			return true;
		}

		arg5 -= field952;
		arg1 -= field953;
		arg2 -= field952;
		arg3 -= field953;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (arg2 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg1 && (field956[arg5][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg1 && (field956[arg5][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg2 == arg5 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg2 - 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg2 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg1 && (field956[arg5][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg1 && (field956[arg5][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg2 == arg5 && arg3 - 1 == arg1) {
					return true;
				}

				if (arg2 - 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				if (arg2 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280180) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg1 && (field956[arg5][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg2 - 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg1 && (field956[arg5][arg1] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg2 - 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280108) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg1 && (field956[arg5][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg2 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg1 && (field956[arg5][arg1] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x280180) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg2 == arg5 && arg3 + 1 == arg1 && (field956[arg5][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg5 && arg3 - 1 == arg1 && (field956[arg5][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg5 && arg1 == arg3 && (field956[arg5][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("kc.a(IBIIIII)Z")
	public boolean method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg2 == arg3) {
			return true;
		}

		arg1 -= field952;
		arg2 -= field953;
		arg0 -= field952;
		arg3 -= field953;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg0 + 1 == arg1 && arg2 == arg3 && (field956[arg1][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg2 && (field956[arg1][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg1 && arg2 == arg3 && (field956[arg1][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg2 && (field956[arg1][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg1 && arg2 == arg3 && (field956[arg1][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg2 && (field956[arg1][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 + 1 == arg1 && arg2 == arg3 && (field956[arg1][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg2 && (field956[arg1][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg0 == arg1 && arg3 + 1 == arg2 && (field956[arg1][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg3 - 1 == arg2 && (field956[arg1][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg2 == arg3 && (field956[arg1][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg2 == arg3 && (field956[arg1][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("kc.a(IIIIIIII)Z")
	public boolean method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg5 - 1;
		int var9 = arg3 + arg4 - 1;
		if (arg1 >= arg2 && arg1 <= var8 && arg6 >= arg3 && arg6 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg6 >= arg3 && arg6 <= var9 && (field956[arg1 - field952][arg6 - field953] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg6 >= arg3 && arg6 <= var9 && (field956[arg1 - field952][arg6 - field953] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg6 && arg1 >= arg2 && arg1 <= var8 && (field956[arg1 - field952][arg6 - field953] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg1 >= arg2 && arg1 <= var8 && (field956[arg1 - field952][arg6 - field953] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
