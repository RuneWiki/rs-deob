package deob;

@ObfuscatedName("b")
public final class class61 extends class164 {

    @ObfuscatedName("b.f")
    public int field919 = 0;

    @ObfuscatedName("b.g")
    public int field910;

    @ObfuscatedName("b.d")
    public int field908 = 0;

    @ObfuscatedName("b.e")
    public int field915;

    @ObfuscatedName("b.b")
    public int field903 = -1;

    @ObfuscatedName("b.c")
    public class67 field911;

    @ObfuscatedName("b.a")
    public int field912;

    @ObfuscatedName("b.o")
    public int field902;

    @ObfuscatedName("b.m")
    public int field905 = 0;

    @ObfuscatedName("b.j")
    public int field909 = 0;

    @ObfuscatedName("b.k")
    public int field906;

    @ObfuscatedName("b.i")
    public int field917 = -1;

    @ObfuscatedName("b.v")
    public String field918;

    @ObfuscatedName("b.u")
    public class43 field913;

    @ObfuscatedName("b.s")
    public boolean field920 = false;

    @ObfuscatedName("b.p")
    public int field916;

    @ObfuscatedName("b.z")
    public int field904 = 0;

    @ObfuscatedName("b.y")
    public int field901;

    @ObfuscatedName("b.x")
    public int field907;

    @ObfuscatedName("b.v(Ldv;I)V")
    public final void method935(class28 arg0) {
        arg0.field303 = 0;
        int var2 = arg0.method450();
        this.field903 = arg0.method313();
        this.field917 = arg0.method313();
        int var3 = -1;
        this.field919 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method450();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method450();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method349();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class172.method934(var4[var5] - 512).field2645;
                    if (var8 != 0) {
                        this.field919 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method450();
            if (var11 < 0 || var11 >= Statics.field987[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field2459 = arg0.method349();
        if (this.field2459 == 65535) {
            this.field2459 = -1;
        }
        this.field2460 = arg0.method349();
        if (this.field2460 == 65535) {
            this.field2460 = -1;
        }
        this.field2489 = this.field2460;
        this.field2462 = arg0.method349();
        if (this.field2462 == 65535) {
            this.field2462 = -1;
        }
        this.field2463 = arg0.method349();
        if (this.field2463 == 65535) {
            this.field2463 = -1;
        }
        this.field2464 = arg0.method349();
        if (this.field2464 == 65535) {
            this.field2464 = -1;
        }
        this.field2516 = arg0.method349();
        if (this.field2516 == 65535) {
            this.field2516 = -1;
        }
        this.field2466 = arg0.method349();
        if (this.field2466 == 65535) {
            this.field2466 = -1;
        }
        this.field918 = arg0.method451();
        if (Statics.field1393 == this) {
            Statics.field2035 = this.field918;
        }
        this.field905 = arg0.method450();
        this.field904 = arg0.method349();
        if (this.field911 == null) {
            this.field911 = new class67();
        }
        this.field911.method1037(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("b.c(I)Ldk;")
    public final class43 method908() {
        if (this.field911 == null) {
            return null;
        }
        class165 var1 = this.field2483 != -1 && this.field2470 == 0 ? class165.method3233(this.field2483) : null;
        class165 var2 = this.field2480 == -1 || this.field920 || this.field2480 == this.field2459 && var1 != null ? null : class165.method3233(this.field2480);
        class43 var3 = this.field911.method1067(var1, this.field2477, var2, this.field2481);
        if (var3 == null) {
            return null;
        }
        var3.method778();
        this.field2501 = var3.field1455;
        if (!this.field920 && this.field2488 != -1 && this.field2475 != -1) {
            class43 var4 = class173.method1223(this.field2488).method3134(this.field2475);
            if (var4 != null) {
                var4.method786(0, -this.field2471, 0);
                class43[] var5 = new class43[] { var3, var4 };
                var3 = new class43(var5, 2);
            }
        }
        if (!this.field920 && this.field913 != null) {
            if (client.field1468 >= this.field909) {
                this.field913 = null;
            }
            if (client.field1468 >= this.field908 && client.field1468 < this.field909) {
                class43 var6 = this.field913;
                var6.method786(this.field910 - this.field2461, this.field901 - this.field907, this.field912 - this.field2500);
                if (this.field2502 == 512) {
                    var6.method782();
                    var6.method782();
                    var6.method782();
                } else if (this.field2502 == 1024) {
                    var6.method782();
                    var6.method782();
                } else if (this.field2502 == 1536) {
                    var6.method782();
                }
                class43[] var7 = new class43[] { var3, var6 };
                var3 = new class43(var7, 2);
                if (this.field2502 == 512) {
                    var6.method782();
                } else if (this.field2502 == 1024) {
                    var6.method782();
                    var6.method782();
                } else if (this.field2502 == 1536) {
                    var6.method782();
                    var6.method782();
                    var6.method782();
                }
                var6.method786(this.field2461 - this.field910, this.field907 - this.field901, this.field2500 - this.field912);
            }
        }
        var3.field489 = true;
        return var3;
    }

    @ObfuscatedName("b.b(I)Z")
    public final boolean method944() {
        return this.field911 != null;
    }
}
