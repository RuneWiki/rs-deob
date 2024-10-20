package deob;

@ObfuscatedName("ac")
public class class28 extends class44 {

    @ObfuscatedName("ac.f")
    public final int field162;

    @ObfuscatedName("ac.b")
    public final class38 field158;

    @ObfuscatedName("ac.l")
    public final int field159;

    @ObfuscatedName("ac.m")
    public final int field161;

    public class28(class223 arg0, class223 arg1, int arg2, class38 arg3) {
        super(arg0, arg1);
        this.field162 = arg2;
        this.field158 = arg3;
        class253 var5 = class253.method3431(this.method251());
        class336 var6 = var5.method4137(false);
        if (var6 == null) {
            this.field159 = 0;
            this.field161 = 0;
        } else {
            this.field159 = var6.field3909;
            this.field161 = var6.field3915;
        }
    }

    @ObfuscatedName("ac.f(B)I")
    public int method251() {
        return this.field162;
    }

    @ObfuscatedName("ac.b(I)Lai;")
    public class38 method252() {
        return this.field158;
    }

    @ObfuscatedName("ac.l(I)I")
    public int method253() {
        return this.field159;
    }

    @ObfuscatedName("ac.m(I)I")
    public int method264() {
        return this.field161;
    }
}
