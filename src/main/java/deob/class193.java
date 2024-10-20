package deob;

@ObfuscatedName("gv")
public final class class193 {

    @ObfuscatedName("gv.n")
    public class204 field3077 = new class204();

    @ObfuscatedName("gv.q")
    public int field3075;

    @ObfuscatedName("gv.c")
    public int field3076;

    @ObfuscatedName("gv.l")
    public class196 field3074;

    @ObfuscatedName("gv.r")
    public class203 field3078 = new class203();

    public class193(int arg0) {
        this.field3075 = arg0;
        this.field3076 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3074 = new class196(var2);
    }

    @ObfuscatedName("gv.n(J)Lgg;")
    public class204 method3475(long arg0) {
        class204 var3 = (class204) this.field3074.method3518(arg0);
        if (var3 != null) {
            this.field3078.method3600(var3);
        }
        return var3;
    }

    @ObfuscatedName("gv.q(J)V")
    public void method3476(long arg0) {
        class204 var3 = (class204) this.field3074.method3518(arg0);
        if (var3 != null) {
            var3.method3651();
            var3.method3618();
            this.field3076++;
        }
    }

    @ObfuscatedName("gv.c(Lgg;J)V")
    public void method3488(class204 arg0, long arg1) {
        if (this.field3076 == 0) {
            class204 var4 = this.field3078.method3612();
            var4.method3651();
            var4.method3618();
            if (this.field3077 == var4) {
                class204 var5 = this.field3078.method3612();
                var5.method3651();
                var5.method3618();
            }
        } else {
            this.field3076--;
        }
        this.field3074.method3524(arg0, arg1);
        this.field3078.method3600(arg0);
    }

    @ObfuscatedName("gv.l()V")
    public void method3479() {
        this.field3078.method3606();
        this.field3074.method3519();
        this.field3077 = new class204();
        this.field3076 = this.field3075;
    }
}
