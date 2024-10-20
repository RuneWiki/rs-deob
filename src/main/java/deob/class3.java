package deob;

@ObfuscatedName("f")
public final class class3 extends class33 {

    @ObfuscatedName("f.t")
    public String field50;

    @ObfuscatedName("f.s")
    public class157 field34;

    @ObfuscatedName("f.f")
    public int field35 = -1;

    @ObfuscatedName("f.e")
    public int field36 = -1;

    @ObfuscatedName("f.d")
    public int field42 = 0;

    @ObfuscatedName("f.n")
    public int field37 = 0;

    @ObfuscatedName("f.v")
    public int field54;

    @ObfuscatedName("f.z")
    public int field40 = 0;

    @ObfuscatedName("f.j")
    public int field41 = 0;

    @ObfuscatedName("f.u")
    public int field39;

    @ObfuscatedName("f.g")
    public int field43;

    @ObfuscatedName("f.a")
    public int field44;

    @ObfuscatedName("f.c")
    public class98 field45;

    @ObfuscatedName("f.w")
    public int field46;

    @ObfuscatedName("f.l")
    public int field33;

    @ObfuscatedName("f.q")
    public int field48;

    @ObfuscatedName("f.x")
    public int field47;

    @ObfuscatedName("f.p")
    public boolean field38 = false;

    @ObfuscatedName("f.y")
    public int field51 = 0;

    @ObfuscatedName("f.r")
    public boolean field52 = false;

    @ObfuscatedName("f.t(Ldb;S)V")
    public final void method16(class107 arg0) {
        arg0.field1830 = 0;
        int var2 = arg0.method2101();
        this.field35 = arg0.method2102();
        this.field36 = arg0.method2102();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2101();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2101();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2103();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method504(var4[var5] - 512).field1034;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2101();
            if (var11 < 0 || var11 >= Statics.field2477[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field719 = arg0.method2103();
        if (this.field719 == 65535) {
            this.field719 = -1;
        }
        this.field720 = arg0.method2103();
        if (this.field720 == 65535) {
            this.field720 = -1;
        }
        this.field754 = this.field720;
        this.field722 = arg0.method2103();
        if (this.field722 == 65535) {
            this.field722 = -1;
        }
        this.field723 = arg0.method2103();
        if (this.field723 == 65535) {
            this.field723 = -1;
        }
        this.field753 = arg0.method2103();
        if (this.field753 == 65535) {
            this.field753 = -1;
        }
        this.field725 = arg0.method2103();
        if (this.field725 == 65535) {
            this.field725 = -1;
        }
        this.field726 = arg0.method2103();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field50 = arg0.method2109();
        if (Statics.field1452 == this) {
            Statics.field2070 = this.field50;
        }
        this.field42 = arg0.method2101();
        this.field37 = arg0.method2103();
        this.field52 = arg0.method2101() == 1;
        if (client.field244 == 0 && client.field432 >= 2) {
            this.field52 = false;
        }
        if (this.field34 == null) {
            this.field34 = new class157();
        }
        this.field34.method2927(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.s(I)Lcc;")
    public final class98 method17() {
        if (this.field34 == null) {
            return null;
        }
        class38 var1 = this.field767 != -1 && this.field762 == 0 ? Statics.method448(this.field767) : null;
        class38 var2 = this.field742 == -1 || this.field38 || this.field742 == this.field719 && var1 != null ? null : Statics.method448(this.field742);
        class98 var3 = this.field34.method2933(var1, this.field745, var2, this.field724);
        if (var3 == null) {
            return null;
        }
        var3.method1949();
        this.field721 = var3.field1341;
        if (!this.field38 && this.field749 != -1 && this.field750 != -1) {
            class98 var4 = class39.method123(this.field749).method717(this.field750);
            if (var4 != null) {
                var4.method1956(0, -this.field737, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field38 && this.field45 != null) {
            if (client.field250 >= this.field41) {
                this.field45 = null;
            }
            if (client.field250 >= this.field40 && client.field250 < this.field41) {
                class98 var6 = this.field45;
                var6.method1956(this.field39 - this.field772, this.field43 - this.field54, this.field44 - this.field715);
                if (this.field763 == 512) {
                    var6.method1967();
                    var6.method1967();
                    var6.method1967();
                } else if (this.field763 == 1024) {
                    var6.method1967();
                    var6.method1967();
                } else if (this.field763 == 1536) {
                    var6.method1967();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field763 == 512) {
                    var6.method1967();
                } else if (this.field763 == 1024) {
                    var6.method1967();
                    var6.method1967();
                } else if (this.field763 == 1536) {
                    var6.method1967();
                    var6.method1967();
                    var6.method1967();
                }
                var6.method1956(this.field772 - this.field39, this.field54 - this.field43, this.field715 - this.field44);
            }
        }
        var3.field1710 = true;
        return var3;
    }

    @ObfuscatedName("f.f(I)Z")
    public final boolean method18() {
        return this.field34 != null;
    }
}
