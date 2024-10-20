package deob;

@ObfuscatedName("ik")
public class class252 extends class195 {

    @ObfuscatedName("ik.s")
    public static class190 field3388 = new class190(64);

    @ObfuscatedName("ik.q")
    public char field3385;

    @ObfuscatedName("ik.o")
    public int field3387;

    @ObfuscatedName("ik.g")
    public String field3389;

    @ObfuscatedName("ik.v")
    public boolean field3390 = true;

    @ObfuscatedName("q.w(Lip;I)V")
    public static void method5(class236 arg0) {
        Statics.field3386 = arg0;
    }

    @ObfuscatedName("gr.s(II)Lik;")
    public static class252 method3272(int arg0) {
        class252 var1 = (class252) field3388.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3386.method3876(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4178(new class174(var2));
        }
        var3.method4177();
        field3388.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.q(I)V")
    public void method4177() {
    }

    @ObfuscatedName("ik.o(Lfz;I)V")
    public void method4178(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4179(arg0, var2);
        }
    }

    @ObfuscatedName("ik.g(Lfz;II)V")
    public void method4179(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3385 = class267.method1743(arg0.method2972());
        } else if (arg1 == 2) {
            this.field3387 = arg0.method3131();
        } else if (arg1 == 4) {
            this.field3390 = false;
        } else if (arg1 == 5) {
            this.field3389 = arg0.method3111();
        }
    }

    @ObfuscatedName("ik.v(I)Z")
    public boolean method4180() {
        return this.field3385 == 's';
    }

    @ObfuscatedName("hp.p(I)V")
    public static void method3844() {
        field3388.method3361();
    }
}
