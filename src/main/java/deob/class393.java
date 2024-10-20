package deob;

@ObfuscatedName("py")
public final class class393 {

    @ObfuscatedName("py.am")
    public class485 field4474 = new class485();

    public class393() {
        this.field4474.field4883 = this.field4474;
        this.field4474.field4882 = this.field4474;
    }

    @ObfuscatedName("py.am(Lsc;)V")
    public void method6657(class485 arg0) {
        if (arg0.field4882 != null) {
            arg0.method7986();
        }
        arg0.field4882 = this.field4474.field4882;
        arg0.field4883 = this.field4474;
        arg0.field4882.field4883 = arg0;
        arg0.field4883.field4882 = arg0;
    }

    @ObfuscatedName("py.ap(Lsc;)V")
    public void method6656(class485 arg0) {
        if (arg0.field4882 != null) {
            arg0.method7986();
        }
        arg0.field4882 = this.field4474;
        arg0.field4883 = this.field4474.field4883;
        arg0.field4882.field4883 = arg0;
        arg0.field4883.field4882 = arg0;
    }

    @ObfuscatedName("py.af()Lsc;")
    public class485 method6661() {
        class485 var1 = this.field4474.field4883;
        return this.field4474 == var1 ? null : var1;
    }
}
