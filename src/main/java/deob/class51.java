package deob;

@ObfuscatedName("ad")
public class class51 {

    @ObfuscatedName("ad.t")
    public int field1096 = 2;

    @ObfuscatedName("ad.s")
    public int[] field1095 = new int[2];

    @ObfuscatedName("ad.f")
    public int[] field1090 = new int[2];

    @ObfuscatedName("ad.e")
    public int field1091;

    @ObfuscatedName("ad.d")
    public int field1092;

    @ObfuscatedName("ad.n")
    public int field1094;

    @ObfuscatedName("ad.v")
    public int field1093;

    @ObfuscatedName("ad.z")
    public int field1088;

    @ObfuscatedName("ad.j")
    public int field1089;

    @ObfuscatedName("ad.u")
    public int field1097;

    @ObfuscatedName("ad.g")
    public int field1098;

    public class51() {
        this.field1095[0] = 0;
        this.field1095[1] = 65535;
        this.field1090[0] = 0;
        this.field1090[1] = 65535;
    }

    @ObfuscatedName("ad.t(Ldb;)V")
    public final void method1005(class107 arg0) {
        this.field1094 = arg0.method2101();
        this.field1091 = arg0.method2106();
        this.field1092 = arg0.method2106();
        this.method999(arg0);
    }

    @ObfuscatedName("ad.s(Ldb;)V")
    public final void method999(class107 arg0) {
        this.field1096 = arg0.method2101();
        this.field1095 = new int[this.field1096];
        this.field1090 = new int[this.field1096];
        for (int var2 = 0; var2 < this.field1096; var2++) {
            this.field1095[var2] = arg0.method2103();
            this.field1090[var2] = arg0.method2103();
        }
    }

    @ObfuscatedName("ad.f()V")
    public final void method998() {
        this.field1093 = 0;
        this.field1088 = 0;
        this.field1089 = 0;
        this.field1097 = 0;
        this.field1098 = 0;
    }

    @ObfuscatedName("ad.e(I)I")
    public final int method996(int arg0) {
        if (this.field1098 >= this.field1093) {
            this.field1097 = this.field1090[this.field1088++] << 15;
            if (this.field1088 >= this.field1096) {
                this.field1088 = this.field1096 - 1;
            }
            this.field1093 = (int) ((double) this.field1095[this.field1088] / 65536.0D * (double) arg0);
            if (this.field1093 > this.field1098) {
                this.field1089 = ((this.field1090[this.field1088] << 15) - this.field1097) / (this.field1093 - this.field1098);
            }
        }
        this.field1097 += this.field1089;
        this.field1098++;
        return this.field1097 - this.field1089 >> 15;
    }
}
