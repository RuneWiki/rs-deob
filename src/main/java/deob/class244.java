package deob;

@ObfuscatedName("iw")
public class class244 extends class195 {

    @ObfuscatedName("iw.h")
    public static class190 field3304 = new class190(64);

    @ObfuscatedName("iw.u")
    public boolean field3305 = false;

    @ObfuscatedName("iw.i(Lfv;I)V")
    public void method4033(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4034(arg0, var2);
        }
    }

    @ObfuscatedName("iw.h(Lfv;IS)V")
    public void method4034(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3305 = true;
        }
    }
}
