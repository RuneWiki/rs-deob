package deob;

@ObfuscatedName("es")
public class class150 extends class162 {

    @ObfuscatedName("es.f")
    public final int field1664;

    @ObfuscatedName("es.o")
    public final class157 field1663;

    @ObfuscatedName("es.u")
    public final int field1665;

    @ObfuscatedName("es.p")
    public final int field1662;

    public class150(class221 arg0, class221 arg1, int arg2, class157 arg3) {
        super(arg0, arg1);
        this.field1664 = arg2;
        this.field1663 = arg3;
        class280 var5 = class280.method4995(this.method2372());
        class395 var6 = var5.method4344(false);
        if (var6 == null) {
            this.field1665 = 0;
            this.field1662 = 0;
        } else {
            this.field1665 = var6.field4245;
            this.field1662 = var6.field4244;
        }
    }

    @ObfuscatedName("es.o(B)I")
    public int method2372() {
        return this.field1664;
    }

    @ObfuscatedName("es.u(I)Lfi;")
    public class157 method2366() {
        return this.field1663;
    }

    @ObfuscatedName("es.p(I)I")
    public int method2370() {
        return this.field1665;
    }

    @ObfuscatedName("es.b(I)I")
    public int method2375() {
        return this.field1662;
    }
}
