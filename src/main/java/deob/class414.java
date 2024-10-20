package deob;

@ObfuscatedName("pr")
public class class414 {

    @ObfuscatedName("pr.ac")
    public class410 field4552;

    @ObfuscatedName("pr.al")
    public int field4554 = 0;

    @ObfuscatedName("pr.ak")
    public int field4553 = 0;

    public class414(class410 arg0, int arg1, int arg2) {
        this.field4552 = arg0;
        this.field4554 = arg1;
        this.field4553 = arg2;
    }

    @ObfuscatedName("pr.ac(I)Ljava/lang/String;")
    public String method7047() {
        if (this.method7034()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7036());
        for (int var2 = this.field4554; var2 < this.field4553; var2++) {
            class412 var3 = this.field4552.method6797(var2);
            var1.append(var3.field4524);
        }
        return var1.toString();
    }

    @ObfuscatedName("pr.al(II)Z")
    public boolean method7033(int arg0) {
        return this.field4552.method6828() == 2 || this.field4552.method6828() == 1 && (!this.field4552.field4515 || this.field4553 - 1 != arg0);
    }

    @ObfuscatedName("pr.ak(B)Z")
    public boolean method7034() {
        return this.field4554 == this.field4553;
    }

    @ObfuscatedName("pr.ax(B)I")
    public int method7036() {
        return this.field4553 - this.field4554;
    }

    @ObfuscatedName("pr.ao(Lpe;B)Z")
    public boolean method7050(class412 arg0) {
        if (this.field4552.field4519 == 2) {
            return true;
        } else if (this.field4552.field4519 == 0) {
            return false;
        } else {
            return this.field4552.method6936() != arg0;
        }
    }

    @ObfuscatedName("pr.ah(I)I")
    public int method7048() {
        if (this.method7034()) {
            return 0;
        }
        class412 var1 = this.field4552.method6797(this.field4553 - 1);
        if (var1.field4524 == '\n') {
            return 0;
        } else if (this.method7050(var1)) {
            return this.field4552.field4507.field4533[42];
        } else {
            int var2 = this.field4552.field4507.field4533[var1.field4524];
            if (var2 == 0) {
                return var1.field4524 == '\t' ? this.field4552.field4507.field4533[32] * 3 : this.field4552.field4507.field4533[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("pr.ar(I)Ltw;")
    public class501 method7038() {
        if (this.method7034()) {
            return new class501(0, 0);
        } else {
            class412 var1 = this.field4552.method6797(this.field4553 - 1);
            return new class501(var1.field4525 + this.method7048(), var1.field4526);
        }
    }

    @ObfuscatedName("pr.ab(IB)Lpe;")
    public class412 method7039(int arg0) {
        return arg0 >= 0 && arg0 < this.method7036() ? this.field4552.method6797(this.field4554 + arg0) : null;
    }
}
