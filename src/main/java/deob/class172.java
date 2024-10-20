package deob;

@ObfuscatedName("fi")
public class class172 extends class184 {

    @ObfuscatedName("fi.v")
    public final int field2027;

    @ObfuscatedName("fi.n")
    public final class179 field2026;

    @ObfuscatedName("fi.f")
    public final int field2025;

    @ObfuscatedName("fi.y")
    public final int field2028;

    public class172(class243 arg0, class243 arg1, int arg2, class179 arg3) {
        super(arg0, arg1);
        this.field2027 = arg2;
        this.field2026 = arg3;
        class139 var5 = class139.method52(this.method2989());
        class396 var6 = var5.method2400(false);
        if (var6 == null) {
            this.field2025 = 0;
            this.field2028 = 0;
        } else {
            this.field2025 = var6.field4253;
            this.field2028 = var6.field4245;
        }
    }

    @ObfuscatedName("fi.n(I)I")
    public int method2989() {
        return this.field2027;
    }

    @ObfuscatedName("fi.f(I)Lfv;")
    public class179 method2993() {
        return this.field2026;
    }

    @ObfuscatedName("fi.y(I)I")
    public int method2992() {
        return this.field2025;
    }

    @ObfuscatedName("fi.p(B)I")
    public int method2982() {
        return this.field2028;
    }
}
