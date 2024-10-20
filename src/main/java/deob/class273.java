package deob;

@ObfuscatedName("jy")
public class class273 extends class215 {

    @ObfuscatedName("jy.q")
    public static class210 field3481 = new class210(64);

    @ObfuscatedName("jy.o")
    public class207 field3483;

    @ObfuscatedName("ej.b(Lie;B)V")
    public static void method2836(class256 arg0) {
        Statics.field3482 = arg0;
    }

    @ObfuscatedName("jy.q(I)V")
    public void method4499() {
    }

    @ObfuscatedName("jy.o(Lgn;B)V")
    public void method4487(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4486(arg0, var2);
        }
    }

    @ObfuscatedName("jy.p(Lgn;II)V")
    public void method4486(class194 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3483 = class270.method2485(arg0, this.field3483);
        }
    }

    @ObfuscatedName("jy.a(III)I")
    public int method4489(int arg0, int arg1) {
        class207 var3 = this.field3483;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3632((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2626;
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4490(int arg0, String arg1) {
        return class270.method941(this.field3483, arg0, arg1);
    }
}
