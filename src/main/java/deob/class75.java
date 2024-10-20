package deob;

@ObfuscatedName("bt")
public final class class75 extends class79 {

    @ObfuscatedName("bt.c")
    public String field884;

    @ObfuscatedName("bt.o")
    public class214 field888;

    @ObfuscatedName("bt.i")
    public int field878 = -1;

    @ObfuscatedName("bt.u")
    public int field879 = -1;

    @ObfuscatedName("bt.m")
    public String[] field881 = new String[3];

    @ObfuscatedName("bt.s")
    public int field880;

    @ObfuscatedName("bt.x")
    public int field882;

    @ObfuscatedName("bt.p")
    public int field883;

    @ObfuscatedName("bt.k")
    public int field905;

    @ObfuscatedName("bt.r")
    public int field876;

    @ObfuscatedName("bt.w")
    public int field886;

    @ObfuscatedName("bt.v")
    public int field887;

    @ObfuscatedName("bt.h")
    public int field877;

    @ObfuscatedName("bt.t")
    public class134 field889;

    @ObfuscatedName("bt.a")
    public int field890;

    @ObfuscatedName("bt.e")
    public int field891;

    @ObfuscatedName("bt.y")
    public int field892;

    @ObfuscatedName("bt.l")
    public int field893;

    @ObfuscatedName("bt.q")
    public boolean field898;

    @ObfuscatedName("bt.f")
    public int field895;

    @ObfuscatedName("bt.j")
    public boolean field894;

    @ObfuscatedName("bt.n")
    public int field897;

    @ObfuscatedName("bt.z")
    public int field902;

    @ObfuscatedName("bt.b")
    public boolean field899;

    @ObfuscatedName("bt.d")
    public int field900;

