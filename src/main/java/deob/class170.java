package deob;

@ObfuscatedName("fg")
public final class class170 {

    @ObfuscatedName("fg.q")
    public class174 field2808 = new class174();

    @ObfuscatedName("fg.c")
    public int field2809;

    @ObfuscatedName("fg.p")
    public int field2810;

    @ObfuscatedName("fg.z")
    public class175 field2812;

    @ObfuscatedName("fg.m")
    public class172 field2811 = new class172();

    public class170(int arg0) {
        this.field2809 = arg0;
        this.field2810 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2812 = new class175(var2);
    }

    @ObfuscatedName("fg.q(J)Lfa;")
    public class174 method3215(long arg0) {
        class174 var3 = (class174) this.field2812.method3260(arg0);
        if (var3 != null) {
            this.field2811.method3227(var3);
        }
        return var3;
    }

    @ObfuscatedName("fg.c(J)V")
    public void method3216(long arg0) {
        class174 var3 = (class174) this.field2812.method3260(arg0);
        if (var3 != null) {
            var3.method3309();
            var3.method3255();
            this.field2810++;
        }
    }

    @ObfuscatedName("fg.p(Lfa;J)V")
    public void method3225(class174 arg0, long arg1) {
        if (this.field2810 == 0) {
            class174 var4 = this.field2811.method3234();
            var4.method3309();
            var4.method3255();
            if (this.field2808 == var4) {
                class174 var5 = this.field2811.method3234();
                var5.method3309();
                var5.method3255();
            }
        } else {
            this.field2810--;
        }
        this.field2812.method3261(arg0, arg1);
        this.field2811.method3227(arg0);
    }

    @ObfuscatedName("fg.z()V")
    public void method3218() {
        this.field2811.method3231();
        this.field2812.method3272();
        this.field2808 = new class174();
        this.field2810 = this.field2809;
    }
}
