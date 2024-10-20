package deob;

@ObfuscatedName("af")
public class class51 {

    @ObfuscatedName("af.g")
    public int field1103 = 2;

    @ObfuscatedName("af.s")
    public int[] field1096 = new int[2];

    @ObfuscatedName("af.v")
    public int[] field1097 = new int[2];

    @ObfuscatedName("af.o")
    public int field1098;

    @ObfuscatedName("af.k")
    public int field1095;

    @ObfuscatedName("af.m")
    public int field1100;

    @ObfuscatedName("af.i")
    public int field1101;

    @ObfuscatedName("af.t")
    public int field1102;

    @ObfuscatedName("af.l")
    public int field1104;

    @ObfuscatedName("af.p")
    public int field1099;

    @ObfuscatedName("af.r")
    public int field1105;

    public class51() {
        this.field1096[0] = 0;
        this.field1096[1] = 65535;
        this.field1097[0] = 0;
        this.field1097[1] = 65535;
    }

    @ObfuscatedName("af.g(Lde;)V")
    public final void method1010(class107 arg0) {
        this.field1100 = arg0.method2116();
        this.field1098 = arg0.method2097();
        this.field1095 = arg0.method2097();
        this.method1012(arg0);
    }

    @ObfuscatedName("af.s(Lde;)V")
    public final void method1012(class107 arg0) {
        this.field1103 = arg0.method2116();
        this.field1096 = new int[this.field1103];
        this.field1097 = new int[this.field1103];
        for (int var2 = 0; var2 < this.field1103; var2++) {
            this.field1096[var2] = arg0.method2094();
            this.field1097[var2] = arg0.method2094();
        }
    }

    @ObfuscatedName("af.v()V")
    public final void method1016() {
        this.field1101 = 0;
        this.field1102 = 0;
        this.field1104 = 0;
        this.field1099 = 0;
        this.field1105 = 0;
    }

    @ObfuscatedName("af.o(I)I")
    public final int method1013(int arg0) {
        if (this.field1105 >= this.field1101) {
            this.field1099 = this.field1097[this.field1102++] << 15;
            if (this.field1102 >= this.field1103) {
                this.field1102 = this.field1103 - 1;
            }
            this.field1101 = (int) ((double) this.field1096[this.field1102] / 65536.0D * (double) arg0);
            if (this.field1101 > this.field1105) {
                this.field1104 = ((this.field1097[this.field1102] << 15) - this.field1099) / (this.field1101 - this.field1105);
            }
        }
        this.field1099 += this.field1104;
        this.field1105++;
        return this.field1099 - this.field1104 >> 15;
    }
}
