package deob;

import java.util.Iterator;

@ObfuscatedName("fb")
public final class class179 implements Iterable {

    @ObfuscatedName("fb.x")
    public int field2862;

    @ObfuscatedName("fb.v")
    public class189[] field2861;

    @ObfuscatedName("fb.m")
    public class189 field2863;

    public class179(int arg0) {
        this.field2862 = arg0;
        this.field2861 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2861[var2] = new class189();
            var3.field2881 = var3;
            var3.field2880 = var3;
        }
    }

    @ObfuscatedName("fb.x(J)Lgs;")
    public class189 method3233(long arg0) {
        class189 var3 = this.field2861[(int) (arg0 & (long) (this.field2862 - 1))];
        for (this.field2863 = var3.field2881; this.field2863 != var3; this.field2863 = this.field2863.field2881) {
            if (this.field2863.field2882 == arg0) {
                class189 var4 = this.field2863;
                this.field2863 = this.field2863.field2881;
                return var4;
            }
        }
        this.field2863 = null;
        return null;
    }

    @ObfuscatedName("fb.v(Lgs;J)V")
    public void method3232(class189 arg0, long arg1) {
        if (arg0.field2880 != null) {
            arg0.method3352();
        }
        class189 var4 = this.field2861[(int) (arg1 & (long) (this.field2862 - 1))];
        arg0.field2880 = var4.field2880;
        arg0.field2881 = var4;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
        arg0.field2882 = arg1;
    }

    @ObfuscatedName("fb.m()V")
    public void method3235() {
        for (int var1 = 0; var1 < this.field2862; var1++) {
            class189 var2 = this.field2861[var1];
            while (true) {
                class189 var3 = var2.field2881;
                if (var2 == var3) {
                    break;
                }
                var3.method3352();
            }
        }
        this.field2863 = null;
    }

    public Iterator iterator() {
        return new class175(this);
    }
}
