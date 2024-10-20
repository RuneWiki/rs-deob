package deob;

@ObfuscatedName("g")
public final class class3 extends class35 {

    @ObfuscatedName("g.o")
    public String field38;

    @ObfuscatedName("g.l")
    public class170 field29;

    @ObfuscatedName("g.g")
    public int field48 = -1;

    @ObfuscatedName("g.u")
    public int field30 = -1;

    @ObfuscatedName("g.q")
    public int field32 = 0;

    @ObfuscatedName("g.r")
    public int field33 = 0;

    @ObfuscatedName("g.v")
    public int field34;

    @ObfuscatedName("g.y")
    public int field28 = 0;

    @ObfuscatedName("g.k")
    public int field31 = 0;

    @ObfuscatedName("g.c")
    public int field37;

    @ObfuscatedName("g.j")
    public int field53;

    @ObfuscatedName("g.m")
    public int field39;

    @ObfuscatedName("g.a")
    public class100 field40;

    @ObfuscatedName("g.f")
    public int field41;

    @ObfuscatedName("g.i")
    public int field44;

    @ObfuscatedName("g.n")
    public int field43;

    @ObfuscatedName("g.x")
    public int field36;

    @ObfuscatedName("g.h")
    public boolean field45 = false;

    @ObfuscatedName("g.t")
    public int field46 = 0;

    @ObfuscatedName("g.w")
    public boolean field47 = false;

    @ObfuscatedName("g.o(Ldk;I)V")
    public final void method13(class111 arg0) {
        arg0.field1861 = 0;
        int var2 = arg0.method2219();
        this.field48 = arg0.method2220();
        this.field30 = arg0.method2220();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2219();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2219();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2397();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method2700(var4[var5] - 512).field1036;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2219();
            if (var11 < 0 || var11 >= Statics.field1541[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field754 = arg0.method2397();
        if (this.field754 == 65535) {
            this.field754 = -1;
        }
        this.field755 = arg0.method2397();
        if (this.field755 == 65535) {
            this.field755 = -1;
        }
        this.field756 = this.field755;
        this.field757 = arg0.method2397();
        if (this.field757 == 65535) {
            this.field757 = -1;
        }
        this.field758 = arg0.method2397();
        if (this.field758 == 65535) {
            this.field758 = -1;
        }
        this.field759 = arg0.method2397();
        if (this.field759 == 65535) {
            this.field759 = -1;
        }
        this.field760 = arg0.method2397();
        if (this.field760 == 65535) {
            this.field760 = -1;
        }
        this.field799 = arg0.method2397();
        if (this.field799 == 65535) {
            this.field799 = -1;
        }
        this.field38 = arg0.method2339();
        if (Statics.field571 == this) {
            Statics.field942 = this.field38;
        }
        this.field32 = arg0.method2219();
        this.field33 = arg0.method2397();
        this.field47 = arg0.method2219() == 1;
        if (client.field455 == 0 && client.field430 >= 2) {
            this.field47 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class170();
        }
        this.field29.method3146(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("g.l(B)Lcq;")
    public final class100 method14() {
        if (this.field29 == null) {
            return null;
        }
        class40 var1 = this.field793 != -1 && this.field770 == 0 ? class40.method567(this.field793) : null;
        class40 var2 = this.field777 == -1 || this.field45 || this.field777 == this.field754 && var1 != null ? null : class40.method567(this.field777);
        class100 var3 = this.field29.method3152(var1, this.field781, var2, this.field778);
        if (var3 == null) {
            return null;
        }
        var3.method2050();
        this.field789 = var3.field1376;
        if (!this.field45 && this.field785 != -1 && this.field783 != -1) {
            class100 var4 = class41.method2537(this.field785).method819(this.field783);
            if (var4 != null) {
                var4.method2059(0, -this.field796, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field270 >= this.field31) {
                this.field40 = null;
            }
            if (client.field270 >= this.field28 && client.field270 < this.field31) {
                class100 var6 = this.field40;
                var6.method2059(this.field37 - this.field804, this.field53 - this.field34, this.field39 - this.field750);
                if (this.field811 == 512) {
                    var6.method2116();
                    var6.method2116();
                    var6.method2116();
                } else if (this.field811 == 1024) {
                    var6.method2116();
                    var6.method2116();
                } else if (this.field811 == 1536) {
                    var6.method2116();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field811 == 512) {
                    var6.method2116();
                } else if (this.field811 == 1024) {
                    var6.method2116();
                    var6.method2116();
                } else if (this.field811 == 1536) {
                    var6.method2116();
                    var6.method2116();
                    var6.method2116();
                }
                var6.method2059(this.field804 - this.field37, this.field34 - this.field53, this.field750 - this.field39);
            }
        }
        var3.field1714 = true;
        return var3;
    }

    @ObfuscatedName("g.g(I)Z")
    public final boolean method15() {
        return this.field29 != null;
    }
}
