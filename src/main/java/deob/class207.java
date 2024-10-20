package deob;

@ObfuscatedName("gw")
public final class class207 {

    @ObfuscatedName("gw.d")
    public class219 field2625 = new class219();

    public class207() {
        this.field2625.field2660 = this.field2625;
        this.field2625.field2658 = this.field2625;
    }

    @ObfuscatedName("gw.d(Lhu;)V")
    public void method3637(class219 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3828();
        }
        arg0.field2658 = this.field2625.field2658;
        arg0.field2660 = this.field2625;
        arg0.field2658.field2660 = arg0;
        arg0.field2660.field2658 = arg0;
    }

    @ObfuscatedName("gw.z(Lhu;)V")
    public void method3638(class219 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3828();
        }
        arg0.field2658 = this.field2625;
        arg0.field2660 = this.field2625.field2660;
        arg0.field2658.field2660 = arg0;
        arg0.field2660.field2658 = arg0;
    }

    @ObfuscatedName("gw.n(Lhu;Lhu;)V")
    public static void method3635(class219 arg0, class219 arg1) {
        if (arg0.field2658 != null) {
            arg0.method3828();
        }
        arg0.field2658 = arg1;
        arg0.field2660 = arg1.field2660;
        arg0.field2658.field2660 = arg0;
        arg0.field2660.field2658 = arg0;
    }

    @ObfuscatedName("gw.r()Lhu;")
    public class219 method3650() {
        class219 var1 = this.field2625.field2660;
        if (this.field2625 == var1) {
            return null;
        } else {
            var1.method3828();
            return var1;
        }
    }

    @ObfuscatedName("gw.e()Lhu;")
    public class219 method3640() {
        class219 var1 = this.field2625.field2660;
        return this.field2625 == var1 ? null : var1;
    }

    @ObfuscatedName("gw.y()V")
    public void method3641() {
        while (true) {
            class219 var1 = this.field2625.field2660;
            if (this.field2625 == var1) {
                return;
            }
            var1.method3828();
        }
    }
}
