package deob;

@ObfuscatedName("u")
public final class class3 extends class27 {

    @ObfuscatedName("u.a")
    public String field33;

    @ObfuscatedName("u.r")
    public class163 field31;

    @ObfuscatedName("u.u")
    public int field38 = -1;

    @ObfuscatedName("u.t")
    public int field32 = -1;

    @ObfuscatedName("u.k")
    public int field30 = 0;

    @ObfuscatedName("u.x")
    public int field35 = 0;

    @ObfuscatedName("u.v")
    public int field36;

    @ObfuscatedName("u.g")
    public int field37 = 0;

    @ObfuscatedName("u.n")
    public int field39 = 0;

    @ObfuscatedName("u.q")
    public int field34;

    @ObfuscatedName("u.i")
    public int field40;

    @ObfuscatedName("u.p")
    public int field41;

    @ObfuscatedName("u.e")
    public class112 field42;

    @ObfuscatedName("u.o")
    public int field47;

    @ObfuscatedName("u.j")
    public int field44;

    @ObfuscatedName("u.s")
    public int field45;

    @ObfuscatedName("u.b")
    public int field46;

    @ObfuscatedName("u.c")
    public boolean field43 = false;

    @ObfuscatedName("u.m")
    public int field48 = 0;

    @ObfuscatedName("u.a(Ldf;I)V")
    public final void method17(class126 arg0) {
        arg0.field2016 = 0;
        int var2 = arg0.method2481();
        this.field38 = arg0.method2379();
        this.field32 = arg0.method2379();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2481();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2481();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2373();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method1799(var4[var5] - 512).field976;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2481();
            if (var11 < 0 || var11 >= Statics.field2554[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field453 = arg0.method2373();
        if (this.field453 == 65535) {
            this.field453 = -1;
        }
        this.field401 = arg0.method2373();
        if (this.field401 == 65535) {
            this.field401 = -1;
        }
        this.field402 = this.field401;
        this.field403 = arg0.method2373();
        if (this.field403 == 65535) {
            this.field403 = -1;
        }
        this.field429 = arg0.method2373();
        if (this.field429 == 65535) {
            this.field429 = -1;
        }
        this.field413 = arg0.method2373();
        if (this.field413 == 65535) {
            this.field413 = -1;
        }
        this.field406 = arg0.method2373();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field407 = arg0.method2373();
        if (this.field407 == 65535) {
            this.field407 = -1;
        }
        this.field33 = arg0.method2386();
        if (Statics.field164 == this) {
            Statics.field1395 = this.field33;
        }
        this.field30 = arg0.method2481();
        this.field35 = arg0.method2373();
        if (this.field31 == null) {
            this.field31 = new class163();
        }
        this.field31.method3126(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("u.r(I)Ldw;")
    public final class112 method18() {
        if (this.field31 == null) {
            return null;
        }
        class34 var1 = this.field424 != -1 && this.field427 == 0 ? class34.method30(this.field424) : null;
        class34 var2 = this.field421 == -1 || this.field43 || this.field453 == this.field421 && var1 != null ? null : class34.method30(this.field421);
        class112 var3 = this.field31.method3132(var1, this.field425, var2, this.field436);
        if (var3 == null) {
            return null;
        }
        var3.method2179();
        this.field452 = var3.field1518;
        if (!this.field43 && this.field398 != -1 && this.field430 != -1) {
            class112 var4 = class35.method651(this.field398).method686(this.field430);
            if (var4 != null) {
                var4.method2189(0, -this.field433, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field43 && this.field42 != null) {
            if (client.field465 >= this.field39) {
                this.field42 = null;
            }
            if (client.field465 >= this.field37 && client.field465 < this.field39) {
                class112 var6 = this.field42;
                var6.method2189(this.field34 - this.field400, this.field40 - this.field36, this.field41 - this.field404);
                if (this.field395 == 512) {
                    var6.method2208();
                    var6.method2208();
                    var6.method2208();
                } else if (this.field395 == 1024) {
                    var6.method2208();
                    var6.method2208();
                } else if (this.field395 == 1536) {
                    var6.method2208();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field395 == 512) {
                    var6.method2208();
                } else if (this.field395 == 1024) {
                    var6.method2208();
                    var6.method2208();
                } else if (this.field395 == 1536) {
                    var6.method2208();
                    var6.method2208();
                    var6.method2208();
                }
                var6.method2189(this.field400 - this.field34, this.field36 - this.field40, this.field404 - this.field41);
            }
        }
        var3.field1853 = true;
        return var3;
    }

    @ObfuscatedName("u.u(B)Z")
    public final boolean method19() {
        return this.field31 != null;
    }
}
