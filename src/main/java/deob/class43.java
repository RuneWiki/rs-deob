package deob;

@ObfuscatedName("am")
public class class43 extends class181 {

    @ObfuscatedName("am.z")
    public static class171 field997 = new class171(64);

    @ObfuscatedName("am.y")
    public char field984;

    @ObfuscatedName("am.h")
    public char field987;

    @ObfuscatedName("am.r")
    public String field988 = "null";

    @ObfuscatedName("am.e")
    public int field998;

    @ObfuscatedName("am.k")
    public int field990 = 0;

    @ObfuscatedName("am.b")
    public int[] field991;

    @ObfuscatedName("am.n")
    public int[] field992;

    @ObfuscatedName("am.a")
    public String[] field993;

    @ObfuscatedName("bl.j(II)Lam;")
    public static class43 method1363(int arg0) {
        class43 var1 = (class43) field997.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field989.method2739(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method804(new class107(var2));
        }
        field997.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.z(Lde;I)V")
    public void method804(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method805(arg0, var2);
        }
    }

    @ObfuscatedName("am.y(Lde;IB)V")
    public void method805(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field984 = (char) arg0.method2130();
        } else if (arg1 == 2) {
            this.field987 = (char) arg0.method2130();
        } else if (arg1 == 3) {
            this.field988 = arg0.method2138();
        } else if (arg1 == 4) {
            this.field998 = arg0.method2135();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2132();
            this.field991 = new int[this.field990];
            this.field993 = new String[this.field990];
            for (int var3 = 0; var3 < this.field990; var3++) {
                this.field991[var3] = arg0.method2135();
                this.field993[var3] = arg0.method2138();
            }
        } else if (arg1 == 6) {
            this.field990 = arg0.method2132();
            this.field991 = new int[this.field990];
            this.field992 = new int[this.field990];
            for (int var4 = 0; var4 < this.field990; var4++) {
                this.field991[var4] = arg0.method2135();
                this.field992[var4] = arg0.method2135();
            }
        }
    }
}
