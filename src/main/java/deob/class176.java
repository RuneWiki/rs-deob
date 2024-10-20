package deob;

@ObfuscatedName("fb")
public final class class176 {

    @ObfuscatedName("fb.a")
    public class187 field2874 = new class187();

    @ObfuscatedName("fb.v")
    public int field2872;

    @ObfuscatedName("fb.i")
    public int field2873;

    @ObfuscatedName("fb.b")
    public class179 field2871;

    @ObfuscatedName("fb.l")
    public class186 field2875 = new class186();

    public class176(int arg0) {
        this.field2872 = arg0;
        this.field2873 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2871 = new class179(var2);
    }

    @ObfuscatedName("fb.a(J)Lge;")
    public class187 method3181(long arg0) {
        class187 var3 = (class187) this.field2871.method3231(arg0);
        if (var3 != null) {
            this.field2875.method3308(var3);
        }
        return var3;
    }

    @ObfuscatedName("fb.v(J)V")
    public void method3182(long arg0) {
        class187 var3 = (class187) this.field2871.method3231(arg0);
        if (var3 != null) {
            var3.method3343();
            var3.method3320();
            this.field2873++;
        }
    }

    @ObfuscatedName("fb.i(Lge;J)V")
    public void method3183(class187 arg0, long arg1) {
        if (this.field2873 == 0) {
            class187 var4 = this.field2875.method3313();
            var4.method3343();
            var4.method3320();
            if (this.field2874 == var4) {
                class187 var5 = this.field2875.method3313();
                var5.method3343();
                var5.method3320();
            }
        } else {
            this.field2873--;
        }
        this.field2871.method3211(arg0, arg1);
        this.field2875.method3308(arg0);
    }

    @ObfuscatedName("fb.b()V")
    public void method3184() {
        this.field2875.method3311();
        this.field2871.method3212();
        this.field2874 = new class187();
        this.field2873 = this.field2872;
    }
}
