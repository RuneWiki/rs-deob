package deob;

@ObfuscatedName("u")
public final class class3 extends class30 {

    @ObfuscatedName("u.z")
    public String field36;

    @ObfuscatedName("u.n")
    public class153 field29;

    @ObfuscatedName("u.u")
    public int field33 = -1;

    @ObfuscatedName("u.t")
    public int field43 = -1;

    @ObfuscatedName("u.e")
    public int field30 = 0;

    @ObfuscatedName("u.a")
    public int field46 = 0;

    @ObfuscatedName("u.l")
    public int field34;

    @ObfuscatedName("u.v")
    public int field35 = 0;

    @ObfuscatedName("u.j")
    public int field32 = 0;

    @ObfuscatedName("u.k")
    public int field37;

    @ObfuscatedName("u.g")
    public int field40;

    @ObfuscatedName("u.d")
    public int field39;

    @ObfuscatedName("u.b")
    public class95 field31;

    @ObfuscatedName("u.i")
    public int field41;

    @ObfuscatedName("u.o")
    public int field42;

    @ObfuscatedName("u.x")
    public int field28;

    @ObfuscatedName("u.m")
    public int field44;

    @ObfuscatedName("u.f")
    public boolean field45 = false;

    @ObfuscatedName("u.q")
    public int field38 = 0;

    @ObfuscatedName("u.z(Lcj;I)V")
    public final void method18(class104 arg0) {
        arg0.field1815 = 0;
        int var2 = arg0.method2257();
        this.field33 = arg0.method2237();
        this.field43 = arg0.method2237();
        int var3 = -1;
        this.field38 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2257();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2257();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2206();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class42.method2477(var4[var5] - 512).field1024;
                    if (var8 != 0) {
                        this.field38 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2257();
            if (var11 < 0 || var11 >= Statics.field2643[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field711 = arg0.method2206();
        if (this.field711 == 65535) {
            this.field711 = -1;
        }
        this.field704 = arg0.method2206();
        if (this.field704 == 65535) {
            this.field704 = -1;
        }
        this.field710 = this.field704;
        this.field755 = arg0.method2206();
        if (this.field755 == 65535) {
            this.field755 = -1;
        }
        this.field712 = arg0.method2206();
        if (this.field712 == 65535) {
            this.field712 = -1;
        }
        this.field713 = arg0.method2206();
        if (this.field713 == 65535) {
            this.field713 = -1;
        }
        this.field714 = arg0.method2206();
        if (this.field714 == 65535) {
            this.field714 = -1;
        }
        this.field706 = arg0.method2206();
        if (this.field706 == 65535) {
            this.field706 = -1;
        }
        this.field36 = arg0.method2187();
        if (Statics.field180 == this) {
            Statics.field2062 = this.field36;
        }
        this.field30 = arg0.method2257();
        this.field46 = arg0.method2206();
        if (this.field29 == null) {
            this.field29 = new class153();
        }
        this.field29.method2944(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("u.n(I)Lcp;")
    public final class95 method19() {
        if (this.field29 == null) {
            return null;
        }
        class35 var1 = this.field733 != -1 && this.field736 == 0 ? class35.method2065(this.field733) : null;
        class35 var2 = this.field730 == -1 || this.field45 || this.field730 == this.field711 && var1 != null ? null : class35.method2065(this.field730);
        class95 var3 = this.field29.method2949(var1, this.field703, var2, this.field731);
        if (var3 == null) {
            return null;
        }
        var3.method2051();
        this.field751 = var3.field1315;
        if (!this.field45 && this.field738 != -1 && this.field739 != -1) {
            class95 var4 = class36.method2724(this.field738).method752(this.field739);
            if (var4 != null) {
                var4.method2016(0, -this.field742, 0);
                class95[] var5 = new class95[] { var3, var4 };
                var3 = new class95(var5, 2);
            }
        }
        if (!this.field45 && this.field31 != null) {
            if (client.field270 >= this.field32) {
                this.field31 = null;
            }
            if (client.field270 >= this.field35 && client.field270 < this.field32) {
                class95 var6 = this.field31;
                var6.method2016(this.field37 - this.field717, this.field40 - this.field34, this.field39 - this.field747);
                if (this.field752 == 512) {
                    var6.method1998();
                    var6.method1998();
                    var6.method1998();
                } else if (this.field752 == 1024) {
                    var6.method1998();
                    var6.method1998();
                } else if (this.field752 == 1536) {
                    var6.method1998();
                }
                class95[] var7 = new class95[] { var3, var6 };
                var3 = new class95(var7, 2);
                if (this.field752 == 512) {
                    var6.method1998();
                } else if (this.field752 == 1024) {
                    var6.method1998();
                    var6.method1998();
                } else if (this.field752 == 1536) {
                    var6.method1998();
                    var6.method1998();
                    var6.method1998();
                }
                var6.method2016(this.field717 - this.field37, this.field34 - this.field40, this.field747 - this.field39);
            }
        }
        var3.field1692 = true;
        return var3;
    }

    @ObfuscatedName("u.u(I)Z")
    public final boolean method28() {
        return this.field29 != null;
    }
}
