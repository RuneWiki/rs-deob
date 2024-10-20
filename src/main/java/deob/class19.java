package deob;

@ObfuscatedName("z")
public class class19 extends class35 {

    @ObfuscatedName("z.s")
    public final int field115;

    @ObfuscatedName("z.j")
    public final class29 field113;

    @ObfuscatedName("z.i")
    public final int field114;

    @ObfuscatedName("z.k")
    public final int field116;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field115 = arg2;
        this.field113 = arg3;
        class242 var5 = class242.method156(this.method169());
        class325 var6 = var5.method3979(false);
        if (var6 == null) {
            this.field114 = 0;
            this.field116 = 0;
        } else {
            this.field114 = var6.field3878;
            this.field116 = var6.field3875;
        }
    }

    @ObfuscatedName("z.s(B)I")
    public int method169() {
        return this.field115;
    }

    @ObfuscatedName("z.j(B)Lai;")
    public class29 method170() {
        return this.field113;
    }

    @ObfuscatedName("z.i(I)I")
    public int method172() {
        return this.field114;
    }

    @ObfuscatedName("z.k(B)I")
    public int method174() {
        return this.field116;
    }
}
