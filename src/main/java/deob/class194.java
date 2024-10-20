package deob;

@ObfuscatedName("gz")
public final class class194 {

    @ObfuscatedName("gz.n")
    public class195 field3001 = new class195();

    public class194() {
        this.field3001.field3002 = this.field3001;
        this.field3001.field3003 = this.field3001;
    }

    @ObfuscatedName("gz.n(Lgo;)V")
    public void method3436(class195 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3450();
        }
        arg0.field3003 = this.field3001.field3003;
        arg0.field3002 = this.field3001;
        arg0.field3003.field3002 = arg0;
        arg0.field3002.field3003 = arg0;
    }

    @ObfuscatedName("gz.w(Lgo;)V")
    public void method3435(class195 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3450();
        }
        arg0.field3003 = this.field3001;
        arg0.field3002 = this.field3001.field3002;
        arg0.field3003.field3002 = arg0;
        arg0.field3002.field3003 = arg0;
    }

    @ObfuscatedName("gz.i()Lgo;")
    public class195 method3438() {
        class195 var1 = this.field3001.field3002;
        if (this.field3001 == var1) {
            return null;
        } else {
            var1.method3450();
            return var1;
        }
    }

    @ObfuscatedName("gz.e()Lgo;")
    public class195 method3439() {
        class195 var1 = this.field3001.field3002;
        return this.field3001 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.h()V")
    public void method3437() {
        while (true) {
            class195 var1 = this.field3001.field3002;
            if (this.field3001 == var1) {
                return;
            }
            var1.method3450();
        }
    }
}
