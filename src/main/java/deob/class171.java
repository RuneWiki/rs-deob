package deob;

@ObfuscatedName("fq")
public final class class171 {

    @ObfuscatedName("fq.j")
    public class181 field2829 = new class181();

    @ObfuscatedName("fq.z")
    public int field2832;

    @ObfuscatedName("fq.y")
    public int field2828;

    @ObfuscatedName("fq.h")
    public class174 field2831;

    @ObfuscatedName("fq.r")
    public class180 field2830 = new class180();

    public class171(int arg0) {
        this.field2832 = arg0;
        this.field2828 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2831 = new class174(var2);
    }

    @ObfuscatedName("fq.j(J)Lfe;")
    public class181 method3171(long arg0) {
        class181 var3 = (class181) this.field2831.method3214(arg0);
        if (var3 != null) {
            this.field2830.method3284(var3);
        }
        return var3;
    }

    @ObfuscatedName("fq.z(J)V")
    public void method3172(long arg0) {
        class181 var3 = (class181) this.field2831.method3214(arg0);
        if (var3 != null) {
            var3.method3309();
            var3.method3294();
            this.field2828++;
        }
    }

    @ObfuscatedName("fq.y(Lfe;J)V")
    public void method3173(class181 arg0, long arg1) {
        if (this.field2828 == 0) {
            class181 var4 = this.field2830.method3280();
            var4.method3309();
            var4.method3294();
            if (this.field2829 == var4) {
                class181 var5 = this.field2830.method3280();
                var5.method3309();
                var5.method3294();
            }
        } else {
            this.field2828--;
        }
        this.field2831.method3208(arg0, arg1);
        this.field2830.method3284(arg0);
    }

    @ObfuscatedName("fq.h()V")
    public void method3170() {
        this.field2830.method3282();
        this.field2831.method3211();
        this.field2829 = new class181();
        this.field2828 = this.field2832;
    }
}
