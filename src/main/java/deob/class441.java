package deob;

@ObfuscatedName("pr")
public final class class441 {

    @ObfuscatedName("pr.a")
    public int field4776;

    @ObfuscatedName("pr.f")
    public class430[] field4780;

    @ObfuscatedName("pr.c")
    public class430 field4778;

    @ObfuscatedName("pr.x")
    public class430 field4779;

    @ObfuscatedName("pr.h")
    public int field4777 = 0;

    public class441(int arg0) {
        this.field4776 = arg0;
        this.field4780 = new class430[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class430 var3 = this.field4780[var2] = new class430();
            var3.field4636 = var3;
            var3.field4637 = var3;
        }
    }

    @ObfuscatedName("pr.a(J)Lpk;")
    public class430 method7466(long arg0) {
        class430 var3 = this.field4780[(int) (arg0 & (long) (this.field4776 - 1))];
        for (this.field4778 = var3.field4636; this.field4778 != var3; this.field4778 = this.field4778.field4636) {
            if (this.field4778.field4635 == arg0) {
                class430 var4 = this.field4778;
                this.field4778 = this.field4778.field4636;
                return var4;
            }
        }
        this.field4778 = null;
        return null;
    }

    @ObfuscatedName("pr.f(Lpk;J)V")
    public void method7468(class430 arg0, long arg1) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        class430 var4 = this.field4780[(int) (arg1 & (long) (this.field4776 - 1))];
        arg0.field4637 = var4.field4637;
        arg0.field4636 = var4;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
        arg0.field4635 = arg1;
    }

    @ObfuscatedName("pr.c()Lpk;")
    public class430 method7478() {
        this.field4777 = 0;
        return this.method7469();
    }

    @ObfuscatedName("pr.x()Lpk;")
    public class430 method7469() {
        if (this.field4777 > 0 && this.field4780[this.field4777 - 1] != this.field4779) {
            class430 var1 = this.field4779;
            this.field4779 = var1.field4636;
            return var1;
        }
        class430 var2;
        do {
            if (this.field4777 >= this.field4776) {
                return null;
            }
            var2 = this.field4780[this.field4777++].field4636;
        } while (this.field4780[this.field4777 - 1] == var2);
        this.field4779 = var2.field4636;
        return var2;
    }
}
