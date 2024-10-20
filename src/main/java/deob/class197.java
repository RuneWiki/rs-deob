package deob;

@ObfuscatedName("gd")
public final class class197 {

    @ObfuscatedName("gd.e")
    public class208 field3126 = new class208();

    @ObfuscatedName("gd.l")
    public int field3129;

    @ObfuscatedName("gd.c")
    public int field3127;

    @ObfuscatedName("gd.h")
    public class200 field3128;

    @ObfuscatedName("gd.r")
    public class207 field3125 = new class207();

    public class197(int arg0) {
        this.field3129 = arg0;
        this.field3127 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3128 = new class200(var2);
    }

    @ObfuscatedName("gd.e(J)Lgf;")
    public class208 method3589(long arg0) {
        class208 var3 = (class208) this.field3128.method3619(arg0);
        if (var3 != null) {
            this.field3125.method3718(var3);
        }
        return var3;
    }

    @ObfuscatedName("gd.l(J)V")
    public void method3588(long arg0) {
        class208 var3 = (class208) this.field3128.method3619(arg0);
        if (var3 != null) {
            var3.method3755();
            var3.method3733();
            this.field3127++;
        }
    }

    @ObfuscatedName("gd.c(Lgf;J)V")
    public void method3591(class208 arg0, long arg1) {
        if (this.field3127 == 0) {
            class208 var4 = this.field3125.method3724();
            var4.method3755();
            var4.method3733();
            if (this.field3126 == var4) {
                class208 var5 = this.field3125.method3724();
                var5.method3755();
                var5.method3733();
            }
        } else {
            this.field3127--;
        }
        this.field3128.method3620(arg0, arg1);
        this.field3125.method3718(arg0);
    }

    @ObfuscatedName("gd.h()V")
    public void method3590() {
        this.field3125.method3721();
        this.field3128.method3632();
        this.field3126 = new class208();
        this.field3127 = this.field3129;
    }
}
