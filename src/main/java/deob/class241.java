package deob;

@ObfuscatedName("jb")
public class class241 implements class257 {

    @ObfuscatedName("jb.at")
    public int field2516;

    @ObfuscatedName("jb.ah")
    public int field2513;

    @ObfuscatedName("jb.ar")
    public int field2520;

    @ObfuscatedName("jb.ao")
    public int field2515;

    @ObfuscatedName("jb.ab")
    public int field2514;

    @ObfuscatedName("jb.au")
    public int field2517;

    @ObfuscatedName("jb.aa")
    public int field2519;

    @ObfuscatedName("jb.ac")
    public int field2518;

    @ObfuscatedName("jb.al")
    public int field2521;

    @ObfuscatedName("jb.az")
    public int field2522;

    @ObfuscatedName("jb.at(Ljv;B)V")
    public void method4150(class237 arg0) {
        if (arg0.field2470 > this.field2514) {
            arg0.field2470 = this.field2514;
        }
        if (arg0.field2471 < this.field2514) {
            arg0.field2471 = this.field2514;
        }
        if (arg0.field2472 > this.field2517) {
            arg0.field2472 = this.field2517;
        }
        if (arg0.field2475 < this.field2517) {
            arg0.field2475 = this.field2517;
        }
    }

    @ObfuscatedName("jb.ah(IIIB)Z")
    public boolean method4140(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2516 && arg0 < this.field2516 + this.field2513) {
            return arg1 >= (this.field2520 << 6) + (this.field2519 << 3) && arg1 <= (this.field2520 << 6) + (this.field2519 << 3) + 7 && arg2 >= (this.field2518 << 3) + (this.field2515 << 6) && arg2 <= (this.field2518 << 3) + (this.field2515 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jb.ar(III)Z")
    public boolean method4141(int arg0, int arg1) {
        return arg0 >= (this.field2521 << 3) + (this.field2514 << 6) && arg0 <= (this.field2521 << 3) + (this.field2514 << 6) + 7 && arg1 >= (this.field2522 << 3) + (this.field2517 << 6) && arg1 <= (this.field2522 << 3) + (this.field2517 << 6) + 7;
    }

    @ObfuscatedName("jb.ao(IIIS)[I")
    public int[] method4142(int arg0, int arg1, int arg2) {
        return this.method4140(arg0, arg1, arg2) ? new int[] { this.field2521 * 8 - this.field2519 * 8 + this.field2514 * 64 - this.field2520 * 64 + arg1, this.field2522 * 8 - this.field2518 * 8 + this.field2517 * 64 - this.field2515 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jb.ab(III)Lmh;")
    public class334 method4155(int arg0, int arg1) {
        if (this.method4141(arg0, arg1)) {
            int var3 = this.field2519 * 8 - this.field2521 * 8 + this.field2520 * 64 - this.field2514 * 64 + arg0;
            int var4 = this.field2518 * 8 - this.field2522 * 8 + this.field2515 * 64 - this.field2517 * 64 + arg1;
            return new class334(this.field2516, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jb.au(Luj;B)V")
    public void method4143(class527 arg0) {
        this.field2516 = arg0.method8410();
        this.field2513 = arg0.method8410();
        this.field2520 = arg0.method8412();
        this.field2519 = arg0.method8410();
        this.field2515 = arg0.method8412();
        this.field2518 = arg0.method8410();
        this.field2514 = arg0.method8412();
        this.field2521 = arg0.method8410();
        this.field2517 = arg0.method8412();
        this.field2522 = arg0.method8410();
        this.method4416();
    }

    @ObfuscatedName("jb.aa(B)V")
    public void method4416() {
    }
}
