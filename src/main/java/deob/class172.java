package deob;

@ObfuscatedName("fl")
public final class class172 {

    @ObfuscatedName("fl.g")
    public class183 field2839 = new class183();

    @ObfuscatedName("fl.s")
    public int field2837;

    @ObfuscatedName("fl.h")
    public int field2838;

    @ObfuscatedName("fl.m")
    public class175 field2840;

    @ObfuscatedName("fl.u")
    public class182 field2836 = new class182();

    public class172(int arg0) {
        this.field2837 = arg0;
        this.field2838 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2840 = new class175(var2);
    }

    @ObfuscatedName("fl.g(J)Lgc;")
    public class183 method3130(long arg0) {
        class183 var3 = (class183) this.field2840.method3171(arg0);
        if (var3 != null) {
            this.field2836.method3241(var3);
        }
        return var3;
    }

    @ObfuscatedName("fl.s(J)V")
    public void method3125(long arg0) {
        class183 var3 = (class183) this.field2840.method3171(arg0);
        if (var3 != null) {
            var3.method3280();
            var3.method3260();
            this.field2838++;
        }
    }

    @ObfuscatedName("fl.h(Lgc;J)V")
    public void method3126(class183 arg0, long arg1) {
        if (this.field2838 == 0) {
            class183 var4 = this.field2836.method3243();
            var4.method3280();
            var4.method3260();
            if (this.field2839 == var4) {
                class183 var5 = this.field2836.method3243();
                var5.method3280();
                var5.method3260();
            }
        } else {
            this.field2838--;
        }
        this.field2840.method3161(arg0, arg1);
        this.field2836.method3241(arg0);
    }

    @ObfuscatedName("fl.m()V")
    public void method3127() {
        this.field2836.method3245();
        this.field2840.method3162();
        this.field2839 = new class183();
        this.field2838 = this.field2837;
    }
}
