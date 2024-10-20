package deob;

@ObfuscatedName("fr")
public final class class170 {

    @ObfuscatedName("fr.p")
    public class174 field2791 = new class174();

    @ObfuscatedName("fr.e")
    public int field2792;

    @ObfuscatedName("fr.a")
    public int field2793;

    @ObfuscatedName("fr.h")
    public class175 field2794;

    @ObfuscatedName("fr.y")
    public class172 field2795 = new class172();

    public class170(int arg0) {
        this.field2792 = arg0;
        this.field2793 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2794 = new class175(var2);
    }

    @ObfuscatedName("fr.p(J)Lfu;")
    public class174 method3266(long arg0) {
        class174 var3 = (class174) this.field2794.method3311(arg0);
        if (var3 != null) {
            this.field2795.method3278(var3);
        }
        return var3;
    }

    @ObfuscatedName("fr.e(J)V")
    public void method3267(long arg0) {
        class174 var3 = (class174) this.field2794.method3311(arg0);
        if (var3 != null) {
            var3.method3360();
            var3.method3305();
            this.field2793++;
        }
    }

    @ObfuscatedName("fr.a(Lfu;J)V")
    public void method3268(class174 arg0, long arg1) {
        if (this.field2793 == 0) {
            class174 var4 = this.field2795.method3280();
            var4.method3360();
            var4.method3305();
            if (this.field2791 == var4) {
                class174 var5 = this.field2795.method3280();
                var5.method3360();
                var5.method3305();
            }
        } else {
            this.field2793--;
        }
        this.field2794.method3310(arg0, arg1);
        this.field2795.method3278(arg0);
    }

    @ObfuscatedName("fr.h()V")
    public void method3269() {
        this.field2795.method3282();
        this.field2794.method3308();
        this.field2791 = new class174();
        this.field2793 = this.field2792;
    }
}
