package deob;

import java.util.Iterator;

@ObfuscatedName("lj")
public final class class316 implements Iterable {

    @ObfuscatedName("lj.c")
    public int field3820;

    @ObfuscatedName("lj.x")
    public class181[] field3819;

    @ObfuscatedName("lj.t")
    public class181 field3821;

    @ObfuscatedName("lj.g")
    public class181 field3822;

    @ObfuscatedName("lj.l")
    public int field3823 = 0;

    public class316(int arg0) {
        this.field3820 = arg0;
        this.field3819 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3819[var2] = new class181();
            var3.field2095 = var3;
            var3.field2094 = var3;
        }
    }

    @ObfuscatedName("lj.c(J)Lfn;")
    public class181 method5493(long arg0) {
        class181 var3 = this.field3819[(int) (arg0 & (long) (this.field3820 - 1))];
        for (this.field3821 = var3.field2095; this.field3821 != var3; this.field3821 = this.field3821.field2095) {
            if (this.field3821.field2096 == arg0) {
                class181 var4 = this.field3821;
                this.field3821 = this.field3821.field2095;
                return var4;
            }
        }
        this.field3821 = null;
        return null;
    }

    @ObfuscatedName("lj.x(Lfn;J)V")
    public void method5497(class181 arg0, long arg1) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        class181 var4 = this.field3819[(int) (arg1 & (long) (this.field3820 - 1))];
        arg0.field2094 = var4.field2094;
        arg0.field2095 = var4;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
        arg0.field2096 = arg1;
    }

    @ObfuscatedName("lj.t()V")
    public void method5494() {
        for (int var1 = 0; var1 < this.field3820; var1++) {
            class181 var2 = this.field3819[var1];
            while (true) {
                class181 var3 = var2.field2095;
                if (var2 == var3) {
                    break;
                }
                var3.method3326();
            }
        }
        this.field3821 = null;
        this.field3822 = null;
    }

    @ObfuscatedName("lj.g()Lfn;")
    public class181 method5495() {
        this.field3823 = 0;
        return this.method5496();
    }

    @ObfuscatedName("lj.l()Lfn;")
    public class181 method5496() {
        if (this.field3823 > 0 && this.field3819[this.field3823 - 1] != this.field3822) {
            class181 var1 = this.field3822;
            this.field3822 = var1.field2095;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3823 >= this.field3820) {
                return null;
            }
            var2 = this.field3819[this.field3823++].field2095;
        } while (this.field3819[this.field3823 - 1] == var2);
        this.field3822 = var2.field2095;
        return var2;
    }

    public Iterator iterator() {
        return new class317(this);
    }
}
