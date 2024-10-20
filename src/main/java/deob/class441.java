package deob;

@ObfuscatedName("qb")
public class class441 {

    @ObfuscatedName("qb.ap")
    public class437 field4868;

    @ObfuscatedName("qb.aw")
    public int field4866 = 0;

    @ObfuscatedName("qb.ak")
    public int field4867 = 0;

    public class441(class437 arg0, int arg1, int arg2) {
        this.field4868 = arg0;
        this.field4866 = arg1;
        this.field4867 = arg2;
    }

    @ObfuscatedName("qb.ap(I)Ljava/lang/String;")
    public String method8025() {
        if (this.method8038()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method8023());
        for (int var2 = this.field4866; var2 < this.field4867; var2++) {
            class439 var3 = this.field4868.method7810(var2);
            var1.append(var3.field4840);
        }
        return var1.toString();
    }

    @ObfuscatedName("qb.aw(II)Z")
    public boolean method8021(int arg0) {
        return this.field4868.method7881() == 2 || this.field4868.method7881() == 1 && (!this.field4868.field4833 || this.field4867 - 1 != arg0);
    }

    @ObfuscatedName("qb.ak(B)Z")
    public boolean method8038() {
        return this.field4867 == this.field4866;
    }

    @ObfuscatedName("qb.aj(B)I")
    public int method8023() {
        return this.field4867 - this.field4866;
    }

    @ObfuscatedName("qb.ai(Lqm;I)Z")
    public boolean method8024(class439 arg0) {
        if (this.field4868.field4835 == 2) {
            return true;
        } else if (this.field4868.field4835 == 0) {
            return false;
        } else {
            return this.field4868.method7777() != arg0;
        }
    }

    @ObfuscatedName("qb.ay(I)I")
    public int method8046() {
        if (this.method8038()) {
            return 0;
        }
        class439 var1 = this.field4868.method7810(this.field4867 - 1);
        if (var1.field4840 == '\n') {
            return 0;
        } else if (this.method8024(var1)) {
            return this.field4868.field4834.field4845[42];
        } else {
            int var2 = this.field4868.field4834.field4845[var1.field4840];
            if (var2 == 0) {
                return var1.field4840 == '\t' ? this.field4868.field4834.field4845[32] * 3 : this.field4868.field4834.field4845[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qb.as(B)Luy;")
    public class528 method8026() {
        if (this.method8038()) {
            return new class528(0, 0);
        } else {
            class439 var1 = this.field4868.method7810(this.field4867 - 1);
            return new class528(var1.field4841 + this.method8046(), var1.field4842);
        }
    }

    @ObfuscatedName("qb.ae(IB)Lqm;")
    public class439 method8027(int arg0) {
        return arg0 >= 0 && arg0 < this.method8023() ? this.field4868.method7810(this.field4866 + arg0) : null;
    }
}
