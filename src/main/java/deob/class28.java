package deob;

@ObfuscatedName("ag")
public class class28 extends class44 {

    @ObfuscatedName("ag.z")
    public final int field149;

    @ObfuscatedName("ag.k")
    public final class38 field150;

    @ObfuscatedName("ag.s")
    public final int field151;

    @ObfuscatedName("ag.t")
    public final int field152;

    public class28(class223 arg0, class223 arg1, int arg2, class38 arg3) {
        super(arg0, arg1);
        this.field149 = arg2;
        this.field150 = arg3;
        class252 var5 = Statics.method285(this.method250());
        class335 var6 = var5.method4089(false);
        if (var6 == null) {
            this.field151 = 0;
            this.field152 = 0;
        } else {
            this.field151 = var6.field3905;
            this.field152 = var6.field3907;
        }
    }

    @ObfuscatedName("ag.z(I)I")
    public int method250() {
        return this.field149;
    }

    @ObfuscatedName("ag.k(I)Laq;")
    public class38 method261() {
        return this.field150;
    }

    @ObfuscatedName("ag.s(I)I")
    public int method251() {
        return this.field151;
    }

    @ObfuscatedName("ag.t(I)I")
    public int method252() {
        return this.field152;
    }
}
