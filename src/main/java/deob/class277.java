package deob;

@ObfuscatedName("kq")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jr.ap(Lvl;Lkt;III)V")
    public static void method5147(class558 arg0, class275 arg1, int arg2, int arg3) {
        arg1.method5370(arg2, arg3);
        arg1.method5354(0);
        arg1.method5353(0);
        byte var4 = arg0.method9259();
        if (var4 == 0) {
            return;
        }
        int var5 = method8572(arg0, var4, 0);
        int var6 = method8572(arg0, var4, 2);
        int var7 = method8572(arg0, var4, 4);
        int var8 = method8572(arg0, var4, 6);
        arg1.method5362(var5, var6, var7, var8);
    }

    @ObfuscatedName("tk.aw(Lvl;BIB)I")
    public static int method8572(class558 arg0, byte arg1, int arg2) {
        int var3 = arg1 >> arg2 & 0x3;
        if (var3 == 3) {
            return arg0.method9264();
        } else if (var3 == 2) {
            return arg0.method9261();
        } else if (var3 == 1) {
            return arg0.method9259();
        } else {
            return 0;
        }
    }
}
