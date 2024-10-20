package deob;

@ObfuscatedName("fg")
public final class class172 {

    @ObfuscatedName("fg.i")
    public class174 field2802 = new class174();

    public class172() {
        this.field2802.field2806 = this.field2802;
        this.field2802.field2805 = this.field2802;
    }

    @ObfuscatedName("fg.i(Lfe;)V")
    public void method3319(class174 arg0) {
        if (arg0.field2805 != null) {
            arg0.method3345();
        }
        arg0.field2805 = this.field2802.field2805;
        arg0.field2806 = this.field2802;
        arg0.field2805.field2806 = arg0;
        arg0.field2806.field2805 = arg0;
    }

    @ObfuscatedName("fg.v(Lfe;)V")
    public void method3325(class174 arg0) {
        if (arg0.field2805 != null) {
            arg0.method3345();
        }
        arg0.field2805 = this.field2802;
        arg0.field2806 = this.field2802.field2806;
        arg0.field2805.field2806 = arg0;
        arg0.field2806.field2805 = arg0;
    }

    @ObfuscatedName("fg.m()Lfe;")
    public class174 method3320() {
        class174 var1 = this.field2802.field2806;
        if (this.field2802 == var1) {
            return null;
        } else {
            var1.method3345();
            return var1;
        }
    }

    @ObfuscatedName("fg.j()Lfe;")
    public class174 method3321() {
        class174 var1 = this.field2802.field2806;
        return this.field2802 == var1 ? null : var1;
    }

    @ObfuscatedName("fg.o()V")
    public void method3322() {
        while (true) {
            class174 var1 = this.field2802.field2806;
            if (this.field2802 == var1) {
                return;
            }
            var1.method3345();
        }
    }
}
