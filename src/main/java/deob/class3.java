package deob;

@ObfuscatedName("i")
public final class class3 extends class34 {

    @ObfuscatedName("i.a")
    public String field37;

    @ObfuscatedName("i.v")
    public class162 field42;

    @ObfuscatedName("i.i")
    public int field32 = -1;

    @ObfuscatedName("i.b")
    public int field33 = -1;

    @ObfuscatedName("i.l")
    public int field34 = 0;

    @ObfuscatedName("i.m")
    public int field44 = 0;

    @ObfuscatedName("i.w")
    public int field36;

    @ObfuscatedName("i.e")
    public int field52 = 0;

    @ObfuscatedName("i.n")
    public int field38 = 0;

    @ObfuscatedName("i.s")
    public int field39;

    @ObfuscatedName("i.k")
    public int field40;

    @ObfuscatedName("i.f")
    public int field41;

    @ObfuscatedName("i.d")
    public class99 field49;

    @ObfuscatedName("i.x")
    public int field43;

    @ObfuscatedName("i.o")
    public int field51;

    @ObfuscatedName("i.q")
    public int field45;

    @ObfuscatedName("i.t")
    public int field46;

    @ObfuscatedName("i.h")
    public boolean field30 = false;

    @ObfuscatedName("i.u")
    public int field48 = 0;

    @ObfuscatedName("i.j")
    public boolean field31 = false;

    @ObfuscatedName("i.a(Ldi;I)V")
    public final void method13(class110 arg0) {
        arg0.field1861 = 0;
        int var2 = arg0.method2199();
        this.field32 = arg0.method2132();
        this.field33 = arg0.method2132();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2199();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2199();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2282();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method740(var4[var5] - 512).field1058;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2199();
            if (var11 < 0 || var11 >= Statics.field2697[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field740 = arg0.method2282();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field741 = arg0.method2282();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field742 = this.field741;
        this.field753 = arg0.method2282();
        if (this.field753 == 65535) {
            this.field753 = -1;
        }
        this.field744 = arg0.method2282();
        if (this.field744 == 65535) {
            this.field744 = -1;
        }
        this.field745 = arg0.method2282();
        if (this.field745 == 65535) {
            this.field745 = -1;
        }
        this.field789 = arg0.method2282();
        if (this.field789 == 65535) {
            this.field789 = -1;
        }
        this.field747 = arg0.method2282();
        if (this.field747 == 65535) {
            this.field747 = -1;
        }
        this.field37 = arg0.method2139();
        if (Statics.field1358 == this) {
            Statics.field2103 = this.field37;
        }
        this.field34 = arg0.method2199();
        this.field44 = arg0.method2282();
        this.field31 = arg0.method2199() == 1;
        if (client.field315 == 0 && client.field337 >= 2) {
            this.field31 = false;
        }
        if (this.field42 == null) {
            this.field42 = new class162();
        }
        this.field42.method2953(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.v(I)Lcl;")
    public final class99 method24() {
        if (this.field42 == null) {
            return null;
        }
        class39 var1 = this.field766 != -1 && this.field769 == 0 ? Statics.method97(this.field766) : null;
        class39 var2 = this.field763 == -1 || this.field30 || this.field763 == this.field740 && var1 != null ? null : Statics.method97(this.field763);
        class99 var3 = this.field42.method2935(var1, this.field767, var2, this.field737);
        if (var3 == null) {
            return null;
        }
        var3.method1980();
        this.field784 = var3.field1356;
        if (!this.field30 && this.field794 != -1 && this.field772 != -1) {
            class99 var4 = class40.method1765(this.field794).method768(this.field772);
            if (var4 != null) {
                var4.method2008(0, -this.field775, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field30 && this.field49 != null) {
            if (client.field266 >= this.field38) {
                this.field49 = null;
            }
            if (client.field266 >= this.field52 && client.field266 < this.field38) {
                class99 var6 = this.field49;
                var6.method2008(this.field39 - this.field793, this.field40 - this.field36, this.field41 - this.field736);
                if (this.field785 == 512) {
                    var6.method1985();
                    var6.method1985();
                    var6.method1985();
                } else if (this.field785 == 1024) {
                    var6.method1985();
                    var6.method1985();
                } else if (this.field785 == 1536) {
                    var6.method1985();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field785 == 512) {
                    var6.method1985();
                } else if (this.field785 == 1024) {
                    var6.method1985();
                    var6.method1985();
                } else if (this.field785 == 1536) {
                    var6.method1985();
                    var6.method1985();
                    var6.method1985();
                }
                var6.method2008(this.field793 - this.field39, this.field36 - this.field40, this.field736 - this.field41);
            }
        }
        var3.field1722 = true;
        return var3;
    }

    @ObfuscatedName("i.i(I)Z")
    public final boolean method15() {
        return this.field42 != null;
    }
}
