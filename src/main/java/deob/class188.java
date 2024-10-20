package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gu")
public class class188 {

    @ObfuscatedName("gu.d")
    public Inflater field2507;

    public class188() {
        this(-1, 1000000, 1000000);
    }

    public class188(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gu.d(Lgy;[BB)V")
    public void method3191(class195 arg0, byte[] arg1) {
        if (arg0.field2569[arg0.field2568] != 31 || arg0.field2569[arg0.field2568 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2507 == null) {
            this.field2507 = new Inflater(true);
        }
        try {
            this.field2507.setInput(arg0.field2569, arg0.field2568 + 10, arg0.field2569.length - (arg0.field2568 + 10 + 8));
            this.field2507.inflate(arg1);
        } catch (Exception var4) {
            this.field2507.reset();
            throw new RuntimeException("");
        }
        this.field2507.reset();
    }
}
