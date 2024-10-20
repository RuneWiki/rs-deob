package deob;

@ObfuscatedName("gs")
public class class201 extends class151 {

    @ObfuscatedName("gs.c")
    public static class146 field2893 = new class146(64);

    @ObfuscatedName("gs.n")
    public char field2894;

    @ObfuscatedName("gs.q")
    public char field2887;

    @ObfuscatedName("gs.t")
    public String field2888 = "null";

    @ObfuscatedName("gs.p")
    public int field2889;

    @ObfuscatedName("gs.u")
    public int field2886 = 0;

    @ObfuscatedName("gs.z")
    public int[] field2891;

    @ObfuscatedName("gs.l")
    public int[] field2892;

    @ObfuscatedName("gs.v")
    public String[] field2890;

    @ObfuscatedName("fl.d(Lgd;B)V")
    public static void method3068(class185 arg0) {
        Statics.field754 = arg0;
    }

    @ObfuscatedName("dt.c(II)Lgs;")
    public static class201 method1922(int arg0) {
        class201 var1 = (class201) field2893.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field754.method3129(8, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3411(new class130(var2));
        }
        field2893.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.n(Ldu;I)V")
    public void method3411(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3412(arg0, var2);
        }
    }

    @ObfuscatedName("gs.q(Ldu;IB)V")
    public void method3412(class130 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2894 = (char) arg0.method2379();
        } else if (arg1 == 2) {
            this.field2887 = (char) arg0.method2379();
        } else if (arg1 == 3) {
            this.field2888 = arg0.method2314();
        } else if (arg1 == 4) {
            this.field2889 = arg0.method2246();
        } else if (arg1 == 5) {
            this.field2886 = arg0.method2232();
            this.field2891 = new int[this.field2886];
            this.field2890 = new String[this.field2886];
            for (int var3 = 0; var3 < this.field2886; var3++) {
                this.field2891[var3] = arg0.method2246();
                this.field2890[var3] = arg0.method2314();
            }
        } else if (arg1 == 6) {
            this.field2886 = arg0.method2232();
            this.field2891 = new int[this.field2886];
            this.field2892 = new int[this.field2886];
            for (int var4 = 0; var4 < this.field2886; var4++) {
                this.field2891[var4] = arg0.method2246();
                this.field2892[var4] = arg0.method2246();
            }
        }
    }
}
