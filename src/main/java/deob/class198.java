package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public final class class198 implements Iterable {

    @ObfuscatedName("gs.f")
    public int field3087;

    @ObfuscatedName("gs.s")
    public class208[] field3086;

    @ObfuscatedName("gs.q")
    public class208 field3088;

    public class198(int arg0) {
        this.field3087 = arg0;
        this.field3086 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3086[var2] = new class208();
            var3.field3106 = var3;
            var3.field3107 = var3;
        }
    }

    @ObfuscatedName("gs.f(J)Lgm;")
    public class208 method3548(long arg0) {
        class208 var3 = this.field3086[(int) (arg0 & (long) (this.field3087 - 1))];
        for (this.field3088 = var3.field3106; this.field3088 != var3; this.field3088 = this.field3088.field3106) {
            if (this.field3088.field3105 == arg0) {
                class208 var4 = this.field3088;
                this.field3088 = this.field3088.field3106;
                return var4;
            }
        }
        this.field3088 = null;
        return null;
    }

    @ObfuscatedName("gs.s(Lgm;J)V")
    public void method3556(class208 arg0, long arg1) {
        if (arg0.field3107 != null) {
            arg0.method3665();
        }
        class208 var4 = this.field3086[(int) (arg1 & (long) (this.field3087 - 1))];
        arg0.field3107 = var4.field3107;
        arg0.field3106 = var4;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
        arg0.field3105 = arg1;
    }

    @ObfuscatedName("gs.q()V")
    public void method3549() {
        for (int var1 = 0; var1 < this.field3087; var1++) {
            class208 var2 = this.field3086[var1];
            while (true) {
                class208 var3 = var2.field3106;
                if (var2 == var3) {
                    break;
                }
                var3.method3665();
            }
        }
        this.field3088 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
