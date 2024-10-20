package deob;

@ObfuscatedName("ba")
public final class class67 extends class70 {

    @ObfuscatedName("ba.c")
    public class284 field626;

    @ObfuscatedName("ba.t")
    public class215 field612;

    @ObfuscatedName("ba.o")
    public int field632 = -1;

    @ObfuscatedName("ba.e")
    public int field635 = -1;

    @ObfuscatedName("ba.g")
    public String[] field617 = new String[3];

    @ObfuscatedName("ba.d")
    public int field618;

    @ObfuscatedName("ba.l")
    public int field619;

    @ObfuscatedName("ba.j")
    public int field620;

    @ObfuscatedName("ba.m")
    public int field634;

    @ObfuscatedName("ba.p")
    public int field613;

    @ObfuscatedName("ba.h")
    public int field623;

    @ObfuscatedName("ba.v")
    public int field624;

    @ObfuscatedName("ba.n")
    public int field621;

    @ObfuscatedName("ba.x")
    public class128 field631;

    @ObfuscatedName("ba.w")
    public int field627;

    @ObfuscatedName("ba.k")
    public int field628;

    @ObfuscatedName("ba.q")
    public int field629;

    @ObfuscatedName("ba.z")
    public int field630;

    @ObfuscatedName("ba.y")
    public boolean field615;

    @ObfuscatedName("ba.f")
    public int field638;

    @ObfuscatedName("ba.b")
    public boolean field633;

    @ObfuscatedName("ba.r")
    public int field614;

    @ObfuscatedName("ba.s")
    public int field625;

    @ObfuscatedName("ba.a")
    public class282 field636;

    @ObfuscatedName("ba.u")
    public class282 field637;

    @ObfuscatedName("ba.ae")
    public boolean field622;

    @ObfuscatedName("ba.af")
    public int field639;

