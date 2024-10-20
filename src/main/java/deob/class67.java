package deob;

@ObfuscatedName("br")
public final class class67 extends class70 {

    @ObfuscatedName("br.m")
    public class295 field599;

    @ObfuscatedName("br.f")
    public class226 field588;

    @ObfuscatedName("br.q")
    public int field614 = -1;

    @ObfuscatedName("br.w")
    public int field590 = -1;

    @ObfuscatedName("br.u")
    public String[] field591 = new String[3];

    @ObfuscatedName("br.g")
    public int field592;

    @ObfuscatedName("br.l")
    public int field589;

    @ObfuscatedName("br.e")
    public int field601;

    @ObfuscatedName("br.x")
    public int field595;

    @ObfuscatedName("br.d")
    public int field596;

    @ObfuscatedName("br.k")
    public int field597;

    @ObfuscatedName("br.n")
    public int field598;

    @ObfuscatedName("br.i")
    public int field607;

    @ObfuscatedName("br.a")
    public class128 field600;

    @ObfuscatedName("br.z")
    public int field606;

    @ObfuscatedName("br.j")
    public int field594;

    @ObfuscatedName("br.s")
    public int field603;

    @ObfuscatedName("br.t")
    public int field602;

    @ObfuscatedName("br.y")
    public boolean field605;

    @ObfuscatedName("br.h")
    public int field611;

    @ObfuscatedName("br.b")
    public boolean field587;

    @ObfuscatedName("br.c")
    public int field608;

    @ObfuscatedName("br.r")
    public int field609;

    @ObfuscatedName("br.p")
    public class293 field604;

    @ObfuscatedName("br.v")
    public class293 field593;

    @ObfuscatedName("br.ag")
    public boolean field612;

    @ObfuscatedName("br.aq")
    public int field613;

