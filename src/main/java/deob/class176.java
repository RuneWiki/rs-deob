package deob;

import java.util.Iterator;

@ObfuscatedName("fb")
public final class class176 implements Iterable {

    @ObfuscatedName("fb.i")
    public int field2850;

    @ObfuscatedName("fb.c")
    public class186[] field2851;

    @ObfuscatedName("fb.h")
    public class186 field2852;

    public class176(int arg0) {
        this.field2850 = arg0;
        this.field2851 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2851[var2] = new class186();
            var3.field2870 = var3;
            var3.field2869 = var3;
        }
    }

    @ObfuscatedName("fb.i(J)Lgq;")
    public class186 method3237(long arg0) {
        class186 var3 = this.field2851[(int) (arg0 & (long) (this.field2850 - 1))];
        for (this.field2852 = var3.field2870; this.field2852 != var3; this.field2852 = this.field2852.field2870) {
            if (this.field2852.field2871 == arg0) {
                class186 var4 = this.field2852;
                this.field2852 = this.field2852.field2870;
                return var4;
            }
        }
        this.field2852 = null;
        return null;
    }

    @ObfuscatedName("fb.c(Lgq;J)V")
    public void method3245(class186 arg0, long arg1) {
        if (arg0.field2869 != null) {
            arg0.method3334();
        }
        class186 var4 = this.field2851[(int) (arg1 & (long) (this.field2850 - 1))];
        arg0.field2869 = var4.field2869;
        arg0.field2870 = var4;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
        arg0.field2871 = arg1;
    }

    @ObfuscatedName("fb.h()V")
    public void method3238() {
        for (int var1 = 0; var1 < this.field2850; var1++) {
            class186 var2 = this.field2851[var1];
            while (true) {
                class186 var3 = var2.field2870;
                if (var2 == var3) {
                    break;
                }
                var3.method3334();
            }
        }
        this.field2852 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
