package deob;

@ObfuscatedName("bu")
public final class class61 extends class64 {

    @ObfuscatedName("bu.w")
    public class292 field588;

    @ObfuscatedName("bu.m")
    public class228 field562;

    @ObfuscatedName("bu.q")
    public int field564 = -1;

    @ObfuscatedName("bu.b")
    public int field565 = -1;

    @ObfuscatedName("bu.n")
    public String[] field566 = new String[3];

    @ObfuscatedName("bu.h")
    public int field567;

    @ObfuscatedName("bu.x")
    public int field577;

    @ObfuscatedName("bu.j")
    public int field573;

    @ObfuscatedName("bu.a")
    public int field576;

    @ObfuscatedName("bu.l")
    public int field571;

    @ObfuscatedName("bu.d")
    public int field572;

    @ObfuscatedName("bu.s")
    public int field563;

    @ObfuscatedName("bu.p")
    public int field583;

    @ObfuscatedName("bu.g")
    public class120 field575;

    @ObfuscatedName("bu.y")
    public int field569;

    @ObfuscatedName("bu.c")
    public int field574;

    @ObfuscatedName("bu.e")
    public int field578;

    @ObfuscatedName("bu.t")
    public int field579;

    @ObfuscatedName("bu.u")
    public boolean field580;

    @ObfuscatedName("bu.i")
    public int field570;

    @ObfuscatedName("bu.z")
    public boolean field568;

    @ObfuscatedName("bu.k")
    public int field582;

    @ObfuscatedName("bu.r")
    public int field584;

    @ObfuscatedName("bu.v")
    public class290 field585;

    @ObfuscatedName("bu.o")
    public class290 field581;

    @ObfuscatedName("bu.ai")
    public boolean field587;

    @ObfuscatedName("bu.at")
    public int field586;

    @ObfuscatedName("bu.ad")
    public int field589;

