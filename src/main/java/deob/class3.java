package deob;

@ObfuscatedName("a")
public final class class3 extends class33 {

    @ObfuscatedName("a.z")
    public String field42;

    @ObfuscatedName("a.j")
    public class157 field33;

    @ObfuscatedName("a.a")
    public int field40 = -1;

    @ObfuscatedName("a.y")
    public int field32 = -1;

    @ObfuscatedName("a.i")
    public int field41 = 0;

    @ObfuscatedName("a.b")
    public int field37 = 0;

    @ObfuscatedName("a.s")
    public int field38;

    @ObfuscatedName("a.q")
    public int field39 = 0;

    @ObfuscatedName("a.p")
    public int field36 = 0;

    @ObfuscatedName("a.h")
    public int field45;

    @ObfuscatedName("a.r")
    public int field34;

    @ObfuscatedName("a.o")
    public int field43;

    @ObfuscatedName("a.f")
    public class98 field44;

    @ObfuscatedName("a.u")
    public int field35;

    @ObfuscatedName("a.c")
    public int field46;

    @ObfuscatedName("a.l")
    public int field47;

    @ObfuscatedName("a.w")
    public int field48;

    @ObfuscatedName("a.x")
    public boolean field49 = false;

    @ObfuscatedName("a.t")
    public int field50 = 0;

    @ObfuscatedName("a.z(Ldq;B)V")
    public final void method14(class107 arg0) {
        arg0.field1819 = 0;
        int var2 = arg0.method2122();
        this.field40 = arg0.method2201();
        this.field32 = arg0.method2201();
        int var3 = -1;
        this.field50 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2122();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2122();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2239();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method158(var4[var5] - 512).field1003;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2122();
            if (var11 < 0 || var11 >= Statics.field2128[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field733 = arg0.method2239();
        if (this.field733 == 65535) {
            this.field733 = -1;
        }
        this.field703 = arg0.method2239();
        if (this.field703 == 65535) {
            this.field703 = -1;
        }
        this.field755 = this.field703;
        this.field705 = arg0.method2239();
        if (this.field705 == 65535) {
            this.field705 = -1;
        }
        this.field706 = arg0.method2239();
        if (this.field706 == 65535) {
            this.field706 = -1;
        }
        this.field707 = arg0.method2239();
        if (this.field707 == 65535) {
            this.field707 = -1;
        }
        this.field722 = arg0.method2239();
        if (this.field722 == 65535) {
            this.field722 = -1;
        }
        this.field709 = arg0.method2239();
        if (this.field709 == 65535) {
            this.field709 = -1;
        }
        this.field42 = arg0.method2130();
        if (Statics.field1669 == this) {
            Statics.field2066 = this.field42;
        }
        this.field41 = arg0.method2122();
        this.field37 = arg0.method2239();
        if (this.field33 == null) {
            this.field33 = new class157();
        }
        this.field33.method2914(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.j(B)Lcu;")
    public final class98 method16() {
        if (this.field33 == null) {
            return null;
        }
        class38 var1 = this.field697 != -1 && this.field730 == 0 ? class38.method84(this.field697) : null;
        class38 var2 = this.field724 == -1 || this.field49 || this.field733 == this.field724 && var1 != null ? null : class38.method84(this.field724);
        class98 var3 = this.field33.method2920(var1, this.field702, var2, this.field725);
        if (var3 == null) {
            return null;
        }
        var3.method1981();
        this.field744 = var3.field1328;
        if (!this.field49 && this.field732 != -1 && this.field727 != -1) {
            class98 var4 = class39.method1360(this.field732).method728(this.field727);
            if (var4 != null) {
                var4.method2000(0, -this.field736, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field49 && this.field44 != null) {
            if (client.field386 >= this.field36) {
                this.field44 = null;
            }
            if (client.field386 >= this.field39 && client.field386 < this.field36) {
                class98 var6 = this.field44;
                var6.method2000(this.field45 - this.field700, this.field34 - this.field38, this.field43 - this.field726);
                if (this.field721 == 512) {
                    var6.method2045();
                    var6.method2045();
                    var6.method2045();
                } else if (this.field721 == 1024) {
                    var6.method2045();
                    var6.method2045();
                } else if (this.field721 == 1536) {
                    var6.method2045();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field721 == 512) {
                    var6.method2045();
                } else if (this.field721 == 1024) {
                    var6.method2045();
                    var6.method2045();
                } else if (this.field721 == 1536) {
                    var6.method2045();
                    var6.method2045();
                    var6.method2045();
                }
                var6.method2000(this.field700 - this.field45, this.field38 - this.field34, this.field726 - this.field43);
            }
        }
        var3.field1700 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method17() {
        return this.field33 != null;
    }
}
