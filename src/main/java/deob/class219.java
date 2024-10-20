package deob;

@ObfuscatedName("hq")
public abstract class class219 {

    @ObfuscatedName("hq.s")
    public final class290 field2413;

    @ObfuscatedName("hq.l")
    public final class290 field2409;

    @ObfuscatedName("hq.q")
    public int field2408;

    @ObfuscatedName("hq.o")
    public int field2411;

    public class219(class290 arg0, class290 arg1) {
        this.field2409 = arg0;
        this.field2413 = arg1;
    }

    @ObfuscatedName("hq.e(IIB)Z")
    public boolean method3958(int arg0, int arg1) {
        if (this.method3961(arg0, arg1)) {
            return true;
        } else {
            return this.method3962(arg0, arg1);
        }
    }

    @ObfuscatedName("hq.z(I)Z")
    public boolean method3960() {
        return this.method3567() >= 0;
    }

    @ObfuscatedName("hq.h(III)Z")
    public boolean method3961(int arg0, int arg1) {
        if (!this.method3960()) {
            return false;
        }
        class172 var3 = class172.method2469(this.method3567());
        int var4 = this.method3565();
        int var5 = this.method3569();
        switch(var3.field1832.field1889) {
            case 0:
                if (arg0 >= this.field2408 && arg0 < this.field2408 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2408 - var4 / 2 && arg0 <= var4 / 2 + this.field2408) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field2408 - var4 || arg0 > this.field2408) {
                    return false;
                }
        }
        switch(var3.field1833.field1934) {
            case 0:
                if (arg1 >= this.field2411 && arg1 < this.field2411 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2411 - var5 / 2 || arg1 > var5 / 2 + this.field2411) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2411 - var5 || arg1 > this.field2411) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("hq.ae(III)Z")
    public boolean method3962(int arg0, int arg1) {
        class214 var3 = this.method3585();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2408 - var3.field2373 / 2 && arg0 <= var3.field2373 / 2 + this.field2408) {
            return arg1 >= this.field2411 && arg1 <= this.field2411 + var3.field2374;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hq.c(I)I")
    public abstract int method3567();

    @ObfuscatedName("hq.f(I)I")
    public abstract int method3565();

    @ObfuscatedName("hq.i(B)Lho;")
    public abstract class214 method3585();

    @ObfuscatedName("hq.b(I)I")
    public abstract int method3569();
}
