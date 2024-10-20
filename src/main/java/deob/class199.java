package deob;

@ObfuscatedName("gm")
public abstract class class199 {

    @ObfuscatedName("gm.e")
    public final class258 field2205;

    @ObfuscatedName("gm.p")
    public final class258 field2206;

    @ObfuscatedName("gm.j")
    public int field2207;

    @ObfuscatedName("gm.b")
    public int field2208;

    public class199(class258 arg0, class258 arg1) {
        this.field2206 = arg0;
        this.field2205 = arg1;
    }

    @ObfuscatedName("gm.n(III)Z")
    public boolean method3585(int arg0, int arg1) {
        if (this.method3589(arg0, arg1)) {
            return true;
        } else {
            return this.method3588(arg0, arg1);
        }
    }

    @ObfuscatedName("gm.z(I)Z")
    public boolean method3587() {
        return this.method3225() >= 0;
    }

    @ObfuscatedName("gm.q(III)Z")
    public boolean method3589(int arg0, int arg1) {
        if (!this.method3587()) {
            return false;
        }
        class154 var3 = class154.method3068(this.method3225());
        int var4 = this.method3227();
        int var5 = this.method3230();
        switch(var3.field1624.field1696) {
            case 0:
                if (arg0 > this.field2207 - var4 && arg0 <= this.field2207) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2207 - var4 / 2 && arg0 <= var4 / 2 + this.field2207) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2207 || arg0 >= this.field2207 + var4) {
                    return false;
                }
        }
        switch(var3.field1629.field1742) {
            case 0:
                if (arg1 >= this.field2208 - var5 / 2 && arg1 <= var5 / 2 + this.field2208) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2208 || arg1 >= this.field2208 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2208 - var5 || arg1 > this.field2208) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("gm.d(IIB)Z")
    public boolean method3588(int arg0, int arg1) {
        class194 var3 = this.method3226();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2207 - var3.field2174 / 2 && arg0 <= var3.field2174 / 2 + this.field2207) {
            return arg1 >= this.field2208 && arg1 <= this.field2208 + var3.field2175;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gm.w(I)I")
    public abstract int method3225();

    @ObfuscatedName("gm.s(B)Lga;")
    public abstract class194 method3226();

    @ObfuscatedName("gm.a(I)I")
    public abstract int method3227();

    @ObfuscatedName("gm.o(I)I")
    public abstract int method3230();
}
