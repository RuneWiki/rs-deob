package deob;

@ObfuscatedName("ae")
public class class51 {

    @ObfuscatedName("ae.g")
    public int field1102 = 2;

    @ObfuscatedName("ae.s")
    public int[] field1093 = new int[2];

    @ObfuscatedName("ae.h")
    public int[] field1094 = new int[2];

    @ObfuscatedName("ae.m")
    public int field1092;

    @ObfuscatedName("ae.u")
    public int field1096;

    @ObfuscatedName("ae.j")
    public int field1097;

    @ObfuscatedName("ae.b")
    public int field1101;

    @ObfuscatedName("ae.v")
    public int field1095;

    @ObfuscatedName("ae.y")
    public int field1099;

    @ObfuscatedName("ae.w")
    public int field1100;

    @ObfuscatedName("ae.k")
    public int field1098;

    public class51() {
        this.field1093[0] = 0;
        this.field1093[1] = 65535;
        this.field1094[0] = 0;
        this.field1094[1] = 65535;
    }

    @ObfuscatedName("ae.g(Ldi;)V")
    public final void method1017(class107 arg0) {
        this.field1097 = arg0.method2101();
        this.field1092 = arg0.method2286();
        this.field1096 = arg0.method2286();
        this.method1019(arg0);
    }

    @ObfuscatedName("ae.s(Ldi;)V")
    public final void method1019(class107 arg0) {
        this.field1102 = arg0.method2101();
        this.field1093 = new int[this.field1102];
        this.field1094 = new int[this.field1102];
        for (int var2 = 0; var2 < this.field1102; var2++) {
            this.field1093[var2] = arg0.method2166();
            this.field1094[var2] = arg0.method2166();
        }
    }

    @ObfuscatedName("ae.h()V")
    public final void method1020() {
        this.field1101 = 0;
        this.field1095 = 0;
        this.field1100 = 0;
        this.field1098 = 0;
        this.field1099 = 0;
    }

    @ObfuscatedName("ae.m(I)I")
    public final int method1021(int arg0) {
        if (this.field1099 >= this.field1101) {
            this.field1098 = this.field1094[this.field1095++] << 15;
            if (this.field1095 >= this.field1102) {
                this.field1095 = this.field1102 - 1;
            }
            this.field1101 = (int) ((double) this.field1093[this.field1095] / 65536.0D * (double) arg0);
            if (this.field1101 > this.field1099) {
                this.field1100 = ((this.field1094[this.field1095] << 15) - this.field1098) / (this.field1101 - this.field1099);
            }
        }
        this.field1098 += this.field1100;
        this.field1099++;
        return this.field1098 - this.field1100 >> 15;
    }
}
