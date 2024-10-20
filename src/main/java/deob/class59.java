package deob;

@ObfuscatedName("bl")
public class class59 {

    @ObfuscatedName("bl.d")
    public int field1056 = 2;

    @ObfuscatedName("bl.c")
    public int[] field1057 = new int[2];

    @ObfuscatedName("bl.n")
    public int[] field1053 = new int[2];

    @ObfuscatedName("bl.q")
    public int field1054;

    @ObfuscatedName("bl.t")
    public int field1055;

    @ObfuscatedName("bl.p")
    public int field1059;

    @ObfuscatedName("bl.u")
    public int field1058;

    @ObfuscatedName("bl.z")
    public int field1052;

    @ObfuscatedName("bl.l")
    public int field1051;

    @ObfuscatedName("bl.v")
    public int field1060;

    @ObfuscatedName("bl.g")
    public int field1061;

    public class59() {
        this.field1057[0] = 0;
        this.field1057[1] = 65535;
        this.field1053[0] = 0;
        this.field1053[1] = 65535;
    }

    @ObfuscatedName("bl.d(Ldu;)V")
    public final void method1092(class130 arg0) {
        this.field1059 = arg0.method2379();
        this.field1054 = arg0.method2246();
        this.field1055 = arg0.method2246();
        this.method1093(arg0);
    }

    @ObfuscatedName("bl.c(Ldu;)V")
    public final void method1093(class130 arg0) {
        this.field1056 = arg0.method2379();
        this.field1057 = new int[this.field1056];
        this.field1053 = new int[this.field1056];
        for (int var2 = 0; var2 < this.field1056; var2++) {
            this.field1057[var2] = arg0.method2232();
            this.field1053[var2] = arg0.method2232();
        }
    }

    @ObfuscatedName("bl.n()V")
    public final void method1094() {
        this.field1058 = 0;
        this.field1052 = 0;
        this.field1051 = 0;
        this.field1060 = 0;
        this.field1061 = 0;
    }

    @ObfuscatedName("bl.q(I)I")
    public final int method1095(int arg0) {
        if (this.field1061 >= this.field1058) {
            this.field1060 = this.field1053[this.field1052++] << 15;
            if (this.field1052 >= this.field1056) {
                this.field1052 = this.field1056 - 1;
            }
            this.field1058 = (int) ((double) this.field1057[this.field1052] / 65536.0D * (double) arg0);
            if (this.field1058 > this.field1061) {
                this.field1051 = ((this.field1053[this.field1052] << 15) - this.field1060) / (this.field1058 - this.field1061);
            }
        }
        this.field1060 += this.field1051;
        this.field1061++;
        return this.field1060 - this.field1051 >> 15;
    }
}
