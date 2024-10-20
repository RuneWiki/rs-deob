package deob;

@ObfuscatedName("ad")
public class class51 {

    @ObfuscatedName("ad.k")
    public int field1086 = 2;

    @ObfuscatedName("ad.y")
    public int field1084;

    @ObfuscatedName("ad.s")
    public int[] field1077 = new int[2];

    @ObfuscatedName("ad.g")
    public int[] field1076 = new int[2];

    @ObfuscatedName("ad.h")
    public int field1079;

    @ObfuscatedName("ad.l")
    public int field1080;

    @ObfuscatedName("ad.e")
    public int field1081;

    @ObfuscatedName("ad.u")
    public int field1085;

    @ObfuscatedName("ad.j")
    public int field1083;

    @ObfuscatedName("ad.c")
    public int field1082;

    @ObfuscatedName("ad.d")
    public int field1078;

    public class51() {
        this.field1077[0] = 0;
        this.field1077[1] = 65535;
        this.field1076[0] = 0;
        this.field1076[1] = 65535;
    }

    @ObfuscatedName("ad.k(Ldy;)V")
    public final void method1027(class107 arg0) {
        this.field1081 = arg0.method2138();
        this.field1079 = arg0.method2143();
        this.field1080 = arg0.method2143();
        this.method1039(arg0);
    }

    @ObfuscatedName("ad.y(Ldy;)V")
    public final void method1039(class107 arg0) {
        this.field1086 = arg0.method2138();
        this.field1077 = new int[this.field1086];
        this.field1076 = new int[this.field1086];
        for (int var2 = 0; var2 < this.field1086; var2++) {
            this.field1077[var2] = arg0.method2239();
            this.field1076[var2] = arg0.method2239();
        }
    }

    @ObfuscatedName("ad.s()V")
    public final void method1035() {
        this.field1085 = 0;
        this.field1083 = 0;
        this.field1082 = 0;
        this.field1078 = 0;
        this.field1084 = 0;
    }

    @ObfuscatedName("ad.g(I)I")
    public final int method1030(int arg0) {
        if (this.field1084 >= this.field1085) {
            this.field1078 = this.field1076[this.field1083++] << 15;
            if (this.field1083 >= this.field1086) {
                this.field1083 = this.field1086 - 1;
            }
            this.field1085 = (int) ((double) this.field1077[this.field1083] / 65536.0D * (double) arg0);
            if (this.field1085 > this.field1084) {
                this.field1082 = ((this.field1076[this.field1083] << 15) - this.field1078) / (this.field1085 - this.field1084);
            }
        }
        this.field1078 += this.field1082;
        this.field1084++;
        return this.field1078 - this.field1082 >> 15;
    }
}