    @ObfuscatedName("ba.az")
    public int field640;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field617[var1] = "";
        }
        this.field618 = 0;
        this.field619 = 0;
        this.field634 = 0;
        this.field613 = 0;
        this.field615 = false;
        this.field638 = 0;
        this.field633 = false;
        this.field636 = class282.field3606;
        this.field637 = class282.field3606;
        this.field622 = false;
    }

    @ObfuscatedName("ba.c(Lkp;B)V")
    public final void method1110(class301 arg0) {
        arg0.field3707 = 0;
        int var2 = arg0.method5129();
        this.field632 = arg0.method5130();
        this.field635 = arg0.method5130();
        int var3 = -1;
        this.field638 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5129();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5129();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5124();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class256.method4164(var4[var5] - 512).field3445;
                    if (var8 != 0) {
                        this.field638 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5129();
            if (var11 < 0 || var11 >= Statics.field2546[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field945 = arg0.method5124();
        if (this.field945 == 65535) {
            this.field945 = -1;
        }
        this.field951 = arg0.method5124();
        if (this.field951 == 65535) {
            this.field951 = -1;
        }
        this.field947 = this.field951;
        this.field994 = arg0.method5124();
        if (this.field994 == 65535) {
            this.field994 = -1;
        }
        this.field967 = arg0.method5124();
        if (this.field967 == 65535) {
            this.field967 = -1;
        }
        this.field977 = arg0.method5124();
        if (this.field977 == 65535) {
            this.field977 = -1;
        }
        this.field960 = arg0.method5124();
        if (this.field960 == 65535) {
            this.field960 = -1;
        }
        this.field952 = arg0.method5124();
        if (this.field952 == 65535) {
            this.field952 = -1;
        }
        this.field626 = new class284(arg0.method5138(), Statics.field2390);
        this.method1112();
        this.method1133();
        if (Statics.field2392 == this) {
            Statics.field4046 = this.field626.method4829();
        }
        this.field618 = arg0.method5129();
        this.field619 = arg0.method5124();
        this.field633 = arg0.method5129() == 1;
        if (client.field816 == 0 && client.field684 >= 2) {
            this.field633 = false;
        }
        if (this.field612 == null) {
            this.field612 = new class215();
        }
        this.field612.method3688(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("ba.t(I)Z")
    public boolean method1138() {
        if (class282.field3606 == this.field636) {
            this.method1109();
        }
        return class282.field3605 == this.field636;
    }

    @ObfuscatedName("ba.o(B)V")
    public void method1112() {
        this.field636 = class282.field3606;
    }

    @ObfuscatedName("ba.e(I)V")
    public void method1109() {
        this.field636 = Statics.field415.method1739(this.field626) ? class282.field3605 : class282.field3604;
    }

    @ObfuscatedName("ba.i(I)Z")
    public boolean method1122() {
        if (class282.field3606 == this.field637) {
            this.method1143();
        }
        return class282.field3605 == this.field637;
    }

    @ObfuscatedName("ba.g(I)V")
    public void method1133() {
        this.field637 = class282.field3606;
    }

    @ObfuscatedName("ba.d(I)V")
    public void method1143() {
        this.field637 = Statics.field568 != null && Statics.field568.method4735(this.field626) ? class282.field3605 : class282.field3604;
    }

    @ObfuscatedName("ba.l(I)I")
    public int method1130() {
        return this.field612 == null || this.field612.field2544 == -1 ? 1 : class258.method3989(this.field612.field2544).field3484;
    }

    @ObfuscatedName("ba.j(I)Ldx;")
    public final class128 method1118() {
        if (this.field612 == null) {
            return null;
        }
        class260 var1 = this.field995 != -1 && this.field975 == 0 ? class260.method5476(this.field995) : null;
        class260 var2 = this.field969 == -1 || this.field615 || this.field969 == this.field945 && var1 != null ? null : class260.method5476(this.field969);
        class128 var3 = this.field612.method3694(var1, this.field973, var2, this.field970);
        if (var3 == null) {
            return null;
        }
        var3.method2722();
        this.field954 = var3.field1869;
        if (!this.field615 && this.field985 != -1 && this.field979 != -1) {
            class128 var4 = class245.method1108(this.field985).method4090(this.field979);
            if (var4 != null) {
                var4.method2680(0, -this.field981, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field615 && this.field631 != null) {
            if (client.field656 >= this.field613) {
                this.field631 = null;
            }
            if (client.field656 >= this.field634 && client.field656 < this.field613) {
                class128 var6 = this.field631;
                var6.method2680(this.field623 - this.field983, this.field624 - this.field620, this.field621 - this.field940);
                if (this.field991 == 512) {
                    var6.method2689();
                    var6.method2689();
                    var6.method2689();
                } else if (this.field991 == 1024) {
                    var6.method2689();
                    var6.method2689();
                } else if (this.field991 == 1536) {
                    var6.method2689();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field991 == 512) {
                    var6.method2689();
                } else if (this.field991 == 1024) {
                    var6.method2689();
                    var6.method2689();
                } else if (this.field991 == 1536) {
                    var6.method2689();
                    var6.method2689();
                    var6.method2689();
                }
                var6.method2680(this.field983 - this.field623, this.field620 - this.field624, this.field940 - this.field621);
            }
        }
        var3.field1683 = true;
        return var3;
    }

    @ObfuscatedName("ba.m(IIBB)V")
    public final void method1119(int arg0, int arg1, byte arg2) {
        if (this.field995 != -1 && class260.method5476(this.field995).field3525 == 1) {
            this.field995 = -1;
        }
        this.field968 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1120(arg0, arg1);
        } else if (this.field978[0] >= 0 && this.field978[0] < 104 && this.field996[0] >= 0 && this.field996[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field978[0];
                int var6 = this.field996[0];
                int var7 = this.method1130();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1130();
                    client.field810.field2102 = arg0;
                    client.field810.field2099 = arg1;
                    client.field810.field2101 = 1;
                    client.field810.field2100 = 1;
                    class66 var9 = client.field810;
                    class173 var11 = client.field704[this.field614];
                    int[] var12 = client.field921;
                    int[] var13 = client.field922;
                    int var14 = 0;
                    label202: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class174.method4759(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                var16 = class174.method1600(var5, var6, var9, var11);
                            } else {
                                var16 = Statics.method284(var5, var6, var8, var9, var11);
                            }
                            int var35;
                            label223: {
                                int var17 = var5 - 64;
                                int var18 = var6 - 64;
                                int var19 = Statics.field1290;
                                int var20 = Statics.field2094;
                                if (!var16) {
                                    int var21 = Integer.MAX_VALUE;
                                    int var22 = Integer.MAX_VALUE;
                                    byte var23 = 10;
                                    int var24 = var9.field2102;
                                    int var25 = var9.field2099;
                                    int var26 = var9.field2101;
                                    int var27 = var9.field2100;
                                    for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
                                        for (int var29 = var25 - var23; var29 <= var23 + var25; var29++) {
                                            int var30 = var28 - var17;
                                            int var31 = var29 - var18;
                                            if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class174.field2095[var30][var31] < 100) {
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
                                                if (var34 < var21 || var21 == var34 && class174.field2095[var30][var31] < var22) {
                                                    var21 = var34;
                                                    var22 = class174.field2095[var30][var31];
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
                                    class174.field2096[var36] = var19;
                                    int var43 = var36 + 1;
                                    class174.field2097[var36] = var20;
                                    int var37;
                                    int var38 = var37 = class174.field2093[var19 - var17][var20 - var18];
                                    while (var5 != var19 || var6 != var20) {
                                        if (var37 != var38) {
                                            var37 = var38;
                                            class174.field2096[var43] = var19;
                                            class174.field2097[var43++] = var20;
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
                                        var38 = class174.field2093[var19 - var17][var20 - var18];
                                    }
                                    int var39 = 0;
                                    while (var43-- > 0) {
                                        var12[var39] = class174.field2096[var43];
                                        var13[var39++] = class174.field2097[var43];
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
                                var4.method1121(client.field921[var41], client.field922[var41], (byte) 2);
                                var41++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class174.field2093[var14][var15] = 0;
                            class174.field2095[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1121(arg0, arg1, arg2);
        } else {
            this.method1120(arg0, arg1);
        }
    }

    @ObfuscatedName("ba.p(III)V")
    public void method1120(int arg0, int arg1) {
        this.field974 = 0;
        this.field999 = 0;
        this.field998 = 0;
        this.field978[0] = arg0;
        this.field996[0] = arg1;
        int var3 = this.method1130();
        this.field983 = this.field978[0] * 128 + var3 * 64;
        this.field940 = this.field996[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ba.h(IIBI)V")
    public final void method1121(int arg0, int arg1, byte arg2) {
        if (this.field974 < 9) {
            this.field974++;
        }
        for (int var4 = this.field974; var4 > 0; var4--) {
            this.field978[var4] = this.field978[var4 - 1];
            this.field996[var4] = this.field996[var4 - 1];
            this.field997[var4] = this.field997[var4 - 1];
        }
        this.field978[0] = arg0;
        this.field996[0] = arg1;
        this.field997[0] = arg2;
    }

    @ObfuscatedName("ba.v(I)Z")
    public final boolean method1141() {
        return this.field612 != null;
    }
}
