package deob;

import java.util.zip.Inflater;

@ObfuscatedName("mg")
public class class345 {

    @ObfuscatedName("mg.n")
    public Inflater field4048;

    public class345() {
        this(-1, 1000000, 1000000);
    }

    public class345(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mg.n(Lkx;[BI)V")
    public void method6218(class311 arg0, byte[] arg1) {
        if (arg0.field3746[arg0.field3747] != 31 || arg0.field3746[arg0.field3747 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4048 == null) {
            this.field4048 = new Inflater(true);
        }
        try {
            this.field4048.setInput(arg0.field3746, arg0.field3747 + 10, arg0.field3746.length - (arg0.field3747 + 10 + 8));
            this.field4048.inflate(arg1);
        } catch (Exception var4) {
            this.field4048.reset();
            throw new RuntimeException("");
        }
        this.field4048.reset();
    }
}
