package deob;

@ObfuscatedName("fx")
public final class class170 {

    @ObfuscatedName("fx.j")
    public class174 field2794 = new class174();

    @ObfuscatedName("fx.f")
    public int field2791;

    @ObfuscatedName("fx.o")
    public int field2792;

    @ObfuscatedName("fx.h")
    public class175 field2793;

    @ObfuscatedName("fx.u")
    public class172 field2790 = new class172();

    public class170(int arg0) {
        this.field2791 = arg0;
        this.field2792 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2793 = new class175(var2);
    }

    @ObfuscatedName("fx.j(J)Lfa;")
    public class174 method3256(long arg0) {
        class174 var3 = (class174) this.field2793.method3296(arg0);
        if (var3 != null) {
            this.field2790.method3268(var3);
        }
        return var3;
    }

    @ObfuscatedName("fx.f(J)V")
    public void method3255(long arg0) {
        class174 var3 = (class174) this.field2793.method3296(arg0);
        if (var3 != null) {
            var3.method3349();
            var3.method3294();
            this.field2792++;
        }
    }

    @ObfuscatedName("fx.o(Lfa;J)V")
    public void method3257(class174 arg0, long arg1) {
        if (this.field2792 == 0) {
            class174 var4 = this.field2790.method3269();
            var4.method3349();
            var4.method3294();
            if (this.field2794 == var4) {
                class174 var5 = this.field2790.method3269();
                var5.method3349();
                var5.method3294();
            }
        } else {
            this.field2792--;
        }
        this.field2793.method3297(arg0, arg1);
        this.field2790.method3268(arg0);
    }

    @ObfuscatedName("fx.h()V")
    public void method3265() {
        this.field2790.method3271();
        this.field2793.method3307();
        this.field2794 = new class174();
        this.field2792 = this.field2791;
    }
}
