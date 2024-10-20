package deob;

@ObfuscatedName("fl")
public final class class171 {

    @ObfuscatedName("fl.t")
    public class182 field2828 = new class182();

    @ObfuscatedName("fl.o")
    public int field2829;

    @ObfuscatedName("fl.i")
    public int field2830;

    @ObfuscatedName("fl.p")
    public class174 field2831;

    @ObfuscatedName("fl.c")
    public class181 field2832 = new class181();

    public class171(int arg0) {
        this.field2829 = arg0;
        this.field2830 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2831 = new class174(var2);
    }

    @ObfuscatedName("fl.t(J)Lfi;")
    public class182 method3099(long arg0) {
        class182 var3 = (class182) this.field2831.method3138(arg0);
        if (var3 != null) {
            this.field2832.method3224(var3);
        }
        return var3;
    }

    @ObfuscatedName("fl.o(J)V")
    public void method3106(long arg0) {
        class182 var3 = (class182) this.field2831.method3138(arg0);
        if (var3 != null) {
            var3.method3261();
            var3.method3242();
            this.field2830++;
        }
    }

    @ObfuscatedName("fl.i(Lfi;J)V")
    public void method3101(class182 arg0, long arg1) {
        if (this.field2830 == 0) {
            class182 var4 = this.field2832.method3226();
            var4.method3261();
            var4.method3242();
            if (this.field2828 == var4) {
                class182 var5 = this.field2832.method3226();
                var5.method3261();
                var5.method3242();
            }
        } else {
            this.field2830--;
        }
        this.field2831.method3132(arg0, arg1);
        this.field2832.method3224(arg0);
    }

    @ObfuscatedName("fl.p()V")
    public void method3104() {
        this.field2832.method3228();
        this.field2831.method3130();
        this.field2828 = new class182();
        this.field2830 = this.field2829;
    }
}
