package deob;

@ObfuscatedName("fm")
public final class class174 {

    @ObfuscatedName("fm.c")
    public class185 field2851 = new class185();

    @ObfuscatedName("fm.j")
    public int field2850;

    @ObfuscatedName("fm.y")
    public int field2852;

    @ObfuscatedName("fm.r")
    public class177 field2849;

    @ObfuscatedName("fm.f")
    public class184 field2853 = new class184();

    public class174(int arg0) {
        this.field2850 = arg0;
        this.field2852 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2849 = new class177(var2);
    }

    @ObfuscatedName("fm.c(J)Lgp;")
    public class185 method3178(long arg0) {
        class185 var3 = (class185) this.field2849.method3206(arg0);
        if (var3 != null) {
            this.field2853.method3296(var3);
        }
        return var3;
    }

    @ObfuscatedName("fm.j(J)V")
    public void method3171(long arg0) {
        class185 var3 = (class185) this.field2849.method3206(arg0);
        if (var3 != null) {
            var3.method3334();
            var3.method3310();
            this.field2852++;
        }
    }

    @ObfuscatedName("fm.y(Lgp;J)V")
    public void method3167(class185 arg0, long arg1) {
        if (this.field2852 == 0) {
            class185 var4 = this.field2853.method3298();
            var4.method3334();
            var4.method3310();
            if (this.field2851 == var4) {
                class185 var5 = this.field2853.method3298();
                var5.method3334();
                var5.method3310();
            }
        } else {
            this.field2852--;
        }
        this.field2849.method3207(arg0, arg1);
        this.field2853.method3296(arg0);
    }

    @ObfuscatedName("fm.r()V")
    public void method3168() {
        this.field2853.method3305();
        this.field2849.method3208();
        this.field2851 = new class185();
        this.field2852 = this.field2850;
    }
}
