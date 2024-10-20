package deob;

@ObfuscatedName("bd")
public class class58 {

    @ObfuscatedName("bd.m")
    public int field1161 = 2;

    @ObfuscatedName("bd.l")
    public int[] field1159 = new int[2];

    @ObfuscatedName("bd.y")
    public int field1168;

    @ObfuscatedName("bd.u")
    public int[] field1160 = new int[2];

    @ObfuscatedName("bd.k")
    public int field1158;

    @ObfuscatedName("bd.j")
    public int field1162;

    @ObfuscatedName("bd.i")
    public int field1163;

    @ObfuscatedName("bd.g")
    public int field1164;

    @ObfuscatedName("bd.e")
    public int field1165;

    @ObfuscatedName("bd.p")
    public int field1166;

    @ObfuscatedName("bd.a")
    public int field1167;

    public class58() {
        this.field1159[0] = 0;
        this.field1159[1] = 65535;
        this.field1160[0] = 0;
        this.field1160[1] = 65535;
    }

    @ObfuscatedName("bd.m(Ldx;)V")
    public final void method1228(class119 arg0) {
        this.field1163 = arg0.method2562();
        this.field1158 = arg0.method2386();
        this.field1162 = arg0.method2386();
        this.method1235(arg0);
    }

    @ObfuscatedName("bd.l(Ldx;)V")
    public final void method1235(class119 arg0) {
        this.field1161 = arg0.method2562();
        this.field1159 = new int[this.field1161];
        this.field1160 = new int[this.field1161];
        for (int var2 = 0; var2 < this.field1161; var2++) {
            this.field1159[var2] = arg0.method2541();
            this.field1160[var2] = arg0.method2541();
        }
    }

    @ObfuscatedName("bd.y()V")
    public final void method1227() {
        this.field1164 = 0;
        this.field1165 = 0;
        this.field1166 = 0;
        this.field1167 = 0;
        this.field1168 = 0;
    }

    @ObfuscatedName("bd.u(I)I")
    public final int method1230(int arg0) {
        if (this.field1168 >= this.field1164) {
            this.field1167 = this.field1160[this.field1165++] << 15;
            if (this.field1165 >= this.field1161) {
                this.field1165 = this.field1161 - 1;
            }
            this.field1164 = (int) ((double) this.field1159[this.field1165] / 65536.0D * (double) arg0);
            if (this.field1164 > this.field1168) {
                this.field1166 = ((this.field1160[this.field1165] << 15) - this.field1167) / (this.field1164 - this.field1168);
            }
        }
        this.field1167 += this.field1166;
        this.field1168++;
        return this.field1167 - this.field1166 >> 15;
    }
}
