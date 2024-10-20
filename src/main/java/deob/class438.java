package deob;

@ObfuscatedName("qx")
public class class438 {

    @ObfuscatedName("qx.ab")
    public class434 field4775;

    @ObfuscatedName("qx.ay")
    public int field4772 = 0;

    @ObfuscatedName("qx.an")
    public int field4774 = 0;

    public class438(class434 arg0, int arg1, int arg2) {
        this.field4775 = arg0;
        this.field4772 = arg1;
        this.field4774 = arg2;
    }

    @ObfuscatedName("qx.ab(I)Ljava/lang/String;")
    public String method7633() {
        if (this.method7655()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7636());
        for (int var2 = this.field4772; var2 < this.field4774; var2++) {
            class436 var3 = this.field4775.method7389(var2);
            var1.append(var3.field4748);
        }
        return var1.toString();
    }

    @ObfuscatedName("qx.ay(IB)Z")
    public boolean method7652(int arg0) {
        return this.field4775.method7420() == 2 || this.field4775.method7420() == 1 && (!this.field4775.field4737 || this.field4774 - 1 != arg0);
    }

    @ObfuscatedName("qx.an(I)Z")
    public boolean method7655() {
        return this.field4774 == this.field4772;
    }

    @ObfuscatedName("qx.au(I)I")
    public int method7636() {
        return this.field4774 - this.field4772;
    }

    @ObfuscatedName("qx.ax(Lqu;I)Z")
    public boolean method7637(class436 arg0) {
        if (this.field4775.field4740 == 2) {
            return true;
        } else if (this.field4775.field4740 == 0) {
            return false;
        } else {
            return this.field4775.method7390() != arg0;
        }
    }

    @ObfuscatedName("qx.ao(B)I")
    public int method7651() {
        if (this.method7655()) {
            return 0;
        }
        class436 var1 = this.field4775.method7389(this.field4774 - 1);
        if (var1.field4748 == '\n') {
            return 0;
        } else if (this.method7637(var1)) {
            return this.field4775.field4728.field4771[42];
        } else {
            int var2 = this.field4775.field4728.field4771[var1.field4748];
            if (var2 == 0) {
                return var1.field4748 == '\t' ? this.field4775.field4728.field4771[32] * 3 : this.field4775.field4728.field4771[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("qx.am(I)Ltj;")
    public class519 method7635() {
        if (this.method7655()) {
            return new class519(0, 0);
        } else {
            class436 var1 = this.field4775.method7389(this.field4774 - 1);
            return new class519(var1.field4745 + this.method7651(), var1.field4747);
        }
    }

    @ObfuscatedName("qx.ac(IB)Lqu;")
    public class436 method7640(int arg0) {
        return arg0 >= 0 && arg0 < this.method7636() ? this.field4775.method7389(this.field4772 + arg0) : null;
    }
}
