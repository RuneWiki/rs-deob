package deob;

@ObfuscatedName("fc")
public class class173 {

    @ObfuscatedName("fc.j")
    public class183 field2838 = new class183();

    @ObfuscatedName("fc.z")
    public class183 field2837;

    public class173() {
        this.field2838.field2859 = this.field2838;
        this.field2838.field2858 = this.field2838;
    }

    @ObfuscatedName("fc.j(Lgg;)V")
    public void method3203(class183 arg0) {
        if (arg0.field2858 != null) {
            arg0.method3306();
        }
        arg0.field2858 = this.field2838.field2858;
        arg0.field2859 = this.field2838;
        arg0.field2858.field2859 = arg0;
        arg0.field2859.field2858 = arg0;
    }

    @ObfuscatedName("fc.z()Lgg;")
    public class183 method3194() {
        class183 var1 = this.field2838.field2859;
        if (this.field2838 == var1) {
            this.field2837 = null;
            return null;
        } else {
            this.field2837 = var1.field2859;
            return var1;
        }
    }

    @ObfuscatedName("fc.y()Lgg;")
    public class183 method3197() {
        class183 var1 = this.field2837;
        if (this.field2838 == var1) {
            this.field2837 = null;
            return null;
        } else {
            this.field2837 = var1.field2859;
            return var1;
        }
    }
}
