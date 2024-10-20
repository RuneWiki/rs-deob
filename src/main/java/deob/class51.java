package deob;

@ObfuscatedName("aa")
public class class51 {

    @ObfuscatedName("aa.e")
    public int field1099 = 2;

    @ObfuscatedName("aa.v")
    public int[] field1092 = new int[2];

    @ObfuscatedName("aa.i")
    public int[] field1093 = new int[2];

    @ObfuscatedName("aa.g")
    public int field1094;

    @ObfuscatedName("aa.b")
    public int field1095;

    @ObfuscatedName("aa.q")
    public int field1096;

    @ObfuscatedName("aa.l")
    public int field1097;

    @ObfuscatedName("aa.m")
    public int field1091;

    @ObfuscatedName("aa.u")
    public int field1100;

    @ObfuscatedName("aa.s")
    public int field1098;

    @ObfuscatedName("aa.f")
    public int field1101;

    public class51() {
        this.field1092[0] = 0;
        this.field1092[1] = 65535;
        this.field1093[0] = 0;
        this.field1093[1] = 65535;
    }

    @ObfuscatedName("aa.e(Ldk;)V")
    public final void method1009(class107 arg0) {
        this.field1096 = arg0.method2226();
        this.field1094 = arg0.method2121();
        this.field1095 = arg0.method2121();
        this.method1004(arg0);
    }

    @ObfuscatedName("aa.v(Ldk;)V")
    public final void method1004(class107 arg0) {
        this.field1099 = arg0.method2226();
        this.field1092 = new int[this.field1099];
        this.field1093 = new int[this.field1099];
        for (int var2 = 0; var2 < this.field1099; var2++) {
            this.field1092[var2] = arg0.method2152();
            this.field1093[var2] = arg0.method2152();
        }
    }

    @ObfuscatedName("aa.i()V")
    public final void method1005() {
        this.field1097 = 0;
        this.field1091 = 0;
        this.field1100 = 0;
        this.field1098 = 0;
        this.field1101 = 0;
    }

    @ObfuscatedName("aa.g(I)I")
    public final int method1012(int arg0) {
        if (this.field1101 >= this.field1097) {
            this.field1098 = this.field1093[this.field1091++] << 15;
            if (this.field1091 >= this.field1099) {
                this.field1091 = this.field1099 - 1;
            }
            this.field1097 = (int) ((double) this.field1092[this.field1091] / 65536.0D * (double) arg0);
            if (this.field1097 > this.field1101) {
                this.field1100 = ((this.field1093[this.field1091] << 15) - this.field1098) / (this.field1097 - this.field1101);
            }
        }
        this.field1098 += this.field1100;
        this.field1101++;
        return this.field1098 - this.field1100 >> 15;
    }
}
