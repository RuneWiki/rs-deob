package deob;

@ObfuscatedName("az")
public class class45 extends class195 {

    @ObfuscatedName("az.b")
    public static class184 field998 = new class184(64);

    @ObfuscatedName("az.p")
    public char field1001;

    @ObfuscatedName("az.e")
    public char field1005;

    @ObfuscatedName("az.i")
    public String field997 = "null";

    @ObfuscatedName("az.o")
    public int field996;

    @ObfuscatedName("az.f")
    public int field1002 = 0;

    @ObfuscatedName("az.d")
    public int[] field1003;

    @ObfuscatedName("az.j")
    public int[] field1004;

    @ObfuscatedName("az.x")
    public String[] field1009;

    @ObfuscatedName("aw.t(II)Laz;")
    public static class45 method664(int arg0) {
        class45 var1 = (class45) field998.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field999.method2881(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method911(new class111(var2));
        }
        field998.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.b(Ldc;I)V")
    public void method911(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method915(arg0, var2);
        }
    }

    @ObfuscatedName("az.p(Ldc;IB)V")
    public void method915(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1001 = (char) arg0.method2172();
        } else if (arg1 == 2) {
            this.field1005 = (char) arg0.method2172();
        } else if (arg1 == 3) {
            this.field997 = arg0.method2180();
        } else if (arg1 == 4) {
            this.field996 = arg0.method2177();
        } else if (arg1 == 5) {
            this.field1002 = arg0.method2255();
            this.field1003 = new int[this.field1002];
            this.field1009 = new String[this.field1002];
            for (int var3 = 0; var3 < this.field1002; var3++) {
                this.field1003[var3] = arg0.method2177();
                this.field1009[var3] = arg0.method2180();
            }
        } else if (arg1 == 6) {
            this.field1002 = arg0.method2255();
            this.field1003 = new int[this.field1002];
            this.field1004 = new int[this.field1002];
            for (int var4 = 0; var4 < this.field1002; var4++) {
                this.field1003[var4] = arg0.method2177();
                this.field1004[var4] = arg0.method2177();
            }
        }
    }
}
