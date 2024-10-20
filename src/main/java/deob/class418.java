package deob;

@ObfuscatedName("qz")
public class class418 {

    @ObfuscatedName("qz.aq")
    public class414 field4611;

    @ObfuscatedName("qz.aw")
    public int field4613 = 0;

    @ObfuscatedName("qz.al")
    public int field4612 = 0;

    public class418(class414 arg0, int arg1, int arg2) {
        this.field4611 = arg0;
        this.field4613 = arg1;
        this.field4612 = arg2;
    }

    @ObfuscatedName("qz.aq(I)Ljava/lang/String;")
    public String method7242() {
        if (this.method7238()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7239());
        for (int var2 = this.field4613; var2 < this.field4612; var2++) {
            class416 var3 = this.field4611.method7065(var2);
            var1.append(var3.field4584);
        }
        return var1.toString();
    }

    @ObfuscatedName("qz.aw(IB)Z")
    public boolean method7237(int arg0) {
        return this.field4611.method7055() == 2 || this.field4611.method7055() == 1 && (!this.field4611.field4577 || this.field4612 - 1 != arg0);
    }

    @ObfuscatedName("qz.al(I)Z")
    public boolean method7238() {
        return this.field4613 == this.field4612;
    }

    @ObfuscatedName("qz.ai(B)I")
    public int method7239() {
        return this.field4612 - this.field4613;
    }

    @ObfuscatedName("qz.ar(Lpu;I)Z")
    public boolean method7240(class416 arg0) {
        if (this.field4611.field4581 == 2) {
            return true;
        } else if (this.field4611.field4581 == 0) {
            return false;
        } else {
            return this.field4611.method7118() != arg0;
        }
    }

    @ObfuscatedName("qz.as(B)I")
    public int method7241() {
        if (this.method7238()) {
            return 0;
        }
        class416 var1 = this.field4611.method7065(this.field4612 - 1);
        if (var1.field4584 == '\n') {
            return 0;
        } else if (this.method7240(var1)) {
            return this.field4611.field4578.field4607[42];
        } else {
            int var2 = this.field4611.field4578.field4607[var1.field4584];
            if (var2 == 0) {
                return var1.field4584 == '\t' ? this.field4611.field4578.field4607[32] * 3 : this.field4611.field4578.field4607[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qz.aa(I)Lth;")
    public class505 method7245() {
        if (this.method7238()) {
            return new class505(0, 0);
        } else {
            class416 var1 = this.field4611.method7065(this.field4612 - 1);
            return new class505(var1.field4585 + this.method7241(), var1.field4586);
        }
    }

    @ObfuscatedName("qz.az(IB)Lpu;")
    public class416 method7253(int arg0) {
        return arg0 >= 0 && arg0 < this.method7239() ? this.field4611.method7065(this.field4613 + arg0) : null;
    }
}
