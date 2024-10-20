package deob;

import java.util.Iterator;

@ObfuscatedName("la")
public final class class317 implements Iterable {

    @ObfuscatedName("la.q")
    public int field3852;

    @ObfuscatedName("la.w")
    public class181[] field3851;

    @ObfuscatedName("la.e")
    public class181 field3850;

    @ObfuscatedName("la.p")
    public class181 field3853;

    @ObfuscatedName("la.k")
    public int field3854 = 0;

    public class317(int arg0) {
        this.field3852 = arg0;
        this.field3851 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3851[var2] = new class181();
            var3.field2115 = var3;
            var3.field2113 = var3;
        }
    }

    @ObfuscatedName("la.q(J)Lfw;")
    public class181 method5451(long arg0) {
        class181 var3 = this.field3851[(int) (arg0 & (long) (this.field3852 - 1))];
        for (this.field3850 = var3.field2115; this.field3850 != var3; this.field3850 = this.field3850.field2115) {
            if (this.field3850.field2114 == arg0) {
                class181 var4 = this.field3850;
                this.field3850 = this.field3850.field2115;
                return var4;
            }
        }
        this.field3850 = null;
        return null;
    }

    @ObfuscatedName("la.w(Lfw;J)V")
    public void method5465(class181 arg0, long arg1) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        class181 var4 = this.field3851[(int) (arg1 & (long) (this.field3852 - 1))];
        arg0.field2113 = var4.field2113;
        arg0.field2115 = var4;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
        arg0.field2114 = arg1;
    }

    @ObfuscatedName("la.e()V")
    public void method5453() {
        for (int var1 = 0; var1 < this.field3852; var1++) {
            class181 var2 = this.field3851[var1];
            while (true) {
                class181 var3 = var2.field2115;
                if (var2 == var3) {
                    break;
                }
                var3.method3286();
            }
        }
        this.field3850 = null;
        this.field3853 = null;
    }

    @ObfuscatedName("la.p()Lfw;")
    public class181 method5454() {
        this.field3854 = 0;
        return this.method5455();
    }

    @ObfuscatedName("la.k()Lfw;")
    public class181 method5455() {
        if (this.field3854 > 0 && this.field3851[this.field3854 - 1] != this.field3853) {
            class181 var1 = this.field3853;
            this.field3853 = var1.field2115;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3854 >= this.field3852) {
                return null;
            }
            var2 = this.field3851[this.field3854++].field2115;
        } while (this.field3851[this.field3854 - 1] == var2);
        this.field3853 = var2.field2115;
        return var2;
    }

    public Iterator iterator() {
        return new class318(this);
    }
}
