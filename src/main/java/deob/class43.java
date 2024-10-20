package deob;

@ObfuscatedName("aw")
public class class43 extends class181 {

    @ObfuscatedName("aw.u")
    public static class171 field990 = new class171(64);

    @ObfuscatedName("aw.x")
    public char field991;

    @ObfuscatedName("aw.j")
    public char field992;

    @ObfuscatedName("aw.o")
    public String field993 = "null";

    @ObfuscatedName("aw.n")
    public int field995;

    @ObfuscatedName("aw.y")
    public int field998 = 0;

    @ObfuscatedName("aw.f")
    public int[] field996;

    @ObfuscatedName("aw.p")
    public int[] field997;

    @ObfuscatedName("aw.l")
    public String[] field994;

    @ObfuscatedName("cb.b(II)Law;")
    public static class43 method2070(int arg0) {
        class43 var1 = (class43) field990.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2033.method2692(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method811(new class107(var2));
        }
        field990.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.u(Ldh;I)V")
    public void method811(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method810(arg0, var2);
        }
    }

    @ObfuscatedName("aw.x(Ldh;II)V")
    public void method810(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field991 = (char) arg0.method2134();
        } else if (arg1 == 2) {
            this.field992 = (char) arg0.method2134();
        } else if (arg1 == 3) {
            this.field993 = arg0.method2339();
        } else if (arg1 == 4) {
            this.field995 = arg0.method2139();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2136();
            this.field996 = new int[this.field998];
            this.field994 = new String[this.field998];
            for (int var3 = 0; var3 < this.field998; var3++) {
                this.field996[var3] = arg0.method2139();
                this.field994[var3] = arg0.method2339();
            }
        } else if (arg1 == 6) {
            this.field998 = arg0.method2136();
            this.field996 = new int[this.field998];
            this.field997 = new int[this.field998];
            for (int var4 = 0; var4 < this.field998; var4++) {
                this.field996[var4] = arg0.method2139();
                this.field997[var4] = arg0.method2139();
            }
        }
    }
}
