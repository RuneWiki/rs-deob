package deob;

@ObfuscatedName("jv")
public class class281 extends class219 {

    @ObfuscatedName("jv.q")
    public static class213 field3560 = new class213(64);

    @ObfuscatedName("jv.i")
    public char field3569;

    @ObfuscatedName("jv.a")
    public char field3562;

    @ObfuscatedName("jv.l")
    public String field3570 = class252.field3052;

    @ObfuscatedName("jv.b")
    public int field3561;

    @ObfuscatedName("jv.e")
    public int field3565 = 0;

    @ObfuscatedName("jv.x")
    public int[] field3566;

    @ObfuscatedName("jv.p")
    public int[] field3567;

    @ObfuscatedName("jv.g")
    public String[] field3568;

    @ObfuscatedName("bl.t(Ljc;I)V")
    public static void method1509(class262 arg0) {
        Statics.field3563 = arg0;
    }

    @ObfuscatedName("kh.q(IB)Ljv;")
    public static class281 method4835(int arg0) {
        class281 var1 = (class281) field3560.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3563.method4265(8, arg0);
        class281 var3 = new class281();
        if (var2 != null) {
            var3.method4549(new class195(var2));
        }
        field3560.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.i(Lgb;B)V")
    public void method4549(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4550(arg0, var2);
        }
    }

    @ObfuscatedName("jv.a(Lgb;II)V")
    public void method4550(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3569 = (char) arg0.method3236();
        } else if (arg1 == 2) {
            this.field3562 = (char) arg0.method3236();
        } else if (arg1 == 3) {
            this.field3570 = arg0.method3257();
        } else if (arg1 == 4) {
            this.field3561 = arg0.method3241();
        } else if (arg1 == 5) {
            this.field3565 = arg0.method3238();
            this.field3566 = new int[this.field3565];
            this.field3568 = new String[this.field3565];
            for (int var3 = 0; var3 < this.field3565; var3++) {
                this.field3566[var3] = arg0.method3241();
                this.field3568[var3] = arg0.method3257();
            }
        } else if (arg1 == 6) {
            this.field3565 = arg0.method3238();
            this.field3566 = new int[this.field3565];
            this.field3567 = new int[this.field3565];
            for (int var4 = 0; var4 < this.field3565; var4++) {
                this.field3566[var4] = arg0.method3241();
                this.field3567[var4] = arg0.method3241();
            }
        }
    }

    @ObfuscatedName("jv.l(B)I")
    public int method4551() {
        return this.field3565;
    }
}
