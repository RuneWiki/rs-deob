package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class189 implements Iterable {

    @ObfuscatedName("gr.n")
    public int field3001;

    @ObfuscatedName("gr.o")
    public class199[] field3000;

    @ObfuscatedName("gr.a")
    public class199 field2999;

    public class189(int arg0) {
        this.field3001 = arg0;
        this.field3000 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field3000[var2] = new class199();
            var3.field3019 = var3;
            var3.field3020 = var3;
        }
    }

    @ObfuscatedName("gr.n(J)Lga;")
    public class199 method3427(long arg0) {
        class199 var3 = this.field3000[(int) (arg0 & (long) (this.field3001 - 1))];
        for (this.field2999 = var3.field3019; this.field2999 != var3; this.field2999 = this.field2999.field3019) {
            if (this.field2999.field3018 == arg0) {
                class199 var4 = this.field2999;
                this.field2999 = this.field2999.field3019;
                return var4;
            }
        }
        this.field2999 = null;
        return null;
    }

    @ObfuscatedName("gr.o(Lga;J)V")
    public void method3426(class199 arg0, long arg1) {
        if (arg0.field3020 != null) {
            arg0.method3540();
        }
        class199 var4 = this.field3000[(int) (arg1 & (long) (this.field3001 - 1))];
        arg0.field3020 = var4.field3020;
        arg0.field3019 = var4;
        arg0.field3020.field3019 = arg0;
        arg0.field3019.field3020 = arg0;
        arg0.field3018 = arg1;
    }

    @ObfuscatedName("gr.a()V")
    public void method3431() {
        for (int var1 = 0; var1 < this.field3001; var1++) {
            class199 var2 = this.field3000[var1];
            while (true) {
                class199 var3 = var2.field3019;
                if (var2 == var3) {
                    break;
                }
                var3.method3540();
            }
        }
        this.field2999 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
