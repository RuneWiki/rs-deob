package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public final class class198 implements Iterable {

    @ObfuscatedName("ge.l")
    public int field3086;

    @ObfuscatedName("ge.e")
    public class208[] field3087;

    @ObfuscatedName("ge.q")
    public class208 field3088;

    public class198(int arg0) {
        this.field3086 = arg0;
        this.field3087 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3087[var2] = new class208();
            var3.field3106 = var3;
            var3.field3105 = var3;
        }
    }

    @ObfuscatedName("ge.l(J)Lgj;")
    public class208 method3528(long arg0) {
        class208 var3 = this.field3087[(int) (arg0 & (long) (this.field3086 - 1))];
        for (this.field3088 = var3.field3106; this.field3088 != var3; this.field3088 = this.field3088.field3106) {
            if (this.field3088.field3107 == arg0) {
                class208 var4 = this.field3088;
                this.field3088 = this.field3088.field3106;
                return var4;
            }
        }
        this.field3088 = null;
        return null;
    }

    @ObfuscatedName("ge.e(Lgj;J)V")
    public void method3536(class208 arg0, long arg1) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        class208 var4 = this.field3087[(int) (arg1 & (long) (this.field3086 - 1))];
        arg0.field3105 = var4.field3105;
        arg0.field3106 = var4;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
        arg0.field3107 = arg1;
    }

    @ObfuscatedName("ge.q()V")
    public void method3527() {
        for (int var1 = 0; var1 < this.field3086; var1++) {
            class208 var2 = this.field3087[var1];
            while (true) {
                class208 var3 = var2.field3106;
                if (var2 == var3) {
                    break;
                }
                var3.method3620();
            }
        }
        this.field3088 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
