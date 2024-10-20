package deob;

@ObfuscatedName("tx")
public final class class520 {

    @ObfuscatedName("tx.ak")
    public int field5212;

    @ObfuscatedName("tx.al")
    public class504[] field5211;

    @ObfuscatedName("tx.aj")
    public class504 field5210;

    @ObfuscatedName("tx.az")
    public class504 field5213;

    @ObfuscatedName("tx.af")
    public int field5214 = 0;

    public class520(int arg0) {
        this.field5212 = arg0;
        this.field5211 = new class504[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class504 var3 = this.field5211[var2] = new class504();
            var3.field5048 = var3;
            var3.field5050 = var3;
        }
    }

    @ObfuscatedName("tx.ak(J)Ltl;")
    public class504 method8528(long arg0) {
        class504 var3 = this.field5211[(int) (arg0 & (long) (this.field5212 - 1))];
        for (this.field5210 = var3.field5048; this.field5210 != var3; this.field5210 = this.field5210.field5048) {
            if (this.field5210.field5049 == arg0) {
                class504 var4 = this.field5210;
                this.field5210 = this.field5210.field5048;
                return var4;
            }
        }
        this.field5210 = null;
        return null;
    }

    @ObfuscatedName("tx.al()I")
    public int method8529() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5212; var2++) {
            class504 var3 = this.field5211[var2];
            for (class504 var4 = var3.field5048; var4 != var3; var4 = var4.field5048) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("tx.aj(Ltl;J)V")
    public void method8527(class504 arg0, long arg1) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        class504 var4 = this.field5211[(int) (arg1 & (long) (this.field5212 - 1))];
        arg0.field5050 = var4.field5050;
        arg0.field5048 = var4;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
        arg0.field5049 = arg1;
    }

    @ObfuscatedName("tx.az()Ltl;")
    public class504 method8530() {
        this.field5214 = 0;
        return this.method8531();
    }

    @ObfuscatedName("tx.af()Ltl;")
    public class504 method8531() {
        if (this.field5214 > 0 && this.field5211[this.field5214 - 1] != this.field5213) {
            class504 var1 = this.field5213;
            this.field5213 = var1.field5048;
            return var1;
        }
        class504 var2;
        do {
            if (this.field5214 >= this.field5212) {
                return null;
            }
            var2 = this.field5211[this.field5214++].field5048;
        } while (this.field5211[this.field5214 - 1] == var2);
        this.field5213 = var2.field5048;
        return var2;
    }
}
