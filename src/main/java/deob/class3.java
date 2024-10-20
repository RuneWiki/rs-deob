package deob;

@ObfuscatedName("a")
public final class class3 extends class35 {

    @ObfuscatedName("a.n")
    public String field60;

    @ObfuscatedName("a.g")
    public class170 field47;

    @ObfuscatedName("a.a")
    public int field42 = -1;

    @ObfuscatedName("a.m")
    public int field43 = -1;

    @ObfuscatedName("a.s")
    public int field44 = 0;

    @ObfuscatedName("a.j")
    public int field45 = 0;

    @ObfuscatedName("a.f")
    public int field46;

    @ObfuscatedName("a.b")
    public int field57 = 0;

    @ObfuscatedName("a.t")
    public int field48 = 0;

    @ObfuscatedName("a.i")
    public int field40;

    @ObfuscatedName("a.c")
    public int field50;

    @ObfuscatedName("a.k")
    public int field56;

    @ObfuscatedName("a.x")
    public class100 field52;

    @ObfuscatedName("a.e")
    public int field53;

    @ObfuscatedName("a.q")
    public int field54;

    @ObfuscatedName("a.o")
    public int field55;

    @ObfuscatedName("a.r")
    public int field41;

    @ObfuscatedName("a.v")
    public boolean field62 = false;

    @ObfuscatedName("a.h")
    public int field58 = 0;

    @ObfuscatedName("a.p")
    public boolean field63 = false;

    @ObfuscatedName("a.n(Ldp;I)V")
    public final void method16(class111 arg0) {
        arg0.field1896 = 0;
        int var2 = arg0.method2211();
        this.field42 = arg0.method2217();
        this.field43 = arg0.method2217();
        int var3 = -1;
        this.field58 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2211();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2211();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2395();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method2845(var4[var5] - 512).field1115;
                    if (var8 != 0) {
                        this.field58 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2211();
            if (var11 < 0 || var11 >= Statics.field64[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field784 = arg0.method2395();
        if (this.field784 == 65535) {
            this.field784 = -1;
        }
        this.field779 = arg0.method2395();
        if (this.field779 == 65535) {
            this.field779 = -1;
        }
        this.field786 = this.field779;
        this.field787 = arg0.method2395();
        if (this.field787 == 65535) {
            this.field787 = -1;
        }
        this.field796 = arg0.method2395();
        if (this.field796 == 65535) {
            this.field796 = -1;
        }
        this.field785 = arg0.method2395();
        if (this.field785 == 65535) {
            this.field785 = -1;
        }
        this.field788 = arg0.method2395();
        if (this.field788 == 65535) {
            this.field788 = -1;
        }
        this.field791 = arg0.method2395();
        if (this.field791 == 65535) {
            this.field791 = -1;
        }
        this.field60 = arg0.method2223();
        if (Statics.field1994 == this) {
            Statics.field1951 = this.field60;
        }
        this.field44 = arg0.method2211();
        this.field45 = arg0.method2395();
        this.field63 = arg0.method2211() == 1;
        if (client.field310 == 0 && client.field449 >= 2) {
            this.field63 = false;
        }
        if (this.field47 == null) {
            this.field47 = new class170();
        }
        this.field47.method3149(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.g(S)Lcs;")
    public final class100 method17() {
        if (this.field47 == null) {
            return null;
        }
        class40 var1 = this.field810 != -1 && this.field813 == 0 ? class40.method2146(this.field810) : null;
        class40 var2 = this.field807 == -1 || this.field62 || this.field807 == this.field784 && var1 != null ? null : class40.method2146(this.field807);
        class100 var3 = this.field47.method3143(var1, this.field811, var2, this.field808);
        if (var3 == null) {
            return null;
        }
        var3.method2061();
        this.field781 = var3.field1409;
        if (!this.field62 && this.field815 != -1 && this.field834 != -1) {
            class100 var4 = class41.method24(this.field815).method782(this.field834);
            if (var4 != null) {
                var4.method2112(0, -this.field806, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field62 && this.field52 != null) {
            if (client.field289 >= this.field48) {
                this.field52 = null;
            }
            if (client.field289 >= this.field57 && client.field289 < this.field48) {
                class100 var6 = this.field52;
                var6.method2112(this.field40 - this.field830, this.field50 - this.field46, this.field56 - this.field828);
                if (this.field790 == 512) {
                    var6.method2067();
                    var6.method2067();
                    var6.method2067();
                } else if (this.field790 == 1024) {
                    var6.method2067();
                    var6.method2067();
                } else if (this.field790 == 1536) {
                    var6.method2067();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field790 == 512) {
                    var6.method2067();
                } else if (this.field790 == 1024) {
                    var6.method2067();
                    var6.method2067();
                } else if (this.field790 == 1536) {
                    var6.method2067();
                    var6.method2067();
                    var6.method2067();
                }
                var6.method2112(this.field830 - this.field40, this.field46 - this.field50, this.field828 - this.field56);
            }
        }
        var3.field1765 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method18() {
        return this.field47 != null;
    }
}
