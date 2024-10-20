package deob;

@ObfuscatedName("iz")
public class class230 {

    @ObfuscatedName("iz.bk")
    public int field2440 = 0;

    @ObfuscatedName("iz.bm")
    public int field2442 = 0;

    @ObfuscatedName("iz.bw")
    public int field2443;

    @ObfuscatedName("iz.bv")
    public int field2444;

    @ObfuscatedName("iz.by")
    public int[][] field2445;

    public class230(int arg0, int arg1) {
        this.field2443 = arg0;
        this.field2444 = arg1;
        this.field2445 = new int[this.field2443][this.field2444];
        this.method4069();
    }

    @ObfuscatedName("iz.aq(I)V")
    public void method4069() {
        for (int var1 = 0; var1 < this.field2443; var1++) {
            for (int var2 = 0; var2 < this.field2444; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2443 - 5 || var2 >= this.field2444 - 5) {
                    this.field2445[var1][var2] = 16777215;
                } else {
                    this.field2445[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("iz.aw(IIIIZI)V")
    public void method4102(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2440;
        int var7 = arg1 - this.field2442;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4073(var6, var7, 128);
                this.method4073(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method4073(var6, var7, 2);
                this.method4073(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method4073(var6, var7, 8);
                this.method4073(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method4073(var6, var7, 32);
                this.method4073(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4073(var6, var7, 1);
                this.method4073(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method4073(var6, var7, 4);
                this.method4073(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method4073(var6, var7, 16);
                this.method4073(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method4073(var6, var7, 64);
                this.method4073(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method4073(var6, var7, 130);
                this.method4073(var6 - 1, var7, 8);
                this.method4073(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method4073(var6, var7, 10);
                this.method4073(var6, var7 + 1, 32);
                this.method4073(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method4073(var6, var7, 40);
                this.method4073(var6 + 1, var7, 128);
                this.method4073(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method4073(var6, var7, 160);
                this.method4073(var6, var7 - 1, 2);
                this.method4073(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4073(var6, var7, 65536);
                this.method4073(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method4073(var6, var7, 1024);
                this.method4073(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method4073(var6, var7, 4096);
                this.method4073(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method4073(var6, var7, 16384);
                this.method4073(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4073(var6, var7, 512);
                this.method4073(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method4073(var6, var7, 2048);
                this.method4073(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method4073(var6, var7, 8192);
                this.method4073(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method4073(var6, var7, 32768);
                this.method4073(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method4073(var6, var7, 66560);
            this.method4073(var6 - 1, var7, 4096);
            this.method4073(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method4073(var6, var7, 5120);
            this.method4073(var6, var7 + 1, 16384);
            this.method4073(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method4073(var6, var7, 20480);
            this.method4073(var6 + 1, var7, 65536);
            this.method4073(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method4073(var6, var7, 81920);
            this.method4073(var6, var7 - 1, 1024);
            this.method4073(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("iz.al(IIIIZI)V")
    public void method4070(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2440;
        int var8 = arg1 - this.field2442;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2443) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2444) {
                        this.method4073(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iz.ai(III)V")
    public void method4071(int arg0, int arg1) {
        int var3 = arg0 - this.field2440;
        int var4 = arg1 - this.field2442;
        this.field2445[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("iz.ar(III)V")
    public void method4082(int arg0, int arg1) {
        int var3 = arg0 - this.field2440;
        int var4 = arg1 - this.field2442;
        this.field2445[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("iz.as(IIIB)V")
    public void method4073(int arg0, int arg1, int arg2) {
        this.field2445[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("iz.aa(IIIIZI)V")
    public void method4074(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2440;
        int var7 = arg1 - this.field2442;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4076(var6, var7, 128);
                this.method4076(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method4076(var6, var7, 2);
                this.method4076(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method4076(var6, var7, 8);
                this.method4076(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method4076(var6, var7, 32);
                this.method4076(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4076(var6, var7, 1);
                this.method4076(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method4076(var6, var7, 4);
                this.method4076(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method4076(var6, var7, 16);
                this.method4076(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method4076(var6, var7, 64);
                this.method4076(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method4076(var6, var7, 130);
                this.method4076(var6 - 1, var7, 8);
                this.method4076(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method4076(var6, var7, 10);
                this.method4076(var6, var7 + 1, 32);
                this.method4076(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method4076(var6, var7, 40);
                this.method4076(var6 + 1, var7, 128);
                this.method4076(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method4076(var6, var7, 160);
                this.method4076(var6, var7 - 1, 2);
                this.method4076(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method4076(var6, var7, 65536);
                this.method4076(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method4076(var6, var7, 1024);
                this.method4076(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method4076(var6, var7, 4096);
                this.method4076(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method4076(var6, var7, 16384);
                this.method4076(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method4076(var6, var7, 512);
                this.method4076(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method4076(var6, var7, 2048);
                this.method4076(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method4076(var6, var7, 8192);
                this.method4076(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method4076(var6, var7, 32768);
                this.method4076(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method4076(var6, var7, 66560);
            this.method4076(var6 - 1, var7, 4096);
            this.method4076(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method4076(var6, var7, 5120);
            this.method4076(var6, var7 + 1, 16384);
            this.method4076(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method4076(var6, var7, 20480);
            this.method4076(var6 + 1, var7, 65536);
            this.method4076(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method4076(var6, var7, 81920);
            this.method4076(var6, var7 - 1, 1024);
            this.method4076(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("iz.az(IIIIIZI)V")
    public void method4083(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2440;
        int var9 = arg1 - this.field2442;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2443) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2444) {
                        this.method4076(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iz.ao(IIIB)V")
    public void method4076(int arg0, int arg1, int arg2) {
        this.field2445[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("iz.au(III)V")
    public void method4087(int arg0, int arg1) {
        int var3 = arg0 - this.field2440;
        int var4 = arg1 - this.field2442;
        this.field2445[var3][var4] &= 0xFFFBFFFF;
    }
}
