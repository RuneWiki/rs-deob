package deob;

@ObfuscatedName("fa")
public class class173 {

    @ObfuscatedName("fa.a")
    public class178 field2801 = new class178();

    @ObfuscatedName("fa.x")
    public class178 field2802;

    public class173() {
        this.field2801.field2814 = this.field2801;
        this.field2801.field2813 = this.field2801;
    }

    @ObfuscatedName("fa.a(Lfy;)V")
    public void method3214(class178 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3287();
        }
        arg0.field2813 = this.field2801.field2813;
        arg0.field2814 = this.field2801;
        arg0.field2813.field2814 = arg0;
        arg0.field2814.field2813 = arg0;
    }

    @ObfuscatedName("fa.x()Lfy;")
    public class178 method3215() {
        class178 var1 = this.field2801.field2814;
        if (this.field2801 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2814;
            return var1;
        }
    }

    @ObfuscatedName("fa.e()Lfy;")
    public class178 method3223() {
        class178 var1 = this.field2802;
        if (this.field2801 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2814;
            return var1;
        }
    }
}
