package deob;

@ObfuscatedName("a")
public final class class3 extends class35 {

    @ObfuscatedName("a.b")
    public String field33;

    @ObfuscatedName("a.e")
    public class170 field29;

    @ObfuscatedName("a.a")
    public int field30 = -1;

    @ObfuscatedName("a.k")
    public int field28 = -1;

    @ObfuscatedName("a.p")
    public int field36 = 0;

    @ObfuscatedName("a.l")
    public int field46 = 0;

    @ObfuscatedName("a.u")
    public int field34;

    @ObfuscatedName("a.o")
    public int field43 = 0;

    @ObfuscatedName("a.m")
    public int field48 = 0;

    @ObfuscatedName("a.q")
    public int field37;

    @ObfuscatedName("a.v")
    public int field38;

    @ObfuscatedName("a.n")
    public int field39;

    @ObfuscatedName("a.z")
    public class100 field40;

    @ObfuscatedName("a.r")
    public int field41;

    @ObfuscatedName("a.i")
    public int field42;

    @ObfuscatedName("a.s")
    public int field51;

    @ObfuscatedName("a.c")
    public int field44;

    @ObfuscatedName("a.t")
    public boolean field45 = false;

    @ObfuscatedName("a.h")
    public int field49 = 0;

    @ObfuscatedName("a.w")
    public boolean field47 = false;

    @ObfuscatedName("a.b(Ldj;B)V")
    public final void method15(class111 arg0) {
        arg0.field1894 = 0;
        int var2 = arg0.method2127();
        this.field30 = arg0.method2267();
        this.field28 = arg0.method2267();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2127();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2127();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2129();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method1037(var4[var5] - 512).field1077;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2127();
            if (var11 < 0 || var11 >= Statics.field540[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field793 = arg0.method2129();
        if (this.field793 == 65535) {
            this.field793 = -1;
        }
        this.field741 = arg0.method2129();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field742 = this.field741;
        this.field743 = arg0.method2129();
        if (this.field743 == 65535) {
            this.field743 = -1;
        }
        this.field744 = arg0.method2129();
        if (this.field744 == 65535) {
            this.field744 = -1;
        }
        this.field756 = arg0.method2129();
        if (this.field756 == 65535) {
            this.field756 = -1;
        }
        this.field746 = arg0.method2129();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field783 = arg0.method2129();
        if (this.field783 == 65535) {
            this.field783 = -1;
        }
        this.field33 = arg0.method2166();
        if (Statics.field579 == this) {
            Statics.field2126 = this.field33;
        }
        this.field36 = arg0.method2127();
        this.field46 = arg0.method2129();
        this.field47 = arg0.method2127() == 1;
        if (client.field250 == 0 && client.field311 >= 2) {
            this.field47 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class170();
        }
        this.field29.method3042(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.e(I)Lcx;")
    public final class100 method16() {
        if (this.field29 == null) {
            return null;
        }
        class40 var1 = this.field766 != -1 && this.field769 == 0 ? class40.method512(this.field766) : null;
        class40 var2 = this.field763 == -1 || this.field45 || this.field793 == this.field763 && var1 != null ? null : class40.method512(this.field763);
        class100 var3 = this.field29.method3028(var1, this.field767, var2, this.field754);
        if (var3 == null) {
            return null;
        }
        var3.method1974();
        this.field761 = var3.field1384;
        if (!this.field45 && this.field748 != -1 && this.field772 != -1) {
            class100 var4 = class41.method174(this.field748).method764(this.field772);
            if (var4 != null) {
                var4.method1984(0, -this.field775, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field259 >= this.field48) {
                this.field40 = null;
            }
            if (client.field259 >= this.field43 && client.field259 < this.field48) {
                class100 var6 = this.field40;
                var6.method1984(this.field37 - this.field749, this.field38 - this.field34, this.field39 - this.field752);
                if (this.field777 == 512) {
                    var6.method2029();
                    var6.method2029();
                    var6.method2029();
                } else if (this.field777 == 1024) {
                    var6.method2029();
                    var6.method2029();
                } else if (this.field777 == 1536) {
                    var6.method2029();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field777 == 512) {
                    var6.method2029();
                } else if (this.field777 == 1024) {
                    var6.method2029();
                    var6.method2029();
                } else if (this.field777 == 1536) {
                    var6.method2029();
                    var6.method2029();
                    var6.method2029();
                }
                var6.method1984(this.field749 - this.field37, this.field34 - this.field38, this.field752 - this.field39);
            }
        }
        var3.field1770 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method17() {
        return this.field29 != null;
    }
}
