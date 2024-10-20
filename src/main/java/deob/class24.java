package deob;

@ObfuscatedName("g")
public class class24 extends class35 {

    @ObfuscatedName("g.f")
    public final int field171;

    @ObfuscatedName("g.i")
    public final class30 field168;

    @ObfuscatedName("g.y")
    public int field174;

    @ObfuscatedName("g.w")
    public class29 field170;

    @ObfuscatedName("g.p")
    public int field172;

    @ObfuscatedName("g.b")
    public int field173;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field171 = arg2;
        this.field168 = arg3;
        this.method251();
    }

    @ObfuscatedName("g.n(B)V")
    public void method251() {
        this.field174 = class254.method3616(this.field171).method4241().field3343;
        this.field170 = this.field168.method437(class242.method103(this.field174));
        class242 var1 = class242.method103(this.method183());
        class325 var2 = var1.method3987(false);
        if (var2 == null) {
            this.field172 = 0;
            this.field173 = 0;
        } else {
            this.field172 = var2.field3875;
            this.field173 = var2.field3865;
        }
    }

    @ObfuscatedName("g.f(B)I")
    public int method183() {
        return this.field174;
    }

    @ObfuscatedName("g.i(I)Law;")
    public class29 method169() {
        return this.field170;
    }

    @ObfuscatedName("g.y(I)I")
    public int method170() {
        return this.field172;
    }

    @ObfuscatedName("g.w(I)I")
    public int method171() {
        return this.field173;
    }
}
