package deob;

@ObfuscatedName("ak")
public class class51 {

    @ObfuscatedName("ak.g")
    public int field1098 = 2;

    @ObfuscatedName("ak.v")
    public int[] field1099 = new int[2];

    @ObfuscatedName("ak.z")
    public int[] field1095 = new int[2];

    @ObfuscatedName("ak.h")
    public int field1103;

    @ObfuscatedName("ak.k")
    public int field1097;

    @ObfuscatedName("ak.l")
    public int field1100;

    @ObfuscatedName("ak.e")
    public int field1101;

    @ObfuscatedName("ak.j")
    public int field1102;

    @ObfuscatedName("ak.n")
    public int field1096;

    @ObfuscatedName("ak.f")
    public int field1104;

    @ObfuscatedName("ak.a")
    public int field1105;

    public class51() {
        this.field1099[0] = 0;
        this.field1099[1] = 65535;
        this.field1095[0] = 0;
        this.field1095[1] = 65535;
    }

    @ObfuscatedName("ak.g(Ldm;)V")
    public final void method1055(class107 arg0) {
        this.field1100 = arg0.method2139();
        this.field1103 = arg0.method2144();
        this.field1097 = arg0.method2144();
        this.method1053(arg0);
    }

    @ObfuscatedName("ak.v(Ldm;)V")
    public final void method1053(class107 arg0) {
        this.field1098 = arg0.method2139();
        this.field1099 = new int[this.field1098];
        this.field1095 = new int[this.field1098];
        for (int var2 = 0; var2 < this.field1098; var2++) {
            this.field1099[var2] = arg0.method2141();
            this.field1095[var2] = arg0.method2141();
        }
    }

    @ObfuscatedName("ak.z()V")
    public final void method1056() {
        this.field1101 = 0;
        this.field1102 = 0;
        this.field1096 = 0;
        this.field1104 = 0;
        this.field1105 = 0;
    }

    @ObfuscatedName("ak.h(I)I")
    public final int method1060(int arg0) {
        if (this.field1105 >= this.field1101) {
            this.field1104 = this.field1095[this.field1102++] << 15;
            if (this.field1102 >= this.field1098) {
                this.field1102 = this.field1098 - 1;
            }
            this.field1101 = (int) ((double) this.field1099[this.field1102] / 65536.0D * (double) arg0);
            if (this.field1101 > this.field1105) {
                this.field1096 = ((this.field1095[this.field1102] << 15) - this.field1104) / (this.field1101 - this.field1105);
            }
        }
        this.field1104 += this.field1096;
        this.field1105++;
        return this.field1104 - this.field1096 >> 15;
    }
}
