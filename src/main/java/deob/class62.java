package deob;

@ObfuscatedName("bb")
public final class class62 extends class65 {

    @ObfuscatedName("bb.c")
    public class294 field633;

    @ObfuscatedName("bb.q")
    public class230 field624;

    @ObfuscatedName("bb.m")
    public int field609 = -1;

    @ObfuscatedName("bb.j")
    public int field629 = -1;

    @ObfuscatedName("bb.i")
    public String[] field612 = new String[3];

    @ObfuscatedName("bb.h")
    public int field613;

    @ObfuscatedName("bb.l")
    public int field614;

    @ObfuscatedName("bb.d")
    public int field615;

    @ObfuscatedName("bb.o")
    public int field636;

    @ObfuscatedName("bb.s")
    public int field617;

    @ObfuscatedName("bb.k")
    public int field618;

    @ObfuscatedName("bb.v")
    public int field623;

    @ObfuscatedName("bb.p")
    public int field620;

    @ObfuscatedName("bb.n")
    public class122 field621;

    @ObfuscatedName("bb.t")
    public int field622;

    @ObfuscatedName("bb.r")
    public int field610;

    @ObfuscatedName("bb.x")
    public int field607;

    @ObfuscatedName("bb.b")
    public int field625;

    @ObfuscatedName("bb.w")
    public boolean field626;

    @ObfuscatedName("bb.e")
    public int field628;

    @ObfuscatedName("bb.a")
    public boolean field608;

    @ObfuscatedName("bb.z")
    public int field627;

    @ObfuscatedName("bb.y")
    public int field630;

    @ObfuscatedName("bb.u")
    public class292 field619;

    @ObfuscatedName("bb.f")
    public class292 field632;

    @ObfuscatedName("bb.at")
    public boolean field616;

    @ObfuscatedName("bb.ay")
    public int field634;

    @ObfuscatedName("bb.ak")
    public int field635;

