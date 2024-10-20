package deob;

@ObfuscatedName("s")
public final class class3 extends class33 {

    @ObfuscatedName("s.k")
    public String field46;

    @ObfuscatedName("s.y")
    public class158 field29;

    @ObfuscatedName("s.s")
    public int field28 = -1;

    @ObfuscatedName("s.g")
    public int field35 = -1;

    @ObfuscatedName("s.h")
    public int field32 = 0;

    @ObfuscatedName("s.l")
    public int field33 = 0;

    @ObfuscatedName("s.e")
    public int field34;

    @ObfuscatedName("s.u")
    public int field30 = 0;

    @ObfuscatedName("s.j")
    public int field47 = 0;

    @ObfuscatedName("s.c")
    public int field37;

    @ObfuscatedName("s.d")
    public int field38;

    @ObfuscatedName("s.v")
    public int field39;

    @ObfuscatedName("s.n")
    public class98 field40;

    @ObfuscatedName("s.z")
    public int field41;

    @ObfuscatedName("s.a")
    public int field44;

    @ObfuscatedName("s.t")
    public int field43;

    @ObfuscatedName("s.p")
    public int field49;

    @ObfuscatedName("s.i")
    public boolean field45 = false;

    @ObfuscatedName("s.r")
    public int field36 = 0;

    @ObfuscatedName("s.w")
    public boolean field42 = false;

    @ObfuscatedName("s.k(Ldy;B)V")
    public final void method21(class107 arg0) {
        arg0.field1838 = 0;
        int var2 = arg0.method2138();
        this.field28 = arg0.method2139();
        this.field35 = arg0.method2139();
        int var3 = -1;
        this.field36 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2138();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2138();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2239();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method114(var4[var5] - 512).field1035;
                    if (var8 != 0) {
                        this.field36 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2138();
            if (var11 < 0 || var11 >= Statics.field2687[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field720 = arg0.method2239();
        if (this.field720 == 65535) {
            this.field720 = -1;
        }
        this.field721 = arg0.method2239();
        if (this.field721 == 65535) {
            this.field721 = -1;
        }
        this.field722 = this.field721;
        this.field723 = arg0.method2239();
        if (this.field723 == 65535) {
            this.field723 = -1;
        }
        this.field724 = arg0.method2239();
        if (this.field724 == 65535) {
            this.field724 = -1;
        }
        this.field725 = arg0.method2239();
        if (this.field725 == 65535) {
            this.field725 = -1;
        }
        this.field726 = arg0.method2239();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field727 = arg0.method2239();
        if (this.field727 == 65535) {
            this.field727 = -1;
        }
        this.field46 = arg0.method2146();
        if (Statics.field590 == this) {
            Statics.field2088 = this.field46;
        }
        this.field32 = arg0.method2138();
        this.field33 = arg0.method2239();
        this.field42 = arg0.method2138() == 1;
        if (client.field384 == 0 && client.field409 >= 2) {
            this.field42 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class158();
        }
        this.field29.method2948(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("s.y(I)Lck;")
    public final class98 method19() {
        if (this.field29 == null) {
            return null;
        }
        class38 var1 = this.field745 != -1 && this.field748 == 0 ? class38.method29(this.field745) : null;
        class38 var2 = this.field742 == -1 || this.field45 || this.field742 == this.field720 && var1 != null ? null : class38.method29(this.field742);
        class98 var3 = this.field29.method2954(var1, this.field746, var2, this.field749);
        if (var3 == null) {
            return null;
        }
        var3.method1991();
        this.field719 = var3.field1332;
        if (!this.field45 && this.field750 != -1 && this.field743 != -1) {
            class98 var4 = class39.method2666(this.field750).method722(this.field743);
            if (var4 != null) {
                var4.method2001(0, -this.field751, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field245 >= this.field47) {
                this.field40 = null;
            }
            if (client.field245 >= this.field30 && client.field245 < this.field47) {
                class98 var6 = this.field40;
                var6.method2001(this.field37 - this.field760, this.field38 - this.field34, this.field39 - this.field716);
                if (this.field764 == 512) {
                    var6.method1997();
                    var6.method1997();
                    var6.method1997();
                } else if (this.field764 == 1024) {
                    var6.method1997();
                    var6.method1997();
                } else if (this.field764 == 1536) {
                    var6.method1997();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field764 == 512) {
                    var6.method1997();
                } else if (this.field764 == 1024) {
                    var6.method1997();
                    var6.method1997();
                } else if (this.field764 == 1536) {
                    var6.method1997();
                    var6.method1997();
                    var6.method1997();
                }
                var6.method2001(this.field760 - this.field37, this.field34 - this.field38, this.field716 - this.field39);
            }
        }
        var3.field1724 = true;
        return var3;
    }

    @ObfuscatedName("s.s(B)Z")
    public final boolean method20() {
        return this.field29 != null;
    }
}
