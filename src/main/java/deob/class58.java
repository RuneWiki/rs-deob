package deob;

@ObfuscatedName("bv")
public class class58 {

    @ObfuscatedName("bv.a")
    public int field1204 = 2;

    @ObfuscatedName("bv.r")
    public int[] field1198 = new int[2];

    @ObfuscatedName("bv.f")
    public int[] field1207 = new int[2];

    @ObfuscatedName("bv.s")
    public int field1200;

    @ObfuscatedName("bv.y")
    public int field1202;

    @ObfuscatedName("bv.e")
    public int field1201;

    @ObfuscatedName("bv.g")
    public int field1199;

    @ObfuscatedName("bv.m")
    public int field1203;

    @ObfuscatedName("bv.j")
    public int field1197;

    @ObfuscatedName("bv.n")
    public int field1205;

    @ObfuscatedName("bv.l")
    public int field1206;

    public class58() {
        this.field1198[0] = 0;
        this.field1198[1] = 65535;
        this.field1207[0] = 0;
        this.field1207[1] = 65535;
    }

    @ObfuscatedName("bv.a(Lds;)V")
    public final void method1208(class119 arg0) {
        this.field1199 = arg0.method2412();
        this.field1200 = arg0.method2350();
        this.field1201 = arg0.method2350();
        this.method1197(arg0);
    }

    @ObfuscatedName("bv.r(Lds;)V")
    public final void method1197(class119 arg0) {
        this.field1204 = arg0.method2412();
        this.field1198 = new int[this.field1204];
        this.field1207 = new int[this.field1204];
        for (int var2 = 0; var2 < this.field1204; var2++) {
            this.field1198[var2] = arg0.method2347();
            this.field1207[var2] = arg0.method2347();
        }
    }

    @ObfuscatedName("bv.f()V")
    public final void method1198() {
        this.field1203 = 0;
        this.field1197 = 0;
        this.field1205 = 0;
        this.field1206 = 0;
        this.field1202 = 0;
    }

    @ObfuscatedName("bv.s(I)I")
    public final int method1199(int arg0) {
        if (this.field1202 >= this.field1203) {
            this.field1206 = this.field1207[this.field1197++] << 15;
            if (this.field1197 >= this.field1204) {
                this.field1197 = this.field1204 - 1;
            }
            this.field1203 = (int) ((double) this.field1198[this.field1197] / 65536.0D * (double) arg0);
            if (this.field1203 > this.field1202) {
                this.field1205 = ((this.field1207[this.field1197] << 15) - this.field1206) / (this.field1203 - this.field1202);
            }
        }
        this.field1206 += this.field1205;
        this.field1202++;
        return this.field1206 - this.field1205 >> 15;
    }
}
