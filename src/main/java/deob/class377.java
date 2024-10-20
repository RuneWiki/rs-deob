package deob;

@ObfuscatedName("nm")
public class class377 {

    @ObfuscatedName("nm.f")
    public class373 field4437;

    @ObfuscatedName("nm.w")
    public int field4436 = 0;

    @ObfuscatedName("nm.v")
    public int field4435 = 0;

    public class377(class373 arg0, int arg1, int arg2) {
        this.field4437 = arg0;
        this.field4436 = arg1;
        this.field4435 = arg2;
    }

    @ObfuscatedName("nm.f(I)Ljava/lang/String;")
    public String method6736() {
        if (this.method6726()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6729());
        for (int var2 = this.field4436; var2 < this.field4435; var2++) {
            class375 var3 = this.field4437.method6509(var2);
            var1.append(var3.field4412);
        }
        return var1.toString();
    }

    @ObfuscatedName("nm.w(IB)Z")
    public boolean method6734(int arg0) {
        return this.field4437.method6520() == 2 || this.field4437.method6520() == 1 && (!this.field4437.field4392 || this.field4435 - 1 != arg0);
    }

    @ObfuscatedName("nm.v(I)Z")
    public boolean method6726() {
        return this.field4436 == this.field4435;
    }

    @ObfuscatedName("nm.s(I)I")
    public int method6729() {
        return this.field4435 - this.field4436;
    }

    @ObfuscatedName("nm.z(Lnq;B)Z")
    public boolean method6727(class375 arg0) {
        if (this.field4437.field4402 == 2) {
            return true;
        } else if (this.field4437.field4402 == 0) {
            return false;
        } else {
            return this.field4437.method6532() != arg0;
        }
    }

    @ObfuscatedName("nm.j(I)I")
    public int method6731() {
        if (this.method6726()) {
            return 0;
        }
        class375 var1 = this.field4437.method6509(this.field4435 - 1);
        if (var1.field4412 == '\n') {
            return 0;
        } else if (this.method6727(var1)) {
            return this.field4437.field4399.field4415[42];
        } else {
            int var2 = this.field4437.field4399.field4415[var1.field4412];
            if (var2 == 0) {
                return var1.field4412 == '\t' ? this.field4437.field4399.field4415[32] * 3 : this.field4437.field4399.field4415[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("nm.i(B)Lqd;")
    public class448 method6732() {
        if (this.method6726()) {
            return new class448(0, 0);
        } else {
            class375 var1 = this.field4437.method6509(this.field4435 - 1);
            return new class448(var1.field4409 + this.method6731(), var1.field4411);
        }
    }

    @ObfuscatedName("nm.n(II)Lnq;")
    public class375 method6733(int arg0) {
        return arg0 >= 0 && arg0 < this.method6729() ? this.field4437.method6509(this.field4436 + arg0) : null;
    }
}
