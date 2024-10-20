package deob;

@ObfuscatedName("gu")
public class class195 {

    @ObfuscatedName("gu.z")
    public class207 field3074 = new class207();

    @ObfuscatedName("gu.q")
    public class207 field3075;

    public class195() {
        this.field3074.field3100 = this.field3074;
        this.field3074.field3099 = this.field3074;
    }

    @ObfuscatedName("gu.z(Lgs;)V")
    public void method3459(class207 arg0) {
        if (arg0.field3099 != null) {
            arg0.method3578();
        }
        arg0.field3099 = this.field3074.field3099;
        arg0.field3100 = this.field3074;
        arg0.field3099.field3100 = arg0;
        arg0.field3100.field3099 = arg0;
    }

    @ObfuscatedName("gu.q()Lgs;")
    public class207 method3454() {
        class207 var1 = this.field3074.field3100;
        if (this.field3074 == var1) {
            this.field3075 = null;
            return null;
        } else {
            this.field3075 = var1.field3100;
            return var1;
        }
    }

    @ObfuscatedName("gu.k()Lgs;")
    public class207 method3455() {
        class207 var1 = this.field3075;
        if (this.field3074 == var1) {
            this.field3075 = null;
            return null;
        } else {
            this.field3075 = var1.field3100;
            return var1;
        }
    }
}
