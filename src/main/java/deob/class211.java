package deob;

@ObfuscatedName("hq")
public class class211 {

    @ObfuscatedName("hq.f")
    public class212 field2505 = new class212();

    @ObfuscatedName("hq.l")
    public class212 field2504;

    public class211() {
        this.field2505.field2507 = this.field2505;
        this.field2505.field2506 = this.field2505;
    }

    @ObfuscatedName("hq.f(Lhu;)V")
    public void method3856(class212 arg0) {
        if (arg0.field2506 != null) {
            arg0.method3868();
        }
        arg0.field2506 = this.field2505.field2506;
        arg0.field2507 = this.field2505;
        arg0.field2506.field2507 = arg0;
        arg0.field2507.field2506 = arg0;
    }

    @ObfuscatedName("hq.l()Lhu;")
    public class212 method3855() {
        class212 var1 = this.field2505.field2507;
        if (this.field2505 == var1) {
            this.field2504 = null;
            return null;
        } else {
            this.field2504 = var1.field2507;
            return var1;
        }
    }

    @ObfuscatedName("hq.w()Lhu;")
    public class212 method3858() {
        class212 var1 = this.field2504;
        if (this.field2505 == var1) {
            this.field2504 = null;
            return null;
        } else {
            this.field2504 = var1.field2507;
            return var1;
        }
    }
}
