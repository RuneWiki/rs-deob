package deob;

@ObfuscatedName("z")
public final class class3 extends class36 {

    @ObfuscatedName("z.j")
    public String field53;

    @ObfuscatedName("z.y")
    public class173 field39;

    @ObfuscatedName("z.z")
    public int field40 = -1;

    @ObfuscatedName("z.l")
    public int field41 = -1;

    @ObfuscatedName("z.w")
    public int field42 = 0;

    @ObfuscatedName("z.d")
    public int field48 = 0;

    @ObfuscatedName("z.f")
    public int field44;

    @ObfuscatedName("z.i")
    public int field38 = 0;

    @ObfuscatedName("z.a")
    public int field46 = 0;

    @ObfuscatedName("z.o")
    public int field58;

    @ObfuscatedName("z.u")
    public int field47;

    @ObfuscatedName("z.m")
    public int field49;

    @ObfuscatedName("z.e")
    public class103 field50;

    @ObfuscatedName("z.v")
    public int field43;

    @ObfuscatedName("z.r")
    public int field59;

    @ObfuscatedName("z.t")
    public int field52;

    @ObfuscatedName("z.g")
    public int field54;

    @ObfuscatedName("z.s")
    public boolean field55 = false;

    @ObfuscatedName("z.n")
    public int field56 = 0;

    @ObfuscatedName("z.h")
    public boolean field57 = false;

    @ObfuscatedName("z.j(Lde;I)V")
    public final void method13(class114 arg0) {
        arg0.field1894 = 0;
        int var2 = arg0.method2322();
        this.field40 = arg0.method2323();
        this.field41 = arg0.method2323();
        int var3 = -1;
        this.field56 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2322();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2322();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2324();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class50.method1088(var4[var5] - 512).field1124;
                    if (var8 != 0) {
                        this.field56 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2322();
            if (var11 < 0 || var11 >= Statics.field2845[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field844 = arg0.method2324();
        if (this.field844 == 65535) {
            this.field844 = -1;
        }
        this.field799 = arg0.method2324();
        if (this.field799 == 65535) {
            this.field799 = -1;
        }
        this.field800 = this.field799;
        this.field837 = arg0.method2324();
        if (this.field837 == 65535) {
            this.field837 = -1;
        }
        this.field802 = arg0.method2324();
        if (this.field802 == 65535) {
            this.field802 = -1;
        }
        this.field803 = arg0.method2324();
        if (this.field803 == 65535) {
            this.field803 = -1;
        }
        this.field804 = arg0.method2324();
        if (this.field804 == 65535) {
            this.field804 = -1;
        }
        this.field805 = arg0.method2324();
        if (this.field805 == 65535) {
            this.field805 = -1;
        }
        this.field53 = arg0.method2440();
        if (Statics.field143 == this) {
            Statics.field2129 = this.field53;
        }
        this.field42 = arg0.method2322();
        this.field48 = arg0.method2324();
        this.field57 = arg0.method2322() == 1;
        if (client.field398 == 0 && client.field468 >= 2) {
            this.field57 = false;
        }
        if (this.field39 == null) {
            this.field39 = new class173();
        }
        this.field39.method3192(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("z.y(I)Lcw;")
    public final class103 method14() {
        if (this.field39 == null) {
            return null;
        }
        class41 var1 = this.field824 != -1 && this.field796 == 0 ? class41.method1016(this.field824) : null;
        class41 var2 = this.field798 == -1 || this.field55 || this.field844 == this.field798 && var1 != null ? null : class41.method1016(this.field798);
        class103 var3 = this.field39.method3198(var1, this.field825, var2, this.field819);
        if (var3 == null) {
            return null;
        }
        var3.method2170();
        this.field842 = var3.field1419;
        if (!this.field55 && this.field835 != -1 && this.field830 != -1) {
            class103 var4 = class42.method122(this.field835).method888(this.field830);
            if (var4 != null) {
                var4.method2180(0, -this.field801, 0);
                class103[] var5 = new class103[] { var3, var4 };
                var3 = new class103(var5, 2);
            }
        }
        if (!this.field55 && this.field50 != null) {
            if (client.field477 >= this.field46) {
                this.field50 = null;
            }
            if (client.field477 >= this.field38 && client.field477 < this.field46) {
                class103 var6 = this.field50;
                var6.method2180(this.field58 - this.field814, this.field47 - this.field44, this.field49 - this.field821);
                if (this.field843 == 512) {
                    var6.method2176();
                    var6.method2176();
                    var6.method2176();
                } else if (this.field843 == 1024) {
                    var6.method2176();
                    var6.method2176();
                } else if (this.field843 == 1536) {
                    var6.method2176();
                }
                class103[] var7 = new class103[] { var3, var6 };
                var3 = new class103(var7, 2);
                if (this.field843 == 512) {
                    var6.method2176();
                } else if (this.field843 == 1024) {
                    var6.method2176();
                    var6.method2176();
                } else if (this.field843 == 1536) {
                    var6.method2176();
                    var6.method2176();
                    var6.method2176();
                }
                var6.method2180(this.field814 - this.field58, this.field44 - this.field47, this.field821 - this.field49);
            }
        }
        var3.field1751 = true;
        return var3;
    }

    @ObfuscatedName("z.z(I)Z")
    public final boolean method17() {
        return this.field39 != null;
    }
}
