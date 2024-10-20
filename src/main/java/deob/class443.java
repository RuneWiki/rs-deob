package deob;

import java.util.Iterator;

@ObfuscatedName("ql")
public final class class443 implements Iterable {

    @ObfuscatedName("ql.h")
    public int field4821;

    @ObfuscatedName("ql.e")
    public class433[] field4818;

    @ObfuscatedName("ql.v")
    public class433 field4819;

    @ObfuscatedName("ql.x")
    public class433 field4820;

    @ObfuscatedName("ql.m")
    public int field4817 = 0;

    public class443(int arg0) {
        this.field4821 = arg0;
        this.field4818 = new class433[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class433 var3 = this.field4818[var2] = new class433();
            var3.field4684 = var3;
            var3.field4685 = var3;
        }
    }

    @ObfuscatedName("ql.h(J)Lpl;")
    public class433 method7525(long arg0) {
        class433 var3 = this.field4818[(int) (arg0 & (long) (this.field4821 - 1))];
        for (this.field4819 = var3.field4684; this.field4819 != var3; this.field4819 = this.field4819.field4684) {
            if (this.field4819.field4686 == arg0) {
                class433 var4 = this.field4819;
                this.field4819 = this.field4819.field4684;
                return var4;
            }
        }
        this.field4819 = null;
        return null;
    }

    @ObfuscatedName("ql.e(Lpl;J)V")
    public void method7523(class433 arg0, long arg1) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        class433 var4 = this.field4818[(int) (arg1 & (long) (this.field4821 - 1))];
        arg0.field4685 = var4.field4685;
        arg0.field4684 = var4;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
        arg0.field4686 = arg1;
    }

    @ObfuscatedName("ql.v()V")
    public void method7512() {
        for (int var1 = 0; var1 < this.field4821; var1++) {
            class433 var2 = this.field4818[var1];
            while (true) {
                class433 var3 = var2.field4684;
                if (var2 == var3) {
                    break;
                }
                var3.method7230();
            }
        }
        this.field4819 = null;
        this.field4820 = null;
    }

    @ObfuscatedName("ql.x()Lpl;")
    public class433 method7513() {
        this.field4817 = 0;
        return this.method7527();
    }

    @ObfuscatedName("ql.m()Lpl;")
    public class433 method7527() {
        if (this.field4817 > 0 && this.field4818[this.field4817 - 1] != this.field4820) {
            class433 var1 = this.field4820;
            this.field4820 = var1.field4684;
            return var1;
        }
        class433 var2;
        do {
            if (this.field4817 >= this.field4821) {
                return null;
            }
            var2 = this.field4818[this.field4817++].field4684;
        } while (this.field4818[this.field4817 - 1] == var2);
        this.field4820 = var2.field4684;
        return var2;
    }

    public Iterator iterator() {
        return new class442(this);
    }
}