    @ObfuscatedName("bt.ap")
    public int field901;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field881[var1] = "";
        }
        this.field880 = 0;
        this.field882 = 0;
        this.field905 = 0;
        this.field876 = 0;
        this.field898 = false;
        this.field895 = 0;
        this.field894 = false;
        this.field899 = false;
    }

    @ObfuscatedName("bt.c(Lfp;I)V")
    public final void method1001(class174 arg0) {
        arg0.field2357 = 0;
        int var2 = arg0.method2843();
        this.field878 = arg0.method3014();
        this.field879 = arg0.method3014();
        int var3 = -1;
        this.field895 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2843();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2843();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2861();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method44(var4[var5] - 512).field3512;
                    if (var8 != 0) {
                        this.field895 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2843();
            if (var11 < 0 || var11 >= Statics.field2591[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1253 = arg0.method2861();
        if (this.field1253 == 65535) {
            this.field1253 = -1;
        }
        this.field1216 = arg0.method2861();
        if (this.field1216 == 65535) {
            this.field1216 = -1;
        }
        this.field1217 = this.field1216;
        this.field1218 = arg0.method2861();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1265 = arg0.method2861();
        if (this.field1265 == 65535) {
            this.field1265 = -1;
        }
        this.field1245 = arg0.method2861();
        if (this.field1245 == 65535) {
            this.field1245 = -1;
        }
        this.field1221 = arg0.method2861();
        if (this.field1221 == 65535) {
            this.field1221 = -1;
        }
        this.field1222 = arg0.method2861();
        if (this.field1222 == 65535) {
            this.field1222 = -1;
        }
        this.field884 = arg0.method2867();
        if (Statics.field3110 == this) {
            Statics.field2179 = this.field884;
        }
        this.field880 = arg0.method2843();
        this.field882 = arg0.method2861();
        this.field894 = arg0.method2843() == 1;
        if (client.field949 == 0 && client.field1072 >= 2) {
            this.field894 = false;
        }
        if (this.field888 == null) {
            this.field888 = new class214();
        }
        this.field888.method3597(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bt.o(I)I")
    public int method982() {
        return this.field888 == null || this.field888.field2587 == -1 ? 1 : class259.method200(this.field888.field2587).field3533;
    }

    @ObfuscatedName("bt.i(B)Leo;")
    public final class134 method983() {
        if (this.field888 == null) {
            return null;
        }
        class261 var1 = this.field1242 != -1 && this.field1232 == 0 ? Statics.method240(this.field1242) : null;
        class261 var2 = this.field1239 == -1 || this.field898 || this.field1253 == this.field1239 && var1 != null ? null : Statics.method240(this.field1239);
        class134 var3 = this.field888.method3603(var1, this.field1243, var2, this.field1215);
        if (var3 == null) {
            return null;
        }
        var3.method2240();
        this.field1260 = var3.field2085;
        if (!this.field898 && this.field1247 != -1 && this.field1248 != -1) {
            class134 var4 = class246.method3494(this.field1247).method3925(this.field1248);
            if (var4 != null) {
                var4.method2286(0, -this.field1251, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field898 && this.field889 != null) {
            if (client.field929 >= this.field876) {
                this.field889 = null;
            }
            if (client.field929 >= this.field905 && client.field929 < this.field876) {
                class134 var6 = this.field889;
                var6.method2286(this.field886 - this.field1211, this.field887 - this.field883, this.field877 - this.field1219);
                if (this.field1257 == 512) {
                    var6.method2246();
                    var6.method2246();
                    var6.method2246();
                } else if (this.field1257 == 1024) {
                    var6.method2246();
                    var6.method2246();
                } else if (this.field1257 == 1536) {
                    var6.method2246();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1257 == 512) {
                    var6.method2246();
                } else if (this.field1257 == 1024) {
                    var6.method2246();
                    var6.method2246();
                } else if (this.field1257 == 1536) {
                    var6.method2246();
                    var6.method2246();
                    var6.method2246();
                }
                var6.method2286(this.field1211 - this.field886, this.field883 - this.field887, this.field1219 - this.field877);
            }
        }
        var3.field1880 = true;
        return var3;
    }

    @ObfuscatedName("bt.u(IIBI)V")
    public final void method984(int arg0, int arg1, byte arg2) {
        if (this.field1242 != -1 && Statics.method240(this.field1242).field3596 == 1) {
            this.field1242 = -1;
        }
        this.field1238 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method985(arg0, arg1);
        } else if (this.field1210[0] >= 0 && this.field1210[0] < 104 && this.field1264[0] >= 0 && this.field1264[0] < 104) {
            if (arg2 == 2) {
                class75 var4 = this;
                int var5 = this.field1210[0];
                int var6 = this.field1264[0];
                int var7 = this.method982();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method982();
                    client.field1180.field2275 = arg0;
                    client.field1180.field2273 = arg1;
                    client.field1180.field2274 = 1;
                    client.field1180.field2276 = 1;
                    class74 var9 = client.field1180;
                    class162 var11 = client.field976[this.field897];
                    int[] var12 = client.field1181;
                    int[] var13 = client.field1182;
                    int var14 = 0;
                    label202: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class163.method1564(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                var16 = class163.method3371(var5, var6, var9, var11);
                            } else {
                                var16 = class163.method1351(var5, var6, var8, var9, var11);
                            }
                            int var35;
                            label223: {
                                int var17 = var5 - 64;
                                int var18 = var6 - 64;
                                int var19 = Statics.field2267;
                                int var20 = Statics.field2268;
                                if (!var16) {
                                    int var21 = Integer.MAX_VALUE;
                                    int var22 = Integer.MAX_VALUE;
                                    byte var23 = 10;
                                    int var24 = var9.field2275;
                                    int var25 = var9.field2273;
                                    int var26 = var9.field2274;
                                    int var27 = var9.field2276;
                                    for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
                                        for (int var29 = var25 - var23; var29 <= var23 + var25; var29++) {
                                            int var30 = var28 - var17;
                                            int var31 = var29 - var18;
                                            if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class163.field2266[var30][var31] < 100) {
                                                int var32 = 0;
                                                if (var28 < var24) {
                                                    var32 = var24 - var28;
                                                } else if (var28 > var24 + var26 - 1) {
                                                    var32 = var28 - (var24 + var26 - 1);
                                                }
                                                int var33 = 0;
                                                if (var29 < var25) {
                                                    var33 = var25 - var29;
                                                } else if (var29 > var25 + var27 - 1) {
                                                    var33 = var29 - (var25 + var27 - 1);
                                                }
                                                int var34 = var32 * var32 + var33 * var33;
                                                if (var34 < var21 || var21 == var34 && class163.field2266[var30][var31] < var22) {
                                                    var21 = var34;
                                                    var22 = class163.field2266[var30][var31];
                                                    var19 = var28;
                                                    var20 = var29;
                                                }
                                            }
                                        }
                                    }
                                    if (var21 == Integer.MAX_VALUE) {
                                        var35 = -1;
                                        break label223;
                                    }
                                }
                                if (var5 == var19 && var6 == var20) {
                                    var35 = 0;
                                } else {
                                    byte var36 = 0;
                                    class163.field2269[var36] = var19;
                                    int var43 = var36 + 1;
                                    class163.field2270[var36] = var20;
                                    int var37;
                                    int var38 = var37 = class163.field2263[var19 - var17][var20 - var18];
                                    while (var5 != var19 || var6 != var20) {
                                        if (var37 != var38) {
                                            var37 = var38;
                                            class163.field2269[var43] = var19;
                                            class163.field2270[var43++] = var20;
                                        }
                                        if ((var38 & 0x2) != 0) {
                                            var19++;
                                        } else if ((var38 & 0x8) != 0) {
                                            var19--;
                                        }
                                        if ((var38 & 0x1) != 0) {
                                            var20++;
                                        } else if ((var38 & 0x4) != 0) {
                                            var20--;
                                        }
                                        var38 = class163.field2263[var19 - var17][var20 - var18];
                                    }
                                    int var39 = 0;
                                    while (var43-- > 0) {
                                        var12[var39] = class163.field2269[var43];
                                        var13[var39++] = class163.field2270[var43];
                                        if (var39 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var35 = var39;
                                }
                            }
                            int var40 = var35;
                            if (var35 < 1) {
                                break;
                            }
                            int var41 = 0;
                            while (true) {
                                if (var41 >= var40 - 1) {
                                    break label202;
                                }
                                var4.method995(client.field1181[var41], client.field1182[var41], (byte) 2);
                                var41++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class163.field2263[var14][var15] = 0;
                            class163.field2266[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method995(arg0, arg1, arg2);
        } else {
            this.method985(arg0, arg1);
        }
    }

    @ObfuscatedName("bt.g(III)V")
    public void method985(int arg0, int arg1) {
        this.field1252 = 0;
        this.field1220 = 0;
        this.field1268 = 0;
        this.field1210[0] = arg0;
        this.field1264[0] = arg1;
        int var3 = this.method982();
        this.field1211 = this.field1210[0] * 128 + var3 * 64;
        this.field1219 = this.field1264[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bt.m(IIBI)V")
    public final void method995(int arg0, int arg1, byte arg2) {
        if (this.field1252 < 9) {
            this.field1252++;
        }
        for (int var4 = this.field1252; var4 > 0; var4--) {
            this.field1210[var4] = this.field1210[var4 - 1];
            this.field1264[var4] = this.field1264[var4 - 1];
            this.field1267[var4] = this.field1267[var4 - 1];
        }
        this.field1210[0] = arg0;
        this.field1264[0] = arg1;
        this.field1267[0] = arg2;
    }

    @ObfuscatedName("bt.s(I)Z")
    public final boolean method980() {
        return this.field888 != null;
    }
}
