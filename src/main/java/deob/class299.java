package deob;

@ObfuscatedName("ls")
public abstract class class299 {

    @ObfuscatedName("ls.at")
    public final class347 field3231;

    @ObfuscatedName("ls.ab")
    public final class347 field3226;

    @ObfuscatedName("ls.ac")
    public int field3225;

    @ObfuscatedName("ls.ao")
    public int field3227;

    public class299(class347 arg0, class347 arg1) {
        this.field3226 = arg0;
        this.field3231 = arg1;
    }

    @ObfuscatedName("ls.ad(IIB)Z")
    public boolean method5458(int arg0, int arg1) {
        if (this.method5450(arg0, arg1)) {
            return true;
        } else {
            return this.method5449(arg0, arg1);
        }
    }

    @ObfuscatedName("ls.ai(B)Z")
    public boolean method5447() {
        return this.method5061() >= 0;
    }

    @ObfuscatedName("ls.an(III)Z")
    public boolean method5450(int arg0, int arg1) {
        if (!this.method5447()) {
            return false;
        }
        class199 var3 = class199.method3551(this.method5061());
        int var4 = this.method5065();
        int var5 = this.method5064();
        switch(var3.field2022.field2107) {
            case 0:
                if (arg0 >= this.field3225 - var4 / 2 && arg0 <= var4 / 2 + this.field3225) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3225 && arg0 < this.field3225 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field3225 - var4 || arg0 > this.field3225) {
                    return false;
                }
        }
        switch(var3.field2032.field2171) {
            case 0:
                if (arg1 >= this.field3227 - var5 / 2 && arg1 <= var5 / 2 + this.field3227) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3227 || arg1 >= this.field3227 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field3227 - var5 || arg1 > this.field3227) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ls.am(IIB)Z")
    public boolean method5449(int arg0, int arg1) {
        class294 var3 = this.method5077();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3225 - var3.field3200 / 2 && arg0 <= var3.field3200 / 2 + this.field3225) {
            return arg1 >= this.field3227 && arg1 <= this.field3227 + var3.field3202;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ls.az(I)I")
    public abstract int method5065();

    @ObfuscatedName("ls.al(I)I")
    public abstract int method5061();

    @ObfuscatedName("ls.aj(B)Llh;")
    public abstract class294 method5077();

    @ObfuscatedName("ls.af(I)I")
    public abstract int method5064();
}
