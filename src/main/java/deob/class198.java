package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public final class class198 implements Iterable {

    @ObfuscatedName("gs.n")
    public int field3092;

    @ObfuscatedName("gs.q")
    public class208[] field3093;

    @ObfuscatedName("gs.c")
    public class208 field3091;

    public class198(int arg0) {
        this.field3092 = arg0;
        this.field3093 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3093[var2] = new class208();
            var3.field3110 = var3;
            var3.field3111 = var3;
        }
    }

    @ObfuscatedName("gs.n(J)Lga;")
    public class208 method3533(long arg0) {
        class208 var3 = this.field3093[(int) (arg0 & (long) (this.field3092 - 1))];
        for (this.field3091 = var3.field3110; this.field3091 != var3; this.field3091 = this.field3091.field3110) {
            if (this.field3091.field3112 == arg0) {
                class208 var4 = this.field3091;
                this.field3091 = this.field3091.field3110;
                return var4;
            }
        }
        this.field3091 = null;
        return null;
    }

    @ObfuscatedName("gs.q(Lga;J)V")
    public void method3532(class208 arg0, long arg1) {
        if (arg0.field3111 != null) {
            arg0.method3651();
        }
        class208 var4 = this.field3093[(int) (arg1 & (long) (this.field3092 - 1))];
        arg0.field3111 = var4.field3111;
        arg0.field3110 = var4;
        arg0.field3111.field3110 = arg0;
        arg0.field3110.field3111 = arg0;
        arg0.field3112 = arg1;
    }

    @ObfuscatedName("gs.c()V")
    public void method3540() {
        for (int var1 = 0; var1 < this.field3092; var1++) {
            class208 var2 = this.field3093[var1];
            while (true) {
                class208 var3 = var2.field3110;
                if (var2 == var3) {
                    break;
                }
                var3.method3651();
            }
        }
        this.field3091 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
