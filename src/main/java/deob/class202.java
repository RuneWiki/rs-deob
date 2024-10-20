package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public final class class202 implements Iterable {

    @ObfuscatedName("gj.s")
    public int field3146;

    @ObfuscatedName("gj.z")
    public class212[] field3147;

    @ObfuscatedName("gj.t")
    public class212 field3148;

    public class202(int arg0) {
        this.field3146 = arg0;
        this.field3147 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3147[var2] = new class212();
            var3.field3166 = var3;
            var3.field3168 = var3;
        }
    }

    @ObfuscatedName("gj.s(J)Lhg;")
    public class212 method3572(long arg0) {
        class212 var3 = this.field3147[(int) (arg0 & (long) (this.field3146 - 1))];
        for (this.field3148 = var3.field3166; this.field3148 != var3; this.field3148 = this.field3148.field3166) {
            if (this.field3148.field3167 == arg0) {
                class212 var4 = this.field3148;
                this.field3148 = this.field3148.field3166;
                return var4;
            }
        }
        this.field3148 = null;
        return null;
    }

    @ObfuscatedName("gj.z(Lhg;J)V")
    public void method3573(class212 arg0, long arg1) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        class212 var4 = this.field3147[(int) (arg1 & (long) (this.field3146 - 1))];
        arg0.field3168 = var4.field3168;
        arg0.field3166 = var4;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
        arg0.field3167 = arg1;
    }

    @ObfuscatedName("gj.t()V")
    public void method3574() {
        for (int var1 = 0; var1 < this.field3146; var1++) {
            class212 var2 = this.field3147[var1];
            while (true) {
                class212 var3 = var2.field3166;
                if (var2 == var3) {
                    break;
                }
                var3.method3699();
            }
        }
        this.field3148 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
