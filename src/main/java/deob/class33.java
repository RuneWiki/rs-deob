package deob;

@ObfuscatedName("ab")
public class class33 extends class44 {

    @ObfuscatedName("ab.m")
    public final int field210;

    @ObfuscatedName("ab.o")
    public final class39 field205;

    @ObfuscatedName("ab.q")
    public int field208;

    @ObfuscatedName("ab.j")
    public class38 field214;

    @ObfuscatedName("ab.p")
    public int field209;

    @ObfuscatedName("ab.g")
    public int field213;

    public class33(class223 arg0, class223 arg1, int arg2, class39 arg3) {
        super(arg0, arg1);
        this.field210 = arg2;
        this.field205 = arg3;
        this.method313();
    }

    @ObfuscatedName("ab.d(I)V")
    public void method313() {
        this.field208 = class264.method752(this.field210).method4361().field3394;
        this.field214 = this.field205.method442(class252.method1412(this.field208));
        class252 var1 = class252.method1412(this.method224());
        class335 var2 = var1.method4132(false);
        if (var2 == null) {
            this.field209 = 0;
            this.field213 = 0;
        } else {
            this.field209 = var2.field3897;
            this.field213 = var2.field3895;
        }
    }

    @ObfuscatedName("ab.m(B)I")
    public int method224() {
        return this.field208;
    }

    @ObfuscatedName("ab.o(B)Lar;")
    public class38 method225() {
        return this.field214;
    }

    @ObfuscatedName("ab.q(I)I")
    public int method235() {
        return this.field209;
    }

    @ObfuscatedName("ab.j(I)I")
    public int method223() {
        return this.field213;
    }
}
