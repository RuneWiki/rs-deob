package deob;

@ObfuscatedName("jn")
public class class281 extends class219 {

    @ObfuscatedName("jn.z")
    public static class213 field3553 = new class213(64);

    @ObfuscatedName("jn.n")
    public char field3554;

    @ObfuscatedName("jn.r")
    public char field3562;

    @ObfuscatedName("jn.e")
    public String field3555 = class252.field3160;

    @ObfuscatedName("jn.y")
    public int field3561;

    @ObfuscatedName("jn.k")
    public int field3558 = 0;

    @ObfuscatedName("jn.s")
    public int[] field3559;

    @ObfuscatedName("jn.p")
    public int[] field3552;

    @ObfuscatedName("jn.x")
    public String[] field3563;

    @ObfuscatedName("gl.d(IB)Ljn;")
    public static class281 method3169(int arg0) {
        class281 var1 = (class281) field3553.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3557.method4273(8, arg0);
        class281 var3 = new class281();
        if (var2 != null) {
            var3.method4666(new class195(var2));
        }
        field3553.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.z(Lgy;I)V")
    public void method4666(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4660(arg0, var2);
        }
    }

    @ObfuscatedName("jn.n(Lgy;II)V")
    public void method4660(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3554 = (char) arg0.method3330();
        } else if (arg1 == 2) {
            this.field3562 = (char) arg0.method3330();
        } else if (arg1 == 3) {
            this.field3555 = arg0.method3268();
        } else if (arg1 == 4) {
            this.field3561 = arg0.method3264();
        } else if (arg1 == 5) {
            this.field3558 = arg0.method3269();
            this.field3559 = new int[this.field3558];
            this.field3563 = new String[this.field3558];
            for (int var3 = 0; var3 < this.field3558; var3++) {
                this.field3559[var3] = arg0.method3264();
                this.field3563[var3] = arg0.method3268();
            }
        } else if (arg1 == 6) {
            this.field3558 = arg0.method3269();
            this.field3559 = new int[this.field3558];
            this.field3552 = new int[this.field3558];
            for (int var4 = 0; var4 < this.field3558; var4++) {
                this.field3559[var4] = arg0.method3264();
                this.field3552[var4] = arg0.method3264();
            }
        }
    }

    @ObfuscatedName("jn.r(I)I")
    public int method4659() {
        return this.field3558;
    }
}
