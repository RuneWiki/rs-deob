package deob;

@ObfuscatedName("ko")
public class class271 {

    @ObfuscatedName("ko.bz")
    public int field3008 = 0;

    @ObfuscatedName("ko.bc")
    public int field3013 = 0;

    @ObfuscatedName("ko.by")
    public int field3015;

    @ObfuscatedName("ko.br")
    public int field3011;

    @ObfuscatedName("ko.bn")
    public int[][] field3012;

    public class271(int arg0, int arg1) {
        this.field3015 = arg0;
        this.field3011 = arg1;
        this.field3012 = new int[this.field3015][this.field3011];
        this.method5280();
    }

    @ObfuscatedName("ko.ap(I)V")
    public void method5280() {
        for (int var1 = 0; var1 < this.field3015; var1++) {
            for (int var2 = 0; var2 < this.field3011; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field3015 - 5 || var2 >= this.field3011 - 5) {
                    this.field3012[var1][var2] = 16777215;
                } else {
                    this.field3012[var1][var2] = 1073741824;
                }
            }
        }
    }

    @ObfuscatedName("ko.aw(IIIIZB)V")
    public void method5269(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field3008;
        int var7 = arg1 - this.field3013;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method5268(var6, var7, 128);
                this.method5268(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method5268(var6, var7, 2);
                this.method5268(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method5268(var6, var7, 8);
                this.method5268(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method5268(var6, var7, 32);
                this.method5268(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method5268(var6, var7, 1);
                this.method5268(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method5268(var6, var7, 4);
                this.method5268(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method5268(var6, var7, 16);
                this.method5268(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method5268(var6, var7, 64);
                this.method5268(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method5268(var6, var7, 130);
                this.method5268(var6 - 1, var7, 8);
                this.method5268(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method5268(var6, var7, 10);
                this.method5268(var6, var7 + 1, 32);
                this.method5268(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method5268(var6, var7, 40);
                this.method5268(var6 + 1, var7, 128);
                this.method5268(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method5268(var6, var7, 160);
                this.method5268(var6, var7 - 1, 2);
                this.method5268(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method5268(var6, var7, 65536);
                this.method5268(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method5268(var6, var7, 1024);
                this.method5268(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method5268(var6, var7, 4096);
                this.method5268(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method5268(var6, var7, 16384);
                this.method5268(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method5268(var6, var7, 512);
                this.method5268(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method5268(var6, var7, 2048);
                this.method5268(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method5268(var6, var7, 8192);
                this.method5268(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method5268(var6, var7, 32768);
                this.method5268(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method5268(var6, var7, 66560);
            this.method5268(var6 - 1, var7, 4096);
            this.method5268(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method5268(var6, var7, 5120);
            this.method5268(var6, var7 + 1, 16384);
            this.method5268(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method5268(var6, var7, 20480);
            this.method5268(var6 + 1, var7, 65536);
            this.method5268(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method5268(var6, var7, 81920);
            this.method5268(var6, var7 - 1, 1024);
            this.method5268(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("ko.ak(IIIIZB)V")
    public void method5270(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field3008;
        int var8 = arg1 - this.field3013;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field3015) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field3011) {
                        this.method5268(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ko.aj(IIB)V")
    public void method5271(int arg0, int arg1) {
        int var3 = arg0 - this.field3008;
        int var4 = arg1 - this.field3013;
        this.field3012[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("ko.ai(III)V")
    public void method5272(int arg0, int arg1) {
        int var3 = arg0 - this.field3008;
        int var4 = arg1 - this.field3013;
        this.field3012[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("ko.ay(IIII)V")
    public void method5268(int arg0, int arg1, int arg2) {
        this.field3012[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("ko.as(IIIIZI)V")
    public void method5299(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field3008;
        int var7 = arg1 - this.field3013;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method5276(var6, var7, 128);
                this.method5276(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method5276(var6, var7, 2);
                this.method5276(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method5276(var6, var7, 8);
                this.method5276(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method5276(var6, var7, 32);
                this.method5276(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method5276(var6, var7, 1);
                this.method5276(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method5276(var6, var7, 4);
                this.method5276(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method5276(var6, var7, 16);
                this.method5276(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method5276(var6, var7, 64);
                this.method5276(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method5276(var6, var7, 130);
                this.method5276(var6 - 1, var7, 8);
                this.method5276(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method5276(var6, var7, 10);
                this.method5276(var6, var7 + 1, 32);
                this.method5276(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method5276(var6, var7, 40);
                this.method5276(var6 + 1, var7, 128);
                this.method5276(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method5276(var6, var7, 160);
                this.method5276(var6, var7 - 1, 2);
                this.method5276(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method5276(var6, var7, 65536);
                this.method5276(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method5276(var6, var7, 1024);
                this.method5276(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method5276(var6, var7, 4096);
                this.method5276(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method5276(var6, var7, 16384);
                this.method5276(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method5276(var6, var7, 512);
                this.method5276(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method5276(var6, var7, 2048);
                this.method5276(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method5276(var6, var7, 8192);
                this.method5276(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method5276(var6, var7, 32768);
                this.method5276(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method5276(var6, var7, 66560);
            this.method5276(var6 - 1, var7, 4096);
            this.method5276(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method5276(var6, var7, 5120);
            this.method5276(var6, var7 + 1, 16384);
            this.method5276(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method5276(var6, var7, 20480);
            this.method5276(var6 + 1, var7, 65536);
            this.method5276(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method5276(var6, var7, 81920);
            this.method5276(var6, var7 - 1, 1024);
            this.method5276(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("ko.ae(IIIIIZI)V")
    public void method5275(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 33554688;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field3008;
        int var9 = arg1 - this.field3013;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field3015) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field3011) {
                        this.method5276(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ko.am(IIIB)V")
    public void method5276(int arg0, int arg1, int arg2) {
        this.field3012[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("ko.at(III)V")
    public void method5301(int arg0, int arg1) {
        int var3 = arg0 - this.field3008;
        int var4 = arg1 - this.field3013;
        this.field3012[var3][var4] &= 0xFFFBFFFF;
    }
}
