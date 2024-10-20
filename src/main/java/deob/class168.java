package deob;

@ObfuscatedName("fr")
public final class class168 {

    @ObfuscatedName("fr.c")
    public class172 field2740 = new class172();

    @ObfuscatedName("fr.j")
    public int field2739;

    @ObfuscatedName("fr.f")
    public int field2737;

    @ObfuscatedName("fr.y")
    public class173 field2738;

    @ObfuscatedName("fr.x")
    public class170 field2741 = new class170();

    public class168(int arg0) {
        this.field2739 = arg0;
        this.field2737 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2738 = new class173(var2);
    }

    @ObfuscatedName("fr.c(J)Lfa;")
    public class172 method3087(long arg0) {
        class172 var3 = (class172) this.field2738.method3129(arg0);
        if (var3 != null) {
            this.field2741.method3108(var3);
        }
        return var3;
    }

    @ObfuscatedName("fr.j(J)V")
    public void method3088(long arg0) {
        class172 var3 = (class172) this.field2738.method3129(arg0);
        if (var3 != null) {
            var3.method3182();
            var3.method3127();
            this.field2737++;
        }
    }

    @ObfuscatedName("fr.f(Lfa;J)V")
    public void method3089(class172 arg0, long arg1) {
        if (this.field2737 == 0) {
            class172 var4 = this.field2741.method3101();
            var4.method3182();
            var4.method3127();
            if (this.field2740 == var4) {
                class172 var5 = this.field2741.method3101();
                var5.method3182();
                var5.method3127();
            }
        } else {
            this.field2737--;
        }
        this.field2738.method3137(arg0, arg1);
        this.field2741.method3108(arg0);
    }

    @ObfuscatedName("fr.y()V")
    public void method3092() {
        this.field2741.method3106();
        this.field2738.method3131();
        this.field2740 = new class172();
        this.field2737 = this.field2739;
    }
}
