package deob;

@ObfuscatedName("x")
public final class class3 extends class33 {

    @ObfuscatedName("x.p")
    public String field44;

    @ObfuscatedName("x.g")
    public class158 field47;

    @ObfuscatedName("x.x")
    public int field32 = -1;

    @ObfuscatedName("x.c")
    public int field33 = -1;

    @ObfuscatedName("x.n")
    public int field31 = 0;

    @ObfuscatedName("x.s")
    public int field35 = 0;

    @ObfuscatedName("x.r")
    public int field36;

    @ObfuscatedName("x.w")
    public int field37 = 0;

    @ObfuscatedName("x.u")
    public int field30 = 0;

    @ObfuscatedName("x.d")
    public int field39;

    @ObfuscatedName("x.h")
    public int field40;

    @ObfuscatedName("x.a")
    public int field41;

    @ObfuscatedName("x.y")
    public class98 field34;

    @ObfuscatedName("x.v")
    public int field50;

    @ObfuscatedName("x.e")
    public int field53;

    @ObfuscatedName("x.b")
    public int field45;

    @ObfuscatedName("x.z")
    public int field46;

    @ObfuscatedName("x.l")
    public boolean field38 = false;

    @ObfuscatedName("x.t")
    public int field48 = 0;

    @ObfuscatedName("x.q")
    public boolean field43 = false;

    @ObfuscatedName("x.p(Ldp;I)V")
    public final void method22(class107 arg0) {
        arg0.field1837 = 0;
        int var2 = arg0.method2173();
        this.field32 = arg0.method2174();
        this.field33 = arg0.method2174();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2173();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2173();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2175();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method588(var4[var5] - 512).field1049;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2173();
            if (var11 < 0 || var11 >= Statics.field1463[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field734 = arg0.method2175();
        if (this.field734 == 65535) {
            this.field734 = -1;
        }
        this.field735 = arg0.method2175();
        if (this.field735 == 65535) {
            this.field735 = -1;
        }
        this.field736 = this.field735;
        this.field746 = arg0.method2175();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field738 = arg0.method2175();
        if (this.field738 == 65535) {
            this.field738 = -1;
        }
        this.field784 = arg0.method2175();
        if (this.field784 == 65535) {
            this.field784 = -1;
        }
        this.field751 = arg0.method2175();
        if (this.field751 == 65535) {
            this.field751 = -1;
        }
        this.field741 = arg0.method2175();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field44 = arg0.method2351();
        if (Statics.field1248 == this) {
            Statics.field2068 = this.field44;
        }
        this.field31 = arg0.method2173();
        this.field35 = arg0.method2175();
        this.field43 = arg0.method2173() == 1;
        if (client.field418 == 0 && client.field426 >= 2) {
            this.field43 = false;
        }
        if (this.field47 == null) {
            this.field47 = new class158();
        }
        this.field47.method2969(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("x.g(I)Lcn;")
    public final class98 method20() {
        if (this.field47 == null) {
            return null;
        }
        class38 var1 = this.field759 != -1 && this.field762 == 0 ? class38.method507(this.field759) : null;
        class38 var2 = this.field756 == -1 || this.field38 || this.field756 == this.field734 && var1 != null ? null : class38.method507(this.field756);
        class98 var3 = this.field47.method2975(var1, this.field760, var2, this.field731);
        if (var3 == null) {
            return null;
        }
        var3.method2034();
        this.field777 = var3.field1357;
        if (!this.field38 && this.field764 != -1 && this.field765 != -1) {
            class98 var4 = class39.method3391(this.field764).method776(this.field765);
            if (var4 != null) {
                var4.method2044(0, -this.field767, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field38 && this.field34 != null) {
            if (client.field343 >= this.field30) {
                this.field34 = null;
            }
            if (client.field343 >= this.field37 && client.field343 < this.field30) {
                class98 var6 = this.field34;
                var6.method2044(this.field39 - this.field740, this.field40 - this.field36, this.field41 - this.field730);
                if (this.field754 == 512) {
                    var6.method2082();
                    var6.method2082();
                    var6.method2082();
                } else if (this.field754 == 1024) {
                    var6.method2082();
                    var6.method2082();
                } else if (this.field754 == 1536) {
                    var6.method2082();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field754 == 512) {
                    var6.method2082();
                } else if (this.field754 == 1024) {
                    var6.method2082();
                    var6.method2082();
                } else if (this.field754 == 1536) {
                    var6.method2082();
                    var6.method2082();
                    var6.method2082();
                }
                var6.method2044(this.field740 - this.field39, this.field36 - this.field40, this.field730 - this.field41);
            }
        }
        var3.field1719 = true;
        return var3;
    }

    @ObfuscatedName("x.x(B)Z")
    public final boolean method21() {
        return this.field47 != null;
    }
}
