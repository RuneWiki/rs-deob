package deob;

@ObfuscatedName("s")
public final class class3 extends class38 {

    @ObfuscatedName("s.n")
    public String field38;

    @ObfuscatedName("s.d")
    public class179 field30;

    @ObfuscatedName("s.s")
    public int field45 = -1;

    @ObfuscatedName("s.q")
    public int field32 = -1;

    @ObfuscatedName("s.j")
    public int field29 = 0;

    @ObfuscatedName("s.k")
    public int field34 = 0;

    @ObfuscatedName("s.i")
    public int field31;

    @ObfuscatedName("s.m")
    public int field36 = 0;

    @ObfuscatedName("s.p")
    public int field37 = 0;

    @ObfuscatedName("s.h")
    public int field33;

    @ObfuscatedName("s.e")
    public int field39;

    @ObfuscatedName("s.g")
    public int field40;

    @ObfuscatedName("s.b")
    public class105 field41;

    @ObfuscatedName("s.f")
    public int field42;

    @ObfuscatedName("s.y")
    public int field43;

    @ObfuscatedName("s.z")
    public int field35;

    @ObfuscatedName("s.t")
    public int field52;

    @ObfuscatedName("s.o")
    public boolean field46 = false;

    @ObfuscatedName("s.r")
    public int field47 = 0;

    @ObfuscatedName("s.u")
    public boolean field48 = false;

    @ObfuscatedName("s.v")
    public int field49;

    @ObfuscatedName("s.a")
    public int field44;

    @ObfuscatedName("s.c")
    public int field51;

    @ObfuscatedName("s.l")
    public int field50;

