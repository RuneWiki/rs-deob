package deob;

@ObfuscatedName("bt")
public class class53 {

    @ObfuscatedName("bt.t")
    public int field1113 = 2;

    @ObfuscatedName("bt.b")
    public int[] field1114 = new int[2];

    @ObfuscatedName("bt.p")
    public int[] field1119 = new int[2];

    @ObfuscatedName("bt.e")
    public int field1116;

    @ObfuscatedName("bt.i")
    public int field1117;

    @ObfuscatedName("bt.o")
    public int field1118;

    @ObfuscatedName("bt.f")
    public int field1120;

    @ObfuscatedName("bt.d")
    public int field1115;

    @ObfuscatedName("bt.j")
    public int field1121;

    @ObfuscatedName("bt.v")
    public int field1122;

    @ObfuscatedName("bt.a")
    public int field1123;

    public class53() {
        this.field1114[0] = 0;
        this.field1114[1] = 65535;
        this.field1119[0] = 0;
        this.field1119[1] = 65535;
    }

    @ObfuscatedName("bt.t(Ldc;)V")
    public final void method1115(class111 arg0) {
        this.field1118 = arg0.method2172();
        this.field1116 = arg0.method2177();
        this.field1117 = arg0.method2177();
        this.method1116(arg0);
    }

    @ObfuscatedName("bt.b(Ldc;)V")
    public final void method1116(class111 arg0) {
        this.field1113 = arg0.method2172();
        this.field1114 = new int[this.field1113];
        this.field1119 = new int[this.field1113];
        for (int var2 = 0; var2 < this.field1113; var2++) {
            this.field1114[var2] = arg0.method2255();
            this.field1119[var2] = arg0.method2255();
        }
    }

    @ObfuscatedName("bt.p()V")
    public final void method1121() {
        this.field1120 = 0;
        this.field1115 = 0;
        this.field1121 = 0;
        this.field1122 = 0;
        this.field1123 = 0;
    }

    @ObfuscatedName("bt.e(I)I")
    public final int method1118(int arg0) {
        if (this.field1123 >= this.field1120) {
            this.field1122 = this.field1119[this.field1115++] << 15;
            if (this.field1115 >= this.field1113) {
                this.field1115 = this.field1113 - 1;
            }
            this.field1120 = (int) ((double) this.field1114[this.field1115] / 65536.0D * (double) arg0);
            if (this.field1120 > this.field1123) {
                this.field1121 = ((this.field1119[this.field1115] << 15) - this.field1122) / (this.field1120 - this.field1123);
            }
        }
        this.field1122 += this.field1121;
        this.field1123++;
        return this.field1122 - this.field1121 >> 15;
    }
}
