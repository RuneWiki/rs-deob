package deob;

@ObfuscatedName("ap")
public class class52 {

    @ObfuscatedName("ap.l")
    public int field1096 = 2;

    @ObfuscatedName("ap.y")
    public int field1104;

    @ObfuscatedName("ap.g")
    public int[] field1095 = new int[2];

    @ObfuscatedName("ap.j")
    public int[] field1094 = new int[2];

    @ObfuscatedName("ap.w")
    public int field1097;

    @ObfuscatedName("ap.c")
    public int field1098;

    @ObfuscatedName("ap.f")
    public int field1103;

    @ObfuscatedName("ap.t")
    public int field1100;

    @ObfuscatedName("ap.n")
    public int field1101;

    @ObfuscatedName("ap.p")
    public int field1099;

    @ObfuscatedName("ap.a")
    public int field1102;

    public class52() {
        this.field1095[0] = 0;
        this.field1095[1] = 65535;
        this.field1094[0] = 0;
        this.field1094[1] = 65535;
    }

    @ObfuscatedName("ap.l(Ldk;)V")
    public final void method1013(class108 arg0) {
        this.field1103 = arg0.method2291();
        this.field1097 = arg0.method2297();
        this.field1098 = arg0.method2297();
        this.method1021(arg0);
    }

    @ObfuscatedName("ap.y(Ldk;)V")
    public final void method1021(class108 arg0) {
        this.field1096 = arg0.method2291();
        this.field1095 = new int[this.field1096];
        this.field1094 = new int[this.field1096];
        for (int var2 = 0; var2 < this.field1096; var2++) {
            this.field1095[var2] = arg0.method2163();
            this.field1094[var2] = arg0.method2163();
        }
    }

    @ObfuscatedName("ap.g()V")
    public final void method1014() {
        this.field1100 = 0;
        this.field1101 = 0;
        this.field1099 = 0;
        this.field1102 = 0;
        this.field1104 = 0;
    }

    @ObfuscatedName("ap.j(I)I")
    public final int method1016(int arg0) {
        if (this.field1104 >= this.field1100) {
            this.field1102 = this.field1094[this.field1101++] << 15;
            if (this.field1101 >= this.field1096) {
                this.field1101 = this.field1096 - 1;
            }
            this.field1100 = (int) ((double) this.field1095[this.field1101] / 65536.0D * (double) arg0);
            if (this.field1100 > this.field1104) {
                this.field1099 = ((this.field1094[this.field1101] << 15) - this.field1102) / (this.field1100 - this.field1104);
            }
        }
        this.field1102 += this.field1099;
        this.field1104++;
        return this.field1102 - this.field1099 >> 15;
    }
}
