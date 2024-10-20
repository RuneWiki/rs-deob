package deob;

@ObfuscatedName("fw")
public final class class3 {

    @ObfuscatedName("fw.b")
    public class13 field29;

    @ObfuscatedName("fw.c")
    public class13[] field27;

    @ObfuscatedName("fw.m")
    public int field31 = 0;

    @ObfuscatedName("fw.i")
    public class13 field30;

    @ObfuscatedName("fw.v")
    public int field28;

    @ObfuscatedName("fw.v(J)Lfi;")
    public class13 method8(long arg0) {
        class13 var3 = this.field27[(int) (arg0 & (long) (this.field28 - 1))];
        for (this.field29 = var3.field77; this.field29 != var3; this.field29 = this.field29.field77) {
            if (this.field29.field76 == arg0) {
                class13 var4 = this.field29;
                this.field29 = this.field29.field77;
                return var4;
            }
        }
        this.field29 = null;
        return null;
    }

    @ObfuscatedName("fw.c(Lfi;J)V")
    public void method9(class13 arg0, long arg1) {
        if (arg0.field78 != null) {
            arg0.method76();
        }
        class13 var4 = this.field27[(int) (arg1 & (long) (this.field28 - 1))];
        arg0.field78 = var4.field78;
        arg0.field77 = var4;
        arg0.field78.field77 = arg0;
        arg0.field77.field78 = arg0;
        arg0.field76 = arg1;
    }

    @ObfuscatedName("fw.b()V")
    public void method10() {
        for (int var1 = 0; var1 < this.field28; var1++) {
            class13 var2 = this.field27[var1];
            while (true) {
                class13 var3 = var2.field77;
                if (var2 == var3) {
                    break;
                }
                var3.method76();
            }
        }
        this.field29 = null;
        this.field30 = null;
    }

    @ObfuscatedName("fw.m()Lfi;")
    public class13 method12() {
        if (this.field31 > 0 && this.field27[this.field31 - 1] != this.field30) {
            class13 var1 = this.field30;
            this.field30 = var1.field77;
            return var1;
        }
        class13 var2;
        do {
            if (this.field31 >= this.field28) {
                return null;
            }
            var2 = this.field27[this.field31++].field77;
        } while (this.field27[this.field31 - 1] == var2);
        this.field30 = var2.field77;
        return var2;
    }

    @ObfuscatedName("fw.i()Lfi;")
    public class13 method14() {
        this.field31 = 0;
        return this.method12();
    }

    public class3(int arg0) {
        this.field28 = arg0;
        this.field27 = new class13[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class13 var3 = this.field27[var2] = new class13();
            var3.field77 = var3;
            var3.field78 = var3;
        }
    }
}
