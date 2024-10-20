package deob;

@ObfuscatedName("z")
public final class class3 extends class35 {

    @ObfuscatedName("z.n")
    public String field32;

    @ObfuscatedName("z.d")
    public class170 field30;

    @ObfuscatedName("z.z")
    public int field31 = -1;

    @ObfuscatedName("z.y")
    public int field43 = -1;

    @ObfuscatedName("z.e")
    public int field33 = 0;

    @ObfuscatedName("z.g")
    public int field34 = 0;

    @ObfuscatedName("z.f")
    public int field35;

    @ObfuscatedName("z.m")
    public int field36 = 0;

    @ObfuscatedName("z.a")
    public int field49 = 0;

    @ObfuscatedName("z.h")
    public int field38;

    @ObfuscatedName("z.l")
    public int field47;

    @ObfuscatedName("z.u")
    public int field40;

    @ObfuscatedName("z.q")
    public class100 field41;

    @ObfuscatedName("z.k")
    public int field48;

    @ObfuscatedName("z.x")
    public int field39;

    @ObfuscatedName("z.r")
    public int field37;

    @ObfuscatedName("z.j")
    public int field45;

    @ObfuscatedName("z.s")
    public boolean field42 = false;

    @ObfuscatedName("z.v")
    public int field46 = 0;

    @ObfuscatedName("z.c")
    public boolean field29 = false;

    @ObfuscatedName("z.n(Ldl;I)V")
    public final void method17(class111 arg0) {
        arg0.field1889 = 0;
        int var2 = arg0.method2228();
        this.field31 = arg0.method2409();
        this.field43 = arg0.method2409();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2228();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2228();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2231();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method3569(var4[var5] - 512).field1087;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2228();
            if (var11 < 0 || var11 >= Statics.field2815[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field753 = arg0.method2231();
        if (this.field753 == 65535) {
            this.field753 = -1;
        }
        this.field754 = arg0.method2231();
        if (this.field754 == 65535) {
            this.field754 = -1;
        }
        this.field755 = this.field754;
        this.field756 = arg0.method2231();
        if (this.field756 == 65535) {
            this.field756 = -1;
        }
        this.field757 = arg0.method2231();
        if (this.field757 == 65535) {
            this.field757 = -1;
        }
        this.field774 = arg0.method2231();
        if (this.field774 == 65535) {
            this.field774 = -1;
        }
        this.field792 = arg0.method2231();
        if (this.field792 == 65535) {
            this.field792 = -1;
        }
        this.field775 = arg0.method2231();
        if (this.field775 == 65535) {
            this.field775 = -1;
        }
        this.field32 = arg0.method2290();
        if (Statics.field1710 == this) {
            Statics.field2126 = this.field32;
        }
        this.field33 = arg0.method2228();
        this.field34 = arg0.method2231();
        this.field29 = arg0.method2228() == 1;
        if (client.field242 == 0 && client.field408 >= 2) {
            this.field29 = false;
        }
        if (this.field30 == null) {
            this.field30 = new class170();
        }
        this.field30.method3187(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("z.d(B)Lcg;")
    public final class100 method25() {
        if (this.field30 == null) {
            return null;
        }
        class40 var1 = this.field779 != -1 && this.field785 == 0 ? class40.method3092(this.field779) : null;
        class40 var2 = this.field759 == -1 || this.field42 || this.field759 == this.field753 && var1 != null ? null : class40.method3092(this.field759);
        class100 var3 = this.field30.method3215(var1, this.field780, var2, this.field777);
        if (var3 == null) {
            return null;
        }
        var3.method2072();
        this.field748 = var3.field1388;
        if (!this.field42 && this.field784 != -1 && this.field772 != -1) {
            class100 var4 = class41.method116(this.field784).method808(this.field772);
            if (var4 != null) {
                var4.method2069(0, -this.field788, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field42 && this.field41 != null) {
            if (client.field249 >= this.field49) {
                this.field41 = null;
            }
            if (client.field249 >= this.field36 && client.field249 < this.field49) {
                class100 var6 = this.field41;
                var6.method2069(this.field38 - this.field809, this.field47 - this.field35, this.field40 - this.field749);
                if (this.field776 == 512) {
                    var6.method2078();
                    var6.method2078();
                    var6.method2078();
                } else if (this.field776 == 1024) {
                    var6.method2078();
                    var6.method2078();
                } else if (this.field776 == 1536) {
                    var6.method2078();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field776 == 512) {
                    var6.method2078();
                } else if (this.field776 == 1024) {
                    var6.method2078();
                    var6.method2078();
                } else if (this.field776 == 1536) {
                    var6.method2078();
                    var6.method2078();
                    var6.method2078();
                }
                var6.method2069(this.field809 - this.field38, this.field35 - this.field47, this.field749 - this.field40);
            }
        }
        var3.field1764 = true;
        return var3;
    }

    @ObfuscatedName("z.z(I)Z")
    public final boolean method19() {
        return this.field30 != null;
    }
}
