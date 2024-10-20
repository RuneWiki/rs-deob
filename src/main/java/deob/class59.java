package deob;

@ObfuscatedName("bm")
public class class59 {

    @ObfuscatedName("bm.j")
    public int field1080 = 2;

    @ObfuscatedName("bm.c")
    public int[] field1073 = new int[2];

    @ObfuscatedName("bm.d")
    public int[] field1074 = new int[2];

    @ObfuscatedName("bm.w")
    public int field1076;

    @ObfuscatedName("bm.h")
    public int field1072;

    @ObfuscatedName("bm.u")
    public int field1079;

    @ObfuscatedName("bm.k")
    public int field1078;

    @ObfuscatedName("bm.g")
    public int field1077;

    @ObfuscatedName("bm.y")
    public int field1082;

    @ObfuscatedName("bm.e")
    public int field1075;

    @ObfuscatedName("bm.q")
    public int field1081;

    public class59() {
        this.field1073[0] = 0;
        this.field1073[1] = 65535;
        this.field1074[0] = 0;
        this.field1074[1] = 65535;
    }

    @ObfuscatedName("bm.x(Lek;)V")
    public final void method1156(class154 arg0) {
        this.field1079 = arg0.method2701();
        this.field1076 = arg0.method2644();
        this.field1072 = arg0.method2644();
        this.method1152(arg0);
    }

    @ObfuscatedName("bm.j(Lek;)V")
    public final void method1152(class154 arg0) {
        this.field1080 = arg0.method2701();
        this.field1073 = new int[this.field1080];
        this.field1074 = new int[this.field1080];
        for (int var2 = 0; var2 < this.field1080; var2++) {
            this.field1073[var2] = arg0.method2745();
            this.field1074[var2] = arg0.method2745();
        }
    }

    @ObfuscatedName("bm.c()V")
    public final void method1159() {
        this.field1078 = 0;
        this.field1077 = 0;
        this.field1075 = 0;
        this.field1081 = 0;
        this.field1082 = 0;
    }

    @ObfuscatedName("bm.d(I)I")
    public final int method1154(int arg0) {
        if (this.field1082 >= this.field1078) {
            this.field1081 = this.field1074[this.field1077++] << 15;
            if (this.field1077 >= this.field1080) {
                this.field1077 = this.field1080 - 1;
            }
            this.field1078 = (int) ((double) this.field1073[this.field1077] / 65536.0D * (double) arg0);
            if (this.field1078 > this.field1082) {
                this.field1075 = ((this.field1074[this.field1077] << 15) - this.field1081) / (this.field1078 - this.field1082);
            }
        }
        this.field1081 += this.field1075;
        this.field1082++;
        return this.field1081 - this.field1075 >> 15;
    }
}