    public class62() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field612[var1] = "";
        }
        this.field613 = 0;
        this.field614 = 0;
        this.field636 = 0;
        this.field617 = 0;
        this.field626 = false;
        this.field628 = 0;
        this.field608 = false;
        this.field619 = class292.field3682;
        this.field632 = class292.field3682;
        this.field616 = false;
    }

    @ObfuscatedName("bb.c(Lgg;I)V")
    public final void method1029(class185 arg0) {
        arg0.field2386 = 0;
        int var2 = arg0.method3243();
        this.field609 = arg0.method3244();
        this.field629 = arg0.method3244();
        int var3 = -1;
        this.field628 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3243();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3243();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3245();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class272.method1730(var4[var5] - 512).field3518;
                    if (var8 != 0) {
                        this.field628 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3243();
            if (var11 < 0 || var11 >= Statics.field1968[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field930 = arg0.method3245();
        if (this.field930 == 65535) {
            this.field930 = -1;
        }
        this.field937 = arg0.method3245();
        if (this.field937 == 65535) {
            this.field937 = -1;
        }
        this.field938 = this.field937;
        this.field939 = arg0.method3245();
        if (this.field939 == 65535) {
            this.field939 = -1;
        }
        this.field940 = arg0.method3245();
        if (this.field940 == 65535) {
            this.field940 = -1;
        }
        this.field941 = arg0.method3245();
        if (this.field941 == 65535) {
            this.field941 = -1;
        }
        this.field983 = arg0.method3245();
        if (this.field983 == 65535) {
            this.field983 = -1;
        }
        this.field943 = arg0.method3245();
        if (this.field943 == 65535) {
            this.field943 = -1;
        }
        this.field633 = new class294(arg0.method3251(), Statics.field252);
        this.method1037();
        this.method1034();
        if (Statics.field241 == this) {
            Statics.field3800 = this.field633.method5075();
        }
        this.field613 = arg0.method3243();
        this.field614 = arg0.method3245();
        this.field608 = arg0.method3243() == 1;
        if (client.field646 == 0 && client.field809 >= 2) {
            this.field608 = false;
        }
        if (this.field624 == null) {
            this.field624 = new class230();
        }
        this.field624.method4053(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bb.q(I)Z")
    public boolean method1035() {
        if (class292.field3682 == this.field619) {
            this.method1032();
        }
        return class292.field3683 == this.field619;
    }

    @ObfuscatedName("bb.m(I)V")
    public void method1037() {
        this.field619 = class292.field3682;
    }

    @ObfuscatedName("bb.j(I)V")
    public void method1032() {
        this.field619 = Statics.field40.method1516(this.field633) ? class292.field3683 : class292.field3684;
    }

    @ObfuscatedName("bb.g(I)Z")
    public boolean method1052() {
        if (class292.field3682 == this.field632) {
            this.method1064();
        }
        return class292.field3683 == this.field632;
    }

    @ObfuscatedName("bb.i(I)V")
    public void method1034() {
        this.field632 = class292.field3682;
    }

    @ObfuscatedName("bb.h(I)V")
    public void method1064() {
        this.field632 = Statics.field928 != null && Statics.field928.method4972(this.field633) ? class292.field3683 : class292.field3684;
    }

    @ObfuscatedName("bb.l(B)I")
    public int method1036() {
        return this.field624 == null || this.field624.field2604 == -1 ? 1 : class274.method1993(this.field624.field2604).field3539;
    }

    @ObfuscatedName("bb.o(B)Ldx;")
    public final class122 method1063() {
        if (this.field624 == null) {
            return null;
        }
        class276 var1 = this.field963 != -1 && this.field987 == 0 ? class276.method2826(this.field963) : null;
        class276 var2 = this.field970 == -1 || this.field626 || this.field970 == this.field930 && var1 != null ? null : class276.method2826(this.field970);
        class122 var3 = this.field624.method4080(var1, this.field964, var2, this.field979);
        if (var3 == null) {
            return null;
        }
        var3.method2496();
        this.field981 = var3.field1849;
        if (!this.field626 && this.field971 != -1 && this.field969 != -1) {
            class122 var4 = class261.method34(this.field971).method4477(this.field969);
            if (var4 != null) {
                var4.method2431(0, -this.field972, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (!this.field626 && this.field621 != null) {
            if (client.field654 >= this.field617) {
                this.field621 = null;
            }
            if (client.field654 >= this.field636 && client.field654 < this.field617) {
                class122 var6 = this.field621;
                var6.method2431(this.field618 - this.field947, this.field623 - this.field615, this.field620 - this.field960);
                if (this.field982 == 512) {
                    var6.method2427();
                    var6.method2427();
                    var6.method2427();
                } else if (this.field982 == 1024) {
                    var6.method2427();
                    var6.method2427();
                } else if (this.field982 == 1536) {
                    var6.method2427();
                }
                class122[] var7 = new class122[] { var3, var6 };
                var3 = new class122(var7, 2);
                if (this.field982 == 512) {
                    var6.method2427();
                } else if (this.field982 == 1024) {
                    var6.method2427();
                    var6.method2427();
                } else if (this.field982 == 1536) {
                    var6.method2427();
                    var6.method2427();
                    var6.method2427();
                }
                var6.method2431(this.field947 - this.field618, this.field615 - this.field623, this.field960 - this.field620);
            }
        }
        var3.field1673 = true;
        return var3;
    }

    @ObfuscatedName("bb.k(IIBI)V")
    public final void method1038(int arg0, int arg1, byte arg2) {
        if (this.field963 != -1 && class276.method2826(this.field963).field3597 == 1) {
            this.field963 = -1;
        }
        this.field959 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1039(arg0, arg1);
        } else if (this.field977[0] >= 0 && this.field977[0] < 104 && this.field975[0] >= 0 && this.field975[0] < 104) {
            if (arg2 == 2) {
                client.method3476(this, arg0, arg1, (byte) 2);
            }
            this.method1049(arg0, arg1, arg2);
        } else {
            this.method1039(arg0, arg1);
        }
    }

    @ObfuscatedName("bb.v(III)V")
    public void method1039(int arg0, int arg1) {
        this.field985 = 0;
        this.field990 = 0;
        this.field976 = 0;
        this.field977[0] = arg0;
        this.field975[0] = arg1;
        int var3 = this.method1036();
        this.field947 = this.field977[0] * 128 + var3 * 64;
        this.field960 = this.field975[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bb.p(IIBI)V")
    public final void method1049(int arg0, int arg1, byte arg2) {
        if (this.field985 < 9) {
            this.field985++;
        }
        for (int var4 = this.field985; var4 > 0; var4--) {
            this.field977[var4] = this.field977[var4 - 1];
            this.field975[var4] = this.field975[var4 - 1];
            this.field988[var4] = this.field988[var4 - 1];
        }
        this.field977[0] = arg0;
        this.field975[0] = arg1;
        this.field988[0] = arg2;
    }

    @ObfuscatedName("bb.n(I)Z")
    public final boolean method1040() {
        return this.field624 != null;
    }
}
