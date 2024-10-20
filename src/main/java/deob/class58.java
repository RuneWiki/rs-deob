package deob;

@ObfuscatedName("bi")
public class class58 {

    @ObfuscatedName("bi.c")
    public int field1193 = 2;

    @ObfuscatedName("bi.h")
    public int[] field1194 = new int[2];

    @ObfuscatedName("bi.k")
    public int[] field1195 = new int[2];

    @ObfuscatedName("bi.t")
    public int field1197;

    @ObfuscatedName("bi.g")
    public int field1198;

    @ObfuscatedName("bi.o")
    public int field1202;

    @ObfuscatedName("bi.i")
    public int field1199;

    @ObfuscatedName("bi.w")
    public int field1200;

    @ObfuscatedName("bi.m")
    public int field1201;

    @ObfuscatedName("bi.r")
    public int field1196;

    @ObfuscatedName("bi.y")
    public int field1203;

    public class58() {
        this.field1194[0] = 0;
        this.field1194[1] = 65535;
        this.field1195[0] = 0;
        this.field1195[1] = 65535;
    }

    @ObfuscatedName("bi.c(Ldf;)V")
    public final void method1178(class119 arg0) {
        this.field1202 = arg0.method2291();
        this.field1197 = arg0.method2296();
        this.field1198 = arg0.method2296();
        this.method1176(arg0);
    }

    @ObfuscatedName("bi.h(Ldf;)V")
    public final void method1176(class119 arg0) {
        this.field1193 = arg0.method2291();
        this.field1194 = new int[this.field1193];
        this.field1195 = new int[this.field1193];
        for (int var2 = 0; var2 < this.field1193; var2++) {
            this.field1194[var2] = arg0.method2293();
            this.field1195[var2] = arg0.method2293();
        }
    }

    @ObfuscatedName("bi.k()V")
    public final void method1179() {
        this.field1199 = 0;
        this.field1200 = 0;
        this.field1201 = 0;
        this.field1196 = 0;
        this.field1203 = 0;
    }

    @ObfuscatedName("bi.t(I)I")
    public final int method1180(int arg0) {
        if (this.field1203 >= this.field1199) {
            this.field1196 = this.field1195[this.field1200++] << 15;
            if (this.field1200 >= this.field1193) {
                this.field1200 = this.field1193 - 1;
            }
            this.field1199 = (int) ((double) this.field1194[this.field1200] / 65536.0D * (double) arg0);
            if (this.field1199 > this.field1203) {
                this.field1201 = ((this.field1195[this.field1200] << 15) - this.field1196) / (this.field1199 - this.field1203);
            }
        }
        this.field1196 += this.field1201;
        this.field1203++;
        return this.field1196 - this.field1201 >> 15;
    }
}
