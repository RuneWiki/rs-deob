package deob;

@ObfuscatedName("bk")
public final class class62 extends class65 {

    @ObfuscatedName("bk.g")
    public class294 field626;

    @ObfuscatedName("bk.r")
    public class230 field631;

    @ObfuscatedName("bk.e")
    public int field630 = -1;

    @ObfuscatedName("bk.q")
    public int field610 = -1;

    @ObfuscatedName("bk.l")
    public String[] field628 = new String[3];

    @ObfuscatedName("bk.b")
    public int field612;

    @ObfuscatedName("bk.w")
    public int field618;

    @ObfuscatedName("bk.n")
    public int field614;

    @ObfuscatedName("bk.i")
    public int field615;

    @ObfuscatedName("bk.p")
    public int field616;

    @ObfuscatedName("bk.m")
    public int field617;

    @ObfuscatedName("bk.d")
    public int field611;

    @ObfuscatedName("bk.j")
    public int field613;

    @ObfuscatedName("bk.x")
    public class122 field620;

    @ObfuscatedName("bk.v")
    public int field609;

    @ObfuscatedName("bk.h")
    public int field607;

    @ObfuscatedName("bk.f")
    public int field622;

    @ObfuscatedName("bk.a")
    public int field624;

    @ObfuscatedName("bk.t")
    public boolean field625;

    @ObfuscatedName("bk.k")
    public int field623;

    @ObfuscatedName("bk.z")
    public boolean field627;

    @ObfuscatedName("bk.s")
    public int field621;

    @ObfuscatedName("bk.y")
    public int field629;

    @ObfuscatedName("bk.u")
    public class292 field608;

    @ObfuscatedName("bk.o")
    public class292 field619;

    @ObfuscatedName("bk.af")
    public boolean field632;

    @ObfuscatedName("bk.ax")
    public int field633;

    @ObfuscatedName("bk.aw")
    public int field634;

