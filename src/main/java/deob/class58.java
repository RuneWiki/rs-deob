package deob;

@ObfuscatedName("bh")
public class class58 {

    @ObfuscatedName("bh.o")
    public int field1194 = 2;

    @ObfuscatedName("bh.f")
    public int[] field1193 = new int[2];

    @ObfuscatedName("bh.i")
    public int[] field1195 = new int[2];

    @ObfuscatedName("bh.h")
    public int field1196;

    @ObfuscatedName("bh.q")
    public int field1197;

    @ObfuscatedName("bh.u")
    public int field1198;

    @ObfuscatedName("bh.m")
    public int field1203;

    @ObfuscatedName("bh.y")
    public int field1199;

    @ObfuscatedName("bh.p")
    public int field1200;

    @ObfuscatedName("bh.t")
    public int field1201;

    @ObfuscatedName("bh.g")
    public int field1202;

    public class58() {
        this.field1193[0] = 0;
        this.field1193[1] = 65535;
        this.field1195[0] = 0;
        this.field1195[1] = 65535;
    }

    @ObfuscatedName("bh.o(Ldc;)V")
    public final void method1150(class119 arg0) {
        this.field1198 = arg0.method2290();
        this.field1196 = arg0.method2295();
        this.field1197 = arg0.method2295();
        this.method1152(arg0);
    }

    @ObfuscatedName("bh.f(Ldc;)V")
    public final void method1152(class119 arg0) {
        this.field1194 = arg0.method2290();
        this.field1193 = new int[this.field1194];
        this.field1195 = new int[this.field1194];
        for (int var2 = 0; var2 < this.field1194; var2++) {
            this.field1193[var2] = arg0.method2292();
            this.field1195[var2] = arg0.method2292();
        }
    }

    @ObfuscatedName("bh.i()V")
    public final void method1153() {
        this.field1203 = 0;
        this.field1200 = 0;
        this.field1201 = 0;
        this.field1202 = 0;
        this.field1199 = 0;
    }

    @ObfuscatedName("bh.h(I)I")
    public final int method1157(int arg0) {
        if (this.field1199 >= this.field1203) {
            this.field1202 = this.field1195[this.field1200++] << 15;
            if (this.field1200 >= this.field1194) {
                this.field1200 = this.field1194 - 1;
            }
            this.field1203 = (int) ((double) this.field1193[this.field1200] / 65536.0D * (double) arg0);
            if (this.field1203 > this.field1199) {
                this.field1201 = ((this.field1195[this.field1200] << 15) - this.field1202) / (this.field1203 - this.field1199);
            }
        }
        this.field1202 += this.field1201;
        this.field1199++;
        return this.field1202 - this.field1201 >> 15;
    }
}
