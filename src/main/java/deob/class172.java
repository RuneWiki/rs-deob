package deob;

@ObfuscatedName("fk")
public class class172 {

    @ObfuscatedName("fk.an")
    public int field2109 = 0;

    @ObfuscatedName("fk.at")
    public int field2112 = 0;

    @ObfuscatedName("fk.ae")
    public int field2115;

    @ObfuscatedName("fk.av")
    public int field2111;

    @ObfuscatedName("fk.au")
    public int[][] field2108;

    public class172(int arg0, int arg1) {
        this.field2115 = arg0;
        this.field2111 = arg1;
        this.field2108 = new int[this.field2115][this.field2111];
        this.method3334();
    }

    @ObfuscatedName("fk.a(I)V")
    public void method3334() {
        for (int var1 = 0; var1 < this.field2115; var1++) {
            for (int var2 = 0; var2 < this.field2111; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2115 - 5 || var2 >= this.field2111 - 5) {
                    this.field2108[var1][var2] = 16777215;
                } else {
                    this.field2108[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fk.s(IIIIZI)V")
    public void method3333(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2109;
        int var7 = arg1 - this.field2112;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3329(var6, var7, 128);
                this.method3329(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3329(var6, var7, 2);
                this.method3329(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3329(var6, var7, 8);
                this.method3329(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3329(var6, var7, 32);
                this.method3329(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3329(var6, var7, 1);
                this.method3329(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3329(var6, var7, 4);
                this.method3329(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3329(var6, var7, 16);
                this.method3329(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3329(var6, var7, 64);
                this.method3329(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3329(var6, var7, 130);
                this.method3329(var6 - 1, var7, 8);
                this.method3329(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3329(var6, var7, 10);
                this.method3329(var6, var7 + 1, 32);
                this.method3329(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3329(var6, var7, 40);
                this.method3329(var6 + 1, var7, 128);
                this.method3329(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3329(var6, var7, 160);
                this.method3329(var6, var7 - 1, 2);
                this.method3329(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3329(var6, var7, 65536);
                this.method3329(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3329(var6, var7, 1024);
                this.method3329(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3329(var6, var7, 4096);
                this.method3329(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3329(var6, var7, 16384);
                this.method3329(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3329(var6, var7, 512);
                this.method3329(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3329(var6, var7, 2048);
                this.method3329(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3329(var6, var7, 8192);
                this.method3329(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3329(var6, var7, 32768);
                this.method3329(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3329(var6, var7, 66560);
            this.method3329(var6 - 1, var7, 4096);
            this.method3329(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3329(var6, var7, 5120);
            this.method3329(var6, var7 + 1, 16384);
            this.method3329(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3329(var6, var7, 20480);
            this.method3329(var6 + 1, var7, 65536);
            this.method3329(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3329(var6, var7, 81920);
            this.method3329(var6, var7 - 1, 1024);
            this.method3329(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fk.g(IIIIZB)V")
    public void method3321(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2109;
        int var8 = arg1 - this.field2112;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2115) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2111) {
                        this.method3329(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.x(III)V")
    public void method3322(int arg0, int arg1) {
        int var3 = arg0 - this.field2109;
        int var4 = arg1 - this.field2112;
        this.field2108[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fk.h(III)V")
    public void method3332(int arg0, int arg1) {
        int var3 = arg0 - this.field2109;
        int var4 = arg1 - this.field2112;
        this.field2108[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fk.f(IIII)V")
    public void method3329(int arg0, int arg1, int arg2) {
        this.field2108[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fk.p(IIIIZI)V")
    public void method3324(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2109;
        int var7 = arg1 - this.field2112;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3326(var6, var7, 128);
                this.method3326(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3326(var6, var7, 2);
                this.method3326(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3326(var6, var7, 8);
                this.method3326(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3326(var6, var7, 32);
                this.method3326(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3326(var6, var7, 1);
                this.method3326(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3326(var6, var7, 4);
                this.method3326(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3326(var6, var7, 16);
                this.method3326(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3326(var6, var7, 64);
                this.method3326(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3326(var6, var7, 130);
                this.method3326(var6 - 1, var7, 8);
                this.method3326(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3326(var6, var7, 10);
                this.method3326(var6, var7 + 1, 32);
                this.method3326(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3326(var6, var7, 40);
                this.method3326(var6 + 1, var7, 128);
                this.method3326(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3326(var6, var7, 160);
                this.method3326(var6, var7 - 1, 2);
                this.method3326(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3326(var6, var7, 65536);
                this.method3326(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3326(var6, var7, 1024);
                this.method3326(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3326(var6, var7, 4096);
                this.method3326(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3326(var6, var7, 16384);
                this.method3326(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3326(var6, var7, 512);
                this.method3326(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3326(var6, var7, 2048);
                this.method3326(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3326(var6, var7, 8192);
                this.method3326(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3326(var6, var7, 32768);
                this.method3326(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3326(var6, var7, 66560);
            this.method3326(var6 - 1, var7, 4096);
            this.method3326(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3326(var6, var7, 5120);
            this.method3326(var6, var7 + 1, 16384);
            this.method3326(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3326(var6, var7, 20480);
            this.method3326(var6 + 1, var7, 65536);
            this.method3326(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3326(var6, var7, 81920);
            this.method3326(var6, var7 - 1, 1024);
            this.method3326(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fk.m(IIIIIZB)V")
    public void method3338(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2109;
        int var9 = arg1 - this.field2112;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2115) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2111) {
                        this.method3326(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.q(IIII)V")
    public void method3326(int arg0, int arg1, int arg2) {
        this.field2108[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fk.b(III)V")
    public void method3327(int arg0, int arg1) {
        int var3 = arg0 - this.field2109;
        int var4 = arg1 - this.field2112;
        this.field2108[var3][var4] &= 0xFFFBFFFF;
    }
}
