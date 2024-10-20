package deob;

@ObfuscatedName("qs")
public class class419 {

    @ObfuscatedName("qs.az")
    public class415 field4636;

    @ObfuscatedName("qs.ah")
    public int field4634 = 0;

    @ObfuscatedName("qs.af")
    public int field4635 = 0;

    public class419(class415 arg0, int arg1, int arg2) {
        this.field4636 = arg0;
        this.field4634 = arg1;
        this.field4635 = arg2;
    }

    @ObfuscatedName("qs.az(B)Ljava/lang/String;")
    public String method7115() {
        if (this.method7135()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7118());
        for (int var2 = this.field4634; var2 < this.field4635; var2++) {
            class417 var3 = this.field4636.method6867(var2);
            var1.append(var3.field4608);
        }
        return var1.toString();
    }

    @ObfuscatedName("qs.ah(IB)Z")
    public boolean method7116(int arg0) {
        return this.field4636.method6892() == 2 || this.field4636.method6892() == 1 && (!this.field4636.field4600 || this.field4635 - 1 != arg0);
    }

    @ObfuscatedName("qs.af(I)Z")
    public boolean method7135() {
        return this.field4635 == this.field4634;
    }

    @ObfuscatedName("qs.at(I)I")
    public int method7118() {
        return this.field4635 - this.field4634;
    }

    @ObfuscatedName("qs.an(Lqt;I)Z")
    public boolean method7119(class417 arg0) {
        if (this.field4636.field4604 == 2) {
            return true;
        } else if (this.field4636.field4604 == 0) {
            return false;
        } else {
            return this.field4636.method6894() != arg0;
        }
    }

    @ObfuscatedName("qs.ao(I)I")
    public int method7124() {
        if (this.method7135()) {
            return 0;
        }
        class417 var1 = this.field4636.method6867(this.field4635 - 1);
        if (var1.field4608 == '\n') {
            return 0;
        } else if (this.method7119(var1)) {
            return this.field4636.field4603.field4612[42];
        } else {
            int var2 = this.field4636.field4603.field4612[var1.field4608];
            if (var2 == 0) {
                return var1.field4608 == '\t' ? this.field4636.field4603.field4612[32] * 3 : this.field4636.field4603.field4612[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qs.ab(I)Ltd;")
    public class506 method7120() {
        if (this.method7135()) {
            return new class506(0, 0);
        } else {
            class417 var1 = this.field4636.method6867(this.field4635 - 1);
            return new class506(var1.field4607 + this.method7124(), var1.field4606);
        }
    }

    @ObfuscatedName("qs.aw(IB)Lqt;")
    public class417 method7114(int arg0) {
        return arg0 >= 0 && arg0 < this.method7118() ? this.field4636.method6867(this.field4634 + arg0) : null;
    }
}
