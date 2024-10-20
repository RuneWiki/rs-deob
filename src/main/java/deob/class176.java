package deob;

import java.util.Iterator;

@ObfuscatedName("fq")
public final class class176 implements Iterable {

    @ObfuscatedName("fq.k")
    public int field2858;

    @ObfuscatedName("fq.r")
    public class186[] field2857;

    @ObfuscatedName("fq.y")
    public class186 field2856;

    public class176(int arg0) {
        this.field2858 = arg0;
        this.field2857 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2857[var2] = new class186();
            var3.field2875 = var3;
            var3.field2876 = var3;
        }
    }

    @ObfuscatedName("fq.k(J)Lgo;")
    public class186 method3178(long arg0) {
        class186 var3 = this.field2857[(int) (arg0 & (long) (this.field2858 - 1))];
        for (this.field2856 = var3.field2875; this.field2856 != var3; this.field2856 = this.field2856.field2875) {
            if (this.field2856.field2877 == arg0) {
                class186 var4 = this.field2856;
                this.field2856 = this.field2856.field2875;
                return var4;
            }
        }
        this.field2856 = null;
        return null;
    }

    @ObfuscatedName("fq.r(Lgo;J)V")
    public void method3176(class186 arg0, long arg1) {
        if (arg0.field2876 != null) {
            arg0.method3275();
        }
        class186 var4 = this.field2857[(int) (arg1 & (long) (this.field2858 - 1))];
        arg0.field2876 = var4.field2876;
        arg0.field2875 = var4;
        arg0.field2876.field2875 = arg0;
        arg0.field2875.field2876 = arg0;
        arg0.field2877 = arg1;
    }

    @ObfuscatedName("fq.y()V")
    public void method3180() {
        for (int var1 = 0; var1 < this.field2858; var1++) {
            class186 var2 = this.field2857[var1];
            while (true) {
                class186 var3 = var2.field2875;
                if (var2 == var3) {
                    break;
                }
                var3.method3275();
            }
        }
        this.field2856 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
