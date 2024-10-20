package deob;

@ObfuscatedName("bz")
public class class58 {

    @ObfuscatedName("bz.i")
    public int field1206 = 2;

    @ObfuscatedName("bz.v")
    public int[] field1203 = new int[2];

    @ObfuscatedName("bz.r")
    public int[] field1204 = new int[2];

    @ObfuscatedName("bz.n")
    public int field1205;

    @ObfuscatedName("bz.q")
    public int field1211;

    @ObfuscatedName("bz.h")
    public int field1207;

    @ObfuscatedName("bz.d")
    public int field1208;

    @ObfuscatedName("bz.c")
    public int field1209;

    @ObfuscatedName("bz.y")
    public int field1202;

    @ObfuscatedName("bz.m")
    public int field1210;

    @ObfuscatedName("bz.e")
    public int field1212;

    public class58() {
        this.field1203[0] = 0;
        this.field1203[1] = 65535;
        this.field1204[0] = 0;
        this.field1204[1] = 65535;
    }

    @ObfuscatedName("bz.i(Ldx;)V")
    public final void method1223(class119 arg0) {
        this.field1207 = arg0.method2380();
        this.field1205 = arg0.method2350();
        this.field1211 = arg0.method2350();
        this.method1221(arg0);
    }

    @ObfuscatedName("bz.v(Ldx;)V")
    public final void method1221(class119 arg0) {
        this.field1206 = arg0.method2380();
        this.field1203 = new int[this.field1206];
        this.field1204 = new int[this.field1206];
        for (int var2 = 0; var2 < this.field1206; var2++) {
            this.field1203[var2] = arg0.method2347();
            this.field1204[var2] = arg0.method2347();
        }
    }

    @ObfuscatedName("bz.r()V")
    public final void method1220() {
        this.field1208 = 0;
        this.field1209 = 0;
        this.field1210 = 0;
        this.field1212 = 0;
        this.field1202 = 0;
    }

    @ObfuscatedName("bz.n(I)I")
    public final int method1230(int arg0) {
        if (this.field1202 >= this.field1208) {
            this.field1212 = this.field1204[this.field1209++] << 15;
            if (this.field1209 >= this.field1206) {
                this.field1209 = this.field1206 - 1;
            }
            this.field1208 = (int) ((double) this.field1203[this.field1209] / 65536.0D * (double) arg0);
            if (this.field1208 > this.field1202) {
                this.field1210 = ((this.field1204[this.field1209] << 15) - this.field1212) / (this.field1208 - this.field1202);
            }
        }
        this.field1212 += this.field1210;
        this.field1202++;
        return this.field1212 - this.field1210 >> 15;
    }
}
