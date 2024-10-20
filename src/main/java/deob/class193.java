package deob;

@ObfuscatedName("gc")
public final class class193 {

    @ObfuscatedName("gc.l")
    public class204 field3070 = new class204();

    @ObfuscatedName("gc.e")
    public int field3069;

    @ObfuscatedName("gc.q")
    public int field3071;

    @ObfuscatedName("gc.o")
    public class196 field3072;

    @ObfuscatedName("gc.g")
    public class203 field3073 = new class203();

    public class193(int arg0) {
        this.field3069 = arg0;
        this.field3071 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3072 = new class196(var2);
    }

    @ObfuscatedName("gc.l(J)Lgz;")
    public class204 method3478(long arg0) {
        class204 var3 = (class204) this.field3072.method3509(arg0);
        if (var3 != null) {
            this.field3073.method3598(var3);
        }
        return var3;
    }

    @ObfuscatedName("gc.e(J)V")
    public void method3483(long arg0) {
        class204 var3 = (class204) this.field3072.method3509(arg0);
        if (var3 != null) {
            var3.method3620();
            var3.method3603();
            this.field3071++;
        }
    }

    @ObfuscatedName("gc.q(Lgz;J)V")
    public void method3479(class204 arg0, long arg1) {
        if (this.field3071 == 0) {
            class204 var4 = this.field3073.method3586();
            var4.method3620();
            var4.method3603();
            if (this.field3070 == var4) {
                class204 var5 = this.field3073.method3586();
                var5.method3620();
                var5.method3603();
            }
        } else {
            this.field3071--;
        }
        this.field3072.method3518(arg0, arg1);
        this.field3073.method3598(arg0);
    }

    @ObfuscatedName("gc.o()V")
    public void method3481() {
        this.field3073.method3591();
        this.field3072.method3511();
        this.field3070 = new class204();
        this.field3071 = this.field3069;
    }
}
