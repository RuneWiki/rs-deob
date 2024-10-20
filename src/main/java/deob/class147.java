package deob;

import java.util.zip.Inflater;

@ObfuscatedName("es")
public class class147 {

    @ObfuscatedName("es.f")
    public Inflater field2040;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("es.f(Leo;[BB)V")
    public void method2602(class154 arg0, byte[] arg1) {
        if (arg0.field2114[arg0.field2111] != 31 || arg0.field2114[arg0.field2111 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2040 == null) {
            this.field2040 = new Inflater(true);
        }
        try {
            this.field2040.setInput(arg0.field2114, arg0.field2111 + 10, arg0.field2114.length - (arg0.field2111 + 10 + 8));
            this.field2040.inflate(arg1);
        } catch (Exception var4) {
            this.field2040.reset();
            throw new RuntimeException("");
        }
        this.field2040.reset();
    }
}
