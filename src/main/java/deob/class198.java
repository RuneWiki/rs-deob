package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public final class class198 implements Iterable {

    @ObfuscatedName("gd.h")
    public int field3081;

    @ObfuscatedName("gd.m")
    public class208[] field3082;

    @ObfuscatedName("gd.i")
    public class208 field3083;

    public class198(int arg0) {
        this.field3081 = arg0;
        this.field3082 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3082[var2] = new class208();
            var3.field3101 = var3;
            var3.field3102 = var3;
        }
    }

    @ObfuscatedName("gd.h(J)Lgr;")
    public class208 method3527(long arg0) {
        class208 var3 = this.field3082[(int) (arg0 & (long) (this.field3081 - 1))];
        for (this.field3083 = var3.field3101; this.field3083 != var3; this.field3083 = this.field3083.field3101) {
            if (this.field3083.field3100 == arg0) {
                class208 var4 = this.field3083;
                this.field3083 = this.field3083.field3101;
                return var4;
            }
        }
        this.field3083 = null;
        return null;
    }

    @ObfuscatedName("gd.m(Lgr;J)V")
    public void method3528(class208 arg0, long arg1) {
        if (arg0.field3102 != null) {
            arg0.method3625();
        }
        class208 var4 = this.field3082[(int) (arg1 & (long) (this.field3081 - 1))];
        arg0.field3102 = var4.field3102;
        arg0.field3101 = var4;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
        arg0.field3100 = arg1;
    }

    @ObfuscatedName("gd.i()V")
    public void method3529() {
        for (int var1 = 0; var1 < this.field3081; var1++) {
            class208 var2 = this.field3082[var1];
            while (true) {
                class208 var3 = var2.field3101;
                if (var2 == var3) {
                    break;
                }
                var3.method3625();
            }
        }
        this.field3083 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
