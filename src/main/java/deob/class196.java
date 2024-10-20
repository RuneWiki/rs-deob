package deob;

@ObfuscatedName("gs")
public class class196 extends class130 {

    @ObfuscatedName("gs.x")
    public static class125 field2841 = new class125(64);

    @ObfuscatedName("gs.i")
    public char field2849;

    @ObfuscatedName("gs.a")
    public char field2843;

    @ObfuscatedName("gs.f")
    public String field2844 = "null";

    @ObfuscatedName("gs.c")
    public int field2845;

    @ObfuscatedName("gs.d")
    public int field2846 = 0;

    @ObfuscatedName("gs.l")
    public int[] field2847;

    @ObfuscatedName("gs.g")
    public int[] field2840;

    @ObfuscatedName("gs.z")
    public String[] field2842;

    @ObfuscatedName("ed.u(II)Lgs;")
    public static class196 method2434(int arg0) {
        class196 var1 = (class196) field2841.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2848.method3071(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3339(new class154(var2));
        }
        field2841.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.x(Len;I)V")
    public void method3339(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3343(arg0, var2);
        }
    }

    @ObfuscatedName("gs.i(Len;IB)V")
    public void method3343(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2849 = (char) arg0.method2708();
        } else if (arg1 == 2) {
            this.field2843 = (char) arg0.method2708();
        } else if (arg1 == 3) {
            this.field2844 = arg0.method2778();
        } else if (arg1 == 4) {
            this.field2845 = arg0.method2593();
        } else if (arg1 == 5) {
            this.field2846 = arg0.method2581();
            this.field2847 = new int[this.field2846];
            this.field2842 = new String[this.field2846];
            for (int var3 = 0; var3 < this.field2846; var3++) {
                this.field2847[var3] = arg0.method2593();
                this.field2842[var3] = arg0.method2778();
            }
        } else if (arg1 == 6) {
            this.field2846 = arg0.method2581();
            this.field2847 = new int[this.field2846];
            this.field2840 = new int[this.field2846];
            for (int var4 = 0; var4 < this.field2846; var4++) {
                this.field2847[var4] = arg0.method2593();
                this.field2840[var4] = arg0.method2593();
            }
        }
    }
}
