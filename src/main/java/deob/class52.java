package deob;

@ObfuscatedName("ad")
public class class52 {

    @ObfuscatedName("ad.b")
    public int field1109 = 2;

    @ObfuscatedName("ad.e")
    public int[] field1103 = new int[2];

    @ObfuscatedName("ad.i")
    public int[] field1105 = new int[2];

    @ObfuscatedName("ad.k")
    public int field1111;

    @ObfuscatedName("ad.h")
    public int field1107;

    @ObfuscatedName("ad.p")
    public int field1108;

    @ObfuscatedName("ad.n")
    public int field1106;

    @ObfuscatedName("ad.o")
    public int field1110;

    @ObfuscatedName("ad.g")
    public int field1104;

    @ObfuscatedName("ad.z")
    public int field1112;

    @ObfuscatedName("ad.t")
    public int field1113;

    public class52() {
        this.field1103[0] = 0;
        this.field1103[1] = 65535;
        this.field1105[0] = 0;
        this.field1105[1] = 65535;
    }

    @ObfuscatedName("ad.b(Ldc;)V")
    public final void method1013(class110 arg0) {
        this.field1108 = arg0.method2142();
        this.field1111 = arg0.method2195();
        this.field1107 = arg0.method2195();
        this.method1014(arg0);
    }

    @ObfuscatedName("ad.e(Ldc;)V")
    public final void method1014(class110 arg0) {
        this.field1109 = arg0.method2142();
        this.field1103 = new int[this.field1109];
        this.field1105 = new int[this.field1109];
        for (int var2 = 0; var2 < this.field1109; var2++) {
            this.field1103[var2] = arg0.method2292();
            this.field1105[var2] = arg0.method2292();
        }
    }

    @ObfuscatedName("ad.i()V")
    public final void method1015() {
        this.field1106 = 0;
        this.field1110 = 0;
        this.field1104 = 0;
        this.field1112 = 0;
        this.field1113 = 0;
    }

    @ObfuscatedName("ad.k(I)I")
    public final int method1016(int arg0) {
        if (this.field1113 >= this.field1106) {
            this.field1112 = this.field1105[this.field1110++] << 15;
            if (this.field1110 >= this.field1109) {
                this.field1110 = this.field1109 - 1;
            }
            this.field1106 = (int) ((double) this.field1103[this.field1110] / 65536.0D * (double) arg0);
            if (this.field1106 > this.field1113) {
                this.field1104 = ((this.field1105[this.field1110] << 15) - this.field1112) / (this.field1106 - this.field1113);
            }
        }
        this.field1112 += this.field1104;
        this.field1113++;
        return this.field1112 - this.field1104 >> 15;
    }
}
