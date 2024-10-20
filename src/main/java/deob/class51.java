package deob;

@ObfuscatedName("ad")
public class class51 {

    @ObfuscatedName("ad.g")
    public int field1100 = 2;

    @ObfuscatedName("ad.i")
    public int[] field1098 = new int[2];

    @ObfuscatedName("ad.k")
    public int[] field1099 = new int[2];

    @ObfuscatedName("ad.e")
    public int field1103;

    @ObfuscatedName("ad.w")
    public int field1097;

    @ObfuscatedName("ad.m")
    public int field1102;

    @ObfuscatedName("ad.u")
    public int field1105;

    @ObfuscatedName("ad.j")
    public int field1104;

    @ObfuscatedName("ad.o")
    public int field1101;

    @ObfuscatedName("ad.h")
    public int field1106;

    @ObfuscatedName("ad.b")
    public int field1107;

    public class51() {
        this.field1098[0] = 0;
        this.field1098[1] = 65535;
        this.field1099[0] = 0;
        this.field1099[1] = 65535;
    }

    @ObfuscatedName("ad.g(Ldk;)V")
    public final void method1013(class107 arg0) {
        this.field1102 = arg0.method2092();
        this.field1103 = arg0.method2112();
        this.field1097 = arg0.method2112();
        this.method1012(arg0);
    }

    @ObfuscatedName("ad.i(Ldk;)V")
    public final void method1012(class107 arg0) {
        this.field1100 = arg0.method2092();
        this.field1098 = new int[this.field1100];
        this.field1099 = new int[this.field1100];
        for (int var2 = 0; var2 < this.field1100; var2++) {
            this.field1098[var2] = arg0.method2094();
            this.field1099[var2] = arg0.method2094();
        }
    }

    @ObfuscatedName("ad.k()V")
    public final void method1014() {
        this.field1105 = 0;
        this.field1104 = 0;
        this.field1101 = 0;
        this.field1106 = 0;
        this.field1107 = 0;
    }

    @ObfuscatedName("ad.e(I)I")
    public final int method1015(int arg0) {
        if (this.field1107 >= this.field1105) {
            this.field1106 = this.field1099[this.field1104++] << 15;
            if (this.field1104 >= this.field1100) {
                this.field1104 = this.field1100 - 1;
            }
            this.field1105 = (int) ((double) this.field1098[this.field1104] / 65536.0D * (double) arg0);
            if (this.field1105 > this.field1107) {
                this.field1101 = ((this.field1099[this.field1104] << 15) - this.field1106) / (this.field1105 - this.field1107);
            }
        }
        this.field1106 += this.field1101;
        this.field1107++;
        return this.field1106 - this.field1101 >> 15;
    }
}
