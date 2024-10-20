package deob;

@ObfuscatedName("k")
public final class class3 extends class33 {

    @ObfuscatedName("k.n")
    public String field53;

    @ObfuscatedName("k.x")
    public class158 field58;

    @ObfuscatedName("k.k")
    public int field55 = -1;

    @ObfuscatedName("k.i")
    public int field40 = -1;

    @ObfuscatedName("k.d")
    public int field44 = 0;

    @ObfuscatedName("k.q")
    public int field42 = 0;

    @ObfuscatedName("k.m")
    public int field47;

    @ObfuscatedName("k.a")
    public int field38 = 0;

    @ObfuscatedName("k.w")
    public int field45 = 0;

    @ObfuscatedName("k.e")
    public int field46;

    @ObfuscatedName("k.o")
    public int field39;

    @ObfuscatedName("k.v")
    public int field48;

    @ObfuscatedName("k.z")
    public class98 field49;

    @ObfuscatedName("k.j")
    public int field50;

    @ObfuscatedName("k.r")
    public int field51;

    @ObfuscatedName("k.c")
    public int field52;

    @ObfuscatedName("k.u")
    public int field43;

    @ObfuscatedName("k.h")
    public boolean field54 = false;

    @ObfuscatedName("k.t")
    public int field37 = 0;

    @ObfuscatedName("k.f")
    public boolean field56 = false;

    @ObfuscatedName("k.n(Ldw;B)V")
    public final void method12(class107 arg0) {
        arg0.field1826 = 0;
        int var2 = arg0.method2148();
        this.field55 = arg0.method2175();
        this.field40 = arg0.method2175();
        int var3 = -1;
        this.field37 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2148();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2148();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2140();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method1982(var4[var5] - 512).field1051;
                    if (var8 != 0) {
                        this.field37 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2148();
            if (var11 < 0 || var11 >= Statics.field2653[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field736 = arg0.method2140();
        if (this.field736 == 65535) {
            this.field736 = -1;
        }
        this.field788 = arg0.method2140();
        if (this.field788 == 65535) {
            this.field788 = -1;
        }
        this.field738 = this.field788;
        this.field768 = arg0.method2140();
        if (this.field768 == 65535) {
            this.field768 = -1;
        }
        this.field740 = arg0.method2140();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field741 = arg0.method2140();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field742 = arg0.method2140();
        if (this.field742 == 65535) {
            this.field742 = -1;
        }
        this.field743 = arg0.method2140();
        if (this.field743 == 65535) {
            this.field743 = -1;
        }
        this.field53 = arg0.method2182();
        if (Statics.field1751 == this) {
            Statics.field2051 = this.field53;
        }
        this.field44 = arg0.method2148();
        this.field42 = arg0.method2140();
        this.field56 = arg0.method2148() == 1;
        if (client.field259 == 0 && client.field427 >= 2) {
            this.field56 = false;
        }
        if (this.field58 == null) {
            this.field58 = new class158();
        }
        this.field58.method2867(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.x(S)Lcy;")
    public final class98 method18() {
        if (this.field58 == null) {
            return null;
        }
        class38 var1 = this.field762 != -1 && this.field747 == 0 ? class38.method658(this.field762) : null;
        class38 var2 = this.field759 == -1 || this.field54 || this.field759 == this.field736 && var1 != null ? null : class38.method658(this.field759);
        class98 var3 = this.field58.method2873(var1, this.field763, var2, this.field752);
        if (var3 == null) {
            return null;
        }
        var3.method1989();
        this.field739 = var3.field1339;
        if (!this.field54 && this.field765 != -1 && this.field756 != -1) {
            class98 var4 = class39.method138(this.field765).method751(this.field756);
            if (var4 != null) {
                var4.method2000(0, -this.field771, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field54 && this.field49 != null) {
            if (client.field440 >= this.field45) {
                this.field49 = null;
            }
            if (client.field440 >= this.field38 && client.field440 < this.field45) {
                class98 var6 = this.field49;
                var6.method2000(this.field46 - this.field772, this.field39 - this.field47, this.field48 - this.field732);
                if (this.field781 == 512) {
                    var6.method1996();
                    var6.method1996();
                    var6.method1996();
                } else if (this.field781 == 1024) {
                    var6.method1996();
                    var6.method1996();
                } else if (this.field781 == 1536) {
                    var6.method1996();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field781 == 512) {
                    var6.method1996();
                } else if (this.field781 == 1024) {
                    var6.method1996();
                    var6.method1996();
                } else if (this.field781 == 1536) {
                    var6.method1996();
                    var6.method1996();
                    var6.method1996();
                }
                var6.method2000(this.field772 - this.field46, this.field47 - this.field39, this.field732 - this.field48);
            }
        }
        var3.field1705 = true;
        return var3;
    }

    @ObfuscatedName("k.k(S)Z")
    public final boolean method14() {
        return this.field58 != null;
    }
}
