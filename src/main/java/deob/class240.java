package deob;

@ObfuscatedName("jr")
public class class240 extends class260 {

    @ObfuscatedName("jr.aq")
    public final int field2506;

    @ObfuscatedName("jr.aw")
    public final class243 field2501;

    @ObfuscatedName("jr.al")
    public int field2500;

    @ObfuscatedName("jr.ai")
    public class255 field2503;

    @ObfuscatedName("jr.ar")
    public int field2502;

    @ObfuscatedName("jr.as")
    public int field2505;

    public class240(class339 arg0, class339 arg1, int arg2, class243 arg3) {
        super(arg0, arg1);
        this.field2506 = arg2;
        this.field2501 = arg3;
        this.method4233();
    }

    @ObfuscatedName("jr.aq(I)V")
    public void method4233() {
        this.field2500 = class204.method2849(this.field2506).method3597().field2146;
        this.field2503 = this.field2501.method4427(class179.method2995(this.field2500));
        class179 var1 = class179.method2995(this.method4218());
        class548 var2 = var1.method3242(false);
        if (var2 == null) {
            this.field2502 = 0;
            this.field2505 = 0;
        } else {
            this.field2502 = var2.field5304;
            this.field2505 = var2.field5298;
        }
    }

    @ObfuscatedName("jr.aw(S)I")
    public int method4218() {
        return this.field2500;
    }

    @ObfuscatedName("jr.al(I)Lja;")
    public class255 method4221() {
        return this.field2503;
    }

    @ObfuscatedName("jr.ai(I)I")
    public int method4222() {
        return this.field2502;
    }

    @ObfuscatedName("jr.ar(I)I")
    public int method4223() {
        return this.field2505;
    }
}
