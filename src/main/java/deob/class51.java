package deob;

@ObfuscatedName("au")
public class class51 {

    @ObfuscatedName("au.k")
    public int field1100 = 2;

    @ObfuscatedName("au.r")
    public int[] field1099 = new int[2];

    @ObfuscatedName("au.y")
    public int field1108;

    @ObfuscatedName("au.w")
    public int[] field1104 = new int[2];

    @ObfuscatedName("au.m")
    public int field1101;

    @ObfuscatedName("au.j")
    public int field1102;

    @ObfuscatedName("au.g")
    public int field1103;

    @ObfuscatedName("au.p")
    public int field1105;

    @ObfuscatedName("au.o")
    public int field1106;

    @ObfuscatedName("au.b")
    public int field1098;

    @ObfuscatedName("au.n")
    public int field1107;

    public class51() {
        this.field1099[0] = 0;
        this.field1099[1] = 65535;
        this.field1104[0] = 0;
        this.field1104[1] = 65535;
    }

    @ObfuscatedName("au.k(Lde;)V")
    public final void method1035(class107 arg0) {
        this.field1103 = arg0.method2111();
        this.field1101 = arg0.method2116();
        this.field1102 = arg0.method2116();
        this.method1048(arg0);
    }

    @ObfuscatedName("au.r(Lde;)V")
    public final void method1048(class107 arg0) {
        this.field1100 = arg0.method2111();
        this.field1099 = new int[this.field1100];
        this.field1104 = new int[this.field1100];
        for (int var2 = 0; var2 < this.field1100; var2++) {
            this.field1099[var2] = arg0.method2232();
            this.field1104[var2] = arg0.method2232();
        }
    }

    @ObfuscatedName("au.y()V")
    public final void method1037() {
        this.field1105 = 0;
        this.field1106 = 0;
        this.field1098 = 0;
        this.field1107 = 0;
        this.field1108 = 0;
    }

    @ObfuscatedName("au.w(I)I")
    public final int method1038(int arg0) {
        if (this.field1108 >= this.field1105) {
            this.field1107 = this.field1104[this.field1106++] << 15;
            if (this.field1106 >= this.field1100) {
                this.field1106 = this.field1100 - 1;
            }
            this.field1105 = (int) ((double) this.field1099[this.field1106] / 65536.0D * (double) arg0);
            if (this.field1105 > this.field1108) {
                this.field1098 = ((this.field1104[this.field1106] << 15) - this.field1107) / (this.field1105 - this.field1108);
            }
        }
        this.field1107 += this.field1098;
        this.field1108++;
        return this.field1107 - this.field1098 >> 15;
    }
}
