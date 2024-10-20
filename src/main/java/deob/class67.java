package deob;

@ObfuscatedName("bs")
public final class class67 extends class70 {

    @ObfuscatedName("bs.n")
    public class297 field595;

    @ObfuscatedName("bs.h")
    public class235 field593;

    @ObfuscatedName("bs.l")
    public int field594 = -1;

    @ObfuscatedName("bs.g")
    public int field612 = -1;

    @ObfuscatedName("bs.a")
    public String[] field611 = new String[3];

    @ObfuscatedName("bs.c")
    public int field597;

    @ObfuscatedName("bs.z")
    public int field599;

    @ObfuscatedName("bs.j")
    public int field600;

    @ObfuscatedName("bs.d")
    public int field601;

    @ObfuscatedName("bs.t")
    public int field602;

    @ObfuscatedName("bs.f")
    public int field603;

    @ObfuscatedName("bs.i")
    public int field592;

    @ObfuscatedName("bs.m")
    public int field605;

    @ObfuscatedName("bs.v")
    public class127 field606;

    @ObfuscatedName("bs.r")
    public int field613;

    @ObfuscatedName("bs.x")
    public int field608;

    @ObfuscatedName("bs.y")
    public int field609;

    @ObfuscatedName("bs.p")
    public int field610;

    @ObfuscatedName("bs.k")
    public boolean field598;

    @ObfuscatedName("bs.o")
    public int field616;

    @ObfuscatedName("bs.s")
    public boolean field607;

    @ObfuscatedName("bs.u")
    public int field614;

    @ObfuscatedName("bs.e")
    public int field615;

    @ObfuscatedName("bs.w")
    public class295 field604;

    @ObfuscatedName("bs.q")
    public class295 field617;

    @ObfuscatedName("bs.aa")
    public boolean field618;

    @ObfuscatedName("bs.ai")
    public int field619;

