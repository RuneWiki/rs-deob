package deob;

@ObfuscatedName("ge")
public class class196 {

    @ObfuscatedName("ge.n")
    public class197 field2489 = new class197();

    @ObfuscatedName("ge.p")
    public class197 field2490;

    public class196() {
        this.field2489.field2492 = this.field2489;
        this.field2489.field2491 = this.field2489;
    }

    @ObfuscatedName("ge.n(Lgi;)V")
    public void method3395(class197 arg0) {
        if (arg0.field2491 != null) {
            arg0.method3405();
        }
        arg0.field2491 = this.field2489.field2491;
        arg0.field2492 = this.field2489;
        arg0.field2491.field2492 = arg0;
        arg0.field2492.field2491 = arg0;
    }

    @ObfuscatedName("ge.p()Lgi;")
    public class197 method3396() {
        class197 var1 = this.field2489.field2492;
        if (this.field2489 == var1) {
            this.field2490 = null;
            return null;
        } else {
            this.field2490 = var1.field2492;
            return var1;
        }
    }

    @ObfuscatedName("ge.i()Lgi;")
    public class197 method3399() {
        class197 var1 = this.field2490;
        if (this.field2489 == var1) {
            this.field2490 = null;
            return null;
        } else {
            this.field2490 = var1.field2492;
            return var1;
        }
    }
}
