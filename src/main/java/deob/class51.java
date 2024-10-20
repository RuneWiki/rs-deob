package deob;

@ObfuscatedName("av")
public class class51 extends class205 {

    @ObfuscatedName("av.j")
    public static class194 field1104 = new class194(64);

    @ObfuscatedName("av.p")
    public int field1102 = 0;

    @ObfuscatedName("i.s(Lfa;I)V")
    public static void method154(class168 arg0) {
        Statics.field1103 = arg0;
    }

    @ObfuscatedName("av.j(Lds;I)V")
    public void method964(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method966(arg0, var2);
        }
    }

    @ObfuscatedName("av.p(Lds;II)V")
    public void method966(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1102 = arg0.method2430();
        }
    }
}
