package deob;

@ObfuscatedName("k")
public final class class74 extends class179 {

    @ObfuscatedName("k.f")
    public int field854 = 0;

    @ObfuscatedName("k.g")
    public int field858;

    @ObfuscatedName("k.d")
    public int field852 = 0;

    @ObfuscatedName("k.e")
    public int field871;

    @ObfuscatedName("k.b")
    public String field855;

    @ObfuscatedName("k.n")
    public int field865 = 0;

    @ObfuscatedName("k.o")
    public class27 field859;

    @ObfuscatedName("k.l")
    public int field853;

    @ObfuscatedName("k.j")
    public int field857;

    @ObfuscatedName("k.k")
    public int field864 = -1;

    @ObfuscatedName("k.h")
    public class13 field863;

    @ObfuscatedName("k.i")
    public int field856;

    @ObfuscatedName("k.w")
    public int field850 = -1;

    @ObfuscatedName("k.t")
    public int field851 = 0;

    @ObfuscatedName("k.s")
    public int field862 = 0;

    @ObfuscatedName("k.r")
    public boolean field872 = false;

    @ObfuscatedName("k.q")
    public int field861;

    @ObfuscatedName("k.z")
    public int field860;

    @ObfuscatedName("k.x")
    public int field870;

    @ObfuscatedName("k.h(I)Ldu;")
    public final class27 method1087() {
        if (this.field863 == null) {
            return null;
        }
        class173 var1 = this.field2692 != -1 && this.field2695 == 0 ? class173.method3098(this.field2692) : null;
        class173 var2 = this.field2689 == -1 || this.field872 || this.field2689 == this.field2668 && var1 != null ? null : class173.method3098(this.field2689);
        class27 var3 = this.field863.method174(var1, this.field2693, var2, this.field2690);
        if (var3 == null) {
            return null;
        }
        var3.method389();
        this.field2710 = var3.field2207;
        if (!this.field872 && this.field2697 != -1 && this.field2698 != -1) {
            class27 var4 = class184.method1375(this.field2697).method3339(this.field2698);
            if (var4 != null) {
                var4.method406(0, -this.field2709, 0);
                class27[] var5 = new class27[] { var3, var4 };
                var3 = new class27(var5, 2);
            }
        }
        if (!this.field872 && this.field859 != null) {
            if (client.field1541 >= this.field862) {
                this.field859 = null;
            }
            if (client.field1541 >= this.field854 && client.field1541 < this.field862) {
                class27 var6 = this.field859;
                var6.method406(this.field857 - this.field2707, this.field870 - this.field853, this.field858 - this.field2664);
                if (this.field2702 == 512) {
                    var6.method395();
                    var6.method395();
                    var6.method395();
                } else if (this.field2702 == 1024) {
                    var6.method395();
                    var6.method395();
                } else if (this.field2702 == 1536) {
                    var6.method395();
                }
                class27[] var7 = new class27[] { var3, var6 };
                var3 = new class27(var7, 2);
                if (this.field2702 == 512) {
                    var6.method395();
                } else if (this.field2702 == 1024) {
                    var6.method395();
                    var6.method395();
                } else if (this.field2702 == 1536) {
                    var6.method395();
                    var6.method395();
                    var6.method395();
                }
                var6.method406(this.field2707 - this.field857, this.field853 - this.field870, this.field2664 - this.field858);
            }
        }
        var3.field291 = true;
        return var3;
    }

    @ObfuscatedName("k.k(I)Z")
    public final boolean method1095() {
        return this.field863 != null;
    }

    @ObfuscatedName("k.b(Ldp;B)V")
    public final void method1168(class50 arg0) {
        arg0.field540 = 0;
        int var2 = arg0.method726();
        this.field864 = arg0.method681();
        this.field850 = arg0.method681();
        int var3 = -1;
        this.field865 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method726();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method726();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method720();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class176.method3351(var4[var5] - 512).field2647;
                    if (var8 != 0) {
                        this.field865 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method726();
            if (var11 < 0 || var11 >= Statics.field752[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field2668 = arg0.method720();
        if (this.field2668 == 65535) {
            this.field2668 = -1;
        }
        this.field2669 = arg0.method720();
        if (this.field2669 == 65535) {
            this.field2669 = -1;
        }
        this.field2670 = this.field2669;
        this.field2678 = arg0.method720();
        if (this.field2678 == 65535) {
            this.field2678 = -1;
        }
        this.field2672 = arg0.method720();
        if (this.field2672 == 65535) {
            this.field2672 = -1;
        }
        this.field2673 = arg0.method720();
        if (this.field2673 == 65535) {
            this.field2673 = -1;
        }
        this.field2688 = arg0.method720();
        if (this.field2688 == 65535) {
            this.field2688 = -1;
        }
        this.field2675 = arg0.method720();
        if (this.field2675 == 65535) {
            this.field2675 = -1;
        }
        this.field855 = arg0.method688();
        if (Statics.field1320 == this) {
            Statics.field2102 = this.field855;
        }
        this.field851 = arg0.method726();
        this.field852 = arg0.method720();
        if (this.field863 == null) {
            this.field863 = new class13();
        }
        this.field863.method182(var4, var9, var2 == 1, var3);
    }
}
