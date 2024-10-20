package deob;

@ObfuscatedName("bj")
public class class53 {

    @ObfuscatedName("bj.b")
    public int field1131 = 2;

    @ObfuscatedName("bj.e")
    public int[] field1130 = new int[2];

    @ObfuscatedName("bj.a")
    public int[] field1129 = new int[2];

    @ObfuscatedName("bj.k")
    public int field1132;

    @ObfuscatedName("bj.p")
    public int field1133;

    @ObfuscatedName("bj.l")
    public int field1134;

    @ObfuscatedName("bj.u")
    public int field1135;

    @ObfuscatedName("bj.o")
    public int field1137;

    @ObfuscatedName("bj.m")
    public int field1136;

    @ObfuscatedName("bj.q")
    public int field1138;

    @ObfuscatedName("bj.v")
    public int field1139;

    public class53() {
        this.field1130[0] = 0;
        this.field1130[1] = 65535;
        this.field1129[0] = 0;
        this.field1129[1] = 65535;
    }

    @ObfuscatedName("bj.b(Ldj;)V")
    public final void method1039(class111 arg0) {
        this.field1134 = arg0.method2127();
        this.field1132 = arg0.method2194();
        this.field1133 = arg0.method2194();
        this.method1050(arg0);
    }

    @ObfuscatedName("bj.e(Ldj;)V")
    public final void method1050(class111 arg0) {
        this.field1131 = arg0.method2127();
        this.field1130 = new int[this.field1131];
        this.field1129 = new int[this.field1131];
        for (int var2 = 0; var2 < this.field1131; var2++) {
            this.field1130[var2] = arg0.method2129();
            this.field1129[var2] = arg0.method2129();
        }
    }

    @ObfuscatedName("bj.a()V")
    public final void method1047() {
        this.field1135 = 0;
        this.field1137 = 0;
        this.field1136 = 0;
        this.field1138 = 0;
        this.field1139 = 0;
    }

    @ObfuscatedName("bj.k(I)I")
    public final int method1042(int arg0) {
        if (this.field1139 >= this.field1135) {
            this.field1138 = this.field1129[this.field1137++] << 15;
            if (this.field1137 >= this.field1131) {
                this.field1137 = this.field1131 - 1;
            }
            this.field1135 = (int) ((double) this.field1130[this.field1137] / 65536.0D * (double) arg0);
            if (this.field1135 > this.field1139) {
                this.field1136 = ((this.field1129[this.field1137] << 15) - this.field1138) / (this.field1135 - this.field1139);
            }
        }
        this.field1138 += this.field1136;
        this.field1139++;
        return this.field1138 - this.field1136 >> 15;
    }
}
