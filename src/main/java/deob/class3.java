package deob;

@ObfuscatedName("k")
public final class class3 extends class34 {

    @ObfuscatedName("k.e")
    public String field48;

    @ObfuscatedName("k.v")
    public class160 field36;

    @ObfuscatedName("k.k")
    public int field35 = -1;

    @ObfuscatedName("k.g")
    public int field45 = -1;

    @ObfuscatedName("k.q")
    public int field37 = 0;

    @ObfuscatedName("k.l")
    public int field38 = 0;

    @ObfuscatedName("k.a")
    public int field39;

    @ObfuscatedName("k.b")
    public int field40 = 0;

    @ObfuscatedName("k.z")
    public int field34 = 0;

    @ObfuscatedName("k.w")
    public int field42;

    @ObfuscatedName("k.j")
    public int field41;

    @ObfuscatedName("k.p")
    public int field43;

    @ObfuscatedName("k.n")
    public class99 field44;

    @ObfuscatedName("k.r")
    public int field46;

    @ObfuscatedName("k.s")
    public int field47;

    @ObfuscatedName("k.f")
    public int field33;

    @ObfuscatedName("k.c")
    public int field49;

    @ObfuscatedName("k.t")
    public boolean field50 = false;

    @ObfuscatedName("k.i")
    public int field51 = 0;

    @ObfuscatedName("k.u")
    public boolean field52 = false;

    @ObfuscatedName("k.e(Ldd;I)V")
    public final void method13(class108 arg0) {
        arg0.field1841 = 0;
        int var2 = arg0.method2122();
        this.field35 = arg0.method2190();
        this.field45 = arg0.method2190();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2122();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2122();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2124();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method476(var4[var5] - 512).field1071;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2122();
            if (var11 < 0 || var11 >= Statics.field1889[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field793 = arg0.method2124();
        if (this.field793 == 65535) {
            this.field793 = -1;
        }
        this.field747 = arg0.method2124();
        if (this.field747 == 65535) {
            this.field747 = -1;
        }
        this.field741 = this.field747;
        this.field792 = arg0.method2124();
        if (this.field792 == 65535) {
            this.field792 = -1;
        }
        this.field743 = arg0.method2124();
        if (this.field743 == 65535) {
            this.field743 = -1;
        }
        this.field787 = arg0.method2124();
        if (this.field787 == 65535) {
            this.field787 = -1;
        }
        this.field745 = arg0.method2124();
        if (this.field745 == 65535) {
            this.field745 = -1;
        }
        this.field746 = arg0.method2124();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field48 = arg0.method2130();
        if (Statics.field695 == this) {
            Statics.field2082 = this.field48;
        }
        this.field37 = arg0.method2122();
        this.field38 = arg0.method2124();
        this.field52 = arg0.method2122() == 1;
        if (client.field423 == 0 && client.field415 >= 2) {
            this.field52 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class160();
        }
        this.field36.method2937(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.v(B)Lcu;")
    public final class99 method14() {
        if (this.field36 == null) {
            return null;
        }
        class39 var1 = this.field736 != -1 && this.field768 == 0 ? class39.method2315(this.field736) : null;
        class39 var2 = this.field782 == -1 || this.field50 || this.field793 == this.field782 && var1 != null ? null : class39.method2315(this.field782);
        class99 var3 = this.field36.method2908(var1, this.field766, var2, this.field750);
        if (var3 == null) {
            return null;
        }
        var3.method1967();
        this.field756 = var3.field1369;
        if (!this.field50 && this.field770 != -1 && this.field771 != -1) {
            class99 var4 = class40.method2885(this.field770).method740(this.field771);
            if (var4 != null) {
                var4.method1982(0, -this.field767, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field50 && this.field44 != null) {
            if (client.field418 >= this.field34) {
                this.field44 = null;
            }
            if (client.field418 >= this.field40 && client.field418 < this.field34) {
                class99 var6 = this.field44;
                var6.method1982(this.field42 - this.field763, this.field41 - this.field39, this.field43 - this.field735);
                if (this.field784 == 512) {
                    var6.method1985();
                    var6.method1985();
                    var6.method1985();
                } else if (this.field784 == 1024) {
                    var6.method1985();
                    var6.method1985();
                } else if (this.field784 == 1536) {
                    var6.method1985();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field784 == 512) {
                    var6.method1985();
                } else if (this.field784 == 1024) {
                    var6.method1985();
                    var6.method1985();
                } else if (this.field784 == 1536) {
                    var6.method1985();
                    var6.method1985();
                    var6.method1985();
                }
                var6.method1982(this.field763 - this.field42, this.field39 - this.field41, this.field735 - this.field43);
            }
        }
        var3.field1731 = true;
        return var3;
    }

    @ObfuscatedName("k.k(I)Z")
    public final boolean method25() {
        return this.field36 != null;
    }
}
