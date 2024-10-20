package deob;

@ObfuscatedName("jd")
public abstract class class260 {

    @ObfuscatedName("jd.aa")
    public final class339 field2677;

    @ObfuscatedName("jd.az")
    public final class339 field2674;

    @ObfuscatedName("jd.ao")
    public int field2675;

    @ObfuscatedName("jd.au")
    public int field2673;

    public class260(class339 arg0, class339 arg1) {
        this.field2674 = arg0;
        this.field2677 = arg1;
    }

    @ObfuscatedName("jd.ag(IIB)Z")
    public boolean method4585(int arg0, int arg1) {
        if (this.method4586(arg0, arg1)) {
            return true;
        } else {
            return this.method4588(arg0, arg1);
        }
    }

    @ObfuscatedName("jd.am(I)Z")
    public boolean method4591() {
        return this.method4218() >= 0;
    }

    @ObfuscatedName("jd.ad(IIB)Z")
    public boolean method4586(int arg0, int arg1) {
        if (!this.method4591()) {
            return false;
        }
        class179 var3 = class179.method2995(this.method4218());
        int var4 = this.method4222();
        int var5 = this.method4223();
        switch(var3.field1885.field1954) {
            case 0:
                if (arg0 >= this.field2675 && arg0 < this.field2675 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2675 - var4 / 2 && arg0 <= var4 / 2 + this.field2675) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field2675 - var4 || arg0 > this.field2675) {
                    return false;
                }
        }
        switch(var3.field1875.field2017) {
            case 0:
                if (arg1 >= this.field2673 && arg1 < this.field2673 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2673 - var5 / 2 || arg1 > var5 / 2 + this.field2673) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2673 - var5 || arg1 > this.field2673) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("jd.at(III)Z")
    public boolean method4588(int arg0, int arg1) {
        class255 var3 = this.method4221();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2675 - var3.field2648 / 2 && arg0 <= var3.field2648 / 2 + this.field2675) {
            return arg1 >= this.field2673 && arg1 <= this.field2673 + var3.field2647;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jd.aw(S)I")
    public abstract int method4218();

    @ObfuscatedName("jd.al(I)Lja;")
    public abstract class255 method4221();

    @ObfuscatedName("jd.ar(I)I")
    public abstract int method4223();

    @ObfuscatedName("jd.ai(I)I")
    public abstract int method4222();
}
