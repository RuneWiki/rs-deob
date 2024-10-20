package deob;

@ObfuscatedName("be")
public class class59 {

    @ObfuscatedName("be.b")
    public int field1079 = 2;

    @ObfuscatedName("be.e")
    public int[] field1074 = new int[2];

    @ObfuscatedName("be.c")
    public int[] field1081 = new int[2];

    @ObfuscatedName("be.l")
    public int field1076;

    @ObfuscatedName("be.y")
    public int field1083;

    @ObfuscatedName("be.j")
    public int field1077;

    @ObfuscatedName("be.g")
    public int field1078;

    @ObfuscatedName("be.s")
    public int field1082;

    @ObfuscatedName("be.r")
    public int field1073;

    @ObfuscatedName("be.t")
    public int field1080;

    @ObfuscatedName("be.k")
    public int field1075;

    public class59() {
        this.field1074[0] = 0;
        this.field1074[1] = 65535;
        this.field1081[0] = 0;
        this.field1081[1] = 65535;
    }

    @ObfuscatedName("be.b(Lec;)V")
    public final void method1100(class154 arg0) {
        this.field1078 = arg0.method2669();
        this.field1076 = arg0.method2815();
        this.field1077 = arg0.method2815();
        this.method1115(arg0);
    }

    @ObfuscatedName("be.e(Lec;)V")
    public final void method1115(class154 arg0) {
        this.field1079 = arg0.method2669();
        this.field1074 = new int[this.field1079];
        this.field1081 = new int[this.field1079];
        for (int var2 = 0; var2 < this.field1079; var2++) {
            this.field1074[var2] = arg0.method2671();
            this.field1081[var2] = arg0.method2671();
        }
    }

    @ObfuscatedName("be.c()V")
    public final void method1102() {
        this.field1082 = 0;
        this.field1073 = 0;
        this.field1080 = 0;
        this.field1075 = 0;
        this.field1083 = 0;
    }

    @ObfuscatedName("be.l(I)I")
    public final int method1099(int arg0) {
        if (this.field1083 >= this.field1082) {
            this.field1075 = this.field1081[this.field1073++] << 15;
            if (this.field1073 >= this.field1079) {
                this.field1073 = this.field1079 - 1;
            }
            this.field1082 = (int) ((double) this.field1074[this.field1073] / 65536.0D * (double) arg0);
            if (this.field1082 > this.field1083) {
                this.field1080 = ((this.field1081[this.field1073] << 15) - this.field1075) / (this.field1082 - this.field1083);
            }
        }
        this.field1075 += this.field1080;
        this.field1083++;
        return this.field1075 - this.field1080 >> 15;
    }
}
