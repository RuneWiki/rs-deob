package deob;

@ObfuscatedName("ok")
public class class407 {

    @ObfuscatedName("ok.h")
    public int field4596;

    @ObfuscatedName("ok.e")
    public int field4595;

    @ObfuscatedName("ok.v")
    public int field4597;

    @ObfuscatedName("ok.x")
    public int field4594;

    public class407(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class407(int arg0, int arg1, int arg2, int arg3) {
        this.method7021(arg0, arg1);
        this.method7020(arg2, arg3);
    }

    @ObfuscatedName("ok.h(IIB)V")
    public void method7021(int arg0, int arg1) {
        this.field4596 = arg0;
        this.field4595 = arg1;
    }

    @ObfuscatedName("ok.e(IIB)V")
    public void method7020(int arg0, int arg1) {
        this.field4597 = arg0;
        this.field4594 = arg1;
    }

    @ObfuscatedName("ok.v(III)Z")
    public boolean method7022(int arg0, int arg1) {
        return arg0 >= this.field4596 && arg0 < this.field4597 + this.field4596 && arg1 >= this.field4595 && arg1 < this.field4595 + this.field4594;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ok.x(Lok;Lok;I)V")
    public void method7034(class407 arg0, class407 arg1) {
        this.method7024(arg0, arg1);
        this.method7025(arg0, arg1);
    }

    @ObfuscatedName("ok.m(Lok;Lok;I)V")
    public void method7024(class407 arg0, class407 arg1) {
        arg1.field4596 = this.field4596;
        arg1.field4597 = this.field4597;
        if (this.field4596 < arg0.field4596) {
            arg1.field4597 -= arg0.field4596 - this.field4596;
            arg1.field4596 = arg0.field4596;
        }
        if (arg1.method7026() > arg0.method7026()) {
            arg1.field4597 -= arg1.method7026() - arg0.method7026();
        }
        if (arg1.field4597 < 0) {
            arg1.field4597 = 0;
        }
    }

    @ObfuscatedName("ok.q(Lok;Lok;I)V")
    public void method7025(class407 arg0, class407 arg1) {
        arg1.field4595 = this.field4595;
        arg1.field4594 = this.field4594;
        if (this.field4595 < arg0.field4595) {
            arg1.field4594 -= arg0.field4595 - this.field4595;
            arg1.field4595 = arg0.field4595;
        }
        if (arg1.method7027() > arg0.method7027()) {
            arg1.field4594 -= arg1.method7027() - arg0.method7027();
        }
        if (arg1.field4594 < 0) {
            arg1.field4594 = 0;
        }
    }

    @ObfuscatedName("ok.f(B)I")
    public int method7026() {
        return this.field4597 + this.field4596;
    }

    @ObfuscatedName("ok.r(B)I")
    public int method7027() {
        return this.field4595 + this.field4594;
    }
}
