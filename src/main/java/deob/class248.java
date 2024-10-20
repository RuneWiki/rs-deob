package deob;

@ObfuscatedName("jx")
public class class248 extends class260 {

    @ObfuscatedName("jx.aq")
    public final int field2584;

    @ObfuscatedName("jx.aw")
    public final class255 field2587;

    @ObfuscatedName("jx.al")
    public final int field2586;

    @ObfuscatedName("jx.ai")
    public final int field2585;

    public class248(class339 arg0, class339 arg1, int arg2, class255 arg3) {
        super(arg0, arg1);
        this.field2584 = arg2;
        this.field2587 = arg3;
        class179 var5 = class179.method2995(this.method4218());
        class548 var6 = var5.method3242(false);
        if (var6 == null) {
            this.field2586 = 0;
            this.field2585 = 0;
        } else {
            this.field2586 = var6.field5304;
            this.field2585 = var6.field5298;
        }
    }

    @ObfuscatedName("jx.aw(S)I")
    public int method4218() {
        return this.field2584;
    }

    @ObfuscatedName("jx.al(I)Lja;")
    public class255 method4221() {
        return this.field2587;
    }

    @ObfuscatedName("jx.ai(I)I")
    public int method4222() {
        return this.field2586;
    }

    @ObfuscatedName("jx.ar(I)I")
    public int method4223() {
        return this.field2585;
    }
}
