package deob;

@ObfuscatedName("gs")
public final class class207 {

    @ObfuscatedName("gs.x")
    public class208 field3162 = new class208();

    public class207() {
        this.field3162.field3163 = this.field3162;
        this.field3162.field3164 = this.field3162;
    }

    @ObfuscatedName("gs.x(Lgi;)V")
    public void method3670(class208 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3675();
        }
        arg0.field3164 = this.field3162.field3164;
        arg0.field3163 = this.field3162;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gs.r(Lgi;)V")
    public void method3668(class208 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3675();
        }
        arg0.field3164 = this.field3162;
        arg0.field3163 = this.field3162.field3163;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gs.j()Lgi;")
    public class208 method3674() {
        class208 var1 = this.field3162.field3163;
        if (this.field3162 == var1) {
            return null;
        } else {
            var1.method3675();
            return var1;
        }
    }

    @ObfuscatedName("gs.z()Lgi;")
    public class208 method3658() {
        class208 var1 = this.field3162.field3163;
        return this.field3162 == var1 ? null : var1;
    }

    @ObfuscatedName("gs.i()V")
    public void method3656() {
        while (true) {
            class208 var1 = this.field3162.field3163;
            if (this.field3162 == var1) {
                return;
            }
            var1.method3675();
        }
    }
}
