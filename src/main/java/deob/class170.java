package deob;

@ObfuscatedName("fp")
public final class class170 {

    @ObfuscatedName("fp.d")
    public class174 field2797 = new class174();

    @ObfuscatedName("fp.g")
    public int field2798;

    @ObfuscatedName("fp.a")
    public int field2800;

    @ObfuscatedName("fp.t")
    public class175 field2799;

    @ObfuscatedName("fp.f")
    public class172 field2801 = new class172();

    public class170(int arg0) {
        this.field2798 = arg0;
        this.field2800 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2799 = new class175(var2);
    }

    @ObfuscatedName("fp.d(J)Lfz;")
    public class174 method3210(long arg0) {
        class174 var3 = (class174) this.field2799.method3255(arg0);
        if (var3 != null) {
            this.field2801.method3226(var3);
        }
        return var3;
    }

    @ObfuscatedName("fp.g(J)V")
    public void method3211(long arg0) {
        class174 var3 = (class174) this.field2799.method3255(arg0);
        if (var3 != null) {
            var3.method3306();
            var3.method3248();
            this.field2800++;
        }
    }

    @ObfuscatedName("fp.a(Lfz;J)V")
    public void method3221(class174 arg0, long arg1) {
        if (this.field2800 == 0) {
            class174 var4 = this.field2801.method3232();
            var4.method3306();
            var4.method3248();
            if (this.field2797 == var4) {
                class174 var5 = this.field2801.method3232();
                var5.method3306();
                var5.method3248();
            }
        } else {
            this.field2800--;
        }
        this.field2799.method3268(arg0, arg1);
        this.field2801.method3226(arg0);
    }

    @ObfuscatedName("fp.t()V")
    public void method3209() {
        this.field2801.method3230();
        this.field2799.method3270();
        this.field2797 = new class174();
        this.field2800 = this.field2798;
    }
}
