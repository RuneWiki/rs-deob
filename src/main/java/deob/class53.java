package deob;

@ObfuscatedName("bj")
public class class53 {

    @ObfuscatedName("bj.n")
    public int field1155 = 2;

    @ObfuscatedName("bj.o")
    public int[] field1149 = new int[2];

    @ObfuscatedName("bj.a")
    public int[] field1150 = new int[2];

    @ObfuscatedName("bj.w")
    public int field1156;

    @ObfuscatedName("bj.m")
    public int field1152;

    @ObfuscatedName("bj.h")
    public int field1151;

    @ObfuscatedName("bj.i")
    public int field1154;

    @ObfuscatedName("bj.r")
    public int field1148;

    @ObfuscatedName("bj.l")
    public int field1153;

    @ObfuscatedName("bj.f")
    public int field1157;

    @ObfuscatedName("bj.e")
    public int field1158;

    public class53() {
        this.field1149[0] = 0;
        this.field1149[1] = 65535;
        this.field1150[0] = 0;
        this.field1150[1] = 65535;
    }

    @ObfuscatedName("bj.n(Ldl;)V")
    public final void method1107(class111 arg0) {
        this.field1151 = arg0.method2234();
        this.field1156 = arg0.method2239();
        this.field1152 = arg0.method2239();
        this.method1118(arg0);
    }

    @ObfuscatedName("bj.o(Ldl;)V")
    public final void method1118(class111 arg0) {
        this.field1155 = arg0.method2234();
        this.field1149 = new int[this.field1155];
        this.field1150 = new int[this.field1155];
        for (int var2 = 0; var2 < this.field1155; var2++) {
            this.field1149[var2] = arg0.method2236();
            this.field1150[var2] = arg0.method2236();
        }
    }

    @ObfuscatedName("bj.a()V")
    public final void method1110() {
        this.field1154 = 0;
        this.field1148 = 0;
        this.field1153 = 0;
        this.field1157 = 0;
        this.field1158 = 0;
    }

    @ObfuscatedName("bj.w(I)I")
    public final int method1120(int arg0) {
        if (this.field1158 >= this.field1154) {
            this.field1157 = this.field1150[this.field1148++] << 15;
            if (this.field1148 >= this.field1155) {
                this.field1148 = this.field1155 - 1;
            }
            this.field1154 = (int) ((double) this.field1149[this.field1148] / 65536.0D * (double) arg0);
            if (this.field1154 > this.field1158) {
                this.field1153 = ((this.field1150[this.field1148] << 15) - this.field1157) / (this.field1154 - this.field1158);
            }
        }
        this.field1157 += this.field1153;
        this.field1158++;
        return this.field1157 - this.field1153 >> 15;
    }
}
