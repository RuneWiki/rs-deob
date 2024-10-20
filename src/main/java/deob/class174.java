package deob;

@ObfuscatedName("fz")
public final class class174 {

    @ObfuscatedName("fz.g")
    public class185 field2850 = new class185();

    @ObfuscatedName("fz.j")
    public int field2853;

    @ObfuscatedName("fz.z")
    public int field2849;

    @ObfuscatedName("fz.b")
    public class177 field2852;

    @ObfuscatedName("fz.k")
    public class184 field2851 = new class184();

    public class174(int arg0) {
        this.field2853 = arg0;
        this.field2849 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2852 = new class177(var2);
    }

    @ObfuscatedName("fz.g(J)Lgl;")
    public class185 method3097(long arg0) {
        class185 var3 = (class185) this.field2852.method3140(arg0);
        if (var3 != null) {
            this.field2851.method3233(var3);
        }
        return var3;
    }

    @ObfuscatedName("fz.j(J)V")
    public void method3098(long arg0) {
        class185 var3 = (class185) this.field2852.method3140(arg0);
        if (var3 != null) {
            var3.method3259();
            var3.method3235();
            this.field2849++;
        }
    }

    @ObfuscatedName("fz.z(Lgl;J)V")
    public void method3099(class185 arg0, long arg1) {
        if (this.field2849 == 0) {
            class185 var4 = this.field2851.method3224();
            var4.method3259();
            var4.method3235();
            if (this.field2850 == var4) {
                class185 var5 = this.field2851.method3224();
                var5.method3259();
                var5.method3235();
            }
        } else {
            this.field2849--;
        }
        this.field2852.method3137(arg0, arg1);
        this.field2851.method3233(arg0);
    }

    @ObfuscatedName("fz.b()V")
    public void method3100() {
        this.field2851.method3226();
        this.field2852.method3135();
        this.field2850 = new class185();
        this.field2849 = this.field2853;
    }
}
