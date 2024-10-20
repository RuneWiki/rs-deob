package deob;

import java.util.Iterator;

@ObfuscatedName("pe")
public final class class440 implements Iterable {

    @ObfuscatedName("pe.a")
    public int field4772;

    @ObfuscatedName("pe.f")
    public class430[] field4775;

    @ObfuscatedName("pe.c")
    public class430 field4773;

    @ObfuscatedName("pe.x")
    public class430 field4774;

    @ObfuscatedName("pe.h")
    public int field4771 = 0;

    public class440(int arg0) {
        this.field4772 = arg0;
        this.field4775 = new class430[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class430 var3 = this.field4775[var2] = new class430();
            var3.field4636 = var3;
            var3.field4637 = var3;
        }
    }

    @ObfuscatedName("pe.a(J)Lpk;")
    public class430 method7455(long arg0) {
        class430 var3 = this.field4775[(int) (arg0 & (long) (this.field4772 - 1))];
        for (this.field4773 = var3.field4636; this.field4773 != var3; this.field4773 = this.field4773.field4636) {
            if (this.field4773.field4635 == arg0) {
                class430 var4 = this.field4773;
                this.field4773 = this.field4773.field4636;
                return var4;
            }
        }
        this.field4773 = null;
        return null;
    }

    @ObfuscatedName("pe.f(Lpk;J)V")
    public void method7448(class430 arg0, long arg1) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        class430 var4 = this.field4775[(int) (arg1 & (long) (this.field4772 - 1))];
        arg0.field4637 = var4.field4637;
        arg0.field4636 = var4;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
        arg0.field4635 = arg1;
    }

    @ObfuscatedName("pe.c()V")
    public void method7449() {
        for (int var1 = 0; var1 < this.field4772; var1++) {
            class430 var2 = this.field4775[var1];
            while (true) {
                class430 var3 = var2.field4636;
                if (var2 == var3) {
                    break;
                }
                var3.method7170();
            }
        }
        this.field4773 = null;
        this.field4774 = null;
    }

    @ObfuscatedName("pe.x()Lpk;")
    public class430 method7454() {
        this.field4771 = 0;
        return this.method7456();
    }

    @ObfuscatedName("pe.h()Lpk;")
    public class430 method7456() {
        if (this.field4771 > 0 && this.field4775[this.field4771 - 1] != this.field4774) {
            class430 var1 = this.field4774;
            this.field4774 = var1.field4636;
            return var1;
        }
        class430 var2;
        do {
            if (this.field4771 >= this.field4772) {
                return null;
            }
            var2 = this.field4775[this.field4771++].field4636;
        } while (this.field4775[this.field4771 - 1] == var2);
        this.field4774 = var2.field4636;
        return var2;
    }

    public Iterator iterator() {
        return new class439(this);
    }
}
