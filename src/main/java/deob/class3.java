package deob;

@ObfuscatedName("y")
public final class class3 extends class34 {

    @ObfuscatedName("y.c")
    public String field51;

    @ObfuscatedName("y.j")
    public class160 field36;

    @ObfuscatedName("y.y")
    public int field35 = -1;

    @ObfuscatedName("y.r")
    public int field40 = -1;

    @ObfuscatedName("y.f")
    public int field37 = 0;

    @ObfuscatedName("y.l")
    public int field38 = 0;

    @ObfuscatedName("y.b")
    public int field39;

    @ObfuscatedName("y.k")
    public int field57 = 0;

    @ObfuscatedName("y.g")
    public int field53 = 0;

    @ObfuscatedName("y.v")
    public int field42;

    @ObfuscatedName("y.i")
    public int field43;

    @ObfuscatedName("y.x")
    public int field44;

    @ObfuscatedName("y.h")
    public class99 field45;

    @ObfuscatedName("y.w")
    public int field46;

    @ObfuscatedName("y.s")
    public int field47;

    @ObfuscatedName("y.p")
    public int field48;

    @ObfuscatedName("y.z")
    public int field49;

    @ObfuscatedName("y.n")
    public boolean field50 = false;

    @ObfuscatedName("y.u")
    public int field41 = 0;

    @ObfuscatedName("y.a")
    public boolean field52 = false;

    @ObfuscatedName("y.c(Ldx;I)V")
    public final void method9(class108 arg0) {
        arg0.field1826 = 0;
        int var2 = arg0.method2134();
        this.field35 = arg0.method2229();
        this.field40 = arg0.method2229();
        int var3 = -1;
        this.field41 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2134();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2134();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2136();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method114(var4[var5] - 512).field1060;
                    if (var8 != 0) {
                        this.field41 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2134();
            if (var11 < 0 || var11 >= Statics.field2406[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field732 = arg0.method2136();
        if (this.field732 == 65535) {
            this.field732 = -1;
        }
        this.field733 = arg0.method2136();
        if (this.field733 == 65535) {
            this.field733 = -1;
        }
        this.field734 = this.field733;
        this.field735 = arg0.method2136();
        if (this.field735 == 65535) {
            this.field735 = -1;
        }
        this.field736 = arg0.method2136();
        if (this.field736 == 65535) {
            this.field736 = -1;
        }
        this.field737 = arg0.method2136();
        if (this.field737 == 65535) {
            this.field737 = -1;
        }
        this.field768 = arg0.method2136();
        if (this.field768 == 65535) {
            this.field768 = -1;
        }
        this.field752 = arg0.method2136();
        if (this.field752 == 65535) {
            this.field752 = -1;
        }
        this.field51 = arg0.method2216();
        if (Statics.field524 == this) {
            Statics.field921 = this.field51;
        }
        this.field37 = arg0.method2134();
        this.field38 = arg0.method2136();
        this.field52 = arg0.method2134() == 1;
        if (client.field251 == 0 && client.field374 >= 2) {
            this.field52 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class160();
        }
        this.field36.method2946(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.j(B)Lcl;")
    public final class99 method20() {
        if (this.field36 == null) {
            return null;
        }
        class39 var1 = this.field758 != -1 && this.field761 == 0 ? class39.method109(this.field758) : null;
        class39 var2 = this.field747 == -1 || this.field50 || this.field747 == this.field732 && var1 != null ? null : class39.method109(this.field747);
        class99 var3 = this.field36.method2952(var1, this.field738, var2, this.field756);
        if (var3 == null) {
            return null;
        }
        var3.method2022();
        this.field748 = var3.field1347;
        if (!this.field50 && this.field763 != -1 && this.field764 != -1) {
            class99 var4 = class40.method903(this.field763).method735(this.field764);
            if (var4 != null) {
                var4.method1997(0, -this.field767, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field493 >= this.field53) {
                this.field45 = null;
            }
            if (client.field493 >= this.field57 && client.field493 < this.field53) {
                class99 var6 = this.field45;
                var6.method1997(this.field42 - this.field780, this.field43 - this.field39, this.field44 - this.field727);
                if (this.field777 == 512) {
                    var6.method1993();
                    var6.method1993();
                    var6.method1993();
                } else if (this.field777 == 1024) {
                    var6.method1993();
                    var6.method1993();
                } else if (this.field777 == 1536) {
                    var6.method1993();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field777 == 512) {
                    var6.method1993();
                } else if (this.field777 == 1024) {
                    var6.method1993();
                    var6.method1993();
                } else if (this.field777 == 1536) {
                    var6.method1993();
                    var6.method1993();
                    var6.method1993();
                }
                var6.method1997(this.field780 - this.field42, this.field39 - this.field43, this.field727 - this.field44);
            }
        }
        var3.field1702 = true;
        return var3;
    }

    @ObfuscatedName("y.y(I)Z")
    public final boolean method10() {
        return this.field36 != null;
    }
}
