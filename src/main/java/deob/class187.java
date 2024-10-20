package deob;

@ObfuscatedName("gb")
public final class class187 {

    @ObfuscatedName("gb.t")
    public int field2989;

    @ObfuscatedName("gb.b")
    public class199[] field2990;

    @ObfuscatedName("gb.p")
    public class199 field2991;

    @ObfuscatedName("gb.e")
    public class199 field2992;

    @ObfuscatedName("gb.i")
    public int field2993 = 0;

    public class187(int arg0) {
        this.field2989 = arg0;
        this.field2990 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2990[var2] = new class199();
            var3.field3014 = var3;
            var3.field3016 = var3;
        }
    }

    @ObfuscatedName("gb.t(J)Lgt;")
    public class199 method3382(long arg0) {
        class199 var3 = this.field2990[(int) (arg0 & (long) (this.field2989 - 1))];
        for (this.field2991 = var3.field3014; this.field2991 != var3; this.field2991 = this.field2991.field3014) {
            if (this.field2991.field3015 == arg0) {
                class199 var4 = this.field2991;
                this.field2991 = this.field2991.field3014;
                return var4;
            }
        }
        this.field2991 = null;
        return null;
    }

    @ObfuscatedName("gb.b(Lgt;J)V")
    public void method3391(class199 arg0, long arg1) {
        if (arg0.field3016 != null) {
            arg0.method3506();
        }
        class199 var4 = this.field2990[(int) (arg1 & (long) (this.field2989 - 1))];
        arg0.field3016 = var4.field3016;
        arg0.field3014 = var4;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
        arg0.field3015 = arg1;
    }

    @ObfuscatedName("gb.p()V")
    public void method3380() {
        for (int var1 = 0; var1 < this.field2989; var1++) {
            class199 var2 = this.field2990[var1];
            while (true) {
                class199 var3 = var2.field3014;
                if (var2 == var3) {
                    break;
                }
                var3.method3506();
            }
        }
        this.field2991 = null;
        this.field2992 = null;
    }

    @ObfuscatedName("gb.e()Lgt;")
    public class199 method3384() {
        this.field2993 = 0;
        return this.method3377();
    }

    @ObfuscatedName("gb.i()Lgt;")
    public class199 method3377() {
        if (this.field2993 > 0 && this.field2990[this.field2993 - 1] != this.field2992) {
            class199 var1 = this.field2992;
            this.field2992 = var1.field3014;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2993 >= this.field2989) {
                return null;
            }
            var2 = this.field2990[this.field2993++].field3014;
        } while (this.field2990[this.field2993 - 1] == var2);
        this.field2992 = var2.field3014;
        return var2;
    }
}
