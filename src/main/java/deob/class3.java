package deob;

@ObfuscatedName("y")
public final class class3 extends class34 {

    @ObfuscatedName("y.f")
    public String field46;

    @ObfuscatedName("y.k")
    public class160 field26;

    @ObfuscatedName("y.y")
    public int field27 = -1;

    @ObfuscatedName("y.e")
    public int field45 = -1;

    @ObfuscatedName("y.r")
    public int field25 = 0;

    @ObfuscatedName("y.a")
    public int field30 = 0;

    @ObfuscatedName("y.n")
    public int field31;

    @ObfuscatedName("y.x")
    public int field32 = 0;

    @ObfuscatedName("y.g")
    public int field33 = 0;

    @ObfuscatedName("y.o")
    public int field34;

    @ObfuscatedName("y.p")
    public int field35;

    @ObfuscatedName("y.v")
    public int field36;

    @ObfuscatedName("y.w")
    public class99 field37;

    @ObfuscatedName("y.t")
    public int field47;

    @ObfuscatedName("y.s")
    public int field48;

    @ObfuscatedName("y.b")
    public int field40;

    @ObfuscatedName("y.u")
    public int field43;

    @ObfuscatedName("y.j")
    public boolean field42 = false;

    @ObfuscatedName("y.d")
    public int field38 = 0;

    @ObfuscatedName("y.l")
    public boolean field28 = false;

    @ObfuscatedName("y.f(Ldu;I)V")
    public final void method23(class108 arg0) {
        arg0.field1859 = 0;
        int var2 = arg0.method2158();
        this.field27 = arg0.method2159();
        this.field45 = arg0.method2159();
        int var3 = -1;
        this.field38 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2158();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2158();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2160();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method515(var4[var5] - 512).field1067;
                    if (var8 != 0) {
                        this.field38 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2158();
            if (var11 < 0 || var11 >= Statics.field2507[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field745 = arg0.method2160();
        if (this.field745 == 65535) {
            this.field745 = -1;
        }
        this.field746 = arg0.method2160();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field791 = this.field746;
        this.field748 = arg0.method2160();
        if (this.field748 == 65535) {
            this.field748 = -1;
        }
        this.field797 = arg0.method2160();
        if (this.field797 == 65535) {
            this.field797 = -1;
        }
        this.field750 = arg0.method2160();
        if (this.field750 == 65535) {
            this.field750 = -1;
        }
        this.field794 = arg0.method2160();
        if (this.field794 == 65535) {
            this.field794 = -1;
        }
        this.field752 = arg0.method2160();
        if (this.field752 == 65535) {
            this.field752 = -1;
        }
        this.field46 = arg0.method2275();
        if (Statics.field377 == this) {
            Statics.field3018 = this.field46;
        }
        this.field25 = arg0.method2158();
        this.field30 = arg0.method2160();
        this.field28 = arg0.method2158() == 1;
        if (client.field480 == 0 && client.field419 >= 2) {
            this.field28 = false;
        }
        if (this.field26 == null) {
            this.field26 = new class160();
        }
        this.field26.method2968(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.k(I)Lci;")
    public final class99 method16() {
        if (this.field26 == null) {
            return null;
        }
        class39 var1 = this.field792 != -1 && this.field774 == 0 ? class39.method547(this.field792) : null;
        class39 var2 = this.field778 == -1 || this.field42 || this.field778 == this.field745 && var1 != null ? null : class39.method547(this.field778);
        class99 var3 = this.field26.method2965(var1, this.field759, var2, this.field769);
        if (var3 == null) {
            return null;
        }
        var3.method2024();
        this.field770 = var3.field1365;
        if (!this.field42 && this.field776 != -1 && this.field777 != -1) {
            class99 var4 = class40.method99(this.field776).method783(this.field777);
            if (var4 != null) {
                var4.method2034(0, -this.field781, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field42 && this.field37 != null) {
            if (client.field372 >= this.field33) {
                this.field37 = null;
            }
            if (client.field372 >= this.field32 && client.field372 < this.field33) {
                class99 var6 = this.field37;
                var6.method2034(this.field34 - this.field789, this.field35 - this.field31, this.field36 - this.field754);
                if (this.field790 == 512) {
                    var6.method2030();
                    var6.method2030();
                    var6.method2030();
                } else if (this.field790 == 1024) {
                    var6.method2030();
                    var6.method2030();
                } else if (this.field790 == 1536) {
                    var6.method2030();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field790 == 512) {
                    var6.method2030();
                } else if (this.field790 == 1024) {
                    var6.method2030();
                    var6.method2030();
                } else if (this.field790 == 1536) {
                    var6.method2030();
                    var6.method2030();
                    var6.method2030();
                }
                var6.method2034(this.field789 - this.field34, this.field31 - this.field35, this.field754 - this.field36);
            }
        }
        var3.field1732 = true;
        return var3;
    }

    @ObfuscatedName("y.y(I)Z")
    public final boolean method17() {
        return this.field26 != null;
    }
}
