package deob;

@ObfuscatedName("fe")
public class class164 extends class184 {

    @ObfuscatedName("fe.v")
    public final int field1943;

    @ObfuscatedName("fe.n")
    public final class167 field1939;

    @ObfuscatedName("fe.f")
    public int field1944;

    @ObfuscatedName("fe.y")
    public class179 field1941;

    @ObfuscatedName("fe.p")
    public int field1942;

    @ObfuscatedName("fe.j")
    public int field1940;

    public class164(class243 arg0, class243 arg1, int arg2, class167 arg3) {
        super(arg0, arg1);
        this.field1943 = arg2;
        this.field1939 = arg3;
        this.method2979();
    }

    @ObfuscatedName("fe.v(S)V")
    public void method2979() {
        this.field1944 = class154.method175(this.field1943).method2720().field1767;
        this.field1941 = this.field1939.method3113(class139.method52(this.field1944));
        class139 var1 = class139.method52(this.method2989());
        class396 var2 = var1.method2400(false);
        if (var2 == null) {
            this.field1942 = 0;
            this.field1940 = 0;
        } else {
            this.field1942 = var2.field4253;
            this.field1940 = var2.field4245;
        }
    }

    @ObfuscatedName("fe.n(I)I")
    public int method2989() {
        return this.field1944;
    }

    @ObfuscatedName("fe.f(I)Lfv;")
    public class179 method2993() {
        return this.field1941;
    }

    @ObfuscatedName("fe.y(I)I")
    public int method2992() {
        return this.field1942;
    }

    @ObfuscatedName("fe.p(B)I")
    public int method2982() {
        return this.field1940;
    }
}
