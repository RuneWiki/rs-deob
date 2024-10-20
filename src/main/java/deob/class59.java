package deob;

@ObfuscatedName("bx")
public class class59 {

    @ObfuscatedName("bx.n")
    public int field1075 = 2;

    @ObfuscatedName("bx.g")
    public int[] field1076 = new int[2];

    @ObfuscatedName("bx.v")
    public int[] field1077 = new int[2];

    @ObfuscatedName("bx.y")
    public int field1085;

    @ObfuscatedName("bx.p")
    public int field1078;

    @ObfuscatedName("bx.j")
    public int field1080;

    @ObfuscatedName("bx.m")
    public int field1083;

    @ObfuscatedName("bx.a")
    public int field1081;

    @ObfuscatedName("bx.i")
    public int field1082;

    @ObfuscatedName("bx.s")
    public int field1079;

    @ObfuscatedName("bx.k")
    public int field1084;

    public class59() {
        this.field1076[0] = 0;
        this.field1076[1] = 65535;
        this.field1077[0] = 0;
        this.field1077[1] = 65535;
    }

    @ObfuscatedName("bx.x(Leq;)V")
    public final void method1160(class154 arg0) {
        this.field1083 = arg0.method2878();
        this.field1078 = arg0.method2803();
        this.field1080 = arg0.method2803();
        this.method1161(arg0);
    }

    @ObfuscatedName("bx.n(Leq;)V")
    public final void method1161(class154 arg0) {
        this.field1075 = arg0.method2878();
        this.field1076 = new int[this.field1075];
        this.field1077 = new int[this.field1075];
        for (int var2 = 0; var2 < this.field1075; var2++) {
            this.field1076[var2] = arg0.method2833();
            this.field1077[var2] = arg0.method2833();
        }
    }

    @ObfuscatedName("bx.g()V")
    public final void method1159() {
        this.field1081 = 0;
        this.field1082 = 0;
        this.field1079 = 0;
        this.field1084 = 0;
        this.field1085 = 0;
    }

    @ObfuscatedName("bx.v(I)I")
    public final int method1174(int arg0) {
        if (this.field1085 >= this.field1081) {
            this.field1084 = this.field1077[this.field1082++] << 15;
            if (this.field1082 >= this.field1075) {
                this.field1082 = this.field1075 - 1;
            }
            this.field1081 = (int) ((double) this.field1076[this.field1082] / 65536.0D * (double) arg0);
            if (this.field1081 > this.field1085) {
                this.field1079 = ((this.field1077[this.field1082] << 15) - this.field1084) / (this.field1081 - this.field1085);
            }
        }
        this.field1084 += this.field1079;
        this.field1085++;
        return this.field1084 - this.field1079 >> 15;
    }
}
