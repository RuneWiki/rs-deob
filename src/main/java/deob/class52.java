package deob;

@ObfuscatedName("ae")
public class class52 {

    @ObfuscatedName("ae.v")
    public int field1104 = 2;

    @ObfuscatedName("ae.t")
    public int[] field1105 = new int[2];

    @ObfuscatedName("ae.f")
    public int[] field1097 = new int[2];

    @ObfuscatedName("ae.j")
    public int field1098;

    @ObfuscatedName("ae.l")
    public int field1099;

    @ObfuscatedName("ae.g")
    public int field1100;

    @ObfuscatedName("ae.k")
    public int field1101;

    @ObfuscatedName("ae.p")
    public int field1102;

    @ObfuscatedName("ae.y")
    public int field1095;

    @ObfuscatedName("ae.m")
    public int field1103;

    @ObfuscatedName("ae.o")
    public int field1096;

    public class52() {
        this.field1105[0] = 0;
        this.field1105[1] = 65535;
        this.field1097[0] = 0;
        this.field1097[1] = 65535;
    }

    @ObfuscatedName("ae.v(Ldp;)V")
    public final void method1034(class110 arg0) {
        this.field1100 = arg0.method2257();
        this.field1098 = arg0.method2297();
        this.field1099 = arg0.method2297();
        this.method1035(arg0);
    }

    @ObfuscatedName("ae.t(Ldp;)V")
    public final void method1035(class110 arg0) {
        this.field1104 = arg0.method2257();
        this.field1105 = new int[this.field1104];
        this.field1097 = new int[this.field1104];
        for (int var2 = 0; var2 < this.field1104; var2++) {
            this.field1105[var2] = arg0.method2194();
            this.field1097[var2] = arg0.method2194();
        }
    }

    @ObfuscatedName("ae.f()V")
    public final void method1036() {
        this.field1101 = 0;
        this.field1102 = 0;
        this.field1103 = 0;
        this.field1096 = 0;
        this.field1095 = 0;
    }

    @ObfuscatedName("ae.j(I)I")
    public final int method1042(int arg0) {
        if (this.field1095 >= this.field1101) {
            this.field1096 = this.field1097[this.field1102++] << 15;
            if (this.field1102 >= this.field1104) {
                this.field1102 = this.field1104 - 1;
            }
            this.field1101 = (int) ((double) this.field1105[this.field1102] / 65536.0D * (double) arg0);
            if (this.field1101 > this.field1095) {
                this.field1103 = ((this.field1097[this.field1102] << 15) - this.field1096) / (this.field1101 - this.field1095);
            }
        }
        this.field1096 += this.field1103;
        this.field1095++;
        return this.field1096 - this.field1103 >> 15;
    }
}
