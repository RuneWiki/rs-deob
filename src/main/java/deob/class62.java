package deob;

@ObfuscatedName("bw")
public final class class62 extends class65 {

    @ObfuscatedName("bw.f")
    public class294 field597;

    @ObfuscatedName("bw.l")
    public class230 field596;

    @ObfuscatedName("bw.w")
    public int field624 = -1;

    @ObfuscatedName("bw.s")
    public int field598 = -1;

    @ObfuscatedName("bw.a")
    public String[] field608 = new String[3];

    @ObfuscatedName("bw.c")
    public int field602;

    @ObfuscatedName("bw.p")
    public int field617;

    @ObfuscatedName("bw.r")
    public int field603;

    @ObfuscatedName("bw.m")
    public int field604;

    @ObfuscatedName("bw.d")
    public int field605;

    @ObfuscatedName("bw.z")
    public int field606;

    @ObfuscatedName("bw.x")
    public int field614;

    @ObfuscatedName("bw.v")
    public int field616;

    @ObfuscatedName("bw.g")
    public class122 field609;

    @ObfuscatedName("bw.j")
    public int field610;

    @ObfuscatedName("bw.b")
    public int field623;

    @ObfuscatedName("bw.u")
    public int field612;

    @ObfuscatedName("bw.t")
    public int field613;

    @ObfuscatedName("bw.n")
    public boolean field599;

    @ObfuscatedName("bw.h")
    public int field615;

    @ObfuscatedName("bw.o")
    public boolean field595;

    @ObfuscatedName("bw.i")
    public int field600;

    @ObfuscatedName("bw.k")
    public int field618;

    @ObfuscatedName("bw.q")
    public class292 field611;

    @ObfuscatedName("bw.y")
    public class292 field620;

    @ObfuscatedName("bw.av")
    public boolean field621;

    @ObfuscatedName("bw.ag")
    public int field622;

    @ObfuscatedName("bw.af")
    public int field601;

