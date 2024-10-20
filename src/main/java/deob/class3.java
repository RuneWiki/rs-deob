package deob;

@ObfuscatedName("z")
public final class class3 extends class33 {

    @ObfuscatedName("z.g")
    public String field45;

    @ObfuscatedName("z.v")
    public class157 field40;

    @ObfuscatedName("z.z")
    public int field32 = -1;

    @ObfuscatedName("z.h")
    public int field35 = -1;

    @ObfuscatedName("z.k")
    public int field50 = 0;

    @ObfuscatedName("z.l")
    public int field37 = 0;

    @ObfuscatedName("z.e")
    public int field38;

    @ObfuscatedName("z.j")
    public int field34 = 0;

    @ObfuscatedName("z.n")
    public int field39 = 0;

    @ObfuscatedName("z.f")
    public int field41;

    @ObfuscatedName("z.a")
    public int field42;

    @ObfuscatedName("z.i")
    public int field43;

    @ObfuscatedName("z.y")
    public class98 field44;

    @ObfuscatedName("z.p")
    public int field47;

    @ObfuscatedName("z.q")
    public int field46;

    @ObfuscatedName("z.t")
    public int field33;

    @ObfuscatedName("z.r")
    public int field48;

    @ObfuscatedName("z.x")
    public boolean field49 = false;

    @ObfuscatedName("z.s")
    public int field36 = 0;

    @ObfuscatedName("z.d")
    public boolean field51 = false;

    @ObfuscatedName("z.g(Ldm;B)V")
    public final void method14(class107 arg0) {
        arg0.field1839 = 0;
        int var2 = arg0.method2139();
        this.field32 = arg0.method2140();
        this.field35 = arg0.method2140();
        int var3 = -1;
        this.field36 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2139();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2139();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2141();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method744(var4[var5] - 512).field1050;
                    if (var8 != 0) {
                        this.field36 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2139();
            if (var11 < 0 || var11 >= Statics.field2678[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field726 = arg0.method2141();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field727 = arg0.method2141();
        if (this.field727 == 65535) {
            this.field727 = -1;
        }
        this.field753 = this.field727;
        this.field740 = arg0.method2141();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field730 = arg0.method2141();
        if (this.field730 == 65535) {
            this.field730 = -1;
        }
        this.field759 = arg0.method2141();
        if (this.field759 == 65535) {
            this.field759 = -1;
        }
        this.field761 = arg0.method2141();
        if (this.field761 == 65535) {
            this.field761 = -1;
        }
        this.field733 = arg0.method2141();
        if (this.field733 == 65535) {
            this.field733 = -1;
        }
        this.field45 = arg0.method2147();
        if (Statics.field61 == this) {
            Statics.field2088 = this.field45;
        }
        this.field50 = arg0.method2139();
        this.field37 = arg0.method2141();
        this.field51 = arg0.method2139() == 1;
        if (client.field252 == 0 && client.field416 >= 2) {
            this.field51 = false;
        }
        if (this.field40 == null) {
            this.field40 = new class157();
        }
        this.field40.method2935(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("z.v(B)Lce;")
    public final class98 method25() {
        if (this.field40 == null) {
            return null;
        }
        class38 var1 = this.field751 != -1 && this.field754 == 0 ? class38.method1996(this.field751) : null;
        class38 var2 = this.field748 == -1 || this.field49 || this.field748 == this.field726 && var1 != null ? null : class38.method1996(this.field748);
        class98 var3 = this.field40.method2916(var1, this.field724, var2, this.field749);
        if (var3 == null) {
            return null;
        }
        var3.method2003();
        this.field769 = var3.field1351;
        if (!this.field49 && this.field756 != -1 && this.field757 != -1) {
            class98 var4 = class39.method563(this.field756).method751(this.field757);
            if (var4 != null) {
                var4.method2013(0, -this.field771, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field49 && this.field44 != null) {
            if (client.field259 >= this.field39) {
                this.field44 = null;
            }
            if (client.field259 >= this.field34 && client.field259 < this.field39) {
                class98 var6 = this.field44;
                var6.method2013(this.field41 - this.field777, this.field42 - this.field38, this.field43 - this.field722);
                if (this.field737 == 512) {
                    var6.method2052();
                    var6.method2052();
                    var6.method2052();
                } else if (this.field737 == 1024) {
                    var6.method2052();
                    var6.method2052();
                } else if (this.field737 == 1536) {
                    var6.method2052();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field737 == 512) {
                    var6.method2052();
                } else if (this.field737 == 1024) {
                    var6.method2052();
                    var6.method2052();
                } else if (this.field737 == 1536) {
                    var6.method2052();
                    var6.method2052();
                    var6.method2052();
                }
                var6.method2013(this.field777 - this.field41, this.field38 - this.field42, this.field722 - this.field43);
            }
        }
        var3.field1716 = true;
        return var3;
    }

    @ObfuscatedName("z.z(I)Z")
    public final boolean method15() {
        return this.field40 != null;
    }
}
