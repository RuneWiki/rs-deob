package deob;

@ObfuscatedName("k")
public final class class3 extends class33 {

    @ObfuscatedName("k.g")
    public String field45;

    @ObfuscatedName("k.i")
    public class158 field35;

    @ObfuscatedName("k.k")
    public int field29 = -1;

    @ObfuscatedName("k.e")
    public int field30 = -1;

    @ObfuscatedName("k.w")
    public int field36 = 0;

    @ObfuscatedName("k.m")
    public int field32 = 0;

    @ObfuscatedName("k.u")
    public int field33;

    @ObfuscatedName("k.j")
    public int field31 = 0;

    @ObfuscatedName("k.o")
    public int field42 = 0;

    @ObfuscatedName("k.h")
    public int field44;

    @ObfuscatedName("k.b")
    public int field41;

    @ObfuscatedName("k.r")
    public int field38;

    @ObfuscatedName("k.l")
    public class98 field39;

    @ObfuscatedName("k.x")
    public int field40;

    @ObfuscatedName("k.q")
    public int field28;

    @ObfuscatedName("k.t")
    public int field27;

    @ObfuscatedName("k.y")
    public int field43;

    @ObfuscatedName("k.d")
    public boolean field34 = false;

    @ObfuscatedName("k.z")
    public int field37 = 0;

    @ObfuscatedName("k.n")
    public boolean field46 = false;

    @ObfuscatedName("k.g(Ldk;B)V")
    public final void method13(class107 arg0) {
        arg0.field1844 = 0;
        int var2 = arg0.method2092();
        this.field29 = arg0.method2117();
        this.field30 = arg0.method2117();
        int var3 = -1;
        this.field37 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2092();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2092();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2094();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method2406(var4[var5] - 512).field1051;
                    if (var8 != 0) {
                        this.field37 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2092();
            if (var11 < 0 || var11 >= Statics.field2696[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field739 = arg0.method2094();
        if (this.field739 == 65535) {
            this.field739 = -1;
        }
        this.field786 = arg0.method2094();
        if (this.field786 == 65535) {
            this.field786 = -1;
        }
        this.field745 = this.field786;
        this.field746 = arg0.method2094();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field747 = arg0.method2094();
        if (this.field747 == 65535) {
            this.field747 = -1;
        }
        this.field748 = arg0.method2094();
        if (this.field748 == 65535) {
            this.field748 = -1;
        }
        this.field749 = arg0.method2094();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field750 = arg0.method2094();
        if (this.field750 == 65535) {
            this.field750 = -1;
        }
        this.field45 = arg0.method2251();
        if (Statics.field1767 == this) {
            Statics.field2079 = this.field45;
        }
        this.field36 = arg0.method2092();
        this.field32 = arg0.method2094();
        this.field46 = arg0.method2092() == 1;
        if (client.field396 == 0 && client.field424 >= 2) {
            this.field46 = false;
        }
        if (this.field35 == null) {
            this.field35 = new class158();
        }
        this.field35.method2912(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.i(I)Lce;")
    public final class98 method14() {
        if (this.field35 == null) {
            return null;
        }
        class38 var1 = this.field762 != -1 && this.field772 == 0 ? class38.method552(this.field762) : null;
        class38 var2 = this.field766 == -1 || this.field34 || this.field766 == this.field739 && var1 != null ? null : class38.method552(this.field766);
        class98 var3 = this.field35.method2900(var1, this.field770, var2, this.field767);
        if (var3 == null) {
            return null;
        }
        var3.method1955();
        this.field787 = var3.field1360;
        if (!this.field34 && this.field774 != -1 && this.field775 != -1) {
            class98 var4 = class39.method685(this.field774).method718(this.field775);
            if (var4 != null) {
                var4.method1966(0, -this.field741, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field34 && this.field39 != null) {
            if (client.field269 >= this.field42) {
                this.field39 = null;
            }
            if (client.field269 >= this.field31 && client.field269 < this.field42) {
                class98 var6 = this.field39;
                var6.method1966(this.field44 - this.field780, this.field41 - this.field33, this.field38 - this.field761);
                if (this.field738 == 512) {
                    var6.method1978();
                    var6.method1978();
                    var6.method1978();
                } else if (this.field738 == 1024) {
                    var6.method1978();
                    var6.method1978();
                } else if (this.field738 == 1536) {
                    var6.method1978();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field738 == 512) {
                    var6.method1978();
                } else if (this.field738 == 1024) {
                    var6.method1978();
                    var6.method1978();
                } else if (this.field738 == 1536) {
                    var6.method1978();
                    var6.method1978();
                    var6.method1978();
                }
                var6.method1966(this.field780 - this.field44, this.field33 - this.field41, this.field761 - this.field38);
            }
        }
        var3.field1721 = true;
        return var3;
    }

    @ObfuscatedName("k.k(B)Z")
    public final boolean method25() {
        return this.field35 != null;
    }
}
