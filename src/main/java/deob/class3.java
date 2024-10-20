package deob;

@ObfuscatedName("y")
public final class class3 extends class33 {

    @ObfuscatedName("y.k")
    public String field43;

    @ObfuscatedName("y.r")
    public class157 field29;

    @ObfuscatedName("y.y")
    public int field28 = -1;

    @ObfuscatedName("y.w")
    public int field31 = -1;

    @ObfuscatedName("y.m")
    public int field32 = 0;

    @ObfuscatedName("y.j")
    public int field33 = 0;

    @ObfuscatedName("y.g")
    public int field39;

    @ObfuscatedName("y.p")
    public int field35 = 0;

    @ObfuscatedName("y.o")
    public int field34 = 0;

    @ObfuscatedName("y.b")
    public int field37;

    @ObfuscatedName("y.x")
    public int field52;

    @ObfuscatedName("y.n")
    public int field36;

    @ObfuscatedName("y.d")
    public class98 field40;

    @ObfuscatedName("y.s")
    public int field41;

    @ObfuscatedName("y.v")
    public int field42;

    @ObfuscatedName("y.t")
    public int field47;

    @ObfuscatedName("y.u")
    public int field44;

    @ObfuscatedName("y.l")
    public boolean field46 = false;

    @ObfuscatedName("y.i")
    public int field38 = 0;

    @ObfuscatedName("y.h")
    public boolean field30 = false;

    @ObfuscatedName("y.k(Lde;I)V")
    public final void method13(class107 arg0) {
        arg0.field1863 = 0;
        int var2 = arg0.method2111();
        this.field28 = arg0.method2112();
        this.field31 = arg0.method2112();
        int var3 = -1;
        this.field38 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2111();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2111();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2232();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method1864(var4[var5] - 512).field1024;
                    if (var8 != 0) {
                        this.field38 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2111();
            if (var11 < 0 || var11 >= Statics.field2681[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field745 = arg0.method2232();
        if (this.field745 == 65535) {
            this.field745 = -1;
        }
        this.field768 = arg0.method2232();
        if (this.field768 == 65535) {
            this.field768 = -1;
        }
        this.field737 = this.field768;
        this.field738 = arg0.method2232();
        if (this.field738 == 65535) {
            this.field738 = -1;
        }
        this.field739 = arg0.method2232();
        if (this.field739 == 65535) {
            this.field739 = -1;
        }
        this.field740 = arg0.method2232();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field741 = arg0.method2232();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field736 = arg0.method2232();
        if (this.field736 == 65535) {
            this.field736 = -1;
        }
        this.field43 = arg0.method2119();
        if (Statics.field555 == this) {
            Statics.field2073 = this.field43;
        }
        this.field32 = arg0.method2111();
        this.field33 = arg0.method2232();
        this.field30 = arg0.method2111() == 1;
        if (client.field255 == 0 && client.field423 >= 2) {
            this.field30 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class157();
        }
        this.field29.method2918(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.r(I)Lcp;")
    public final class98 method24() {
        if (this.field29 == null) {
            return null;
        }
        class38 var1 = this.field760 != -1 && this.field763 == 0 ? class38.method102(this.field760) : null;
        class38 var2 = this.field757 == -1 || this.field46 || this.field757 == this.field745 && var1 != null ? null : class38.method102(this.field757);
        class98 var3 = this.field29.method2899(var1, this.field761, var2, this.field769);
        if (var3 == null) {
            return null;
        }
        var3.method1998();
        this.field778 = var3.field1354;
        if (!this.field46 && this.field765 != -1 && this.field766 != -1) {
            class98 var4 = class39.method1416(this.field765).method746(this.field766);
            if (var4 != null) {
                var4.method1990(0, -this.field774, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field46 && this.field40 != null) {
            if (client.field261 >= this.field34) {
                this.field40 = null;
            }
            if (client.field261 >= this.field35 && client.field261 < this.field34) {
                class98 var6 = this.field40;
                var6.method1990(this.field37 - this.field730, this.field52 - this.field39, this.field36 - this.field780);
                if (this.field779 == 512) {
                    var6.method2004();
                    var6.method2004();
                    var6.method2004();
                } else if (this.field779 == 1024) {
                    var6.method2004();
                    var6.method2004();
                } else if (this.field779 == 1536) {
                    var6.method2004();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field779 == 512) {
                    var6.method2004();
                } else if (this.field779 == 1024) {
                    var6.method2004();
                    var6.method2004();
                } else if (this.field779 == 1536) {
                    var6.method2004();
                    var6.method2004();
                    var6.method2004();
                }
                var6.method1990(this.field730 - this.field37, this.field39 - this.field52, this.field780 - this.field36);
            }
        }
        var3.field1734 = true;
        return var3;
    }

    @ObfuscatedName("y.y(I)Z")
    public final boolean method12() {
        return this.field29 != null;
    }
}
