package deob;

@ObfuscatedName("iz")
public final class class256 {

    @ObfuscatedName("iz.s")
    public class406 field2901 = new class406();

    @ObfuscatedName("iz.h")
    public int field2899;

    @ObfuscatedName("iz.w")
    public int field2900;

    @ObfuscatedName("iz.v")
    public class420 field2898;

    @ObfuscatedName("iz.c")
    public class340 field2902 = new class340();

    public class256(int arg0) {
        this.field2899 = arg0;
        this.field2900 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2898 = new class420(var2);
    }

    @ObfuscatedName("iz.s(J)Loa;")
    public class406 method4599(long arg0) {
        class406 var3 = (class406) this.field2898.method6668(arg0);
        if (var3 != null) {
            this.field2902.method5569(var3);
        }
        return var3;
    }

    @ObfuscatedName("iz.h(J)V")
    public void method4608(long arg0) {
        class406 var3 = (class406) this.field2898.method6668(arg0);
        if (var3 != null) {
            var3.method6409();
            var3.method6406();
            this.field2900++;
        }
    }

    @ObfuscatedName("iz.w(Loa;J)V")
    public void method4600(class406 arg0, long arg1) {
        if (this.field2900 == 0) {
            class406 var4 = this.field2902.method5586();
            var4.method6409();
            var4.method6406();
            if (this.field2901 == var4) {
                class406 var5 = this.field2902.method5586();
                var5.method6409();
                var5.method6406();
            }
        } else {
            this.field2900--;
        }
        this.field2898.method6673(arg0, arg1);
        this.field2902.method5569(arg0);
    }

    @ObfuscatedName("iz.v()V")
    public void method4603() {
        this.field2902.method5568();
        this.field2898.method6670();
        this.field2901 = new class406();
        this.field2900 = this.field2899;
    }
}
