package deob;

@ObfuscatedName("bo")
public final class class62 extends class65 {

    @ObfuscatedName("bo.f")
    public class294 field573;

    @ObfuscatedName("bo.h")
    public class230 field582;

    @ObfuscatedName("bo.e")
    public int field571 = -1;

    @ObfuscatedName("bo.b")
    public int field596 = -1;

    @ObfuscatedName("bo.w")
    public String[] field575 = new String[3];

    @ObfuscatedName("bo.d")
    public int field576;

    @ObfuscatedName("bo.n")
    public int field577;

    @ObfuscatedName("bo.s")
    public int field570;

    @ObfuscatedName("bo.g")
    public int field595;

    @ObfuscatedName("bo.a")
    public int field580;

    @ObfuscatedName("bo.r")
    public int field581;

    @ObfuscatedName("bo.k")
    public int field578;

    @ObfuscatedName("bo.m")
    public int field583;

    @ObfuscatedName("bo.q")
    public class122 field584;

    @ObfuscatedName("bo.x")
    public int field585;

    @ObfuscatedName("bo.u")
    public int field586;

    @ObfuscatedName("bo.o")
    public int field587;

    @ObfuscatedName("bo.t")
    public int field593;

    @ObfuscatedName("bo.v")
    public boolean field589;

    @ObfuscatedName("bo.p")
    public int field590;

    @ObfuscatedName("bo.z")
    public boolean field572;

    @ObfuscatedName("bo.j")
    public int field592;

    @ObfuscatedName("bo.i")
    public int field588;

    @ObfuscatedName("bo.c")
    public class292 field594;

    @ObfuscatedName("bo.y")
    public class292 field597;

    @ObfuscatedName("bo.av")
    public boolean field591;

    @ObfuscatedName("bo.as")
    public int field579;

    @ObfuscatedName("bo.al")
    public int field598;

