package deob;

@ObfuscatedName("ir")
public class class232 {

    @ObfuscatedName("ir.be")
    public int field2487 = 0;

    @ObfuscatedName("ir.bg")
    public int field2480 = 0;

    @ObfuscatedName("ir.bu")
    public int field2482;

    @ObfuscatedName("ir.bh")
    public int field2490;

    @ObfuscatedName("ir.bk")
    public int[][] field2481;

    public class232(int arg0, int arg1) {
        this.field2482 = arg0;
        this.field2490 = arg1;
        this.field2481 = new int[this.field2482][this.field2490];
        this.method4112();
    }

    @ObfuscatedName("ir.ak(I)V")
    public void method4112() {
        for (int var1 = 0; var1 < this.field2482; var1++) {
            for (int var2 = 0; var2 < this.field2490; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2482 - 5 || var2 >= this.field2490 - 5) {
                    this.field2481[var1][var2] = 16777215;
                } else {
                    this.field2481[var1][var2] = 1073741824;
                }
            }
        }
    }

    @ObfuscatedName("ir.al(IIIIZB)V")
    public void method4113(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2487;
        int var7 = arg1 - this.field2480;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4117(var6, var7, 128);
                this.method4117(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method4117(var6, var7, 2);
                this.method4117(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method4117(var6, var7, 8);
                this.method4117(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method4117(var6, var7, 32);
                this.method4117(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4117(var6, var7, 1);
                this.method4117(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method4117(var6, var7, 4);
                this.method4117(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method4117(var6, var7, 16);
                this.method4117(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method4117(var6, var7, 64);
                this.method4117(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method4117(var6, var7, 130);
                this.method4117(var6 - 1, var7, 8);
                this.method4117(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method4117(var6, var7, 10);
                this.method4117(var6, var7 + 1, 32);
                this.method4117(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method4117(var6, var7, 40);
                this.method4117(var6 + 1, var7, 128);
                this.method4117(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method4117(var6, var7, 160);
                this.method4117(var6, var7 - 1, 2);
                this.method4117(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4117(var6, var7, 65536);
                this.method4117(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method4117(var6, var7, 1024);
                this.method4117(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method4117(var6, var7, 4096);
                this.method4117(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method4117(var6, var7, 16384);
                this.method4117(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4117(var6, var7, 512);
                this.method4117(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method4117(var6, var7, 2048);
                this.method4117(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method4117(var6, var7, 8192);
                this.method4117(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method4117(var6, var7, 32768);
                this.method4117(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method4117(var6, var7, 66560);
            this.method4117(var6 - 1, var7, 4096);
            this.method4117(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method4117(var6, var7, 5120);
            this.method4117(var6, var7 + 1, 16384);
            this.method4117(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method4117(var6, var7, 20480);
            this.method4117(var6 + 1, var7, 65536);
            this.method4117(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method4117(var6, var7, 81920);
            this.method4117(var6, var7 - 1, 1024);
            this.method4117(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("ir.aj(IIIIZI)V")
    public void method4111(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2487;
        int var8 = arg1 - this.field2480;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2482) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2490) {
                        this.method4117(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ir.az(III)V")
    public void method4115(int arg0, int arg1) {
        int var3 = arg0 - this.field2487;
        int var4 = arg1 - this.field2480;
        this.field2481[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("ir.af(III)V")
    public void method4116(int arg0, int arg1) {
        int var3 = arg0 - this.field2487;
        int var4 = arg1 - this.field2480;
        this.field2481[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("ir.aa(IIII)V")
    public void method4117(int arg0, int arg1, int arg2) {
        this.field2481[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("ir.at(IIIIZI)V")
    public void method4134(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2487;
        int var7 = arg1 - this.field2480;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4119(var6, var7, 128);
                this.method4119(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method4119(var6, var7, 2);
                this.method4119(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method4119(var6, var7, 8);
                this.method4119(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method4119(var6, var7, 32);
                this.method4119(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4119(var6, var7, 1);
                this.method4119(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method4119(var6, var7, 4);
                this.method4119(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method4119(var6, var7, 16);
                this.method4119(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method4119(var6, var7, 64);
                this.method4119(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method4119(var6, var7, 130);
                this.method4119(var6 - 1, var7, 8);
                this.method4119(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method4119(var6, var7, 10);
                this.method4119(var6, var7 + 1, 32);
                this.method4119(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method4119(var6, var7, 40);
                this.method4119(var6 + 1, var7, 128);
                this.method4119(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method4119(var6, var7, 160);
                this.method4119(var6, var7 - 1, 2);
                this.method4119(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4119(var6, var7, 65536);
                this.method4119(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method4119(var6, var7, 1024);
                this.method4119(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method4119(var6, var7, 4096);
                this.method4119(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method4119(var6, var7, 16384);
                this.method4119(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4119(var6, var7, 512);
                this.method4119(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method4119(var6, var7, 2048);
                this.method4119(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method4119(var6, var7, 8192);
                this.method4119(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method4119(var6, var7, 32768);
                this.method4119(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method4119(var6, var7, 66560);
            this.method4119(var6 - 1, var7, 4096);
            this.method4119(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method4119(var6, var7, 5120);
            this.method4119(var6, var7 + 1, 16384);
            this.method4119(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method4119(var6, var7, 20480);
            this.method4119(var6 + 1, var7, 65536);
            this.method4119(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method4119(var6, var7, 81920);
            this.method4119(var6, var7 - 1, 1024);
            this.method4119(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("ir.ab(IIIIIZI)V")
    public void method4118(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 33554688;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2487;
        int var9 = arg1 - this.field2480;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2482) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2490) {
                        this.method4119(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ir.ac(IIIB)V")
    public void method4119(int arg0, int arg1, int arg2) {
        this.field2481[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("ir.ao(III)V")
    public void method4126(int arg0, int arg1) {
        int var3 = arg0 - this.field2487;
        int var4 = arg1 - this.field2480;
        this.field2481[var3][var4] &= 0xFFFBFFFF;
    }
}
