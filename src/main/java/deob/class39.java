package deob;

@ObfuscatedName("ac")
public class class39 extends class174 {

    @ObfuscatedName("ac.l")
    public static class170 field987 = new class170(64);

    @ObfuscatedName("ac.c")
    public int field988;

    @ObfuscatedName("ac.d")
    public char field989;

    @ObfuscatedName("ac.b")
    public String field1001 = "null";

    @ObfuscatedName("ac.i")
    public int field990;

    @ObfuscatedName("ac.p")
    public int field992 = 0;

    @ObfuscatedName("ac.y")
    public int[] field1003;

    @ObfuscatedName("ac.u")
    public int[] field994;

    @ObfuscatedName("ac.z")
    public String[] field995;

    @ObfuscatedName("fv.t(Lev;I)V")
    public static void method3369(class152 arg0) {
        Statics.field1005 = arg0;
    }

    @ObfuscatedName("db.l(II)Lac;")
    public static class39 method2228(int arg0) {
        class39 var1 = (class39) field987.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1005.method2987(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method843(new class127(var2));
        }
        field987.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.c(Ldo;I)V")
    public void method843(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method844(arg0, var2);
        }
    }

    @ObfuscatedName("ac.d(Ldo;IB)V")
    public void method844(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field988 = arg0.method2438();
        } else if (arg1 == 2) {
            this.field989 = (char) arg0.method2438();
        } else if (arg1 == 3) {
            this.field1001 = arg0.method2627();
        } else if (arg1 == 4) {
            this.field990 = arg0.method2448();
        } else if (arg1 == 5) {
            this.field992 = arg0.method2440();
            this.field1003 = new int[this.field992];
            this.field995 = new String[this.field992];
            for (int var3 = 0; var3 < this.field992; var3++) {
                this.field1003[var3] = arg0.method2448();
                this.field995[var3] = arg0.method2627();
            }
        } else if (arg1 == 6) {
            this.field992 = arg0.method2440();
            this.field1003 = new int[this.field992];
            this.field994 = new int[this.field992];
            for (int var4 = 0; var4 < this.field992; var4++) {
                this.field1003[var4] = arg0.method2448();
                this.field994[var4] = arg0.method2448();
            }
        }
    }
}
