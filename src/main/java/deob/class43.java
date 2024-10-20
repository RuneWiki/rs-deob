package deob;

@ObfuscatedName("an")
public class class43 extends class181 {

    @ObfuscatedName("an.j")
    public static class171 field963 = new class171(64);

    @ObfuscatedName("an.a")
    public char field964;

    @ObfuscatedName("an.y")
    public char field961;

    @ObfuscatedName("an.i")
    public String field960 = "null";

    @ObfuscatedName("an.b")
    public int field965;

    @ObfuscatedName("an.s")
    public int field966 = 0;

    @ObfuscatedName("an.q")
    public int[] field970;

    @ObfuscatedName("an.p")
    public int[] field968;

    @ObfuscatedName("an.h")
    public String[] field969;

    @ObfuscatedName("ef.z(II)Lan;")
    public static class43 method2687(int arg0) {
        class43 var1 = (class43) field963.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field967.method2705(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method805(new class107(var2));
        }
        field963.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.j(Ldq;I)V")
    public void method805(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method804(arg0, var2);
        }
    }

    @ObfuscatedName("an.a(Ldq;II)V")
    public void method804(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field964 = (char) arg0.method2122();
        } else if (arg1 == 2) {
            this.field961 = (char) arg0.method2122();
        } else if (arg1 == 3) {
            this.field960 = arg0.method2130();
        } else if (arg1 == 4) {
            this.field965 = arg0.method2127();
        } else if (arg1 == 5) {
            this.field966 = arg0.method2239();
            this.field970 = new int[this.field966];
            this.field969 = new String[this.field966];
            for (int var3 = 0; var3 < this.field966; var3++) {
                this.field970[var3] = arg0.method2127();
                this.field969[var3] = arg0.method2130();
            }
        } else if (arg1 == 6) {
            this.field966 = arg0.method2239();
            this.field970 = new int[this.field966];
            this.field968 = new int[this.field966];
            for (int var4 = 0; var4 < this.field966; var4++) {
                this.field970[var4] = arg0.method2127();
                this.field968[var4] = arg0.method2127();
            }
        }
    }
}
