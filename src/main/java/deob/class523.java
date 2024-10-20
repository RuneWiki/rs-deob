package deob;

import java.util.Iterator;

@ObfuscatedName("ui")
public final class class523 implements Iterable {

    @ObfuscatedName("ui.ac")
    public int field5273;

    @ObfuscatedName("ui.ae")
    public class508[] field5272;

    @ObfuscatedName("ui.ag")
    public class508 field5271;

    @ObfuscatedName("ui.am")
    public class508 field5274;

    @ObfuscatedName("ui.ax")
    public int field5275 = 0;

    public class523(int arg0) {
        this.field5273 = arg0;
        this.field5272 = new class508[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class508 var3 = this.field5272[var2] = new class508();
            var3.field5123 = var3;
            var3.field5121 = var3;
        }
    }

    @ObfuscatedName("ui.ac(J)Lto;")
    public class508 method8666(long arg0) {
        class508 var3 = this.field5272[(int) (arg0 & (long) (this.field5273 - 1))];
        for (this.field5271 = var3.field5123; this.field5271 != var3; this.field5271 = this.field5271.field5123) {
            if (this.field5271.field5122 == arg0) {
                class508 var4 = this.field5271;
                this.field5271 = this.field5271.field5123;
                return var4;
            }
        }
        this.field5271 = null;
        return null;
    }

    @ObfuscatedName("ui.ae(Lto;J)V")
    public void method8663(class508 arg0, long arg1) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        class508 var4 = this.field5272[(int) (arg1 & (long) (this.field5273 - 1))];
        arg0.field5121 = var4.field5121;
        arg0.field5123 = var4;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
        arg0.field5122 = arg1;
    }

    @ObfuscatedName("ui.ag()V")
    public void method8664() {
        for (int var1 = 0; var1 < this.field5273; var1++) {
            class508 var2 = this.field5272[var1];
            while (true) {
                class508 var3 = var2.field5123;
                if (var2 == var3) {
                    break;
                }
                var3.method8362();
            }
        }
        this.field5271 = null;
        this.field5274 = null;
    }

    @ObfuscatedName("ui.am()Lto;")
    public class508 method8669() {
        this.field5275 = 0;
        return this.method8665();
    }

    @ObfuscatedName("ui.ax()Lto;")
    public class508 method8665() {
        if (this.field5275 > 0 && this.field5272[this.field5275 - 1] != this.field5274) {
            class508 var1 = this.field5274;
            this.field5274 = var1.field5123;
            return var1;
        }
        class508 var2;
        do {
            if (this.field5275 >= this.field5273) {
                return null;
            }
            var2 = this.field5272[this.field5275++].field5123;
        } while (this.field5272[this.field5275 - 1] == var2);
        this.field5274 = var2.field5123;
        return var2;
    }

    public Iterator iterator() {
        return new class522(this);
    }
}
