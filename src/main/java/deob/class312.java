package deob;

@ObfuscatedName("kh")
public class class312 {

    @ObfuscatedName("kh.n")
    public class363 field3824 = new class363();

    @ObfuscatedName("kh.c")
    public class363 field3825;

    public class312() {
        this.field3824.field4046 = this.field3824;
        this.field3824.field4047 = this.field3824;
    }

    @ObfuscatedName("kh.n(Lmz;)V")
    public void method5073(class363 arg0) {
        if (arg0.field4047 != null) {
            arg0.method5725();
        }
        arg0.field4047 = this.field3824.field4047;
        arg0.field4046 = this.field3824;
        arg0.field4047.field4046 = arg0;
        arg0.field4046.field4047 = arg0;
    }

    @ObfuscatedName("kh.c()Lmz;")
    public class363 method5076() {
        class363 var1 = this.field3824.field4046;
        if (this.field3824 == var1) {
            this.field3825 = null;
            return null;
        } else {
            this.field3825 = var1.field4046;
            return var1;
        }
    }

    @ObfuscatedName("kh.m()Lmz;")
    public class363 method5081() {
        class363 var1 = this.field3825;
        if (this.field3824 == var1) {
            this.field3825 = null;
            return null;
        } else {
            this.field3825 = var1.field4046;
            return var1;
        }
    }
}
