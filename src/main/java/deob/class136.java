package deob;

@ObfuscatedName("el")
public class class136 {

    @ObfuscatedName("el.aw")
    public int field1524 = 0;

    @ObfuscatedName("el.ap")
    public int field1532 = 0;

    @ObfuscatedName("el.ax")
    public int field1533;

    @ObfuscatedName("el.as")
    public int field1534;

    @ObfuscatedName("el.ad")
    public int[][] field1535;

    public class136(int arg0, int arg1) {
        this.field1533 = arg0;
        this.field1534 = arg1;
        this.field1535 = new int[this.field1533][this.field1534];
        this.method2301();
    }

    @ObfuscatedName("el.f(I)V")
    public void method2301() {
        for (int var1 = 0; var1 < this.field1533; var1++) {
            for (int var2 = 0; var2 < this.field1534; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1533 - 5 || var2 >= this.field1534 - 5) {
                    this.field1535[var1][var2] = 16777215;
                } else {
                    this.field1535[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("el.o(IIIIZI)V")
    public void method2302(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1524;
        int var7 = arg1 - this.field1532;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2306(var6, var7, 128);
                this.method2306(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2306(var6, var7, 2);
                this.method2306(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2306(var6, var7, 8);
                this.method2306(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2306(var6, var7, 32);
                this.method2306(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2306(var6, var7, 1);
                this.method2306(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2306(var6, var7, 4);
                this.method2306(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2306(var6, var7, 16);
                this.method2306(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2306(var6, var7, 64);
                this.method2306(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2306(var6, var7, 130);
                this.method2306(var6 - 1, var7, 8);
                this.method2306(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2306(var6, var7, 10);
                this.method2306(var6, var7 + 1, 32);
                this.method2306(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2306(var6, var7, 40);
                this.method2306(var6 + 1, var7, 128);
                this.method2306(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2306(var6, var7, 160);
                this.method2306(var6, var7 - 1, 2);
                this.method2306(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2306(var6, var7, 65536);
                this.method2306(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2306(var6, var7, 1024);
                this.method2306(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2306(var6, var7, 4096);
                this.method2306(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2306(var6, var7, 16384);
                this.method2306(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2306(var6, var7, 512);
                this.method2306(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2306(var6, var7, 2048);
                this.method2306(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2306(var6, var7, 8192);
                this.method2306(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2306(var6, var7, 32768);
                this.method2306(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2306(var6, var7, 66560);
            this.method2306(var6 - 1, var7, 4096);
            this.method2306(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2306(var6, var7, 5120);
            this.method2306(var6, var7 + 1, 16384);
            this.method2306(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2306(var6, var7, 20480);
            this.method2306(var6 + 1, var7, 65536);
            this.method2306(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2306(var6, var7, 81920);
            this.method2306(var6, var7 - 1, 1024);
            this.method2306(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("el.u(IIIIZI)V")
    public void method2326(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1524;
        int var8 = arg1 - this.field1532;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1533) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1534) {
                        this.method2306(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.p(IIB)V")
    public void method2304(int arg0, int arg1) {
        int var3 = arg0 - this.field1524;
        int var4 = arg1 - this.field1532;
        this.field1535[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("el.b(III)V")
    public void method2308(int arg0, int arg1) {
        int var3 = arg0 - this.field1524;
        int var4 = arg1 - this.field1532;
        this.field1535[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("el.e(IIII)V")
    public void method2306(int arg0, int arg1, int arg2) {
        this.field1535[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("el.k(IIIIZI)V")
    public void method2305(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1524;
        int var7 = arg1 - this.field1532;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2309(var6, var7, 128);
                this.method2309(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2309(var6, var7, 2);
                this.method2309(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2309(var6, var7, 8);
                this.method2309(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2309(var6, var7, 32);
                this.method2309(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2309(var6, var7, 1);
                this.method2309(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2309(var6, var7, 4);
                this.method2309(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2309(var6, var7, 16);
                this.method2309(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2309(var6, var7, 64);
                this.method2309(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2309(var6, var7, 130);
                this.method2309(var6 - 1, var7, 8);
                this.method2309(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2309(var6, var7, 10);
                this.method2309(var6, var7 + 1, 32);
                this.method2309(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2309(var6, var7, 40);
                this.method2309(var6 + 1, var7, 128);
                this.method2309(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2309(var6, var7, 160);
                this.method2309(var6, var7 - 1, 2);
                this.method2309(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2309(var6, var7, 65536);
                this.method2309(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2309(var6, var7, 1024);
                this.method2309(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2309(var6, var7, 4096);
                this.method2309(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2309(var6, var7, 16384);
                this.method2309(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2309(var6, var7, 512);
                this.method2309(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2309(var6, var7, 2048);
                this.method2309(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2309(var6, var7, 8192);
                this.method2309(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2309(var6, var7, 32768);
                this.method2309(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2309(var6, var7, 66560);
            this.method2309(var6 - 1, var7, 4096);
            this.method2309(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2309(var6, var7, 5120);
            this.method2309(var6, var7 + 1, 16384);
            this.method2309(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2309(var6, var7, 20480);
            this.method2309(var6 + 1, var7, 65536);
            this.method2309(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2309(var6, var7, 81920);
            this.method2309(var6, var7 - 1, 1024);
            this.method2309(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("el.g(IIIIIZI)V")
    public void method2335(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1524;
        int var9 = arg1 - this.field1532;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1533) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1534) {
                        this.method2309(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.h(IIIB)V")
    public void method2309(int arg0, int arg1, int arg2) {
        this.field1535[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("el.n(III)V")
    public void method2310(int arg0, int arg1) {
        int var3 = arg0 - this.field1524;
        int var4 = arg1 - this.field1532;
        this.field1535[var3][var4] &= 0xFFFBFFFF;
    }
}
