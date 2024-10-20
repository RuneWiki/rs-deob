package deob;

@ObfuscatedName("fv")
public class class172 {

    @ObfuscatedName("fv.e")
    public class182 field2820 = new class182();

    @ObfuscatedName("fv.p")
    public class182 field2821;

    public class172() {
        this.field2820.field2841 = this.field2820;
        this.field2820.field2842 = this.field2820;
    }

    @ObfuscatedName("fv.e(Lfd;)V")
    public void method3180(class182 arg0) {
        if (arg0.field2842 != null) {
            arg0.method3299();
        }
        arg0.field2842 = this.field2820.field2842;
        arg0.field2841 = this.field2820;
        arg0.field2842.field2841 = arg0;
        arg0.field2841.field2842 = arg0;
    }

    @ObfuscatedName("fv.p()Lfd;")
    public class182 method3181() {
        class182 var1 = this.field2820.field2841;
        if (this.field2820 == var1) {
            this.field2821 = null;
            return null;
        } else {
            this.field2821 = var1.field2841;
            return var1;
        }
    }

    @ObfuscatedName("fv.a()Lfd;")
    public class182 method3183() {
        class182 var1 = this.field2821;
        if (this.field2820 == var1) {
            this.field2821 = null;
            return null;
        } else {
            this.field2821 = var1.field2841;
            return var1;
        }
    }
}
