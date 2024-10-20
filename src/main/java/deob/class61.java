package deob;

@ObfuscatedName("bu")
public final class class61 extends class64 {

    @ObfuscatedName("bu.z")
    public class292 field553;

    @ObfuscatedName("bu.w")
    public class228 field547;

    @ObfuscatedName("bu.s")
    public int field571 = -1;

    @ObfuscatedName("bu.l")
    public int field549 = -1;

    @ObfuscatedName("bu.q")
    public String[] field551 = new String[3];

    @ObfuscatedName("bu.k")
    public int field552;

    @ObfuscatedName("bu.i")
    public int field565;

    @ObfuscatedName("bu.x")
    public int field563;

    @ObfuscatedName("bu.e")
    public int field546;

    @ObfuscatedName("bu.p")
    public int field556;

    @ObfuscatedName("bu.b")
    public int field557;

    @ObfuscatedName("bu.n")
    public int field558;

    @ObfuscatedName("bu.f")
    public int field559;

    @ObfuscatedName("bu.g")
    public class120 field564;

    @ObfuscatedName("bu.m")
    public int field560;

    @ObfuscatedName("bu.r")
    public int field548;

    @ObfuscatedName("bu.t")
    public int field566;

    @ObfuscatedName("bu.o")
    public int field554;

    @ObfuscatedName("bu.y")
    public boolean field561;

    @ObfuscatedName("bu.a")
    public int field569;

    @ObfuscatedName("bu.j")
    public boolean field567;

    @ObfuscatedName("bu.d")
    public int field568;

    @ObfuscatedName("bu.h")
    public int field575;

    @ObfuscatedName("bu.c")
    public class290 field570;

    @ObfuscatedName("bu.v")
    public class290 field555;

    @ObfuscatedName("bu.af")
    public boolean field572;

    @ObfuscatedName("bu.ah")
    public int field573;

    @ObfuscatedName("bu.ab")
    public int field574;

