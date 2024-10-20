package deob;

@ObfuscatedName("lr")
public final class class302 {

    @ObfuscatedName("lr.ac")
    public class484 field3119 = new class484();

    @ObfuscatedName("lr.al")
    public int field3118;

    @ObfuscatedName("lr.ak")
    public int field3117;

    @ObfuscatedName("lr.ax")
    public class503 field3120;

    @ObfuscatedName("lr.ao")
    public class398 field3121 = new class398();

    public class302(int arg0) {
        this.field3118 = arg0;
        this.field3117 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3120 = new class503(var2);
    }

    @ObfuscatedName("lr.ac(J)Lsb;")
    public class484 method5286(long arg0) {
        class484 var3 = (class484) this.field3120.method8070(arg0);
        if (var3 != null) {
            this.field3121.method6656(var3);
        }
        return var3;
    }

    @ObfuscatedName("lr.al(J)V")
    public void method5285(long arg0) {
        class484 var3 = (class484) this.field3120.method8070(arg0);
        if (var3 != null) {
            var3.method7776();
            var3.method7774();
            this.field3117++;
        }
    }

    @ObfuscatedName("lr.ak(Lsb;J)V")
    public void method5289(class484 arg0, long arg1) {
        if (this.field3117 == 0) {
            class484 var4 = this.field3121.method6658();
            var4.method7776();
            var4.method7774();
            if (this.field3119 == var4) {
                class484 var5 = this.field3121.method6658();
                var5.method7776();
                var5.method7774();
            }
        } else {
            this.field3117--;
        }
        this.field3120.method8071(arg0, arg1);
        this.field3121.method6656(arg0);
    }

    @ObfuscatedName("lr.ax()V")
    public void method5288() {
        this.field3121.method6666();
        this.field3120.method8072();
        this.field3119 = new class484();
        this.field3117 = this.field3118;
    }
}
