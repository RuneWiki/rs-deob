package deob;

@ObfuscatedName("je")
public class class263 {

    @ObfuscatedName("je.q")
    public class179 field3544 = new class179();

    @ObfuscatedName("je.w")
    public class179 field3543;

    public class263() {
        this.field3544.field2111 = this.field3544;
        this.field3544.field2110 = this.field3544;
    }

    @ObfuscatedName("je.q(Lfq;)V")
    public void method4536(class179 arg0) {
        if (arg0.field2110 != null) {
            arg0.method3281();
        }
        arg0.field2110 = this.field3544.field2110;
        arg0.field2111 = this.field3544;
        arg0.field2110.field2111 = arg0;
        arg0.field2111.field2110 = arg0;
    }

    @ObfuscatedName("je.w()Lfq;")
    public class179 method4537() {
        class179 var1 = this.field3544.field2111;
        if (this.field3544 == var1) {
            this.field3543 = null;
            return null;
        } else {
            this.field3543 = var1.field2111;
            return var1;
        }
    }

    @ObfuscatedName("je.e()Lfq;")
    public class179 method4538() {
        class179 var1 = this.field3543;
        if (this.field3544 == var1) {
            this.field3543 = null;
            return null;
        } else {
            this.field3543 = var1.field2111;
            return var1;
        }
    }
}
