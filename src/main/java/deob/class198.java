package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class198 implements Iterable {

    @ObfuscatedName("gu.o")
    public int field3092;

    @ObfuscatedName("gu.e")
    public class208[] field3093;

    @ObfuscatedName("gu.u")
    public class208 field3094;

    public class198(int arg0) {
        this.field3092 = arg0;
        this.field3093 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3093[var2] = new class208();
            var3.field3112 = var3;
            var3.field3111 = var3;
        }
    }

    @ObfuscatedName("gu.o(J)Lgn;")
    public class208 method3564(long arg0) {
        class208 var3 = this.field3093[(int) (arg0 & (long) (this.field3092 - 1))];
        for (this.field3094 = var3.field3112; this.field3094 != var3; this.field3094 = this.field3094.field3112) {
            if (this.field3094.field3113 == arg0) {
                class208 var4 = this.field3094;
                this.field3094 = this.field3094.field3112;
                return var4;
            }
        }
        this.field3094 = null;
        return null;
    }

    @ObfuscatedName("gu.e(Lgn;J)V")
    public void method3563(class208 arg0, long arg1) {
        if (arg0.field3111 != null) {
            arg0.method3670();
        }
        class208 var4 = this.field3093[(int) (arg1 & (long) (this.field3092 - 1))];
        arg0.field3111 = var4.field3111;
        arg0.field3112 = var4;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
        arg0.field3113 = arg1;
    }

    @ObfuscatedName("gu.u()V")
    public void method3565() {
        for (int var1 = 0; var1 < this.field3092; var1++) {
            class208 var2 = this.field3093[var1];
            while (true) {
                class208 var3 = var2.field3112;
                if (var2 == var3) {
                    break;
                }
                var3.method3670();
            }
        }
        this.field3094 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
