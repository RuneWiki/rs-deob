package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public final class class198 implements Iterable {

    @ObfuscatedName("gv.d")
    public int field3088;

    @ObfuscatedName("gv.p")
    public class208[] field3086;

    @ObfuscatedName("gv.v")
    public class208 field3087;

    public class198(int arg0) {
        this.field3088 = arg0;
        this.field3086 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3086[var2] = new class208();
            var3.field3105 = var3;
            var3.field3106 = var3;
        }
    }

    @ObfuscatedName("gv.d(J)Lgj;")
    public class208 method3601(long arg0) {
        class208 var3 = this.field3086[(int) (arg0 & (long) (this.field3088 - 1))];
        for (this.field3087 = var3.field3105; this.field3087 != var3; this.field3087 = this.field3087.field3105) {
            if (this.field3087.field3107 == arg0) {
                class208 var4 = this.field3087;
                this.field3087 = this.field3087.field3105;
                return var4;
            }
        }
        this.field3087 = null;
        return null;
    }

    @ObfuscatedName("gv.p(Lgj;J)V")
    public void method3602(class208 arg0, long arg1) {
        if (arg0.field3106 != null) {
            arg0.method3715();
        }
        class208 var4 = this.field3086[(int) (arg1 & (long) (this.field3088 - 1))];
        arg0.field3106 = var4.field3106;
        arg0.field3105 = var4;
        arg0.field3106.field3105 = arg0;
        arg0.field3105.field3106 = arg0;
        arg0.field3107 = arg1;
    }

    @ObfuscatedName("gv.v()V")
    public void method3600() {
        for (int var1 = 0; var1 < this.field3088; var1++) {
            class208 var2 = this.field3086[var1];
            while (true) {
                class208 var3 = var2.field3105;
                if (var2 == var3) {
                    break;
                }
                var3.method3715();
            }
        }
        this.field3087 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
