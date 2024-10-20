package deob;

@ObfuscatedName("fb")
public class class177 {

    @ObfuscatedName("fb.af")
    public int field2267 = 0;

    @ObfuscatedName("fb.ai")
    public int field2263 = 0;

    @ObfuscatedName("fb.az")
    public int field2265;

    @ObfuscatedName("fb.aq")
    public int field2256;

    @ObfuscatedName("fb.ae")
    public int[][] field2266;

    public class177(int arg0, int arg1) {
        this.field2265 = arg0;
        this.field2256 = arg1;
        this.field2266 = new int[this.field2265][this.field2256];
        this.method3139();
    }

    @ObfuscatedName("fb.d(I)V")
    public void method3139() {
        for (int var1 = 0; var1 < this.field2265; var1++) {
            for (int var2 = 0; var2 < this.field2256; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2265 - 5 || var2 >= this.field2256 - 5) {
                    this.field2266[var1][var2] = 16777215;
                } else {
                    this.field2266[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fb.z(IIIIZI)V")
    public void method3114(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2267;
        int var7 = arg1 - this.field2263;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3113(var6, var7, 128);
                this.method3113(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3113(var6, var7, 2);
                this.method3113(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3113(var6, var7, 8);
                this.method3113(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3113(var6, var7, 32);
                this.method3113(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3113(var6, var7, 1);
                this.method3113(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3113(var6, var7, 4);
                this.method3113(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3113(var6, var7, 16);
                this.method3113(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3113(var6, var7, 64);
                this.method3113(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3113(var6, var7, 130);
                this.method3113(var6 - 1, var7, 8);
                this.method3113(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3113(var6, var7, 10);
                this.method3113(var6, var7 + 1, 32);
                this.method3113(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3113(var6, var7, 40);
                this.method3113(var6 + 1, var7, 128);
                this.method3113(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3113(var6, var7, 160);
                this.method3113(var6, var7 - 1, 2);
                this.method3113(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3113(var6, var7, 65536);
                this.method3113(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3113(var6, var7, 1024);
                this.method3113(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3113(var6, var7, 4096);
                this.method3113(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3113(var6, var7, 16384);
                this.method3113(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3113(var6, var7, 512);
                this.method3113(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3113(var6, var7, 2048);
                this.method3113(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3113(var6, var7, 8192);
                this.method3113(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3113(var6, var7, 32768);
                this.method3113(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3113(var6, var7, 66560);
            this.method3113(var6 - 1, var7, 4096);
            this.method3113(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3113(var6, var7, 5120);
            this.method3113(var6, var7 + 1, 16384);
            this.method3113(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3113(var6, var7, 20480);
            this.method3113(var6 + 1, var7, 65536);
            this.method3113(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3113(var6, var7, 81920);
            this.method3113(var6, var7 - 1, 1024);
            this.method3113(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fb.n(IIIIZI)V")
    public void method3115(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2267;
        int var8 = arg1 - this.field2263;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2265) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2256) {
                        this.method3113(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.r(III)V")
    public void method3112(int arg0, int arg1) {
        int var3 = arg0 - this.field2267;
        int var4 = arg1 - this.field2263;
        this.field2266[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fb.e(III)V")
    public void method3116(int arg0, int arg1) {
        int var3 = arg0 - this.field2267;
        int var4 = arg1 - this.field2263;
        this.field2266[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fb.y(IIII)V")
    public void method3113(int arg0, int arg1, int arg2) {
        this.field2266[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fb.k(IIIIZI)V")
    public void method3119(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2267;
        int var7 = arg1 - this.field2263;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3121(var6, var7, 128);
                this.method3121(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3121(var6, var7, 2);
                this.method3121(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3121(var6, var7, 8);
                this.method3121(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3121(var6, var7, 32);
                this.method3121(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3121(var6, var7, 1);
                this.method3121(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3121(var6, var7, 4);
                this.method3121(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3121(var6, var7, 16);
                this.method3121(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3121(var6, var7, 64);
                this.method3121(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3121(var6, var7, 130);
                this.method3121(var6 - 1, var7, 8);
                this.method3121(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3121(var6, var7, 10);
                this.method3121(var6, var7 + 1, 32);
                this.method3121(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3121(var6, var7, 40);
                this.method3121(var6 + 1, var7, 128);
                this.method3121(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3121(var6, var7, 160);
                this.method3121(var6, var7 - 1, 2);
                this.method3121(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3121(var6, var7, 65536);
                this.method3121(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3121(var6, var7, 1024);
                this.method3121(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3121(var6, var7, 4096);
                this.method3121(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3121(var6, var7, 16384);
                this.method3121(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3121(var6, var7, 512);
                this.method3121(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3121(var6, var7, 2048);
                this.method3121(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3121(var6, var7, 8192);
                this.method3121(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3121(var6, var7, 32768);
                this.method3121(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3121(var6, var7, 66560);
            this.method3121(var6 - 1, var7, 4096);
            this.method3121(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3121(var6, var7, 5120);
            this.method3121(var6, var7 + 1, 16384);
            this.method3121(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3121(var6, var7, 20480);
            this.method3121(var6 + 1, var7, 65536);
            this.method3121(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3121(var6, var7, 81920);
            this.method3121(var6, var7 - 1, 1024);
            this.method3121(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fb.s(IIIIIZI)V")
    public void method3123(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2267;
        int var9 = arg1 - this.field2263;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2265) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2256) {
                        this.method3121(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.x(IIII)V")
    public void method3121(int arg0, int arg1, int arg2) {
        this.field2266[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fb.h(IIB)V")
    public void method3127(int arg0, int arg1) {
        int var3 = arg0 - this.field2267;
        int var4 = arg1 - this.field2263;
        this.field2266[var3][var4] &= 0xFFFBFFFF;
    }
}
