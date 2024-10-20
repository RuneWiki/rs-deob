package deob;

@ObfuscatedName("rc")
public final class class465 {

    @ObfuscatedName("rc.af")
    public int field4902;

    @ObfuscatedName("rc.an")
    public class449[] field4901;

    @ObfuscatedName("rc.aw")
    public class449 field4903;

    @ObfuscatedName("rc.ac")
    public class449 field4900;

    @ObfuscatedName("rc.au")
    public int field4904 = 0;

    public class465(int arg0) {
        this.field4902 = arg0;
        this.field4901 = new class449[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class449 var3 = this.field4901[var2] = new class449();
            var3.field4746 = var3;
            var3.field4747 = var3;
        }
    }

    @ObfuscatedName("rc.af(J)Lrp;")
    public class449 method7966(long arg0) {
        class449 var3 = this.field4901[(int) (arg0 & (long) (this.field4902 - 1))];
        for (this.field4903 = var3.field4746; this.field4903 != var3; this.field4903 = this.field4903.field4746) {
            if (this.field4903.field4745 == arg0) {
                class449 var4 = this.field4903;
                this.field4903 = this.field4903.field4746;
                return var4;
            }
        }
        this.field4903 = null;
        return null;
    }

    @ObfuscatedName("rc.an(Lrp;J)V")
    public void method7967(class449 arg0, long arg1) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        class449 var4 = this.field4901[(int) (arg1 & (long) (this.field4902 - 1))];
        arg0.field4747 = var4.field4747;
        arg0.field4746 = var4;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
        arg0.field4745 = arg1;
    }

    @ObfuscatedName("rc.aw()Lrp;")
    public class449 method7972() {
        this.field4904 = 0;
        return this.method7969();
    }

    @ObfuscatedName("rc.ac()Lrp;")
    public class449 method7969() {
        if (this.field4904 > 0 && this.field4901[this.field4904 - 1] != this.field4900) {
            class449 var1 = this.field4900;
            this.field4900 = var1.field4746;
            return var1;
        }
        class449 var2;
        do {
            if (this.field4904 >= this.field4902) {
                return null;
            }
            var2 = this.field4901[this.field4904++].field4746;
        } while (this.field4901[this.field4904 - 1] == var2);
        this.field4900 = var2.field4746;
        return var2;
    }
}
