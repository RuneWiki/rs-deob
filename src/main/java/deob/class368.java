package deob;

@ObfuscatedName("na")
public class class368 {

    @ObfuscatedName("na.c")
    public int field4225;

    @ObfuscatedName("na.l")
    public int field4222;

    @ObfuscatedName("na.s")
    public int field4223;

    @ObfuscatedName("na.e")
    public int field4224;

    public class368(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class368(int arg0, int arg1, int arg2, int arg3) {
        this.method5937(arg0, arg1);
        this.method5941(arg2, arg3);
    }

    @ObfuscatedName("na.c(IIB)V")
    public void method5937(int arg0, int arg1) {
        this.field4225 = arg0;
        this.field4222 = arg1;
    }

    @ObfuscatedName("na.l(IIB)V")
    public void method5941(int arg0, int arg1) {
        this.field4223 = arg0;
        this.field4224 = arg1;
    }

    @ObfuscatedName("na.s(III)Z")
    public boolean method5939(int arg0, int arg1) {
        return arg0 >= this.field4225 && arg0 < this.field4225 + this.field4223 && arg1 >= this.field4222 && arg1 < this.field4224 + this.field4222;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("na.e(Lna;Lna;B)V")
    public void method5940(class368 arg0, class368 arg1) {
        this.method5953(arg0, arg1);
        this.method5942(arg0, arg1);
    }

    @ObfuscatedName("na.r(Lna;Lna;B)V")
    public void method5953(class368 arg0, class368 arg1) {
        arg1.field4225 = this.field4225;
        arg1.field4223 = this.field4223;
        if (this.field4225 < arg0.field4225) {
            arg1.field4223 -= arg0.field4225 - this.field4225;
            arg1.field4225 = arg0.field4225;
        }
        if (arg1.method5943() > arg0.method5943()) {
            arg1.field4223 -= arg1.method5943() - arg0.method5943();
        }
        if (arg1.field4223 < 0) {
            arg1.field4223 = 0;
        }
    }

    @ObfuscatedName("na.o(Lna;Lna;I)V")
    public void method5942(class368 arg0, class368 arg1) {
        arg1.field4222 = this.field4222;
        arg1.field4224 = this.field4224;
        if (this.field4222 < arg0.field4222) {
            arg1.field4224 -= arg0.field4222 - this.field4222;
            arg1.field4222 = arg0.field4222;
        }
        if (arg1.method5944() > arg0.method5944()) {
            arg1.field4224 -= arg1.method5944() - arg0.method5944();
        }
        if (arg1.field4224 < 0) {
            arg1.field4224 = 0;
        }
    }

    @ObfuscatedName("na.i(I)I")
    public int method5943() {
        return this.field4225 + this.field4223;
    }

    @ObfuscatedName("na.w(I)I")
    public int method5944() {
        return this.field4224 + this.field4222;
    }
}
