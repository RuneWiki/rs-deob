package deob;

@ObfuscatedName("bj")
public class class53 {

    @ObfuscatedName("bj.n")
    public int field1128 = 2;

    @ObfuscatedName("bj.w")
    public int[] field1135 = new int[2];

    @ObfuscatedName("bj.i")
    public int[] field1129 = new int[2];

    @ObfuscatedName("bj.e")
    public int field1130;

    @ObfuscatedName("bj.h")
    public int field1127;

    @ObfuscatedName("bj.q")
    public int field1132;

    @ObfuscatedName("bj.l")
    public int field1133;

    @ObfuscatedName("bj.c")
    public int field1134;

    @ObfuscatedName("bj.f")
    public int field1131;

    @ObfuscatedName("bj.s")
    public int field1136;

    @ObfuscatedName("bj.m")
    public int field1137;

    public class53() {
        this.field1135[0] = 0;
        this.field1135[1] = 65535;
        this.field1129[0] = 0;
        this.field1129[1] = 65535;
    }

    @ObfuscatedName("bj.n(Ldo;)V")
    public final void method1070(class111 arg0) {
        this.field1132 = arg0.method2155();
        this.field1130 = arg0.method2160();
        this.field1127 = arg0.method2160();
        this.method1078(arg0);
    }

    @ObfuscatedName("bj.w(Ldo;)V")
    public final void method1078(class111 arg0) {
        this.field1128 = arg0.method2155();
        this.field1135 = new int[this.field1128];
        this.field1129 = new int[this.field1128];
        for (int var2 = 0; var2 < this.field1128; var2++) {
            this.field1135[var2] = arg0.method2157();
            this.field1129[var2] = arg0.method2157();
        }
    }

    @ObfuscatedName("bj.i()V")
    public final void method1076() {
        this.field1133 = 0;
        this.field1134 = 0;
        this.field1131 = 0;
        this.field1136 = 0;
        this.field1137 = 0;
    }

    @ObfuscatedName("bj.e(I)I")
    public final int method1072(int arg0) {
        if (this.field1137 >= this.field1133) {
            this.field1136 = this.field1129[this.field1134++] << 15;
            if (this.field1134 >= this.field1128) {
                this.field1134 = this.field1128 - 1;
            }
            this.field1133 = (int) ((double) this.field1135[this.field1134] / 65536.0D * (double) arg0);
            if (this.field1133 > this.field1137) {
                this.field1131 = ((this.field1129[this.field1134] << 15) - this.field1136) / (this.field1133 - this.field1137);
            }
        }
        this.field1136 += this.field1131;
        this.field1137++;
        return this.field1136 - this.field1131 >> 15;
    }
}
