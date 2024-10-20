package deob;

@ObfuscatedName("v")
public final class class24 extends class28 {

    @ObfuscatedName("v.n")
    public String field257;

    @ObfuscatedName("v.d")
    public class148 field245;

    @ObfuscatedName("v.m")
    public int field260 = -1;

    @ObfuscatedName("v.h")
    public int field247 = -1;

    @ObfuscatedName("v.r")
    public String[] field251 = new String[3];

    @ObfuscatedName("v.c")
    public int field249;

    @ObfuscatedName("v.p")
    public int field250;

    @ObfuscatedName("v.g")
    public int field244;

    @ObfuscatedName("v.z")
    public int field252;

    @ObfuscatedName("v.q")
    public int field253;

    @ObfuscatedName("v.l")
    public int field254;

    @ObfuscatedName("v.y")
    public int field255;

    @ObfuscatedName("v.e")
    public int field258;

    @ObfuscatedName("v.x")
    public class83 field256;

    @ObfuscatedName("v.f")
    public int field246;

    @ObfuscatedName("v.s")
    public int field259;

    @ObfuscatedName("v.o")
    public int field267;

    @ObfuscatedName("v.i")
    public int field261;

    @ObfuscatedName("v.a")
    public boolean field262;

    @ObfuscatedName("v.b")
    public int field263;

    @ObfuscatedName("v.j")
    public boolean field264;

    @ObfuscatedName("v.k")
    public int field268;

    @ObfuscatedName("v.v")
    public int field266;

    @ObfuscatedName("v.u")
    public boolean field265;

    @ObfuscatedName("v.t")
    public int field248;

    @ObfuscatedName("v.av")
    public int field269;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field251[var1] = "";
        }
        this.field249 = 0;
        this.field250 = 0;
        this.field252 = 0;
        this.field253 = 0;
        this.field262 = false;
        this.field263 = 0;
        this.field264 = false;
        this.field265 = false;
    }

    @ObfuscatedName("v.n(Lfa;I)V")
    public final void method231(class161 arg0) {
        arg0.field2285 = 0;
        int var2 = arg0.method2823();
        this.field260 = arg0.method2837();
        this.field247 = arg0.method2837();
        int var3 = -1;
        this.field263 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2823();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2823();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2887();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method207(var4[var5] - 512).field2987;
                    if (var8 != 0) {
                        this.field263 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2823();
            if (var11 < 0 || var11 >= Statics.field1824[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field601 = arg0.method2887();
        if (this.field601 == 65535) {
            this.field601 = -1;
        }
        this.field602 = arg0.method2887();
        if (this.field602 == 65535) {
            this.field602 = -1;
        }
        this.field605 = this.field602;
        this.field604 = arg0.method2887();
        if (this.field604 == 65535) {
            this.field604 = -1;
        }
        this.field651 = arg0.method2887();
        if (this.field651 == 65535) {
            this.field651 = -1;
        }
        this.field606 = arg0.method2887();
        if (this.field606 == 65535) {
            this.field606 = -1;
        }
        this.field607 = arg0.method2887();
        if (this.field607 == 65535) {
            this.field607 = -1;
        }
        this.field631 = arg0.method2887();
        if (this.field631 == 65535) {
            this.field631 = -1;
        }
        this.field257 = arg0.method2847();
        if (Statics.field810 == this) {
            Statics.field1645 = this.field257;
        }
        this.field249 = arg0.method2823();
        this.field250 = arg0.method2887();
        this.field264 = arg0.method2823() == 1;
        if (client.field444 == 0 && client.field504 >= 2) {
            this.field264 = false;
        }
        if (this.field245 == null) {
            this.field245 = new class148();
        }
        this.field245.method2584(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.d(B)I")
    public int method241() {
        return this.field245 == null || this.field245.field2036 == -1 ? 1 : class200.method2713(this.field245.field2036).field3010;
    }

    @ObfuscatedName("v.m(I)Lca;")
    public final class83 method233() {
        if (this.field245 == null) {
            return null;
        }
        class202 var1 = this.field628 != -1 && this.field646 == 0 ? class202.method119(this.field628) : null;
        class202 var2 = this.field625 == -1 || this.field262 || this.field625 == this.field601 && var1 != null ? null : class202.method119(this.field625);
        class83 var3 = this.field245.method2589(var1, this.field621, var2, this.field654);
        if (var3 == null) {
            return null;
        }
        var3.method1494();
        this.field622 = var3.field1535;
        if (!this.field262 && this.field633 != -1 && this.field634 != -1) {
            class83 var4 = class191.method3085(this.field633).method3266(this.field634);
            if (var4 != null) {
                var4.method1498(0, -this.field637, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field262 && this.field256 != null) {
            if (client.field295 >= this.field253) {
                this.field256 = null;
            }
            if (client.field295 >= this.field252 && client.field295 < this.field253) {
                class83 var6 = this.field256;
                var6.method1498(this.field254 - this.field648, this.field255 - this.field244, this.field258 - this.field597);
                if (this.field647 == 512) {
                    var6.method1500();
                    var6.method1500();
                    var6.method1500();
                } else if (this.field647 == 1024) {
                    var6.method1500();
                    var6.method1500();
                } else if (this.field647 == 1536) {
                    var6.method1500();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field647 == 512) {
                    var6.method1500();
                } else if (this.field647 == 1024) {
                    var6.method1500();
                    var6.method1500();
                } else if (this.field647 == 1536) {
                    var6.method1500();
                    var6.method1500();
                    var6.method1500();
                }
                var6.method1498(this.field648 - this.field254, this.field244 - this.field255, this.field597 - this.field258);
            }
        }
        var3.field1400 = true;
        return var3;
    }

    @ObfuscatedName("v.h(IIBB)V")
    public final void method234(int arg0, int arg1, byte arg2) {
        if (this.field628 != -1 && class202.method119(this.field628).field3063 == 1) {
            this.field628 = -1;
        }
        this.field624 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method235(arg0, arg1);
        } else if (this.field629[0] >= 0 && this.field629[0] < 104 && this.field652[0] >= 0 && this.field652[0] < 104) {
            if (arg2 == 2) {
                client.method1859(this, arg0, arg1, (byte) 2);
            }
            this.method236(arg0, arg1, arg2);
        } else {
            this.method235(arg0, arg1);
        }
    }

    @ObfuscatedName("v.w(III)V")
    public void method235(int arg0, int arg1) {
        this.field650 = 0;
        this.field655 = 0;
        this.field635 = 0;
        this.field629[0] = arg0;
        this.field652[0] = arg1;
        int var3 = this.method241();
        this.field648 = this.field629[0] * 128 + var3 * 64;
        this.field597 = this.field652[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("v.r(IIBI)V")
    public final void method236(int arg0, int arg1, byte arg2) {
        if (this.field650 < 9) {
            this.field650++;
        }
        for (int var4 = this.field650; var4 > 0; var4--) {
            this.field629[var4] = this.field629[var4 - 1];
            this.field652[var4] = this.field652[var4 - 1];
            this.field626[var4] = this.field626[var4 - 1];
        }
        this.field629[0] = arg0;
        this.field652[0] = arg1;
        this.field626[0] = arg2;
    }

    @ObfuscatedName("v.c(I)Z")
    public final boolean method237() {
        return this.field245 != null;
    }
}
