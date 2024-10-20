package deob;

@ObfuscatedName("bp")
public final class class62 extends class65 {

    @ObfuscatedName("bp.v")
    public class294 field593;

    @ObfuscatedName("bp.s")
    public class230 field599;

    @ObfuscatedName("bp.o")
    public int field585 = -1;

    @ObfuscatedName("bp.k")
    public int field583 = -1;

    @ObfuscatedName("bp.i")
    public String[] field604 = new String[3];

    @ObfuscatedName("bp.t")
    public int field589;

    @ObfuscatedName("bp.p")
    public int field594;

    @ObfuscatedName("bp.l")
    public int field591;

    @ObfuscatedName("bp.b")
    public int field586;

    @ObfuscatedName("bp.c")
    public int field596;

    @ObfuscatedName("bp.d")
    public int field584;

    @ObfuscatedName("bp.w")
    public int field595;

    @ObfuscatedName("bp.a")
    public int field608;

    @ObfuscatedName("bp.z")
    public class122 field597;

    @ObfuscatedName("bp.e")
    public int field598;

    @ObfuscatedName("bp.q")
    public int field601;

    @ObfuscatedName("bp.j")
    public int field600;

    @ObfuscatedName("bp.y")
    public int field588;

    @ObfuscatedName("bp.m")
    public boolean field592;

    @ObfuscatedName("bp.h")
    public int field602;

    @ObfuscatedName("bp.x")
    public boolean field603;

    @ObfuscatedName("bp.f")
    public int field605;

    @ObfuscatedName("bp.r")
    public int field606;

    @ObfuscatedName("bp.n")
    public class292 field607;

    @ObfuscatedName("bp.g")
    public class292 field590;

    @ObfuscatedName("bp.ac")
    public boolean field609;

    @ObfuscatedName("bp.ab")
    public int field610;

    @ObfuscatedName("bp.ao")
    public int field611;

