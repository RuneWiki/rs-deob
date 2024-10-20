package deob;

@ObfuscatedName("i")
public final class class3 extends class35 {

    @ObfuscatedName("i.n")
    public String field30;

    @ObfuscatedName("i.w")
    public class170 field29;

    @ObfuscatedName("i.i")
    public int field39 = -1;

    @ObfuscatedName("i.e")
    public int field31 = -1;

    @ObfuscatedName("i.h")
    public int field32 = 0;

    @ObfuscatedName("i.q")
    public int field33 = 0;

    @ObfuscatedName("i.l")
    public int field37;

    @ObfuscatedName("i.c")
    public int field35 = 0;

    @ObfuscatedName("i.f")
    public int field36 = 0;

    @ObfuscatedName("i.s")
    public int field44;

    @ObfuscatedName("i.m")
    public int field38;

    @ObfuscatedName("i.y")
    public int field47;

    @ObfuscatedName("i.b")
    public class100 field40;

    @ObfuscatedName("i.v")
    public int field41;

    @ObfuscatedName("i.z")
    public int field42;

    @ObfuscatedName("i.u")
    public int field43;

    @ObfuscatedName("i.g")
    public int field45;

    @ObfuscatedName("i.k")
    public boolean field34 = false;

    @ObfuscatedName("i.o")
    public int field46 = 0;

    @ObfuscatedName("i.a")
    public boolean field28 = false;

    @ObfuscatedName("i.n(Ldo;I)V")
    public final void method11(class111 arg0) {
        arg0.field1888 = 0;
        int var2 = arg0.method2155();
        this.field39 = arg0.method2173();
        this.field31 = arg0.method2173();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2155();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2155();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2157();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method496(var4[var5] - 512).field1079;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2155();
            if (var11 < 0 || var11 >= Statics.field2824[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field761 = arg0.method2157();
        if (this.field761 == 65535) {
            this.field761 = -1;
        }
        this.field762 = arg0.method2157();
        if (this.field762 == 65535) {
            this.field762 = -1;
        }
        this.field815 = this.field762;
        this.field764 = arg0.method2157();
        if (this.field764 == 65535) {
            this.field764 = -1;
        }
        this.field765 = arg0.method2157();
        if (this.field765 == 65535) {
            this.field765 = -1;
        }
        this.field812 = arg0.method2157();
        if (this.field812 == 65535) {
            this.field812 = -1;
        }
        this.field805 = arg0.method2157();
        if (this.field805 == 65535) {
            this.field805 = -1;
        }
        this.field804 = arg0.method2157();
        if (this.field804 == 65535) {
            this.field804 = -1;
        }
        this.field30 = arg0.method2163();
        if (Statics.field633 == this) {
            Statics.field2109 = this.field30;
        }
        this.field32 = arg0.method2155();
        this.field33 = arg0.method2157();
        this.field28 = arg0.method2155() == 1;
        if (client.field493 == 0 && client.field259 >= 2) {
            this.field28 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class170();
        }
        this.field29.method3060(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.w(B)Lcw;")
    public final class100 method12() {
        if (this.field29 == null) {
            return null;
        }
        class40 var1 = this.field787 != -1 && this.field792 == 0 ? class40.method122(this.field787) : null;
        class40 var2 = this.field799 == -1 || this.field34 || this.field799 == this.field761 && var1 != null ? null : class40.method122(this.field799);
        class100 var3 = this.field29.method3080(var1, this.field788, var2, this.field784);
        if (var3 == null) {
            return null;
        }
        var3.method2001();
        this.field772 = var3.field1383;
        if (!this.field34 && this.field767 != -1 && this.field759 != -1) {
            class100 var4 = class41.method667(this.field767).method780(this.field759);
            if (var4 != null) {
                var4.method2011(0, -this.field756, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field34 && this.field40 != null) {
            if (client.field268 >= this.field36) {
                this.field40 = null;
            }
            if (client.field268 >= this.field35 && client.field268 < this.field36) {
                class100 var6 = this.field40;
                var6.method2011(this.field44 - this.field777, this.field38 - this.field37, this.field47 - this.field757);
                if (this.field806 == 512) {
                    var6.method2007();
                    var6.method2007();
                    var6.method2007();
                } else if (this.field806 == 1024) {
                    var6.method2007();
                    var6.method2007();
                } else if (this.field806 == 1536) {
                    var6.method2007();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field806 == 512) {
                    var6.method2007();
                } else if (this.field806 == 1024) {
                    var6.method2007();
                    var6.method2007();
                } else if (this.field806 == 1536) {
                    var6.method2007();
                    var6.method2007();
                    var6.method2007();
                }
                var6.method2011(this.field777 - this.field44, this.field37 - this.field38, this.field757 - this.field47);
            }
        }
        var3.field1730 = true;
        return var3;
    }

    @ObfuscatedName("i.i(I)Z")
    public final boolean method13() {
        return this.field29 != null;
    }
}
