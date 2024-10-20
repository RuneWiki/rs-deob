package deob;

@ObfuscatedName("g")
public final class class3 extends class34 {

    @ObfuscatedName("g.l")
    public String field49;

    @ObfuscatedName("g.y")
    public class160 field40;

    @ObfuscatedName("g.g")
    public int field35 = -1;

    @ObfuscatedName("g.j")
    public int field36 = -1;

    @ObfuscatedName("g.w")
    public int field44 = 0;

    @ObfuscatedName("g.c")
    public int field42 = 0;

    @ObfuscatedName("g.x")
    public int field34;

    @ObfuscatedName("g.f")
    public int field38 = 0;

    @ObfuscatedName("g.t")
    public int field41 = 0;

    @ObfuscatedName("g.n")
    public int field52;

    @ObfuscatedName("g.p")
    public int field43;

    @ObfuscatedName("g.a")
    public int field46;

    @ObfuscatedName("g.o")
    public class99 field45;

    @ObfuscatedName("g.b")
    public int field39;

    @ObfuscatedName("g.r")
    public int field47;

    @ObfuscatedName("g.z")
    public int field48;

    @ObfuscatedName("g.u")
    public int field33;

    @ObfuscatedName("g.s")
    public boolean field50 = false;

    @ObfuscatedName("g.i")
    public int field51 = 0;

    @ObfuscatedName("g.e")
    public boolean field37 = false;

    @ObfuscatedName("g.l(Ldk;I)V")
    public final void method14(class108 arg0) {
        arg0.field1823 = 0;
        int var2 = arg0.method2291();
        this.field35 = arg0.method2292();
        this.field36 = arg0.method2292();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2291();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2291();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2163();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method137(var4[var5] - 512).field1048;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2291();
            if (var11 < 0 || var11 >= Statics.field2950[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field724 = arg0.method2163();
        if (this.field724 == 65535) {
            this.field724 = -1;
        }
        this.field725 = arg0.method2163();
        if (this.field725 == 65535) {
            this.field725 = -1;
        }
        this.field726 = this.field725;
        this.field722 = arg0.method2163();
        if (this.field722 == 65535) {
            this.field722 = -1;
        }
        this.field763 = arg0.method2163();
        if (this.field763 == 65535) {
            this.field763 = -1;
        }
        this.field773 = arg0.method2163();
        if (this.field773 == 65535) {
            this.field773 = -1;
        }
        this.field730 = arg0.method2163();
        if (this.field730 == 65535) {
            this.field730 = -1;
        }
        this.field731 = arg0.method2163();
        if (this.field731 == 65535) {
            this.field731 = -1;
        }
        this.field49 = arg0.method2168();
        if (Statics.field216 == this) {
            Statics.field2068 = this.field49;
        }
        this.field44 = arg0.method2291();
        this.field42 = arg0.method2163();
        this.field37 = arg0.method2291() == 1;
        if (client.field430 == 0 && client.field404 >= 2) {
            this.field37 = false;
        }
        if (this.field40 == null) {
            this.field40 = new class160();
        }
        this.field40.method2971(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("g.y(I)Lck;")
    public final class99 method23() {
        if (this.field40 == null) {
            return null;
        }
        class39 var1 = this.field760 != -1 && this.field753 == 0 ? class39.method821(this.field760) : null;
        class39 var2 = this.field728 == -1 || this.field50 || this.field728 == this.field724 && var1 != null ? null : class39.method821(this.field728);
        class99 var3 = this.field40.method2990(var1, this.field751, var2, this.field748);
        if (var3 == null) {
            return null;
        }
        var3.method2064();
        this.field778 = var3.field1340;
        if (!this.field50 && this.field755 != -1 && this.field756 != -1) {
            class99 var4 = Statics.method503(this.field755).method752(this.field756);
            if (var4 != null) {
                var4.method2060(0, -this.field759, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field246 >= this.field41) {
                this.field45 = null;
            }
            if (client.field246 >= this.field38 && client.field246 < this.field41) {
                class99 var6 = this.field45;
                var6.method2060(this.field52 - this.field732, this.field43 - this.field34, this.field46 - this.field777);
                if (this.field737 == 512) {
                    var6.method2010();
                    var6.method2010();
                    var6.method2010();
                } else if (this.field737 == 1024) {
                    var6.method2010();
                    var6.method2010();
                } else if (this.field737 == 1536) {
                    var6.method2010();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field737 == 512) {
                    var6.method2010();
                } else if (this.field737 == 1024) {
                    var6.method2010();
                    var6.method2010();
                } else if (this.field737 == 1536) {
                    var6.method2010();
                    var6.method2010();
                    var6.method2010();
                }
                var6.method2060(this.field732 - this.field52, this.field34 - this.field43, this.field777 - this.field46);
            }
        }
        var3.field1703 = true;
        return var3;
    }

    @ObfuscatedName("g.g(B)Z")
    public final boolean method16() {
        return this.field40 != null;
    }
}