    public class62() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field604[var1] = "";
        }
        this.field589 = 0;
        this.field594 = 0;
        this.field586 = 0;
        this.field596 = 0;
        this.field592 = false;
        this.field602 = 0;
        this.field603 = false;
        this.field607 = class292.field3668;
        this.field590 = class292.field3668;
        this.field609 = false;
    }

    @ObfuscatedName("bp.v(Lgx;I)V")
    public final void method1029(class185 arg0) {
        arg0.field2386 = 0;
        int var2 = arg0.method3274();
        this.field585 = arg0.method3275();
        this.field583 = arg0.method3275();
        int var3 = -1;
        this.field602 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3274();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3274();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3276();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method945(var4[var5] - 512).field3500;
                    if (var8 != 0) {
                        this.field602 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3274();
            if (var11 < 0 || var11 >= Statics.field1923[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field913 = arg0.method3276();
        if (this.field913 == 65535) {
            this.field913 = -1;
        }
        this.field914 = arg0.method3276();
        if (this.field914 == 65535) {
            this.field914 = -1;
        }
        this.field915 = this.field914;
        this.field916 = arg0.method3276();
        if (this.field916 == 65535) {
            this.field916 = -1;
        }
        this.field917 = arg0.method3276();
        if (this.field917 == 65535) {
            this.field917 = -1;
        }
        this.field945 = arg0.method3276();
        if (this.field945 == 65535) {
            this.field945 = -1;
        }
        this.field919 = arg0.method3276();
        if (this.field919 == 65535) {
            this.field919 = -1;
        }
        this.field920 = arg0.method3276();
        if (this.field920 == 65535) {
            this.field920 = -1;
        }
        this.field593 = new class294(arg0.method3490(), Statics.field2289);
        this.method1055();
        this.method1034();
        if (Statics.field341 == this) {
            Statics.field1983 = this.field593.method5082();
        }
        this.field589 = arg0.method3274();
        this.field594 = arg0.method3276();
        this.field603 = arg0.method3274() == 1;
        if (client.field786 == 0 && client.field686 >= 2) {
            this.field603 = false;
        }
        if (this.field599 == null) {
            this.field599 = new class230();
        }
        this.field599.method4131(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bp.s(I)Z")
    public boolean method1065() {
        if (class292.field3668 == this.field607) {
            this.method1053();
        }
        return class292.field3667 == this.field607;
    }

    @ObfuscatedName("bp.o(I)V")
    public void method1055() {
        this.field607 = class292.field3668;
    }

    @ObfuscatedName("bp.k(I)V")
    public void method1053() {
        this.field607 = Statics.field1240.method1548(this.field593) ? class292.field3667 : class292.field3666;
    }

    @ObfuscatedName("bp.u(I)Z")
    public boolean method1063() {
        if (class292.field3668 == this.field590) {
            this.method1035();
        }
        return class292.field3667 == this.field590;
    }

    @ObfuscatedName("bp.i(I)V")
    public void method1034() {
        this.field590 = class292.field3668;
    }

    @ObfuscatedName("bp.t(I)V")
    public void method1035() {
        this.field590 = Statics.field65 != null && Statics.field65.method4993(this.field593) ? class292.field3667 : class292.field3666;
    }

    @ObfuscatedName("bp.c(I)I")
    public int method1036() {
        return this.field599 == null || this.field599.field2610 == -1 ? 1 : class274.method1807(this.field599.field2610).field3518;
    }

    @ObfuscatedName("bp.w(I)Lda;")
    public final class122 method1056() {
        if (this.field599 == null) {
            return null;
        }
        class276 var1 = this.field944 != -1 && this.field943 == 0 ? class276.method115(this.field944) : null;
        class276 var2 = this.field937 == -1 || this.field592 || this.field937 == this.field913 && var1 != null ? null : class276.method115(this.field937);
        class122 var3 = this.field599.method4137(var1, this.field932, var2, this.field938);
        if (var3 == null) {
            return null;
        }
        var3.method2532();
        this.field958 = var3.field1833;
        if (!this.field592 && this.field941 != -1 && this.field931 != -1) {
            class122 var4 = class261.method2850(this.field941).method4519(this.field931);
            if (var4 != null) {
                var4.method2516(0, -this.field949, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (!this.field592 && this.field597 != null) {
            if (client.field631 >= this.field596) {
                this.field597 = null;
            }
            if (client.field631 >= this.field586 && client.field631 < this.field596) {
                class122 var6 = this.field597;
                var6.method2516(this.field584 - this.field933, this.field595 - this.field591, this.field608 - this.field964);
                if (this.field961 == 512) {
                    var6.method2480();
                    var6.method2480();
                    var6.method2480();
                } else if (this.field961 == 1024) {
                    var6.method2480();
                    var6.method2480();
                } else if (this.field961 == 1536) {
                    var6.method2480();
                }
                class122[] var7 = new class122[] { var3, var6 };
                var3 = new class122(var7, 2);
                if (this.field961 == 512) {
                    var6.method2480();
                } else if (this.field961 == 1024) {
                    var6.method2480();
                    var6.method2480();
                } else if (this.field961 == 1536) {
                    var6.method2480();
                    var6.method2480();
                    var6.method2480();
                }
                var6.method2516(this.field933 - this.field584, this.field591 - this.field595, this.field964 - this.field608);
            }
        }
        var3.field1701 = true;
        return var3;
    }

    @ObfuscatedName("bp.a(IIBI)V")
    public final void method1037(int arg0, int arg1, byte arg2) {
        if (this.field944 != -1 && class276.method115(this.field944).field3579 == 1) {
            this.field944 = -1;
        }
        this.field936 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1038(arg0, arg1);
        } else if (this.field927[0] >= 0 && this.field927[0] < 104 && this.field940[0] >= 0 && this.field940[0] < 104) {
            if (arg2 == 2) {
                client.method2550(this, arg0, arg1, (byte) 2);
            }
            this.method1039(arg0, arg1, arg2);
        } else {
            this.method1038(arg0, arg1);
        }
    }

    @ObfuscatedName("bp.z(III)V")
    public void method1038(int arg0, int arg1) {
        this.field962 = 0;
        this.field967 = 0;
        this.field966 = 0;
        this.field927[0] = arg0;
        this.field940[0] = arg1;
        int var3 = this.method1036();
        this.field933 = this.field927[0] * 128 + var3 * 64;
        this.field964 = this.field940[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bp.e(IIBI)V")
    public final void method1039(int arg0, int arg1, byte arg2) {
        if (this.field962 < 9) {
            this.field962++;
        }
        for (int var4 = this.field962; var4 > 0; var4--) {
            this.field927[var4] = this.field927[var4 - 1];
            this.field940[var4] = this.field940[var4 - 1];
            this.field965[var4] = this.field965[var4 - 1];
        }
        this.field927[0] = arg0;
        this.field940[0] = arg1;
        this.field965[0] = arg2;
    }

    @ObfuscatedName("bp.q(B)Z")
    public final boolean method1040() {
        return this.field599 != null;
    }
}
