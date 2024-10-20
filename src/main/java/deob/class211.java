package deob;

@ObfuscatedName("hk")
public class class211 {

    @ObfuscatedName("hk.g")
    public class212 field2506 = new class212();

    @ObfuscatedName("hk.r")
    public class212 field2505;

    public class211() {
        this.field2506.field2508 = this.field2506;
        this.field2506.field2507 = this.field2506;
    }

    @ObfuscatedName("hk.g(Lhm;)V")
    public void method3992(class212 arg0) {
        if (arg0.field2507 != null) {
            arg0.method3999();
        }
        arg0.field2507 = this.field2506.field2507;
        arg0.field2508 = this.field2506;
        arg0.field2507.field2508 = arg0;
        arg0.field2508.field2507 = arg0;
    }

    @ObfuscatedName("hk.r()Lhm;")
    public class212 method3993() {
        class212 var1 = this.field2506.field2508;
        if (this.field2506 == var1) {
            this.field2505 = null;
            return null;
        } else {
            this.field2505 = var1.field2508;
            return var1;
        }
    }

    @ObfuscatedName("hk.e()Lhm;")
    public class212 method3994() {
        class212 var1 = this.field2505;
        if (this.field2506 == var1) {
            this.field2505 = null;
            return null;
        } else {
            this.field2505 = var1.field2508;
            return var1;
        }
    }
}
