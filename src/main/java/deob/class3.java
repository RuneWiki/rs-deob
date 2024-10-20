package deob;

@ObfuscatedName("fw")
public final class class3 {

    @ObfuscatedName("fw.b")
    public int field9;

    @ObfuscatedName("fw.k")
    public class17 field11;

    @ObfuscatedName("fw.h")
    public class17[] field8;

    @ObfuscatedName("fw.w")
    public class17 field10;

    @ObfuscatedName("fw.t")
    public int field7 = 0;

    @ObfuscatedName("fw.h(Lft;J)V")
    public void method14(class17 arg0, long arg1) {
        if (arg0.field215 != null) {
            arg0.method234();
        }
        class17 var4 = this.field8[(int) (arg1 & (long) (this.field9 - 1))];
        arg0.field215 = var4.field215;
        arg0.field214 = var4;
        arg0.field215.field214 = arg0;
        arg0.field214.field215 = arg0;
        arg0.field213 = arg1;
    }

    @ObfuscatedName("fw.k()V")
    public void method15() {
        for (int var1 = 0; var1 < this.field9; var1++) {
            class17 var2 = this.field8[var1];
            while (true) {
                class17 var3 = var2.field214;
                if (var2 == var3) {
                    break;
                }
                var3.method234();
            }
        }
        this.field11 = null;
        this.field10 = null;
    }

    @ObfuscatedName("fw.w()Lft;")
    public class17 method16() {
        this.field7 = 0;
        return this.method17();
    }

    @ObfuscatedName("fw.t()Lft;")
    public class17 method17() {
        if (this.field7 > 0 && this.field8[this.field7 - 1] != this.field10) {
            class17 var1 = this.field10;
            this.field10 = var1.field214;
            return var1;
        }
        class17 var2;
        do {
            if (this.field7 >= this.field9) {
                return null;
            }
            var2 = this.field8[this.field7++].field214;
        } while (this.field8[this.field7 - 1] == var2);
        this.field10 = var2.field214;
        return var2;
    }

    @ObfuscatedName("fw.b(J)Lft;")
    public class17 method20(long arg0) {
        class17 var3 = this.field8[(int) (arg0 & (long) (this.field9 - 1))];
        for (this.field11 = var3.field214; this.field11 != var3; this.field11 = this.field11.field214) {
            if (this.field11.field213 == arg0) {
                class17 var4 = this.field11;
                this.field11 = this.field11.field214;
                return var4;
            }
        }
        this.field11 = null;
        return null;
    }

    public class3(int arg0) {
        this.field9 = arg0;
        this.field8 = new class17[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class17 var3 = this.field8[var2] = new class17();
            var3.field214 = var3;
            var3.field215 = var3;
        }
    }
}