    @ObfuscatedName("bs.ag")
    public int field620;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field611[var1] = "";
        }
        this.field597 = 0;
        this.field599 = 0;
        this.field601 = 0;
        this.field602 = 0;
        this.field598 = false;
        this.field616 = 0;
        this.field607 = false;
        this.field604 = class295.field3706;
        this.field617 = class295.field3706;
        this.field618 = false;
    }

    @ObfuscatedName("bs.n(Lgc;I)V")
    public final void method1093(class190 arg0) {
        arg0.field2423 = 0;
        int var2 = arg0.method3511();
        this.field594 = arg0.method3512();
        this.field612 = arg0.method3512();
        int var3 = -1;
        this.field616 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3511();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3511();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3513();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class275.method4283(var4[var5] - 512).field3509;
                    if (var8 != 0) {
                        this.field616 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3511();
            if (var11 < 0 || var11 >= Statics.field2647[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field927 = arg0.method3513();
        if (this.field927 == 65535) {
            this.field927 = -1;
        }
        this.field928 = arg0.method3513();
        if (this.field928 == 65535) {
            this.field928 = -1;
        }
        this.field962 = this.field928;
        this.field937 = arg0.method3513();
        if (this.field937 == 65535) {
            this.field937 = -1;
        }
        this.field931 = arg0.method3513();
        if (this.field931 == 65535) {
            this.field931 = -1;
        }
        this.field948 = arg0.method3513();
        if (this.field948 == 65535) {
            this.field948 = -1;
        }
        this.field980 = arg0.method3513();
        if (this.field980 == 65535) {
            this.field980 = -1;
        }
        this.field934 = arg0.method3513();
        if (this.field934 == 65535) {
            this.field934 = -1;
        }
        this.field595 = new class297(arg0.method3520(), Statics.field346);
        this.method1115();
        this.method1107();
        if (Statics.field218 == this) {
            Statics.field2017 = this.field595.method5261();
        }
        this.field597 = arg0.method3511();
        this.field599 = arg0.method3513();
        this.field607 = arg0.method3511() == 1;
        if (client.field679 == 0 && client.field821 >= 2) {
            this.field607 = false;
        }
        if (this.field593 == null) {
            this.field593 = new class235();
        }
        this.field593.method4332(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bs.h(I)Z")
    public boolean method1094() {
        if (class295.field3706 == this.field604) {
            this.method1096();
        }
        return class295.field3705 == this.field604;
    }

    @ObfuscatedName("bs.l(I)V")
    public void method1115() {
        this.field604 = class295.field3706;
    }

    @ObfuscatedName("bs.g(I)V")
    public void method1096() {
        this.field604 = Statics.field2434.method1659(this.field595) ? class295.field3705 : class295.field3704;
    }

    @ObfuscatedName("bs.b(I)Z")
    public boolean method1112() {
        if (class295.field3706 == this.field617) {
            this.method1095();
        }
        return class295.field3705 == this.field617;
    }

    @ObfuscatedName("bs.a(I)V")
    public void method1107() {
        this.field617 = class295.field3706;
    }

    @ObfuscatedName("bs.c(I)V")
    public void method1095() {
        this.field617 = Statics.field481 != null && Statics.field481.method5166(this.field595) ? class295.field3705 : class295.field3704;
    }

    @ObfuscatedName("bs.z(I)I")
    public int method1100() {
        return this.field593 == null || this.field593.field2651 == -1 ? 1 : class277.method17(this.field593.field2651).field3549;
    }

    @ObfuscatedName("bs.j(I)Ldq;")
    public final class127 method1101() {
        if (this.field593 == null) {
            return null;
        }
        class279 var1 = this.field954 != -1 && this.field969 == 0 ? class279.method2783(this.field954) : null;
        class279 var2 = this.field951 == -1 || this.field598 || this.field951 == this.field927 && var1 != null ? null : class279.method2783(this.field951);
        class127 var3 = this.field593.method4348(var1, this.field955, var2, this.field952);
        if (var3 == null) {
            return null;
        }
        var3.method2676();
        this.field972 = var3.field1860;
        if (!this.field598 && this.field959 != -1 && this.field960 != -1) {
            class127 var4 = class264.method2268(this.field959).method4686(this.field960);
            if (var4 != null) {
                var4.method2701(0, -this.field966, 0);
                class127[] var5 = new class127[] { var3, var4 };
                var3 = new class127(var5, 2);
            }
        }
        if (!this.field598 && this.field606 != null) {
            if (client.field899 >= this.field602) {
                this.field606 = null;
            }
            if (client.field899 >= this.field601 && client.field899 < this.field602) {
                class127 var6 = this.field606;
                var6.method2701(this.field603 - this.field949, this.field592 - this.field600, this.field605 - this.field922);
                if (this.field973 == 512) {
                    var6.method2683();
                    var6.method2683();
                    var6.method2683();
                } else if (this.field973 == 1024) {
                    var6.method2683();
                    var6.method2683();
                } else if (this.field973 == 1536) {
                    var6.method2683();
                }
                class127[] var7 = new class127[] { var3, var6 };
                var3 = new class127(var7, 2);
                if (this.field973 == 512) {
                    var6.method2683();
                } else if (this.field973 == 1024) {
                    var6.method2683();
                    var6.method2683();
                } else if (this.field973 == 1536) {
                    var6.method2683();
                    var6.method2683();
                    var6.method2683();
                }
                var6.method2701(this.field949 - this.field603, this.field600 - this.field592, this.field922 - this.field605);
            }
        }
        var3.field1673 = true;
        return var3;
    }

    @ObfuscatedName("bs.d(IIBI)V")
    public final void method1102(int arg0, int arg1, byte arg2) {
        if (this.field954 != -1 && class279.method2783(this.field954).field3606 == 1) {
            this.field954 = -1;
        }
        this.field932 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1103(arg0, arg1);
        } else if (this.field977[0] >= 0 && this.field977[0] < 104 && this.field982[0] >= 0 && this.field982[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field977[0];
                int var6 = this.field982[0];
                int var7 = this.method1100();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class173.method2575(var5, var6, this.method1100(), client.method1840(arg0, arg1), client.field641[this.field614], true, client.field904, client.field905);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1125(client.field904[var9], client.field905[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1125(arg0, arg1, arg2);
        } else {
            this.method1103(arg0, arg1);
        }
    }

    @ObfuscatedName("bs.i(IIB)V")
    public void method1103(int arg0, int arg1) {
        this.field957 = 0;
        this.field921 = 0;
        this.field925 = 0;
        this.field977[0] = arg0;
        this.field982[0] = arg1;
        int var3 = this.method1100();
        this.field949 = this.field977[0] * 128 + var3 * 64;
        this.field922 = this.field982[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bs.m(IIBI)V")
    public final void method1125(int arg0, int arg1, byte arg2) {
        if (this.field957 < 9) {
            this.field957++;
        }
        for (int var4 = this.field957; var4 > 0; var4--) {
            this.field977[var4] = this.field977[var4 - 1];
            this.field982[var4] = this.field982[var4 - 1];
            this.field979[var4] = this.field979[var4 - 1];
        }
        this.field977[0] = arg0;
        this.field982[0] = arg1;
        this.field979[0] = arg2;
    }

    @ObfuscatedName("bs.v(B)Z")
    public final boolean method1105() {
        return this.field593 != null;
    }
}
