package deob;

@ObfuscatedName("im")
public abstract class class243 {

    @ObfuscatedName("im.g")
    public final class289 field2861;

    @ObfuscatedName("im.w")
    public final class289 field2860;

    @ObfuscatedName("im.y")
    public int field2863;

    @ObfuscatedName("im.i")
    public int field2862;

    public class243(class289 arg0, class289 arg1) {
        this.field2860 = arg0;
        this.field2861 = arg1;
    }

    @ObfuscatedName("im.k(III)Z")
    public boolean method4600(int arg0, int arg1) {
        if (this.method4603(arg0, arg1)) {
            return true;
        } else {
            return this.method4604(arg0, arg1);
        }
    }

    @ObfuscatedName("im.h(B)Z")
    public boolean method4602() {
        return this.method4228() >= 0;
    }

    @ObfuscatedName("im.x(IIB)Z")
    public boolean method4603(int arg0, int arg1) {
        if (!this.method4602()) {
            return false;
        }
        class171 var3 = class171.method6889(this.method4228());
        int var4 = this.method4230();
        int var5 = this.method4231();
        switch(var3.field1846.field1912) {
            case 0:
                if (arg0 >= this.field2863 && arg0 < this.field2863 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field2863 - var4 && arg0 <= this.field2863) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2863 - var4 / 2 || arg0 > var4 / 2 + this.field2863) {
                    return false;
                }
        }
        switch(var3.field1847.field1961) {
            case 0:
                if (arg1 > this.field2862 - var5 && arg1 <= this.field2862) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2862 || arg1 >= this.field2862 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2862 - var5 / 2 || arg1 > var5 / 2 + this.field2862) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("im.l(III)Z")
    public boolean method4604(int arg0, int arg1) {
        class238 var3 = this.method4237();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2863 - var3.field2830 / 2 && arg0 <= var3.field2830 / 2 + this.field2863) {
            return arg1 >= this.field2862 && arg1 <= this.field2862 + var3.field2832;
        } else {
            return false;
        }
    }

    @ObfuscatedName("im.f(I)I")
    public abstract int method4230();

    @ObfuscatedName("im.q(I)Liz;")
    public abstract class238 method4237();

    @ObfuscatedName("im.v(I)I")
    public abstract int method4228();

    @ObfuscatedName("im.j(B)I")
    public abstract int method4231();
}
