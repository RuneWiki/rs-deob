package deob;

@ObfuscatedName("at")
public abstract class class35 {

    @ObfuscatedName("at.p")
    public final class235 field298;

    @ObfuscatedName("at.m")
    public final class235 field299;

    @ObfuscatedName("at.q")
    public int field297;

    @ObfuscatedName("at.b")
    public int field300;

    public class35(class235 arg0, class235 arg1) {
        this.field299 = arg0;
        this.field298 = arg1;
    }

    @ObfuscatedName("at.o(III)Z")
    public boolean method527(int arg0, int arg1) {
        if (this.method529(arg0, arg1)) {
            return true;
        } else {
            return this.method534(arg0, arg1);
        }
    }

    @ObfuscatedName("at.u(B)Z")
    public boolean method528() {
        return this.method201() >= 0;
    }

    @ObfuscatedName("at.y(III)Z")
    public boolean method529(int arg0, int arg1) {
        if (!this.method528()) {
            return false;
        }
        class263 var3 = class263.method379(this.method201());
        int var4 = this.method200();
        int var5 = this.method215();
        switch(var3.field3339.field3563) {
            case 0:
                if (arg0 >= this.field297 - var4 / 2 && arg0 <= var4 / 2 + this.field297) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field297 && arg0 < this.field297 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field297 - var4 || arg0 > this.field297) {
                    return false;
                }
        }
        switch(var3.field3340.field3306) {
            case 0:
                if (arg1 >= this.field300 - var5 / 2 && arg1 <= var5 / 2 + this.field300) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field300 - var5 || arg1 > this.field300) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field300 || arg1 >= this.field300 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("at.k(III)Z")
    public boolean method534(int arg0, int arg1) {
        class29 var3 = this.method202();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field297 - var3.field248 / 2 && arg0 <= var3.field248 / 2 + this.field297) {
            return arg1 >= this.field300 && arg1 <= this.field300 + var3.field249;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.x(B)I")
    public abstract int method215();

    @ObfuscatedName("at.a(B)I")
    public abstract int method201();

    @ObfuscatedName("at.s(I)Lay;")
    public abstract class29 method202();

    @ObfuscatedName("at.g(I)I")
    public abstract int method200();
}
