package deob;

@ObfuscatedName("gb")
public final class class193 {

    @ObfuscatedName("gb.a")
    public class204 field3074 = new class204();

    @ObfuscatedName("gb.r")
    public int field3075;

    @ObfuscatedName("gb.f")
    public int field3078;

    @ObfuscatedName("gb.s")
    public class196 field3077;

    @ObfuscatedName("gb.y")
    public class203 field3076 = new class203();

    public class193(int arg0) {
        this.field3075 = arg0;
        this.field3078 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3077 = new class196(var2);
    }

    @ObfuscatedName("gb.a(J)Lgq;")
    public class204 method3507(long arg0) {
        class204 var3 = (class204) this.field3077.method3539(arg0);
        if (var3 != null) {
            this.field3076.method3623(var3);
        }
        return var3;
    }

    @ObfuscatedName("gb.r(J)V")
    public void method3508(long arg0) {
        class204 var3 = (class204) this.field3077.method3539(arg0);
        if (var3 != null) {
            var3.method3661();
            var3.method3635();
            this.field3078++;
        }
    }

    @ObfuscatedName("gb.f(Lgq;J)V")
    public void method3509(class204 arg0, long arg1) {
        if (this.field3078 == 0) {
            class204 var4 = this.field3076.method3625();
            var4.method3661();
            var4.method3635();
            if (this.field3074 == var4) {
                class204 var5 = this.field3076.method3625();
                var5.method3661();
                var5.method3635();
            }
        } else {
            this.field3078--;
        }
        this.field3077.method3546(arg0, arg1);
        this.field3076.method3623(arg0);
    }

    @ObfuscatedName("gb.s()V")
    public void method3515() {
        this.field3076.method3632();
        this.field3077.method3538();
        this.field3074 = new class204();
        this.field3078 = this.field3075;
    }
}
