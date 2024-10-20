package deob;

@ObfuscatedName("e")
public final class class3 extends class33 {

    @ObfuscatedName("e.k")
    public String field55;

    @ObfuscatedName("e.b")
    public class157 field36;

    @ObfuscatedName("e.e")
    public int field37 = -1;

    @ObfuscatedName("e.i")
    public int field38 = -1;

    @ObfuscatedName("e.t")
    public int field40 = 0;

    @ObfuscatedName("e.z")
    public int field59 = 0;

    @ObfuscatedName("e.g")
    public int field47;

    @ObfuscatedName("e.c")
    public int field42 = 0;

    @ObfuscatedName("e.o")
    public int field43 = 0;

    @ObfuscatedName("e.q")
    public int field44;

    @ObfuscatedName("e.w")
    public int field45;

    @ObfuscatedName("e.y")
    public int field46;

    @ObfuscatedName("e.p")
    public class98 field39;

    @ObfuscatedName("e.m")
    public int field48;

    @ObfuscatedName("e.a")
    public int field41;

    @ObfuscatedName("e.u")
    public int field50;

    @ObfuscatedName("e.n")
    public int field51;

    @ObfuscatedName("e.x")
    public boolean field52 = false;

    @ObfuscatedName("e.f")
    public int field35 = 0;

    @ObfuscatedName("e.v")
    public boolean field53 = false;

    @ObfuscatedName("e.k(Ldi;I)V")
    public final void method10(class107 arg0) {
        arg0.field1862 = 0;
        int var2 = arg0.method2115();
        this.field37 = arg0.method2116();
        this.field38 = arg0.method2116();
        int var3 = -1;
        this.field35 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2115();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2115();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2117();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method2458(var4[var5] - 512).field1054;
                    if (var8 != 0) {
                        this.field35 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2115();
            if (var11 < 0 || var11 >= Statics.field2678[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field775 = arg0.method2117();
        if (this.field775 == 65535) {
            this.field775 = -1;
        }
        this.field749 = arg0.method2117();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field734 = this.field749;
        this.field735 = arg0.method2117();
        if (this.field735 == 65535) {
            this.field735 = -1;
        }
        this.field736 = arg0.method2117();
        if (this.field736 == 65535) {
            this.field736 = -1;
        }
        this.field730 = arg0.method2117();
        if (this.field730 == 65535) {
            this.field730 = -1;
        }
        this.field738 = arg0.method2117();
        if (this.field738 == 65535) {
            this.field738 = -1;
        }
        this.field769 = arg0.method2117();
        if (this.field769 == 65535) {
            this.field769 = -1;
        }
        this.field55 = arg0.method2123();
        if (Statics.field892 == this) {
            Statics.field2087 = this.field55;
        }
        this.field40 = arg0.method2115();
        this.field59 = arg0.method2117();
        this.field53 = arg0.method2115() == 1;
        if (client.field256 == 0 && client.field326 >= 2) {
            this.field53 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class157();
        }
        this.field36.method2911(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("e.b(I)Lck;")
    public final class98 method19() {
        if (this.field36 == null) {
            return null;
        }
        class38 var1 = this.field757 != -1 && this.field760 == 0 ? class38.method595(this.field757) : null;
        class38 var2 = this.field778 == -1 || this.field52 || this.field778 == this.field775 && var1 != null ? null : class38.method595(this.field778);
        class98 var3 = this.field36.method2917(var1, this.field758, var2, this.field755);
        if (var3 == null) {
            return null;
        }
        var3.method1979();
        this.field737 = var3.field1353;
        if (!this.field52 && this.field762 != -1 && this.field763 != -1) {
            class98 var4 = class39.method788(this.field762).method738(this.field763);
            if (var4 != null) {
                var4.method1987(0, -this.field766, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field52 && this.field39 != null) {
            if (client.field265 >= this.field43) {
                this.field39 = null;
            }
            if (client.field265 >= this.field42 && client.field265 < this.field43) {
                class98 var6 = this.field39;
                var6.method1987(this.field44 - this.field770, this.field45 - this.field47, this.field46 - this.field728);
                if (this.field776 == 512) {
                    var6.method1984();
                    var6.method1984();
                    var6.method1984();
                } else if (this.field776 == 1024) {
                    var6.method1984();
                    var6.method1984();
                } else if (this.field776 == 1536) {
                    var6.method1984();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field776 == 512) {
                    var6.method1984();
                } else if (this.field776 == 1024) {
                    var6.method1984();
                    var6.method1984();
                } else if (this.field776 == 1536) {
                    var6.method1984();
                    var6.method1984();
                    var6.method1984();
                }
                var6.method1987(this.field770 - this.field44, this.field47 - this.field45, this.field728 - this.field46);
            }
        }
        var3.field1712 = true;
        return var3;
    }

    @ObfuscatedName("e.e(B)Z")
    public final boolean method11() {
        return this.field36 != null;
    }
}
