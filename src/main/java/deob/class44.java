package deob;

@ObfuscatedName("ax")
public abstract class class44 {

    @ObfuscatedName("ax.q")
    public final class223 field327;

    @ObfuscatedName("ax.z")
    public final class223 field328;

    @ObfuscatedName("ax.t")
    public int field331;

    @ObfuscatedName("ax.e")
    public int field330;

    public class44(class223 arg0, class223 arg1) {
        this.field328 = arg0;
        this.field327 = arg1;
    }

    @ObfuscatedName("ax.a(III)Z")
    public boolean method604(int arg0, int arg1) {
        if (this.method594(arg0, arg1)) {
            return true;
        } else {
            return this.method592(arg0, arg1);
        }
    }

    @ObfuscatedName("ax.o(S)Z")
    public boolean method590() {
        return this.method264() >= 0;
    }

    @ObfuscatedName("ax.c(III)Z")
    public boolean method594(int arg0, int arg1) {
        if (!this.method590()) {
            return false;
        }
        class252 var3 = class252.method249(this.method264());
        int var4 = this.method266();
        int var5 = this.method263();
        switch(var3.field3229.field3455) {
            case 0:
                if (arg0 >= this.field331 - var4 / 2 && arg0 <= var4 / 2 + this.field331) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field331 && arg0 < this.field331 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field331 - var4 || arg0 > this.field331) {
                    return false;
                }
        }
        switch(var3.field3227.field3195) {
            case 0:
                if (arg1 > this.field330 - var5 && arg1 <= this.field330) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field330 - var5 / 2 || arg1 > var5 / 2 + this.field330) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field330 || arg1 >= this.field330 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ax.f(III)Z")
    public boolean method592(int arg0, int arg1) {
        class38 var3 = this.method275();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field331 - var3.field274 / 2 && arg0 <= var3.field274 / 2 + this.field331) {
            return arg1 >= this.field330 && arg1 <= this.field330 + var3.field272;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.x(B)I")
    public abstract int method264();

    @ObfuscatedName("ax.k(I)I")
    public abstract int method266();

    @ObfuscatedName("ax.d(I)I")
    public abstract int method263();

    @ObfuscatedName("ax.m(I)Lau;")
    public abstract class38 method275();
}
