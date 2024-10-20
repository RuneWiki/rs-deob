package deob;

@ObfuscatedName("ag")
public class class49 extends class204 {

    @ObfuscatedName("ag.p")
    public static class193 field1081 = new class193(64);

    @ObfuscatedName("ag.v")
    public char field1084;

    @ObfuscatedName("ag.l")
    public char field1083;

    @ObfuscatedName("ag.y")
    public String field1090 = "null";

    @ObfuscatedName("ag.w")
    public int field1086;

    @ObfuscatedName("ag.u")
    public int field1080 = 0;

    @ObfuscatedName("ag.a")
    public int[] field1087;

    @ObfuscatedName("ag.e")
    public int[] field1088;

    @ObfuscatedName("ag.b")
    public String[] field1089;

    @ObfuscatedName("j.d(Lfn;B)V")
    public static void method181(class167 arg0) {
        Statics.field1082 = arg0;
    }

    @ObfuscatedName("ac.p(IB)Lag;")
    public static class49 method813(int arg0) {
        class49 var1 = (class49) field1081.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1082.method3134(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method973(new class119(var2));
        }
        field1081.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.v(Ldf;B)V")
    public void method973(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method979(arg0, var2);
        }
    }

    @ObfuscatedName("ag.l(Ldf;II)V")
    public void method979(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1084 = (char) arg0.method2357();
        } else if (arg1 == 2) {
            this.field1083 = (char) arg0.method2357();
        } else if (arg1 == 3) {
            this.field1090 = arg0.method2365();
        } else if (arg1 == 4) {
            this.field1086 = arg0.method2362();
        } else if (arg1 == 5) {
            this.field1080 = arg0.method2359();
            this.field1087 = new int[this.field1080];
            this.field1089 = new String[this.field1080];
            for (int var3 = 0; var3 < this.field1080; var3++) {
                this.field1087[var3] = arg0.method2362();
                this.field1089[var3] = arg0.method2365();
            }
        } else if (arg1 == 6) {
            this.field1080 = arg0.method2359();
            this.field1087 = new int[this.field1080];
            this.field1088 = new int[this.field1080];
            for (int var4 = 0; var4 < this.field1080; var4++) {
                this.field1087[var4] = arg0.method2362();
                this.field1088[var4] = arg0.method2362();
            }
        }
    }
}
