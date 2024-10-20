package deob;

import java.util.Iterator;

@ObfuscatedName("pb")
public final class class419 implements Iterable {

    @ObfuscatedName("pb.c")
    public int field4599;

    @ObfuscatedName("pb.v")
    public class410[] field4596;

    @ObfuscatedName("pb.q")
    public class410 field4597;

    @ObfuscatedName("pb.f")
    public class410 field4598;

    @ObfuscatedName("pb.j")
    public int field4595 = 0;

    public class419(int arg0) {
        this.field4599 = arg0;
        this.field4596 = new class410[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class410 var3 = this.field4596[var2] = new class410();
            var3.field4463 = var3;
            var3.field4464 = var3;
        }
    }

    @ObfuscatedName("pb.c(J)Loh;")
    public class410 method6756(long arg0) {
        class410 var3 = this.field4596[(int) (arg0 & (long) (this.field4599 - 1))];
        for (this.field4597 = var3.field4463; this.field4597 != var3; this.field4597 = this.field4597.field4463) {
            if (this.field4597.field4462 == arg0) {
                class410 var4 = this.field4597;
                this.field4597 = this.field4597.field4463;
                return var4;
            }
        }
        this.field4597 = null;
        return null;
    }

    @ObfuscatedName("pb.v(Loh;J)V")
    public void method6754(class410 arg0, long arg1) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        class410 var4 = this.field4596[(int) (arg1 & (long) (this.field4599 - 1))];
        arg0.field4464 = var4.field4464;
        arg0.field4463 = var4;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
        arg0.field4462 = arg1;
    }

    @ObfuscatedName("pb.q()V")
    public void method6748() {
        for (int var1 = 0; var1 < this.field4599; var1++) {
            class410 var2 = this.field4596[var1];
            while (true) {
                class410 var3 = var2.field4463;
                if (var2 == var3) {
                    break;
                }
                var3.method6497();
            }
        }
        this.field4597 = null;
        this.field4598 = null;
    }

    @ObfuscatedName("pb.f()Loh;")
    public class410 method6749() {
        this.field4595 = 0;
        return this.method6750();
    }

    @ObfuscatedName("pb.j()Loh;")
    public class410 method6750() {
        if (this.field4595 > 0 && this.field4596[this.field4595 - 1] != this.field4598) {
            class410 var1 = this.field4598;
            this.field4598 = var1.field4463;
            return var1;
        }
        class410 var2;
        do {
            if (this.field4595 >= this.field4599) {
                return null;
            }
            var2 = this.field4596[this.field4595++].field4463;
        } while (this.field4596[this.field4595 - 1] == var2);
        this.field4598 = var2.field4463;
        return var2;
    }

    public Iterator iterator() {
        return new class418(this);
    }
}
