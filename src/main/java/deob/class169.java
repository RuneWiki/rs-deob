package deob;

@ObfuscatedName("ft")
public final class class169 {

    @ObfuscatedName("ft.p")
    public class173 field2791 = new class173();

    @ObfuscatedName("ft.j")
    public int field2789;

    @ObfuscatedName("ft.w")
    public int field2790;

    @ObfuscatedName("ft.h")
    public class174 field2788;

    @ObfuscatedName("ft.v")
    public class171 field2792 = new class171();

    public class169(int arg0) {
        this.field2789 = arg0;
        this.field2790 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2788 = new class174(var2);
    }

    @ObfuscatedName("ft.p(J)Lfa;")
    public class173 method3214(long arg0) {
        class173 var3 = (class173) this.field2788.method3261(arg0);
        if (var3 != null) {
            this.field2792.method3232(var3);
        }
        return var3;
    }

    @ObfuscatedName("ft.j(J)V")
    public void method3219(long arg0) {
        class173 var3 = (class173) this.field2788.method3261(arg0);
        if (var3 != null) {
            var3.method3327();
            var3.method3260();
            this.field2790++;
        }
    }

    @ObfuscatedName("ft.w(Lfa;J)V")
    public void method3223(class173 arg0, long arg1) {
        if (this.field2790 == 0) {
            class173 var4 = this.field2792.method3234();
            var4.method3327();
            var4.method3260();
            if (this.field2791 == var4) {
                class173 var5 = this.field2792.method3234();
                var5.method3327();
                var5.method3260();
            }
        } else {
            this.field2790--;
        }
        this.field2788.method3262(arg0, arg1);
        this.field2792.method3232(arg0);
    }

    @ObfuscatedName("ft.h()V")
    public void method3217() {
        this.field2792.method3238();
        this.field2788.method3263();
        this.field2791 = new class173();
        this.field2790 = this.field2789;
    }
}
