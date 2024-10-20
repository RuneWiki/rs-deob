package deob;

@ObfuscatedName("jy")
public class class280 extends class219 {

    @ObfuscatedName("jy.k")
    public static class213 field3554 = new class213(64);

    @ObfuscatedName("jy.t")
    public class210 field3555;

    @ObfuscatedName("i.o(Ljf;B)V")
    public static void method28(class262 arg0) {
        Statics.field3553 = arg0;
    }

    @ObfuscatedName("hq.k(II)Ljy;")
    public static class280 method3786(int arg0) {
        class280 var1 = (class280) field3554.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3553.method4241(34, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method4551(new class195(var2));
        }
        var3.method4539();
        field3554.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.t(B)V")
    public void method4539() {
    }

    @ObfuscatedName("jy.d(Lgc;I)V")
    public void method4551(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4537(arg0, var2);
        }
    }

    @ObfuscatedName("jy.h(Lgc;II)V")
    public void method4537(class195 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3555 = class277.method241(arg0, this.field3555);
        }
    }

    @ObfuscatedName("jy.m(IIB)I")
    public int method4538(int arg0, int arg1) {
        class210 var3 = this.field3555;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class224 var5 = (class224) var3.method3575((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2669;
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4546(int arg0, String arg1) {
        return class277.method271(this.field3555, arg0, arg1);
    }
}
