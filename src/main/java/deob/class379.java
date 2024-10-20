package deob;

@ObfuscatedName("or")
public class class379 {

    @ObfuscatedName("or.at")
    public class456 field4383 = new class456();

    @ObfuscatedName("or.an")
    public class456 field4382;

    public class379() {
        this.field4383.field4747 = this.field4383;
        this.field4383.field4748 = this.field4383;
    }

    @ObfuscatedName("or.at(Lrf;)V")
    public void method6433(class456 arg0) {
        if (arg0.field4748 != null) {
            arg0.method7553();
        }
        arg0.field4748 = this.field4383.field4748;
        arg0.field4747 = this.field4383;
        arg0.field4748.field4747 = arg0;
        arg0.field4747.field4748 = arg0;
    }

    @ObfuscatedName("or.an()Lrf;")
    public class456 method6434() {
        class456 var1 = this.field4383.field4747;
        if (this.field4383 == var1) {
            this.field4382 = null;
            return null;
        } else {
            this.field4382 = var1.field4747;
            return var1;
        }
    }

    @ObfuscatedName("or.av()Lrf;")
    public class456 method6436() {
        class456 var1 = this.field4382;
        if (this.field4383 == var1) {
            this.field4382 = null;
            return null;
        } else {
            this.field4382 = var1.field4747;
            return var1;
        }
    }
}
