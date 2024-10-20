package deob;

@ObfuscatedName("fe")
public class class162 {

    @ObfuscatedName("fe.ad")
    public int field2678 = 0;

    @ObfuscatedName("fe.at")
    public int field2679 = 0;

    @ObfuscatedName("fe.as")
    public int field2680;

    @ObfuscatedName("fe.aw")
    public int field2676;

    @ObfuscatedName("fe.ax")
    public int[][] field2672;

    public class162(int arg0, int arg1) {
        this.field2680 = arg0;
        this.field2676 = arg1;
        this.field2672 = new int[this.field2680][this.field2676];
        this.method3185();
    }

    @ObfuscatedName("fe.z(B)V")
    public void method3185() {
        for (int var1 = 0; var1 < this.field2680; var1++) {
            for (int var2 = 0; var2 < this.field2676; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2680 - 5 || var2 >= this.field2676 - 5) {
                    this.field2672[var1][var2] = 16777215;
                } else {
                    this.field2672[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fe.h(IIIIZI)V")
    public void method3201(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2678;
        int var7 = arg1 - this.field2679;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3217(var6, var7, 128);
                this.method3217(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3217(var6, var7, 2);
                this.method3217(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3217(var6, var7, 8);
                this.method3217(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3217(var6, var7, 32);
                this.method3217(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3217(var6, var7, 1);
                this.method3217(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3217(var6, var7, 4);
                this.method3217(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3217(var6, var7, 16);
                this.method3217(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3217(var6, var7, 64);
                this.method3217(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3217(var6, var7, 130);
                this.method3217(var6 - 1, var7, 8);
                this.method3217(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3217(var6, var7, 10);
                this.method3217(var6, var7 + 1, 32);
                this.method3217(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3217(var6, var7, 40);
                this.method3217(var6 + 1, var7, 128);
                this.method3217(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3217(var6, var7, 160);
                this.method3217(var6, var7 - 1, 2);
                this.method3217(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3217(var6, var7, 65536);
                this.method3217(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3217(var6, var7, 1024);
                this.method3217(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3217(var6, var7, 4096);
                this.method3217(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3217(var6, var7, 16384);
                this.method3217(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3217(var6, var7, 512);
                this.method3217(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3217(var6, var7, 2048);
                this.method3217(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3217(var6, var7, 8192);
                this.method3217(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3217(var6, var7, 32768);
                this.method3217(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3217(var6, var7, 66560);
            this.method3217(var6 - 1, var7, 4096);
            this.method3217(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3217(var6, var7, 5120);
            this.method3217(var6, var7 + 1, 16384);
            this.method3217(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3217(var6, var7, 20480);
            this.method3217(var6 + 1, var7, 65536);
            this.method3217(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3217(var6, var7, 81920);
            this.method3217(var6, var7 - 1, 1024);
            this.method3217(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fe.c(IIIIZB)V")
    public void method3187(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2678;
        int var8 = arg1 - this.field2679;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2680) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2676) {
                        this.method3217(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.p(III)V")
    public void method3192(int arg0, int arg1) {
        int var3 = arg0 - this.field2678;
        int var4 = arg1 - this.field2679;
        this.field2672[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fe.i(III)V")
    public void method3188(int arg0, int arg1) {
        int var3 = arg0 - this.field2678;
        int var4 = arg1 - this.field2679;
        this.field2672[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fe.v(IIII)V")
    public void method3217(int arg0, int arg1, int arg2) {
        this.field2672[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fe.l(IIIIZI)V")
    public void method3200(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2678;
        int var7 = arg1 - this.field2679;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3191(var6, var7, 128);
                this.method3191(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3191(var6, var7, 2);
                this.method3191(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3191(var6, var7, 8);
                this.method3191(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3191(var6, var7, 32);
                this.method3191(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3191(var6, var7, 1);
                this.method3191(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3191(var6, var7, 4);
                this.method3191(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3191(var6, var7, 16);
                this.method3191(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3191(var6, var7, 64);
                this.method3191(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3191(var6, var7, 130);
                this.method3191(var6 - 1, var7, 8);
                this.method3191(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3191(var6, var7, 10);
                this.method3191(var6, var7 + 1, 32);
                this.method3191(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3191(var6, var7, 40);
                this.method3191(var6 + 1, var7, 128);
                this.method3191(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3191(var6, var7, 160);
                this.method3191(var6, var7 - 1, 2);
                this.method3191(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3191(var6, var7, 65536);
                this.method3191(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3191(var6, var7, 1024);
                this.method3191(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3191(var6, var7, 4096);
                this.method3191(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3191(var6, var7, 16384);
                this.method3191(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3191(var6, var7, 512);
                this.method3191(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3191(var6, var7, 2048);
                this.method3191(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3191(var6, var7, 8192);
                this.method3191(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3191(var6, var7, 32768);
                this.method3191(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3191(var6, var7, 66560);
            this.method3191(var6 - 1, var7, 4096);
            this.method3191(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3191(var6, var7, 5120);
            this.method3191(var6, var7 + 1, 16384);
            this.method3191(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3191(var6, var7, 20480);
            this.method3191(var6 + 1, var7, 65536);
            this.method3191(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3191(var6, var7, 81920);
            this.method3191(var6, var7 - 1, 1024);
            this.method3191(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fe.m(IIIIIZI)V")
    public void method3202(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2678;
        int var9 = arg1 - this.field2679;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2680) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2676) {
                        this.method3191(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.g(IIII)V")
    public void method3191(int arg0, int arg1, int arg2) {
        this.field2672[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fe.t(III)V")
    public void method3223(int arg0, int arg1) {
        int var3 = arg0 - this.field2678;
        int var4 = arg1 - this.field2679;
        this.field2672[var3][var4] &= 0xFFFBFFFF;
    }

    @ObfuscatedName("fe.o(IIIIIII)Z")
    public boolean method3194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var7 = arg0 - this.field2678;
        int var8 = arg1 - this.field2679;
        int var9 = arg2 - this.field2678;
        int var10 = arg3 - this.field2679;
        if (arg4 == 0) {
            if (arg5 == 0) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x20) == 0) {
                return true;
            }
            if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fe.b(IIIIIII)Z")
    public boolean method3184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var7 = arg0 - this.field2678;
        int var8 = arg1 - this.field2679;
        int var9 = arg2 - this.field2678;
        int var10 = arg3 - this.field2679;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x80) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x8) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x8) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x80) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var7 == var9 && var10 + 1 == var8 && (this.field2672[var7][var8] & 0x20) == 0) {
                return true;
            }
            if (var7 == var9 && var10 - 1 == var8 && (this.field2672[var7][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var7 && var8 == var10 && (this.field2672[var7][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fe.d(IIIIIIIB)Z")
    public boolean method3190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 + arg4 - 1;
        int var9 = arg3 + arg5 - 1;
        if (arg0 >= arg2 && arg0 <= var8 && arg1 >= arg3 && arg1 <= var9) {
            return true;
        } else if (arg2 - 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field2672[arg0 - this.field2678][arg1 - this.field2679] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var8 + 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field2672[arg0 - this.field2678][arg1 - this.field2679] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg1 && arg0 >= arg2 && arg0 <= var8 && (this.field2672[arg0 - this.field2678][arg1 - this.field2679] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg1 && arg0 >= arg2 && arg0 <= var8 && (this.field2672[arg0 - this.field2678][arg1 - this.field2679] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
