package deob;

@ObfuscatedName("n")
public class class19 extends class35 {

    @ObfuscatedName("n.f")
    public final int field117;

    @ObfuscatedName("n.i")
    public final class29 field116;

    @ObfuscatedName("n.y")
    public final int field118;

    @ObfuscatedName("n.w")
    public final int field115;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field117 = arg2;
        this.field116 = arg3;
        class242 var5 = class242.method103(this.method183());
        class325 var6 = var5.method3987(false);
        if (var6 == null) {
            this.field118 = 0;
            this.field115 = 0;
        } else {
            this.field118 = var6.field3875;
            this.field115 = var6.field3865;
        }
    }

    @ObfuscatedName("n.f(B)I")
    public int method183() {
        return this.field117;
    }

    @ObfuscatedName("n.i(I)Law;")
    public class29 method169() {
        return this.field116;
    }

    @ObfuscatedName("n.y(I)I")
    public int method170() {
        return this.field118;
    }

    @ObfuscatedName("n.w(I)I")
    public int method171() {
        return this.field115;
    }
}