    public class62() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field575[var1] = "";
        }
        this.field576 = 0;
        this.field577 = 0;
        this.field595 = 0;
        this.field580 = 0;
        this.field589 = false;
        this.field590 = 0;
        this.field572 = false;
        this.field594 = class292.field3700;
        this.field597 = class292.field3700;
        this.field591 = false;
    }

    @ObfuscatedName("bo.f(Lgx;I)V")
    public final void method1056(class185 arg0) {
        arg0.field2397 = 0;
        int var2 = arg0.method3323();
        this.field571 = arg0.method3324();
        this.field596 = arg0.method3324();
        int var3 = -1;
        this.field590 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3323();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3323();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3325();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class272.method2892(var4[var5] - 512).field3495;
                    if (var8 != 0) {
                        this.field590 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3323();
            if (var11 < 0 || var11 >= Statics.field2631[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field908 = arg0.method3325();
        if (this.field908 == 65535) {
            this.field908 = -1;
        }
        this.field909 = arg0.method3325();
        if (this.field909 == 65535) {
            this.field909 = -1;
        }
        this.field916 = this.field909;
        this.field911 = arg0.method3325();
        if (this.field911 == 65535) {
            this.field911 = -1;
        }
        this.field910 = arg0.method3325();
        if (this.field910 == 65535) {
            this.field910 = -1;
        }
        this.field913 = arg0.method3325();
        if (this.field913 == 65535) {
            this.field913 = -1;
        }
        this.field914 = arg0.method3325();
        if (this.field914 == 65535) {
            this.field914 = -1;
        }
        this.field915 = arg0.method3325();
        if (this.field915 == 65535) {
            this.field915 = -1;
        }
        this.field573 = new class294(arg0.method3435(), Statics.field459);
        this.method1061();
        this.method1024();
        if (Statics.field502 == this) {
            Statics.field1983 = this.field573.method5059();
        }
        this.field576 = arg0.method3323();
        this.field577 = arg0.method3325();
        this.field572 = arg0.method3323() == 1;
        if (client.field612 == 0 && client.field780 >= 2) {
            this.field572 = false;
        }
        if (this.field582 == null) {
            this.field582 = new class230();
        }
        this.field582.method4137(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bo.h(I)Z")
    public boolean method1020() {
        if (class292.field3700 == this.field594) {
            this.method1022();
        }
        return class292.field3699 == this.field594;
    }

    @ObfuscatedName("bo.e(B)V")
    public void method1061() {
        this.field594 = class292.field3700;
    }

    @ObfuscatedName("bo.b(I)V")
    public void method1022() {
        this.field594 = Statics.field191.method1558(this.field573) ? class292.field3699 : class292.field3701;
    }

    @ObfuscatedName("bo.l(B)Z")
    public boolean method1023() {
        if (class292.field3700 == this.field597) {
            this.method1025();
        }
        return class292.field3699 == this.field597;
    }

    @ObfuscatedName("bo.w(I)V")
    public void method1024() {
        this.field597 = class292.field3700;
    }

    @ObfuscatedName("bo.d(I)V")
    public void method1025() {
        this.field597 = Statics.field1960 != null && Statics.field1960.method4968(this.field573) ? class292.field3699 : class292.field3701;
    }

    @ObfuscatedName("bo.n(I)I")
    public int method1018() {
        return this.field582 == null || this.field582.field2626 == -1 ? 1 : class274.method3290(this.field582.field2626).field3548;
    }

    @ObfuscatedName("bo.s(B)Lds;")
    public final class122 method1038() {
        if (this.field582 == null) {
            return null;
        }
        class276 var1 = this.field935 != -1 && this.field938 == 0 ? class276.method2865(this.field935) : null;
        class276 var2 = this.field906 == -1 || this.field589 || this.field908 == this.field906 && var1 != null ? null : class276.method2865(this.field906);
        class122 var3 = this.field582.method4138(var1, this.field936, var2, this.field951);
        if (var3 == null) {
            return null;
        }
        var3.method2534();
        this.field902 = var3.field1829;
        if (!this.field589 && this.field940 != -1 && this.field946 != -1) {
            class122 var4 = class261.method2874(this.field940).method4493(this.field946);
            if (var4 != null) {
                var4.method2501(0, -this.field941, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (!this.field589 && this.field584 != null) {
            if (client.field633 >= this.field580) {
                this.field584 = null;
            }
            if (client.field633 >= this.field595 && client.field633 < this.field580) {
                class122 var6 = this.field584;
                var6.method2501(this.field581 - this.field953, this.field578 - this.field570, this.field583 - this.field919);
                if (this.field954 == 512) {
                    var6.method2499();
                    var6.method2499();
                    var6.method2499();
                } else if (this.field954 == 1024) {
                    var6.method2499();
                    var6.method2499();
                } else if (this.field954 == 1536) {
                    var6.method2499();
                }
                class122[] var7 = new class122[] { var3, var6 };
                var3 = new class122(var7, 2);
                if (this.field954 == 512) {
                    var6.method2499();
                } else if (this.field954 == 1024) {
                    var6.method2499();
                    var6.method2499();
                } else if (this.field954 == 1536) {
                    var6.method2499();
                    var6.method2499();
                    var6.method2499();
                }
                var6.method2501(this.field953 - this.field581, this.field570 - this.field578, this.field919 - this.field583);
            }
        }
        var3.field1642 = true;
        return var3;
    }

    @ObfuscatedName("bo.g(IIBB)V")
    public final void method1027(int arg0, int arg1, byte arg2) {
        if (this.field935 != -1 && class276.method2865(this.field935).field3598 == 1) {
            this.field935 = -1;
        }
        this.field931 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1021(arg0, arg1);
        } else if (this.field958[0] >= 0 && this.field958[0] < 104 && this.field944[0] >= 0 && this.field944[0] < 104) {
            if (arg2 == 2) {
                class62 var4 = this;
                int var5 = this.field958[0];
                int var6 = this.field944[0];
                int var7 = this.method1018();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1018();
                    class169 var9 = client.method2934(arg0, arg1);
                    class167 var10 = client.field767[this.field592];
                    int[] var11 = client.field884;
                    int[] var12 = client.field674;
                    int var13 = 0;
                    label202: while (true) {
                        if (var13 >= 128) {
                            boolean var15;
                            if (var8 == 1) {
                                var15 = class168.method441(var5, var6, var9, var10);
                            } else if (var8 == 2) {
                                var15 = class168.method1733(var5, var6, var9, var10);
                            } else {
                                var15 = class168.method2994(var5, var6, var8, var9, var10);
                            }
                            int var34;
                            label223: {
                                int var16 = var5 - 64;
                                int var17 = var6 - 64;
                                int var18 = Statics.field1756;
                                int var19 = Statics.field2082;
                                if (!var15) {
                                    int var20 = Integer.MAX_VALUE;
                                    int var21 = Integer.MAX_VALUE;
                                    byte var22 = 10;
                                    int var23 = var9.field2092;
                                    int var24 = var9.field2099;
                                    int var25 = var9.field2093;
                                    int var26 = var9.field2090;
                                    for (int var27 = var23 - var22; var27 <= var22 + var23; var27++) {
                                        for (int var28 = var24 - var22; var28 <= var22 + var24; var28++) {
                                            int var29 = var27 - var16;
                                            int var30 = var28 - var17;
                                            if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class168.field2085[var29][var30] < 100) {
                                                int var31 = 0;
                                                if (var27 < var23) {
                                                    var31 = var23 - var27;
                                                } else if (var27 > var23 + var25 - 1) {
                                                    var31 = var27 - (var23 + var25 - 1);
                                                }
                                                int var32 = 0;
                                                if (var28 < var24) {
                                                    var32 = var24 - var28;
                                                } else if (var28 > var24 + var26 - 1) {
                                                    var32 = var28 - (var24 + var26 - 1);
                                                }
                                                int var33 = var31 * var31 + var32 * var32;
                                                if (var33 < var20 || var20 == var33 && class168.field2085[var29][var30] < var21) {
                                                    var20 = var33;
                                                    var21 = class168.field2085[var29][var30];
                                                    var18 = var27;
                                                    var19 = var28;
                                                }
                                            }
                                        }
                                    }
                                    if (var20 == Integer.MAX_VALUE) {
                                        var34 = -1;
                                        break label223;
                                    }
                                }
                                if (var5 == var18 && var6 == var19) {
                                    var34 = 0;
                                } else {
                                    byte var35 = 0;
                                    class168.field2084[var35] = var18;
                                    int var42 = var35 + 1;
                                    class168.field2088[var35] = var19;
                                    int var36;
                                    int var37 = var36 = class168.field2086[var18 - var16][var19 - var17];
                                    while (var5 != var18 || var6 != var19) {
                                        if (var36 != var37) {
                                            var36 = var37;
                                            class168.field2084[var42] = var18;
                                            class168.field2088[var42++] = var19;
                                        }
                                        if ((var37 & 0x2) != 0) {
                                            var18++;
                                        } else if ((var37 & 0x8) != 0) {
                                            var18--;
                                        }
                                        if ((var37 & 0x1) != 0) {
                                            var19++;
                                        } else if ((var37 & 0x4) != 0) {
                                            var19--;
                                        }
                                        var37 = class168.field2086[var18 - var16][var19 - var17];
                                    }
                                    int var38 = 0;
                                    while (var42-- > 0) {
                                        var11[var38] = class168.field2084[var42];
                                        var12[var38++] = class168.field2088[var42];
                                        if (var38 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var34 = var38;
                                }
                            }
                            int var39 = var34;
                            if (var34 < 1) {
                                break;
                            }
                            int var40 = 0;
                            while (true) {
                                if (var40 >= var39 - 1) {
                                    break label202;
                                }
                                var4.method1026(client.field884[var40], client.field674[var40], (byte) 2);
                                var40++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class168.field2086[var13][var14] = 0;
                            class168.field2085[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method1026(arg0, arg1, arg2);
        } else {
            this.method1021(arg0, arg1);
        }
    }

    @ObfuscatedName("bo.k(IIS)V")
    public void method1021(int arg0, int arg1) {
        this.field957 = 0;
        this.field962 = 0;
        this.field961 = 0;
        this.field958[0] = arg0;
        this.field944[0] = arg1;
        int var3 = this.method1018();
        this.field953 = this.field958[0] * 128 + var3 * 64;
        this.field919 = this.field944[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bo.m(IIBI)V")
    public final void method1026(int arg0, int arg1, byte arg2) {
        if (this.field957 < 9) {
            this.field957++;
        }
        for (int var4 = this.field957; var4 > 0; var4--) {
            this.field958[var4] = this.field958[var4 - 1];
            this.field944[var4] = this.field944[var4 - 1];
            this.field960[var4] = this.field960[var4 - 1];
        }
        this.field958[0] = arg0;
        this.field944[0] = arg1;
        this.field960[0] = arg2;
    }

    @ObfuscatedName("bo.q(I)Z")
    public final boolean method1030() {
        return this.field582 != null;
    }
}
