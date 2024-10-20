package deob;

@ObfuscatedName("z")
public final class class24 extends class28 {

    @ObfuscatedName("z.i")
    public String field241;

    @ObfuscatedName("z.e")
    public class167 field269;

    @ObfuscatedName("z.f")
    public int field242 = -1;

    @ObfuscatedName("z.k")
    public int field243 = -1;

    @ObfuscatedName("z.n")
    public String[] field245 = new String[3];

    @ObfuscatedName("z.a")
    public int field244;

    @ObfuscatedName("z.q")
    public int field257;

    @ObfuscatedName("z.w")
    public int field248;

    @ObfuscatedName("z.v")
    public int field249;

    @ObfuscatedName("z.h")
    public int field250;

    @ObfuscatedName("z.p")
    public int field251;

    @ObfuscatedName("z.l")
    public int field252;

    @ObfuscatedName("z.c")
    public int field253;

    @ObfuscatedName("z.m")
    public class83 field254;

    @ObfuscatedName("z.r")
    public int field255;

    @ObfuscatedName("z.u")
    public int field256;

    @ObfuscatedName("z.j")
    public int field240;

    @ObfuscatedName("z.x")
    public int field258;

    @ObfuscatedName("z.d")
    public boolean field259;

    @ObfuscatedName("z.y")
    public int field260;

    @ObfuscatedName("z.s")
    public boolean field246;

    @ObfuscatedName("z.t")
    public int field262;

    @ObfuscatedName("z.z")
    public int field263;

    @ObfuscatedName("z.b")
    public boolean field264;

    @ObfuscatedName("z.o")
    public int field265;

    @ObfuscatedName("z.ak")
    public int field266;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field245[var1] = "";
        }
        this.field244 = 0;
        this.field257 = 0;
        this.field249 = 0;
        this.field250 = 0;
        this.field259 = false;
        this.field260 = 0;
        this.field246 = false;
        this.field264 = false;
    }

    @ObfuscatedName("z.i(Let;I)V")
    public final void method209(class154 arg0) {
        arg0.field2091 = 0;
        int var2 = arg0.method2573();
        this.field242 = arg0.method2574();
        this.field243 = arg0.method2574();
        int var3 = -1;
        this.field260 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2573();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2573();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2575();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method96(var4[var5] - 512).field2992;
                    if (var8 != 0) {
                        this.field260 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2573();
            if (var11 < 0 || var11 >= Statics.field3170[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field599 = arg0.method2575();
        if (this.field599 == 65535) {
            this.field599 = -1;
        }
        this.field657 = arg0.method2575();
        if (this.field657 == 65535) {
            this.field657 = -1;
        }
        this.field605 = this.field657;
        this.field623 = arg0.method2575();
        if (this.field623 == 65535) {
            this.field623 = -1;
        }
        this.field647 = arg0.method2575();
        if (this.field647 == 65535) {
            this.field647 = -1;
        }
        this.field624 = arg0.method2575();
        if (this.field624 == 65535) {
            this.field624 = -1;
        }
        this.field610 = arg0.method2575();
        if (this.field610 == 65535) {
            this.field610 = -1;
        }
        this.field601 = arg0.method2575();
        if (this.field601 == 65535) {
            this.field601 = -1;
        }
        this.field241 = arg0.method2581();
        if (Statics.field810 == this) {
            Statics.field3071 = this.field241;
        }
        this.field244 = arg0.method2573();
        this.field257 = arg0.method2575();
        this.field246 = arg0.method2573() == 1;
        if (client.field288 == 0 && client.field359 >= 2) {
            this.field246 = false;
        }
        if (this.field269 == null) {
            this.field269 = new class167();
        }
        this.field269.method2871(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("z.e(I)I")
    public int method210() {
        return this.field269 == null || this.field269.field2177 == -1 ? 1 : class200.method1368(this.field269.field2177).field3013;
    }

    @ObfuscatedName("z.f(B)Lch;")
    public final class83 method227() {
        if (this.field269 == null) {
            return null;
        }
        class202 var1 = this.field631 != -1 && this.field634 == 0 ? class202.method2010(this.field631) : null;
        class202 var2 = this.field628 == -1 || this.field259 || this.field628 == this.field599 && var1 != null ? null : class202.method2010(this.field628);
        class83 var3 = this.field269.method2870(var1, this.field611, var2, this.field609);
        if (var3 == null) {
            return null;
        }
        var3.method1468();
        this.field602 = var3.field1540;
        if (!this.field259 && this.field635 != -1 && this.field637 != -1) {
            class83 var4 = class191.method194(this.field635).method3208(this.field637);
            if (var4 != null) {
                var4.method1476(0, -this.field640, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field259 && this.field254 != null) {
            if (client.field294 >= this.field250) {
                this.field254 = null;
            }
            if (client.field294 >= this.field249 && client.field294 < this.field250) {
                class83 var6 = this.field254;
                var6.method1476(this.field251 - this.field629, this.field252 - this.field248, this.field253 - this.field600);
                if (this.field650 == 512) {
                    var6.method1472();
                    var6.method1472();
                    var6.method1472();
                } else if (this.field650 == 1024) {
                    var6.method1472();
                    var6.method1472();
                } else if (this.field650 == 1536) {
                    var6.method1472();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field650 == 512) {
                    var6.method1472();
                } else if (this.field650 == 1024) {
                    var6.method1472();
                    var6.method1472();
                } else if (this.field650 == 1536) {
                    var6.method1472();
                    var6.method1472();
                    var6.method1472();
                }
                var6.method1476(this.field629 - this.field251, this.field248 - this.field252, this.field600 - this.field253);
            }
        }
        var3.field1382 = true;
        return var3;
    }

    @ObfuscatedName("z.k(IIBI)V")
    public final void method222(int arg0, int arg1, byte arg2) {
        if (this.field631 != -1 && class202.method2010(this.field631).field3065 == 1) {
            this.field631 = -1;
        }
        this.field627 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method236(arg0, arg1);
        } else if (this.field632[0] >= 0 && this.field632[0] < 104 && this.field655[0] >= 0 && this.field655[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field632[0];
                int var6 = this.field655[0];
                int var7 = this.method210();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method210();
                    client.field566.field1852 = arg0;
                    client.field566.field1856 = arg1;
                    client.field566.field1853 = 1;
                    client.field566.field1854 = 1;
                    class23 var11 = client.field566;
                    int var12 = class119.method848(var5, var6, var10, var11, client.field377[this.field262], true, client.field567, client.field306);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method214(client.field567[var13], client.field306[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method214(arg0, arg1, arg2);
        } else {
            this.method236(arg0, arg1);
        }
    }

    @ObfuscatedName("z.a(IIB)V")
    public void method236(int arg0, int arg1) {
        this.field653 = 0;
        this.field608 = 0;
        this.field604 = 0;
        this.field632[0] = arg0;
        this.field655[0] = arg1;
        int var3 = this.method210();
        this.field629 = this.field632[0] * 128 + var3 * 64;
        this.field600 = this.field655[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("z.q(IIBI)V")
    public final void method214(int arg0, int arg1, byte arg2) {
        if (this.field653 < 9) {
            this.field653++;
        }
        for (int var4 = this.field653; var4 > 0; var4--) {
            this.field632[var4] = this.field632[var4 - 1];
            this.field655[var4] = this.field655[var4 - 1];
            this.field656[var4] = this.field656[var4 - 1];
        }
        this.field632[0] = arg0;
        this.field655[0] = arg1;
        this.field656[0] = arg2;
    }

    @ObfuscatedName("z.w(I)Z")
    public final boolean method215() {
        return this.field269 != null;
    }
}
