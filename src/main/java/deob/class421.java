package deob;

import java.util.Iterator;

@ObfuscatedName("pq")
public final class class421 implements Iterable {

    @ObfuscatedName("pq.c")
    public int field4632;

    @ObfuscatedName("pq.p")
    public class412[] field4634;

    @ObfuscatedName("pq.f")
    public class412 field4631;

    @ObfuscatedName("pq.n")
    public class412 field4633;

    @ObfuscatedName("pq.k")
    public int field4635 = 0;

    public class421(int arg0) {
        this.field4632 = arg0;
        this.field4634 = new class412[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class412 var3 = this.field4634[var2] = new class412();
            var3.field4505 = var3;
            var3.field4506 = var3;
        }
    }

    @ObfuscatedName("pq.c(J)Lov;")
    public class412 method6917(long arg0) {
        class412 var3 = this.field4634[(int) (arg0 & (long) (this.field4632 - 1))];
        for (this.field4631 = var3.field4505; this.field4631 != var3; this.field4631 = this.field4631.field4505) {
            if (this.field4631.field4504 == arg0) {
                class412 var4 = this.field4631;
                this.field4631 = this.field4631.field4505;
                return var4;
            }
        }
        this.field4631 = null;
        return null;
    }

    @ObfuscatedName("pq.p(Lov;J)V")
    public void method6918(class412 arg0, long arg1) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        class412 var4 = this.field4634[(int) (arg1 & (long) (this.field4632 - 1))];
        arg0.field4506 = var4.field4506;
        arg0.field4505 = var4;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
        arg0.field4504 = arg1;
    }

    @ObfuscatedName("pq.f()V")
    public void method6928() {
        for (int var1 = 0; var1 < this.field4632; var1++) {
            class412 var2 = this.field4634[var1];
            while (true) {
                class412 var3 = var2.field4505;
                if (var2 == var3) {
                    break;
                }
                var3.method6657();
            }
        }
        this.field4631 = null;
        this.field4633 = null;
    }

    @ObfuscatedName("pq.n()Lov;")
    public class412 method6925() {
        this.field4635 = 0;
        return this.method6916();
    }

    @ObfuscatedName("pq.k()Lov;")
    public class412 method6916() {
        if (this.field4635 > 0 && this.field4634[this.field4635 - 1] != this.field4633) {
            class412 var1 = this.field4633;
            this.field4633 = var1.field4505;
            return var1;
        }
        class412 var2;
        do {
            if (this.field4635 >= this.field4632) {
                return null;
            }
            var2 = this.field4634[this.field4635++].field4505;
        } while (this.field4634[this.field4635 - 1] == var2);
        this.field4633 = var2.field4505;
        return var2;
    }

    public Iterator iterator() {
        return new class420(this);
    }
}
