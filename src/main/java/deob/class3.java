package deob;

@ObfuscatedName("p")
public final class class3 extends class35 {

    @ObfuscatedName("p.t")
    public String field42;

    @ObfuscatedName("p.b")
    public class170 field28;

    @ObfuscatedName("p.p")
    public int field32 = -1;

    @ObfuscatedName("p.e")
    public int field30 = -1;

    @ObfuscatedName("p.i")
    public int field31 = 0;

    @ObfuscatedName("p.o")
    public int field34 = 0;

    @ObfuscatedName("p.f")
    public int field38;

    @ObfuscatedName("p.d")
    public int field33 = 0;

    @ObfuscatedName("p.j")
    public int field35 = 0;

    @ObfuscatedName("p.x")
    public int field36;

    @ObfuscatedName("p.v")
    public int field37;

    @ObfuscatedName("p.a")
    public int field46;

    @ObfuscatedName("p.l")
    public class100 field39;

    @ObfuscatedName("p.h")
    public int field40;

    @ObfuscatedName("p.c")
    public int field41;

    @ObfuscatedName("p.u")
    public int field29;

    @ObfuscatedName("p.r")
    public int field43;

    @ObfuscatedName("p.k")
    public boolean field44 = false;

    @ObfuscatedName("p.w")
    public int field45 = 0;

    @ObfuscatedName("p.q")
    public boolean field27 = false;

    @ObfuscatedName("p.t(Ldc;B)V")
    public final void method13(class111 arg0) {
        arg0.field1867 = 0;
        int var2 = arg0.method2172();
        this.field32 = arg0.method2358();
        this.field30 = arg0.method2358();
        int var3 = -1;
        this.field45 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2172();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2172();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2255();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method2(var4[var5] - 512).field1068;
                    if (var8 != 0) {
                        this.field45 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2172();
            if (var11 < 0 || var11 >= Statics.field2587[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field796 = arg0.method2255();
        if (this.field796 == 65535) {
            this.field796 = -1;
        }
        this.field744 = arg0.method2255();
        if (this.field744 == 65535) {
            this.field744 = -1;
        }
        this.field745 = this.field744;
        this.field746 = arg0.method2255();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field747 = arg0.method2255();
        if (this.field747 == 65535) {
            this.field747 = -1;
        }
        this.field797 = arg0.method2255();
        if (this.field797 == 65535) {
            this.field797 = -1;
        }
        this.field749 = arg0.method2255();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field739 = arg0.method2255();
        if (this.field739 == 65535) {
            this.field739 = -1;
        }
        this.field42 = arg0.method2180();
        if (Statics.field1548 == this) {
            Statics.field2109 = this.field42;
        }
        this.field31 = arg0.method2172();
        this.field34 = arg0.method2255();
        this.field27 = arg0.method2172() == 1;
        if (client.field249 == 0 && client.field417 >= 2) {
            this.field27 = false;
        }
        if (this.field28 == null) {
            this.field28 = new class170();
        }
        this.field28.method3086(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("p.b(B)Lcs;")
    public final class100 method14() {
        if (this.field28 == null) {
            return null;
        }
        class40 var1 = this.field748 != -1 && this.field772 == 0 ? class40.method168(this.field748) : null;
        class40 var2 = this.field766 == -1 || this.field44 || this.field796 == this.field766 && var1 != null ? null : class40.method168(this.field766);
        class100 var3 = this.field28.method3092(var1, this.field782, var2, this.field767);
        if (var3 == null) {
            return null;
        }
        var3.method2020();
        this.field738 = var3.field1364;
        if (!this.field44 && this.field743 != -1 && this.field775 != -1) {
            class100 var4 = class41.method113(this.field743).method827(this.field775);
            if (var4 != null) {
                var4.method2030(0, -this.field778, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field44 && this.field39 != null) {
            if (client.field256 >= this.field35) {
                this.field39 = null;
            }
            if (client.field256 >= this.field33 && client.field256 < this.field35) {
                class100 var6 = this.field39;
                var6.method2030(this.field36 - this.field765, this.field37 - this.field38, this.field46 - this.field741);
                if (this.field788 == 512) {
                    var6.method2038();
                    var6.method2038();
                    var6.method2038();
                } else if (this.field788 == 1024) {
                    var6.method2038();
                    var6.method2038();
                } else if (this.field788 == 1536) {
                    var6.method2038();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field788 == 512) {
                    var6.method2038();
                } else if (this.field788 == 1024) {
                    var6.method2038();
                    var6.method2038();
                } else if (this.field788 == 1536) {
                    var6.method2038();
                    var6.method2038();
                    var6.method2038();
                }
                var6.method2030(this.field765 - this.field36, this.field38 - this.field37, this.field741 - this.field46);
            }
        }
        var3.field1743 = true;
        return var3;
    }

    @ObfuscatedName("p.p(I)Z")
    public final boolean method15() {
        return this.field28 != null;
    }
}
