package deob;

@ObfuscatedName("z")
public final class class3 extends class34 {

    @ObfuscatedName("z.g")
    public String field39;

    @ObfuscatedName("z.j")
    public class160 field33;

    @ObfuscatedName("z.z")
    public int field43 = -1;

    @ObfuscatedName("z.b")
    public int field36 = -1;

    @ObfuscatedName("z.k")
    public int field45 = 0;

    @ObfuscatedName("z.c")
    public int field37 = 0;

    @ObfuscatedName("z.w")
    public int field38;

    @ObfuscatedName("z.l")
    public int field34 = 0;

    @ObfuscatedName("z.n")
    public int field35 = 0;

    @ObfuscatedName("z.d")
    public int field41;

    @ObfuscatedName("z.h")
    public int field42;

    @ObfuscatedName("z.y")
    public int field50;

    @ObfuscatedName("z.p")
    public class99 field44;

    @ObfuscatedName("z.i")
    public int field40;

    @ObfuscatedName("z.s")
    public int field46;

    @ObfuscatedName("z.f")
    public int field47;

    @ObfuscatedName("z.u")
    public int field48;

    @ObfuscatedName("z.v")
    public boolean field49 = false;

    @ObfuscatedName("z.r")
    public int field32 = 0;

    @ObfuscatedName("z.q")
    public boolean field51 = false;

    @ObfuscatedName("z.g(Ldf;I)V")
    public final void method13(class108 arg0) {
        arg0.field1824 = 0;
        int var2 = arg0.method2083();
        this.field43 = arg0.method2173();
        this.field36 = arg0.method2173();
        int var3 = -1;
        this.field32 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2083();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2083();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2263();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method86(var4[var5] - 512).field1059;
                    if (var8 != 0) {
                        this.field32 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2083();
            if (var11 < 0 || var11 >= Statics.field1450[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field740 = arg0.method2263();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field760 = arg0.method2263();
        if (this.field760 == 65535) {
            this.field760 = -1;
        }
        this.field742 = this.field760;
        this.field774 = arg0.method2263();
        if (this.field774 == 65535) {
            this.field774 = -1;
        }
        this.field764 = arg0.method2263();
        if (this.field764 == 65535) {
            this.field764 = -1;
        }
        this.field768 = arg0.method2263();
        if (this.field768 == 65535) {
            this.field768 = -1;
        }
        this.field746 = arg0.method2263();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field738 = arg0.method2263();
        if (this.field738 == 65535) {
            this.field738 = -1;
        }
        this.field39 = arg0.method2091();
        if (Statics.field2031 == this) {
            Statics.field2062 = this.field39;
        }
        this.field45 = arg0.method2083();
        this.field37 = arg0.method2263();
        this.field51 = arg0.method2083() == 1;
        if (client.field438 == 0 && client.field416 >= 2) {
            this.field51 = false;
        }
        if (this.field33 == null) {
            this.field33 = new class160();
        }
        this.field33.method2891(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("z.j(I)Lcx;")
    public final class99 method15() {
        if (this.field33 == null) {
            return null;
        }
        class39 var1 = this.field766 != -1 && this.field769 == 0 ? class39.method2627(this.field766) : null;
        class39 var2 = this.field775 == -1 || this.field49 || this.field775 == this.field740 && var1 != null ? null : class39.method2627(this.field775);
        class99 var3 = this.field33.method2875(var1, this.field767, var2, this.field763);
        if (var3 == null) {
            return null;
        }
        var3.method1940();
        this.field784 = var3.field1352;
        if (!this.field49 && this.field771 != -1 && this.field772 != -1) {
            class99 var4 = class40.method2523(this.field771).method720(this.field772);
            if (var4 != null) {
                var4.method1949(0, -this.field739, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field49 && this.field44 != null) {
            if (client.field410 >= this.field35) {
                this.field44 = null;
            }
            if (client.field410 >= this.field34 && client.field410 < this.field35) {
                class99 var6 = this.field44;
                var6.method1949(this.field41 - this.field753, this.field42 - this.field38, this.field50 - this.field736);
                if (this.field737 == 512) {
                    var6.method1936();
                    var6.method1936();
                    var6.method1936();
                } else if (this.field737 == 1024) {
                    var6.method1936();
                    var6.method1936();
                } else if (this.field737 == 1536) {
                    var6.method1936();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field737 == 512) {
                    var6.method1936();
                } else if (this.field737 == 1024) {
                    var6.method1936();
                    var6.method1936();
                } else if (this.field737 == 1536) {
                    var6.method1936();
                    var6.method1936();
                    var6.method1936();
                }
                var6.method1949(this.field753 - this.field41, this.field38 - this.field42, this.field736 - this.field50);
            }
        }
        var3.field1704 = true;
        return var3;
    }

    @ObfuscatedName("z.z(I)Z")
    public final boolean method14() {
        return this.field33 != null;
    }
}
