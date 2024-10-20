package deob;

@ObfuscatedName("bc")
public class class56 {

    @ObfuscatedName("bc.p")
    public int field1170 = 2;

    @ObfuscatedName("bc.k")
    public int[] field1169 = new int[2];

    @ObfuscatedName("bc.a")
    public int[] field1162 = new int[2];

    @ObfuscatedName("bc.q")
    public int field1163;

    @ObfuscatedName("bc.j")
    public int field1164;

    @ObfuscatedName("bc.v")
    public int field1165;

    @ObfuscatedName("bc.w")
    public int field1166;

    @ObfuscatedName("bc.l")
    public int field1167;

    @ObfuscatedName("bc.s")
    public int field1161;

    @ObfuscatedName("bc.n")
    public int field1160;

    @ObfuscatedName("bc.c")
    public int field1168;

    public class56() {
        this.field1169[0] = 0;
        this.field1169[1] = 65535;
        this.field1162[0] = 0;
        this.field1162[1] = 65535;
    }

    @ObfuscatedName("bc.x(Ldg;)V")
    public final void method1216(class127 arg0) {
        this.field1165 = arg0.method2484();
        this.field1163 = arg0.method2415();
        this.field1164 = arg0.method2415();
        this.method1210(arg0);
    }

    @ObfuscatedName("bc.p(Ldg;)V")
    public final void method1210(class127 arg0) {
        this.field1170 = arg0.method2484();
        this.field1169 = new int[this.field1170];
        this.field1162 = new int[this.field1170];
        for (int var2 = 0; var2 < this.field1170; var2++) {
            this.field1169[var2] = arg0.method2539();
            this.field1162[var2] = arg0.method2539();
        }
    }

    @ObfuscatedName("bc.k()V")
    public final void method1213() {
        this.field1166 = 0;
        this.field1167 = 0;
        this.field1161 = 0;
        this.field1160 = 0;
        this.field1168 = 0;
    }

    @ObfuscatedName("bc.a(I)I")
    public final int method1212(int arg0) {
        if (this.field1168 >= this.field1166) {
            this.field1160 = this.field1162[this.field1167++] << 15;
            if (this.field1167 >= this.field1170) {
                this.field1167 = this.field1170 - 1;
            }
            this.field1166 = (int) ((double) this.field1169[this.field1167] / 65536.0D * (double) arg0);
            if (this.field1166 > this.field1168) {
                this.field1161 = ((this.field1162[this.field1167] << 15) - this.field1160) / (this.field1166 - this.field1168);
            }
        }
        this.field1160 += this.field1161;
        this.field1168++;
        return this.field1160 - this.field1161 >> 15;
    }
}
