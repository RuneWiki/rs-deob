package deob;

@ObfuscatedName("je")
public class class263 {

    @ObfuscatedName("je.z")
    public class179 field3526 = new class179();

    @ObfuscatedName("je.n")
    public class179 field3527;

    public class263() {
        this.field3526.field2091 = this.field3526;
        this.field3526.field2090 = this.field3526;
    }

    @ObfuscatedName("je.z(Lfs;)V")
    public void method4467(class179 arg0) {
        if (arg0.field2090 != null) {
            arg0.method3243();
        }
        arg0.field2090 = this.field3526.field2090;
        arg0.field2091 = this.field3526;
        arg0.field2090.field2091 = arg0;
        arg0.field2091.field2090 = arg0;
    }

    @ObfuscatedName("je.n()Lfs;")
    public class179 method4468() {
        class179 var1 = this.field3526.field2091;
        if (this.field3526 == var1) {
            this.field3527 = null;
            return null;
        } else {
            this.field3527 = var1.field2091;
            return var1;
        }
    }

    @ObfuscatedName("je.v()Lfs;")
    public class179 method4470() {
        class179 var1 = this.field3527;
        if (this.field3526 == var1) {
            this.field3527 = null;
            return null;
        } else {
            this.field3527 = var1.field2091;
            return var1;
        }
    }
}
