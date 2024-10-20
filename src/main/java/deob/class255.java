package deob;

@ObfuscatedName("jc")
public abstract class class255 {

    @ObfuscatedName("jc.aa")
    public final class334 field2623;

    @ObfuscatedName("jc.ac")
    public final class334 field2624;

    @ObfuscatedName("jc.al")
    public int field2625;

    @ObfuscatedName("jc.az")
    public int field2626;

    public class255(class334 arg0, class334 arg1) {
        this.field2624 = arg0;
        this.field2623 = arg1;
    }

    @ObfuscatedName("jc.aw(IIB)Z")
    public boolean method4488(int arg0, int arg1) {
        if (this.method4494(arg0, arg1)) {
            return true;
        } else {
            return this.method4491(arg0, arg1);
        }
    }

    @ObfuscatedName("jc.ae(S)Z")
    public boolean method4489() {
        return this.method4123() >= 0;
    }

    @ObfuscatedName("jc.an(III)Z")
    public boolean method4494(int arg0, int arg1) {
        if (!this.method4489()) {
            return false;
        }
        class178 var3 = class178.method3048(this.method4123());
        int var4 = this.method4121();
        int var5 = this.method4122();
        switch(var3.field1839.field1907) {
            case 0:
                if (arg0 > this.field2625 - var4 && arg0 <= this.field2625) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2625 && arg0 < this.field2625 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2625 - var4 / 2 || arg0 > var4 / 2 + this.field2625) {
                    return false;
                }
        }
        switch(var3.field1844.field1974) {
            case 0:
                if (arg1 >= this.field2626 - var5 / 2 && arg1 <= var5 / 2 + this.field2626) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2626 || arg1 >= this.field2626 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2626 - var5 || arg1 > this.field2626) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("jc.ag(III)Z")
    public boolean method4491(int arg0, int arg1) {
        class250 var3 = this.method4120();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2625 - var3.field2600 / 2 && arg0 <= var3.field2600 / 2 + this.field2625) {
            return arg1 >= this.field2626 && arg1 <= this.field2626 + var3.field2599;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jc.ah(I)I")
    public abstract int method4123();

    @ObfuscatedName("jc.ar(B)Ljk;")
    public abstract class250 method4120();

    @ObfuscatedName("jc.ao(I)I")
    public abstract int method4121();

    @ObfuscatedName("jc.ab(I)I")
    public abstract int method4122();
}
