package deob;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.g")
    public int field1200 = 2;

    @ObfuscatedName("bc.b")
    public int[] field1194 = new int[2];

    @ObfuscatedName("bc.w")
    public int[] field1195 = new int[2];

    @ObfuscatedName("bc.d")
    public int field1196;

    @ObfuscatedName("bc.z")
    public int field1198;

    @ObfuscatedName("bc.l")
    public int field1199;

    @ObfuscatedName("bc.m")
    public int field1193;

    @ObfuscatedName("bc.p")
    public int field1197;

    @ObfuscatedName("bc.u")
    public int field1201;

    @ObfuscatedName("bc.c")
    public int field1202;

    @ObfuscatedName("bc.v")
    public int field1203;

    public class58() {
        this.field1194[0] = 0;
        this.field1194[1] = 65535;
        this.field1195[0] = 0;
        this.field1195[1] = 65535;
    }

    @ObfuscatedName("bc.g(Ldm;)V")
    public final void method1230(class119 arg0) {
        this.field1199 = arg0.method2362();
        this.field1196 = arg0.method2367();
        this.field1198 = arg0.method2367();
        this.method1232(arg0);
    }

    @ObfuscatedName("bc.b(Ldm;)V")
    public final void method1232(class119 arg0) {
        this.field1200 = arg0.method2362();
        this.field1194 = new int[this.field1200];
        this.field1195 = new int[this.field1200];
        for (int var2 = 0; var2 < this.field1200; var2++) {
            this.field1194[var2] = arg0.method2376();
            this.field1195[var2] = arg0.method2376();
        }
    }

    @ObfuscatedName("bc.w()V")
    public final void method1243() {
        this.field1193 = 0;
        this.field1197 = 0;
        this.field1201 = 0;
        this.field1202 = 0;
        this.field1203 = 0;
    }

    @ObfuscatedName("bc.d(I)I")
    public final int method1233(int arg0) {
        if (this.field1203 >= this.field1193) {
            this.field1202 = this.field1195[this.field1197++] << 15;
            if (this.field1197 >= this.field1200) {
                this.field1197 = this.field1200 - 1;
            }
            this.field1193 = (int) ((double) this.field1194[this.field1197] / 65536.0D * (double) arg0);
            if (this.field1193 > this.field1203) {
                this.field1201 = ((this.field1195[this.field1197] << 15) - this.field1202) / (this.field1193 - this.field1203);
            }
        }
        this.field1202 += this.field1201;
        this.field1203++;
        return this.field1202 - this.field1201 >> 15;
    }
}
