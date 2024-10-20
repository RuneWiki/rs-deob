package deob;

@ObfuscatedName("jp")
public class class279 extends class219 {

    @ObfuscatedName("jp.q")
    public static class213 field3549 = new class213(64);

    @ObfuscatedName("jp.i")
    public char field3550;

    @ObfuscatedName("jp.a")
    public int field3551;

    @ObfuscatedName("jp.l")
    public String field3548;

    @ObfuscatedName("jp.b")
    public boolean field3553 = true;

    @ObfuscatedName("cd.t(II)Ljp;")
    public static class279 method1768(int arg0) {
        class279 var1 = (class279) field3549.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3552.method4265(11, arg0);
        class279 var3 = new class279();
        if (var2 != null) {
            var3.method4517(new class195(var2));
        }
        var3.method4498();
        field3549.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.q(I)V")
    public void method4498() {
    }

    @ObfuscatedName("jp.i(Lgb;B)V")
    public void method4517(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4501(arg0, var2);
        }
    }

    @ObfuscatedName("jp.a(Lgb;II)V")
    public void method4501(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3550 = class315.method3157(arg0.method3237());
        } else if (arg1 == 2) {
            this.field3551 = arg0.method3241();
        } else if (arg1 == 4) {
            this.field3553 = false;
        } else if (arg1 == 5) {
            this.field3548 = arg0.method3257();
        }
    }

    @ObfuscatedName("jp.l(B)Z")
    public boolean method4502() {
        return this.field3550 == 's';
    }
}
