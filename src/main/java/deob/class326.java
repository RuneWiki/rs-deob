package deob;

import java.util.Iterator;

@ObfuscatedName("ln")
public final class class326 implements Iterable {

    @ObfuscatedName("ln.x")
    public int field3840;

    @ObfuscatedName("ln.m")
    public class190[] field3841;

    @ObfuscatedName("ln.k")
    public class190 field3842;

    @ObfuscatedName("ln.d")
    public class190 field3843;

    @ObfuscatedName("ln.w")
    public int field3844 = 0;

    public class326(int arg0) {
        this.field3840 = arg0;
        this.field3841 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3841[var2] = new class190();
            var3.field2118 = var3;
            var3.field2116 = var3;
        }
    }

    @ObfuscatedName("ln.x(J)Lga;")
    public class190 method5519(long arg0) {
        class190 var3 = this.field3841[(int) (arg0 & (long) (this.field3840 - 1))];
        for (this.field3842 = var3.field2118; this.field3842 != var3; this.field3842 = this.field3842.field2118) {
            if (this.field3842.field2117 == arg0) {
                class190 var4 = this.field3842;
                this.field3842 = this.field3842.field2118;
                return var4;
            }
        }
        this.field3842 = null;
        return null;
    }

    @ObfuscatedName("ln.m(Lga;J)V")
    public void method5514(class190 arg0, long arg1) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        class190 var4 = this.field3841[(int) (arg1 & (long) (this.field3840 - 1))];
        arg0.field2116 = var4.field2116;
        arg0.field2118 = var4;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
        arg0.field2117 = arg1;
    }

    @ObfuscatedName("ln.k()V")
    public void method5515() {
        for (int var1 = 0; var1 < this.field3840; var1++) {
            class190 var2 = this.field3841[var1];
            while (true) {
                class190 var3 = var2.field2118;
                if (var2 == var3) {
                    break;
                }
                var3.method3355();
            }
        }
        this.field3842 = null;
        this.field3843 = null;
    }

    @ObfuscatedName("ln.d()Lga;")
    public class190 method5529() {
        this.field3844 = 0;
        return this.method5517();
    }

    @ObfuscatedName("ln.w()Lga;")
    public class190 method5517() {
        if (this.field3844 > 0 && this.field3841[this.field3844 - 1] != this.field3843) {
            class190 var1 = this.field3843;
            this.field3843 = var1.field2118;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3844 >= this.field3840) {
                return null;
            }
            var2 = this.field3841[this.field3844++].field2118;
        } while (this.field3841[this.field3844 - 1] == var2);
        this.field3843 = var2.field2118;
        return var2;
    }

    public Iterator iterator() {
        return new class327(this);
    }
}
