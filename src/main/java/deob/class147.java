package deob;

import java.util.zip.Inflater;

@ObfuscatedName("eb")
public class class147 {

    @ObfuscatedName("eb.x")
    public Inflater field2019;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eb.x(Leq;[BB)V")
    public void method2627(class154 arg0, byte[] arg1) {
        if (arg0.field2086[arg0.field2087] != 31 || arg0.field2086[arg0.field2087 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2019 == null) {
            this.field2019 = new Inflater(true);
        }
        try {
            this.field2019.setInput(arg0.field2086, arg0.field2087 + 10, arg0.field2086.length - (arg0.field2087 + 10 + 8));
            this.field2019.inflate(arg1);
        } catch (Exception var4) {
            this.field2019.reset();
            throw new RuntimeException("");
        }
        this.field2019.reset();
    }
}
