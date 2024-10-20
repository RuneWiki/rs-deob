package deob;

@ObfuscatedName("by")
public class class57 {

    @ObfuscatedName("by.i")
    public int field1201 = 2;

    @ObfuscatedName("by.b")
    public int[] field1193 = new int[2];

    @ObfuscatedName("by.r")
    public int[] field1194 = new int[2];

    @ObfuscatedName("by.l")
    public int field1202;

    @ObfuscatedName("by.s")
    public int field1192;

    @ObfuscatedName("by.d")
    public int field1197;

    @ObfuscatedName("by.e")
    public int field1198;

    @ObfuscatedName("by.u")
    public int field1199;

    @ObfuscatedName("by.q")
    public int field1196;

    @ObfuscatedName("by.o")
    public int field1195;

    @ObfuscatedName("by.v")
    public int field1200;

    public class57() {
        this.field1193[0] = 0;
        this.field1193[1] = 65535;
        this.field1194[0] = 0;
        this.field1194[1] = 65535;
    }

    @ObfuscatedName("by.i(Lds;)V")
    public final void method1234(class128 arg0) {
        this.field1197 = arg0.method2531();
        this.field1202 = arg0.method2468();
        this.field1192 = arg0.method2468();
        this.method1235(arg0);
    }

    @ObfuscatedName("by.b(Lds;)V")
    public final void method1235(class128 arg0) {
        this.field1201 = arg0.method2531();
        this.field1193 = new int[this.field1201];
        this.field1194 = new int[this.field1201];
        for (int var2 = 0; var2 < this.field1201; var2++) {
            this.field1193[var2] = arg0.method2473();
            this.field1194[var2] = arg0.method2473();
        }
    }

    @ObfuscatedName("by.r()V")
    public final void method1236() {
        this.field1198 = 0;
        this.field1199 = 0;
        this.field1196 = 0;
        this.field1195 = 0;
        this.field1200 = 0;
    }

    @ObfuscatedName("by.l(I)I")
    public final int method1237(int arg0) {
        if (this.field1200 >= this.field1198) {
            this.field1195 = this.field1194[this.field1199++] << 15;
            if (this.field1199 >= this.field1201) {
                this.field1199 = this.field1201 - 1;
            }
            this.field1198 = (int) ((double) this.field1193[this.field1199] / 65536.0D * (double) arg0);
            if (this.field1198 > this.field1200) {
                this.field1196 = ((this.field1194[this.field1199] << 15) - this.field1195) / (this.field1198 - this.field1200);
            }
        }
        this.field1195 += this.field1196;
        this.field1200++;
        return this.field1195 - this.field1196 >> 15;
    }
}
