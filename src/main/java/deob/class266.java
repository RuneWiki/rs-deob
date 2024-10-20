package deob;

@ObfuscatedName("jx")
public final class class266 {

    @ObfuscatedName("jx.a")
    public class425 field2980 = new class425();

    @ObfuscatedName("jx.f")
    public int field2979;

    @ObfuscatedName("jx.c")
    public int field2981;

    @ObfuscatedName("jx.x")
    public class440 field2982;

    @ObfuscatedName("jx.h")
    public class354 field2983 = new class354();

    public class266(int arg0) {
        this.field2979 = arg0;
        this.field2981 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2982 = new class440(var2);
    }

    @ObfuscatedName("jx.a(J)Lpu;")
    public class425 method4839(long arg0) {
        class425 var3 = (class425) this.field2982.method7455(arg0);
        if (var3 != null) {
            this.field2983.method6180(var3);
        }
        return var3;
    }

    @ObfuscatedName("jx.f(J)V")
    public void method4841(long arg0) {
        class425 var3 = (class425) this.field2982.method7455(arg0);
        if (var3 != null) {
            var3.method7170();
            var3.method7169();
            this.field2981++;
        }
    }

    @ObfuscatedName("jx.c(Lpu;J)V")
    public void method4834(class425 arg0, long arg1) {
        if (this.field2981 == 0) {
            class425 var4 = this.field2983.method6169();
            var4.method7170();
            var4.method7169();
            if (this.field2980 == var4) {
                class425 var5 = this.field2983.method6169();
                var5.method7170();
                var5.method7169();
            }
        } else {
            this.field2981--;
        }
        this.field2982.method7448(arg0, arg1);
        this.field2983.method6180(arg0);
    }

    @ObfuscatedName("jx.x()V")
    public void method4837() {
        this.field2983.method6178();
        this.field2982.method7449();
        this.field2980 = new class425();
        this.field2981 = this.field2979;
    }
}
