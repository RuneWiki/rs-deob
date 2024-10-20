package deob;

@ObfuscatedName("fa")
public class class172 {

    @ObfuscatedName("fa.y")
    public class182 field2807 = new class182();

    @ObfuscatedName("fa.u")
    public class182 field2806;

    public class172() {
        this.field2807.field2827 = this.field2807;
        this.field2807.field2828 = this.field2807;
    }

    @ObfuscatedName("fa.y(Lfi;)V")
    public void method3160(class182 arg0) {
        if (arg0.field2828 != null) {
            arg0.method3266();
        }
        arg0.field2828 = this.field2807.field2828;
        arg0.field2827 = this.field2807;
        arg0.field2828.field2827 = arg0;
        arg0.field2827.field2828 = arg0;
    }

    @ObfuscatedName("fa.u()Lfi;")
    public class182 method3161() {
        class182 var1 = this.field2807.field2827;
        if (this.field2807 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2827;
            return var1;
        }
    }

    @ObfuscatedName("fa.k()Lfi;")
    public class182 method3169() {
        class182 var1 = this.field2806;
        if (this.field2807 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2827;
            return var1;
        }
    }
}
