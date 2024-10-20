package deob;

@ObfuscatedName("gg")
public final class class190 {

    @ObfuscatedName("gg.i")
    public class195 field2455 = new class195();

    @ObfuscatedName("gg.h")
    public int field2457;

    @ObfuscatedName("gg.u")
    public int field2456;

    @ObfuscatedName("gg.q")
    public class191 field2458;

    @ObfuscatedName("gg.g")
    public class185 field2454 = new class185();

    public class190(int arg0) {
        this.field2457 = arg0;
        this.field2456 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2458 = new class191(var2);
    }

    @ObfuscatedName("gg.i(J)Lga;")
    public class195 method3308(long arg0) {
        class195 var3 = (class195) this.field2458.method3331(arg0);
        if (var3 != null) {
            this.field2454.method3255(var3);
        }
        return var3;
    }

    @ObfuscatedName("gg.h(J)V")
    public void method3307(long arg0) {
        class195 var3 = (class195) this.field2458.method3331(arg0);
        if (var3 != null) {
            var3.method3364();
            var3.method3403();
            this.field2456++;
        }
    }

    @ObfuscatedName("gg.u(Lga;J)V")
    public void method3316(class195 arg0, long arg1) {
        if (this.field2456 == 0) {
            class195 var4 = this.field2454.method3257();
            var4.method3364();
            var4.method3403();
            if (this.field2455 == var4) {
                class195 var5 = this.field2454.method3257();
                var5.method3364();
                var5.method3403();
            }
        } else {
            this.field2456--;
        }
        this.field2458.method3333(arg0, arg1);
        this.field2454.method3255(arg0);
    }

    @ObfuscatedName("gg.q()V")
    public void method3311() {
        this.field2454.method3259();
        this.field2458.method3321();
        this.field2455 = new class195();
        this.field2456 = this.field2457;
    }
}
