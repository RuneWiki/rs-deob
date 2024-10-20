package deob;

@ObfuscatedName("jw")
public class class254 implements class257 {

    @ObfuscatedName("jw.at")
    public int field2618;

    @ObfuscatedName("jw.ah")
    public int field2616;

    @ObfuscatedName("jw.ar")
    public int field2617;

    @ObfuscatedName("jw.ao")
    public int field2615;

    @ObfuscatedName("jw.ab")
    public int field2619;

    @ObfuscatedName("jw.au")
    public int field2620;

    @ObfuscatedName("jw.at(Ljv;B)V")
    public void method4150(class237 arg0) {
        if (arg0.field2470 > this.field2619) {
            arg0.field2470 = this.field2619;
        }
        if (arg0.field2471 < this.field2619) {
            arg0.field2471 = this.field2619;
        }
        if (arg0.field2472 > this.field2620) {
            arg0.field2472 = this.field2620;
        }
        if (arg0.field2475 < this.field2620) {
            arg0.field2475 = this.field2620;
        }
    }

    @ObfuscatedName("jw.ah(IIIB)Z")
    public boolean method4140(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2618 && arg0 < this.field2618 + this.field2616) {
            return arg1 >> 6 == this.field2617 && arg2 >> 6 == this.field2615;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jw.ar(III)Z")
    public boolean method4141(int arg0, int arg1) {
        return arg0 >> 6 == this.field2619 && arg1 >> 6 == this.field2620;
    }

    @ObfuscatedName("jw.ao(IIIS)[I")
    public int[] method4142(int arg0, int arg1, int arg2) {
        return this.method4140(arg0, arg1, arg2) ? new int[] { this.field2619 * 64 - this.field2617 * 64 + arg1, this.field2620 * 64 - this.field2615 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jw.ab(III)Lmh;")
    public class334 method4155(int arg0, int arg1) {
        if (this.method4141(arg0, arg1)) {
            int var3 = this.field2617 * 64 - this.field2619 * 64 + arg0;
            int var4 = this.field2615 * 64 - this.field2620 * 64 + arg1;
            return new class334(this.field2618, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jw.au(Luj;B)V")
    public void method4143(class527 arg0) {
        this.field2618 = arg0.method8410();
        this.field2616 = arg0.method8410();
        this.field2617 = arg0.method8412();
        this.field2615 = arg0.method8412();
        this.field2619 = arg0.method8412();
        this.field2620 = arg0.method8412();
        this.method4487();
    }

    @ObfuscatedName("jw.aa(B)V")
    public void method4487() {
    }
}
