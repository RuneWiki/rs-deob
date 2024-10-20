package deob;

@ObfuscatedName("fo")
public final class class174 {

    @ObfuscatedName("fo.x")
    public class185 field2845 = new class185();

    @ObfuscatedName("fo.v")
    public int field2848;

    @ObfuscatedName("fo.m")
    public int field2846;

    @ObfuscatedName("fo.e")
    public class177 field2844;

    @ObfuscatedName("fo.h")
    public class184 field2847 = new class184();

    public class174(int arg0) {
        this.field2848 = arg0;
        this.field2846 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2844 = new class177(var2);
    }

    @ObfuscatedName("fo.x(J)Lga;")
    public class185 method3186(long arg0) {
        class185 var3 = (class185) this.field2844.method3214(arg0);
        if (var3 != null) {
            this.field2847.method3301(var3);
        }
        return var3;
    }

    @ObfuscatedName("fo.v(J)V")
    public void method3179(long arg0) {
        class185 var3 = (class185) this.field2844.method3214(arg0);
        if (var3 != null) {
            var3.method3352();
            var3.method3321();
            this.field2846++;
        }
    }

    @ObfuscatedName("fo.m(Lga;J)V")
    public void method3183(class185 arg0, long arg1) {
        if (this.field2846 == 0) {
            class185 var4 = this.field2847.method3304();
            var4.method3352();
            var4.method3321();
            if (this.field2845 == var4) {
                class185 var5 = this.field2847.method3304();
                var5.method3352();
                var5.method3321();
            }
        } else {
            this.field2846--;
        }
        this.field2844.method3215(arg0, arg1);
        this.field2847.method3301(arg0);
    }

    @ObfuscatedName("fo.e()V")
    public void method3181() {
        this.field2847.method3306();
        this.field2844.method3220();
        this.field2845 = new class185();
        this.field2846 = this.field2848;
    }
}
