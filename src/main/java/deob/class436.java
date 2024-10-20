package deob;

@ObfuscatedName("qv")
public class class436 {

    @ObfuscatedName("qv.ak")
    public class432 field4779;

    @ObfuscatedName("qv.al")
    public int field4776 = 0;

    @ObfuscatedName("qv.aj")
    public int field4778 = 0;

    public class436(class432 arg0, int arg1, int arg2) {
        this.field4779 = arg0;
        this.field4776 = arg1;
        this.field4778 = arg2;
    }

    @ObfuscatedName("qv.ak(I)Ljava/lang/String;")
    public String method7574() {
        if (this.method7562()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7563());
        for (int var2 = this.field4776; var2 < this.field4778; var2++) {
            class434 var3 = this.field4779.method7321(var2);
            var1.append(var3.field4750);
        }
        return var1.toString();
    }

    @ObfuscatedName("qv.al(IB)Z")
    public boolean method7561(int arg0) {
        return this.field4779.method7352() == 2 || this.field4779.method7352() == 1 && (!this.field4779.field4741 || this.field4778 - 1 != arg0);
    }

    @ObfuscatedName("qv.aj(I)Z")
    public boolean method7562() {
        return this.field4778 == this.field4776;
    }

    @ObfuscatedName("qv.az(I)I")
    public int method7563() {
        return this.field4778 - this.field4776;
    }

    @ObfuscatedName("qv.af(Lqo;I)Z")
    public boolean method7564(class434 arg0) {
        if (this.field4779.field4745 == 2) {
            return true;
        } else if (this.field4779.field4745 == 0) {
            return false;
        } else {
            return this.field4779.method7322() != arg0;
        }
    }

    @ObfuscatedName("qv.aa(B)I")
    public int method7565() {
        if (this.method7562()) {
            return 0;
        }
        class434 var1 = this.field4779.method7321(this.field4778 - 1);
        if (var1.field4750 == '\n') {
            return 0;
        } else if (this.method7564(var1)) {
            return this.field4779.field4732.field4755[42];
        } else {
            int var2 = this.field4779.field4732.field4755[var1.field4750];
            if (var2 == 0) {
                return var1.field4750 == '\t' ? this.field4779.field4732.field4755[32] * 3 : this.field4779.field4732.field4755[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qv.at(I)Lto;")
    public class517 method7566() {
        if (this.method7562()) {
            return new class517(0, 0);
        } else {
            class434 var1 = this.field4779.method7321(this.field4778 - 1);
            return new class517(var1.field4751 + this.method7565(), var1.field4752);
        }
    }

    @ObfuscatedName("qv.ab(II)Lqo;")
    public class434 method7567(int arg0) {
        return arg0 >= 0 && arg0 < this.method7563() ? this.field4779.method7321(this.field4776 + arg0) : null;
    }
}
