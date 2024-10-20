package deob;

@ObfuscatedName("qw")
public class class437 {

    @ObfuscatedName("qw.aq")
    public class433 field4796;

    @ObfuscatedName("qw.ad")
    public int field4792 = 0;

    @ObfuscatedName("qw.ag")
    public int field4795 = 0;

    public class437(class433 arg0, int arg1, int arg2) {
        this.field4796 = arg0;
        this.field4792 = arg1;
        this.field4795 = arg2;
    }

    @ObfuscatedName("qw.aq(I)Ljava/lang/String;")
    public String method7532() {
        if (this.method7534()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7535());
        for (int var2 = this.field4792; var2 < this.field4795; var2++) {
            class435 var3 = this.field4796.method7264(var2);
            var1.append(var3.field4764);
        }
        return var1.toString();
    }

    @ObfuscatedName("qw.ad(II)Z")
    public boolean method7544(int arg0) {
        return this.field4796.method7294() == 2 || this.field4796.method7294() == 1 && (!this.field4796.field4753 || this.field4795 - 1 != arg0);
    }

    @ObfuscatedName("qw.ag(I)Z")
    public boolean method7534() {
        return this.field4795 == this.field4792;
    }

    @ObfuscatedName("qw.ak(S)I")
    public int method7535() {
        return this.field4795 - this.field4792;
    }

    @ObfuscatedName("qw.ap(Lqf;S)Z")
    public boolean method7536(class435 arg0) {
        if (this.field4796.field4745 == 2) {
            return true;
        } else if (this.field4796.field4745 == 0) {
            return false;
        } else {
            return this.field4796.method7344() != arg0;
        }
    }

    @ObfuscatedName("qw.an(I)I")
    public int method7537() {
        if (this.method7534()) {
            return 0;
        }
        class435 var1 = this.field4796.method7264(this.field4795 - 1);
        if (var1.field4764 == '\n') {
            return 0;
        } else if (this.method7536(var1)) {
            return this.field4796.field4741.field4770[42];
        } else {
            int var2 = this.field4796.field4741.field4770[var1.field4764];
            if (var2 == 0) {
                return var1.field4764 == '\t' ? this.field4796.field4741.field4770[32] * 3 : this.field4796.field4741.field4770[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qw.aj(I)Ltu;")
    public class518 method7538() {
        if (this.method7534()) {
            return new class518(0, 0);
        } else {
            class435 var1 = this.field4796.method7264(this.field4795 - 1);
            return new class518(var1.field4767 + this.method7537(), var1.field4765);
        }
    }

    @ObfuscatedName("qw.av(II)Lqf;")
    public class435 method7543(int arg0) {
        return arg0 >= 0 && arg0 < this.method7535() ? this.field4796.method7264(this.field4792 + arg0) : null;
    }
}
