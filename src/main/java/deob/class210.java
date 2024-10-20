package deob;

import java.util.Iterator;

@ObfuscatedName("hd")
public final class class210 implements Iterable {

    @ObfuscatedName("hd.d")
    public int field2628;

    @ObfuscatedName("hd.z")
    public class217[] field2629;

    @ObfuscatedName("hd.n")
    public class217 field2630;

    @ObfuscatedName("hd.r")
    public class217 field2631;

    @ObfuscatedName("hd.e")
    public int field2632 = 0;

    public class210(int arg0) {
        this.field2628 = arg0;
        this.field2629 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2629[var2] = new class217();
            var3.field2654 = var3;
            var3.field2653 = var3;
        }
    }

    @ObfuscatedName("hd.d(J)Lho;")
    public class217 method3668(long arg0) {
        class217 var3 = this.field2629[(int) (arg0 & (long) (this.field2628 - 1))];
        for (this.field2630 = var3.field2654; this.field2630 != var3; this.field2630 = this.field2630.field2654) {
            if (this.field2630.field2655 == arg0) {
                class217 var4 = this.field2630;
                this.field2630 = this.field2630.field2654;
                return var4;
            }
        }
        this.field2630 = null;
        return null;
    }

    @ObfuscatedName("hd.z(Lho;J)V")
    public void method3666(class217 arg0, long arg1) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        class217 var4 = this.field2629[(int) (arg1 & (long) (this.field2628 - 1))];
        arg0.field2653 = var4.field2653;
        arg0.field2654 = var4;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
        arg0.field2655 = arg1;
    }

    @ObfuscatedName("hd.n()V")
    public void method3663() {
        for (int var1 = 0; var1 < this.field2628; var1++) {
            class217 var2 = this.field2629[var1];
            while (true) {
                class217 var3 = var2.field2654;
                if (var2 == var3) {
                    break;
                }
                var3.method3785();
            }
        }
        this.field2630 = null;
        this.field2631 = null;
    }

    @ObfuscatedName("hd.r()Lho;")
    public class217 method3664() {
        this.field2632 = 0;
        return this.method3675();
    }

    @ObfuscatedName("hd.e()Lho;")
    public class217 method3675() {
        if (this.field2632 > 0 && this.field2629[this.field2632 - 1] != this.field2631) {
            class217 var1 = this.field2631;
            this.field2631 = var1.field2654;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2632 >= this.field2628) {
                return null;
            }
            var2 = this.field2629[this.field2632++].field2654;
        } while (this.field2629[this.field2632 - 1] == var2);
        this.field2631 = var2.field2654;
        return var2;
    }

    public Iterator iterator() {
        return new class223(this);
    }
}
