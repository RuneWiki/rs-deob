package deob;

import java.util.Iterator;

@ObfuscatedName("fs")
public final class class181 implements Iterable {

    @ObfuscatedName("fs.v")
    public int field2892;

    @ObfuscatedName("fs.t")
    public class191[] field2893;

    @ObfuscatedName("fs.f")
    public class191 field2894;

    public class181(int arg0) {
        this.field2892 = arg0;
        this.field2893 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2893[var2] = new class191();
            var3.field2912 = var3;
            var3.field2913 = var3;
        }
    }

    @ObfuscatedName("fs.v(J)Lgu;")
    public class191 method3285(long arg0) {
        class191 var3 = this.field2893[(int) (arg0 & (long) (this.field2892 - 1))];
        for (this.field2894 = var3.field2912; this.field2894 != var3; this.field2894 = this.field2894.field2912) {
            if (this.field2894.field2911 == arg0) {
                class191 var4 = this.field2894;
                this.field2894 = this.field2894.field2912;
                return var4;
            }
        }
        this.field2894 = null;
        return null;
    }

    @ObfuscatedName("fs.t(Lgu;J)V")
    public void method3286(class191 arg0, long arg1) {
        if (arg0.field2913 != null) {
            arg0.method3392();
        }
        class191 var4 = this.field2893[(int) (arg1 & (long) (this.field2892 - 1))];
        arg0.field2913 = var4.field2913;
        arg0.field2912 = var4;
        arg0.field2913.field2912 = arg0;
        arg0.field2912.field2913 = arg0;
        arg0.field2911 = arg1;
    }

    @ObfuscatedName("fs.f()V")
    public void method3287() {
        for (int var1 = 0; var1 < this.field2892; var1++) {
            class191 var2 = this.field2893[var1];
            while (true) {
                class191 var3 = var2.field2912;
                if (var2 == var3) {
                    break;
                }
                var3.method3392();
            }
        }
        this.field2894 = null;
    }

    public Iterator iterator() {
        return new class177(this);
    }
}
