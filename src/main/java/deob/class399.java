package deob;

@ObfuscatedName("pl")
public class class399 {

    @ObfuscatedName("pl.au")
    public class395 field4503;

    @ObfuscatedName("pl.ae")
    public int field4504 = 0;

    @ObfuscatedName("pl.ao")
    public int field4505 = 0;

    public class399(class395 arg0, int arg1, int arg2) {
        this.field4503 = arg0;
        this.field4504 = arg1;
        this.field4505 = arg2;
    }

    @ObfuscatedName("pl.au(B)Ljava/lang/String;")
    public String method6948() {
        if (this.method6950()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6951());
        for (int var2 = this.field4504; var2 < this.field4505; var2++) {
            class397 var3 = this.field4503.method6717(var2);
            var1.append(var3.field4477);
        }
        return var1.toString();
    }

    @ObfuscatedName("pl.ae(IB)Z")
    public boolean method6961(int arg0) {
        return this.field4503.method6722() == 2 || this.field4503.method6722() == 1 && (!this.field4503.field4467 || this.field4505 - 1 != arg0);
    }

    @ObfuscatedName("pl.ao(I)Z")
    public boolean method6950() {
        return this.field4505 == this.field4504;
    }

    @ObfuscatedName("pl.at(I)I")
    public int method6951() {
        return this.field4505 - this.field4504;
    }

    @ObfuscatedName("pl.ac(Lpz;I)Z")
    public boolean method6952(class397 arg0) {
        if (this.field4503.field4469 == 2) {
            return true;
        } else if (this.field4503.field4469 == 0) {
            return false;
        } else {
            return this.field4503.method6690() != arg0;
        }
    }

    @ObfuscatedName("pl.ai(I)I")
    public int method6956() {
        if (this.method6950()) {
            return 0;
        }
        class397 var1 = this.field4503.method6717(this.field4505 - 1);
        if (var1.field4477 == '\n') {
            return 0;
        } else if (this.method6952(var1)) {
            return this.field4503.field4466.field4487[42];
        } else {
            int var2 = this.field4503.field4466.field4487[var1.field4477];
            if (var2 == 0) {
                return var1.field4477 == '\t' ? this.field4503.field4466.field4487[32] * 3 : this.field4503.field4466.field4487[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("pl.az(I)Lss;")
    public class486 method6959() {
        if (this.method6950()) {
            return new class486(0, 0);
        } else {
            class397 var1 = this.field4503.method6717(this.field4505 - 1);
            return new class486(var1.field4476 + this.method6956(), var1.field4479);
        }
    }

    @ObfuscatedName("pl.ap(II)Lpz;")
    public class397 method6955(int arg0) {
        return arg0 >= 0 && arg0 < this.method6951() ? this.field4503.method6717(this.field4504 + arg0) : null;
    }
}
