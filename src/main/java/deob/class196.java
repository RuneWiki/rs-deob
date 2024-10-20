package deob;

@ObfuscatedName("gm")
public class class196 {

    @ObfuscatedName("gm.p")
    public class197 field2490 = new class197();

    @ObfuscatedName("gm.m")
    public class197 field2489;

    public class196() {
        this.field2490.field2491 = this.field2490;
        this.field2490.field2492 = this.field2490;
    }

    @ObfuscatedName("gm.p(Lgg;)V")
    public void method3290(class197 arg0) {
        if (arg0.field2492 != null) {
            arg0.method3294();
        }
        arg0.field2492 = this.field2490.field2492;
        arg0.field2491 = this.field2490;
        arg0.field2492.field2491 = arg0;
        arg0.field2491.field2492 = arg0;
    }

    @ObfuscatedName("gm.m()Lgg;")
    public class197 method3289() {
        class197 var1 = this.field2490.field2491;
        if (this.field2490 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2491;
            return var1;
        }
    }

    @ObfuscatedName("gm.e()Lgg;")
    public class197 method3288() {
        class197 var1 = this.field2489;
        if (this.field2490 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2491;
            return var1;
        }
    }
}
