package deob;

@ObfuscatedName("ak")
public class class44 extends class187 {

    @ObfuscatedName("ak.t")
    public static class176 field992 = new class176(64);

    @ObfuscatedName("ak.f")
    public char field987;

    @ObfuscatedName("ak.j")
    public char field988;

    @ObfuscatedName("ak.l")
    public String field985 = "null";

    @ObfuscatedName("ak.g")
    public int field989;

    @ObfuscatedName("ak.k")
    public int field991 = 0;

    @ObfuscatedName("ak.p")
    public int[] field986;

    @ObfuscatedName("ak.y")
    public int[] field993;

    @ObfuscatedName("ak.m")
    public String[] field994;

    @ObfuscatedName("u.v(II)Lak;")
    public static class44 method527(int arg0) {
        class44 var1 = (class44) field992.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method2852(8, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method834(new class110(var2));
        }
        field992.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.t(Ldp;I)V")
    public void method834(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method835(arg0, var2);
        }
    }

    @ObfuscatedName("ak.f(Ldp;II)V")
    public void method835(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field987 = (char) arg0.method2257();
        } else if (arg1 == 2) {
            this.field988 = (char) arg0.method2257();
        } else if (arg1 == 3) {
            this.field985 = arg0.method2159();
        } else if (arg1 == 4) {
            this.field989 = arg0.method2297();
        } else if (arg1 == 5) {
            this.field991 = arg0.method2194();
            this.field986 = new int[this.field991];
            this.field994 = new String[this.field991];
            for (int var3 = 0; var3 < this.field991; var3++) {
                this.field986[var3] = arg0.method2297();
                this.field994[var3] = arg0.method2159();
            }
        } else if (arg1 == 6) {
            this.field991 = arg0.method2194();
            this.field986 = new int[this.field991];
            this.field993 = new int[this.field991];
            for (int var4 = 0; var4 < this.field991; var4++) {
                this.field986[var4] = arg0.method2297();
                this.field993[var4] = arg0.method2297();
            }
        }
    }
}
