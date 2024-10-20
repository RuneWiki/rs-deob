package deob;

@ObfuscatedName("fi")
public final class class170 {

    @ObfuscatedName("fi.t")
    public class174 field2799 = new class174();

    @ObfuscatedName("fi.l")
    public int field2800;

    @ObfuscatedName("fi.c")
    public int field2798;

    @ObfuscatedName("fi.d")
    public class175 field2801;

    @ObfuscatedName("fi.b")
    public class172 field2802 = new class172();

    public class170(int arg0) {
        this.field2800 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2801 = new class175(var2);
    }

    @ObfuscatedName("fi.t(J)Lfj;")
    public class174 method3260(long arg0) {
        class174 var3 = (class174) this.field2801.method3301(arg0);
        if (var3 != null) {
            this.field2802.method3273(var3);
        }
        return var3;
    }

    @ObfuscatedName("fi.l(J)V")
    public void method3259(long arg0) {
        class174 var3 = (class174) this.field2801.method3301(arg0);
        if (var3 != null) {
            var3.method3361();
            var3.method3297();
            this.field2798++;
        }
    }

    @ObfuscatedName("fi.c(Lfj;J)V")
    public void method3261(class174 arg0, long arg1) {
        if (this.field2798 == 0) {
            class174 var4 = this.field2802.method3275();
            var4.method3361();
            var4.method3297();
            if (this.field2799 == var4) {
                class174 var5 = this.field2802.method3275();
                var5.method3361();
                var5.method3297();
            }
        } else {
            this.field2798--;
        }
        this.field2801.method3302(arg0, arg1);
        this.field2802.method3273(arg0);
    }

    @ObfuscatedName("fi.d()V")
    public void method3264() {
        this.field2802.method3277();
        this.field2801.method3303();
        this.field2799 = new class174();
        this.field2798 = this.field2800;
    }
}
