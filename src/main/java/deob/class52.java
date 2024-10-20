package deob;

@ObfuscatedName("av")
public class class52 {

    @ObfuscatedName("av.g")
    public int field1113 = 2;

    @ObfuscatedName("av.j")
    public int[] field1107 = new int[2];

    @ObfuscatedName("av.z")
    public int[] field1106 = new int[2];

    @ObfuscatedName("av.b")
    public int field1112;

    @ObfuscatedName("av.k")
    public int field1108;

    @ObfuscatedName("av.c")
    public int field1109;

    @ObfuscatedName("av.w")
    public int field1110;

    @ObfuscatedName("av.l")
    public int field1111;

    @ObfuscatedName("av.n")
    public int field1104;

    @ObfuscatedName("av.d")
    public int field1105;

    @ObfuscatedName("av.h")
    public int field1114;

    public class52() {
        this.field1107[0] = 0;
        this.field1107[1] = 65535;
        this.field1106[0] = 0;
        this.field1106[1] = 65535;
    }

    @ObfuscatedName("av.g(Ldf;)V")
    public final void method997(class108 arg0) {
        this.field1109 = arg0.method2083();
        this.field1112 = arg0.method2117();
        this.field1108 = arg0.method2117();
        this.method998(arg0);
    }

    @ObfuscatedName("av.j(Ldf;)V")
    public final void method998(class108 arg0) {
        this.field1113 = arg0.method2083();
        this.field1107 = new int[this.field1113];
        this.field1106 = new int[this.field1113];
        for (int var2 = 0; var2 < this.field1113; var2++) {
            this.field1107[var2] = arg0.method2263();
            this.field1106[var2] = arg0.method2263();
        }
    }

    @ObfuscatedName("av.z()V")
    public final void method999() {
        this.field1110 = 0;
        this.field1111 = 0;
        this.field1104 = 0;
        this.field1105 = 0;
        this.field1114 = 0;
    }

    @ObfuscatedName("av.b(I)I")
    public final int method1007(int arg0) {
        if (this.field1114 >= this.field1110) {
            this.field1105 = this.field1106[this.field1111++] << 15;
            if (this.field1111 >= this.field1113) {
                this.field1111 = this.field1113 - 1;
            }
            this.field1110 = (int) ((double) this.field1107[this.field1111] / 65536.0D * (double) arg0);
            if (this.field1110 > this.field1114) {
                this.field1104 = ((this.field1106[this.field1111] << 15) - this.field1105) / (this.field1110 - this.field1114);
            }
        }
        this.field1105 += this.field1104;
        this.field1114++;
        return this.field1105 - this.field1104 >> 15;
    }
}
