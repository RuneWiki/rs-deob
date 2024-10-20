package deob;

@ObfuscatedName("hq")
public class class185 extends class511 {

    @ObfuscatedName("hq.aw")
    public static class316 field1934 = new class316(64);

    @ObfuscatedName("hq.ak")
    public boolean field1935 = false;

    @ObfuscatedName("bm.ap(Lpe;I)V")
    public static void method815(class392 arg0) {
        Statics.field1933 = arg0;
    }

    @ObfuscatedName("hq.aw(Lvl;B)V")
    public void method3647(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3641(arg0, var2);
        }
    }

    @ObfuscatedName("hq.ak(Lvl;II)V")
    public void method3641(class558 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1935 = true;
        }
    }
}
