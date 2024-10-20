package deob;

@ObfuscatedName("al")
public class class51 extends class205 {

    @ObfuscatedName("al.g")
    public static class194 field1070 = new class194(64);

    @ObfuscatedName("al.j")
    public int field1073 = 0;

    @ObfuscatedName("fl.b(Lfl;I)V")
    public static void method3104(class168 arg0) {
        Statics.field1071 = arg0;
    }

    @ObfuscatedName("al.j(Lds;I)V")
    public void method989(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method990(arg0, var2);
        }
    }

    @ObfuscatedName("al.d(Lds;II)V")
    public void method990(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1073 = arg0.method2346();
        }
    }
}
