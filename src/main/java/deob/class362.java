package deob;

@ObfuscatedName("ny")
public class class362 {

    @ObfuscatedName("ny.aj")
    public class438 field4325 = new class438();

    @ObfuscatedName("ny.al")
    public class438 field4326;

    public class362() {
        this.field4325.field4664 = this.field4325;
        this.field4325.field4663 = this.field4325;
    }

    @ObfuscatedName("ny.aj(Lqi;)V")
    public void method6212(class438 arg0) {
        if (arg0.field4663 != null) {
            arg0.method7327();
        }
        arg0.field4663 = this.field4325.field4663;
        arg0.field4664 = this.field4325;
        arg0.field4663.field4664 = arg0;
        arg0.field4664.field4663 = arg0;
    }

    @ObfuscatedName("ny.al()Lqi;")
    public class438 method6213() {
        class438 var1 = this.field4325.field4664;
        if (this.field4325 == var1) {
            this.field4326 = null;
            return null;
        } else {
            this.field4326 = var1.field4664;
            return var1;
        }
    }

    @ObfuscatedName("ny.ac()Lqi;")
    public class438 method6214() {
        class438 var1 = this.field4326;
        if (this.field4325 == var1) {
            this.field4326 = null;
            return null;
        } else {
            this.field4326 = var1.field4664;
            return var1;
        }
    }
}
