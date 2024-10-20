package deob;

@ObfuscatedName("ad")
public class class31 implements class43 {

    @ObfuscatedName("ad.n")
    public int field419;

    @ObfuscatedName("ad.v")
    public int field408;

    @ObfuscatedName("ad.y")
    public int field412;

    @ObfuscatedName("ad.r")
    public int field411;

    @ObfuscatedName("ad.h")
    public int field418;

    @ObfuscatedName("ad.d")
    public int field413;

    @ObfuscatedName("ad.s")
    public int field414;

    @ObfuscatedName("ad.b")
    public int field415;

    @ObfuscatedName("ad.e")
    public int field416;

    @ObfuscatedName("ad.f")
    public int field417;

    @ObfuscatedName("ad.n(Laz;I)V")
    public void method170(class33 arg0) {
        if (arg0.field438 > this.field414) {
            arg0.field438 = this.field414;
        }
        if (arg0.field435 < this.field416) {
            arg0.field435 = this.field416;
        }
        if (arg0.field437 > this.field415) {
            arg0.field437 = this.field415;
        }
        if (arg0.field441 < this.field417) {
            arg0.field441 = this.field417;
        }
    }

    @ObfuscatedName("ad.v(IIIB)Z")
    public boolean method171(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field419 && arg0 < this.field419 + this.field408) {
            return arg1 >> 6 >= this.field412 && arg1 >> 6 <= this.field418 && arg2 >> 6 >= this.field411 && arg2 >> 6 <= this.field413;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.y(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >> 6 >= this.field414 && arg0 >> 6 <= this.field416 && arg1 >> 6 >= this.field415 && arg1 >> 6 <= this.field417;
    }

    @ObfuscatedName("ad.r(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method171(arg0, arg1, arg2) ? new int[] { this.field414 * 64 - this.field412 * 64 + arg1, this.field415 * 64 - this.field411 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.h(III)Lht;")
    public class224 method174(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field412 * 64 - this.field414 * 64 + arg0;
            int var4 = this.field411 * 64 - this.field415 * 64 + arg1;
            return new class224(this.field419, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.d(Lgv;I)V")
    public void method175(class185 arg0) {
        this.field419 = arg0.method3021();
        this.field408 = arg0.method3021();
        this.field412 = arg0.method3015();
        this.field411 = arg0.method3015();
        this.field418 = arg0.method3015();
        this.field413 = arg0.method3015();
        this.field414 = arg0.method3015();
        this.field415 = arg0.method3015();
        this.field416 = arg0.method3015();
        this.field417 = arg0.method3015();
        this.method230();
    }

    @ObfuscatedName("ad.s(I)V")
    public void method230() {
    }
}
