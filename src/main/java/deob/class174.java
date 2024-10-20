package deob;

@ObfuscatedName("fz")
public class class174 {

    @ObfuscatedName("fz.p")
    public class186 field2852 = new class186();

    @ObfuscatedName("fz.g")
    public class186 field2853;

    public class174() {
        this.field2852.field2877 = this.field2852;
        this.field2852.field2878 = this.field2852;
    }

    @ObfuscatedName("fz.p(Lgb;)V")
    public void method3252(class186 arg0) {
        if (arg0.field2878 != null) {
            arg0.method3374();
        }
        arg0.field2878 = this.field2852.field2878;
        arg0.field2877 = this.field2852;
        arg0.field2878.field2877 = arg0;
        arg0.field2877.field2878 = arg0;
    }

    @ObfuscatedName("fz.g()Lgb;")
    public class186 method3253() {
        class186 var1 = this.field2852.field2877;
        if (this.field2852 == var1) {
            this.field2853 = null;
            return null;
        } else {
            this.field2853 = var1.field2877;
            return var1;
        }
    }

    @ObfuscatedName("fz.x()Lgb;")
    public class186 method3261() {
        class186 var1 = this.field2853;
        if (this.field2852 == var1) {
            this.field2853 = null;
            return null;
        } else {
            this.field2853 = var1.field2877;
            return var1;
        }
    }
}
