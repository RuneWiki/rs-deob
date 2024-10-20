package deob;

import java.util.Iterator;

@ObfuscatedName("pt")
public final class class420 implements Iterable {

    @ObfuscatedName("pt.o")
    public int field4600;

    @ObfuscatedName("pt.q")
    public class411[] field4599;

    @ObfuscatedName("pt.l")
    public class411 field4597;

    @ObfuscatedName("pt.k")
    public class411 field4598;

    @ObfuscatedName("pt.a")
    public int field4601 = 0;

    public class420(int arg0) {
        this.field4600 = arg0;
        this.field4599 = new class411[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class411 var3 = this.field4599[var2] = new class411();
            var3.field4467 = var3;
            var3.field4466 = var3;
        }
    }

    @ObfuscatedName("pt.o(J)Los;")
    public class411 method6665(long arg0) {
        class411 var3 = this.field4599[(int) (arg0 & (long) (this.field4600 - 1))];
        for (this.field4597 = var3.field4467; this.field4597 != var3; this.field4597 = this.field4597.field4467) {
            if (this.field4597.field4468 == arg0) {
                class411 var4 = this.field4597;
                this.field4597 = this.field4597.field4467;
                return var4;
            }
        }
        this.field4597 = null;
        return null;
    }

    @ObfuscatedName("pt.q(Los;J)V")
    public void method6666(class411 arg0, long arg1) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        class411 var4 = this.field4599[(int) (arg1 & (long) (this.field4600 - 1))];
        arg0.field4466 = var4.field4466;
        arg0.field4467 = var4;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
        arg0.field4468 = arg1;
    }

    @ObfuscatedName("pt.l()V")
    public void method6668() {
        for (int var1 = 0; var1 < this.field4600; var1++) {
            class411 var2 = this.field4599[var1];
            while (true) {
                class411 var3 = var2.field4467;
                if (var2 == var3) {
                    break;
                }
                var3.method6399();
            }
        }
        this.field4597 = null;
        this.field4598 = null;
    }

    @ObfuscatedName("pt.k()Los;")
    public class411 method6684() {
        this.field4601 = 0;
        return this.method6669();
    }

    @ObfuscatedName("pt.a()Los;")
    public class411 method6669() {
        if (this.field4601 > 0 && this.field4599[this.field4601 - 1] != this.field4598) {
            class411 var1 = this.field4598;
            this.field4598 = var1.field4467;
            return var1;
        }
        class411 var2;
        do {
            if (this.field4601 >= this.field4600) {
                return null;
            }
            var2 = this.field4599[this.field4601++].field4467;
        } while (this.field4599[this.field4601 - 1] == var2);
        this.field4598 = var2.field4467;
        return var2;
    }

    public Iterator iterator() {
        return new class419(this);
    }
}
