package deob;

@ObfuscatedName("i")
public final class class3 extends class34 {

    @ObfuscatedName("i.b")
    public String field46;

    @ObfuscatedName("i.e")
    public class162 field36;

    @ObfuscatedName("i.i")
    public int field37 = -1;

    @ObfuscatedName("i.k")
    public int field38 = -1;

    @ObfuscatedName("i.h")
    public int field49 = 0;

    @ObfuscatedName("i.p")
    public int field35 = 0;

    @ObfuscatedName("i.n")
    public int field40;

    @ObfuscatedName("i.o")
    public int field39 = 0;

    @ObfuscatedName("i.g")
    public int field42 = 0;

    @ObfuscatedName("i.z")
    public int field43;

    @ObfuscatedName("i.t")
    public int field45;

    @ObfuscatedName("i.y")
    public int field44;

    @ObfuscatedName("i.w")
    public class99 field47;

    @ObfuscatedName("i.x")
    public int field48;

    @ObfuscatedName("i.v")
    public int field52;

    @ObfuscatedName("i.q")
    public int field50;

    @ObfuscatedName("i.f")
    public int field51;

    @ObfuscatedName("i.s")
    public boolean field41 = false;

    @ObfuscatedName("i.a")
    public int field53 = 0;

    @ObfuscatedName("i.m")
    public boolean field54 = false;

    @ObfuscatedName("i.b(Ldc;I)V")
    public final void method14(class110 arg0) {
        arg0.field1855 = 0;
        int var2 = arg0.method2142();
        this.field37 = arg0.method2294();
        this.field38 = arg0.method2294();
        int var3 = -1;
        this.field53 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2142();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2142();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2292();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method2398(var4[var5] - 512).field1052;
                    if (var8 != 0) {
                        this.field53 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2142();
            if (var11 < 0 || var11 >= Statics.field2711[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field783 = arg0.method2292();
        if (this.field783 == 65535) {
            this.field783 = -1;
        }
        this.field732 = arg0.method2292();
        if (this.field732 == 65535) {
            this.field732 = -1;
        }
        this.field764 = this.field732;
        this.field734 = arg0.method2292();
        if (this.field734 == 65535) {
            this.field734 = -1;
        }
        this.field728 = arg0.method2292();
        if (this.field728 == 65535) {
            this.field728 = -1;
        }
        this.field781 = arg0.method2292();
        if (this.field781 == 65535) {
            this.field781 = -1;
        }
        this.field737 = arg0.method2292();
        if (this.field737 == 65535) {
            this.field737 = -1;
        }
        this.field744 = arg0.method2292();
        if (this.field744 == 65535) {
            this.field744 = -1;
        }
        this.field46 = arg0.method2150();
        if (Statics.field920 == this) {
            Statics.field2092 = this.field46;
        }
        this.field49 = arg0.method2142();
        this.field35 = arg0.method2292();
        this.field54 = arg0.method2142() == 1;
        if (client.field372 == 0 && client.field409 >= 2) {
            this.field54 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class162();
        }
        this.field36.method2967(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.e(B)Lcr;")
    public final class99 method15() {
        if (this.field36 == null) {
            return null;
        }
        class39 var1 = this.field747 != -1 && this.field756 == 0 ? class39.method1863(this.field747) : null;
        class39 var2 = this.field754 == -1 || this.field41 || this.field783 == this.field754 && var1 != null ? null : class39.method1863(this.field754);
        class99 var3 = this.field36.method2988(var1, this.field758, var2, this.field766);
        if (var3 == null) {
            return null;
        }
        var3.method1976();
        this.field775 = var3.field1354;
        if (!this.field41 && this.field762 != -1 && this.field763 != -1) {
            class99 var4 = class40.method1763(this.field762).method763(this.field763);
            if (var4 != null) {
                var4.method2019(0, -this.field736, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field41 && this.field47 != null) {
            if (client.field249 >= this.field42) {
                this.field47 = null;
            }
            if (client.field249 >= this.field39 && client.field249 < this.field42) {
                class99 var6 = this.field47;
                var6.method2019(this.field43 - this.field731, this.field45 - this.field40, this.field44 - this.field787);
                if (this.field776 == 512) {
                    var6.method1982();
                    var6.method1982();
                    var6.method1982();
                } else if (this.field776 == 1024) {
                    var6.method1982();
                    var6.method1982();
                } else if (this.field776 == 1536) {
                    var6.method1982();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field776 == 512) {
                    var6.method1982();
                } else if (this.field776 == 1024) {
                    var6.method1982();
                    var6.method1982();
                } else if (this.field776 == 1536) {
                    var6.method1982();
                    var6.method1982();
                    var6.method1982();
                }
                var6.method2019(this.field731 - this.field43, this.field40 - this.field45, this.field787 - this.field44);
            }
        }
        var3.field1724 = true;
        return var3;
    }

    @ObfuscatedName("i.i(B)Z")
    public final boolean method16() {
        return this.field36 != null;
    }
}
