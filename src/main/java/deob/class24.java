package deob;

@ObfuscatedName("d")
public final class class24 extends class28 {

    @ObfuscatedName("d.x")
    public String field244;

    @ObfuscatedName("d.n")
    public class167 field242;

    @ObfuscatedName("d.g")
    public int field258 = -1;

    @ObfuscatedName("d.v")
    public int field255 = -1;

    @ObfuscatedName("d.p")
    public String[] field265 = new String[3];

    @ObfuscatedName("d.j")
    public int field246;

    @ObfuscatedName("d.m")
    public int field241;

    @ObfuscatedName("d.a")
    public int field248;

    @ObfuscatedName("d.i")
    public int field249;

    @ObfuscatedName("d.s")
    public int field250;

    @ObfuscatedName("d.k")
    public int field247;

    @ObfuscatedName("d.f")
    public int field269;

    @ObfuscatedName("d.o")
    public int field253;

    @ObfuscatedName("d.q")
    public class83 field254;

    @ObfuscatedName("d.c")
    public int field252;

    @ObfuscatedName("d.b")
    public int field256;

    @ObfuscatedName("d.w")
    public int field257;

    @ObfuscatedName("d.l")
    public int field263;

    @ObfuscatedName("d.r")
    public boolean field259;

    @ObfuscatedName("d.u")
    public int field260;

    @ObfuscatedName("d.e")
    public boolean field261;

    @ObfuscatedName("d.h")
    public int field262;

    @ObfuscatedName("d.d")
    public int field251;

    @ObfuscatedName("d.z")
    public boolean field243;

    @ObfuscatedName("d.t")
    public int field266;

    @ObfuscatedName("d.ab")
    public int field245;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field265[var1] = "";
        }
        this.field246 = 0;
        this.field241 = 0;
        this.field249 = 0;
        this.field250 = 0;
        this.field259 = false;
        this.field260 = 0;
        this.field261 = false;
        this.field243 = false;
    }

    @ObfuscatedName("d.x(Leq;I)V")
    public final void method229(class154 arg0) {
        arg0.field2087 = 0;
        int var2 = arg0.method2878();
        this.field258 = arg0.method2788();
        this.field255 = arg0.method2788();
        int var3 = -1;
        this.field260 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2878();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2878();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2833();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method973(var4[var5] - 512).field2951;
                    if (var8 != 0) {
                        this.field260 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2878();
            if (var11 < 0 || var11 >= Statics.field2160[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field609 = arg0.method2833();
        if (this.field609 == 65535) {
            this.field609 = -1;
        }
        this.field611 = arg0.method2833();
        if (this.field611 == 65535) {
            this.field611 = -1;
        }
        this.field622 = this.field611;
        this.field633 = arg0.method2833();
        if (this.field633 == 65535) {
            this.field633 = -1;
        }
        this.field613 = arg0.method2833();
        if (this.field613 == 65535) {
            this.field613 = -1;
        }
        this.field604 = arg0.method2833();
        if (this.field604 == 65535) {
            this.field604 = -1;
        }
        this.field615 = arg0.method2833();
        if (this.field615 == 65535) {
            this.field615 = -1;
        }
        this.field616 = arg0.method2833();
        if (this.field616 == 65535) {
            this.field616 = -1;
        }
        this.field244 = arg0.method2709();
        if (Statics.field186 == this) {
            Statics.field1659 = this.field244;
        }
        this.field246 = arg0.method2878();
        this.field241 = arg0.method2833();
        this.field261 = arg0.method2878() == 1;
        if (client.field310 == 0 && client.field426 >= 2) {
            this.field261 = false;
        }
        if (this.field242 == null) {
            this.field242 = new class167();
        }
        this.field242.method3074(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("d.n(I)I")
    public int method233() {
        return this.field242 == null || this.field242.field2172 == -1 ? 1 : class200.method2965(this.field242.field2172).field3041;
    }

    @ObfuscatedName("d.g(B)Lcj;")
    public final class83 method240() {
        if (this.field242 == null) {
            return null;
        }
        class202 var1 = this.field641 != -1 && this.field639 == 0 ? Statics.method1464(this.field641) : null;
        class202 var2 = this.field650 == -1 || this.field259 || this.field650 == this.field609 && var1 != null ? null : Statics.method1464(this.field650);
        class83 var3 = this.field242.method3046(var1, this.field637, var2, this.field634);
        if (var3 == null) {
            return null;
        }
        var3.method1571();
        this.field654 = var3.field1551;
        if (!this.field259 && this.field653 != -1 && this.field649 != -1) {
            class83 var4 = class191.method2936(this.field653).method3326(this.field649);
            if (var4 != null) {
                var4.method1616(0, -this.field617, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field259 && this.field254 != null) {
            if (client.field432 >= this.field250) {
                this.field254 = null;
            }
            if (client.field432 >= this.field249 && client.field432 < this.field250) {
                class83 var6 = this.field254;
                var6.method1616(this.field247 - this.field636, this.field269 - this.field248, this.field253 - this.field605);
                if (this.field655 == 512) {
                    var6.method1640();
                    var6.method1640();
                    var6.method1640();
                } else if (this.field655 == 1024) {
                    var6.method1640();
                    var6.method1640();
                } else if (this.field655 == 1536) {
                    var6.method1640();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field655 == 512) {
                    var6.method1640();
                } else if (this.field655 == 1024) {
                    var6.method1640();
                    var6.method1640();
                } else if (this.field655 == 1536) {
                    var6.method1640();
                    var6.method1640();
                    var6.method1640();
                }
                var6.method1616(this.field636 - this.field247, this.field248 - this.field269, this.field605 - this.field253);
            }
        }
        var3.field1389 = true;
        return var3;
    }

    @ObfuscatedName("d.v(IIBI)V")
    public final void method232(int arg0, int arg1, byte arg2) {
        if (this.field641 != -1 && Statics.method1464(this.field641).field3075 == 1) {
            this.field641 = -1;
        }
        this.field632 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method234(arg0, arg1);
        } else if (this.field659[0] >= 0 && this.field659[0] < 104 && this.field660[0] >= 0 && this.field660[0] < 104) {
            if (arg2 == 2) {
                client.method1547(this, arg0, arg1, (byte) 2);
            }
            this.method246(arg0, arg1, arg2);
        } else {
            this.method234(arg0, arg1);
        }
    }

    @ObfuscatedName("d.y(III)V")
    public void method234(int arg0, int arg1) {
        this.field658 = 0;
        this.field663 = 0;
        this.field662 = 0;
        this.field659[0] = arg0;
        this.field660[0] = arg1;
        int var3 = this.method233();
        this.field636 = this.field659[0] * 128 + var3 * 64;
        this.field605 = this.field660[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("d.p(IIBI)V")
    public final void method246(int arg0, int arg1, byte arg2) {
        if (this.field658 < 9) {
            this.field658++;
        }
        for (int var4 = this.field658; var4 > 0; var4--) {
            this.field659[var4] = this.field659[var4 - 1];
            this.field660[var4] = this.field660[var4 - 1];
            this.field610[var4] = this.field610[var4 - 1];
        }
        this.field659[0] = arg0;
        this.field660[0] = arg1;
        this.field610[0] = arg2;
    }

    @ObfuscatedName("d.j(I)Z")
    public final boolean method250() {
        return this.field242 != null;
    }
}
