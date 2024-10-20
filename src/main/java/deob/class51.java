package deob;

@ObfuscatedName("ah")
public class class51 {

    @ObfuscatedName("ah.b")
    public int field1102 = 2;

    @ObfuscatedName("ah.u")
    public int[] field1097 = new int[2];

    @ObfuscatedName("ah.j")
    public int[] field1100 = new int[2];

    @ObfuscatedName("ah.o")
    public int field1099;

    @ObfuscatedName("ah.n")
    public int field1096;

    @ObfuscatedName("ah.y")
    public int field1106;

    @ObfuscatedName("ah.f")
    public int field1101;

    @ObfuscatedName("ah.p")
    public int field1105;

    @ObfuscatedName("ah.l")
    public int field1103;

    @ObfuscatedName("ah.k")
    public int field1104;

    @ObfuscatedName("ah.q")
    public int field1098;

    public class51() {
        this.field1097[0] = 0;
        this.field1097[1] = 65535;
        this.field1100[0] = 0;
        this.field1100[1] = 65535;
    }

    @ObfuscatedName("ah.b(Ldh;)V")
    public final void method1012(class107 arg0) {
        this.field1101 = arg0.method2134();
        this.field1099 = arg0.method2139();
        this.field1096 = arg0.method2139();
        this.method1014(arg0);
    }

    @ObfuscatedName("ah.u(Ldh;)V")
    public final void method1014(class107 arg0) {
        this.field1102 = arg0.method2134();
        this.field1097 = new int[this.field1102];
        this.field1100 = new int[this.field1102];
        for (int var2 = 0; var2 < this.field1102; var2++) {
            this.field1097[var2] = arg0.method2136();
            this.field1100[var2] = arg0.method2136();
        }
    }

    @ObfuscatedName("ah.x()V")
    public final void method1013() {
        this.field1105 = 0;
        this.field1103 = 0;
        this.field1104 = 0;
        this.field1098 = 0;
        this.field1106 = 0;
    }

    @ObfuscatedName("ah.j(I)I")
    public final int method1011(int arg0) {
        if (this.field1106 >= this.field1105) {
            this.field1098 = this.field1100[this.field1103++] << 15;
            if (this.field1103 >= this.field1102) {
                this.field1103 = this.field1102 - 1;
            }
            this.field1105 = (int) ((double) this.field1097[this.field1103] / 65536.0D * (double) arg0);
            if (this.field1105 > this.field1106) {
                this.field1104 = ((this.field1100[this.field1103] << 15) - this.field1098) / (this.field1105 - this.field1106);
            }
        }
        this.field1098 += this.field1104;
        this.field1106++;
        return this.field1098 - this.field1104 >> 15;
    }
}
