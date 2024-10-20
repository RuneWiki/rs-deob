package deob;

@ObfuscatedName("f")
public final class class3 extends class34 {

    @ObfuscatedName("f.v")
    public String field40;

    @ObfuscatedName("f.t")
    public class162 field39;

    @ObfuscatedName("f.f")
    public int field52 = -1;

    @ObfuscatedName("f.j")
    public int field38 = -1;

    @ObfuscatedName("f.l")
    public int field46 = 0;

    @ObfuscatedName("f.g")
    public int field53 = 0;

    @ObfuscatedName("f.k")
    public int field41;

    @ObfuscatedName("f.p")
    public int field42 = 0;

    @ObfuscatedName("f.y")
    public int field43 = 0;

    @ObfuscatedName("f.m")
    public int field44;

    @ObfuscatedName("f.o")
    public int field45;

    @ObfuscatedName("f.c")
    public int field37;

    @ObfuscatedName("f.r")
    public class99 field47;

    @ObfuscatedName("f.s")
    public int field48;

    @ObfuscatedName("f.n")
    public int field49;

    @ObfuscatedName("f.q")
    public int field50;

    @ObfuscatedName("f.e")
    public int field51;

    @ObfuscatedName("f.d")
    public boolean field36 = false;

    @ObfuscatedName("f.b")
    public int field35 = 0;

    @ObfuscatedName("f.a")
    public boolean field54 = false;

    @ObfuscatedName("f.v(Ldp;I)V")
    public final void method10(class110 arg0) {
        arg0.field1847 = 0;
        int var2 = arg0.method2257();
        this.field52 = arg0.method2162();
        this.field38 = arg0.method2162();
        int var3 = -1;
        this.field35 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2257();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2257();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2194();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method712(var4[var5] - 512).field1051;
                    if (var8 != 0) {
                        this.field35 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2257();
            if (var11 < 0 || var11 >= Statics.field2700[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field772 = arg0.method2194();
        if (this.field772 == 65535) {
            this.field772 = -1;
        }
        this.field739 = arg0.method2194();
        if (this.field739 == 65535) {
            this.field739 = -1;
        }
        this.field740 = this.field739;
        this.field741 = arg0.method2194();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field742 = arg0.method2194();
        if (this.field742 == 65535) {
            this.field742 = -1;
        }
        this.field743 = arg0.method2194();
        if (this.field743 == 65535) {
            this.field743 = -1;
        }
        this.field780 = arg0.method2194();
        if (this.field780 == 65535) {
            this.field780 = -1;
        }
        this.field745 = arg0.method2194();
        if (this.field745 == 65535) {
            this.field745 = -1;
        }
        this.field40 = arg0.method2159();
        if (Statics.field1508 == this) {
            Statics.field2085 = this.field40;
        }
        this.field46 = arg0.method2257();
        this.field53 = arg0.method2194();
        this.field54 = arg0.method2257() == 1;
        if (client.field249 == 0 && client.field416 >= 2) {
            this.field54 = false;
        }
        if (this.field39 == null) {
            this.field39 = new class162();
        }
        this.field39.method2991(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.t(I)Lcy;")
    public final class99 method11() {
        if (this.field39 == null) {
            return null;
        }
        class39 var1 = this.field764 != -1 && this.field736 == 0 ? class39.method682(this.field764) : null;
        class39 var2 = this.field734 == -1 || this.field36 || this.field772 == this.field734 && var1 != null ? null : class39.method682(this.field734);
        class99 var3 = this.field39.method2997(var1, this.field765, var2, this.field762);
        if (var3 == null) {
            return null;
        }
        var3.method2006();
        this.field782 = var3.field1355;
        if (!this.field36 && this.field769 != -1 && this.field750 != -1) {
            class99 var4 = class40.method2864(this.field769).method754(this.field750);
            if (var4 != null) {
                var4.method2001(0, -this.field787, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field36 && this.field47 != null) {
            if (client.field257 >= this.field43) {
                this.field47 = null;
            }
            if (client.field257 >= this.field42 && client.field257 < this.field43) {
                class99 var6 = this.field47;
                var6.method2001(this.field44 - this.field766, this.field45 - this.field41, this.field37 - this.field759);
                if (this.field783 == 512) {
                    var6.method2018();
                    var6.method2018();
                    var6.method2018();
                } else if (this.field783 == 1024) {
                    var6.method2018();
                    var6.method2018();
                } else if (this.field783 == 1536) {
                    var6.method2018();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field783 == 512) {
                    var6.method2018();
                } else if (this.field783 == 1024) {
                    var6.method2018();
                    var6.method2018();
                } else if (this.field783 == 1536) {
                    var6.method2018();
                    var6.method2018();
                    var6.method2018();
                }
                var6.method2001(this.field766 - this.field44, this.field41 - this.field45, this.field759 - this.field37);
            }
        }
        var3.field1710 = true;
        return var3;
    }

    @ObfuscatedName("f.f(I)Z")
    public final boolean method12() {
        return this.field39 != null;
    }
}
