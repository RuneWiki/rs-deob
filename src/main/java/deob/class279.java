package deob;

@ObfuscatedName("jh")
public class class279 extends class219 {

    @ObfuscatedName("jh.e")
    public static class213 field3546 = new class213(64);

    @ObfuscatedName("jh.b")
    public char field3545;

    @ObfuscatedName("jh.z")
    public int field3547;

    @ObfuscatedName("jh.n")
    public String field3549;

    @ObfuscatedName("jh.l")
    public boolean field3552 = true;

    @ObfuscatedName("bs.g(Ljr;I)V")
    public static void method1064(class262 arg0) {
        Statics.field3550 = arg0;
    }

    @ObfuscatedName("jh.b(I)V")
    public void method4600() {
    }

    @ObfuscatedName("jh.z(Lgg;B)V")
    public void method4601(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4602(arg0, var2);
        }
    }

    @ObfuscatedName("jh.n(Lgg;II)V")
    public void method4602(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3545 = class315.method543(arg0.method3309());
        } else if (arg1 == 2) {
            this.field3547 = arg0.method3472();
        } else if (arg1 == 4) {
            this.field3552 = false;
        } else if (arg1 == 5) {
            this.field3549 = arg0.method3429();
        }
    }

    @ObfuscatedName("jh.l(I)Z")
    public boolean method4603() {
        return this.field3545 == 's';
    }
}
