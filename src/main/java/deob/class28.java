package deob;

@ObfuscatedName("am")
public class class28 extends class44 {

    @ObfuscatedName("am.n")
    public final int field160;

    @ObfuscatedName("am.v")
    public final class38 field157;

    @ObfuscatedName("am.d")
    public final int field166;

    @ObfuscatedName("am.c")
    public final int field161;

    public class28(class223 arg0, class223 arg1, int arg2, class38 arg3) {
        super(arg0, arg1);
        this.field160 = arg2;
        this.field157 = arg3;
        class253 var5 = class253.method4155(this.method250());
        class336 var6 = var5.method4178(false);
        if (var6 == null) {
            this.field166 = 0;
            this.field161 = 0;
        } else {
            this.field166 = var6.field3913;
            this.field161 = var6.field3912;
        }
    }

    @ObfuscatedName("am.n(B)I")
    public int method250() {
        return this.field160;
    }

    @ObfuscatedName("am.v(S)Laa;")
    public class38 method251() {
        return this.field157;
    }

    @ObfuscatedName("am.d(I)I")
    public int method258() {
        return this.field166;
    }

    @ObfuscatedName("am.c(I)I")
    public int method253() {
        return this.field161;
    }
}
