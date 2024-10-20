package deob;

@ObfuscatedName("bo")
public class class60 extends class209 {

    @ObfuscatedName("bo.y")
    public int field576 = class86.method1671();

    @ObfuscatedName("bo.c")
    public int field573 = client.field637;

    @ObfuscatedName("bo.n")
    public int field574;

    @ObfuscatedName("bo.u")
    public String field577;

    @ObfuscatedName("bo.i")
    public class294 field578;

    @ObfuscatedName("bo.r")
    public class292 field572 = class292.field3687;

    @ObfuscatedName("bo.j")
    public class292 field579 = class292.field3687;

    @ObfuscatedName("bo.p")
    public String field575;

    @ObfuscatedName("bo.e")
    public String field580;

    public class60(int arg0, String arg1, String arg2, String arg3) {
        this.field574 = arg0;
        this.field577 = arg1;
        this.method1025();
        this.field575 = arg2;
        this.field580 = arg3;
    }

    @ObfuscatedName("bo.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1018(int arg0, String arg1, String arg2, String arg3) {
        this.field576 = class86.method1671();
        this.field573 = client.field637;
        this.field574 = arg0;
        this.field577 = arg1;
        this.method1025();
        this.field575 = arg2;
        this.field580 = arg3;
    }

    @ObfuscatedName("bo.c(I)V")
    public void method1021() {
        this.field572 = class292.field3687;
    }

    @ObfuscatedName("bo.n(I)Z")
    public final boolean method1020() {
        if (class292.field3687 == this.field572) {
            this.method1040();
        }
        return class292.field3688 == this.field572;
    }

    @ObfuscatedName("bo.u(I)V")
    public void method1040() {
        this.field572 = Statics.field391.field1024.method5004(this.field578) ? class292.field3688 : class292.field3689;
    }

    @ObfuscatedName("bo.i(S)V")
    public void method1022() {
        this.field579 = class292.field3687;
    }

    @ObfuscatedName("bo.p(I)Z")
    public final boolean method1024() {
        if (class292.field3687 == this.field579) {
            this.method1028();
        }
        return class292.field3688 == this.field579;
    }

    @ObfuscatedName("bo.e(B)V")
    public void method1028() {
        this.field579 = Statics.field391.field1025.method5004(this.field578) ? class292.field3688 : class292.field3689;
    }

    @ObfuscatedName("bo.s(I)V")
    public final void method1025() {
        if (this.field577 == null) {
            this.field578 = null;
        } else {
            this.field578 = new class294(Statics.method106(this.field577), Statics.field2425);
        }
    }
}
