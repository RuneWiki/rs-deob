package deob;

@ObfuscatedName("hp")
public class class209 {

    @ObfuscatedName("hp.z")
    public class210 field2432 = new class210();

    @ObfuscatedName("hp.w")
    public class210 field2431;

    public class209() {
        this.field2432.field2433 = this.field2432;
        this.field2432.field2434 = this.field2432;
    }

    @ObfuscatedName("hp.z(Lhk;)V")
    public void method3796(class210 arg0) {
        if (arg0.field2434 != null) {
            arg0.method3805();
        }
        arg0.field2434 = this.field2432.field2434;
        arg0.field2433 = this.field2432;
        arg0.field2434.field2433 = arg0;
        arg0.field2433.field2434 = arg0;
    }

    @ObfuscatedName("hp.w()Lhk;")
    public class210 method3795() {
        class210 var1 = this.field2432.field2433;
        if (this.field2432 == var1) {
            this.field2431 = null;
            return null;
        } else {
            this.field2431 = var1.field2433;
            return var1;
        }
    }

    @ObfuscatedName("hp.s()Lhk;")
    public class210 method3798() {
        class210 var1 = this.field2431;
        if (this.field2432 == var1) {
            this.field2431 = null;
            return null;
        } else {
            this.field2431 = var1.field2433;
            return var1;
        }
    }
}
