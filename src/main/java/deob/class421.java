package deob;

@ObfuscatedName("pv")
public final class class421 {

    @ObfuscatedName("pv.o")
    public int field4602;

    @ObfuscatedName("pv.q")
    public class411[] field4603;

    @ObfuscatedName("pv.l")
    public class411 field4604;

    @ObfuscatedName("pv.k")
    public class411 field4605;

    @ObfuscatedName("pv.a")
    public int field4606 = 0;

    public class421(int arg0) {
        this.field4602 = arg0;
        this.field4603 = new class411[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class411 var3 = this.field4603[var2] = new class411();
            var3.field4467 = var3;
            var3.field4466 = var3;
        }
    }

    @ObfuscatedName("pv.o(J)Los;")
    public class411 method6687(long arg0) {
        class411 var3 = this.field4603[(int) (arg0 & (long) (this.field4602 - 1))];
        for (this.field4604 = var3.field4467; this.field4604 != var3; this.field4604 = this.field4604.field4467) {
            if (this.field4604.field4468 == arg0) {
                class411 var4 = this.field4604;
                this.field4604 = this.field4604.field4467;
                return var4;
            }
        }
        this.field4604 = null;
        return null;
    }

    @ObfuscatedName("pv.q(Los;J)V")
    public void method6688(class411 arg0, long arg1) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        class411 var4 = this.field4603[(int) (arg1 & (long) (this.field4602 - 1))];
        arg0.field4466 = var4.field4466;
        arg0.field4467 = var4;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
        arg0.field4468 = arg1;
    }

    @ObfuscatedName("pv.l()Los;")
    public class411 method6698() {
        this.field4606 = 0;
        return this.method6690();
    }

    @ObfuscatedName("pv.k()Los;")
    public class411 method6690() {
        if (this.field4606 > 0 && this.field4603[this.field4606 - 1] != this.field4605) {
            class411 var1 = this.field4605;
            this.field4605 = var1.field4467;
            return var1;
        }
        class411 var2;
        do {
            if (this.field4606 >= this.field4602) {
                return null;
            }
            var2 = this.field4603[this.field4606++].field4467;
        } while (this.field4603[this.field4606 - 1] == var2);
        this.field4605 = var2.field4467;
        return var2;
    }
}