    public class61() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field551[var1] = "";
        }
        this.field552 = 0;
        this.field565 = 0;
        this.field546 = 0;
        this.field556 = 0;
        this.field561 = false;
        this.field569 = 0;
        this.field567 = false;
        this.field570 = class290.field3634;
        this.field555 = class290.field3634;
        this.field572 = false;
    }

    @ObfuscatedName("bu.z(Lgk;I)V")
    public final void method1003(class183 arg0) {
        arg0.field2340 = 0;
        int var2 = arg0.method3247();
        this.field571 = arg0.method3384();
        this.field549 = arg0.method3384();
        int var3 = -1;
        this.field569 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3247();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3247();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3253();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class270.method2359(var4[var5] - 512).field3463;
                    if (var8 != 0) {
                        this.field569 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3247();
            if (var11 < 0 || var11 >= Statics.field2573[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field894 = arg0.method3253();
        if (this.field894 == 65535) {
            this.field894 = -1;
        }
        this.field878 = arg0.method3253();
        if (this.field878 == 65535) {
            this.field878 = -1;
        }
        this.field879 = this.field878;
        this.field900 = arg0.method3253();
        if (this.field900 == 65535) {
            this.field900 = -1;
        }
        this.field881 = arg0.method3253();
        if (this.field881 == 65535) {
            this.field881 = -1;
        }
        this.field871 = arg0.method3253();
        if (this.field871 == 65535) {
            this.field871 = -1;
        }
        this.field883 = arg0.method3253();
        if (this.field883 == 65535) {
            this.field883 = -1;
        }
        this.field884 = arg0.method3253();
        if (this.field884 == 65535) {
            this.field884 = -1;
        }
        this.field553 = new class292(arg0.method3441(), Statics.field307);
        this.method1005();
        this.method1007();
        if (Statics.field1877 == this) {
            Statics.field1940 = this.field553.method5033();
        }
        this.field552 = arg0.method3247();
        this.field565 = arg0.method3253();
        this.field567 = arg0.method3247() == 1;
        if (client.field778 == 0 && client.field748 >= 2) {
            this.field567 = false;
        }
        if (this.field547 == null) {
            this.field547 = new class228();
        }
        this.field547.method4096(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bu.w(I)Z")
    public boolean method1004() {
        if (class290.field3634 == this.field570) {
            this.method1006();
        }
        return class290.field3632 == this.field570;
    }

    @ObfuscatedName("bu.s(I)V")
    public void method1005() {
        this.field570 = class290.field3634;
    }

    @ObfuscatedName("bu.l(B)V")
    public void method1006() {
        this.field570 = Statics.field2333.method1530(this.field553) ? class290.field3632 : class290.field3635;
    }

    @ObfuscatedName("bu.u(I)Z")
    public boolean method1025() {
        if (class290.field3634 == this.field555) {
            this.method1008();
        }
        return class290.field3632 == this.field555;
    }

    @ObfuscatedName("bu.q(I)V")
    public void method1007() {
        this.field555 = class290.field3634;
    }

    @ObfuscatedName("bu.i(I)V")
    public void method1008() {
        this.field555 = Statics.field95 != null && Statics.field95.method4935(this.field553) ? class290.field3632 : class290.field3635;
    }

    @ObfuscatedName("bu.x(B)I")
    public int method1009() {
        return this.field547 == null || this.field547.field2570 == -1 ? 1 : class272.method4763(this.field547.field2570).field3498;
    }

    @ObfuscatedName("bu.e(I)Ldc;")
    public final class120 method1010() {
        if (this.field547 == null) {
            return null;
        }
        class274 var1 = this.field904 != -1 && this.field907 == 0 ? class274.method26(this.field904) : null;
        class274 var2 = this.field901 == -1 || this.field561 || this.field901 == this.field894 && var1 != null ? null : class274.method26(this.field901);
        class120 var3 = this.field547.method4102(var1, this.field905, var2, this.field909);
        if (var3 == null) {
            return null;
        }
        var3.method2466();
        this.field926 = var3.field1782;
        if (!this.field561 && this.field892 != -1 && this.field877 != -1) {
            class120 var4 = class259.method956(this.field892).method4475(this.field877);
            if (var4 != null) {
                var4.method2514(0, -this.field872, 0);
                class120[] var5 = new class120[] { var3, var4 };
                var3 = new class120(var5, 2);
            }
        }
        if (!this.field561 && this.field564 != null) {
            if (client.field592 >= this.field556) {
                this.field564 = null;
            }
            if (client.field592 >= this.field546 && client.field592 < this.field556) {
                class120 var6 = this.field564;
                var6.method2514(this.field557 - this.field932, this.field558 - this.field563, this.field559 - this.field882);
                if (this.field927 == 512) {
                    var6.method2473();
                    var6.method2473();
                    var6.method2473();
                } else if (this.field927 == 1024) {
                    var6.method2473();
                    var6.method2473();
                } else if (this.field927 == 1536) {
                    var6.method2473();
                }
                class120[] var7 = new class120[] { var3, var6 };
                var3 = new class120(var7, 2);
                if (this.field927 == 512) {
                    var6.method2473();
                } else if (this.field927 == 1024) {
                    var6.method2473();
                    var6.method2473();
                } else if (this.field927 == 1536) {
                    var6.method2473();
                    var6.method2473();
                    var6.method2473();
                }
                var6.method2514(this.field932 - this.field557, this.field563 - this.field558, this.field882 - this.field559);
            }
        }
        var3.field1604 = true;
        return var3;
    }

    @ObfuscatedName("bu.p(IIBI)V")
    public final void method1027(int arg0, int arg1, byte arg2) {
        if (this.field904 != -1 && class274.method26(this.field904).field3536 == 1) {
            this.field904 = -1;
        }
        this.field921 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1024(arg0, arg1);
        } else if (this.field923[0] >= 0 && this.field923[0] < 104 && this.field873[0] >= 0 && this.field873[0] < 104) {
            if (arg2 == 2) {
                client.method1434(this, arg0, arg1, (byte) 2);
            }
            this.method1026(arg0, arg1, arg2);
        } else {
            this.method1024(arg0, arg1);
        }
    }

    @ObfuscatedName("bu.b(III)V")
    public void method1024(int arg0, int arg1) {
        this.field910 = 0;
        this.field931 = 0;
        this.field924 = 0;
        this.field923[0] = arg0;
        this.field873[0] = arg1;
        int var3 = this.method1009();
        this.field932 = this.field923[0] * 128 + var3 * 64;
        this.field882 = this.field873[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bu.n(IIBB)V")
    public final void method1026(int arg0, int arg1, byte arg2) {
        if (this.field910 < 9) {
            this.field910++;
        }
        for (int var4 = this.field910; var4 > 0; var4--) {
            this.field923[var4] = this.field923[var4 - 1];
            this.field873[var4] = this.field873[var4 - 1];
            this.field929[var4] = this.field929[var4 - 1];
        }
        this.field923[0] = arg0;
        this.field873[0] = arg1;
        this.field929[0] = arg2;
    }

    @ObfuscatedName("bu.f(B)Z")
    public final boolean method1042() {
        return this.field547 != null;
    }
}
