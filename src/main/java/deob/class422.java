package deob;

@ObfuscatedName("pm")
public final class class422 {

    @ObfuscatedName("pm.c")
    public int field4636;

    @ObfuscatedName("pm.p")
    public class412[] field4637;

    @ObfuscatedName("pm.f")
    public class412 field4638;

    @ObfuscatedName("pm.n")
    public class412 field4640;

    @ObfuscatedName("pm.k")
    public int field4639 = 0;

    public class422(int arg0) {
        this.field4636 = arg0;
        this.field4637 = new class412[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class412 var3 = this.field4637[var2] = new class412();
            var3.field4505 = var3;
            var3.field4506 = var3;
        }
    }

    @ObfuscatedName("pm.c(J)Lov;")
    public class412 method6941(long arg0) {
        class412 var3 = this.field4637[(int) (arg0 & (long) (this.field4636 - 1))];
        for (this.field4638 = var3.field4505; this.field4638 != var3; this.field4638 = this.field4638.field4505) {
            if (this.field4638.field4504 == arg0) {
                class412 var4 = this.field4638;
                this.field4638 = this.field4638.field4505;
                return var4;
            }
        }
        this.field4638 = null;
        return null;
    }

    @ObfuscatedName("pm.p(Lov;J)V")
    public void method6948(class412 arg0, long arg1) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        class412 var4 = this.field4637[(int) (arg1 & (long) (this.field4636 - 1))];
        arg0.field4506 = var4.field4506;
        arg0.field4505 = var4;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
        arg0.field4504 = arg1;
    }

    @ObfuscatedName("pm.f()Lov;")
    public class412 method6943() {
        this.field4639 = 0;
        return this.method6944();
    }

    @ObfuscatedName("pm.n()Lov;")
    public class412 method6944() {
        if (this.field4639 > 0 && this.field4637[this.field4639 - 1] != this.field4640) {
            class412 var1 = this.field4640;
            this.field4640 = var1.field4505;
            return var1;
        }
        class412 var2;
        do {
            if (this.field4639 >= this.field4636) {
                return null;
            }
            var2 = this.field4637[this.field4639++].field4505;
        } while (this.field4637[this.field4639 - 1] == var2);
        this.field4640 = var2.field4505;
        return var2;
    }
}
