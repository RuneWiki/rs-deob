package deob;

@ObfuscatedName("gz")
public abstract class class199 {

    @ObfuscatedName("gz.t")
    public final class258 field2209;

    @ObfuscatedName("gz.a")
    public final class258 field2213;

    @ObfuscatedName("gz.e")
    public int field2210;

    @ObfuscatedName("gz.i")
    public int field2208;

    public class199(class258 arg0, class258 arg1) {
        this.field2213 = arg0;
        this.field2209 = arg1;
    }

    @ObfuscatedName("gz.x(III)Z")
    public boolean method3573(int arg0, int arg1) {
        if (this.method3576(arg0, arg1)) {
            return true;
        } else {
            return this.method3582(arg0, arg1);
        }
    }

    @ObfuscatedName("gz.p(I)Z")
    public boolean method3575() {
        return this.method3195() >= 0;
    }

    @ObfuscatedName("gz.z(III)Z")
    public boolean method3576(int arg0, int arg1) {
        if (!this.method3575()) {
            return false;
        }
        class154 var3 = class154.method156(this.method3195());
        int var4 = this.method3197();
        int var5 = this.method3198();
        switch(var3.field1643.field1706) {
            case 0:
                if (arg0 > this.field2210 - var4 && arg0 <= this.field2210) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2210 && arg0 < this.field2210 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2210 - var4 / 2 || arg0 > var4 / 2 + this.field2210) {
                    return false;
                }
        }
        switch(var3.field1626.field1751) {
            case 0:
                if (arg1 > this.field2208 - var5 && arg1 <= this.field2208) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2208 - var5 / 2 || arg1 > var5 / 2 + this.field2208) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2208 || arg1 >= this.field2208 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("gz.h(III)Z")
    public boolean method3582(int arg0, int arg1) {
        class194 var3 = this.method3209();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2210 - var3.field2178 / 2 && arg0 <= var3.field2178 / 2 + this.field2210) {
            return arg1 >= this.field2208 && arg1 <= this.field2208 + var3.field2179;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gz.m(I)I")
    public abstract int method3198();

    @ObfuscatedName("gz.f(S)Lga;")
    public abstract class194 method3209();

    @ObfuscatedName("gz.j(I)I")
    public abstract int method3197();

    @ObfuscatedName("gz.q(I)I")
    public abstract int method3195();
}