    @ObfuscatedName("s.n(Ldq;I)V")
    public final void method30(class119 arg0) {
        arg0.field1977 = 0;
        int var2 = arg0.method2338();
        this.field45 = arg0.method2330();
        this.field32 = arg0.method2330();
        int var3 = -1;
        this.field47 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2338();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2338();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2377();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2651(var4[var5] - 512).field1115;
                    if (var8 != 0) {
                        this.field47 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2338();
            if (var11 < 0 || var11 >= Statics.field2905[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field795 = arg0.method2377();
        if (this.field795 == 65535) {
            this.field795 = -1;
        }
        this.field796 = arg0.method2377();
        if (this.field796 == 65535) {
            this.field796 = -1;
        }
        this.field846 = this.field796;
        this.field798 = arg0.method2377();
        if (this.field798 == 65535) {
            this.field798 = -1;
        }
        this.field799 = arg0.method2377();
        if (this.field799 == 65535) {
            this.field799 = -1;
        }
        this.field840 = arg0.method2377();
        if (this.field840 == 65535) {
            this.field840 = -1;
        }
        this.field801 = arg0.method2377();
        if (this.field801 == 65535) {
            this.field801 = -1;
        }
        this.field802 = arg0.method2377();
        if (this.field802 == 65535) {
            this.field802 = -1;
        }
        this.field38 = arg0.method2492();
        if (Statics.field119 == this) {
            Statics.field2128 = this.field38;
        }
        this.field29 = arg0.method2338();
        this.field34 = arg0.method2377();
        this.field48 = arg0.method2338() == 1;
        if (client.field275 == 0 && client.field536 >= 2) {
            this.field48 = false;
        }
        if (this.field30 == null) {
            this.field30 = new class179();
        }
        this.field30.method3255(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("s.d(I)I")
    public int method25() {
        return this.field30 == null || this.field30.field2899 == -1 ? 1 : class40.method639(this.field30.field2899).field866;
    }

    @ObfuscatedName("s.s(I)Ldb;")
    public final class105 method36() {
        if (this.field30 == null) {
            return null;
        }
        class43 var1 = this.field821 != -1 && this.field824 == 0 ? class43.method2827(this.field821) : null;
        class43 var2 = this.field818 == -1 || this.field46 || this.field818 == this.field795 && var1 != null ? null : class43.method2827(this.field818);
        class105 var3 = this.field30.method3248(var1, this.field822, var2, this.field819);
        if (var3 == null) {
            return null;
        }
        var3.method2168();
        this.field833 = var3.field1442;
        if (!this.field46 && this.field810 != -1 && this.field839 != -1) {
            class105 var4 = class44.method17(this.field810).method866(this.field839);
            if (var4 != null) {
                var4.method2137(0, -this.field830, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field46 && this.field41 != null) {
            if (client.field347 >= this.field37) {
                this.field41 = null;
            }
            if (client.field347 >= this.field36 && client.field347 < this.field37) {
                class105 var6 = this.field41;
                var6.method2137(this.field33 - this.field816, this.field39 - this.field31, this.field40 - this.field815);
                if (this.field845 == 512) {
                    var6.method2133();
                    var6.method2133();
                    var6.method2133();
                } else if (this.field845 == 1024) {
                    var6.method2133();
                    var6.method2133();
                } else if (this.field845 == 1536) {
                    var6.method2133();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field845 == 512) {
                    var6.method2133();
                } else if (this.field845 == 1024) {
                    var6.method2133();
                    var6.method2133();
                } else if (this.field845 == 1536) {
                    var6.method2133();
                    var6.method2133();
                    var6.method2133();
                }
                var6.method2137(this.field816 - this.field33, this.field31 - this.field39, this.field815 - this.field40);
            }
        }
        var3.field1802 = true;
        return var3;
    }

    @ObfuscatedName("s.q(IIBB)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field821 != -1 && class43.method2827(this.field821).field983 == 1) {
            this.field821 = -1;
        }
        this.field834 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method20(this.field816, this.field815);
        } else if (this.field844[0] >= 0 && this.field844[0] < 104 && this.field809[0] >= 0 && this.field809[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field844[0];
                int var6 = this.field809[0];
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104 && arg0 >= 0 && arg0 < 104 && arg1 >= 0 && arg1 < 104) {
                    int var7 = this.method25();
                    class107 var8 = client.method1927(arg0, arg1);
                    class108 var9 = client.field393[this.field49];
                    int[] var10 = client.field486;
                    int[] var11 = client.field359;
                    int var12 = 0;
                    label202: while (true) {
                        if (var12 >= 128) {
                            boolean var14;
                            if (var7 == 1) {
                                var14 = class106.method541(var5, var6, var8, var9);
                            } else if (var7 == 2) {
                                var14 = class106.method642(var5, var6, var8, var9);
                            } else {
                                var14 = class106.method1920(var5, var6, var7, var8, var9);
                            }
                            int var33;
                            label223: {
                                int var15 = var5 - 64;
                                int var16 = var6 - 64;
                                int var17 = Statics.field1171;
                                int var18 = Statics.field2720;
                                if (!var14) {
                                    int var19 = Integer.MAX_VALUE;
                                    int var20 = Integer.MAX_VALUE;
                                    byte var21 = 10;
                                    int var22 = var8.field1865;
                                    int var23 = var8.field1861;
                                    int var24 = var8.field1860;
                                    int var25 = var8.field1862;
                                    for (int var26 = var22 - var21; var26 <= var21 + var22; var26++) {
                                        for (int var27 = var23 - var21; var27 <= var21 + var23; var27++) {
                                            int var28 = var26 - var15;
                                            int var29 = var27 - var16;
                                            if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class106.field1852[var28][var29] < 100) {
                                                int var30 = 0;
                                                if (var26 < var22) {
                                                    var30 = var22 - var26;
                                                } else if (var26 > var22 + var24 - 1) {
                                                    var30 = var26 - (var22 + var24 - 1);
                                                }
                                                int var31 = 0;
                                                if (var27 < var23) {
                                                    var31 = var23 - var27;
                                                } else if (var27 > var23 + var25 - 1) {
                                                    var31 = var27 - (var23 + var25 - 1);
                                                }
                                                int var32 = var30 * var30 + var31 * var31;
                                                if (var32 < var19 || var19 == var32 && class106.field1852[var28][var29] < var20) {
                                                    var19 = var32;
                                                    var20 = class106.field1852[var28][var29];
                                                    var17 = var26;
                                                    var18 = var27;
                                                }
                                            }
                                        }
                                    }
                                    if (var19 == Integer.MAX_VALUE) {
                                        var33 = -1;
                                        break label223;
                                    }
                                }
                                if (var5 == var17 && var6 == var18) {
                                    var33 = 0;
                                } else {
                                    byte var34 = 0;
                                    class106.field1853[var34] = var17;
                                    int var41 = var34 + 1;
                                    class106.field1855[var34] = var18;
                                    int var35;
                                    int var36 = var35 = class106.field1849[var17 - var15][var18 - var16];
                                    while (var5 != var17 || var6 != var18) {
                                        if (var35 != var36) {
                                            var35 = var36;
                                            class106.field1853[var41] = var17;
                                            class106.field1855[var41++] = var18;
                                        }
                                        if ((var36 & 0x2) != 0) {
                                            var17++;
                                        } else if ((var36 & 0x8) != 0) {
                                            var17--;
                                        }
                                        if ((var36 & 0x1) != 0) {
                                            var18++;
                                        } else if ((var36 & 0x4) != 0) {
                                            var18--;
                                        }
                                        var36 = class106.field1849[var17 - var15][var18 - var16];
                                    }
                                    int var37 = 0;
                                    while (var41-- > 0) {
                                        var10[var37] = class106.field1853[var41];
                                        var11[var37++] = class106.field1855[var41];
                                        if (var37 >= var10.length) {
                                            break;
                                        }
                                    }
                                    var33 = var37;
                                }
                            }
                            int var38 = var33;
                            if (var33 < 1) {
                                break;
                            }
                            int var39 = 0;
                            while (true) {
                                if (var39 >= var38 - 1) {
                                    break label202;
                                }
                                var4.method38(client.field486[var39], client.field359[var39], (byte) 2);
                                var39++;
                            }
                        }
                        for (int var13 = 0; var13 < 128; var13++) {
                            class106.field1849[var12][var13] = 0;
                            class106.field1852[var12][var13] = 99999999;
                        }
                        var12++;
                    }
                }
            }
            this.method38(arg0, arg1, arg2);
        } else {
            this.method20(this.field816, this.field815);
        }
    }

    @ObfuscatedName("s.j(III)V")
    public void method20(int arg0, int arg1) {
        this.field843 = 0;
        this.field820 = 0;
        this.field847 = 0;
        this.field844[0] = arg0;
        this.field809[0] = arg1;
        int var3 = this.method25();
        this.field816 = this.field844[0] * 128 + var3 * 64;
        this.field815 = this.field809[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("s.k(IIBI)V")
    public final void method38(int arg0, int arg1, byte arg2) {
        if (this.field843 < 9) {
            this.field843++;
        }
        for (int var4 = this.field843; var4 > 0; var4--) {
            this.field844[var4] = this.field844[var4 - 1];
            this.field809[var4] = this.field809[var4 - 1];
            this.field817[var4] = this.field817[var4 - 1];
        }
        this.field844[0] = arg0;
        this.field809[0] = arg1;
        this.field817[0] = arg2;
    }

    @ObfuscatedName("s.i(I)Z")
    public final boolean method21() {
        return this.field30 != null;
    }
}
