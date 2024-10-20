package deob;

@ObfuscatedName("it")
public class class252 extends class195 {

    @ObfuscatedName("it.h")
    public static class190 field3383 = new class190(64);

    @ObfuscatedName("it.u")
    public char field3384;

    @ObfuscatedName("it.q")
    public int field3382;

    @ObfuscatedName("it.g")
    public String field3386;

    @ObfuscatedName("it.v")
    public boolean field3385 = true;

    @ObfuscatedName("bp.i(IB)Lit;")
    public static class252 method699(int arg0) {
        class252 var1 = (class252) field3383.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3387.method3836(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4137(new class174(var2));
        }
        var3.method4147();
        field3383.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.h(I)V")
    public void method4147() {
    }

    @ObfuscatedName("it.u(Lfv;B)V")
    public void method4137(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4141(arg0, var2);
        }
    }

    @ObfuscatedName("it.q(Lfv;IB)V")
    public void method4141(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3384 = class267.method3671(arg0.method2931());
        } else if (arg1 == 2) {
            this.field3382 = arg0.method2927();
        } else if (arg1 == 4) {
            this.field3385 = false;
        } else if (arg1 == 5) {
            this.field3386 = arg0.method2938();
        }
    }

    @ObfuscatedName("it.g(I)Z")
    public boolean method4139() {
        return this.field3384 == 's';
    }
}
