package deob;

@ObfuscatedName("qw")
public class class440 {

    @ObfuscatedName("qw.ac")
    public class436 field4823;

    @ObfuscatedName("qw.ae")
    public int field4821 = 0;

    @ObfuscatedName("qw.ag")
    public int field4822 = 0;

    public class440(class436 arg0, int arg1, int arg2) {
        this.field4823 = arg0;
        this.field4821 = arg1;
        this.field4822 = arg2;
    }

    @ObfuscatedName("qw.ac(I)Ljava/lang/String;")
    public String method7771() {
        if (this.method7773()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7787());
        for (int var2 = this.field4821; var2 < this.field4822; var2++) {
            class438 var3 = this.field4823.method7511(var2);
            var1.append(var3.field4795);
        }
        return var1.toString();
    }

    @ObfuscatedName("qw.ae(II)Z")
    public boolean method7797(int arg0) {
        return this.field4823.method7552() == 2 || this.field4823.method7552() == 1 && (!this.field4823.field4785 || this.field4822 - 1 != arg0);
    }

    @ObfuscatedName("qw.ag(I)Z")
    public boolean method7773() {
        return this.field4822 == this.field4821;
    }

    @ObfuscatedName("qw.am(B)I")
    public int method7787() {
        return this.field4822 - this.field4821;
    }

    @ObfuscatedName("qw.ax(Lqe;I)Z")
    public boolean method7770(class438 arg0) {
        if (this.field4823.field4789 == 2) {
            return true;
        } else if (this.field4823.field4789 == 0) {
            return false;
        } else {
            return this.field4823.method7617() != arg0;
        }
    }

    @ObfuscatedName("qw.aq(I)I")
    public int method7795() {
        if (this.method7773()) {
            return 0;
        }
        class438 var1 = this.field4823.method7511(this.field4822 - 1);
        if (var1.field4795 == '\n') {
            return 0;
        } else if (this.method7770(var1)) {
            return this.field4823.field4786.field4799[42];
        } else {
            int var2 = this.field4823.field4786.field4799[var1.field4795];
            if (var2 == 0) {
                return var1.field4795 == '\t' ? this.field4823.field4786.field4799[32] * 3 : this.field4823.field4786.field4799[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qw.af(B)Lue;")
    public class521 method7776() {
        if (this.method7773()) {
            return new class521(0, 0);
        } else {
            class438 var1 = this.field4823.method7511(this.field4822 - 1);
            return new class521(var1.field4794 + this.method7795(), var1.field4796);
        }
    }

    @ObfuscatedName("qw.at(IB)Lqe;")
    public class438 method7772(int arg0) {
        return arg0 >= 0 && arg0 < this.method7787() ? this.field4823.method7511(this.field4821 + arg0) : null;
    }
}
