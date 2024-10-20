package deob;

@ObfuscatedName("bf")
public class class59 {

    @ObfuscatedName("bf.b")
    public int field1048 = 2;

    @ObfuscatedName("bf.l")
    public int[] field1056 = new int[2];

    @ObfuscatedName("bf.i")
    public int[] field1050 = new int[2];

    @ObfuscatedName("bf.t")
    public int field1051;

    @ObfuscatedName("bf.k")
    public int field1052;

    @ObfuscatedName("bf.h")
    public int field1053;

    @ObfuscatedName("bf.n")
    public int field1057;

    @ObfuscatedName("bf.f")
    public int field1055;

    @ObfuscatedName("bf.a")
    public int field1054;

    @ObfuscatedName("bf.r")
    public int field1049;

    @ObfuscatedName("bf.z")
    public int field1058;

    public class59() {
        this.field1056[0] = 0;
        this.field1056[1] = 65535;
        this.field1050[0] = 0;
        this.field1050[1] = 65535;
    }

    @ObfuscatedName("bf.b(Leg;)V")
    public final void method1135(class154 arg0) {
        this.field1053 = arg0.method2678();
        this.field1051 = arg0.method2683();
        this.field1052 = arg0.method2683();
        this.method1136(arg0);
    }

    @ObfuscatedName("bf.l(Leg;)V")
    public final void method1136(class154 arg0) {
        this.field1048 = arg0.method2678();
        this.field1056 = new int[this.field1048];
        this.field1050 = new int[this.field1048];
        for (int var2 = 0; var2 < this.field1048; var2++) {
            this.field1056[var2] = arg0.method2801();
            this.field1050[var2] = arg0.method2801();
        }
    }

    @ObfuscatedName("bf.i()V")
    public final void method1138() {
        this.field1057 = 0;
        this.field1055 = 0;
        this.field1054 = 0;
        this.field1049 = 0;
        this.field1058 = 0;
    }

    @ObfuscatedName("bf.t(I)I")
    public final int method1137(int arg0) {
        if (this.field1058 >= this.field1057) {
            this.field1049 = this.field1050[this.field1055++] << 15;
            if (this.field1055 >= this.field1048) {
                this.field1055 = this.field1048 - 1;
            }
            this.field1057 = (int) ((double) this.field1056[this.field1055] / 65536.0D * (double) arg0);
            if (this.field1057 > this.field1058) {
                this.field1054 = ((this.field1050[this.field1055] << 15) - this.field1049) / (this.field1057 - this.field1058);
            }
        }
        this.field1049 += this.field1054;
        this.field1058++;
        return this.field1049 - this.field1054 >> 15;
    }
}
