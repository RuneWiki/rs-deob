package deob;

@ObfuscatedName("fw")
public final class class176 {

    @ObfuscatedName("fw.b")
    public class187 field2871 = new class187();

    @ObfuscatedName("fw.e")
    public int field2869;

    @ObfuscatedName("fw.i")
    public int field2870;

    @ObfuscatedName("fw.k")
    public class179 field2868;

    @ObfuscatedName("fw.h")
    public class186 field2872 = new class186();

    public class176(int arg0) {
        this.field2869 = arg0;
        this.field2870 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2868 = new class179(var2);
    }

    @ObfuscatedName("fw.b(J)Lgw;")
    public class187 method3218(long arg0) {
        class187 var3 = (class187) this.field2868.method3257(arg0);
        if (var3 != null) {
            this.field2872.method3359(var3);
        }
        return var3;
    }

    @ObfuscatedName("fw.e(J)V")
    public void method3219(long arg0) {
        class187 var3 = (class187) this.field2868.method3257(arg0);
        if (var3 != null) {
            var3.method3392();
            var3.method3367();
            this.field2870++;
        }
    }

    @ObfuscatedName("fw.i(Lgw;J)V")
    public void method3220(class187 arg0, long arg1) {
        if (this.field2870 == 0) {
            class187 var4 = this.field2872.method3349();
            var4.method3392();
            var4.method3367();
            if (this.field2871 == var4) {
                class187 var5 = this.field2872.method3349();
                var5.method3392();
                var5.method3367();
            }
        } else {
            this.field2870--;
        }
        this.field2868.method3258(arg0, arg1);
        this.field2872.method3359(arg0);
    }

    @ObfuscatedName("fw.k()V")
    public void method3231() {
        this.field2872.method3348();
        this.field2868.method3267();
        this.field2871 = new class187();
        this.field2870 = this.field2869;
    }
}
