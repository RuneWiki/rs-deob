package deob;

@ObfuscatedName("fp")
public final class class170 {

    @ObfuscatedName("fp.f")
    public class174 field2795 = new class174();

    @ObfuscatedName("fp.t")
    public int field2792;

    @ObfuscatedName("fp.n")
    public int field2793;

    @ObfuscatedName("fp.e")
    public class175 field2794;

    @ObfuscatedName("fp.l")
    public class172 field2791 = new class172();

    public class170(int arg0) {
        this.field2792 = arg0;
        this.field2793 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2794 = new class175(var2);
    }

    @ObfuscatedName("fp.f(J)Lfj;")
    public class174 method3276(long arg0) {
        class174 var3 = (class174) this.field2794.method3312(arg0);
        if (var3 != null) {
            this.field2791.method3285(var3);
        }
        return var3;
    }

    @ObfuscatedName("fp.t(J)V")
    public void method3269(long arg0) {
        class174 var3 = (class174) this.field2794.method3312(arg0);
        if (var3 != null) {
            var3.method3374();
            var3.method3309();
            this.field2793++;
        }
    }

    @ObfuscatedName("fp.n(Lfj;J)V")
    public void method3275(class174 arg0, long arg1) {
        if (this.field2793 == 0) {
            class174 var4 = this.field2791.method3283();
            var4.method3374();
            var4.method3309();
            if (this.field2795 == var4) {
                class174 var5 = this.field2791.method3283();
                var5.method3374();
                var5.method3309();
            }
        } else {
            this.field2793--;
        }
        this.field2794.method3329(arg0, arg1);
        this.field2791.method3285(arg0);
    }

    @ObfuscatedName("fp.e()V")
    public void method3271() {
        this.field2791.method3282();
        this.field2794.method3314();
        this.field2795 = new class174();
        this.field2793 = this.field2792;
    }
}
