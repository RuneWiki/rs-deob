package deob;

@ObfuscatedName("a")
public final class class3 extends class35 {

    @ObfuscatedName("a.n")
    public String field49;

    @ObfuscatedName("a.o")
    public class170 field29;

    @ObfuscatedName("a.a")
    public int field30 = -1;

    @ObfuscatedName("a.w")
    public int field28 = -1;

    @ObfuscatedName("a.m")
    public int field32 = 0;

    @ObfuscatedName("a.h")
    public int field31 = 0;

    @ObfuscatedName("a.i")
    public int field34;

    @ObfuscatedName("a.r")
    public int field35 = 0;

    @ObfuscatedName("a.l")
    public int field42 = 0;

    @ObfuscatedName("a.f")
    public int field47;

    @ObfuscatedName("a.e")
    public int field38;

    @ObfuscatedName("a.z")
    public int field48;

    @ObfuscatedName("a.v")
    public class100 field40;

    @ObfuscatedName("a.x")
    public int field33;

    @ObfuscatedName("a.q")
    public int field44;

    @ObfuscatedName("a.b")
    public int field43;

    @ObfuscatedName("a.u")
    public int field39;

    @ObfuscatedName("a.t")
    public boolean field45 = false;

    @ObfuscatedName("a.s")
    public int field46 = 0;

    @ObfuscatedName("a.p")
    public boolean field36 = false;

    @ObfuscatedName("a.n(Ldl;I)V")
    public final void method14(class111 arg0) {
        arg0.field1890 = 0;
        int var2 = arg0.method2234();
        this.field30 = arg0.method2235();
        this.field28 = arg0.method2235();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2234();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2234();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2236();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method127(var4[var5] - 512).field1105;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2234();
            if (var11 < 0 || var11 >= Statics.field2826[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field777 = arg0.method2236();
        if (this.field777 == 65535) {
            this.field777 = -1;
        }
        this.field778 = arg0.method2236();
        if (this.field778 == 65535) {
            this.field778 = -1;
        }
        this.field819 = this.field778;
        this.field792 = arg0.method2236();
        if (this.field792 == 65535) {
            this.field792 = -1;
        }
        this.field788 = arg0.method2236();
        if (this.field788 == 65535) {
            this.field788 = -1;
        }
        this.field782 = arg0.method2236();
        if (this.field782 == 65535) {
            this.field782 = -1;
        }
        this.field832 = arg0.method2236();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field784 = arg0.method2236();
        if (this.field784 == 65535) {
            this.field784 = -1;
        }
        this.field49 = arg0.method2242();
        if (Statics.field37 == this) {
            Statics.field2122 = this.field49;
        }
        this.field32 = arg0.method2234();
        this.field31 = arg0.method2236();
        this.field36 = arg0.method2234() == 1;
        if (client.field271 == 0 && client.field442 >= 2) {
            this.field36 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class170();
        }
        this.field29.method3128(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.o(I)Lcp;")
    public final class100 method13() {
        if (this.field29 == null) {
            return null;
        }
        class40 var1 = this.field804 != -1 && this.field785 == 0 ? Statics.method860(this.field804) : null;
        class40 var2 = this.field824 == -1 || this.field45 || this.field824 == this.field777 && var1 != null ? null : Statics.method860(this.field824);
        class100 var3 = this.field29.method3138(var1, this.field805, var2, this.field802);
        if (var3 == null) {
            return null;
        }
        var3.method2080();
        this.field822 = var3.field1392;
        if (!this.field45 && this.field809 != -1 && this.field810 != -1) {
            class100 var4 = class41.method493(this.field809).method793(this.field810);
            if (var4 != null) {
                var4.method2098(0, -this.field813, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field280 >= this.field42) {
                this.field40 = null;
            }
            if (client.field280 >= this.field35 && client.field280 < this.field42) {
                class100 var6 = this.field40;
                var6.method2098(this.field47 - this.field789, this.field38 - this.field34, this.field48 - this.field773);
                if (this.field780 == 512) {
                    var6.method2086();
                    var6.method2086();
                    var6.method2086();
                } else if (this.field780 == 1024) {
                    var6.method2086();
                    var6.method2086();
                } else if (this.field780 == 1536) {
                    var6.method2086();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field780 == 512) {
                    var6.method2086();
                } else if (this.field780 == 1024) {
                    var6.method2086();
                    var6.method2086();
                } else if (this.field780 == 1536) {
                    var6.method2086();
                    var6.method2086();
                    var6.method2086();
                }
                var6.method2098(this.field789 - this.field47, this.field34 - this.field38, this.field773 - this.field48);
            }
        }
        var3.field1745 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method20() {
        return this.field29 != null;
    }
}
