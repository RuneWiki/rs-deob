package deob;

@ObfuscatedName("iq")
public abstract class class253 {

    @ObfuscatedName("iq.y")
    public final class294 field2948;

    @ObfuscatedName("iq.d")
    public final class294 field2942;

    @ObfuscatedName("iq.n")
    public int field2943;

    @ObfuscatedName("iq.r")
    public int field2947;

    public class253(class294 arg0, class294 arg1) {
        this.field2942 = arg0;
        this.field2948 = arg1;
    }

    @ObfuscatedName("iq.t(IIB)Z")
    public boolean method4736(int arg0, int arg1) {
        if (this.method4732(arg0, arg1)) {
            return true;
        } else {
            return this.method4733(arg0, arg1);
        }
    }

    @ObfuscatedName("iq.w(I)Z")
    public boolean method4731() {
        return this.method4330() >= 0;
    }

    @ObfuscatedName("iq.m(IIB)Z")
    public boolean method4732(int arg0, int arg1) {
        if (!this.method4731()) {
            return false;
        }
        class178 var3 = class178.method2234(this.method4330());
        int var4 = this.method4339();
        int var5 = this.method4342();
        switch(var3.field1892.field1949) {
            case 0:
                if (arg0 >= this.field2943 - var4 / 2 && arg0 <= var4 / 2 + this.field2943) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field2943 - var4 && arg0 <= this.field2943) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2943 || arg0 >= this.field2943 + var4) {
                    return false;
                }
        }
        switch(var3.field1893.field2004) {
            case 0:
                if (arg1 > this.field2947 - var5 && arg1 <= this.field2947) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2947 - var5 / 2 || arg1 > var5 / 2 + this.field2947) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2947 || arg1 >= this.field2947 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("iq.q(III)Z")
    public boolean method4733(int arg0, int arg1) {
        class248 var3 = this.method4332();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2943 - var3.field2910 / 2 && arg0 <= var3.field2910 / 2 + this.field2943) {
            return arg1 >= this.field2947 && arg1 <= this.field2947 + var3.field2911;
        } else {
            return false;
        }
    }

    @ObfuscatedName("iq.x(I)I")
    public abstract int method4339();

    @ObfuscatedName("iq.h(I)I")
    public abstract int method4342();

    @ObfuscatedName("iq.f(I)I")
    public abstract int method4330();

    @ObfuscatedName("iq.c(I)Liz;")
    public abstract class248 method4332();
}
