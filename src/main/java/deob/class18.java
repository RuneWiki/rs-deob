package deob;

@ObfuscatedName("fo")
public class class18 {

    @ObfuscatedName("fo.b")
    public class67 field216 = new class67();

    @ObfuscatedName("fo.h")
    public class67 field217;

    @ObfuscatedName("fo.h()Lfa;")
    public class67 method235() {
        class67 var1 = this.field216.field739;
        if (this.field216 == var1) {
            this.field217 = null;
            return null;
        } else {
            this.field217 = var1.field739;
            return var1;
        }
    }

    @ObfuscatedName("fo.b(Lfa;)V")
    public void method236(class67 arg0) {
        if (arg0.field740 != null) {
            arg0.method1124();
        }
        arg0.field740 = this.field216.field740;
        arg0.field739 = this.field216;
        arg0.field740.field739 = arg0;
        arg0.field739.field740 = arg0;
    }

    @ObfuscatedName("fo.k()Lfa;")
    public class67 method238() {
        class67 var1 = this.field217;
        if (this.field216 == var1) {
            this.field217 = null;
            return null;
        } else {
            this.field217 = var1.field739;
            return var1;
        }
    }

    public class18() {
        this.field216.field739 = this.field216;
        this.field216.field740 = this.field216;
    }
}
