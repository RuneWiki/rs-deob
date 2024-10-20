package deob;

@ObfuscatedName("fe")
public final class class174 {

    @ObfuscatedName("fe.l")
    public class185 field2851 = new class185();

    @ObfuscatedName("fe.y")
    public int field2850;

    @ObfuscatedName("fe.g")
    public int field2849;

    @ObfuscatedName("fe.j")
    public class177 field2852;

    @ObfuscatedName("fe.w")
    public class184 field2853 = new class184();

    public class174(int arg0) {
        this.field2850 = arg0;
        this.field2849 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2852 = new class177(var2);
    }

    @ObfuscatedName("fe.l(J)Lgk;")
    public class185 method3225(long arg0) {
        class185 var3 = (class185) this.field2852.method3254(arg0);
        if (var3 != null) {
            this.field2853.method3335(var3);
        }
        return var3;
    }

    @ObfuscatedName("fe.y(J)V")
    public void method3213(long arg0) {
        class185 var3 = (class185) this.field2852.method3254(arg0);
        if (var3 != null) {
            var3.method3375();
            var3.method3349();
            this.field2849++;
        }
    }

    @ObfuscatedName("fe.g(Lgk;J)V")
    public void method3211(class185 arg0, long arg1) {
        if (this.field2849 == 0) {
            class185 var4 = this.field2853.method3337();
            var4.method3375();
            var4.method3349();
            if (this.field2851 == var4) {
                class185 var5 = this.field2853.method3337();
                var5.method3375();
                var5.method3349();
            }
        } else {
            this.field2849--;
        }
        this.field2852.method3260(arg0, arg1);
        this.field2853.method3335(arg0);
    }

    @ObfuscatedName("fe.j()V")
    public void method3214() {
        this.field2853.method3339();
        this.field2852.method3256();
        this.field2851 = new class185();
        this.field2849 = this.field2850;
    }
}
