package deob;

@ObfuscatedName("hn")
public class class218 {

    @ObfuscatedName("hn.f")
    public final int field3197;

    @ObfuscatedName("hn.e")
    public final long field3193;

    @ObfuscatedName("hn.n")
    public final class224 field3195;

    @ObfuscatedName("hn.t")
    public String field3196;

    @ObfuscatedName("hn.v")
    public String field3194;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3196 = arg0.method2407();
        this.field3194 = arg0.method2407();
        this.field3197 = arg0.method2401();
        this.field3193 = arg0.method2405();
        int var4 = arg0.method2404();
        int var5 = arg0.method2404();
        this.field3195 = new class224();
        this.field3195.method3821(2);
        this.field3195.method3823(arg1);
        this.field3195.field3217 = var4;
        this.field3195.field3221 = var5;
        this.field3195.field3220 = 0;
        this.field3195.field3219 = 0;
        this.field3195.field3218 = arg2;
    }

    @ObfuscatedName("hn.f(I)Ljava/lang/String;")
    public String method3785() {
        return this.field3196;
    }

    @ObfuscatedName("hn.e(I)Ljava/lang/String;")
    public String method3783() {
        return this.field3194;
    }
}
