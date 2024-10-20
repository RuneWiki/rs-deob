package deob;

@ObfuscatedName("fd")
public class class173 {

    @ObfuscatedName("fd.z")
    public class183 field2833 = new class183();

    @ObfuscatedName("fd.j")
    public class183 field2832;

    public class173() {
        this.field2833.field2854 = this.field2833;
        this.field2833.field2853 = this.field2833;
    }

    @ObfuscatedName("fd.z(Lgh;)V")
    public void method3191(class183 arg0) {
        if (arg0.field2853 != null) {
            arg0.method3307();
        }
        arg0.field2853 = this.field2833.field2853;
        arg0.field2854 = this.field2833;
        arg0.field2853.field2854 = arg0;
        arg0.field2854.field2853 = arg0;
    }

    @ObfuscatedName("fd.j()Lgh;")
    public class183 method3189() {
        class183 var1 = this.field2833.field2854;
        if (this.field2833 == var1) {
            this.field2832 = null;
            return null;
        } else {
            this.field2832 = var1.field2854;
            return var1;
        }
    }

    @ObfuscatedName("fd.a()Lgh;")
    public class183 method3188() {
        class183 var1 = this.field2832;
        if (this.field2833 == var1) {
            this.field2832 = null;
            return null;
        } else {
            this.field2832 = var1.field2854;
            return var1;
        }
    }
}
