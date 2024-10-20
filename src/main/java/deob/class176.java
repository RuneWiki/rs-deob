package deob;

import java.util.Iterator;

@ObfuscatedName("fk")
public final class class176 implements Iterable {

    @ObfuscatedName("fk.t")
    public int field2846;

    @ObfuscatedName("fk.s")
    public class186[] field2845;

    @ObfuscatedName("fk.f")
    public class186 field2844;

    public class176(int arg0) {
        this.field2846 = arg0;
        this.field2845 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2845[var2] = new class186();
            var3.field2863 = var3;
            var3.field2865 = var3;
        }
    }

    @ObfuscatedName("fk.t(J)Lgm;")
    public class186 method3220(long arg0) {
        class186 var3 = this.field2845[(int) (arg0 & (long) (this.field2846 - 1))];
        for (this.field2844 = var3.field2863; this.field2844 != var3; this.field2844 = this.field2844.field2863) {
            if (this.field2844.field2864 == arg0) {
                class186 var4 = this.field2844;
                this.field2844 = this.field2844.field2863;
                return var4;
            }
        }
        this.field2844 = null;
        return null;
    }

    @ObfuscatedName("fk.s(Lgm;J)V")
    public void method3217(class186 arg0, long arg1) {
        if (arg0.field2865 != null) {
            arg0.method3316();
        }
        class186 var4 = this.field2845[(int) (arg1 & (long) (this.field2846 - 1))];
        arg0.field2865 = var4.field2865;
        arg0.field2863 = var4;
        arg0.field2865.field2863 = arg0;
        arg0.field2863.field2865 = arg0;
        arg0.field2864 = arg1;
    }

    @ObfuscatedName("fk.f()V")
    public void method3221() {
        for (int var1 = 0; var1 < this.field2846; var1++) {
            class186 var2 = this.field2845[var1];
            while (true) {
                class186 var3 = var2.field2863;
                if (var2 == var3) {
                    break;
                }
                var3.method3316();
            }
        }
        this.field2844 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
