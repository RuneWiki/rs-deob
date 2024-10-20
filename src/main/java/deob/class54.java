package deob;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.f")
    public int field419 = 2;

    @ObfuscatedName("br.o")
    public int[] field411 = new int[2];

    @ObfuscatedName("br.u")
    public int[] field412 = new int[2];

    @ObfuscatedName("br.p")
    public int field413;

    @ObfuscatedName("br.b")
    public int field414;

    @ObfuscatedName("br.e")
    public int field415;

    @ObfuscatedName("br.k")
    public int field416;

    @ObfuscatedName("br.g")
    public int field410;

    @ObfuscatedName("br.h")
    public int field418;

    @ObfuscatedName("br.n")
    public int field417;

    @ObfuscatedName("br.l")
    public int field420;

    public class54() {
        this.field411[0] = 0;
        this.field411[1] = 65535;
        this.field412[0] = 0;
        this.field412[1] = 65535;
    }

    @ObfuscatedName("br.f(Lnu;)V")
    public final void method672(class382 arg0) {
        this.field415 = arg0.method5856();
        this.field413 = arg0.method5861();
        this.field414 = arg0.method5861();
        this.method664(arg0);
    }

    @ObfuscatedName("br.o(Lnu;)V")
    public final void method664(class382 arg0) {
        this.field419 = arg0.method5856();
        this.field411 = new int[this.field419];
        this.field412 = new int[this.field419];
        for (int var2 = 0; var2 < this.field419; var2++) {
            this.field411[var2] = arg0.method5858();
            this.field412[var2] = arg0.method5858();
        }
    }

    @ObfuscatedName("br.u()V")
    public final void method662() {
        this.field416 = 0;
        this.field410 = 0;
        this.field418 = 0;
        this.field417 = 0;
        this.field420 = 0;
    }

    @ObfuscatedName("br.p(I)I")
    public final int method666(int arg0) {
        if (this.field420 >= this.field416) {
            this.field417 = this.field412[this.field410++] << 15;
            if (this.field410 >= this.field419) {
                this.field410 = this.field419 - 1;
            }
            this.field416 = (int) ((double) this.field411[this.field410] / 65536.0D * (double) arg0);
            if (this.field416 > this.field420) {
                this.field418 = ((this.field412[this.field410] << 15) - this.field417) / (this.field416 - this.field420);
            }
        }
        this.field417 += this.field418;
        this.field420++;
        return this.field417 - this.field418 >> 15;
    }
}
