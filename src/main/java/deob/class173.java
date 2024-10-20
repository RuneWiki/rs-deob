package deob;

@ObfuscatedName("fj")
public class class173 {

    @ObfuscatedName("fj.x")
    public class178 field2801 = new class178();

    @ObfuscatedName("fj.p")
    public class178 field2800;

    public class173() {
        this.field2801.field2813 = this.field2801;
        this.field2801.field2812 = this.field2801;
    }

    @ObfuscatedName("fj.x(Lfq;)V")
    public void method3229(class178 arg0) {
        if (arg0.field2812 != null) {
            arg0.method3294();
        }
        arg0.field2812 = this.field2801.field2812;
        arg0.field2813 = this.field2801;
        arg0.field2812.field2813 = arg0;
        arg0.field2813.field2812 = arg0;
    }

    @ObfuscatedName("fj.p()Lfq;")
    public class178 method3230() {
        class178 var1 = this.field2801.field2813;
        if (this.field2801 == var1) {
            this.field2800 = null;
            return null;
        } else {
            this.field2800 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fj.k()Lfq;")
    public class178 method3234() {
        class178 var1 = this.field2800;
        if (this.field2801 == var1) {
            this.field2800 = null;
            return null;
        } else {
            this.field2800 = var1.field2813;
            return var1;
        }
    }
}
