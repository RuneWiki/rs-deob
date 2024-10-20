package deob;

@ObfuscatedName("t")
public final class class24 extends class28 {

    @ObfuscatedName("t.f")
    public String field279;

    @ObfuscatedName("t.i")
    public class167 field257;

    @ObfuscatedName("t.u")
    public int field275 = -1;

    @ObfuscatedName("t.h")
    public int field259 = -1;

    @ObfuscatedName("t.o")
    public String[] field276 = new String[3];

    @ObfuscatedName("t.l")
    public int field261;

    @ObfuscatedName("t.n")
    public int field262;

    @ObfuscatedName("t.m")
    public int field263;

    @ObfuscatedName("t.w")
    public int field278;

    @ObfuscatedName("t.j")
    public int field265;

    @ObfuscatedName("t.s")
    public int field281;

    @ObfuscatedName("t.q")
    public int field269;

    @ObfuscatedName("t.d")
    public int field268;

    @ObfuscatedName("t.p")
    public class83 field258;

    @ObfuscatedName("t.y")
    public int field270;

    @ObfuscatedName("t.a")
    public int field271;

    @ObfuscatedName("t.v")
    public int field272;

    @ObfuscatedName("t.z")
    public int field273;

    @ObfuscatedName("t.x")
    public boolean field274;

    @ObfuscatedName("t.g")
    public int field280;

    @ObfuscatedName("t.b")
    public boolean field266;

    @ObfuscatedName("t.k")
    public int field277;

    @ObfuscatedName("t.t")
    public int field267;

    @ObfuscatedName("t.c")
    public boolean field260;

    @ObfuscatedName("t.e")
    public int field264;

    @ObfuscatedName("t.am")
    public int field256;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field276[var1] = "";
        }
        this.field261 = 0;
        this.field262 = 0;
        this.field278 = 0;
        this.field265 = 0;
        this.field274 = false;
        this.field280 = 0;
        this.field266 = false;
        this.field260 = false;
    }

    @ObfuscatedName("t.f(Leo;I)V")
    public final void method207(class154 arg0) {
        arg0.field2111 = 0;
        int var2 = arg0.method2666();
        this.field275 = arg0.method2667();
        this.field259 = arg0.method2667();
        int var3 = -1;
        this.field280 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2666();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2666();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2668();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method3402(var4[var5] - 512).field2999;
                    if (var8 != 0) {
                        this.field280 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2666();
            if (var11 < 0 || var11 >= Statics.field2192[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field624 = arg0.method2668();
        if (this.field624 == 65535) {
            this.field624 = -1;
        }
        this.field634 = arg0.method2668();
        if (this.field634 == 65535) {
            this.field634 = -1;
        }
        this.field626 = this.field634;
        this.field627 = arg0.method2668();
        if (this.field627 == 65535) {
            this.field627 = -1;
        }
        this.field628 = arg0.method2668();
        if (this.field628 == 65535) {
            this.field628 = -1;
        }
        this.field646 = arg0.method2668();
        if (this.field646 == 65535) {
            this.field646 = -1;
        }
        this.field630 = arg0.method2668();
        if (this.field630 == 65535) {
            this.field630 = -1;
        }
        this.field631 = arg0.method2668();
        if (this.field631 == 65535) {
            this.field631 = -1;
        }
        this.field279 = arg0.method2674();
        if (Statics.field899 == this) {
            Statics.field1676 = this.field279;
        }
        this.field261 = arg0.method2666();
        this.field262 = arg0.method2668();
        this.field266 = arg0.method2666() == 1;
        if (client.field581 == 0 && client.field471 >= 2) {
            this.field266 = false;
        }
        if (this.field257 == null) {
            this.field257 = new class167();
        }
        this.field257.method3020(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("t.i(B)I")
    public int method208() {
        return this.field257 == null || this.field257.field2188 == -1 ? 1 : class200.method168(this.field257.field2188).field3012;
    }

    @ObfuscatedName("t.u(B)Lce;")
    public final class83 method209() {
        if (this.field257 == null) {
            return null;
        }
        class202 var1 = this.field651 != -1 && this.field621 == 0 ? class202.method164(this.field651) : null;
        class202 var2 = this.field648 == -1 || this.field274 || this.field648 == this.field624 && var1 != null ? null : class202.method164(this.field648);
        class83 var3 = this.field257.method2995(var1, this.field654, var2, this.field655);
        if (var3 == null) {
            return null;
        }
        var3.method1556();
        this.field677 = var3.field1564;
        if (!this.field274 && this.field669 != -1 && this.field679 != -1) {
            class83 var4 = class191.method2599(this.field669).method3293(this.field679);
            if (var4 != null) {
                var4.method1510(0, -this.field660, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field274 && this.field258 != null) {
            if (client.field312 >= this.field265) {
                this.field258 = null;
            }
            if (client.field312 >= this.field278 && client.field312 < this.field265) {
                class83 var6 = this.field258;
                var6.method1510(this.field281 - this.field625, this.field269 - this.field263, this.field268 - this.field620);
                if (this.field670 == 512) {
                    var6.method1569();
                    var6.method1569();
                    var6.method1569();
                } else if (this.field670 == 1024) {
                    var6.method1569();
                    var6.method1569();
                } else if (this.field670 == 1536) {
                    var6.method1569();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field670 == 512) {
                    var6.method1569();
                } else if (this.field670 == 1024) {
                    var6.method1569();
                    var6.method1569();
                } else if (this.field670 == 1536) {
                    var6.method1569();
                    var6.method1569();
                    var6.method1569();
                }
                var6.method1510(this.field625 - this.field281, this.field263 - this.field269, this.field620 - this.field268);
            }
        }
        var3.field1410 = true;
        return var3;
    }

    @ObfuscatedName("t.r(IIBI)V")
    public final void method210(int arg0, int arg1, byte arg2) {
        if (this.field651 != -1 && class202.method164(this.field651).field3073 == 1) {
            this.field651 = -1;
        }
        this.field647 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method217(arg0, arg1);
        } else if (this.field674[0] >= 0 && this.field674[0] < 104 && this.field675[0] >= 0 && this.field675[0] < 104) {
            if (arg2 == 2) {
                client.method901(this, arg0, arg1, (byte) 2);
            }
            this.method212(arg0, arg1, arg2);
        } else {
            this.method217(arg0, arg1);
        }
    }

    @ObfuscatedName("t.o(III)V")
    public void method217(int arg0, int arg1) {
        this.field673 = 0;
        this.field656 = 0;
        this.field652 = 0;
        this.field674[0] = arg0;
        this.field675[0] = arg1;
        int var3 = this.method208();
        this.field625 = this.field674[0] * 128 + var3 * 64;
        this.field620 = this.field675[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("t.l(IIBB)V")
    public final void method212(int arg0, int arg1, byte arg2) {
        if (this.field673 < 9) {
            this.field673++;
        }
        for (int var4 = this.field673; var4 > 0; var4--) {
            this.field674[var4] = this.field674[var4 - 1];
            this.field675[var4] = this.field675[var4 - 1];
            this.field676[var4] = this.field676[var4 - 1];
        }
        this.field674[0] = arg0;
        this.field675[0] = arg1;
        this.field676[0] = arg2;
    }

    @ObfuscatedName("t.n(I)Z")
    public final boolean method213() {
        return this.field257 != null;
    }
}
