package deob;

@ObfuscatedName("az")
public class class49 extends class204 {

    @ObfuscatedName("az.b")
    public static class193 field1078 = new class193(64);

    @ObfuscatedName("az.w")
    public char field1079;

    @ObfuscatedName("az.d")
    public char field1084;

    @ObfuscatedName("az.z")
    public String field1081 = "null";

    @ObfuscatedName("az.l")
    public int field1082;

    @ObfuscatedName("az.m")
    public int field1083 = 0;

    @ObfuscatedName("az.p")
    public int[] field1089;

    @ObfuscatedName("az.u")
    public int[] field1085;

    @ObfuscatedName("az.c")
    public String[] field1086;

    @ObfuscatedName("dt.g(Lfc;I)V")
    public static void method2674(class167 arg0) {
        Statics.field1087 = arg0;
    }

    @ObfuscatedName("r.b(II)Laz;")
    public static class49 method188(int arg0) {
        class49 var1 = (class49) field1078.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1087.method3112(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method1005(new class119(var2));
        }
        field1078.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.w(Ldm;I)V")
    public void method1005(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method1003(arg0, var2);
        }
    }

    @ObfuscatedName("az.d(Ldm;II)V")
    public void method1003(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1079 = (char) arg0.method2362();
        } else if (arg1 == 2) {
            this.field1084 = (char) arg0.method2362();
        } else if (arg1 == 3) {
            this.field1081 = arg0.method2370();
        } else if (arg1 == 4) {
            this.field1082 = arg0.method2367();
        } else if (arg1 == 5) {
            this.field1083 = arg0.method2376();
            this.field1089 = new int[this.field1083];
            this.field1086 = new String[this.field1083];
            for (int var3 = 0; var3 < this.field1083; var3++) {
                this.field1089[var3] = arg0.method2367();
                this.field1086[var3] = arg0.method2370();
            }
        } else if (arg1 == 6) {
            this.field1083 = arg0.method2376();
            this.field1089 = new int[this.field1083];
            this.field1085 = new int[this.field1083];
            for (int var4 = 0; var4 < this.field1083; var4++) {
                this.field1089[var4] = arg0.method2367();
                this.field1085[var4] = arg0.method2367();
            }
        }
    }
}
