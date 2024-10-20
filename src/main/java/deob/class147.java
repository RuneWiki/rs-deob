package deob;

import java.util.zip.Inflater;

@ObfuscatedName("en")
public class class147 {

    @ObfuscatedName("en.o")
    public Inflater field2036;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("en.o(Lez;[BB)V")
    public void method2494(class154 arg0, byte[] arg1) {
        if (arg0.field2108[arg0.field2105] != 31 || arg0.field2108[arg0.field2105 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2036 == null) {
            this.field2036 = new Inflater(true);
        }
        try {
            this.field2036.setInput(arg0.field2108, arg0.field2105 + 10, arg0.field2108.length - (arg0.field2105 + 10 + 8));
            this.field2036.inflate(arg1);
        } catch (Exception var4) {
            this.field2036.reset();
            throw new RuntimeException("");
        }
        this.field2036.reset();
    }
}
