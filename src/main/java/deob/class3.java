package deob;

@ObfuscatedName("x")
public final class class3 extends class33 {

    @ObfuscatedName("x.b")
    public String field46;

    @ObfuscatedName("x.u")
    public class157 field34;

    @ObfuscatedName("x.x")
    public int field51 = -1;

    @ObfuscatedName("x.j")
    public int field37 = -1;

    @ObfuscatedName("x.o")
    public int field38 = 0;

    @ObfuscatedName("x.n")
    public int field39 = 0;

    @ObfuscatedName("x.y")
    public int field40;

    @ObfuscatedName("x.f")
    public int field47 = 0;

    @ObfuscatedName("x.p")
    public int field42 = 0;

    @ObfuscatedName("x.l")
    public int field43;

    @ObfuscatedName("x.k")
    public int field44;

    @ObfuscatedName("x.q")
    public int field45;

    @ObfuscatedName("x.e")
    public class98 field49;

    @ObfuscatedName("x.t")
    public int field36;

    @ObfuscatedName("x.g")
    public int field48;

    @ObfuscatedName("x.c")
    public int field41;

    @ObfuscatedName("x.m")
    public int field35;

    @ObfuscatedName("x.i")
    public boolean field52 = false;

    @ObfuscatedName("x.h")
    public int field50 = 0;

    @ObfuscatedName("x.b(Ldh;I)V")
    public final void method11(class107 arg0) {
        arg0.field1845 = 0;
        int var2 = arg0.method2134();
        this.field51 = arg0.method2135();
        this.field37 = arg0.method2135();
        int var3 = -1;
        this.field50 = 0;
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
                    int var8 = class45.method2057(var4[var5] - 512).field1031;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2134();
            if (var11 < 0 || var11 >= Statics.field2673[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field730 = arg0.method2136();
        if (this.field730 == 65535) {
            this.field730 = -1;
        }
        this.field731 = arg0.method2136();
        if (this.field731 == 65535) {
            this.field731 = -1;
        }
        this.field732 = this.field731;
        this.field766 = arg0.method2136();
        if (this.field766 == 65535) {
            this.field766 = -1;
        }
        this.field741 = arg0.method2136();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field735 = arg0.method2136();
        if (this.field735 == 65535) {
            this.field735 = -1;
        }
        this.field772 = arg0.method2136();
        if (this.field772 == 65535) {
            this.field772 = -1;
        }
        this.field734 = arg0.method2136();
        if (this.field734 == 65535) {
            this.field734 = -1;
        }
        this.field46 = arg0.method2339();
        if (Statics.field578 == this) {
            Statics.field2077 = this.field46;
        }
        this.field38 = arg0.method2134();
        this.field39 = arg0.method2136();
        if (this.field34 == null) {
            this.field34 = new class157();
        }
        this.field34.method2884(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("x.u(I)Lcu;")
    public final class98 method19() {
        if (this.field34 == null) {
            return null;
        }
        class38 var1 = this.field756 != -1 && this.field781 == 0 ? Statics.method484(this.field756) : null;
        class38 var2 = this.field759 == -1 || this.field52 || this.field759 == this.field730 && var1 != null ? null : Statics.method484(this.field759);
        class98 var3 = this.field34.method2907(var1, this.field757, var2, this.field754);
        if (var3 == null) {
            return null;
        }
        var3.method1989();
        this.field774 = var3.field1346;
        if (!this.field52 && this.field761 != -1 && this.field750 != -1) {
            class98 var4 = class39.method1(this.field761).method733(this.field750);
            if (var4 != null) {
                var4.method1999(0, -this.field765, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field52 && this.field49 != null) {
            if (client.field376 >= this.field42) {
                this.field49 = null;
            }
            if (client.field376 >= this.field47 && client.field376 < this.field42) {
                class98 var6 = this.field49;
                var6.method1999(this.field43 - this.field762, this.field44 - this.field40, this.field45 - this.field726);
                if (this.field775 == 512) {
                    var6.method2048();
                    var6.method2048();
                    var6.method2048();
                } else if (this.field775 == 1024) {
                    var6.method2048();
                    var6.method2048();
                } else if (this.field775 == 1536) {
                    var6.method2048();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field775 == 512) {
                    var6.method2048();
                } else if (this.field775 == 1024) {
                    var6.method2048();
                    var6.method2048();
                } else if (this.field775 == 1536) {
                    var6.method2048();
                    var6.method2048();
                    var6.method2048();
                }
                var6.method1999(this.field762 - this.field43, this.field40 - this.field44, this.field726 - this.field45);
            }
        }
        var3.field1738 = true;
        return var3;
    }

    @ObfuscatedName("x.x(I)Z")
    public final boolean method12() {
        return this.field34 != null;
    }
}
