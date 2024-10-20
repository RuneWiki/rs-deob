package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ef")
public class class147 {

    @ObfuscatedName("ef.b")
    public Inflater field2013;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ef.b(Leg;[BB)V")
    public void method2604(class154 arg0, byte[] arg1) {
        if (arg0.field2083[arg0.field2085] != 31 || arg0.field2083[arg0.field2085 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2013 == null) {
            this.field2013 = new Inflater(true);
        }
        try {
            this.field2013.setInput(arg0.field2083, arg0.field2085 + 10, arg0.field2083.length - (arg0.field2085 + 10 + 8));
            this.field2013.inflate(arg1);
        } catch (Exception var4) {
            this.field2013.reset();
            throw new RuntimeException("");
        }
        this.field2013.reset();
    }
}
