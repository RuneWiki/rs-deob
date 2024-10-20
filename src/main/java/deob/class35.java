package deob;

@ObfuscatedName("az")
public abstract class class35 {

    @ObfuscatedName("az.b")
    public final class214 field298;

    @ObfuscatedName("az.i")
    public final class214 field299;

    @ObfuscatedName("az.c")
    public int field297;

    @ObfuscatedName("az.f")
    public int field296;

    public class35(class214 arg0, class214 arg1) {
        this.field299 = arg0;
        this.field298 = arg1;
    }

    @ObfuscatedName("az.o(IIB)Z")
    public boolean method496(int arg0, int arg1) {
        if (this.method498(arg0, arg1)) {
            return true;
        } else {
            return this.method499(arg0, arg1);
        }
    }

    @ObfuscatedName("az.d(I)Z")
    public boolean method497() {
        return this.method176() >= 0;
    }

    @ObfuscatedName("az.s(III)Z")
    public boolean method498(int arg0, int arg1) {
        if (!this.method497()) {
            return false;
        }
        class242 var3 = class242.method3753(this.method176());
        int var4 = this.method178();
        int var5 = this.method192();
        switch(var3.field3227.field3460) {
            case 0:
                if (arg0 > this.field297 - var4 && arg0 <= this.field297) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field297 && arg0 < this.field297 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field297 - var4 / 2 || arg0 > var4 / 2 + this.field297) {
                    return false;
                }
        }
        switch(var3.field3228.field3199) {
            case 0:
                if (arg1 >= this.field296 - var5 / 2 && arg1 <= var5 / 2 + this.field296) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field296 - var5 || arg1 > this.field296) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field296 || arg1 >= this.field296 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("az.z(III)Z")
    public boolean method499(int arg0, int arg1) {
        class29 var3 = this.method177();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field297 - var3.field237 / 2 && arg0 <= var3.field237 / 2 + this.field297) {
            return arg1 >= this.field296 && arg1 <= this.field296 + var3.field239;
        } else {
            return false;
        }
    }

    @ObfuscatedName("az.w(I)Las;")
    public abstract class29 method177();

    @ObfuscatedName("az.e(B)I")
    public abstract int method178();

    @ObfuscatedName("az.p(B)I")
    public abstract int method192();

    @ObfuscatedName("az.q(I)I")
    public abstract int method176();
}
