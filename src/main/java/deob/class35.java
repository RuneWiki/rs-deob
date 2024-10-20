package deob;

@ObfuscatedName("as")
public abstract class class35 {

    @ObfuscatedName("as.q")
    public final class214 field282;

    @ObfuscatedName("as.m")
    public final class214 field283;

    @ObfuscatedName("as.y")
    public int field278;

    @ObfuscatedName("as.i")
    public int field279;

    public class35(class214 arg0, class214 arg1) {
        this.field283 = arg0;
        this.field282 = arg1;
    }

    @ObfuscatedName("as.k(III)Z")
    public boolean method523(int arg0, int arg1) {
        if (this.method526(arg0, arg1)) {
            return true;
        } else {
            return this.method527(arg0, arg1);
        }
    }

    @ObfuscatedName("as.ac(B)Z")
    public boolean method525() {
        return this.method196() >= 0;
    }

    @ObfuscatedName("as.aa(III)Z")
    public boolean method526(int arg0, int arg1) {
        if (!this.method525()) {
            return false;
        }
        class242 var3 = class242.method2284(this.method196());
        int var4 = this.method192();
        int var5 = this.method203();
        switch(var3.field3205.field3446) {
            case 0:
                if (arg0 >= this.field278 && arg0 < this.field278 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field278 - var4 && arg0 <= this.field278) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field278 - var4 / 2 || arg0 > var4 / 2 + this.field278) {
                    return false;
                }
        }
        switch(var3.field3206.field3174) {
            case 0:
                if (arg1 > this.field279 - var5 && arg1 <= this.field279) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field279 || arg1 >= this.field279 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field279 - var5 / 2 || arg1 > var5 / 2 + this.field279) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("as.ap(IIB)Z")
    public boolean method527(int arg0, int arg1) {
        class29 var3 = this.method190();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field278 - var3.field229 / 2 && arg0 <= var3.field229 / 2 + this.field278) {
            return arg1 >= this.field279 && arg1 <= this.field279 + var3.field232;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.u(I)I")
    public abstract int method203();

    @ObfuscatedName("as.v(I)I")
    public abstract int method192();

    @ObfuscatedName("as.z(B)I")
    public abstract int method196();

    @ObfuscatedName("as.n(I)Law;")
    public abstract class29 method190();
}
