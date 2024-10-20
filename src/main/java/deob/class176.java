package deob;

@ObfuscatedName("fr")
public final class class176 {

    @ObfuscatedName("fr.v")
    public class187 field2879 = new class187();

    @ObfuscatedName("fr.t")
    public int field2875;

    @ObfuscatedName("fr.f")
    public int field2877;

    @ObfuscatedName("fr.j")
    public class179 field2878;

    @ObfuscatedName("fr.l")
    public class186 field2876 = new class186();

    public class176(int arg0) {
        this.field2875 = arg0;
        this.field2877 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2878 = new class179(var2);
    }

    @ObfuscatedName("fr.v(J)Lga;")
    public class187 method3231(long arg0) {
        class187 var3 = (class187) this.field2878.method3274(arg0);
        if (var3 != null) {
            this.field2876.method3352(var3);
        }
        return var3;
    }

    @ObfuscatedName("fr.t(J)V")
    public void method3227(long arg0) {
        class187 var3 = (class187) this.field2878.method3274(arg0);
        if (var3 != null) {
            var3.method3392();
            var3.method3371();
            this.field2877++;
        }
    }

    @ObfuscatedName("fr.f(Lga;J)V")
    public void method3228(class187 arg0, long arg1) {
        if (this.field2877 == 0) {
            class187 var4 = this.field2876.method3355();
            var4.method3392();
            var4.method3371();
            if (this.field2879 == var4) {
                class187 var5 = this.field2876.method3355();
                var5.method3392();
                var5.method3371();
            }
        } else {
            this.field2877--;
        }
        this.field2878.method3282(arg0, arg1);
        this.field2876.method3352(arg0);
    }

    @ObfuscatedName("fr.j()V")
    public void method3229() {
        this.field2876.method3354();
        this.field2878.method3268();
        this.field2879 = new class187();
        this.field2877 = this.field2875;
    }
}
