package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public final class class192 implements Iterable {

    @ObfuscatedName("gn.j")
    public int field3026;

    @ObfuscatedName("gn.y")
    public class202[] field3024;

    @ObfuscatedName("gn.z")
    public class202 field3025;

    public class192(int arg0) {
        this.field3026 = arg0;
        this.field3024 = new class202[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class202 var3 = this.field3024[var2] = new class202();
            var3.field3044 = var3;
            var3.field3045 = var3;
        }
    }

    @ObfuscatedName("gn.j(J)Lgz;")
    public class202 method3473(long arg0) {
        class202 var3 = this.field3024[(int) (arg0 & (long) (this.field3026 - 1))];
        for (this.field3025 = var3.field3044; this.field3025 != var3; this.field3025 = this.field3025.field3044) {
            if (this.field3025.field3043 == arg0) {
                class202 var4 = this.field3025;
                this.field3025 = this.field3025.field3044;
                return var4;
            }
        }
        this.field3025 = null;
        return null;
    }

    @ObfuscatedName("gn.y(Lgz;J)V")
    public void method3474(class202 arg0, long arg1) {
        if (arg0.field3045 != null) {
            arg0.method3563();
        }
        class202 var4 = this.field3024[(int) (arg1 & (long) (this.field3026 - 1))];
        arg0.field3045 = var4.field3045;
        arg0.field3044 = var4;
        arg0.field3045.field3044 = arg0;
        arg0.field3044.field3045 = arg0;
        arg0.field3043 = arg1;
    }

    @ObfuscatedName("gn.z()V")
    public void method3475() {
        for (int var1 = 0; var1 < this.field3026; var1++) {
            class202 var2 = this.field3024[var1];
            while (true) {
                class202 var3 = var2.field3044;
                if (var2 == var3) {
                    break;
                }
                var3.method3563();
            }
        }
        this.field3025 = null;
    }

    public Iterator iterator() {
        return new class188(this);
    }
}
