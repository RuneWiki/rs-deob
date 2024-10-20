package deob;

import java.util.Iterator;

@ObfuscatedName("lc")
public final class class316 implements Iterable {

    @ObfuscatedName("lc.f")
    public int field3823;

    @ObfuscatedName("lc.i")
    public class188[] field3822;

    @ObfuscatedName("lc.y")
    public class188 field3821;

    @ObfuscatedName("lc.w")
    public class188 field3824;

    @ObfuscatedName("lc.p")
    public int field3825 = 0;

    public class316(int arg0) {
        this.field3823 = arg0;
        this.field3822 = new class188[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class188 var3 = this.field3822[var2] = new class188();
            var3.field2323 = var3;
            var3.field2324 = var3;
        }
    }

    @ObfuscatedName("lc.f(J)Lgk;")
    public class188 method5467(long arg0) {
        class188 var3 = this.field3822[(int) (arg0 & (long) (this.field3823 - 1))];
        for (this.field3821 = var3.field2323; this.field3821 != var3; this.field3821 = this.field3821.field2323) {
            if (this.field3821.field2322 == arg0) {
                class188 var4 = this.field3821;
                this.field3821 = this.field3821.field2323;
                return var4;
            }
        }
        this.field3821 = null;
        return null;
    }

    @ObfuscatedName("lc.i(Lgk;J)V")
    public void method5469(class188 arg0, long arg1) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        class188 var4 = this.field3822[(int) (arg1 & (long) (this.field3823 - 1))];
        arg0.field2324 = var4.field2324;
        arg0.field2323 = var4;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
        arg0.field2322 = arg1;
    }

    @ObfuscatedName("lc.y()V")
    public void method5470() {
        for (int var1 = 0; var1 < this.field3823; var1++) {
            class188 var2 = this.field3822[var1];
            while (true) {
                class188 var3 = var2.field2323;
                if (var2 == var3) {
                    break;
                }
                var3.method3292();
            }
        }
        this.field3821 = null;
        this.field3824 = null;
    }

    @ObfuscatedName("lc.w()Lgk;")
    public class188 method5471() {
        this.field3825 = 0;
        return this.method5481();
    }

    @ObfuscatedName("lc.p()Lgk;")
    public class188 method5481() {
        if (this.field3825 > 0 && this.field3822[this.field3825 - 1] != this.field3824) {
            class188 var1 = this.field3824;
            this.field3824 = var1.field2323;
            return var1;
        }
        class188 var2;
        do {
            if (this.field3825 >= this.field3823) {
                return null;
            }
            var2 = this.field3822[this.field3825++].field2323;
        } while (this.field3822[this.field3825 - 1] == var2);
        this.field3824 = var2.field2323;
        return var2;
    }

    public Iterator iterator() {
        return new class317(this);
    }
}
