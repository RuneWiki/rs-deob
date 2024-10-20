package deob;

@ObfuscatedName("fi")
public class class173 {

    @ObfuscatedName("fi.e")
    public class185 field2846 = new class185();

    @ObfuscatedName("fi.o")
    public class185 field2845;

    public class173() {
        this.field2846.field2870 = this.field2846;
        this.field2846.field2871 = this.field2846;
    }

    @ObfuscatedName("fi.e(Lgp;)V")
    public void method3081(class185 arg0) {
        if (arg0.field2871 != null) {
            arg0.method3200();
        }
        arg0.field2871 = this.field2846.field2871;
        arg0.field2870 = this.field2846;
        arg0.field2871.field2870 = arg0;
        arg0.field2870.field2871 = arg0;
    }

    @ObfuscatedName("fi.o()Lgp;")
    public class185 method3082() {
        class185 var1 = this.field2846.field2870;
        if (this.field2846 == var1) {
            this.field2845 = null;
            return null;
        } else {
            this.field2845 = var1.field2870;
            return var1;
        }
    }

    @ObfuscatedName("fi.y()Lgp;")
    public class185 method3090() {
        class185 var1 = this.field2845;
        if (this.field2846 == var1) {
            this.field2845 = null;
            return null;
        } else {
            this.field2845 = var1.field2870;
            return var1;
        }
    }
}
