package deob;

@ObfuscatedName("h")
public final class class3 extends class33 {

    @ObfuscatedName("h.i")
    public String field42;

    @ObfuscatedName("h.c")
    public class157 field47;

    @ObfuscatedName("h.h")
    public int field39 = -1;

    @ObfuscatedName("h.v")
    public int field52 = -1;

    @ObfuscatedName("h.q")
    public int field58 = 0;

    @ObfuscatedName("h.s")
    public int field43 = 0;

    @ObfuscatedName("h.g")
    public int field44;

    @ObfuscatedName("h.u")
    public int field45 = 0;

    @ObfuscatedName("h.d")
    public int field46 = 0;

    @ObfuscatedName("h.y")
    public int field38;

    @ObfuscatedName("h.e")
    public int field48;

    @ObfuscatedName("h.l")
    public int field53;

    @ObfuscatedName("h.o")
    public class98 field41;

    @ObfuscatedName("h.w")
    public int field51;

    @ObfuscatedName("h.t")
    public int field50;

    @ObfuscatedName("h.z")
    public int field40;

    @ObfuscatedName("h.b")
    public int field54;

    @ObfuscatedName("h.a")
    public boolean field55 = false;

    @ObfuscatedName("h.r")
    public int field56 = 0;

    @ObfuscatedName("h.m")
    public boolean field57 = false;

    @ObfuscatedName("h.i(Ldm;I)V")
    public final void method15(class107 arg0) {
        arg0.field1837 = 0;
        int var2 = arg0.method2151();
        this.field39 = arg0.method2152();
        this.field52 = arg0.method2152();
        int var3 = -1;
        this.field56 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2151();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2151();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2313();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method2547(var4[var5] - 512).field1039;
                    if (var8 != 0) {
                        this.field56 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2151();
            if (var11 < 0 || var11 >= Statics.field1665[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field762 = arg0.method2313();
        if (this.field762 == 65535) {
            this.field762 = -1;
        }
        this.field786 = arg0.method2313();
        if (this.field786 == 65535) {
            this.field786 = -1;
        }
        this.field774 = this.field786;
        this.field747 = arg0.method2313();
        if (this.field747 == 65535) {
            this.field747 = -1;
        }
        this.field746 = arg0.method2313();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field790 = arg0.method2313();
        if (this.field790 == 65535) {
            this.field790 = -1;
        }
        this.field748 = arg0.method2313();
        if (this.field748 == 65535) {
            this.field748 = -1;
        }
        this.field749 = arg0.method2313();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field42 = arg0.method2159();
        if (Statics.field1667 == this) {
            Statics.field2067 = this.field42;
        }
        this.field58 = arg0.method2151();
        this.field43 = arg0.method2313();
        this.field57 = arg0.method2151() == 1;
        if (client.field260 == 0 && client.field428 >= 2) {
            this.field57 = false;
        }
        if (this.field47 == null) {
            this.field47 = new class157();
        }
        this.field47.method2947(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("h.c(B)Lcc;")
    public final class98 method16() {
        if (this.field47 == null) {
            return null;
        }
        class38 var1 = this.field742 != -1 && this.field767 == 0 ? class38.method3551(this.field742) : null;
        class38 var2 = this.field764 == -1 || this.field55 || this.field764 == this.field762 && var1 != null ? null : class38.method3551(this.field764);
        class98 var3 = this.field47.method2952(var1, this.field768, var2, this.field765);
        if (var3 == null) {
            return null;
        }
        var3.method2006();
        this.field785 = var3.field1358;
        if (!this.field55 && this.field772 != -1 && this.field740 != -1) {
            class98 var4 = class39.method3346(this.field772).method752(this.field740);
            if (var4 != null) {
                var4.method2016(0, -this.field776, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field55 && this.field41 != null) {
            if (client.field269 >= this.field46) {
                this.field41 = null;
            }
            if (client.field269 >= this.field45 && client.field269 < this.field46) {
                class98 var6 = this.field41;
                var6.method2016(this.field38 - this.field744, this.field48 - this.field44, this.field53 - this.field738);
                if (this.field760 == 512) {
                    var6.method2050();
                    var6.method2050();
                    var6.method2050();
                } else if (this.field760 == 1024) {
                    var6.method2050();
                    var6.method2050();
                } else if (this.field760 == 1536) {
                    var6.method2050();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field760 == 512) {
                    var6.method2050();
                } else if (this.field760 == 1024) {
                    var6.method2050();
                    var6.method2050();
                } else if (this.field760 == 1536) {
                    var6.method2050();
                    var6.method2050();
                    var6.method2050();
                }
                var6.method2016(this.field744 - this.field38, this.field44 - this.field48, this.field738 - this.field53);
            }
        }
        var3.field1701 = true;
        return var3;
    }

    @ObfuscatedName("h.h(S)Z")
    public final boolean method23() {
        return this.field47 != null;
    }
}
