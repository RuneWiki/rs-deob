package deob;

@ObfuscatedName("ii")
public final class class256 {

    @ObfuscatedName("ii.c")
    public class405 field2897 = new class405();

    @ObfuscatedName("ii.v")
    public int field2894;

    @ObfuscatedName("ii.q")
    public int field2893;

    @ObfuscatedName("ii.f")
    public class419 field2896;

    @ObfuscatedName("ii.j")
    public class339 field2895 = new class339();

    public class256(int arg0) {
        this.field2894 = arg0;
        this.field2893 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2896 = new class419(var2);
    }

    @ObfuscatedName("ii.c(J)Loo;")
    public class405 method4691(long arg0) {
        class405 var3 = (class405) this.field2896.method6756(arg0);
        if (var3 != null) {
            this.field2895.method5655(var3);
        }
        return var3;
    }

    @ObfuscatedName("ii.v(J)V")
    public void method4692(long arg0) {
        class405 var3 = (class405) this.field2896.method6756(arg0);
        if (var3 != null) {
            var3.method6497();
            var3.method6493();
            this.field2893++;
        }
    }

    @ObfuscatedName("ii.q(Loo;J)V")
    public void method4693(class405 arg0, long arg1) {
        if (this.field2893 == 0) {
            class405 var4 = this.field2895.method5671();
            var4.method6497();
            var4.method6493();
            if (this.field2897 == var4) {
                class405 var5 = this.field2895.method5671();
                var5.method6497();
                var5.method6493();
            }
        } else {
            this.field2893--;
        }
        this.field2896.method6754(arg0, arg1);
        this.field2895.method5655(arg0);
    }

    @ObfuscatedName("ii.f()V")
    public void method4695() {
        this.field2895.method5661();
        this.field2896.method6748();
        this.field2897 = new class405();
        this.field2893 = this.field2894;
    }
}
