package deob;

@ObfuscatedName("ic")
public class class254 extends class195 {

    @ObfuscatedName("ic.q")
    public static class190 field3377 = new class190(64);

    @ObfuscatedName("ic.x")
    public char field3378;

    @ObfuscatedName("ic.y")
    public char field3388;

    @ObfuscatedName("ic.e")
    public String field3380 = "null";

    @ObfuscatedName("ic.f")
    public int field3381;

    @ObfuscatedName("ic.v")
    public int field3382 = 0;

    @ObfuscatedName("ic.t")
    public int[] field3383;

    @ObfuscatedName("ic.i")
    public int[] field3384;

    @ObfuscatedName("ic.r")
    public String[] field3387;

    @ObfuscatedName("hw.d(II)Lic;")
    public static class254 method3740(int arg0) {
        class254 var1 = (class254) field3377.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3376.method3750(8, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4068(new class174(var2));
        }
        field3377.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.q(Lfw;B)V")
    public void method4068(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4069(arg0, var2);
        }
    }

    @ObfuscatedName("ic.x(Lfw;II)V")
    public void method4069(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3378 = (char) arg0.method2921();
        } else if (arg1 == 2) {
            this.field3388 = (char) arg0.method2921();
        } else if (arg1 == 3) {
            this.field3380 = arg0.method2922();
        } else if (arg1 == 4) {
            this.field3381 = arg0.method2935();
        } else if (arg1 == 5) {
            this.field3382 = arg0.method2916();
            this.field3383 = new int[this.field3382];
            this.field3387 = new String[this.field3382];
            for (int var3 = 0; var3 < this.field3382; var3++) {
                this.field3383[var3] = arg0.method2935();
                this.field3387[var3] = arg0.method2922();
            }
        } else if (arg1 == 6) {
            this.field3382 = arg0.method2916();
            this.field3383 = new int[this.field3382];
            this.field3384 = new int[this.field3382];
            for (int var4 = 0; var4 < this.field3382; var4++) {
                this.field3383[var4] = arg0.method2935();
                this.field3384[var4] = arg0.method2935();
            }
        }
    }
}
