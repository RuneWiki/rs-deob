package deob;

@ObfuscatedName("ft")
public final class class170 {

    @ObfuscatedName("ft.b")
    public class174 field2792 = new class174();

    @ObfuscatedName("ft.e")
    public int field2790;

    @ObfuscatedName("ft.g")
    public int field2789;

    @ObfuscatedName("ft.o")
    public class175 field2791;

    @ObfuscatedName("ft.a")
    public class172 field2793 = new class172();

    public class170(int arg0) {
        this.field2790 = arg0;
        this.field2789 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2791 = new class175(var2);
    }

    @ObfuscatedName("ft.b(J)Lfs;")
    public class174 method3248(long arg0) {
        class174 var3 = (class174) this.field2791.method3291(arg0);
        if (var3 != null) {
            this.field2793.method3274(var3);
        }
        return var3;
    }

    @ObfuscatedName("ft.e(J)V")
    public void method3257(long arg0) {
        class174 var3 = (class174) this.field2791.method3291(arg0);
        if (var3 != null) {
            var3.method3341();
            var3.method3287();
            this.field2789++;
        }
    }

    @ObfuscatedName("ft.g(Lfs;J)V")
    public void method3252(class174 arg0, long arg1) {
        if (this.field2789 == 0) {
            class174 var4 = this.field2793.method3263();
            var4.method3341();
            var4.method3287();
            if (this.field2792 == var4) {
                class174 var5 = this.field2793.method3263();
                var5.method3341();
                var5.method3287();
            }
        } else {
            this.field2789--;
        }
        this.field2791.method3292(arg0, arg1);
        this.field2793.method3274(arg0);
    }

    @ObfuscatedName("ft.o()V")
    public void method3251() {
        this.field2793.method3265();
        this.field2791.method3293();
        this.field2792 = new class174();
        this.field2789 = this.field2790;
    }
}
