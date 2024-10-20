package deob;

@ObfuscatedName("fj")
public final class class171 {

    @ObfuscatedName("fj.b")
    public class181 field2828 = new class181();

    @ObfuscatedName("fj.u")
    public int field2829;

    @ObfuscatedName("fj.x")
    public int field2830;

    @ObfuscatedName("fj.j")
    public class174 field2831;

    @ObfuscatedName("fj.o")
    public class180 field2832 = new class180();

    public class171(int arg0) {
        this.field2829 = arg0;
        this.field2830 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2831 = new class174(var2);
    }

    @ObfuscatedName("fj.b(J)Lff;")
    public class181 method3114(long arg0) {
        class181 var3 = (class181) this.field2831.method3157(arg0);
        if (var3 != null) {
            this.field2832.method3227(var3);
        }
        return var3;
    }

    @ObfuscatedName("fj.u(J)V")
    public void method3115(long arg0) {
        class181 var3 = (class181) this.field2831.method3157(arg0);
        if (var3 != null) {
            var3.method3260();
            var3.method3243();
            this.field2830++;
        }
    }

    @ObfuscatedName("fj.x(Lff;J)V")
    public void method3116(class181 arg0, long arg1) {
        if (this.field2830 == 0) {
            class181 var4 = this.field2832.method3236();
            var4.method3260();
            var4.method3243();
            if (this.field2828 == var4) {
                class181 var5 = this.field2832.method3236();
                var5.method3260();
                var5.method3243();
            }
        } else {
            this.field2830--;
        }
        this.field2831.method3147(arg0, arg1);
        this.field2832.method3227(arg0);
    }

    @ObfuscatedName("fj.j()V")
    public void method3117() {
        this.field2832.method3239();
        this.field2831.method3149();
        this.field2828 = new class181();
        this.field2830 = this.field2829;
    }
}
