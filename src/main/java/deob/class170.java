package deob;

@ObfuscatedName("au")
public class class170 extends class7 {

    @ObfuscatedName("au.g")
    public String[] field2581;

    @ObfuscatedName("au.d")
    public int[] field2579;

    @ObfuscatedName("au.b")
    public int field2573;

    @ObfuscatedName("au.c")
    public static class75 field2587 = new class75(64);

    @ObfuscatedName("au.m")
    public String field2574 = "null";

    @ObfuscatedName("au.j")
    public int[] field2580;

    @ObfuscatedName("au.i")
    public char field2575;

    @ObfuscatedName("au.z")
    public int field2583;

    @ObfuscatedName("au.x")
    public int field2578 = 0;

    @ObfuscatedName("au.c(Ldv;B)V")
    public void method3049(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3050(arg0, var2);
        }
    }

    @ObfuscatedName("au.b(Ldv;II)V")
    public void method3050(class28 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2573 = arg0.method450();
        } else if (arg1 == 2) {
            this.field2575 = (char) arg0.method450();
        } else if (arg1 == 3) {
            this.field2574 = arg0.method451();
        } else if (arg1 == 4) {
            this.field2583 = arg0.method504();
        } else if (arg1 == 5) {
            this.field2578 = arg0.method349();
            this.field2579 = new int[this.field2578];
            this.field2581 = new String[this.field2578];
            for (int var3 = 0; var3 < this.field2578; var3++) {
                this.field2579[var3] = arg0.method504();
                this.field2581[var3] = arg0.method451();
            }
        } else if (arg1 == 6) {
            this.field2578 = arg0.method349();
            this.field2579 = new int[this.field2578];
            this.field2580 = new int[this.field2578];
            for (int var4 = 0; var4 < this.field2578; var4++) {
                this.field2579[var4] = arg0.method504();
                this.field2580[var4] = arg0.method504();
            }
        }
    }

    @ObfuscatedName("ae.v(IB)Lau;")
    public static class170 method3474(int arg0) {
        class170 var1 = (class170) field2587.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2584.method1298(8, arg0);
        class170 var3 = new class170();
        if (var2 != null) {
            var3.method3049(new class28(var2));
        }
        field2587.method1184(var3, (long) arg0);
        return var3;
    }
}
