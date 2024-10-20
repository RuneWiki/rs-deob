package deob;

import java.util.Iterator;

@ObfuscatedName("ln")
public final class class316 implements Iterable {

    @ObfuscatedName("ln.s")
    public int field3828;

    @ObfuscatedName("ln.j")
    public class181[] field3827;

    @ObfuscatedName("ln.i")
    public class181 field3829;

    @ObfuscatedName("ln.k")
    public class181 field3830;

    @ObfuscatedName("ln.u")
    public int field3826 = 0;

    public class316(int arg0) {
        this.field3828 = arg0;
        this.field3827 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3827[var2] = new class181();
            var3.field2097 = var3;
            var3.field2095 = var3;
        }
    }

    @ObfuscatedName("ln.s(J)Lfb;")
    public class181 method5405(long arg0) {
        class181 var3 = this.field3827[(int) (arg0 & (long) (this.field3828 - 1))];
        for (this.field3829 = var3.field2097; this.field3829 != var3; this.field3829 = this.field3829.field2097) {
            if (this.field3829.field2096 == arg0) {
                class181 var4 = this.field3829;
                this.field3829 = this.field3829.field2097;
                return var4;
            }
        }
        this.field3829 = null;
        return null;
    }

    @ObfuscatedName("ln.j(Lfb;J)V")
    public void method5400(class181 arg0, long arg1) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        class181 var4 = this.field3827[(int) (arg1 & (long) (this.field3828 - 1))];
        arg0.field2095 = var4.field2095;
        arg0.field2097 = var4;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
        arg0.field2096 = arg1;
    }

    @ObfuscatedName("ln.i()V")
    public void method5398() {
        for (int var1 = 0; var1 < this.field3828; var1++) {
            class181 var2 = this.field3827[var1];
            while (true) {
                class181 var3 = var2.field2097;
                if (var2 == var3) {
                    break;
                }
                var3.method3304();
            }
        }
        this.field3829 = null;
        this.field3830 = null;
    }

    @ObfuscatedName("ln.k()Lfb;")
    public class181 method5402() {
        this.field3826 = 0;
        return this.method5403();
    }

    @ObfuscatedName("ln.u()Lfb;")
    public class181 method5403() {
        if (this.field3826 > 0 && this.field3827[this.field3826 - 1] != this.field3830) {
            class181 var1 = this.field3830;
            this.field3830 = var1.field2097;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3826 >= this.field3828) {
                return null;
            }
            var2 = this.field3827[this.field3826++].field2097;
        } while (this.field3827[this.field3826 - 1] == var2);
        this.field3830 = var2.field2097;
        return var2;
    }

    public Iterator iterator() {
        return new class317(this);
    }
}
