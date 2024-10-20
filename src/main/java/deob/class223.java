package deob;

@ObfuscatedName("hi")
public class class223 {

    @ObfuscatedName("hi.k")
    public int field3154 = 0;

    @ObfuscatedName("hi.at")
    public int field3159 = 0;

    @ObfuscatedName("hi.au")
    public int field3153;

    @ObfuscatedName("hi.aa")
    public int field3158;

    @ObfuscatedName("hi.ak")
    public int[][] field3161;

    public class223(int arg0, int arg1) {
        this.field3153 = arg0;
        this.field3158 = arg1;
        this.field3161 = new int[this.field3153][this.field3158];
        this.method3799();
    }

    @ObfuscatedName("hi.j(B)V")
    public void method3799() {
        for (int var1 = 0; var1 < this.field3153; var1++) {
            for (int var2 = 0; var2 < this.field3158; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field3153 - 5 || var2 >= this.field3158 - 5) {
                    this.field3161[var1][var2] = 16777215;
                } else {
                    this.field3161[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("hi.y(IIIIZI)V")
    public void method3800(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field3154;
        int var7 = arg1 - this.field3159;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3804(var6, var7, 128);
                this.method3804(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3804(var6, var7, 2);
                this.method3804(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3804(var6, var7, 8);
                this.method3804(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3804(var6, var7, 32);
                this.method3804(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3804(var6, var7, 1);
                this.method3804(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3804(var6, var7, 4);
                this.method3804(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3804(var6, var7, 16);
                this.method3804(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3804(var6, var7, 64);
                this.method3804(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3804(var6, var7, 130);
                this.method3804(var6 - 1, var7, 8);
                this.method3804(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3804(var6, var7, 10);
                this.method3804(var6, var7 + 1, 32);
                this.method3804(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3804(var6, var7, 40);
                this.method3804(var6 + 1, var7, 128);
                this.method3804(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3804(var6, var7, 160);
                this.method3804(var6, var7 - 1, 2);
                this.method3804(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3804(var6, var7, 65536);
                this.method3804(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3804(var6, var7, 1024);
                this.method3804(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3804(var6, var7, 4096);
                this.method3804(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3804(var6, var7, 16384);
                this.method3804(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3804(var6, var7, 512);
                this.method3804(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3804(var6, var7, 2048);
                this.method3804(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3804(var6, var7, 8192);
                this.method3804(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3804(var6, var7, 32768);
                this.method3804(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3804(var6, var7, 66560);
            this.method3804(var6 - 1, var7, 4096);
            this.method3804(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3804(var6, var7, 5120);
            this.method3804(var6, var7 + 1, 16384);
            this.method3804(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3804(var6, var7, 20480);
            this.method3804(var6 + 1, var7, 65536);
            this.method3804(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3804(var6, var7, 81920);
            this.method3804(var6, var7 - 1, 1024);
            this.method3804(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("hi.z(IIIIZI)V")
    public void method3805(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field3154;
        int var8 = arg1 - this.field3159;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field3153) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field3158) {
                        this.method3804(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hi.l(IIB)V")
    public void method3827(int arg0, int arg1) {
        int var3 = arg0 - this.field3154;
        int var4 = arg1 - this.field3159;
        this.field3161[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("hi.w(IIB)V")
    public void method3818(int arg0, int arg1) {
        int var3 = arg0 - this.field3154;
        int var4 = arg1 - this.field3159;
        this.field3161[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("hi.d(IIII)V")
    public void method3804(int arg0, int arg1, int arg2) {
        this.field3161[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("hi.f(IIIIZI)V")
    public void method3829(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field3154;
        int var7 = arg1 - this.field3159;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3807(var6, var7, 128);
                this.method3807(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3807(var6, var7, 2);
                this.method3807(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3807(var6, var7, 8);
                this.method3807(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3807(var6, var7, 32);
                this.method3807(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3807(var6, var7, 1);
                this.method3807(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3807(var6, var7, 4);
                this.method3807(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3807(var6, var7, 16);
                this.method3807(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3807(var6, var7, 64);
                this.method3807(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3807(var6, var7, 130);
                this.method3807(var6 - 1, var7, 8);
                this.method3807(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3807(var6, var7, 10);
                this.method3807(var6, var7 + 1, 32);
                this.method3807(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3807(var6, var7, 40);
                this.method3807(var6 + 1, var7, 128);
                this.method3807(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3807(var6, var7, 160);
                this.method3807(var6, var7 - 1, 2);
                this.method3807(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3807(var6, var7, 65536);
                this.method3807(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3807(var6, var7, 1024);
                this.method3807(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3807(var6, var7, 4096);
                this.method3807(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3807(var6, var7, 16384);
                this.method3807(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3807(var6, var7, 512);
                this.method3807(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3807(var6, var7, 2048);
                this.method3807(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3807(var6, var7, 8192);
                this.method3807(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3807(var6, var7, 32768);
                this.method3807(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3807(var6, var7, 66560);
            this.method3807(var6 - 1, var7, 4096);
            this.method3807(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3807(var6, var7, 5120);
            this.method3807(var6, var7 + 1, 16384);
            this.method3807(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3807(var6, var7, 20480);
            this.method3807(var6 + 1, var7, 65536);
            this.method3807(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3807(var6, var7, 81920);
            this.method3807(var6, var7 - 1, 1024);
            this.method3807(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("hi.i(IIIIIZI)V")
    public void method3806(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field3154;
        int var9 = arg1 - this.field3159;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field3153) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field3158) {
                        this.method3807(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hi.a(IIIB)V")
    public void method3807(int arg0, int arg1, int arg2) {
        this.field3161[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("hi.o(III)V")
    public void method3808(int arg0, int arg1) {
        int var3 = arg0 - this.field3154;
        int var4 = arg1 - this.field3159;
        this.field3161[var3][var4] &= 0xFFFBFFFF;
    }
}