    public class62() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field628[var1] = "";
        }
        this.field612 = 0;
        this.field618 = 0;
        this.field615 = 0;
        this.field616 = 0;
        this.field625 = false;
        this.field623 = 0;
        this.field627 = false;
        this.field608 = class292.field3714;
        this.field619 = class292.field3714;
        this.field632 = false;
    }

    @ObfuscatedName("bk.g(Lgl;S)V")
    public final void method1093(class185 arg0) {
        arg0.field2406 = 0;
        int var2 = arg0.method3679();
        this.field630 = arg0.method3627();
        this.field610 = arg0.method3627();
        int var3 = -1;
        this.field623 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3679();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3679();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3467();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class272.method1995(var4[var5] - 512).field3541;
                    if (var8 != 0) {
                        this.field623 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3679();
            if (var11 < 0 || var11 >= Statics.field3307[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field945 = arg0.method3467();
        if (this.field945 == 65535) {
            this.field945 = -1;
        }
        this.field946 = arg0.method3467();
        if (this.field946 == 65535) {
            this.field946 = -1;
        }
        this.field958 = this.field946;
        this.field943 = arg0.method3467();
        if (this.field943 == 65535) {
            this.field943 = -1;
        }
        this.field949 = arg0.method3467();
        if (this.field949 == 65535) {
            this.field949 = -1;
        }
        this.field950 = arg0.method3467();
        if (this.field950 == 65535) {
            this.field950 = -1;
        }
        this.field951 = arg0.method3467();
        if (this.field951 == 65535) {
            this.field951 = -1;
        }
        this.field952 = arg0.method3467();
        if (this.field952 == 65535) {
            this.field952 = -1;
        }
        this.field626 = new class294(arg0.method3474(), Statics.field921);
        this.method1095();
        this.method1107();
        if (Statics.field1064 == this) {
            Statics.field1996 = this.field626.method5269();
        }
        this.field612 = arg0.method3679();
        this.field618 = arg0.method3467();
        this.field627 = arg0.method3679() == 1;
        if (client.field646 == 0 && client.field813 >= 2) {
            this.field627 = false;
        }
        if (this.field631 == null) {
            this.field631 = new class230();
        }
        this.field631.method4295(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bk.r(I)Z")
    public boolean method1094() {
        if (class292.field3714 == this.field608) {
            this.method1096();
        }
        return class292.field3713 == this.field608;
    }

    @ObfuscatedName("bk.e(B)V")
    public void method1095() {
        this.field608 = class292.field3714;
    }

    @ObfuscatedName("bk.q(I)V")
    public void method1096() {
        this.field608 = Statics.field2151.method1657(this.field626) ? class292.field3713 : class292.field3712;
    }

    @ObfuscatedName("bk.c(B)Z")
    public boolean method1097() {
        if (class292.field3714 == this.field619) {
            this.method1098();
        }
        return class292.field3713 == this.field619;
    }

    @ObfuscatedName("bk.i(B)V")
    public void method1107() {
        this.field619 = class292.field3714;
    }

    @ObfuscatedName("bk.p(I)V")
    public void method1098() {
        this.field619 = Statics.field27 != null && Statics.field27.method5192(this.field626) ? class292.field3713 : class292.field3712;
    }

    @ObfuscatedName("bk.m(B)I")
    public int method1099() {
        return this.field631 == null || this.field631.field2640 == -1 ? 1 : class274.method4430(this.field631.field2640).field3601;
    }

    @ObfuscatedName("bk.d(I)Ldl;")
    public final class122 method1130() {
        if (this.field631 == null) {
            return null;
        }
        class276 var1 = this.field972 != -1 && this.field999 == 0 ? class276.method493(this.field972) : null;
        class276 var2 = this.field973 == -1 || this.field625 || this.field973 == this.field945 && var1 != null ? null : class276.method493(this.field973);
        class122 var3 = this.field631.method4301(var1, this.field987, var2, this.field970);
        if (var3 == null) {
            return null;
        }
        var3.method2671();
        this.field947 = var3.field1841;
        if (!this.field625 && this.field977 != -1 && this.field994 != -1) {
            class122 var4 = class261.method4525(this.field977).method4680(this.field994);
            if (var4 != null) {
                var4.method2683(0, -this.field981, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (!this.field625 && this.field620 != null) {
            if (client.field656 >= this.field616) {
                this.field620 = null;
            }
            if (client.field656 >= this.field615 && client.field656 < this.field616) {
                class122 var6 = this.field620;
                var6.method2683(this.field617 - this.field954, this.field611 - this.field614, this.field613 - this.field1000);
                if (this.field991 == 512) {
                    var6.method2678();
                    var6.method2678();
                    var6.method2678();
                } else if (this.field991 == 1024) {
                    var6.method2678();
                    var6.method2678();
                } else if (this.field991 == 1536) {
                    var6.method2678();
                }
                class122[] var7 = new class122[] { var3, var6 };
                var3 = new class122(var7, 2);
                if (this.field991 == 512) {
                    var6.method2678();
                } else if (this.field991 == 1024) {
                    var6.method2678();
                    var6.method2678();
                } else if (this.field991 == 1536) {
                    var6.method2678();
                    var6.method2678();
                    var6.method2678();
                }
                var6.method2683(this.field954 - this.field617, this.field614 - this.field611, this.field1000 - this.field613);
            }
        }
        var3.field1665 = true;
        return var3;
    }

    @ObfuscatedName("bk.j(IIBB)V")
    public final void method1101(int arg0, int arg1, byte arg2) {
        if (this.field972 != -1 && class276.method493(this.field972).field3633 == 1) {
            this.field972 = -1;
        }
        this.field968 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1131(arg0, arg1);
        } else if (this.field995[0] >= 0 && this.field995[0] < 104 && this.field953[0] >= 0 && this.field953[0] < 104) {
            if (arg2 == 2) {
                client.method4813(this, arg0, arg1, (byte) 2);
            }
            this.method1116(arg0, arg1, arg2);
        } else {
            this.method1131(arg0, arg1);
        }
    }

    @ObfuscatedName("bk.x(III)V")
    public void method1131(int arg0, int arg1) {
        this.field940 = 0;
        this.field960 = 0;
        this.field956 = 0;
        this.field995[0] = arg0;
        this.field953[0] = arg1;
        int var3 = this.method1099();
        this.field954 = this.field995[0] * 128 + var3 * 64;
        this.field1000 = this.field953[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bk.v(IIBI)V")
    public final void method1116(int arg0, int arg1, byte arg2) {
        if (this.field940 < 9) {
            this.field940++;
        }
        for (int var4 = this.field940; var4 > 0; var4--) {
            this.field995[var4] = this.field995[var4 - 1];
            this.field953[var4] = this.field953[var4 - 1];
            this.field997[var4] = this.field997[var4 - 1];
        }
        this.field995[0] = arg0;
        this.field953[0] = arg1;
        this.field997[0] = arg2;
    }

    @ObfuscatedName("bk.h(I)Z")
    public final boolean method1104() {
        return this.field631 != null;
    }
}
