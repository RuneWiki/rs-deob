package deob;

@ObfuscatedName("i")
public final class class3 extends class33 {

    @ObfuscatedName("i.e")
    public String field44;

    @ObfuscatedName("i.v")
    public class157 field41;

    @ObfuscatedName("i.i")
    public int field51 = -1;

    @ObfuscatedName("i.g")
    public int field36 = -1;

    @ObfuscatedName("i.x")
    public int field37 = 0;

    @ObfuscatedName("i.b")
    public int field38 = 0;

    @ObfuscatedName("i.q")
    public int field39;

    @ObfuscatedName("i.l")
    public int field40 = 0;

    @ObfuscatedName("i.m")
    public int field33 = 0;

    @ObfuscatedName("i.u")
    public int field42;

    @ObfuscatedName("i.s")
    public int field43;

    @ObfuscatedName("i.f")
    public int field35;

    @ObfuscatedName("i.p")
    public class98 field45;

    @ObfuscatedName("i.w")
    public int field46;

    @ObfuscatedName("i.y")
    public int field47;

    @ObfuscatedName("i.h")
    public int field48;

    @ObfuscatedName("i.j")
    public int field57;

    @ObfuscatedName("i.c")
    public boolean field50 = false;

    @ObfuscatedName("i.d")
    public int field58 = 0;

    @ObfuscatedName("i.a")
    public boolean field52 = false;

    @ObfuscatedName("i.e(Ldk;I)V")
    public final void method15(class107 arg0) {
        arg0.field1844 = 0;
        int var2 = arg0.method2226();
        this.field51 = arg0.method2292();
        this.field36 = arg0.method2292();
        int var3 = -1;
        this.field58 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2226();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2226();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2152();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method28(var4[var5] - 512).field1037;
                    if (var8 != 0) {
                        this.field58 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2226();
            if (var11 < 0 || var11 >= Statics.field1523[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field750 = arg0.method2152();
        if (this.field750 == 65535) {
            this.field750 = -1;
        }
        this.field725 = arg0.method2152();
        if (this.field725 == 65535) {
            this.field725 = -1;
        }
        this.field726 = this.field725;
        this.field742 = arg0.method2152();
        if (this.field742 == 65535) {
            this.field742 = -1;
        }
        this.field755 = arg0.method2152();
        if (this.field755 == 65535) {
            this.field755 = -1;
        }
        this.field729 = arg0.method2152();
        if (this.field729 == 65535) {
            this.field729 = -1;
        }
        this.field728 = arg0.method2152();
        if (this.field728 == 65535) {
            this.field728 = -1;
        }
        this.field731 = arg0.method2152();
        if (this.field731 == 65535) {
            this.field731 = -1;
        }
        this.field44 = arg0.method2124();
        if (Statics.field183 == this) {
            Statics.field2071 = this.field44;
        }
        this.field37 = arg0.method2226();
        this.field38 = arg0.method2152();
        this.field52 = arg0.method2226() == 1;
        if (client.field265 == 0 && client.field429 >= 2) {
            this.field52 = false;
        }
        if (this.field41 == null) {
            this.field41 = new class157();
        }
        this.field41.method2908(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.v(I)Lcz;")
    public final class98 method17() {
        if (this.field41 == null) {
            return null;
        }
        class38 var1 = this.field749 != -1 && this.field752 == 0 ? class38.method730(this.field749) : null;
        class38 var2 = this.field746 == -1 || this.field50 || this.field750 == this.field746 && var1 != null ? null : class38.method730(this.field746);
        class98 var3 = this.field41.method2905(var1, this.field756, var2, this.field747);
        if (var3 == null) {
            return null;
        }
        var3.method1969();
        this.field767 = var3.field1349;
        if (!this.field50 && this.field754 != -1 && this.field762 != -1) {
            class98 var4 = Statics.method1958(this.field754).method736(this.field762);
            if (var4 != null) {
                var4.method1979(0, -this.field758, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field442 >= this.field33) {
                this.field45 = null;
            }
            if (client.field442 >= this.field40 && client.field442 < this.field33) {
                class98 var6 = this.field45;
                var6.method1979(this.field42 - this.field775, this.field43 - this.field39, this.field35 - this.field720);
                if (this.field721 == 512) {
                    var6.method2017();
                    var6.method2017();
                    var6.method2017();
                } else if (this.field721 == 1024) {
                    var6.method2017();
                    var6.method2017();
                } else if (this.field721 == 1536) {
                    var6.method2017();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field721 == 512) {
                    var6.method2017();
                } else if (this.field721 == 1024) {
                    var6.method2017();
                    var6.method2017();
                } else if (this.field721 == 1536) {
                    var6.method2017();
                    var6.method2017();
                    var6.method2017();
                }
                var6.method1979(this.field775 - this.field42, this.field39 - this.field43, this.field720 - this.field35);
            }
        }
        var3.field1717 = true;
        return var3;
    }

    @ObfuscatedName("i.i(I)Z")
    public final boolean method18() {
        return this.field41 != null;
    }
}
