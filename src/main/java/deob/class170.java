package deob;

@ObfuscatedName("fr")
public final class class170 {

    @ObfuscatedName("fr.a")
    public class174 field2796 = new class174();

    @ObfuscatedName("fr.x")
    public int field2798;

    @ObfuscatedName("fr.e")
    public int field2795;

    @ObfuscatedName("fr.r")
    public class175 field2797;

    @ObfuscatedName("fr.p")
    public class172 field2794 = new class172();

    public class170(int arg0) {
        this.field2798 = arg0;
        this.field2795 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2797 = new class175(var2);
    }

    @ObfuscatedName("fr.a(J)Lfd;")
    public class174 method3196(long arg0) {
        class174 var3 = (class174) this.field2797.method3242(arg0);
        if (var3 != null) {
            this.field2794.method3211(var3);
        }
        return var3;
    }

    @ObfuscatedName("fr.x(J)V")
    public void method3194(long arg0) {
        class174 var3 = (class174) this.field2797.method3242(arg0);
        if (var3 != null) {
            var3.method3288();
            var3.method3227();
            this.field2795++;
        }
    }

    @ObfuscatedName("fr.e(Lfd;J)V")
    public void method3193(class174 arg0, long arg1) {
        if (this.field2795 == 0) {
            class174 var4 = this.field2794.method3206();
            var4.method3288();
            var4.method3227();
            if (this.field2796 == var4) {
                class174 var5 = this.field2794.method3206();
                var5.method3288();
                var5.method3227();
            }
        } else {
            this.field2795--;
        }
        this.field2797.method3234(arg0, arg1);
        this.field2794.method3211(arg0);
    }

    @ObfuscatedName("fr.r()V")
    public void method3192() {
        this.field2794.method3207();
        this.field2797.method3229();
        this.field2796 = new class174();
        this.field2795 = this.field2798;
    }
}
