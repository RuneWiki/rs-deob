package deob;

@ObfuscatedName("fc")
public final class class170 {

    @ObfuscatedName("fc.b")
    public class174 field2807 = new class174();

    @ObfuscatedName("fc.c")
    public int field2805;

    @ObfuscatedName("fc.j")
    public int field2804;

    @ObfuscatedName("fc.i")
    public class175 field2806;

    @ObfuscatedName("fc.k")
    public class172 field2808 = new class172();

    public class170(int arg0) {
        this.field2805 = arg0;
        this.field2804 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2806 = new class175(var2);
    }

    @ObfuscatedName("fc.b(J)Lfw;")
    public class174 method3188(long arg0) {
        class174 var3 = (class174) this.field2806.method3232(arg0);
        if (var3 != null) {
            this.field2808.method3202(var3);
        }
        return var3;
    }

    @ObfuscatedName("fc.c(J)V")
    public void method3189(long arg0) {
        class174 var3 = (class174) this.field2806.method3232(arg0);
        if (var3 != null) {
            var3.method3282();
            var3.method3223();
            this.field2804++;
        }
    }

    @ObfuscatedName("fc.j(Lfw;J)V")
    public void method3190(class174 arg0, long arg1) {
        if (this.field2804 == 0) {
            class174 var4 = this.field2808.method3214();
            var4.method3282();
            var4.method3223();
            if (this.field2807 == var4) {
                class174 var5 = this.field2808.method3214();
                var5.method3282();
                var5.method3223();
            }
        } else {
            this.field2804--;
        }
        this.field2806.method3228(arg0, arg1);
        this.field2808.method3202(arg0);
    }

    @ObfuscatedName("fc.i()V")
    public void method3191() {
        this.field2808.method3209();
        this.field2806.method3229();
        this.field2807 = new class174();
        this.field2804 = this.field2805;
    }
}
