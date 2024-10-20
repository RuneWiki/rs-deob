package deob;

@ObfuscatedName("lc")
public class class324 {

    @ObfuscatedName("lc.c")
    public class381 field3969 = new class381();

    @ObfuscatedName("lc.b")
    public class381 field3970;

    public class324() {
        this.field3969.field4249 = this.field3969;
        this.field3969.field4248 = this.field3969;
    }

    @ObfuscatedName("lc.c(Lnz;)V")
    public void method5410(class381 arg0) {
        if (arg0.field4248 != null) {
            arg0.method6154();
        }
        arg0.field4248 = this.field3969.field4248;
        arg0.field4249 = this.field3969;
        arg0.field4248.field4249 = arg0;
        arg0.field4249.field4248 = arg0;
    }

    @ObfuscatedName("lc.b()Lnz;")
    public class381 method5411() {
        class381 var1 = this.field3969.field4249;
        if (this.field3969 == var1) {
            this.field3970 = null;
            return null;
        } else {
            this.field3970 = var1.field4249;
            return var1;
        }
    }

    @ObfuscatedName("lc.p()Lnz;")
    public class381 method5415() {
        class381 var1 = this.field3970;
        if (this.field3969 == var1) {
            this.field3970 = null;
            return null;
        } else {
            this.field3970 = var1.field4249;
            return var1;
        }
    }
}
