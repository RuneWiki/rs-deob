package deob;

@ObfuscatedName("na")
public class class373 {

    @ObfuscatedName("na.h")
    public class369 field4426;

    @ObfuscatedName("na.e")
    public int field4423 = 0;

    @ObfuscatedName("na.v")
    public int field4424 = 0;

    public class373(class369 arg0, int arg1, int arg2) {
        this.field4426 = arg0;
        this.field4423 = arg1;
        this.field4424 = arg2;
    }

    @ObfuscatedName("na.h(B)Ljava/lang/String;")
    public String method6632() {
        if (this.method6611()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6629());
        for (int var2 = this.field4423; var2 < this.field4424; var2++) {
            class371 var3 = this.field4426.method6402(var2);
            var1.append(var3.field4396);
        }
        return var1.toString();
    }

    @ObfuscatedName("na.e(II)Z")
    public boolean method6610(int arg0) {
        return this.field4426.method6468() == 2 || this.field4426.method6468() == 1 && (!this.field4426.field4385 || this.field4424 - 1 != arg0);
    }

    @ObfuscatedName("na.v(I)Z")
    public boolean method6611() {
        return this.field4424 == this.field4423;
    }

    @ObfuscatedName("na.x(I)I")
    public int method6629() {
        return this.field4424 - this.field4423;
    }

    @ObfuscatedName("na.m(Lnp;I)Z")
    public boolean method6613(class371 arg0) {
        if (this.field4426.field4389 == 2) {
            return true;
        } else if (this.field4426.field4389 == 0) {
            return false;
        } else {
            return this.field4426.method6403() != arg0;
        }
    }

    @ObfuscatedName("na.q(I)I")
    public int method6630() {
        if (this.method6611()) {
            return 0;
        }
        class371 var1 = this.field4426.method6402(this.field4424 - 1);
        if (var1.field4396 == '\n') {
            return 0;
        } else if (this.method6613(var1)) {
            return this.field4426.field4386.field4416[42];
        } else {
            int var2 = this.field4426.field4386.field4416[var1.field4396];
            if (var2 == 0) {
                return var1.field4396 == '\t' ? this.field4426.field4386.field4416[32] * 3 : this.field4426.field4386.field4416[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("na.f(I)Lpg;")
    public class441 method6615() {
        if (this.method6611()) {
            return new class441(0, 0);
        } else {
            class371 var1 = this.field4426.method6402(this.field4424 - 1);
            return new class441(var1.field4399 + this.method6630(), var1.field4398);
        }
    }

    @ObfuscatedName("na.r(IB)Lnp;")
    public class371 method6616(int arg0) {
        return arg0 >= 0 && arg0 < this.method6629() ? this.field4426.method6402(this.field4423 + arg0) : null;
    }
}
