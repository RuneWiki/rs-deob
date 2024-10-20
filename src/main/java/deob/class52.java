package deob;

@ObfuscatedName("aa")
public class class52 {

    @ObfuscatedName("aa.f")
    public int field1115 = 2;

    @ObfuscatedName("aa.k")
    public int[] field1113 = new int[2];

    @ObfuscatedName("aa.y")
    public int field1122;

    @ObfuscatedName("aa.e")
    public int[] field1114 = new int[2];

    @ObfuscatedName("aa.r")
    public int field1112;

    @ObfuscatedName("aa.a")
    public int field1116;

    @ObfuscatedName("aa.n")
    public int field1117;

    @ObfuscatedName("aa.g")
    public int field1118;

    @ObfuscatedName("aa.o")
    public int field1119;

    @ObfuscatedName("aa.p")
    public int field1120;

    @ObfuscatedName("aa.v")
    public int field1121;

    public class52() {
        this.field1113[0] = 0;
        this.field1113[1] = 65535;
        this.field1114[0] = 0;
        this.field1114[1] = 65535;
    }

    @ObfuscatedName("aa.f(Ldu;)V")
    public final void method1066(class108 arg0) {
        this.field1117 = arg0.method2158();
        this.field1112 = arg0.method2256();
        this.field1116 = arg0.method2256();
        this.method1064(arg0);
    }

    @ObfuscatedName("aa.k(Ldu;)V")
    public final void method1064(class108 arg0) {
        this.field1115 = arg0.method2158();
        this.field1113 = new int[this.field1115];
        this.field1114 = new int[this.field1115];
        for (int var2 = 0; var2 < this.field1115; var2++) {
            this.field1113[var2] = arg0.method2160();
            this.field1114[var2] = arg0.method2160();
        }
    }

    @ObfuscatedName("aa.y()V")
    public final void method1067() {
        this.field1118 = 0;
        this.field1119 = 0;
        this.field1120 = 0;
        this.field1121 = 0;
        this.field1122 = 0;
    }

    @ObfuscatedName("aa.e(I)I")
    public final int method1068(int arg0) {
        if (this.field1122 >= this.field1118) {
            this.field1121 = this.field1114[this.field1119++] << 15;
            if (this.field1119 >= this.field1115) {
                this.field1119 = this.field1115 - 1;
            }
            this.field1118 = (int) ((double) this.field1113[this.field1119] / 65536.0D * (double) arg0);
            if (this.field1118 > this.field1122) {
                this.field1120 = ((this.field1114[this.field1119] << 15) - this.field1121) / (this.field1118 - this.field1122);
            }
        }
        this.field1121 += this.field1120;
        this.field1122++;
        return this.field1121 - this.field1120 >> 15;
    }
}
