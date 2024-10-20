package deob;

@ObfuscatedName("gf")
public final class class193 {

    @ObfuscatedName("gf.h")
    public class204 field3068 = new class204();

    @ObfuscatedName("gf.m")
    public int field3065;

    @ObfuscatedName("gf.i")
    public int field3064;

    @ObfuscatedName("gf.q")
    public class196 field3067;

    @ObfuscatedName("gf.p")
    public class203 field3066 = new class203();

    public class193(int arg0) {
        this.field3065 = arg0;
        this.field3064 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3067 = new class196(var2);
    }

    @ObfuscatedName("gf.h(J)Lgh;")
    public class204 method3472(long arg0) {
        class204 var3 = (class204) this.field3067.method3519(arg0);
        if (var3 != null) {
            this.field3066.method3592(var3);
        }
        return var3;
    }

    @ObfuscatedName("gf.m(J)V")
    public void method3475(long arg0) {
        class204 var3 = (class204) this.field3067.method3519(arg0);
        if (var3 != null) {
            var3.method3625();
            var3.method3605();
            this.field3064++;
        }
    }

    @ObfuscatedName("gf.i(Lgh;J)V")
    public void method3474(class204 arg0, long arg1) {
        if (this.field3064 == 0) {
            class204 var4 = this.field3066.method3594();
            var4.method3625();
            var4.method3605();
            if (this.field3068 == var4) {
                class204 var5 = this.field3066.method3594();
                var5.method3625();
                var5.method3605();
            }
        } else {
            this.field3064--;
        }
        this.field3067.method3513(arg0, arg1);
        this.field3066.method3592(arg0);
    }

    @ObfuscatedName("gf.q()V")
    public void method3483() {
        this.field3066.method3596();
        this.field3067.method3514();
        this.field3068 = new class204();
        this.field3064 = this.field3065;
    }
}
