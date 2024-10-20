package deob;

@ObfuscatedName("cr")
public class class66 extends class484 {

    @ObfuscatedName("cr.ac")
    public int field503;

    @ObfuscatedName("cr.al")
    public int field496;

    @ObfuscatedName("cr.ak")
    public int field497;

    @ObfuscatedName("cr.ax")
    public String field498;

    @ObfuscatedName("cr.ao")
    public class553 field495;

    @ObfuscatedName("cr.ah")
    public class453 field500 = class453.field4716;

    @ObfuscatedName("cr.ar")
    public class453 field499 = class453.field4716;

    @ObfuscatedName("cr.ab")
    public String field502;

    @ObfuscatedName("cr.am")
    public String field506;

    public class66(int arg0, String arg1, String arg2, String arg3) {
        this.method1129(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cr.ac(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1129(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class113.field1417 - 1;
        this.field503 = var5;
        this.field496 = client.field533;
        this.field497 = arg0;
        this.field498 = arg1;
        this.method1135();
        this.field502 = arg2;
        this.field506 = arg3;
        this.method1127();
        this.method1132();
    }

    @ObfuscatedName("cr.al(I)V")
    public void method1127() {
        this.field500 = class453.field4716;
    }

    @ObfuscatedName("cr.ak(I)Z")
    public final boolean method1130() {
        if (class453.field4716 == this.field500) {
            this.method1140();
        }
        return class453.field4720 == this.field500;
    }

    @ObfuscatedName("cr.ax(I)V")
    public void method1140() {
        this.field500 = Statics.field1907.field851.method7359(this.field495) ? class453.field4720 : class453.field4717;
    }

    @ObfuscatedName("cr.ao(B)V")
    public void method1132() {
        this.field499 = class453.field4716;
    }

    @ObfuscatedName("cr.ah(B)Z")
    public final boolean method1131() {
        if (class453.field4716 == this.field499) {
            this.method1150();
        }
        return class453.field4720 == this.field499;
    }

    @ObfuscatedName("cr.ar(B)V")
    public void method1150() {
        this.field499 = Statics.field1907.field849.method7359(this.field495) ? class453.field4720 : class453.field4717;
    }

    @ObfuscatedName("cr.ab(I)V")
    public final void method1135() {
        if (this.field498 == null) {
            this.field495 = null;
        } else {
            this.field495 = new class553(client.method2213(this.field498), Statics.field1781);
        }
    }
}
