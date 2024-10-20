package deob;

@ObfuscatedName("uu")
public final class class524 {

    @ObfuscatedName("uu.ac")
    public int field5279;

    @ObfuscatedName("uu.ae")
    public class508[] field5276;

    @ObfuscatedName("uu.ag")
    public class508 field5278;

    @ObfuscatedName("uu.am")
    public class508 field5277;

    @ObfuscatedName("uu.ax")
    public int field5280 = 0;

    public class524(int arg0) {
        this.field5279 = arg0;
        this.field5276 = new class508[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class508 var3 = this.field5276[var2] = new class508();
            var3.field5123 = var3;
            var3.field5121 = var3;
        }
    }

    @ObfuscatedName("uu.ac(J)Lto;")
    public class508 method8688(long arg0) {
        class508 var3 = this.field5276[(int) (arg0 & (long) (this.field5279 - 1))];
        for (this.field5278 = var3.field5123; this.field5278 != var3; this.field5278 = this.field5278.field5123) {
            if (this.field5278.field5122 == arg0) {
                class508 var4 = this.field5278;
                this.field5278 = this.field5278.field5123;
                return var4;
            }
        }
        this.field5278 = null;
        return null;
    }

    @ObfuscatedName("uu.ae()I")
    public int method8689() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5279; var2++) {
            class508 var3 = this.field5276[var2];
            for (class508 var4 = var3.field5123; var4 != var3; var4 = var4.field5123) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("uu.ag(Lto;J)V")
    public void method8690(class508 arg0, long arg1) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        class508 var4 = this.field5276[(int) (arg1 & (long) (this.field5279 - 1))];
        arg0.field5121 = var4.field5121;
        arg0.field5123 = var4;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
        arg0.field5122 = arg1;
    }

    @ObfuscatedName("uu.am()Lto;")
    public class508 method8691() {
        this.field5280 = 0;
        return this.method8692();
    }

    @ObfuscatedName("uu.ax()Lto;")
    public class508 method8692() {
        if (this.field5280 > 0 && this.field5276[this.field5280 - 1] != this.field5277) {
            class508 var1 = this.field5277;
            this.field5277 = var1.field5123;
            return var1;
        }
        class508 var2;
        do {
            if (this.field5280 >= this.field5279) {
                return null;
            }
            var2 = this.field5276[this.field5280++].field5123;
        } while (this.field5276[this.field5280 - 1] == var2);
        this.field5277 = var2.field5123;
        return var2;
    }
}
