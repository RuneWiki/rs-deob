package deob;

@ObfuscatedName("gl")
public final class class193 {

    @ObfuscatedName("gl.o")
    public class204 field3079 = new class204();

    @ObfuscatedName("gl.e")
    public int field3076;

    @ObfuscatedName("gl.u")
    public int field3077;

    @ObfuscatedName("gl.b")
    public class196 field3075;

    @ObfuscatedName("gl.p")
    public class203 field3078 = new class203();

    public class193(int arg0) {
        this.field3076 = arg0;
        this.field3077 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3075 = new class196(var2);
    }

    @ObfuscatedName("gl.o(J)Lge;")
    public class204 method3510(long arg0) {
        class204 var3 = (class204) this.field3075.method3545(arg0);
        if (var3 != null) {
            this.field3078.method3639(var3);
        }
        return var3;
    }

    @ObfuscatedName("gl.e(J)V")
    public void method3509(long arg0) {
        class204 var3 = (class204) this.field3075.method3545(arg0);
        if (var3 != null) {
            var3.method3670();
            var3.method3645();
            this.field3077++;
        }
    }

    @ObfuscatedName("gl.u(Lge;J)V")
    public void method3512(class204 arg0, long arg1) {
        if (this.field3077 == 0) {
            class204 var4 = this.field3078.method3631();
            var4.method3670();
            var4.method3645();
            if (this.field3079 == var4) {
                class204 var5 = this.field3078.method3631();
                var5.method3670();
                var5.method3645();
            }
        } else {
            this.field3077--;
        }
        this.field3075.method3544(arg0, arg1);
        this.field3078.method3639(arg0);
    }

    @ObfuscatedName("gl.b()V")
    public void method3522() {
        this.field3078.method3632();
        this.field3075.method3552();
        this.field3079 = new class204();
        this.field3077 = this.field3076;
    }
}
