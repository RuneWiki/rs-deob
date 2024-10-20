package deob;

import java.util.Iterator;

@ObfuscatedName("lp")
public final class class317 implements Iterable {

    @ObfuscatedName("lp.c")
    public int field3825;

    @ObfuscatedName("lp.t")
    public class181[] field3822;

    @ObfuscatedName("lp.o")
    public class181 field3824;

    @ObfuscatedName("lp.e")
    public class181 field3826;

    @ObfuscatedName("lp.i")
    public int field3823 = 0;

    public class317(int arg0) {
        this.field3825 = arg0;
        this.field3822 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3822[var2] = new class181();
            var3.field2114 = var3;
            var3.field2113 = var3;
        }
    }

    @ObfuscatedName("lp.c(J)Lft;")
    public class181 method5510(long arg0) {
        class181 var3 = this.field3822[(int) (arg0 & (long) (this.field3825 - 1))];
        for (this.field3824 = var3.field2114; this.field3824 != var3; this.field3824 = this.field3824.field2114) {
            if (this.field3824.field2115 == arg0) {
                class181 var4 = this.field3824;
                this.field3824 = this.field3824.field2114;
                return var4;
            }
        }
        this.field3824 = null;
        return null;
    }

    @ObfuscatedName("lp.t(Lft;J)V")
    public void method5496(class181 arg0, long arg1) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        class181 var4 = this.field3822[(int) (arg1 & (long) (this.field3825 - 1))];
        arg0.field2113 = var4.field2113;
        arg0.field2114 = var4;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
        arg0.field2115 = arg1;
    }

    @ObfuscatedName("lp.o()V")
    public void method5497() {
        for (int var1 = 0; var1 < this.field3825; var1++) {
            class181 var2 = this.field3822[var1];
            while (true) {
                class181 var3 = var2.field2114;
                if (var2 == var3) {
                    break;
                }
                var3.method3351();
            }
        }
        this.field3824 = null;
        this.field3826 = null;
    }

    @ObfuscatedName("lp.e()Lft;")
    public class181 method5498() {
        this.field3823 = 0;
        return this.method5499();
    }

    @ObfuscatedName("lp.i()Lft;")
    public class181 method5499() {
        if (this.field3823 > 0 && this.field3822[this.field3823 - 1] != this.field3826) {
            class181 var1 = this.field3826;
            this.field3826 = var1.field2114;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3823 >= this.field3825) {
                return null;
            }
            var2 = this.field3822[this.field3823++].field2114;
        } while (this.field3822[this.field3823 - 1] == var2);
        this.field3826 = var2.field2114;
        return var2;
    }

    public Iterator iterator() {
        return new class318(this);
    }
}
