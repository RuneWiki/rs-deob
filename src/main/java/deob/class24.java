package deob;

@ObfuscatedName("n")
public final class class24 extends class28 {

    @ObfuscatedName("n.x")
    public String field283;

    @ObfuscatedName("n.j")
    public class167 field270;

    @ObfuscatedName("n.c")
    public int field272 = -1;

    @ObfuscatedName("n.d")
    public int field273 = -1;

    @ObfuscatedName("n.h")
    public String[] field275 = new String[3];

    @ObfuscatedName("n.u")
    public int field276;

    @ObfuscatedName("n.k")
    public int field282;

    @ObfuscatedName("n.g")
    public int field278;

    @ObfuscatedName("n.y")
    public int field279;

    @ObfuscatedName("n.e")
    public int field293;

    @ObfuscatedName("n.q")
    public int field281;

    @ObfuscatedName("n.v")
    public int field280;

    @ObfuscatedName("n.l")
    public int field289;

    @ObfuscatedName("n.s")
    public class83 field284;

    @ObfuscatedName("n.r")
    public int field271;

    @ObfuscatedName("n.m")
    public int field286;

    @ObfuscatedName("n.i")
    public int field287;

    @ObfuscatedName("n.f")
    public int field288;

    @ObfuscatedName("n.b")
    public boolean field295;

    @ObfuscatedName("n.t")
    public int field290;

    @ObfuscatedName("n.z")
    public boolean field291;

    @ObfuscatedName("n.p")
    public int field292;

    @ObfuscatedName("n.n")
    public int field277;

    @ObfuscatedName("n.a")
    public boolean field294;

    @ObfuscatedName("n.o")
    public int field296;

