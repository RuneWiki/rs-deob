package deob;

@ObfuscatedName("fw")
public final class class174 {

    @ObfuscatedName("fw.e")
    public class176 field2824 = new class176();

    public class174() {
        this.field2824.field2828 = this.field2824;
        this.field2824.field2827 = this.field2824;
    }

    @ObfuscatedName("fw.e(Lfn;)V")
    public void method3275(class176 arg0) {
        if (arg0.field2827 != null) {
            arg0.method3306();
        }
        arg0.field2827 = this.field2824.field2827;
        arg0.field2828 = this.field2824;
        arg0.field2827.field2828 = arg0;
        arg0.field2828.field2827 = arg0;
    }

    @ObfuscatedName("fw.i(Lfn;)V")
    public void method3276(class176 arg0) {
        if (arg0.field2827 != null) {
            arg0.method3306();
        }
        arg0.field2827 = this.field2824;
        arg0.field2828 = this.field2824.field2828;
        arg0.field2827.field2828 = arg0;
        arg0.field2828.field2827 = arg0;
    }

    @ObfuscatedName("fw.k()Lfn;")
    public class176 method3290() {
        class176 var1 = this.field2824.field2828;
        if (this.field2824 == var1) {
            return null;
        } else {
            var1.method3306();
            return var1;
        }
    }

    @ObfuscatedName("fw.q()Lfn;")
    public class176 method3293() {
        class176 var1 = this.field2824.field2828;
        return this.field2824 == var1 ? null : var1;
    }

    @ObfuscatedName("fw.j()V")
    public void method3274() {
        while (true) {
            class176 var1 = this.field2824.field2828;
            if (this.field2824 == var1) {
                return;
            }
            var1.method3306();
        }
    }
}
