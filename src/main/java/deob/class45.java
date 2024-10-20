package deob;

@ObfuscatedName("ah")
public class class45 {

    @ObfuscatedName("ah.h")
    public int field344 = 2;

    @ObfuscatedName("ah.e")
    public int[] field336 = new int[2];

    @ObfuscatedName("ah.v")
    public int[] field337 = new int[2];

    @ObfuscatedName("ah.m")
    public int field338;

    @ObfuscatedName("ah.q")
    public int field339;

    @ObfuscatedName("ah.f")
    public int field345;

    @ObfuscatedName("ah.r")
    public int field341;

    @ObfuscatedName("ah.u")
    public int field335;

    @ObfuscatedName("ah.b")
    public int field343;

    @ObfuscatedName("ah.j")
    public int field340;

    @ObfuscatedName("ah.g")
    public int field342;

    public class45() {
        this.field336[0] = 0;
        this.field336[1] = 65535;
        this.field337[0] = 0;
        this.field337[1] = 65535;
    }

    @ObfuscatedName("ah.h(Lqy;)V")
    public final void method825(class467 arg0) {
        this.field345 = arg0.method7792();
        this.field338 = arg0.method7946();
        this.field339 = arg0.method7946();
        this.method822(arg0);
    }

    @ObfuscatedName("ah.e(Lqy;)V")
    public final void method822(class467 arg0) {
        this.field344 = arg0.method7792();
        this.field336 = new int[this.field344];
        this.field337 = new int[this.field344];
        for (int var2 = 0; var2 < this.field344; var2++) {
            this.field336[var2] = arg0.method7794();
            this.field337[var2] = arg0.method7794();
        }
    }

    @ObfuscatedName("ah.v()V")
    public final void method823() {
        this.field341 = 0;
        this.field335 = 0;
        this.field343 = 0;
        this.field340 = 0;
        this.field342 = 0;
    }

    @ObfuscatedName("ah.x(I)I")
    public final int method821(int arg0) {
        if (this.field342 >= this.field341) {
            this.field340 = this.field337[this.field335++] << 15;
            if (this.field335 >= this.field344) {
                this.field335 = this.field344 - 1;
            }
            this.field341 = (int) ((double) this.field336[this.field335] / 65536.0D * (double) arg0);
            if (this.field341 > this.field342) {
                this.field343 = ((this.field337[this.field335] << 15) - this.field340) / (this.field341 - this.field342);
            }
        }
        this.field340 += this.field343;
        this.field342++;
        return this.field340 - this.field343 >> 15;
    }
}
