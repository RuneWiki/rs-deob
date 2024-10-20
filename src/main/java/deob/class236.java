package deob;

@ObfuscatedName("ix")
public abstract class class236 {

    @ObfuscatedName("ix.i")
    public final class282 field2788;

    @ObfuscatedName("ix.w")
    public final class282 field2786;

    @ObfuscatedName("ix.v")
    public int field2785;

    @ObfuscatedName("ix.a")
    public int field2787;

    public class236(class282 arg0, class282 arg1) {
        this.field2786 = arg0;
        this.field2788 = arg1;
    }

    @ObfuscatedName("ix.k(III)Z")
    public boolean method4369(int arg0, int arg1) {
        if (this.method4367(arg0, arg1)) {
            return true;
        } else {
            return this.method4368(arg0, arg1);
        }
    }

    @ObfuscatedName("ix.b(I)Z")
    public boolean method4375() {
        return this.method3980() >= 0;
    }

    @ObfuscatedName("ix.z(III)Z")
    public boolean method4367(int arg0, int arg1) {
        if (!this.method4375()) {
            return false;
        }
        class164 var3 = class164.method2597(this.method3980());
        int var4 = this.method4000();
        int var5 = this.method3985();
        switch(var3.field1767.field1841) {
            case 0:
                if (arg0 > this.field2785 - var4 && arg0 <= this.field2785) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2785 - var4 / 2 && arg0 <= var4 / 2 + this.field2785) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2785 || arg0 >= this.field2785 + var4) {
                    return false;
                }
        }
        switch(var3.field1780.field1893) {
            case 0:
                if (arg1 >= this.field2787 - var5 / 2 && arg1 <= var5 / 2 + this.field2787) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2787 || arg1 >= this.field2787 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2787 - var5 || arg1 > this.field2787) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ix.ap(III)Z")
    public boolean method4368(int arg0, int arg1) {
        class231 var3 = this.method3992();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2785 - var3.field2763 / 2 && arg0 <= var3.field2763 / 2 + this.field2785) {
            return arg1 >= this.field2787 && arg1 <= this.field2787 + var3.field2760;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ix.s(I)Lhp;")
    public abstract class231 method3992();

    @ObfuscatedName("ix.r(I)I")
    public abstract int method3985();

    @ObfuscatedName("ix.l(I)I")
    public abstract int method3980();

    @ObfuscatedName("ix.e(I)I")
    public abstract int method4000();
}
