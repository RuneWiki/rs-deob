package deob;

@ObfuscatedName("bg")
public final class class62 extends class65 {

    @ObfuscatedName("bg.y")
    public class294 field593;

    @ObfuscatedName("bg.c")
    public class230 field591;

    @ObfuscatedName("bg.n")
    public int field614 = -1;

    @ObfuscatedName("bg.u")
    public int field610 = -1;

    @ObfuscatedName("bg.r")
    public String[] field590 = new String[3];

    @ObfuscatedName("bg.j")
    public int field595;

    @ObfuscatedName("bg.p")
    public int field596;

    @ObfuscatedName("bg.e")
    public int field597;

    @ObfuscatedName("bg.s")
    public int field598;

    @ObfuscatedName("bg.v")
    public int field604;

    @ObfuscatedName("bg.k")
    public int field600;

    @ObfuscatedName("bg.o")
    public int field594;

    @ObfuscatedName("bg.q")
    public int field602;

    @ObfuscatedName("bg.l")
    public class122 field605;

    @ObfuscatedName("bg.f")
    public int field592;

    @ObfuscatedName("bg.z")
    public int field603;

    @ObfuscatedName("bg.a")
    public int field606;

    @ObfuscatedName("bg.x")
    public int field607;

    @ObfuscatedName("bg.b")
    public boolean field608;

    @ObfuscatedName("bg.w")
    public int field609;

    @ObfuscatedName("bg.g")
    public boolean field601;

    @ObfuscatedName("bg.d")
    public int field611;

    @ObfuscatedName("bg.m")
    public int field612;

    @ObfuscatedName("bg.t")
    public class292 field613;

    @ObfuscatedName("bg.h")
    public class292 field617;

    @ObfuscatedName("bg.al")
    public boolean field615;

    @ObfuscatedName("bg.ah")
    public int field619;

    @ObfuscatedName("bg.ad")
    public int field616;

