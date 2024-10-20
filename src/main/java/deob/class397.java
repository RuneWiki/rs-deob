package deob;

@ObfuscatedName("pj")
public class class397 {

    @ObfuscatedName("pj.am")
    public class484 field4483 = new class484();

    @ObfuscatedName("pj.ap")
    public class484 field4482;

    public class397() {
        this.field4483.field4881 = this.field4483;
        this.field4483.field4880 = this.field4483;
    }

    @ObfuscatedName("pj.am(Lsv;)V")
    public void method6786(class484 arg0) {
        if (arg0.field4880 != null) {
            arg0.method7984();
        }
        arg0.field4880 = this.field4483.field4880;
        arg0.field4881 = this.field4483;
        arg0.field4880.field4881 = arg0;
        arg0.field4881.field4880 = arg0;
    }

    @ObfuscatedName("pj.ap()Lsv;")
    public class484 method6787() {
        class484 var1 = this.field4483.field4881;
        if (this.field4483 == var1) {
            this.field4482 = null;
            return null;
        } else {
            this.field4482 = var1.field4881;
            return var1;
        }
    }

    @ObfuscatedName("pj.af()Lsv;")
    public class484 method6785() {
        class484 var1 = this.field4482;
        if (this.field4483 == var1) {
            this.field4482 = null;
            return null;
        } else {
            this.field4482 = var1.field4881;
            return var1;
        }
    }
}
