package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public final class class198 implements Iterable {

    @ObfuscatedName("gj.z")
    public int field3084;

    @ObfuscatedName("gj.q")
    public class208[] field3083;

    @ObfuscatedName("gj.k")
    public class208 field3082;

    public class198(int arg0) {
        this.field3084 = arg0;
        this.field3083 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3083[var2] = new class208();
            var3.field3101 = var3;
            var3.field3103 = var3;
        }
    }

    @ObfuscatedName("gj.z(J)Lgk;")
    public class208 method3486(long arg0) {
        class208 var3 = this.field3083[(int) (arg0 & (long) (this.field3084 - 1))];
        for (this.field3082 = var3.field3101; this.field3082 != var3; this.field3082 = this.field3082.field3101) {
            if (this.field3082.field3102 == arg0) {
                class208 var4 = this.field3082;
                this.field3082 = this.field3082.field3101;
                return var4;
            }
        }
        this.field3082 = null;
        return null;
    }

    @ObfuscatedName("gj.q(Lgk;J)V")
    public void method3480(class208 arg0, long arg1) {
        if (arg0.field3103 != null) {
            arg0.method3583();
        }
        class208 var4 = this.field3083[(int) (arg1 & (long) (this.field3084 - 1))];
        arg0.field3103 = var4.field3103;
        arg0.field3101 = var4;
        arg0.field3103.field3101 = arg0;
        arg0.field3101.field3103 = arg0;
        arg0.field3102 = arg1;
    }

    @ObfuscatedName("gj.k()V")
    public void method3479() {
        for (int var1 = 0; var1 < this.field3084; var1++) {
            class208 var2 = this.field3083[var1];
            while (true) {
                class208 var3 = var2.field3101;
                if (var2 == var3) {
                    break;
                }
                var3.method3583();
            }
        }
        this.field3082 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
