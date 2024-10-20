package deob;

@ObfuscatedName("hj")
public final class class213 {

    @ObfuscatedName("hj.c")
    public class219 field2629 = new class219();

    @ObfuscatedName("hj.i")
    public int field2628;

    @ObfuscatedName("hj.o")
    public int field2630;

    @ObfuscatedName("hj.j")
    public class215 field2631;

    @ObfuscatedName("hj.k")
    public class207 field2627 = new class207();

    public class213(int arg0) {
        this.field2628 = arg0;
        this.field2630 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2631 = new class215(var2);
    }

    @ObfuscatedName("hj.c(J)Lhv;")
    public class219 method3625(long arg0) {
        class219 var3 = (class219) this.field2631.method3677(arg0);
        if (var3 != null) {
            this.field2627.method3587(var3);
        }
        return var3;
    }

    @ObfuscatedName("hj.i(J)V")
    public void method3627(long arg0) {
        class219 var3 = (class219) this.field2631.method3677(arg0);
        if (var3 != null) {
            var3.method3710();
            var3.method3747();
            this.field2630++;
        }
    }

    @ObfuscatedName("hj.o(Lhv;J)V")
    public void method3628(class219 arg0, long arg1) {
        if (this.field2630 == 0) {
            class219 var4 = this.field2627.method3576();
            var4.method3710();
            var4.method3747();
            if (this.field2629 == var4) {
                class219 var5 = this.field2627.method3576();
                var5.method3710();
                var5.method3747();
            }
        } else {
            this.field2630--;
        }
        this.field2631.method3668(arg0, arg1);
        this.field2627.method3587(arg0);
    }

    @ObfuscatedName("hj.j()V")
    public void method3629() {
        this.field2627.method3578();
        this.field2631.method3659();
        this.field2629 = new class219();
        this.field2630 = this.field2628;
    }
}
