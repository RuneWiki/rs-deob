package deob;

@ObfuscatedName("j")
public final class class24 extends class28 {

    @ObfuscatedName("j.b")
    public String field264;

    @ObfuscatedName("j.l")
    public class167 field241;

    @ObfuscatedName("j.i")
    public int field242 = -1;

    @ObfuscatedName("j.t")
    public int field257 = -1;

    @ObfuscatedName("j.h")
    public String[] field244 = new String[3];

    @ObfuscatedName("j.n")
    public int field249;

    @ObfuscatedName("j.f")
    public int field246;

    @ObfuscatedName("j.a")
    public int field263;

    @ObfuscatedName("j.r")
    public int field247;

    @ObfuscatedName("j.x")
    public int field240;

    @ObfuscatedName("j.z")
    public int field250;

    @ObfuscatedName("j.p")
    public int field248;

    @ObfuscatedName("j.s")
    public int field252;

    @ObfuscatedName("j.o")
    public class83 field253;

    @ObfuscatedName("j.y")
    public int field254;

    @ObfuscatedName("j.w")
    public int field255;

    @ObfuscatedName("j.m")
    public int field256;

    @ObfuscatedName("j.u")
    public int field251;

    @ObfuscatedName("j.q")
    public boolean field258;

    @ObfuscatedName("j.c")
    public int field259;

    @ObfuscatedName("j.v")
    public boolean field260;

    @ObfuscatedName("j.e")
    public int field261;

    @ObfuscatedName("j.j")
    public int field262;

    @ObfuscatedName("j.d")
    public boolean field243;

    @ObfuscatedName("j.g")
    public int field245;

    @ObfuscatedName("j.ap")
    public int field265;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field244[var1] = "";
        }
        this.field249 = 0;
        this.field246 = 0;
        this.field247 = 0;
        this.field240 = 0;
        this.field258 = false;
        this.field259 = 0;
        this.field260 = false;
        this.field243 = false;
    }

    @ObfuscatedName("j.b(Leg;I)V")
    public final void method228(class154 arg0) {
        arg0.field2085 = 0;
        int var2 = arg0.method2678();
        this.field242 = arg0.method2679();
        this.field257 = arg0.method2679();
        int var3 = -1;
        this.field259 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2678();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2678();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2801();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method3070(var4[var5] - 512).field2977;
                    if (var8 != 0) {
                        this.field259 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2678();
            if (var11 < 0 || var11 >= Statics.field152[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field606 = arg0.method2801();
        if (this.field606 == 65535) {
            this.field606 = -1;
        }
        this.field608 = arg0.method2801();
        if (this.field608 == 65535) {
            this.field608 = -1;
        }
        this.field609 = this.field608;
        this.field628 = arg0.method2801();
        if (this.field628 == 65535) {
            this.field628 = -1;
        }
        this.field625 = arg0.method2801();
        if (this.field625 == 65535) {
            this.field625 = -1;
        }
        this.field612 = arg0.method2801();
        if (this.field612 == 65535) {
            this.field612 = -1;
        }
        this.field613 = arg0.method2801();
        if (this.field613 == 65535) {
            this.field613 = -1;
        }
        this.field614 = arg0.method2801();
        if (this.field614 == 65535) {
            this.field614 = -1;
        }
        this.field264 = arg0.method2686();
        if (Statics.field85 == this) {
            Statics.field1650 = this.field264;
        }
        this.field249 = arg0.method2678();
        this.field246 = arg0.method2801();
        this.field260 = arg0.method2678() == 1;
        if (client.field296 == 0 && client.field371 >= 2) {
            this.field260 = false;
        }
        if (this.field241 == null) {
            this.field241 = new class167();
        }
        this.field241.method3035(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("j.l(I)I")
    public int method247() {
        return this.field241 == null || this.field241.field2164 == -1 ? 1 : class200.method960(this.field241.field2164).field3013;
    }

    @ObfuscatedName("j.i(B)Lcs;")
    public final class83 method226() {
        if (this.field241 == null) {
            return null;
        }
        class202 var1 = this.field605 != -1 && this.field637 == 0 ? class202.method262(this.field605) : null;
        class202 var2 = this.field631 == -1 || this.field258 || this.field631 == this.field606 && var1 != null ? null : class202.method262(this.field631);
        class83 var3 = this.field241.method3048(var1, this.field619, var2, this.field654);
        if (var3 == null) {
            return null;
        }
        var3.method1607();
        this.field610 = var3.field1530;
        if (!this.field258 && this.field639 != -1 && this.field640 != -1) {
            class83 var4 = class191.method2966(this.field639).method3334(this.field640);
            if (var4 != null) {
                var4.method1547(0, -this.field643, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field258 && this.field253 != null) {
            if (client.field293 >= this.field240) {
                this.field253 = null;
            }
            if (client.field293 >= this.field247 && client.field293 < this.field240) {
                class83 var6 = this.field253;
                var6.method1547(this.field250 - this.field658, this.field248 - this.field263, this.field252 - this.field632);
                if (this.field653 == 512) {
                    var6.method1578();
                    var6.method1578();
                    var6.method1578();
                } else if (this.field653 == 1024) {
                    var6.method1578();
                    var6.method1578();
                } else if (this.field653 == 1536) {
                    var6.method1578();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field653 == 512) {
                    var6.method1578();
                } else if (this.field653 == 1024) {
                    var6.method1578();
                    var6.method1578();
                } else if (this.field653 == 1536) {
                    var6.method1578();
                    var6.method1578();
                    var6.method1578();
                }
                var6.method1547(this.field658 - this.field250, this.field263 - this.field248, this.field632 - this.field252);
            }
        }
        var3.field1361 = true;
        return var3;
    }

    @ObfuscatedName("j.t(IIBI)V")
    public final void method254(int arg0, int arg1, byte arg2) {
        if (this.field605 != -1 && class202.method262(this.field605).field3075 == 1) {
            this.field605 = -1;
        }
        this.field611 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method231(arg0, arg1);
        } else if (this.field657[0] >= 0 && this.field657[0] < 104 && this.field641[0] >= 0 && this.field641[0] < 104) {
            if (arg2 == 2) {
                client.method204(this, arg0, arg1, (byte) 2);
            }
            this.method239(arg0, arg1, arg2);
        } else {
            this.method231(arg0, arg1);
        }
    }

    @ObfuscatedName("j.k(III)V")
    public void method231(int arg0, int arg1) {
        this.field656 = 0;
        this.field661 = 0;
        this.field602 = 0;
        this.field657[0] = arg0;
        this.field641[0] = arg1;
        int var3 = this.method247();
        this.field658 = this.field657[0] * 128 + var3 * 64;
        this.field632 = this.field641[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("j.x(IIBI)V")
    public final void method239(int arg0, int arg1, byte arg2) {
        if (this.field656 < 9) {
            this.field656++;
        }
        for (int var4 = this.field656; var4 > 0; var4--) {
            this.field657[var4] = this.field657[var4 - 1];
            this.field641[var4] = this.field641[var4 - 1];
            this.field659[var4] = this.field659[var4 - 1];
        }
        this.field657[0] = arg0;
        this.field641[0] = arg1;
        this.field659[0] = arg2;
    }

    @ObfuscatedName("j.z(I)Z")
    public final boolean method230() {
        return this.field241 != null;
    }
}
