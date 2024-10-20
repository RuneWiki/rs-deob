package deob;

@ObfuscatedName("gp")
public final class class191 {

    @ObfuscatedName("gp.i")
    public class196 field2463 = new class196();

    @ObfuscatedName("gp.j")
    public int field2462;

    @ObfuscatedName("gp.a")
    public int field2461;

    @ObfuscatedName("gp.r")
    public class192 field2464;

    @ObfuscatedName("gp.o")
    public class186 field2465 = new class186();

    public class191(int arg0) {
        this.field2462 = arg0;
        this.field2461 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2464 = new class192(var2);
    }

    @ObfuscatedName("gp.i(J)Lgo;")
    public class196 method3347(long arg0) {
        class196 var3 = (class196) this.field2464.method3358(arg0);
        if (var3 != null) {
            this.field2465.method3308(var3);
        }
        return var3;
    }

    @ObfuscatedName("gp.j(J)V")
    public void method3348(long arg0) {
        class196 var3 = (class196) this.field2464.method3358(arg0);
        if (var3 != null) {
            var3.method3397();
            var3.method3445();
            this.field2461++;
        }
    }

    @ObfuscatedName("gp.a(Lgo;J)V")
    public void method3346(class196 arg0, long arg1) {
        if (this.field2461 == 0) {
            class196 var4 = this.field2465.method3304();
            var4.method3397();
            var4.method3445();
            if (this.field2463 == var4) {
                class196 var5 = this.field2465.method3304();
                var5.method3397();
                var5.method3445();
            }
        } else {
            this.field2461--;
        }
        this.field2464.method3359(arg0, arg1);
        this.field2465.method3308(arg0);
    }

    @ObfuscatedName("gp.r()V")
    public void method3355() {
        this.field2465.method3306();
        this.field2464.method3360();
        this.field2463 = new class196();
        this.field2461 = this.field2462;
    }
}