    public class61() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field566[var1] = "";
        }
        this.field567 = 0;
        this.field577 = 0;
        this.field576 = 0;
        this.field571 = 0;
        this.field580 = false;
        this.field570 = 0;
        this.field568 = false;
        this.field585 = class290.field3653;
        this.field581 = class290.field3653;
        this.field587 = false;
    }

    @ObfuscatedName("bu.w(Lgy;I)V")
    public final void method1041(class183 arg0) {
        arg0.field2360 = 0;
        int var2 = arg0.method3436();
        this.field564 = arg0.method3263();
        this.field565 = arg0.method3263();
        int var3 = -1;
        this.field570 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3436();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3436();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3268();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class270.method2571(var4[var5] - 512).field3440;
                    if (var8 != 0) {
                        this.field570 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3436();
            if (var11 < 0 || var11 >= Statics.field2391[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field910 = arg0.method3268();
        if (this.field910 == 65535) {
            this.field910 = -1;
        }
        this.field893 = arg0.method3268();
        if (this.field893 == 65535) {
            this.field893 = -1;
        }
        this.field890 = this.field893;
        this.field891 = arg0.method3268();
        if (this.field891 == 65535) {
            this.field891 = -1;
        }
        this.field892 = arg0.method3268();
        if (this.field892 == 65535) {
            this.field892 = -1;
        }
        this.field883 = arg0.method3268();
        if (this.field883 == 65535) {
            this.field883 = -1;
        }
        this.field894 = arg0.method3268();
        if (this.field894 == 65535) {
            this.field894 = -1;
        }
        this.field895 = arg0.method3268();
        if (this.field895 == 65535) {
            this.field895 = -1;
        }
        this.field588 = new class292(arg0.method3271(), Statics.field169);
        this.method1067();
        this.method1075();
        if (Statics.field1949 == this) {
            Statics.field1959 = this.field588.method5048();
        }
        this.field567 = arg0.method3436();
        this.field577 = arg0.method3268();
        this.field568 = arg0.method3436() == 1;
        if (client.field597 == 0 && client.field730 >= 2) {
            this.field568 = false;
        }
        if (this.field562 == null) {
            this.field562 = new class228();
        }
        this.field562.method4117(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bu.m(S)Z")
    public boolean method1042() {
        if (class290.field3653 == this.field585) {
            this.method1044();
        }
        return class290.field3652 == this.field585;
    }

    @ObfuscatedName("bu.q(B)V")
    public void method1067() {
        this.field585 = class290.field3653;
    }

    @ObfuscatedName("bu.x(I)V")
    public void method1044() {
        this.field585 = Statics.field1454.method1577(this.field588) ? class290.field3652 : class290.field3651;
    }

    @ObfuscatedName("bu.j(I)Z")
    public boolean method1045() {
        if (class290.field3653 == this.field581) {
            this.method1074();
        }
        return class290.field3652 == this.field581;
    }

    @ObfuscatedName("bu.a(B)V")
    public void method1075() {
        this.field581 = class290.field3653;
    }

    @ObfuscatedName("bu.l(B)V")
    public void method1074() {
        this.field581 = Statics.field3 != null && Statics.field3.method4954(this.field588) ? class290.field3652 : class290.field3651;
    }

    @ObfuscatedName("bu.d(I)I")
    public int method1050() {
        return this.field562 == null || this.field562.field2597 == -1 ? 1 : class272.method1034(this.field562.field2597).field3520;
    }

    @ObfuscatedName("bu.s(B)Ldk;")
    public final class120 method1048() {
        if (this.field562 == null) {
            return null;
        }
        class274 var1 = this.field916 != -1 && this.field914 == 0 ? class274.method2918(this.field916) : null;
        class274 var2 = this.field913 == -1 || this.field580 || this.field913 == this.field910 && var1 != null ? null : class274.method2918(this.field913);
        class120 var3 = this.field562.method4138(var1, this.field917, var2, this.field912);
        if (var3 == null) {
            return null;
        }
        var3.method2512();
        this.field923 = var3.field1806;
        if (!this.field580 && this.field921 != -1 && this.field922 != -1) {
            class120 var4 = class259.method973(this.field921).method4477(this.field922);
            if (var4 != null) {
                var4.method2523(0, -this.field925, 0);
                class120[] var5 = new class120[] { var3, var4 };
                var3 = new class120(var5, 2);
            }
        }
        if (!this.field580 && this.field575 != null) {
            if (client.field680 >= this.field571) {
                this.field575 = null;
            }
            if (client.field680 >= this.field576 && client.field680 < this.field571) {
                class120 var6 = this.field575;
                var6.method2523(this.field572 - this.field901, this.field563 - this.field573, this.field583 - this.field919);
                if (this.field935 == 512) {
                    var6.method2519();
                    var6.method2519();
                    var6.method2519();
                } else if (this.field935 == 1024) {
                    var6.method2519();
                    var6.method2519();
                } else if (this.field935 == 1536) {
                    var6.method2519();
                }
                class120[] var7 = new class120[] { var3, var6 };
                var3 = new class120(var7, 2);
                if (this.field935 == 512) {
                    var6.method2519();
                } else if (this.field935 == 1024) {
                    var6.method2519();
                    var6.method2519();
                } else if (this.field935 == 1536) {
                    var6.method2519();
                    var6.method2519();
                    var6.method2519();
                }
                var6.method2523(this.field901 - this.field572, this.field573 - this.field563, this.field919 - this.field583);
            }
        }
        var3.field1637 = true;
        return var3;
    }

    @ObfuscatedName("bu.p(IIBI)V")
    public final void method1043(int arg0, int arg1, byte arg2) {
        if (this.field916 != -1 && class274.method2918(this.field916).field3564 == 1) {
            this.field916 = -1;
        }
        this.field898 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1082(arg0, arg1);
        } else if (this.field929[0] >= 0 && this.field929[0] < 104 && this.field940[0] >= 0 && this.field940[0] < 104) {
            if (arg2 == 2) {
                Statics.method692(this, arg0, arg1, (byte) 2);
            }
            this.method1073(arg0, arg1, arg2);
        } else {
            this.method1082(arg0, arg1);
        }
    }

    @ObfuscatedName("bu.g(III)V")
    public void method1082(int arg0, int arg1) {
        this.field938 = 0;
        this.field943 = 0;
        this.field937 = 0;
        this.field929[0] = arg0;
        this.field940[0] = arg1;
        int var3 = this.method1050();
        this.field901 = this.field929[0] * 128 + var3 * 64;
        this.field919 = this.field940[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bu.y(IIBB)V")
    public final void method1073(int arg0, int arg1, byte arg2) {
        if (this.field938 < 9) {
            this.field938++;
        }
        for (int var4 = this.field938; var4 > 0; var4--) {
            this.field929[var4] = this.field929[var4 - 1];
            this.field940[var4] = this.field940[var4 - 1];
            this.field941[var4] = this.field941[var4 - 1];
        }
        this.field929[0] = arg0;
        this.field940[0] = arg1;
        this.field941[0] = arg2;
    }

    @ObfuscatedName("bu.c(B)Z")
    public final boolean method1052() {
        return this.field562 != null;
    }
}
