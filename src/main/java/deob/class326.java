package deob;

import java.util.Iterator;

@ObfuscatedName("lf")
public final class class326 implements Iterable {

    @ObfuscatedName("lf.m")
    public int field3851;

    @ObfuscatedName("lf.o")
    public class190[] field3853;

    @ObfuscatedName("lf.q")
    public class190 field3852;

    @ObfuscatedName("lf.j")
    public class190 field3854;

    @ObfuscatedName("lf.p")
    public int field3850 = 0;

    public class326(int arg0) {
        this.field3851 = arg0;
        this.field3853 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3853[var2] = new class190();
            var3.field2153 = var3;
            var3.field2151 = var3;
        }
    }

    @ObfuscatedName("lf.m(J)Lgr;")
    public class190 method5615(long arg0) {
        class190 var3 = this.field3853[(int) (arg0 & (long) (this.field3851 - 1))];
        for (this.field3852 = var3.field2153; this.field3852 != var3; this.field3852 = this.field3852.field2153) {
            if (this.field3852.field2152 == arg0) {
                class190 var4 = this.field3852;
                this.field3852 = this.field3852.field2153;
                return var4;
            }
        }
        this.field3852 = null;
        return null;
    }

    @ObfuscatedName("lf.o(Lgr;J)V")
    public void method5614(class190 arg0, long arg1) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        class190 var4 = this.field3853[(int) (arg1 & (long) (this.field3851 - 1))];
        arg0.field2151 = var4.field2151;
        arg0.field2153 = var4;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
        arg0.field2152 = arg1;
    }

    @ObfuscatedName("lf.q()V")
    public void method5617() {
        for (int var1 = 0; var1 < this.field3851; var1++) {
            class190 var2 = this.field3853[var1];
            while (true) {
                class190 var3 = var2.field2153;
                if (var2 == var3) {
                    break;
                }
                var3.method3388();
            }
        }
        this.field3852 = null;
        this.field3854 = null;
    }

    @ObfuscatedName("lf.j()Lgr;")
    public class190 method5618() {
        this.field3850 = 0;
        return this.method5616();
    }

    @ObfuscatedName("lf.p()Lgr;")
    public class190 method5616() {
        if (this.field3850 > 0 && this.field3853[this.field3850 - 1] != this.field3854) {
            class190 var1 = this.field3854;
            this.field3854 = var1.field2153;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3850 >= this.field3851) {
                return null;
            }
            var2 = this.field3853[this.field3850++].field2153;
        } while (this.field3853[this.field3850 - 1] == var2);
        this.field3854 = var2.field2153;
        return var2;
    }

    public Iterator iterator() {
        return new class327(this);
    }
}
