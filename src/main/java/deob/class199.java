package deob;

@ObfuscatedName("gf")
public final class class199 {

    @ObfuscatedName("gf.f")
    public class346 field2211 = new class346();

    @ObfuscatedName("gf.o")
    public int field2208;

    @ObfuscatedName("gf.u")
    public int field2209;

    @ObfuscatedName("gf.p")
    public class360 field2207;

    @ObfuscatedName("gf.b")
    public class277 field2210 = new class277();

    public class199(int arg0) {
        this.field2208 = arg0;
        this.field2209 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2207 = new class360(var2);
    }

    @ObfuscatedName("gf.f(J)Lmz;")
    public class346 method3398(long arg0) {
        class346 var3 = (class346) this.field2207.method5621(arg0);
        if (var3 != null) {
            this.field2210.method4297(var3);
        }
        return var3;
    }

    @ObfuscatedName("gf.o(J)V")
    public void method3390(long arg0) {
        class346 var3 = (class346) this.field2207.method5621(arg0);
        if (var3 != null) {
            var3.method5354();
            var3.method5349();
            this.field2209++;
        }
    }

    @ObfuscatedName("gf.u(Lmz;J)V")
    public void method3400(class346 arg0, long arg1) {
        if (this.field2209 == 0) {
            class346 var4 = this.field2210.method4299();
            var4.method5354();
            var4.method5349();
            if (this.field2211 == var4) {
                class346 var5 = this.field2210.method4299();
                var5.method5354();
                var5.method5349();
            }
        } else {
            this.field2209--;
        }
        this.field2207.method5630(arg0, arg1);
        this.field2210.method4297(arg0);
    }

    @ObfuscatedName("gf.p()V")
    public void method3392() {
        this.field2210.method4296();
        this.field2207.method5623();
        this.field2211 = new class346();
        this.field2209 = this.field2208;
    }
}
