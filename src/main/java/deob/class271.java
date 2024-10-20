package deob;

@ObfuscatedName("jd")
public final class class271 {

    @ObfuscatedName("jd.n")
    public class185 field3568 = new class185();

    public class271() {
        this.field3568.field2133 = this.field3568;
        this.field3568.field2131 = this.field3568;
    }

    @ObfuscatedName("jd.n(Lgj;)V")
    public void method4618(class185 arg0) {
        if (arg0.field2131 != null) {
            arg0.method3481();
        }
        arg0.field2131 = this.field3568.field2131;
        arg0.field2133 = this.field3568;
        arg0.field2131.field2133 = arg0;
        arg0.field2133.field2131 = arg0;
    }

    @ObfuscatedName("jd.v(Lgj;)V")
    public void method4624(class185 arg0) {
        if (arg0.field2131 != null) {
            arg0.method3481();
        }
        arg0.field2131 = this.field3568;
        arg0.field2133 = this.field3568.field2133;
        arg0.field2131.field2133 = arg0;
        arg0.field2133.field2131 = arg0;
    }

    @ObfuscatedName("jd.d()Lgj;")
    public class185 method4621() {
        class185 var1 = this.field3568.field2133;
        return this.field3568 == var1 ? null : var1;
    }
}
