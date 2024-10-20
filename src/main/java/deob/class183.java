package deob;

@ObfuscatedName("gl")
public final class class183 {

    @ObfuscatedName("gl.q")
    public class194 field2924 = new class194();

    @ObfuscatedName("gl.s")
    public int field2921;

    @ObfuscatedName("gl.h")
    public int field2922;

    @ObfuscatedName("gl.e")
    public class186 field2923;

    @ObfuscatedName("gl.n")
    public class193 field2925 = new class193();

    public class183(int arg0) {
        this.field2921 = arg0;
        this.field2922 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2923 = new class186(var2);
    }

    @ObfuscatedName("gl.q(J)Lgb;")
    public class194 method3243(long arg0) {
        class194 var3 = (class194) this.field2923.method3273(arg0);
        if (var3 != null) {
            this.field2925.method3366(var3);
        }
        return var3;
    }

    @ObfuscatedName("gl.s(J)V")
    public void method3244(long arg0) {
        class194 var3 = (class194) this.field2923.method3273(arg0);
        if (var3 != null) {
            var3.method3404();
            var3.method3386();
            this.field2922++;
        }
    }

    @ObfuscatedName("gl.h(Lgb;J)V")
    public void method3253(class194 arg0, long arg1) {
        if (this.field2922 == 0) {
            class194 var4 = this.field2925.method3372();
            var4.method3404();
            var4.method3386();
            if (this.field2924 == var4) {
                class194 var5 = this.field2925.method3372();
                var5.method3404();
                var5.method3386();
            }
        } else {
            this.field2922--;
        }
        this.field2923.method3274(arg0, arg1);
        this.field2925.method3366(arg0);
    }

    @ObfuscatedName("gl.e()V")
    public void method3246() {
        this.field2925.method3370();
        this.field2923.method3275();
        this.field2924 = new class194();
        this.field2922 = this.field2921;
    }
}
