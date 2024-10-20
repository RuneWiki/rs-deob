package deob;

@ObfuscatedName("ba")
public class class53 {

    @ObfuscatedName("ba.o")
    public int field1124 = 2;

    @ObfuscatedName("ba.l")
    public int[] field1121 = new int[2];

    @ObfuscatedName("ba.g")
    public int[] field1122 = new int[2];

    @ObfuscatedName("ba.u")
    public int field1120;

    @ObfuscatedName("ba.q")
    public int field1123;

    @ObfuscatedName("ba.r")
    public int field1125;

    @ObfuscatedName("ba.v")
    public int field1126;

    @ObfuscatedName("ba.y")
    public int field1130;

    @ObfuscatedName("ba.k")
    public int field1128;

    @ObfuscatedName("ba.c")
    public int field1127;

    @ObfuscatedName("ba.j")
    public int field1129;

    public class53() {
        this.field1121[0] = 0;
        this.field1121[1] = 65535;
        this.field1122[0] = 0;
        this.field1122[1] = 65535;
    }

    @ObfuscatedName("ba.o(Ldk;)V")
    public final void method1111(class111 arg0) {
        this.field1125 = arg0.method2219();
        this.field1120 = arg0.method2273();
        this.field1123 = arg0.method2273();
        this.method1114(arg0);
    }

    @ObfuscatedName("ba.l(Ldk;)V")
    public final void method1114(class111 arg0) {
        this.field1124 = arg0.method2219();
        this.field1121 = new int[this.field1124];
        this.field1122 = new int[this.field1124];
        for (int var2 = 0; var2 < this.field1124; var2++) {
            this.field1121[var2] = arg0.method2397();
            this.field1122[var2] = arg0.method2397();
        }
    }

    @ObfuscatedName("ba.g()V")
    public final void method1110() {
        this.field1126 = 0;
        this.field1128 = 0;
        this.field1127 = 0;
        this.field1129 = 0;
        this.field1130 = 0;
    }

    @ObfuscatedName("ba.u(I)I")
    public final int method1113(int arg0) {
        if (this.field1130 >= this.field1126) {
            this.field1129 = this.field1122[this.field1128++] << 15;
            if (this.field1128 >= this.field1124) {
                this.field1128 = this.field1124 - 1;
            }
            this.field1126 = (int) ((double) this.field1121[this.field1128] / 65536.0D * (double) arg0);
            if (this.field1126 > this.field1130) {
                this.field1127 = ((this.field1122[this.field1128] << 15) - this.field1129) / (this.field1126 - this.field1130);
            }
        }
        this.field1129 += this.field1127;
        this.field1130++;
        return this.field1129 - this.field1127 >> 15;
    }
}
