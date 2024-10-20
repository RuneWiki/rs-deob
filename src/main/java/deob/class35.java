package deob;

@ObfuscatedName("ak")
public abstract class class35 {

    @ObfuscatedName("ak.g")
    public final class225 field287;

    @ObfuscatedName("ak.l")
    public final class225 field283;

    @ObfuscatedName("ak.e")
    public int field284;

    @ObfuscatedName("ak.x")
    public int field285;

    public class35(class225 arg0, class225 arg1) {
        this.field283 = arg0;
        this.field287 = arg1;
    }

    @ObfuscatedName("ak.y(IIB)Z")
    public boolean method530(int arg0, int arg1) {
        if (this.method532(arg0, arg1)) {
            return true;
        } else {
            return this.method533(arg0, arg1);
        }
    }

    @ObfuscatedName("ak.h(I)Z")
    public boolean method531() {
        return this.method192() >= 0;
    }

    @ObfuscatedName("ak.b(III)Z")
    public boolean method532(int arg0, int arg1) {
        if (!this.method531()) {
            return false;
        }
        class253 var3 = class253.method2731(this.method192());
        int var4 = this.method190();
        int var5 = this.method201();
        switch(var3.field3288.field3529) {
            case 0:
                if (arg0 >= this.field284 - var4 / 2 && arg0 <= var4 / 2 + this.field284) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field284 && arg0 < this.field284 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field284 - var4 || arg0 > this.field284) {
                    return false;
                }
        }
        switch(var3.field3302.field3276) {
            case 0:
                if (arg1 > this.field285 - var5 && arg1 <= this.field285) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field285 - var5 / 2 || arg1 > var5 / 2 + this.field285) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field285 || arg1 >= this.field285 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ak.c(III)Z")
    public boolean method533(int arg0, int arg1) {
        class29 var3 = this.method191();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field284 - var3.field229 / 2 && arg0 <= var3.field229 / 2 + this.field284) {
            return arg1 >= this.field285 && arg1 <= this.field285 + var3.field228;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.w(I)I")
    public abstract int method201();

    @ObfuscatedName("ak.m(I)I")
    public abstract int method192();

    @ObfuscatedName("ak.f(I)Laj;")
    public abstract class29 method191();

    @ObfuscatedName("ak.q(B)I")
    public abstract int method190();
}
