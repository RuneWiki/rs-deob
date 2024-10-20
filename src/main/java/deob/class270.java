package deob;

@ObfuscatedName("jd")
public final class class270 {

    @ObfuscatedName("jd.m")
    public class185 field3564 = new class185();

    public class270() {
        this.field3564.field2143 = this.field3564;
        this.field3564.field2145 = this.field3564;
    }

    @ObfuscatedName("jd.m(Lgf;)V")
    public void method4561(class185 arg0) {
        if (arg0.field2145 != null) {
            arg0.method3379();
        }
        arg0.field2145 = this.field3564.field2145;
        arg0.field2143 = this.field3564;
        arg0.field2145.field2143 = arg0;
        arg0.field2143.field2145 = arg0;
    }

    @ObfuscatedName("jd.o(Lgf;)V")
    public void method4555(class185 arg0) {
        if (arg0.field2145 != null) {
            arg0.method3379();
        }
        arg0.field2145 = this.field3564;
        arg0.field2143 = this.field3564.field2143;
        arg0.field2145.field2143 = arg0;
        arg0.field2143.field2145 = arg0;
    }

    @ObfuscatedName("jd.q()Lgf;")
    public class185 method4556() {
        class185 var1 = this.field3564.field2143;
        return this.field3564 == var1 ? null : var1;
    }
}
