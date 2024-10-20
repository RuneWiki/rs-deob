package deob;

@ObfuscatedName("fa")
public class class174 {

    @ObfuscatedName("fa.n")
    public class186 field2860 = new class186();

    @ObfuscatedName("fa.x")
    public class186 field2859;

    public class174() {
        this.field2860.field2885 = this.field2860;
        this.field2860.field2884 = this.field2860;
    }

    @ObfuscatedName("fa.n(Lgx;)V")
    public void method3140(class186 arg0) {
        if (arg0.field2884 != null) {
            arg0.method3272();
        }
        arg0.field2884 = this.field2860.field2884;
        arg0.field2885 = this.field2860;
        arg0.field2884.field2885 = arg0;
        arg0.field2885.field2884 = arg0;
    }

    @ObfuscatedName("fa.x()Lgx;")
    public class186 method3141() {
        class186 var1 = this.field2860.field2885;
        if (this.field2860 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2885;
            return var1;
        }
    }

    @ObfuscatedName("fa.k()Lgx;")
    public class186 method3144() {
        class186 var1 = this.field2859;
        if (this.field2860 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2885;
            return var1;
        }
    }
}
