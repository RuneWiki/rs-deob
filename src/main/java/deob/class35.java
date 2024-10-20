package deob;

@ObfuscatedName("aq")
public abstract class class35 {

    @ObfuscatedName("aq.d")
    public final class214 field306;

    @ObfuscatedName("aq.l")
    public final class214 field300;

    @ObfuscatedName("aq.j")
    public int field302;

    @ObfuscatedName("aq.m")
    public int field304;

    public class35(class214 arg0, class214 arg1) {
        this.field300 = arg0;
        this.field306 = arg1;
    }

    @ObfuscatedName("aq.q(III)Z")
    public boolean method519(int arg0, int arg1) {
        if (this.method522(arg0, arg1)) {
            return true;
        } else {
            return this.method532(arg0, arg1);
        }
    }

    @ObfuscatedName("aq.z(B)Z")
    public boolean method521() {
        return this.method180() >= 0;
    }

    @ObfuscatedName("aq.y(III)Z")
    public boolean method522(int arg0, int arg1) {
        if (!this.method521()) {
            return false;
        }
        class243 var3 = class243.method3377(this.method180());
        int var4 = this.method182();
        int var5 = this.method183();
        switch(var3.field3230.field3454) {
            case 0:
                if (arg0 > this.field302 - var4 && arg0 <= this.field302) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field302 - var4 / 2 && arg0 <= var4 / 2 + this.field302) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field302 || arg0 >= this.field302 + var4) {
                    return false;
                }
        }
        switch(var3.field3227.field3194) {
            case 0:
                if (arg1 >= this.field304 - var5 / 2 && arg1 <= var5 / 2 + this.field304) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field304 || arg1 >= this.field304 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field304 - var5 || arg1 > this.field304) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("aq.f(III)Z")
    public boolean method532(int arg0, int arg1) {
        class29 var3 = this.method181();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field302 - var3.field247 / 2 && arg0 <= var3.field247 / 2 + this.field302) {
            return arg1 >= this.field304 && arg1 <= this.field304 + var3.field249;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.o(S)I")
    public abstract int method182();

    @ObfuscatedName("aq.c(I)I")
    public abstract int method180();

    @ObfuscatedName("aq.t(B)Laz;")
    public abstract class29 method181();

    @ObfuscatedName("aq.e(B)I")
    public abstract int method183();
}