    @ObfuscatedName("n.ar")
    public int field285;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field275[var1] = "";
        }
        this.field276 = 0;
        this.field282 = 0;
        this.field279 = 0;
        this.field293 = 0;
        this.field295 = false;
        this.field290 = 0;
        this.field291 = false;
        this.field294 = false;
    }

    @ObfuscatedName("n.x(Lek;I)V")
    public final void method245(class154 arg0) {
        arg0.field2086 = 0;
        int var2 = arg0.method2701();
        this.field272 = arg0.method2640();
        this.field273 = arg0.method2640();
        int var3 = -1;
        this.field290 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2701();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2701();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2745();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method2849(var4[var5] - 512).field2996;
                    if (var8 != 0) {
                        this.field290 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2701();
            if (var11 < 0 || var11 >= Statics.field63[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field631 = arg0.method2745();
        if (this.field631 == 65535) {
            this.field631 = -1;
        }
        this.field685 = arg0.method2745();
        if (this.field685 == 65535) {
            this.field685 = -1;
        }
        this.field633 = this.field685;
        this.field668 = arg0.method2745();
        if (this.field668 == 65535) {
            this.field668 = -1;
        }
        this.field635 = arg0.method2745();
        if (this.field635 == 65535) {
            this.field635 = -1;
        }
        this.field636 = arg0.method2745();
        if (this.field636 == 65535) {
            this.field636 = -1;
        }
        this.field669 = arg0.method2745();
        if (this.field669 == 65535) {
            this.field669 = -1;
        }
        this.field652 = arg0.method2745();
        if (this.field652 == 65535) {
            this.field652 = -1;
        }
        this.field283 = arg0.method2699();
        if (Statics.field266 == this) {
            Statics.field1663 = this.field283;
        }
        this.field276 = arg0.method2701();
        this.field282 = arg0.method2745();
        this.field291 = arg0.method2701() == 1;
        if (client.field382 == 0 && client.field481 >= 2) {
            this.field291 = false;
        }
        if (this.field270 == null) {
            this.field270 = new class167();
        }
        this.field270.method2981(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("n.j(I)I")
    public int method246() {
        return this.field270 == null || this.field270.field2165 == -1 ? 1 : class200.method1605(this.field270.field2165).field3009;
    }

    @ObfuscatedName("n.c(S)Lcj;")
    public final class83 method247() {
        if (this.field270 == null) {
            return null;
        }
        class202 var1 = this.field658 != -1 && this.field661 == 0 ? class202.method2997(this.field658) : null;
        class202 var2 = this.field626 == -1 || this.field295 || this.field631 == this.field626 && var1 != null ? null : class202.method2997(this.field626);
        class83 var3 = this.field270.method2964(var1, this.field659, var2, this.field656);
        if (var3 == null) {
            return null;
        }
        var3.method1532();
        this.field655 = var3.field1556;
        if (!this.field295 && this.field634 != -1 && this.field663 != -1) {
            class83 var4 = class191.method3043(this.field634).method3261(this.field663);
            if (var4 != null) {
                var4.method1545(0, -this.field667, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field295 && this.field284 != null) {
            if (client.field320 >= this.field293) {
                this.field284 = null;
            }
            if (client.field320 >= this.field279 && client.field320 < this.field293) {
                class83 var6 = this.field284;
                var6.method1545(this.field281 - this.field675, this.field280 - this.field278, this.field289 - this.field627);
                if (this.field677 == 512) {
                    var6.method1562();
                    var6.method1562();
                    var6.method1562();
                } else if (this.field677 == 1024) {
                    var6.method1562();
                    var6.method1562();
                } else if (this.field677 == 1536) {
                    var6.method1562();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field677 == 512) {
                    var6.method1562();
                } else if (this.field677 == 1024) {
                    var6.method1562();
                    var6.method1562();
                } else if (this.field677 == 1536) {
                    var6.method1562();
                    var6.method1562();
                    var6.method1562();
                }
                var6.method1545(this.field675 - this.field281, this.field278 - this.field280, this.field627 - this.field289);
            }
        }
        var3.field1391 = true;
        return var3;
    }

    @ObfuscatedName("n.d(IIBB)V")
    public final void method248(int arg0, int arg1, byte arg2) {
        if (this.field658 != -1 && class202.method2997(this.field658).field3071 == 1) {
            this.field658 = -1;
        }
        this.field654 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method249(arg0, arg1);
        } else if (this.field681[0] >= 0 && this.field681[0] < 104 && this.field632[0] >= 0 && this.field632[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field681[0];
                int var6 = this.field632[0];
                int var7 = this.method246();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method246();
                    client.field593.field1860 = arg0;
                    client.field593.field1859 = arg1;
                    client.field593.field1861 = 1;
                    client.field593.field1862 = 1;
                    class23 var11 = client.field593;
                    int var12 = class119.method1857(var5, var6, var10, var11, client.field373[this.field292], true, client.field594, client.field595);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method250(client.field594[var13], client.field595[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method250(arg0, arg1, arg2);
        } else {
            this.method249(arg0, arg1);
        }
    }

    @ObfuscatedName("n.w(III)V")
    public void method249(int arg0, int arg1) {
        this.field680 = 0;
        this.field637 = 0;
        this.field684 = 0;
        this.field681[0] = arg0;
        this.field632[0] = arg1;
        int var3 = this.method246();
        this.field675 = this.field681[0] * 128 + var3 * 64;
        this.field627 = this.field632[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("n.u(IIBI)V")
    public final void method250(int arg0, int arg1, byte arg2) {
        if (this.field680 < 9) {
            this.field680++;
        }
        for (int var4 = this.field680; var4 > 0; var4--) {
            this.field681[var4] = this.field681[var4 - 1];
            this.field632[var4] = this.field632[var4 - 1];
            this.field683[var4] = this.field683[var4 - 1];
        }
        this.field681[0] = arg0;
        this.field632[0] = arg1;
        this.field683[0] = arg2;
    }

    @ObfuscatedName("n.y(B)Z")
    public final boolean method251() {
        return this.field270 != null;
    }
}
