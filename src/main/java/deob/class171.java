package deob;

@ObfuscatedName("fy")
public final class class171 {

    @ObfuscatedName("fy.t")
    public class182 field2827 = new class182();

    @ObfuscatedName("fy.s")
    public int field2828;

    @ObfuscatedName("fy.f")
    public int field2829;

    @ObfuscatedName("fy.e")
    public class174 field2830;

    @ObfuscatedName("fy.d")
    public class181 field2831 = new class181();

    public class171(int arg0) {
        this.field2828 = arg0;
        this.field2829 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2830 = new class174(var2);
    }

    @ObfuscatedName("fy.t(J)Lfe;")
    public class182 method3170(long arg0) {
        class182 var3 = (class182) this.field2830.method3204(arg0);
        if (var3 != null) {
            this.field2831.method3284(var3);
        }
        return var3;
    }

    @ObfuscatedName("fy.s(J)V")
    public void method3169(long arg0) {
        class182 var3 = (class182) this.field2830.method3204(arg0);
        if (var3 != null) {
            var3.method3316();
            var3.method3299();
            this.field2829++;
        }
    }

    @ObfuscatedName("fy.f(Lfe;J)V")
    public void method3168(class182 arg0, long arg1) {
        if (this.field2829 == 0) {
            class182 var4 = this.field2831.method3286();
            var4.method3316();
            var4.method3299();
            if (this.field2827 == var4) {
                class182 var5 = this.field2831.method3286();
                var5.method3316();
                var5.method3299();
            }
        } else {
            this.field2829--;
        }
        this.field2830.method3212(arg0, arg1);
        this.field2831.method3284(arg0);
    }

    @ObfuscatedName("fy.e()V")
    public void method3171() {
        this.field2831.method3287();
        this.field2830.method3214();
        this.field2827 = new class182();
        this.field2829 = this.field2828;
    }
}