    public class62() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field608[var1] = "";
        }
        this.field602 = 0;
        this.field617 = 0;
        this.field604 = 0;
        this.field605 = 0;
        this.field599 = false;
        this.field615 = 0;
        this.field595 = false;
        this.field611 = class292.field3705;
        this.field620 = class292.field3705;
        this.field621 = false;
    }

    @ObfuscatedName("bw.f(Lgm;I)V")
    public final void method1034(class185 arg0) {
        arg0.field2414 = 0;
        int var2 = arg0.method3344();
        this.field624 = arg0.method3345();
        this.field598 = arg0.method3345();
        int var3 = -1;
        this.field615 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3344();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3344();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3346();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class272.method92(var4[var5] - 512).field3519;
                    if (var8 != 0) {
                        this.field615 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3344();
            if (var11 < 0 || var11 >= Statics.field2643[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field942 = arg0.method3346();
        if (this.field942 == 65535) {
            this.field942 = -1;
        }
        this.field980 = arg0.method3346();
        if (this.field980 == 65535) {
            this.field980 = -1;
        }
        this.field975 = this.field980;
        this.field956 = arg0.method3346();
        if (this.field956 == 65535) {
            this.field956 = -1;
        }
        this.field933 = arg0.method3346();
        if (this.field933 == 65535) {
            this.field933 = -1;
        }
        this.field930 = arg0.method3346();
        if (this.field930 == 65535) {
            this.field930 = -1;
        }
        this.field936 = arg0.method3346();
        if (this.field936 == 65535) {
            this.field936 = -1;
        }
        this.field937 = arg0.method3346();
        if (this.field937 == 65535) {
            this.field937 = -1;
        }
        this.field597 = new class294(arg0.method3353(), Statics.field3846);
        this.method1059();
        this.method1044();
        if (Statics.field138 == this) {
            Statics.field1995 = this.field597.method5130();
        }
        this.field602 = arg0.method3344();
        this.field617 = arg0.method3346();
        this.field595 = arg0.method3344() == 1;
        if (client.field632 == 0 && client.field740 >= 2) {
            this.field595 = false;
        }
        if (this.field596 == null) {
            this.field596 = new class230();
        }
        this.field596.method4175(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bw.l(I)Z")
    public boolean method1046() {
        if (class292.field3705 == this.field611) {
            this.method1037();
        }
        return class292.field3704 == this.field611;
    }

    @ObfuscatedName("bw.w(I)V")
    public void method1059() {
        this.field611 = class292.field3705;
    }

    @ObfuscatedName("bw.s(B)V")
    public void method1037() {
        this.field611 = Statics.field1863.method1579(this.field597) ? class292.field3704 : class292.field3706;
    }

    @ObfuscatedName("bw.e(I)Z")
    public boolean method1038() {
        if (class292.field3705 == this.field620) {
            this.method1040();
        }
        return class292.field3704 == this.field620;
    }

    @ObfuscatedName("bw.c(I)V")
    public void method1044() {
        this.field620 = class292.field3705;
    }

    @ObfuscatedName("bw.p(B)V")
    public void method1040() {
        this.field620 = Statics.field2353 != null && Statics.field2353.method5038(this.field597) ? class292.field3704 : class292.field3706;
    }

    @ObfuscatedName("bw.r(I)I")
    public int method1041() {
        return this.field596 == null || this.field596.field2639 == -1 ? 1 : class274.method187(this.field596.field2639).field3565;
    }

    @ObfuscatedName("bw.m(S)Lds;")
    public final class122 method1042() {
        if (this.field596 == null) {
            return null;
        }
        class276 var1 = this.field939 != -1 && this.field960 == 0 ? class276.method3224(this.field939) : null;
        class276 var2 = this.field931 == -1 || this.field599 || this.field942 == this.field931 && var1 != null ? null : class276.method3224(this.field931);
        class122 var3 = this.field596.method4160(var1, this.field958, var2, this.field955);
        if (var3 == null) {
            return null;
        }
        var3.method2535();
        this.field924 = var3.field1841;
        if (!this.field599 && this.field962 != -1 && this.field963 != -1) {
            class122 var4 = class261.method2403(this.field962).method4533(this.field963);
            if (var4 != null) {
                var4.method2566(0, -this.field952, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (!this.field599 && this.field609 != null) {
            if (client.field642 >= this.field605) {
                this.field609 = null;
            }
            if (client.field642 >= this.field604 && client.field642 < this.field605) {
                class122 var6 = this.field609;
                var6.method2566(this.field606 - this.field943, this.field614 - this.field603, this.field616 - this.field925);
                if (this.field976 == 512) {
                    var6.method2588();
                    var6.method2588();
                    var6.method2588();
                } else if (this.field976 == 1024) {
                    var6.method2588();
                    var6.method2588();
                } else if (this.field976 == 1536) {
                    var6.method2588();
                }
                class122[] var7 = new class122[] { var3, var6 };
                var3 = new class122(var7, 2);
                if (this.field976 == 512) {
                    var6.method2588();
                } else if (this.field976 == 1024) {
                    var6.method2588();
                    var6.method2588();
                } else if (this.field976 == 1536) {
                    var6.method2588();
                    var6.method2588();
                    var6.method2588();
                }
                var6.method2566(this.field943 - this.field606, this.field603 - this.field614, this.field925 - this.field616);
            }
        }
        var3.field1663 = true;
        return var3;
    }

    @ObfuscatedName("bw.d(IIBI)V")
    public final void method1033(int arg0, int arg1, byte arg2) {
        if (this.field939 != -1 && class276.method3224(this.field939).field3610 == 1) {
            this.field939 = -1;
        }
        this.field967 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1047(arg0, arg1);
        } else if (this.field954[0] >= 0 && this.field954[0] < 104 && this.field981[0] >= 0 && this.field981[0] < 104) {
            if (arg2 == 2) {
                client.method2099(this, arg0, arg1, (byte) 2);
            }
            this.method1080(arg0, arg1, arg2);
        } else {
            this.method1047(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.z(III)V")
    public void method1047(int arg0, int arg1) {
        this.field945 = 0;
        this.field984 = 0;
        this.field973 = 0;
        this.field954[0] = arg0;
        this.field981[0] = arg1;
        int var3 = this.method1041();
        this.field943 = this.field954[0] * 128 + var3 * 64;
        this.field925 = this.field981[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bw.x(IIBB)V")
    public final void method1080(int arg0, int arg1, byte arg2) {
        if (this.field945 < 9) {
            this.field945++;
        }
        for (int var4 = this.field945; var4 > 0; var4--) {
            this.field954[var4] = this.field954[var4 - 1];
            this.field981[var4] = this.field981[var4 - 1];
            this.field982[var4] = this.field982[var4 - 1];
        }
        this.field954[0] = arg0;
        this.field981[0] = arg1;
        this.field982[0] = arg2;
    }

    @ObfuscatedName("bw.v(B)Z")
    public final boolean method1043() {
        return this.field596 != null;
    }
}
