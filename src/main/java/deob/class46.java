package deob;

@ObfuscatedName("as")
public class class46 extends class198 {

    @ObfuscatedName("as.y")
    public static class187 field1041 = new class187(64);

    @ObfuscatedName("as.z")
    public int field1042;

    @ObfuscatedName("as.l")
    public int field1045;

    @ObfuscatedName("as.w")
    public int field1043;

    @ObfuscatedName("g.j(II)Las;")
    public static class46 method177(int arg0) {
        class46 var1 = (class46) field1041.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1040.method2995(14, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method966(new class114(var2));
        }
        field1041.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.y(Lde;I)V")
    public void method966(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method974(arg0, var2);
        }
    }

    @ObfuscatedName("as.z(Lde;II)V")
    public void method974(class114 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1042 = arg0.method2324();
            this.field1045 = arg0.method2322();
            this.field1043 = arg0.method2322();
        }
    }

    @ObfuscatedName("ch.l(B)V")
    public static void method1975() {
        field1041.method3435();
    }
}
