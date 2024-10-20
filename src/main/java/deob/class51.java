package deob;

@ObfuscatedName("ad")
public class class51 {

    @ObfuscatedName("ad.n")
    public int field1096 = 2;

    @ObfuscatedName("ad.k")
    public int[] field1093 = new int[2];

    @ObfuscatedName("ad.i")
    public int[] field1102 = new int[2];

    @ObfuscatedName("ad.d")
    public int field1095;

    @ObfuscatedName("ad.q")
    public int field1098;

    @ObfuscatedName("ad.m")
    public int field1097;

    @ObfuscatedName("ad.a")
    public int field1094;

    @ObfuscatedName("ad.w")
    public int field1099;

    @ObfuscatedName("ad.e")
    public int field1100;

    @ObfuscatedName("ad.o")
    public int field1101;

    @ObfuscatedName("ad.v")
    public int field1092;

    public class51() {
        this.field1093[0] = 0;
        this.field1093[1] = 65535;
        this.field1102[0] = 0;
        this.field1102[1] = 65535;
    }

    @ObfuscatedName("ad.n(Ldw;)V")
    public final void method1043(class107 arg0) {
        this.field1097 = arg0.method2148();
        this.field1095 = arg0.method2183();
        this.field1098 = arg0.method2183();
        this.method1049(arg0);
    }

    @ObfuscatedName("ad.x(Ldw;)V")
    public final void method1049(class107 arg0) {
        this.field1096 = arg0.method2148();
        this.field1093 = new int[this.field1096];
        this.field1102 = new int[this.field1096];
        for (int var2 = 0; var2 < this.field1096; var2++) {
            this.field1093[var2] = arg0.method2140();
            this.field1102[var2] = arg0.method2140();
        }
    }

    @ObfuscatedName("ad.k()V")
    public final void method1044() {
        this.field1094 = 0;
        this.field1099 = 0;
        this.field1100 = 0;
        this.field1101 = 0;
        this.field1092 = 0;
    }

    @ObfuscatedName("ad.i(I)I")
    public final int method1047(int arg0) {
        if (this.field1092 >= this.field1094) {
            this.field1101 = this.field1102[this.field1099++] << 15;
            if (this.field1099 >= this.field1096) {
                this.field1099 = this.field1096 - 1;
            }
            this.field1094 = (int) ((double) this.field1093[this.field1099] / 65536.0D * (double) arg0);
            if (this.field1094 > this.field1092) {
                this.field1100 = ((this.field1102[this.field1099] << 15) - this.field1101) / (this.field1094 - this.field1092);
            }
        }
        this.field1101 += this.field1100;
        this.field1092++;
        return this.field1101 - this.field1100 >> 15;
    }
}
