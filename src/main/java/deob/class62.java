package deob;

@ObfuscatedName("ct")
public class class62 extends class439 {

    @ObfuscatedName("ct.aj")
    public int field463;

    @ObfuscatedName("ct.al")
    public int field458;

    @ObfuscatedName("ct.ac")
    public int field459;

    @ObfuscatedName("ct.ab")
    public String field460;

    @ObfuscatedName("ct.an")
    public class501 field461;

    @ObfuscatedName("ct.ao")
    public class409 field470 = class409.field4539;

    @ObfuscatedName("ct.av")
    public class409 field466 = class409.field4539;

    @ObfuscatedName("ct.aq")
    public String field462;

    @ObfuscatedName("ct.ap")
    public String field465;

    public class62(int arg0, String arg1, String arg2, String arg3) {
        this.method1098(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ct.aj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1098(int arg0, String arg1, String arg2, String arg3) {
        this.field463 = class108.method6751();
        this.field458 = client.field494;
        this.field459 = arg0;
        this.field460 = arg1;
        this.method1089();
        this.field462 = arg2;
        this.field465 = arg3;
        this.method1091();
        this.method1094();
    }

    @ObfuscatedName("ct.al(I)V")
    public void method1091() {
        this.field470 = class409.field4539;
    }

    @ObfuscatedName("ct.ac(B)Z")
    public final boolean method1092() {
        if (class409.field4539 == this.field470) {
            this.method1097();
        }
        return class409.field4537 == this.field470;
    }

    @ObfuscatedName("ct.ab(I)V")
    public void method1097() {
        this.field470 = Statics.field16.field798.method6953(this.field461) ? class409.field4537 : class409.field4538;
    }

    @ObfuscatedName("ct.an(B)V")
    public void method1094() {
        this.field466 = class409.field4539;
    }

    @ObfuscatedName("ct.ao(I)Z")
    public final boolean method1102() {
        if (class409.field4539 == this.field466) {
            this.method1096();
        }
        return class409.field4537 == this.field466;
    }

    @ObfuscatedName("ct.av(I)V")
    public void method1096() {
        this.field466 = Statics.field16.field799.method6953(this.field461) ? class409.field4537 : class409.field4538;
    }

    @ObfuscatedName("ct.aq(I)V")
    public final void method1089() {
        if (this.field460 == null) {
            this.field461 = null;
        } else {
            this.field461 = new class501(client.method3662(this.field460), Statics.field2619);
        }
    }
}