    @ObfuscatedName("br.aj")
    public int field610;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field591[var1] = "";
        }
        this.field592 = 0;
        this.field589 = 0;
        this.field595 = 0;
        this.field596 = 0;
        this.field605 = false;
        this.field611 = 0;
        this.field587 = false;
        this.field604 = class293.field3706;
        this.field593 = class293.field3706;
        this.field612 = false;
    }

    @ObfuscatedName("br.m(Lgr;I)V")
    public final void method1097(class202 arg0) {
        arg0.field2439 = 0;
        int var2 = arg0.method3551();
        this.field614 = arg0.method3537();
        this.field590 = arg0.method3537();
        int var3 = -1;
        this.field611 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3551();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3551();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3530();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class266.method4129(var4[var5] - 512).field3520;
                    if (var8 != 0) {
                        this.field611 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3551();
            if (var11 < 0 || var11 >= Statics.field2788[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field962 = arg0.method3530();
        if (this.field962 == 65535) {
            this.field962 = -1;
        }
        this.field922 = arg0.method3530();
        if (this.field922 == 65535) {
            this.field922 = -1;
        }
        this.field923 = this.field922;
        this.field924 = arg0.method3530();
        if (this.field924 == 65535) {
            this.field924 = -1;
        }
        this.field925 = arg0.method3530();
        if (this.field925 == 65535) {
            this.field925 = -1;
        }
        this.field915 = arg0.method3530();
        if (this.field915 == 65535) {
            this.field915 = -1;
        }
        this.field927 = arg0.method3530();
        if (this.field927 == 65535) {
            this.field927 = -1;
        }
        this.field920 = arg0.method3530();
        if (this.field920 == 65535) {
            this.field920 = -1;
        }
        this.field599 = new class295(arg0.method3426(), Statics.field366);
        this.method1099();
        this.method1102();
        if (Statics.field389 == this) {
            Statics.field2012 = this.field599.method5136();
        }
        this.field592 = arg0.method3551();
        this.field589 = arg0.method3530();
        this.field587 = arg0.method3551() == 1;
        if (client.field753 == 0 && client.field791 >= 2) {
            this.field587 = false;
        }
        if (this.field588 == null) {
            this.field588 = new class226();
        }
        this.field588.method4026(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("br.f(B)Z")
    public boolean method1098() {
        if (class293.field3706 == this.field604) {
            this.method1121();
        }
        return class293.field3704 == this.field604;
    }

    @ObfuscatedName("br.q(I)V")
    public void method1099() {
        this.field604 = class293.field3706;
    }

    @ObfuscatedName("br.w(I)V")
    public void method1121() {
        this.field604 = Statics.field205.method1696(this.field599) ? class293.field3704 : class293.field3708;
    }

    @ObfuscatedName("br.o(B)Z")
    public boolean method1108() {
        if (class293.field3706 == this.field593) {
            this.method1126();
        }
        return class293.field3704 == this.field593;
    }

    @ObfuscatedName("br.u(I)V")
    public void method1102() {
        this.field593 = class293.field3706;
    }

    @ObfuscatedName("br.g(I)V")
    public void method1126() {
        this.field593 = Statics.field1298 != null && Statics.field1298.method5072(this.field599) ? class293.field3704 : class293.field3708;
    }

    @ObfuscatedName("br.l(I)I")
    public int method1112() {
        return this.field588 == null || this.field588.field2615 == -1 ? 1 : class268.method4643(this.field588.field2615).field3539;
    }

    @ObfuscatedName("br.e(I)Ldu;")
    public final class128 method1105() {
        if (this.field588 == null) {
            return null;
        }
        class270 var1 = this.field948 != -1 && this.field947 == 0 ? class270.method596(this.field948) : null;
        class270 var2 = this.field945 == -1 || this.field605 || this.field962 == this.field945 && var1 != null ? null : class270.method596(this.field945);
        class128 var3 = this.field588.method4031(var1, this.field926, var2, this.field946);
        if (var3 == null) {
            return null;
        }
        var3.method2659();
        this.field966 = var3.field1851;
        if (!this.field605 && this.field934 != -1 && this.field921 != -1) {
            class128 var4 = class255.method756(this.field934).method4396(this.field921);
            if (var4 != null) {
                var4.method2634(0, -this.field949, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field605 && this.field600 != null) {
            if (client.field633 >= this.field596) {
                this.field600 = null;
            }
            if (client.field633 >= this.field595 && client.field633 < this.field596) {
                class128 var6 = this.field600;
                var6.method2634(this.field597 - this.field957, this.field598 - this.field601, this.field607 - this.field916);
                if (this.field967 == 512) {
                    var6.method2660();
                    var6.method2660();
                    var6.method2660();
                } else if (this.field967 == 1024) {
                    var6.method2660();
                    var6.method2660();
                } else if (this.field967 == 1536) {
                    var6.method2660();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field967 == 512) {
                    var6.method2660();
                } else if (this.field967 == 1024) {
                    var6.method2660();
                    var6.method2660();
                } else if (this.field967 == 1536) {
                    var6.method2660();
                    var6.method2660();
                    var6.method2660();
                }
                var6.method2634(this.field957 - this.field597, this.field601 - this.field598, this.field916 - this.field607);
            }
        }
        var3.field1644 = true;
        return var3;
    }

    @ObfuscatedName("br.x(IIBI)V")
    public final void method1134(int arg0, int arg1, byte arg2) {
        if (this.field948 != -1 && class270.method596(this.field948).field3593 == 1) {
            this.field948 = -1;
        }
        this.field944 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1107(arg0, arg1);
        } else if (this.field953[0] >= 0 && this.field953[0] < 104 && this.field935[0] >= 0 && this.field935[0] < 104) {
            if (arg2 == 2) {
                client.method281(this, arg0, arg1, (byte) 2);
            }
            this.method1113(arg0, arg1, arg2);
        } else {
            this.method1107(arg0, arg1);
        }
    }

    @ObfuscatedName("br.d(III)V")
    public void method1107(int arg0, int arg1) {
        this.field970 = 0;
        this.field975 = 0;
        this.field951 = 0;
        this.field953[0] = arg0;
        this.field935[0] = arg1;
        int var3 = this.method1112();
        this.field957 = this.field953[0] * 128 + var3 * 64;
        this.field916 = this.field935[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("br.a(IIBI)V")
    public final void method1113(int arg0, int arg1, byte arg2) {
        if (this.field970 < 9) {
            this.field970++;
        }
        for (int var4 = this.field970; var4 > 0; var4--) {
            this.field953[var4] = this.field953[var4 - 1];
            this.field935[var4] = this.field935[var4 - 1];
            this.field973[var4] = this.field973[var4 - 1];
        }
        this.field953[0] = arg0;
        this.field935[0] = arg1;
        this.field973[0] = arg2;
    }

    @ObfuscatedName("br.z(B)Z")
    public final boolean method1109() {
        return this.field588 != null;
    }
}
