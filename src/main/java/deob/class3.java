package deob;

@ObfuscatedName("y")
public final class class3 extends class33 {

    @ObfuscatedName("y.e")
    public String field46;

    @ObfuscatedName("y.o")
    public class157 field33;

    @ObfuscatedName("y.y")
    public int field30 = -1;

    @ObfuscatedName("y.b")
    public int field31 = -1;

    @ObfuscatedName("y.w")
    public int field32 = 0;

    @ObfuscatedName("y.r")
    public int field43 = 0;

    @ObfuscatedName("y.l")
    public int field29;

    @ObfuscatedName("y.s")
    public int field35 = 0;

    @ObfuscatedName("y.f")
    public int field34 = 0;

    @ObfuscatedName("y.x")
    public int field37;

    @ObfuscatedName("y.h")
    public int field38;

    @ObfuscatedName("y.a")
    public int field39;

    @ObfuscatedName("y.u")
    public class98 field40;

    @ObfuscatedName("y.v")
    public int field47;

    @ObfuscatedName("y.i")
    public int field42;

    @ObfuscatedName("y.n")
    public int field36;

    @ObfuscatedName("y.d")
    public int field44;

    @ObfuscatedName("y.k")
    public boolean field45 = false;

    @ObfuscatedName("y.p")
    public int field28 = 0;

    @ObfuscatedName("y.j")
    public boolean field41 = false;

    @ObfuscatedName("y.e(Ldl;B)V")
    public final void method24(class107 arg0) {
        arg0.field1841 = 0;
        int var2 = arg0.method2123();
        this.field30 = arg0.method2066();
        this.field31 = arg0.method2066();
        int var3 = -1;
        this.field28 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2123();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2123();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2232();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method1729(var4[var5] - 512).field1064;
                    if (var8 != 0) {
                        this.field28 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2123();
            if (var11 < 0 || var11 >= Statics.field2665[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field748 = arg0.method2232();
        if (this.field748 == 65535) {
            this.field748 = -1;
        }
        this.field762 = arg0.method2232();
        if (this.field762 == 65535) {
            this.field762 = -1;
        }
        this.field750 = this.field762;
        this.field751 = arg0.method2232();
        if (this.field751 == 65535) {
            this.field751 = -1;
        }
        this.field768 = arg0.method2232();
        if (this.field768 == 65535) {
            this.field768 = -1;
        }
        this.field753 = arg0.method2232();
        if (this.field753 == 65535) {
            this.field753 = -1;
        }
        this.field754 = arg0.method2232();
        if (this.field754 == 65535) {
            this.field754 = -1;
        }
        this.field758 = arg0.method2232();
        if (this.field758 == 65535) {
            this.field758 = -1;
        }
        this.field46 = arg0.method2073();
        if (Statics.field24 == this) {
            Statics.field2070 = this.field46;
        }
        this.field32 = arg0.method2123();
        this.field43 = arg0.method2232();
        this.field41 = arg0.method2123() == 1;
        if (client.field269 == 0 && client.field432 >= 2) {
            this.field41 = false;
        }
        if (this.field33 == null) {
            this.field33 = new class157();
        }
        this.field33.method2842(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.o(B)Lcd;")
    public final class98 method21() {
        if (this.field33 == null) {
            return null;
        }
        class38 var1 = this.field773 != -1 && this.field772 == 0 ? class38.method131(this.field773) : null;
        class38 var2 = this.field770 == -1 || this.field45 || this.field770 == this.field748 && var1 != null ? null : class38.method131(this.field770);
        class98 var3 = this.field33.method2832(var1, this.field774, var2, this.field771);
        if (var3 == null) {
            return null;
        }
        var3.method1923();
        this.field791 = var3.field1353;
        if (!this.field45 && this.field763 != -1 && this.field779 != -1) {
            class98 var4 = class39.method147(this.field763).method740(this.field779);
            if (var4 != null) {
                var4.method1937(0, -this.field782, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field318 >= this.field34) {
                this.field40 = null;
            }
            if (client.field318 >= this.field35 && client.field318 < this.field34) {
                class98 var6 = this.field40;
                var6.method1937(this.field37 - this.field777, this.field38 - this.field29, this.field39 - this.field744);
                if (this.field792 == 512) {
                    var6.method1933();
                    var6.method1933();
                    var6.method1933();
                } else if (this.field792 == 1024) {
                    var6.method1933();
                    var6.method1933();
                } else if (this.field792 == 1536) {
                    var6.method1933();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field792 == 512) {
                    var6.method1933();
                } else if (this.field792 == 1024) {
                    var6.method1933();
                    var6.method1933();
                } else if (this.field792 == 1536) {
                    var6.method1933();
                    var6.method1933();
                    var6.method1933();
                }
                var6.method1937(this.field777 - this.field37, this.field29 - this.field38, this.field744 - this.field39);
            }
        }
        var3.field1720 = true;
        return var3;
    }

    @ObfuscatedName("y.y(I)Z")
    public final boolean method22() {
        return this.field33 != null;
    }
}
