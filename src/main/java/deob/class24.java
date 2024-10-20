package deob;

@ObfuscatedName("v")
public class class24 extends class35 {

    @ObfuscatedName("v.s")
    public final int field174;

    @ObfuscatedName("v.j")
    public final class30 field170;

    @ObfuscatedName("v.i")
    public int field172;

    @ObfuscatedName("v.k")
    public class29 field169;

    @ObfuscatedName("v.u")
    public int field173;

    @ObfuscatedName("v.n")
    public int field171;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field174 = arg2;
        this.field170 = arg3;
        this.method253();
    }

    @ObfuscatedName("v.c(I)V")
    public void method253() {
        this.field172 = class254.method3676(this.field174).method4204().field3359;
        this.field169 = this.field170.method380(class242.method156(this.field172));
        class242 var1 = class242.method156(this.method169());
        class325 var2 = var1.method3979(false);
        if (var2 == null) {
            this.field173 = 0;
            this.field171 = 0;
        } else {
            this.field173 = var2.field3878;
            this.field171 = var2.field3875;
        }
    }

    @ObfuscatedName("v.s(B)I")
    public int method169() {
        return this.field172;
    }

    @ObfuscatedName("v.j(B)Lai;")
    public class29 method170() {
        return this.field169;
    }

    @ObfuscatedName("v.i(I)I")
    public int method172() {
        return this.field173;
    }

    @ObfuscatedName("v.k(B)I")
    public int method174() {
        return this.field171;
    }
}
