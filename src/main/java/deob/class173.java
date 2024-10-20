package deob;

@ObfuscatedName("fn")
public class class173 {

    @ObfuscatedName("fn.a")
    public class178 field2802 = new class178();

    @ObfuscatedName("fn.r")
    public class178 field2801;

    public class173() {
        this.field2802.field2813 = this.field2802;
        this.field2802.field2814 = this.field2802;
    }

    @ObfuscatedName("fn.a(Lft;)V")
    public void method3245(class178 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3306();
        }
        arg0.field2814 = this.field2802.field2814;
        arg0.field2813 = this.field2802;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
    }

    @ObfuscatedName("fn.r()Lft;")
    public class178 method3242() {
        class178 var1 = this.field2802.field2813;
        if (this.field2802 == var1) {
            this.field2801 = null;
            return null;
        } else {
            this.field2801 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fn.u()Lft;")
    public class178 method3241() {
        class178 var1 = this.field2801;
        if (this.field2802 == var1) {
            this.field2801 = null;
            return null;
        } else {
            this.field2801 = var1.field2813;
            return var1;
        }
    }
}
