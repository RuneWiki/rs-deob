package deob;

@ObfuscatedName("fy")
public class class181 {

    public class181() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.z(Lcg;I)V")
    public static void method2856(class99 arg0) {
        Statics.field2843 = arg0;
    }

    @ObfuscatedName("ak.n(Lcj;Ljava/lang/String;B)I")
    public static int method593(class104 arg0, String arg1) {
        int var2 = arg0.field1815;
        byte[] var3 = class191.method2706(arg1);
        arg0.method2125(var3.length);
        arg0.field1815 += Statics.field2843.method2067(var3, 0, var3.length, arg0.field1819, arg0.field1815);
        return arg0.field1815 - var2;
    }
}
