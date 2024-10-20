package deob;

@ObfuscatedName("av")
public class class52 {

    @ObfuscatedName("av.e")
    public int field1127 = 2;

    @ObfuscatedName("av.v")
    public int[] field1119 = new int[2];

    @ObfuscatedName("av.k")
    public int[] field1124 = new int[2];

    @ObfuscatedName("av.g")
    public int field1122;

    @ObfuscatedName("av.q")
    public int field1123;

    @ObfuscatedName("av.l")
    public int field1121;

    @ObfuscatedName("av.a")
    public int field1125;

    @ObfuscatedName("av.b")
    public int field1120;

    @ObfuscatedName("av.z")
    public int field1126;

    @ObfuscatedName("av.w")
    public int field1128;

    @ObfuscatedName("av.j")
    public int field1129;

    public class52() {
        this.field1119[0] = 0;
        this.field1119[1] = 65535;
        this.field1124[0] = 0;
        this.field1124[1] = 65535;
    }

    @ObfuscatedName("av.e(Ldd;)V")
    public final void method1029(class108 arg0) {
        this.field1121 = arg0.method2122();
        this.field1122 = arg0.method2127();
        this.field1123 = arg0.method2127();
        this.method1041(arg0);
    }

    @ObfuscatedName("av.v(Ldd;)V")
    public final void method1041(class108 arg0) {
        this.field1127 = arg0.method2122();
        this.field1119 = new int[this.field1127];
        this.field1124 = new int[this.field1127];
        for (int var2 = 0; var2 < this.field1127; var2++) {
            this.field1119[var2] = arg0.method2124();
            this.field1124[var2] = arg0.method2124();
        }
    }

    @ObfuscatedName("av.k()V")
    public final void method1030() {
        this.field1125 = 0;
        this.field1120 = 0;
        this.field1126 = 0;
        this.field1128 = 0;
        this.field1129 = 0;
    }

    @ObfuscatedName("av.g(I)I")
    public final int method1031(int arg0) {
        if (this.field1129 >= this.field1125) {
            this.field1128 = this.field1124[this.field1120++] << 15;
            if (this.field1120 >= this.field1127) {
                this.field1120 = this.field1127 - 1;
            }
            this.field1125 = (int) ((double) this.field1119[this.field1120] / 65536.0D * (double) arg0);
            if (this.field1125 > this.field1129) {
                this.field1126 = ((this.field1124[this.field1120] << 15) - this.field1128) / (this.field1125 - this.field1129);
            }
        }
        this.field1128 += this.field1126;
        this.field1129++;
        return this.field1128 - this.field1126 >> 15;
    }
}
