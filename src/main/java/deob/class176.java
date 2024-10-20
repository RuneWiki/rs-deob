package deob;

import java.util.Iterator;

@ObfuscatedName("fj")
public final class class176 implements Iterable {

    @ObfuscatedName("fj.g")
    public int field2858;

    @ObfuscatedName("fj.v")
    public class186[] field2856;

    @ObfuscatedName("fj.z")
    public class186 field2857;

    public class176(int arg0) {
        this.field2858 = arg0;
        this.field2856 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2856[var2] = new class186();
            var3.field2876 = var3;
            var3.field2877 = var3;
        }
    }

    @ObfuscatedName("fj.g(J)Lgc;")
    public class186 method3219(long arg0) {
        class186 var3 = this.field2856[(int) (arg0 & (long) (this.field2858 - 1))];
        for (this.field2857 = var3.field2876; this.field2857 != var3; this.field2857 = this.field2857.field2876) {
            if (this.field2857.field2875 == arg0) {
                class186 var4 = this.field2857;
                this.field2857 = this.field2857.field2876;
                return var4;
            }
        }
        this.field2857 = null;
        return null;
    }

    @ObfuscatedName("fj.v(Lgc;J)V")
    public void method3220(class186 arg0, long arg1) {
        if (arg0.field2877 != null) {
            arg0.method3322();
        }
        class186 var4 = this.field2856[(int) (arg1 & (long) (this.field2858 - 1))];
        arg0.field2877 = var4.field2877;
        arg0.field2876 = var4;
        arg0.field2877.field2876 = arg0;
        arg0.field2876.field2877 = arg0;
        arg0.field2875 = arg1;
    }

    @ObfuscatedName("fj.z()V")
    public void method3221() {
        for (int var1 = 0; var1 < this.field2858; var1++) {
            class186 var2 = this.field2856[var1];
            while (true) {
                class186 var3 = var2.field2876;
                if (var2 == var3) {
                    break;
                }
                var3.method3322();
            }
        }
        this.field2857 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
