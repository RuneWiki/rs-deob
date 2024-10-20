package deob;

@ObfuscatedName("jb")
public class class273 {

    @ObfuscatedName("jb.z")
    public class188 field3558 = new class188();

    @ObfuscatedName("jb.k")
    public class188 field3559;

    public class273() {
        this.field3558.field2152 = this.field3558;
        this.field3558.field2153 = this.field3558;
    }

    @ObfuscatedName("jb.z(Lgr;)V")
    public void method4649(class188 arg0) {
        if (arg0.field2153 != null) {
            arg0.method3397();
        }
        arg0.field2153 = this.field3558.field2153;
        arg0.field2152 = this.field3558;
        arg0.field2153.field2152 = arg0;
        arg0.field2152.field2153 = arg0;
    }

    @ObfuscatedName("jb.k()Lgr;")
    public class188 method4650() {
        class188 var1 = this.field3558.field2152;
        if (this.field3558 == var1) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var1.field2152;
            return var1;
        }
    }

    @ObfuscatedName("jb.s()Lgr;")
    public class188 method4657() {
        class188 var1 = this.field3559;
        if (this.field3558 == var1) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var1.field2152;
            return var1;
        }
    }
}