    public class62() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field590[var1] = "";
        }
        this.field595 = 0;
        this.field596 = 0;
        this.field598 = 0;
        this.field604 = 0;
        this.field608 = false;
        this.field609 = 0;
        this.field601 = false;
        this.field613 = class292.field3687;
        this.field617 = class292.field3687;
        this.field615 = false;
    }

    @ObfuscatedName("bg.y(Lge;I)V")
    public final void method1051(class185 arg0) {
        arg0.field2374 = 0;
        int var2 = arg0.method3299();
        this.field614 = arg0.method3319();
        this.field610 = arg0.method3319();
        int var3 = -1;
        this.field609 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3299();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3299();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3280();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class272.method4572(var4[var5] - 512).field3521;
                    if (var8 != 0) {
                        this.field609 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3299();
            if (var11 < 0 || var11 >= Statics.field989[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field923 = arg0.method3280();
        if (this.field923 == 65535) {
            this.field923 = -1;
        }
        this.field932 = arg0.method3280();
        if (this.field932 == 65535) {
            this.field932 = -1;
        }
        this.field970 = this.field932;
        this.field926 = arg0.method3280();
        if (this.field926 == 65535) {
            this.field926 = -1;
        }
        this.field927 = arg0.method3280();
        if (this.field927 == 65535) {
            this.field927 = -1;
        }
        this.field928 = arg0.method3280();
        if (this.field928 == 65535) {
            this.field928 = -1;
        }
        this.field917 = arg0.method3280();
        if (this.field917 == 65535) {
            this.field917 = -1;
        }
        this.field930 = arg0.method3280();
        if (this.field930 == 65535) {
            this.field930 = -1;
        }
        this.field593 = new class294(arg0.method3277(), Statics.field2425);
        this.method1053();
        this.method1056();
        if (Statics.field476 == this) {
            Statics.field1983 = this.field593.method5079();
        }
        this.field595 = arg0.method3299();
        this.field596 = arg0.method3280();
        this.field601 = arg0.method3299() == 1;
        if (client.field710 == 0 && client.field761 >= 2) {
            this.field601 = false;
        }
        if (this.field591 == null) {
            this.field591 = new class230();
        }
        this.field591.method4090(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bg.c(I)Z")
    public boolean method1052() {
        if (class292.field3687 == this.field613) {
            this.method1060();
        }
        return class292.field3688 == this.field613;
    }

    @ObfuscatedName("bg.n(B)V")
    public void method1053() {
        this.field613 = class292.field3687;
    }

    @ObfuscatedName("bg.u(B)V")
    public void method1060() {
        this.field613 = Statics.field391.method1536(this.field593) ? class292.field3688 : class292.field3689;
    }

    @ObfuscatedName("bg.i(S)Z")
    public boolean method1062() {
        if (class292.field3687 == this.field617) {
            this.method1057();
        }
        return class292.field3688 == this.field617;
    }

    @ObfuscatedName("bg.p(I)V")
    public void method1056() {
        this.field617 = class292.field3687;
    }

    @ObfuscatedName("bg.e(S)V")
    public void method1057() {
        this.field617 = Statics.field51 != null && Statics.field51.method5004(this.field593) ? class292.field3688 : class292.field3689;
    }

    @ObfuscatedName("bg.s(I)I")
    public int method1058() {
        return this.field591 == null || this.field591.field2614 == -1 ? 1 : Statics.method4448(this.field591.field2614).field3553;
    }

    @ObfuscatedName("bg.v(I)Lde;")
    public final class122 method1059() {
        if (this.field591 == null) {
            return null;
        }
        class276 var1 = this.field950 != -1 && this.field953 == 0 ? class276.method3241(this.field950) : null;
        class276 var2 = this.field947 == -1 || this.field608 || this.field947 == this.field923 && var1 != null ? null : class276.method3241(this.field947);
        class122 var3 = this.field591.method4096(var1, this.field955, var2, this.field922);
        if (var3 == null) {
            return null;
        }
        var3.method2473();
        this.field964 = var3.field1828;
        if (!this.field608 && this.field975 != -1 && this.field934 != -1) {
            class122 var4 = class261.method1754(this.field975).method4499(this.field934);
            if (var4 != null) {
                var4.method2484(0, -this.field959, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (!this.field608 && this.field605 != null) {
            if (client.field637 >= this.field604) {
                this.field605 = null;
            }
            if (client.field637 >= this.field598 && client.field637 < this.field604) {
                class122 var6 = this.field605;
                var6.method2484(this.field600 - this.field951, this.field594 - this.field597, this.field602 - this.field956);
                if (this.field945 == 512) {
                    var6.method2537();
                    var6.method2537();
                    var6.method2537();
                } else if (this.field945 == 1024) {
                    var6.method2537();
                    var6.method2537();
                } else if (this.field945 == 1536) {
                    var6.method2537();
                }
                class122[] var7 = new class122[] { var3, var6 };
                var3 = new class122(var7, 2);
                if (this.field945 == 512) {
                    var6.method2537();
                } else if (this.field945 == 1024) {
                    var6.method2537();
                    var6.method2537();
                } else if (this.field945 == 1536) {
                    var6.method2537();
                    var6.method2537();
                    var6.method2537();
                }
                var6.method2484(this.field951 - this.field600, this.field597 - this.field594, this.field956 - this.field602);
            }
        }
        var3.field1632 = true;
        return var3;
    }

    @ObfuscatedName("bg.k(IIBB)V")
    public final void method1063(int arg0, int arg1, byte arg2) {
        if (this.field950 != -1 && class276.method3241(this.field950).field3600 == 1) {
            this.field950 = -1;
        }
        this.field946 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1061(arg0, arg1);
        } else if (this.field933[0] >= 0 && this.field933[0] < 104 && this.field974[0] >= 0 && this.field974[0] < 104) {
            if (arg2 == 2) {
                client.method2056(this, arg0, arg1, (byte) 2);
            }
            this.method1064(arg0, arg1, arg2);
        } else {
            this.method1061(arg0, arg1);
        }
    }

    @ObfuscatedName("bg.o(III)V")
    public void method1061(int arg0, int arg1) {
        this.field972 = 0;
        this.field977 = 0;
        this.field976 = 0;
        this.field933[0] = arg0;
        this.field974[0] = arg1;
        int var3 = this.method1058();
        this.field951 = this.field933[0] * 128 + var3 * 64;
        this.field956 = this.field974[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bg.q(IIBS)V")
    public final void method1064(int arg0, int arg1, byte arg2) {
        if (this.field972 < 9) {
            this.field972++;
        }
        for (int var4 = this.field972; var4 > 0; var4--) {
            this.field933[var4] = this.field933[var4 - 1];
            this.field974[var4] = this.field974[var4 - 1];
            this.field918[var4] = this.field918[var4 - 1];
        }
        this.field933[0] = arg0;
        this.field974[0] = arg1;
        this.field918[0] = arg2;
    }

    @ObfuscatedName("bg.l(I)Z")
    public final boolean method1083() {
        return this.field591 != null;
    }
}
