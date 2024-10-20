package deob;

@ObfuscatedName("af")
public class class51 {

    @ObfuscatedName("af.k")
    public int field1095 = 2;

    @ObfuscatedName("af.b")
    public int[] field1096 = new int[2];

    @ObfuscatedName("af.e")
    public int[] field1103 = new int[2];

    @ObfuscatedName("af.i")
    public int field1098;

    @ObfuscatedName("af.t")
    public int field1099;

    @ObfuscatedName("af.z")
    public int field1100;

    @ObfuscatedName("af.g")
    public int field1101;

    @ObfuscatedName("af.c")
    public int field1102;

    @ObfuscatedName("af.o")
    public int field1104;

    @ObfuscatedName("af.q")
    public int field1097;

    @ObfuscatedName("af.w")
    public int field1105;

    public class51() {
        this.field1096[0] = 0;
        this.field1096[1] = 65535;
        this.field1103[0] = 0;
        this.field1103[1] = 65535;
    }

    @ObfuscatedName("af.k(Ldi;)V")
    public final void method1021(class107 arg0) {
        this.field1100 = arg0.method2115();
        this.field1098 = arg0.method2120();
        this.field1099 = arg0.method2120();
        this.method1030(arg0);
    }

    @ObfuscatedName("af.b(Ldi;)V")
    public final void method1030(class107 arg0) {
        this.field1095 = arg0.method2115();
        this.field1096 = new int[this.field1095];
        this.field1103 = new int[this.field1095];
        for (int var2 = 0; var2 < this.field1095; var2++) {
            this.field1096[var2] = arg0.method2117();
            this.field1103[var2] = arg0.method2117();
        }
    }

    @ObfuscatedName("af.e()V")
    public final void method1023() {
        this.field1101 = 0;
        this.field1102 = 0;
        this.field1104 = 0;
        this.field1097 = 0;
        this.field1105 = 0;
    }

    @ObfuscatedName("af.i(I)I")
    public final int method1033(int arg0) {
        if (this.field1105 >= this.field1101) {
            this.field1097 = this.field1103[this.field1102++] << 15;
            if (this.field1102 >= this.field1095) {
                this.field1102 = this.field1095 - 1;
            }
            this.field1101 = (int) ((double) this.field1096[this.field1102] / 65536.0D * (double) arg0);
            if (this.field1101 > this.field1105) {
                this.field1104 = ((this.field1103[this.field1102] << 15) - this.field1097) / (this.field1101 - this.field1105);
            }
        }
        this.field1097 += this.field1104;
        this.field1105++;
        return this.field1097 - this.field1104 >> 15;
    }
}
