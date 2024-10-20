package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public final class class189 implements Iterable {

    @ObfuscatedName("gv.n")
    public int field2990;

    @ObfuscatedName("gv.d")
    public class199[] field2989;

    @ObfuscatedName("gv.z")
    public class199 field2988;

    public class189(int arg0) {
        this.field2990 = arg0;
        this.field2989 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2989[var2] = new class199();
            var3.field3008 = var3;
            var3.field3009 = var3;
        }
    }

    @ObfuscatedName("gv.n(J)Lga;")
    public class199 method3471(long arg0) {
        class199 var3 = this.field2989[(int) (arg0 & (long) (this.field2990 - 1))];
        for (this.field2988 = var3.field3008; this.field2988 != var3; this.field2988 = this.field2988.field3008) {
            if (this.field2988.field3007 == arg0) {
                class199 var4 = this.field2988;
                this.field2988 = this.field2988.field3008;
                return var4;
            }
        }
        this.field2988 = null;
        return null;
    }

    @ObfuscatedName("gv.d(Lga;J)V")
    public void method3465(class199 arg0, long arg1) {
        if (arg0.field3009 != null) {
            arg0.method3562();
        }
        class199 var4 = this.field2989[(int) (arg1 & (long) (this.field2990 - 1))];
        arg0.field3009 = var4.field3009;
        arg0.field3008 = var4;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
        arg0.field3007 = arg1;
    }

    @ObfuscatedName("gv.z()V")
    public void method3466() {
        for (int var1 = 0; var1 < this.field2990; var1++) {
            class199 var2 = this.field2989[var1];
            while (true) {
                class199 var3 = var2.field3008;
                if (var2 == var3) {
                    break;
                }
                var3.method3562();
            }
        }
        this.field2988 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
